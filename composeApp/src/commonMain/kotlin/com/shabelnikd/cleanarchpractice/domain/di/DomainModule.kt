package com.shabelnikd.cleanarchpractice.domain.di

import com.shabelnikd.cleanarchpractice.domain.usecases.DecrementUseCase
import com.shabelnikd.cleanarchpractice.domain.usecases.GetCountUseCase
import com.shabelnikd.cleanarchpractice.domain.usecases.IncrementUseCase
import org.koin.dsl.module

val domainModule = module {
    factory { IncrementUseCase(get()) }
    factory { DecrementUseCase(get()) }
    factory { GetCountUseCase(get()) }
}
