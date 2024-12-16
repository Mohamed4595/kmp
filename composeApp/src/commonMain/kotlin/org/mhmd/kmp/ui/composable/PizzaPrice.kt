package org.mhmd.kmp.ui.composable


import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight

@Composable
fun PizzaPrice(price: Double) {
    Text(
        text = "$$price",
        style = MaterialTheme.typography.subtitle1.copy(
            fontWeight = FontWeight.Bold
        )
    )
}
