package com.softeen.kmmnews

actual fun getPlatform(): Platform = object : Platform {
    override val name: String = "JVM"
    override val version: String = System.getProperty("java.version") ?: "unknown"
}