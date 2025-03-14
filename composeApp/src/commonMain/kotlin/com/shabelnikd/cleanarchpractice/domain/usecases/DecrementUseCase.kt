package com.shabelnikd.cleanarchpractice.domain.usecases

import com.shabelnikd.cleanarchpractice.domain.repository.CounterRepository

class DecrementUseCase(private val repository: CounterRepository) {
    operator fun invoke() = repository.decrement()
}
