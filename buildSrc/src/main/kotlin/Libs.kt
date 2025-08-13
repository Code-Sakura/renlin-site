object Libs {
    object Version {
        const val KOTLINX_COROUTINES = "1.8.1"
        const val KOTLINX_SERIALIZATION_JSON = "1.8.1"
    }

    object Libraries {
        val kotlinxCoroutines =
            libraries("org.jetbrains.kotlinx:kotlinx-coroutines-core", Version.KOTLINX_COROUTINES)
        val kotlinxSerializationJson =
            libraries("org.jetbrains.kotlinx:kotlinx-serialization-json", Version.KOTLINX_SERIALIZATION_JSON)
    }
}

private fun libraries(module: String, version: String): String {
    return "$module:$version"
}