package com.dicoding.mysimplelogin

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

// untuk mengimplementasikan Koin di semua class yg extend ke Application
open class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        // agar bisa menggunakan Koin di semua class
        startKoin {
            androidContext(this@MyApplication) // untuk ngasih context ke semua Injection
            modules(storageModule)
        }
    }
}