package com.shabelnikd.cleanarchpractice.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shabelnikd.cleanarchpractice.domain.models.CounterEntity
import com.shabelnikd.cleanarchpractice.domain.usecases.DecrementUseCase
import com.shabelnikd.cleanarchpractice.domain.usecases.GetCountUseCase
import com.shabelnikd.cleanarchpractice.domain.usecases.IncrementUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent

class CounterViewModel(
    private val incrementUseCase: IncrementUseCase,
    private val decrementUseCase: DecrementUseCase,
    private val getCountUseCase: GetCountUseCase
) : ViewModel(), KoinComponent {


    private val _counterState = MutableStateFlow(CounterEntity(0, null))
    val counterState = _counterState.asStateFlow()

    init {
        getCountUseCase()
    }

    private fun updateCount() {
        viewModelScope.launch {
            _counterState.value = getCountUseCase()
        }
    }

    fun increment() {
        viewModelScope.launch {
            incrementUseCase()
            updateCount()
        }
    }

    fun decrement() {
        viewModelScope.launch {
            decrementUseCase()
            updateCount()
        }
    }

}