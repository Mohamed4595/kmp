@file:OptIn(ExperimentalLayoutApi::class)

package org.mhmd.kmp.ui.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
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
        modifier = modifier.padding(top = 32.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            stringResource(Res.string.customize_your_pizza),
            modifier = Modifier.padding(horizontal = 16.dp),
            style = MaterialTheme.typography.subtitle1.copy(
                fontWeight = FontWeight.SemiBold
            )
        )
        FlowRow(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            ingredients.forEach { item ->
                IngredientRoundedButton(
                    imageRes = item.imageRes,
                    title = item.name,
                    onClick = { onIngredientClicked(item) },
                    selected = item.selected
                )
            }
        }
    }
}