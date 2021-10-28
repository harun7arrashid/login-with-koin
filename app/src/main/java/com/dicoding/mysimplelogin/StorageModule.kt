package com.dicoding.mysimplelogin

import org.koin.dsl.module

// untuk menyiapkan inisialisasi SessionManager
// module = tmpt menginisialisasi object yang dibutuhkan
val storageModule = module {
    factory {
        SessionManager(get()) // ini constructornya kn context nya, mungkin dh di isi contentnya sama si MyApplication, jd tinggal get aja
    }

        // inisialisai objectnya di modul tertentu aja
    single {
        UserRepository(get())
    }
}