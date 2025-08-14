package net.kigawa.renlin.site

import kotlinx.browser.document
import kotlinx.browser.window
import net.kigawa.hakate.api.HakateInitializer
import net.kigawa.renlin.Entrypoint

fun main() {
    val root = document.getElementById("root") ?: throw Exception("Root not found")
    val sample = Root("sample")
    val dispatcher = HakateInitializer().newStateDispatcher()
    Entrypoint(root).render(sample.root, dispatcher)
}