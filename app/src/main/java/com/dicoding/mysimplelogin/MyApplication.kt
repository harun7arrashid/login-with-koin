package com.dicoding.mysimplelogin

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

// untuk mengimplementasikan Koin di semua class yg extend ke Application/ untuk Inject pada MyApplication
open class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        // agar bisa menggunakan Koin di semua class
        // untuk membuat Koin melakukan injection di semua turunan application, seperti Activity dan Fragment. Jika tidak ada kode ini akan muncul eror No Koin Context configured.
        startKoin {
            androidContext(this@MyApplication) // untuk ngasih context ke semua Injection
            modules(storageModule) // inisialisasi Koin
        }
    }
}