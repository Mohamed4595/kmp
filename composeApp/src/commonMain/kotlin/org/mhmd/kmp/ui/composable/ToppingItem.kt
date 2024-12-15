package org.mhmd.kmp.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource


@Composable
fun ToppingItem(
    imageRes: DrawableResource,
    modifier: Modifier = Modifier,
) {
    Image(
        painterResource(imageRes), contentDescription = null,
        modifier = modifier.size(30.dp)
    )
}