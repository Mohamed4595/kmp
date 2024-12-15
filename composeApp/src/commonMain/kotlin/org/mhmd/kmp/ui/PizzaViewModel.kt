package org.mhmd.kmp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.mhmd.kmp.dependencies.PizzaRepository

class PizzaViewModel(
    private val repository: PizzaRepository
) : ViewModel() {

    private val _state = MutableStateFlow(OrderScreenUiState())
    val state = _state.asStateFlow()

    init {
        getPizzaList()
    }

    private fun getPizzaList() {
        viewModelScope.launch {
            _state.update { it.copy(pizzaList = DataSource.pizzaList) }
        }
    }

    fun onFavoriteClicked() {
        _state.update { it.copy(isFavorite = !state.value.isFavorite) }
    }

    fun onPizzaSizeClicked(size: PizzaSize) {
        _state.update { it.copy(selectedSize = size) }
    }

    fun onIngredientClicked(ingredient: OrderScreenUiState.Ingredient) {
        _state.update { state ->
            state.copy(
                ingredients = state.ingredients.map { item ->
                    if (item.id == ingredient.id) item.copy(selected = !item.selected) else item
                },
             )
        }
    }

    fun setSelectedPizza(page: Int) {
        _state.update { it.copy(selectedPizza = state.value.pizzaList[page]) }
    }
}