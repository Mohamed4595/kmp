package org.mhmd.kmp.ui.composable

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kmp.composeapp.generated.resources.Res
import kmp.composeapp.generated.resources.plate
import org.jetbrains.compose.resources.painterResource
import org.mhmd.kmp.ui.OrderScreenUiState
import org.mhmd.kmp.ui.PizzaSize

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Pizza(
    ingredients: List<OrderScreenUiState.Ingredient>,
    pizzaList: List<OrderScreenUiState.Pizza>,
    pizzaSize: PizzaSize,
    modifier: Modifier = Modifier,
) {
    Box(modifier = modifier.padding(vertical = 24.dp),
        contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(Res.drawable.plate),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.Center)
                .size(300.dp)
        )
        PizzaPager(
            ingredients = ingredients,
            pizzaList = pizzaList,
            pizzaSize = pizzaSize,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}