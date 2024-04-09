package example.imageviewer

import androidx.compose.runtime.Composable

interface ClipboardController {
    fun copy(text: String)
    fun paste(): String?
}

@Composable
expect fun rememberClipboardController(): ClipboardController
