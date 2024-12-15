package org.mhmd.kmp.ui.composable


import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun PizzaPrice(price: Double) {
    Text(
        text = "$$price",
    )
}
