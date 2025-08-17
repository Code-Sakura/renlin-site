package net.kigawa.renlin.site.page.doc

import net.kigawa.renlin.component.Component
import net.kigawa.renlin.component.Component0
import net.kigawa.renlin.component.component
import net.kigawa.renlin.site.Page
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.tag.div
import net.kigawa.renlin.tag.p
import net.kigawa.renlin.w3c.category.integration.FlowPalpableIntegration
import net.kigawa.renlin.w3c.category.native.FlowContent
import net.kigawa.renlin.w3c.category.t

class DocPage: Page {
    override val component: Component0<Tag<in FlowContent>, in FlowContent>
        get() = div.component {
            div {
                p {
                    t("doc")
                }
            }
        }
}