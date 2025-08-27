package net.kigawa.renlin.site.page.start

import net.kigawa.renlin.component.Component0
import net.kigawa.renlin.component.component
import net.kigawa.renlin.css.*
import net.kigawa.renlin.site.Page
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.tag.div
import net.kigawa.renlin.tag.p
// import net.kigawa.renlin.tag.h1
// import net.kigawa.renlin.tag.h2
// import net.kigawa.renlin.tag.pre
// import net.kigawa.renlin.tag.code
// import net.kigawa.renlin.tag.fragment
// import net.kigawa.renlin.tag.ol
// import net.kigawa.renlin.tag.li
import net.kigawa.renlin.w3c.category.native.FlowContent
import net.kigawa.renlin.w3c.category.t

class StartPage: Page {
    override val component:Component0<Tag<in FlowContent>, in FlowContent>
        get() = div.component {
            div("hero-section") {
                t("Getting Started")
                css {
                    fontSize = 48.px
                    height = 25.vh
                    minHeight = 200.px
                    width = 100.percent
                    textAlign = TextAlign.CENTER
                    margin = 0.px
                    padding = "40px 20px".cssValue
                    display = Display.FLEX
                    flexDirection = FlexDirection.COLUMN
                    alignItems = AlignItems.CENTER
                    justifyContent = JustifyContent.CENTER
                    fontWeight = FontWeight.BOLD
                    color = "#2c3e50".color
                }
            }

            div("content-section") {
                div("welcome-card") {
                    t("Learn how to build modern web applications with Renlin Framework")
                    css {
                        fontSize = 20.px
                        padding = "30px 20px".cssValue
                        textAlign = TextAlign.CENTER
                        borderRadius = 12.px
                        maxWidth = 700.px
                        width = 100.percent
                        margin = "0 auto 32px auto".cssValue
                        color = "#555".color
                        lineHeight = 1.6.cssValue
                    }
                }

                div("steps-container") {
                    div("step-card-1") {
                        p {
                            t("1. Create New Project")
                            css {
                                fontSize = 24.px
                                marginBottom = 16.px
                                fontWeight = FontWeight.BOLD
                                color = "#333".color
                            }
                        }
                        p {
                            t("Create a new Kotlin Multiplatform project directory:")
                        }
                        div {
                            p {
                                t("mkdir my-renlin-app\ncd my-renlin-app")
                                css {
                                    margin = 0.px
                                    fontFamily = "'Courier New', Consolas, 'Liberation Mono', Menlo, Courier, monospace".cssValue
                                    whiteSpace = WhiteSpace.PRE
                                    color = "#d63384".color
                                }
                            }
                            css {
                                backgroundColor = "#f8f9fa".color
                                padding = 16.px
                                borderRadius = 8.px
                                margin = "16px 0".cssValue
                                overflow = Overflow.AUTO
                                fontSize = 14.px
                                border = "1px solid #e9ecef".cssValue
                            }
                        }
                        css {
                            padding = 24.px
                            margin = "0 0 24px 0".cssValue
                            borderRadius = 12.px
                            textAlign = TextAlign.LEFT
                            width = 100.percent
                            maxWidth = 700.px
                            backgroundColor = "#ffffff".color
                            border = "1px solid #e1e8ed".cssValue
                            boxShadow = "0 2px 4px rgba(0,0,0,0.1)".cssValue
                        }
                    }

                    div("step-card-2") {
                        p {
                            t("2. Configure build.gradle.kts")
                            css {
                                fontSize = 24.px
                                marginBottom = 16.px
                                fontWeight = FontWeight.BOLD
                                color = "#333".color
                            }
                        }
                        p {
                            t("Add Renlin dependencies to your build.gradle.kts:")
                        }
                        div {
                            p {
                                t("""plugins {
    kotlin("multiplatform") version "1.9.20"
}

repositories {
    mavenCentral()
}

kotlin {
    js {
        browser {
            webpackTask {
                outputFileName = "main.js"
            }
        }
        binaries.executable()
    }
    
    sourceSets {
        commonMain {
            dependencies {
                implementation("net.kigawa:renlin:1.3.2")
                implementation("net.kigawa:hakate:3.3.1")
                implementation("net.kigawa:renlin-router:1.3.0")
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.9.0")
            }
        }
        
        jsMain {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-stdlib-js")
            }
        }
    }
}""")
                                css {
                                    margin = 0.px
                                    fontFamily = "'Courier New', Consolas, 'Liberation Mono', Menlo, Courier, monospace".cssValue
                                    whiteSpace = WhiteSpace.PRE
                                    color = "#d63384".color
                                }
                            }
                            css {
                                backgroundColor = "#f8f9fa".color
                                padding = 16.px
                                borderRadius = 8.px
                                margin = "16px 0".cssValue
                                overflow = Overflow.AUTO
                                fontSize = 12.px
                                border = "1px solid #e9ecef".cssValue
                            }
                        }
                        css {
                            padding = 24.px
                            margin = "0 0 24px 0".cssValue
                            borderRadius = 12.px
                            textAlign = TextAlign.LEFT
                            width = 100.percent
                            maxWidth = 700.px
                            backgroundColor = "#ffffff".color
                            border = "1px solid #e1e8ed".cssValue
                            boxShadow = "0 2px 4px rgba(0,0,0,0.1)".cssValue
                        }
                    }

                    div("step-card-3") {
                        p {
                            t("3. Create HTML File")
                            css {
                                fontSize = 24.px
                                marginBottom = 16.px
                                fontWeight = FontWeight.BOLD
                                color = "#333".color
                            }
                        }
                        p {
                            t("Create src/jsMain/resources/index.html:")
                        }
                        div {
                            p {
                                t("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My Renlin App</title>
</head>
<body>
    <div id="root"></div>
    <script src="main.js"></script>
</body>
</html>""")
                                css {
                                    margin = 0.px
                                    fontFamily = "'Courier New', Consolas, 'Liberation Mono', Menlo, Courier, monospace".cssValue
                                    whiteSpace = WhiteSpace.PRE
                                    color = "#d63384".color
                                }
                            }
                            css {
                                backgroundColor = "#f8f9fa".color
                                padding = 16.px
                                borderRadius = 8.px
                                margin = "16px 0".cssValue
                                overflow = Overflow.AUTO
                                fontSize = 12.px
                                border = "1px solid #e9ecef".cssValue
                            }
                        }
                        css {
                            padding = 24.px
                            margin = "0 0 24px 0".cssValue
                            borderRadius = 12.px
                            textAlign = TextAlign.LEFT
                            width = 100.percent
                            maxWidth = 700.px
                            backgroundColor = "#ffffff".color
                            border = "1px solid #e1e8ed".cssValue
                            boxShadow = "0 2px 4px rgba(0,0,0,0.1)".cssValue
                        }
                    }

                    div("step-card-4") {
                        p {
                            t("4. Write Kotlin Code")
                            css {
                                fontSize = 24.px
                                marginBottom = 16.px
                                fontWeight = FontWeight.BOLD
                                color = "#333".color
                            }
                        }
                        p {
                            t("Create src/jsMain/kotlin/Main.kt:")
                        }
                        div {
                            p {
                                t("""import net.kigawa.renlin.component.component
import net.kigawa.renlin.tag.div
import net.kigawa.renlin.tag.h1
import net.kigawa.renlin.w3c.category.t
import kotlinx.browser.document

fun main() {
    val app = div.component {
        h1 {
            t("Hello, Renlin!")
        }
    }
    
    document.getElementById("root")?.let {
        app.mount(it)
    }
}""")
                                css {
                                    margin = 0.px
                                    fontFamily = "'Courier New', Consolas, 'Liberation Mono', Menlo, Courier, monospace".cssValue
                                    whiteSpace = WhiteSpace.PRE
                                    color = "#d63384".color
                                }
                            }
                            css {
                                backgroundColor = "#f8f9fa".color
                                padding = 16.px
                                borderRadius = 8.px
                                margin = "16px 0".cssValue
                                overflow = Overflow.AUTO
                                fontSize = 12.px
                                border = "1px solid #e9ecef".cssValue
                            }
                        }
                        css {
                            padding = 24.px
                            margin = "0 0 24px 0".cssValue
                            borderRadius = 12.px
                            textAlign = TextAlign.LEFT
                            width = 100.percent
                            maxWidth = 700.px
                            backgroundColor = "#ffffff".color
                            border = "1px solid #e1e8ed".cssValue
                            boxShadow = "0 2px 4px rgba(0,0,0,0.1)".cssValue
                        }
                    }

                    div("step-card-5") {
                        p {
                            t("5. Run Development Server")
                            css {
                                fontSize = 24.px
                                marginBottom = 16.px
                                fontWeight = FontWeight.BOLD
                                color = "#333".color
                            }
                        }
                        p {
                            t("Start the development server:")
                        }
                        div {
                            p {
                                t("./gradlew jsBrowserDevelopmentRun")
                                css {
                                    margin = 0.px
                                    fontFamily = "'Courier New', Consolas, 'Liberation Mono', Menlo, Courier, monospace".cssValue
                                    whiteSpace = WhiteSpace.PRE
                                    color = "#d63384".color
                                }
                            }
                            css {
                                backgroundColor = "#f8f9fa".color
                                padding = 16.px
                                borderRadius = 8.px
                                margin = "16px 0".cssValue
                                overflow = Overflow.AUTO
                                fontSize = 14.px
                                border = "1px solid #e9ecef".cssValue
                            }
                        }
                        p {
                            t("Open your browser to http://localhost:8080 to see \"Hello, Renlin!\"")
                        }
                        css {
                            padding = 24.px
                            margin = "0 0 24px 0".cssValue
                            borderRadius = 12.px
                            textAlign = TextAlign.LEFT
                            width = 100.percent
                            maxWidth = 700.px
                            backgroundColor = "#ffffff".color
                            border = "1px solid #e1e8ed".cssValue
                            boxShadow = "0 2px 4px rgba(0,0,0,0.1)".cssValue
                        }
                    }

                    css {
                        display = Display.FLEX
                        flexDirection = FlexDirection.COLUMN
                        alignItems = AlignItems.CENTER
                        maxWidth = 800.px
                        width = 100.percent
                        padding = "20px".cssValue
                        margin = "0 auto".cssValue
                        gap = 24.px
                    }
                }

                div("next-steps") {
                    p {
                        t("Next Steps")
                        css {
                            fontSize = 30.px
                            textAlign = TextAlign.CENTER
                            marginBottom = 30.px
                            fontWeight = FontWeight.BOLD
                            color = "#333".color
                        }
                    }
                    
                    div("feature-grid") {
                        div("feature-card-1") {
                            t("📚 Learn Components")
                            p {
                                t("Understand component-based UI development with Renlin.")
                            }
                            css {
                                padding = 24.px
                                margin = 0.px
                                borderRadius = 12.px
                                textAlign = TextAlign.CENTER
                                width = 260.px
                                minHeight = 150.px
                                backgroundColor = "#f8f9fa".color
                                border = "1px solid #e1e8ed".cssValue
                                display = Display.FLEX
                                flexDirection = FlexDirection.COLUMN
                                justifyContent = JustifyContent.CENTER
                            }
                        }

                        div("feature-card-2") {
                            t("🏪 State Management")
                            p {
                                t("Learn how to manage application state with Hakate.")
                            }
                            css {
                                padding = 24.px
                                margin = 0.px
                                borderRadius = 12.px
                                textAlign = TextAlign.CENTER
                                width = 260.px
                                minHeight = 150.px
                                backgroundColor = "#f8f9fa".color
                                border = "1px solid #e1e8ed".cssValue
                                display = Display.FLEX
                                flexDirection = FlexDirection.COLUMN
                                justifyContent = JustifyContent.CENTER
                            }
                        }

                        div("feature-card-3") {
                            t("🗺️ Routing")
                            p {
                                t("Add client-side routing with Renlin Router.")
                            }
                            css {
                                padding = 24.px
                                margin = 0.px
                                borderRadius = 12.px
                                textAlign = TextAlign.CENTER
                                width = 260.px
                                minHeight = 150.px
                                backgroundColor = "#f8f9fa".color
                                border = "1px solid #e1e8ed".cssValue
                                display = Display.FLEX
                                flexDirection = FlexDirection.COLUMN
                                justifyContent = JustifyContent.CENTER
                            }
                        }

                        css {
                            display = Display.FLEX
                            flexWrap = FlexWrap.WRAP
                            maxWidth = 900.px
                            width = 100.percent
                            justifyContent = JustifyContent.CENTER
                            gap = 20.px
                            margin = "0 auto".cssValue
                        }
                    }
                    
                    css {
                        width = 100.percent
                        padding = "40px 20px".cssValue
                        maxWidth = 800.px
                        margin = "0 auto".cssValue
                    }
                }

                css {
                    width = 100.percent
                    display = Display.FLEX
                    flexDirection = FlexDirection.COLUMN
                    alignItems = AlignItems.CENTER
                    padding = "0 20px".cssValue
                    minHeight = 100.vh
                }
            }
        }
}