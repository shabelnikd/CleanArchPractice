package com.shabelnikd.cleanarchpractice.presentation.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.shabelnikd.cleanarchpractice.presentation.viewmodels.CounterViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun CounterScreen() {
    val viewModel: CounterViewModel = koinViewModel<CounterViewModel>()
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