package org.mhmd.kmp.ui.composable

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.PagerDefaults
import androidx.compose.foundation.pager.PagerSnapDistance
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import org.jetbrains.compose.resources.painterResource
import org.mhmd.kmp.ui.OrderScreenUiState
import org.mhmd.kmp.ui.PizzaSize
import kotlin.math.absoluteValue
import kotlin.math.roundToInt

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
            contentPadding = PaddingValues(start = 64.dp, end = 64.dp),
            flingBehavior = rememberSnapFlingBehavior(
                lazyListState,
                snapPosition = SnapPosition.Start
            ),
            state = lazyListState
        ) {
            itemsIndexed(
                items = pizzaList,
                key = { _, item ->
                    item.id
                }
            ) { page, item ->
                Row(
                    modifier = Modifier.animateItem(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Box(
                        modifier = Modifier.height(290.dp)
                            .scale(scale.value),
                        contentAlignment = Alignment.Center
                    ) {

                        Image(
                            painter = painterResource(pizzaList[page].breadRes),
                            contentDescription = null
                        )


                    }
                }
            }

        }


        Box(
            modifier = Modifier.padding(start = 48.dp).height(280.dp)
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