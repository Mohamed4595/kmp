package org.mhmd.kmp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.annotation.KoinExperimentalAPI
import org.mhmd.kmp.ui.OrderScreen
import org.mhmd.kmp.ui.PizzaViewModel

@OptIn(KoinExperimentalAPI::class)
@Composable
@Preview
fun App() {
    MaterialTheme {
        KoinContext {
            NavHost(
                navController = rememberNavController(),
                startDestination = "home"
            ) {
                composable(route = "home") {
                    val viewModel = koinViewModel<PizzaViewModel>()
                    Box(
                        modifier = Modifier
                            .fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        OrderScreen(viewModel)
                    }
                }
            }
        }
    }
}