package org.mhmd.kmp.ui.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kmp.composeapp.generated.resources.Res
import kmp.composeapp.generated.resources.customize_your_pizza
import org.jetbrains.compose.resources.stringResource
import org.mhmd.kmp.ui.OrderScreenUiState
import org.mhmd.kmp.ui.composable.IngredientRoundedButton

@Composable
fun PizzaIngredients(
    ingredients: List<OrderScreenUiState.Ingredient>,
    onIngredientClicked: (OrderScreenUiState.Ingredient) -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            stringResource(Res.string.customize_your_pizza),
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        LazyRow(
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(16.dp)
        ) {
            items(ingredients.size) { index ->
                IngredientRoundedButton(
                    imageRes = ingredients[index].imageRes,
                    onClick = { onIngredientClicked(ingredients[index]) },
                    selected = ingredients[index].selected
                )
            }
        }
    }
}