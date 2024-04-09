package example.imageviewer

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

class DesktopClipboardController : ClipboardController {
    override fun copy(text: String) = Unit
    override fun paste(): String? = null
}

@Composable
actual fun rememberClipboardController(): ClipboardController {
    return remember { DesktopClipboardController() }
}
