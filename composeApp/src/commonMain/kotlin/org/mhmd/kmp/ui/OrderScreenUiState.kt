package org.mhmd.kmp.ui

import org.jetbrains.compose.resources.DrawableResource
import org.mhmd.kmp.ui.DataSource.ingredientsList

data class OrderScreenUiState(
    val pizzaList: List<Pizza> = emptyList(),
    val ingredients: List<Ingredient> = ingredientsList,
    val selectedSize: PizzaSize = PizzaSize.MEDIUM,
    val totalPrice: Double = 10.0,
    val isFavorite: Boolean = false,
    val selectedPizza: Pizza = DataSource.pizzaList.first(),
) {
    data class Pizza(
        val id: Int,
        val name: String,
        val price: Double,
        val breadRes: DrawableResource,
    )

    data class Ingredient(
        val id: Int,
        val name: String,
        val price: Double,
        val imageRes: DrawableResource,
        val images: List<DrawableResource> = emptyList(),
        val selected: Boolean = false,
    )
}

enum class PizzaSize(val price: Double) {
    SMALL(10.0),
    MEDIUM(15.0),
    LARGE(20.0),
}