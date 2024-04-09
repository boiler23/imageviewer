package example.imageviewer

import platform.UIKit.UIDevice

class IOSDevice : Device {
    override val name: String = "iOS ${UIDevice.currentDevice().systemVersion}"
}

actual fun getDevice(): Device = IOSDevice()
