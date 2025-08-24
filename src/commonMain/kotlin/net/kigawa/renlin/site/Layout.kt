package net.kigawa.renlin.site

import net.kigawa.hakate.api.state.StateDispatcher
import net.kigawa.renlin.component.argComponent
import net.kigawa.renlin.component.component
import net.kigawa.renlin.css.*
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.a
import net.kigawa.renlin.tag.div
import net.kigawa.renlin.tag.fragment
import net.kigawa.renlin.w3c.attribute.href
import net.kigawa.renlin.w3c.attribute.value.Href
import net.kigawa.renlin.w3c.category.integration.FlowPhrasingIntegration
import net.kigawa.renlin.w3c.category.native.FlowContent
import net.kigawa.renlin.w3c.category.native.PhrasingContent
import net.kigawa.renlin.w3c.category.t
import net.kigawa.renlin.w3c.event.tag.onClick


class Layout(stateDispatcher: StateDispatcher) {
    private var isMenuOpenState = stateDispatcher.newState(false)

    val main = div.argComponent { child: StatedDsl<out FlowContent>.() -> Unit ->
        div("content-section") {
            child()
        }
    }

    val navigation = div.component {
        div("navigation") {
            div("menu") {
                a("Renlin") {
                    t("Renlin")
                    css {
                        fontSize = 24.px
                        fontWeight = FontWeight.BOLD
                        cursor = Cursor.POINTER
                        display = Display.BLOCK
                        textDecoration = TextDecoration.NONE
                        color = Color.BLACK
                        marginBottom = 10.px
                    }
                    href = Href(Routes.top.path.strPath())
                }
                a("Home") {
                    t("Home")
                    css {
                        padding = 10.px
                        cursor = Cursor.POINTER
                        display = Display.BLOCK
                        textDecoration = TextDecoration.NONE
                        color = Color.BLACK
                        marginBottom = 5.px
                    }
                    href = Href(Routes.top.path.strPath())
                }
                a("Get Started") {
                    t("Get Started")
                    css {
                        padding = 10.px
                        cursor = Cursor.POINTER
                        display = Display.BLOCK
                        textDecoration = TextDecoration.NONE
                        color = Color.BLACK
                        marginBottom = 5.px
                    }
                    href = Href(Routes.start.path.strPath())
                }
                a("Documentation") {
                    t("Documentation")
                    css {
                        padding = 10.px
                        cursor = Cursor.POINTER
                        display = Display.BLOCK
                        textDecoration = TextDecoration.NONE
                        color = Color.BLACK
                        marginBottom = 5.px
                    }
                    href = Href(Routes.doc.path.strPath())
                }
                val isMenuOpen = isMenuOpenState.useValue()
                css {
                    position = Position.ABSOLUTE
                    top = 60.px
                    left = 0.px
                    width = 100.percent
                    backgroundColor = Color.WHITE
                    padding = 20.px
                    display = if (isMenuOpen) Display.FLEX else Display.NONE
                    flexDirection = FlexDirection.COLUMN
                    alignItems = AlignItems.FLEX_START
                }
            }

            div("menu-toggle") {
                val isMenuOpen = isMenuOpenState.useValue()
                t(if (isMenuOpen) "✕" else "☰")
                css {
                    fontSize = 24.px
                    cursor = Cursor.POINTER
                    padding = 5.px
                }
                onClick {
                    isMenuOpenState.set(isMenuOpen.not())
                }
            }

            css {
                position = Position.FIXED
                top = 0.px
                left = 0.px
                width = 100.percent
                height = 60.px
                display = Display.FLEX
                justifyContent = JustifyContent.SPACE_BETWEEN
                alignItems = AlignItems.CENTER
                padding = 20.px
                backgroundColor = Color.WHITE
            }
        }
    }

    val footer = div.component { }
}