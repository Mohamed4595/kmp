package org.mhmd.kmp.ui.composable

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.runtime.Composable
import kmp.composeapp.generated.resources.Res
import kmp.composeapp.generated.resources.favorite
import kmp.composeapp.generated.resources.order_screen_title
import org.jetbrains.compose.resources.stringResource

@Composable
fun OrderScreenTopBar(isFavorite: Boolean, onFavoriteClicked: () -> Unit) {
    TopBar(
        title = stringResource(Res.string.order_screen_title),
        navigationIcon = Icons.Filled.ArrowBack,
        actions = { OrderScreenTopBarActions(isFavorite, onFavoriteClicked) },
    )
}

@Composable
private fun OrderScreenTopBarActions(isFavorite: Boolean, onFavoriteClicked: () -> Unit) {
    IconButton(onClick = onFavoriteClicked) {
        Icon(
            imageVector = if (isFavorite) Icons.Filled.Favorite else Icons.Filled.FavoriteBorder,
            contentDescription = stringResource(Res.string.favorite),
        )
    }
}