package com.shabelnikd.cleanarchpractice.presentation.di

import com.shabelnikd.cleanarchpractice.presentation.viewmodels.CounterViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel { CounterViewModel(get(), get(), get()) }
}