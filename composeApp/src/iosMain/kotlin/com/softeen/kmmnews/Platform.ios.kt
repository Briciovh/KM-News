package com.softeen.kmmnews

import platform.UIKit.UIDevice


actual fun getPlatform(): Platform = object : Platform {
    override val name: String = UIDevice.currentDevice.systemName()
    override val version: String = UIDevice.currentDevice.systemVersion
}