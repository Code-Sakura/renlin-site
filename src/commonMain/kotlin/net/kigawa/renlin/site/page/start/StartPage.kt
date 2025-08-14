package net.kigawa.renlin.site.page.start

import net.kigawa.renlin.component.Component0
import net.kigawa.renlin.component.component
import net.kigawa.renlin.site.Page
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.tag.div
import net.kigawa.renlin.tag.p
import net.kigawa.renlin.w3c.category.integration.FlowPalpableIntegration
import net.kigawa.renlin.w3c.category.t

class StartPage: Page {
    override val component: Component0<Tag<in FlowPalpableIntegration>, in FlowPalpableIntegration>
        get() = div.component {
            p {
                t("start")
            }
        }
}