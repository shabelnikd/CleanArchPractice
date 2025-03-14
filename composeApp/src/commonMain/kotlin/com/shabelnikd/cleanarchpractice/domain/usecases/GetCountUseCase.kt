package com.shabelnikd.cleanarchpractice.domain.usecases

import com.shabelnikd.cleanarchpractice.domain.models.CounterEntity
import com.shabelnikd.cleanarchpractice.domain.repository.CounterRepository


class GetCountUseCase(private val repository: CounterRepository) {
    operator fun invoke(): CounterEntity = repository.getCounter()
}
