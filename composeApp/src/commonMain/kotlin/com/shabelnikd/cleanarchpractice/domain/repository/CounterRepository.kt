package com.shabelnikd.cleanarchpractice.domain.repository

import com.shabelnikd.cleanarchpractice.domain.models.CounterEntity

interface CounterRepository {
    fun increment()

    fun decrement()

    fun getCounter(): CounterEntity
}