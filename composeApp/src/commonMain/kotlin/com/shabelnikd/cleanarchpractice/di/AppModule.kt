package com.shabelnikd.cleanarchpractice.di

import com.shabelnikd.cleanarchpractice.data.di.dataModule
import com.shabelnikd.cleanarchpractice.domain.di.domainModule
import com.shabelnikd.cleanarchpractice.presentation.di.presentationModule

val appModule = listOf(
    dataModule,
    domainModule,
    presentationModule
)