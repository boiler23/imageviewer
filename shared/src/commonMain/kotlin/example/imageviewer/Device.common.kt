package example.imageviewer

interface Device {
    val name: String
}

expect fun getDevice(): Device
