package example.imageviewer

import android.os.Build

class AndroidDevice : Device {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
}

actual fun getDevice(): Device = AndroidDevice()
