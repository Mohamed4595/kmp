package org.mhmd.kmp.ui.composable

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import org.mhmd.kmp.ui.OrderScreenUiState
import org.mhmd.kmp.ui.PizzaSize

@Composable
fun PizzaPager(
    ingredients: List<OrderScreenUiState.Ingredient>,
    pizzaList: List<OrderScreenUiState.Pizza>,
    pizzaSize: PizzaSize,
    modifier: Modifier = Modifier,
) {
    val scale = animateFloatAsState(
        targetValue = when (pizzaSize) {
            PizzaSize.SMALL -> 0.7f
            PizzaSize.MEDIUM -> 0.8f
            PizzaSize.LARGE -> 0.9f
        }, label = "pizzaScale"
    )
    val lazyListState = rememberLazyListState()
    Box(
        contentAlignment = Alignment.Center
    ) {

        LazyRow(
            modifier = modifier.fillMaxWidth(),
            contentPadding = PaddingValues(start = 112.dp, end = 112.dp),
            flingBehavior = rememberSnapFlingBehavior(
                lazyListState,
                snapPosition = SnapPosition.Start
            ),
            state = lazyListState
        ) {
            items(
                items = pizzaList,
                key = { item -> item.id }
            ) { item ->
                Column(
                    modifier = Modifier.animateItem(),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        item.name,
                        modifier = Modifier.padding(horizontal = 16.dp),
                        style = MaterialTheme.typography.subtitle1.copy(
                            fontWeight = FontWeight.SemiBold
                        )
                    )

                    Row(
                        modifier = modifier.padding(bottom = 24.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(item.breadRes),
                            modifier = modifier.size(200.dp)
                                .scale(scale.value),
                            contentDescription = null
                        )
                    }

                }
            }

        }


        Box(
            modifier = Modifier.padding(start = 68.dp).height(180.dp)
                .scale(scale.value),
            contentAlignment = Alignment.Center
        ) {
            ingredients
                .filter { it.selected }
                .forEach { ingredient ->
                    when (ingredient.id) {
                        1 -> PizzaToppings(images = ingredient.images)
                        2 -> PizzaToppings(images = ingredient.images)
                        3 -> PizzaToppings(images = ingredient.images)
                        4 -> PizzaToppings(images = ingredient.images)
                        5 -> PizzaToppings(images = ingredient.images)
                    }
                }
        }
    }
}