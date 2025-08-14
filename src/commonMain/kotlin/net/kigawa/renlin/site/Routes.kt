package net.kigawa.renlin.site

import net.kigawa.renlin.router.route.Route
import net.kigawa.renlin.router.route.RouteGroup
import net.kigawa.renlin.site.page.TopPage
import net.kigawa.renlin.site.page.doc.DocPage
import net.kigawa.renlin.site.page.start.StartPage

object Routes: RouteGroup() {
    val pages = mapOf(
        page("/", ::TopPage),
        page("/doc", ::DocPage),
        page("/start", ::StartPage),
    )

    fun page(path: String, block: () -> Page): Pair<Route, () -> Page> {
        return route(path) to block
    }
}