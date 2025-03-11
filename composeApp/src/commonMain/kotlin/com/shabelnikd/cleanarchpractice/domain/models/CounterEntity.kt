package com.shabelnikd.cleanarchpractice.domain.models

data class CounterEntity (
    val count: Int,
    val operationType: OperationType?
)