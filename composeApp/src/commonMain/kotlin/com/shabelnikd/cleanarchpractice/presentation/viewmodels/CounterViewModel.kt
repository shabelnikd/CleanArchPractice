package com.shabelnikd.cleanarchpractice.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shabelnikd.cleanarchpractice.domain.models.CounterEntity
import com.shabelnikd.cleanarchpractice.domain.repository.CounterRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class CounterViewModel : ViewModel(), KoinComponent {

    private val counterRepository: CounterRepository by inject()

    private val _counterState = MutableStateFlow(CounterEntity(0, null))
    val counterState = _counterState.asStateFlow()

    init {
        getCounter()
    }

    fun increment() {
        viewModelScope.launch {
            counterRepository.increment()
            getCounter()
        }
    }

    fun decrement() {
        viewModelScope.launch {
            counterRepository.decrement()
            getCounter()
        }
    }

    private fun getCounter() {
        viewModelScope.launch {
            _counterState.value = counterRepository.getCounter()
        }
    }
}