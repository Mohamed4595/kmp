package org.mhmd.kmp.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kmp.composeapp.generated.resources.Res
import kmp.composeapp.generated.resources.add_to_cart
import org.jetbrains.compose.resources.stringResource
import org.mhmd.kmp.ui.composable.OrderScreenTopBar
import org.mhmd.kmp.ui.composable.Pizza
import org.mhmd.kmp.ui.composable.PizzaIngredients
import org.mhmd.kmp.ui.composable.PizzaPrice
import org.mhmd.kmp.ui.composable.PizzaSizeSelection
import org.mhmd.kmp.ui.composable.RoundedButton


@Composable
fun OrderScreen(viewModel: PizzaViewModel) {
    val state by viewModel.state.collectAsState()
//    viewModel.setSelectedPizza(pagerState.settledPage)

    Scaffold(
        topBar = { OrderScreenTopBar(state.isFavorite, viewModel::onFavoriteClicked) },
    ) { paddingValues ->
        OrderScreenContent(
            state,
            paddingValues,
            viewModel::onPizzaSizeClicked,
            viewModel::onIngredientClicked
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun OrderScreenContent(
    state: OrderScreenUiState,
    paddingValues: PaddingValues,
    onPizzaSizeClicked: (PizzaSize) -> Unit,
    onIngredientClicked: (OrderScreenUiState.Ingredient) -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Pizza(
            ingredients = state.ingredients,
            pizzaList = state.pizzaList,
            pizzaSize = state.selectedSize,
        )
        PizzaPrice(price = state.totalPrice)
        PizzaSizeSelection(selectedSize = state.selectedSize, onClick = onPizzaSizeClicked)
        Spacer(modifier = Modifier.weight(1f))
        PizzaIngredients(
            ingredients = state.ingredients,
            onIngredientClicked = onIngredientClicked,
        )
        Spacer(modifier = Modifier.weight(1f))
        RoundedButton(
            label = stringResource(Res.string.add_to_cart),
            icon = Icons.Filled.ShoppingCart,
            onClick = { })
        Spacer(modifier = Modifier.weight(1f))
    }
}