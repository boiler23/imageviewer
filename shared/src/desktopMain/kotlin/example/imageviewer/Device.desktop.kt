package example.imageviewer

class DesktopDevice : Device {
    override val name: String = "Desktop"
}

actual fun getDevice(): Device = DesktopDevice()
