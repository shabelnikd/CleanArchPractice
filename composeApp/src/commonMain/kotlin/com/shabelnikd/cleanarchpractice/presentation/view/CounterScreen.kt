package com.shabelnikd.cleanarchpractice.presentation.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import com.shabelnikd.cleanarchpractice.presentation.viewmodels.CounterViewModel
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun CounterScreen() {
    val viewModel: CounterViewModel = viewModel()
    val counter by viewModel.counterState.collectAsState()

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Count: ${counter.count}")

        Row {
            Button(onClick = { viewModel.decrement() }) {
                Text(text = "-")
            }
            Button(onClick = { viewModel.increment() }) {
                Text(text = "+")
            }
        }
    }
}