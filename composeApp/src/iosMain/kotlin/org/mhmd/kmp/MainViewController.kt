package org.mhmd.kmp

import androidx.compose.ui.window.ComposeUIViewController
import org.mhmd.kmp.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    App()
}