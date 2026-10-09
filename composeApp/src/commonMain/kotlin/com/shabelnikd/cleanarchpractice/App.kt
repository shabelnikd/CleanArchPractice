package com.shabelnikd.cleanarchpractice

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.shabelnikd.cleanarchpractice.presentation.view.CounterScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        CounterScreen()
    }
}
