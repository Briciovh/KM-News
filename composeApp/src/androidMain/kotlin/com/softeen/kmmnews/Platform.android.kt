package com.softeen.kmmnews

import android.os.Build

actual fun getPlatform(): Platform = object : Platform {
    override val name: String = "Android"
    override val version: String = Build.VERSION.SDK_INT.toString()
}