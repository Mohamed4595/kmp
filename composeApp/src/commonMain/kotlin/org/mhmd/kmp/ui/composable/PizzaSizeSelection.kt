package org.mhmd.kmp.ui.composable

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.mhmd.kmp.ui.PizzaSize

@Composable
fun PizzaSizeSelection(
    selectedSize: PizzaSize,
    onClick: (PizzaSize) -> Unit,
    modifier: Modifier = Modifier,
    pizzaSizes: List<PizzaSize> = PizzaSize.entries,
) {
    val alignment by animateAlignmentAsState(
        targetAlignment = when (selectedSize) {
            PizzaSize.SMALL -> Alignment.CenterStart
            PizzaSize.MEDIUM -> Alignment.Center
            PizzaSize.LARGE -> Alignment.CenterEnd
        }
    )

    Box(modifier = Modifier.padding(vertical = 16.dp)) {
        Box(
            modifier = modifier
                .shadow(8.dp, CircleShape)
                .align(alignment)
                .size(50.dp)
                .background(Color.White, CircleShape)
        )
        Row(
            modifier = Modifier
                .align(Alignment.Center)
                .wrapContentWidth()
                .padding(horizontal = 18.dp),
            horizontalArrangement = Arrangement.spacedBy(50.dp),
        ) {
            pizzaSizes.forEach { size ->
                Text(
                    text = size.name.first().toString(),
                    color = Color.Black,
                    modifier = Modifier
                        .clickable(
                            indication = null,
                            interactionSource = remember { MutableInteractionSource() }) {
                            onClick(size)
                        }
                )
            }
        }
    }
}

@Composable
fun animateAlignmentAsState(
    targetAlignment: Alignment,
): State<Alignment> {
    val biased = targetAlignment as BiasAlignment
    val horizontal by animateFloatAsState(biased.horizontalBias, label = "")
    return remember {
        derivedStateOf {
            BiasAlignment(
                horizontalBias = horizontal,
                verticalBias = 0f
            )
        }
    }
}