package com.softeen.kmmnews

actual fun getPlatform(): Platform = object : Platform {
    override val name: String = "Web with Kotlin/JS"
    override val version: String = "unknown"
}