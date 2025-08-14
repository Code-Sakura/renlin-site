package net.kigawa.renlin.site

import net.kigawa.renlin.component.Component0
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.w3c.category.integration.FlowPalpableIntegration
import net.kigawa.renlin.w3c.category.native.FlowContent

interface Page {
    val component: Component0<Tag<in FlowPalpableIntegration>, in FlowPalpableIntegration>
}