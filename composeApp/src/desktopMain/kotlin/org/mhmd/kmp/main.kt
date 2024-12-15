package org.mhmd.kmp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.mhmd.kmp.di.initKoin

fun main() = application {
    initKoin()
    Window(
        onCloseRequest = ::exitApplication,
        title = "kmp",
    ) {
        App()
    }
}