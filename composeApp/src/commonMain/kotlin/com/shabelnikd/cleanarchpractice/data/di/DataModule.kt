package com.shabelnikd.cleanarchpractice.data.di

import com.shabelnikd.cleanarchpractice.data.datasource.EmulatedService
import com.shabelnikd.cleanarchpractice.data.repository.CounterRepositoryImpl
import com.shabelnikd.cleanarchpractice.domain.repository.CounterRepository
import org.koin.dsl.module

val dataModule = module {
    single { EmulatedService() }
    single<CounterRepository> { CounterRepositoryImpl(get()) }
}
