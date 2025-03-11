package com.shabelnikd.cleanarchpractice.di

import com.shabelnikd.cleanarchpractice.data.datasource.EmulatedService
import com.shabelnikd.cleanarchpractice.data.repository.CounterRepositoryImpl
import com.shabelnikd.cleanarchpractice.domain.repository.CounterRepository
import org.koin.dsl.module


val appModule = module {
    single { CounterRepositoryImpl() as CounterRepository }
    single { EmulatedService() }

}