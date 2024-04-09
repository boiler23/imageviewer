package example.imageviewer

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.getSystemService

class AndroidClipboardController(context: Context) : ClipboardController {
    private val clipboard = context.getSystemService<ClipboardManager>()
    override fun copy(text: String) {
        val clip = ClipData.newPlainText("label", text)
        clipboard?.setPrimaryClip(clip)
    }
    override fun paste(): String? {
        return clipboard?.primaryClip?.getItemAt(0)?.text?.toString()
    }
}

@Composable
actual fun rememberClipboardController(): ClipboardController {
    val context = LocalContext.current
    return remember { AndroidClipboardController(context) }
}
