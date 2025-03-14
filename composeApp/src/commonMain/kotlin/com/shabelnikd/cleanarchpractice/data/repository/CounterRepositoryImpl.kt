package com.shabelnikd.cleanarchpractice.data.repository

import com.shabelnikd.cleanarchpractice.data.datasource.EmulatedService
import com.shabelnikd.cleanarchpractice.domain.models.CounterEntity
import com.shabelnikd.cleanarchpractice.domain.models.OperationType
import com.shabelnikd.cleanarchpractice.domain.repository.CounterRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class CounterRepositoryImpl (
    private val apiService: EmulatedService
) : CounterRepository, KoinComponent {


    override fun increment() {
        apiService.increment()
    }

    override fun decrement() {
        apiService.decrement()
    }

    override fun getCounter(): CounterEntity {
        val response = apiService.getCounter()
        return CounterEntity(
            count = response.count,
            operationType = OperationType.fromString(response.operationType)
        )
    }
}