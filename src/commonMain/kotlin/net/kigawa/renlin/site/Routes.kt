package net.kigawa.renlin.site

import net.kigawa.renlin.router.route.Route
import net.kigawa.renlin.router.route.RouteGroup
import net.kigawa.renlin.site.page.TopPage
import net.kigawa.renlin.site.page.doc.DocPage
import net.kigawa.renlin.site.page.start.StartPage

object Routes: RouteGroup() {
    val pages: Map<Route, () -> Page> get() = internalPages
    private val internalPages = mutableMapOf<Route, () -> Page>()

    val top = page("/", ::TopPage)
    val doc = page("/doc", ::DocPage)
    val start = page("/start", ::StartPage)
    fun page(path: String, block: () -> Page): Route {
        return route(path).also { internalPages[it] = block }
    }
}