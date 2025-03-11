package com.shabelnikd.cleanarchpractice

import android.app.Application
import com.shabelnikd.cleanarchpractice.di.appModule
import org.koin.core.context.startKoin

class AppCl : Application() {
    override fun onCreate() {
        super.onCreate()
            startKoin {
                modules(appModule)
            }

    }
}