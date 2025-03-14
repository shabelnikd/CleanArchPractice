package com.shabelnikd.cleanarchpractice

import android.app.Application
import com.shabelnikd.cleanarchpractice.data.di.dataModule
import com.shabelnikd.cleanarchpractice.di.appModule
import com.shabelnikd.cleanarchpractice.domain.di.domainModule
import com.shabelnikd.cleanarchpractice.presentation.di.presentationModule
import org.koin.core.context.startKoin

class AppCl : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule)
        }

    }
}