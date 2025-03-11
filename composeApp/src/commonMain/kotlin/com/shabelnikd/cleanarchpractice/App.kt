package com.shabelnikd.cleanarchpractice

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import cleanarchpractice.composeapp.generated.resources.Res
import cleanarchpractice.composeapp.generated.resources.compose_multiplatform
import com.shabelnikd.cleanarchpractice.di.appModule
import com.shabelnikd.cleanarchpractice.presentation.view.CounterScreen
import org.koin.core.context.startKoin

@Composable
@Preview
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        CounterScreen()
    }
}
