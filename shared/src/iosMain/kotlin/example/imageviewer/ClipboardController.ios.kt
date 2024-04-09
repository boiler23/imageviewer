package example.imageviewer

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import platform.UIKit.UIPasteboard

class IosClipboardController : ClipboardController {
    override fun copy(text: String) {
        UIPasteboard.generalPasteboard.string = text
    }
    override fun paste(): String? {
        return UIPasteboard.generalPasteboard.string
    }
}

@Composable
actual fun rememberClipboardController(): ClipboardController {
    return remember { IosClipboardController() }
}
