package net.kigawa.renlin.site

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import net.kigawa.hakate.api.HakateInitializer
import net.kigawa.renlin.component.component
import net.kigawa.renlin.router.route.provider.DomRouterProvider
import net.kigawa.renlin.tag.div

class Root(
    val name: String,
) {
    val hakate = HakateInitializer()
    val dispatcher = hakate.newStateDispatcher()
    val layout: Layout = Layout(dispatcher)
    val path = dispatcher.newState(DomRouterProvider.path.value)
    val context = Dispatchers.Default

    init {
        CoroutineScope(context).launch {
            DomRouterProvider.path.collect {
                path.set(it)
            }
        }
    }

    val page = path.child { p ->
        Routes.pages.entries.firstOrNull { it.key.isMach(p) }?.value?.invoke()
    }

    val root = div.component {
        layout.navigation("navigation")
        layout.main("main-display") {
            fragment {
                page.useValue()?.component?.invoke()
            }
        }
        layout.footer("footer")
    }

}