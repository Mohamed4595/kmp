package org.mhmd.kmp.ui.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import kmp.composeapp.generated.resources.Res
import kmp.composeapp.generated.resources.back
import org.jetbrains.compose.resources.stringResource

@Composable
fun TopBar(
    title: String,
    navigationIcon: ImageVector,
    actions: @Composable RowScope.() -> Unit,
    onNavigationIconClick: () -> Unit = {},
) {
    Row(
        Modifier.fillMaxWidth().padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        TopBarNavigationIcon(navigationIcon, onNavigationIconClick)
        TopBarTitle(title)
        Row {
            actions()
        }
    }
}

@Composable
private fun TopBarTitle(title: String) {
    Text(
        text = title,
        color = Color.Black,
    )
}

@Composable
private fun TopBarNavigationIcon(
    icon: ImageVector,
    onNavigationIconClick: () -> Unit
) {
    IconButton(onClick = onNavigationIconClick) {
        Icon(
            imageVector = icon,
            contentDescription = stringResource(Res.string.back),
        )
    }
}