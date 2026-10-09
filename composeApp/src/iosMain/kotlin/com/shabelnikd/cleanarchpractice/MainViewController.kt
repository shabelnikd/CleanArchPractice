package com.shabelnikd.cleanarchpractice

import androidx.compose.ui.window.ComposeUIViewController
import com.shabelnikd.cleanarchpractice.di.appModule
import org.koin.core.context.startKoin

fun MainViewController() = ComposeUIViewController {
    startKoin {
        modules(appModule)
    }
    App()
}