package com.shabelnikd.cleanarchpractice.data.datasource

import com.shabelnikd.cleanarchpractice.data.models.CounterDto

class EmulatedService {
    private var count = 0
    private var isIncrement = false

    fun increment() {
        count++
        isIncrement = true
    }

    fun decrement() {
        count--
        isIncrement = false
    }

    fun getCounter(): CounterDto {
        return CounterDto(
            operationType = if (isIncrement) "INCREMENT" else "DECREMENT",
            count = count
        )
    }

}