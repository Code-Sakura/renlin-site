# CLAUDE.md

日本語を使う
This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Development Commands

### Build Commands

- `./gradlew build` - Build the entire project and create production bundle
- `./gradlew assemble` - Assemble outputs without running tests
- `./gradlew clean` - Clean build directory
- `./gradlew jsBrowserProductionWebpack` - Build production webpack bundle
- `./gradlew jsBrowserDevelopmentWebpack` - Build development webpack bundle

### Development Server

- `./gradlew jsBrowserDevelopmentRun` - Start development webpack dev server with hot reload
- `./gradlew jsBrowserProductionRun` - Start production webpack dev server

### Testing

- `./gradlew check` - Run all checks including tests
- `./gradlew jsBrowserTest` - Run JS tests in browser using karma and webpack
- `./gradlew allTests` - Run tests for all targets with aggregated report

## Project Architecture

This is a Kotlin Multiplatform project targeting JavaScript/Browser, built with the Renlin framework for reactive web
development.

### Core Framework Stack

- **Renlin Framework**: Custom reactive web framework (v1.3.2) for component-based UI
- **Hakate**: State management library (v3.3.1) providing reactive state containers
- **Renlin Router**: Client-side routing (v1.3.0) with browser history support
- **Kotlinx Coroutines**: Async programming support

### Project Structure

- `src/commonMain/kotlin/` - Shared Kotlin code for all platforms
    - `net/kigawa/renlin/site/` - Main application package
        - `Root.kt` - Application root component with routing setup
        - `Layout.kt` - Main layout component with navigation and menu
        - `Routes.kt` - Route definitions and page mapping
        - `Page.kt` - Base page interface
        - `page/` - Individual page implementations
- `src/jsMain/kotlin/` - JavaScript-specific code and main entry point
- `src/jsMain/resources/` - Static web resources (HTML, etc.)
- `buildSrc/` - Gradle build logic and version management
- `webpack.config.d/` - Webpack configuration customizations

### Architecture Patterns

**Component-Based Architecture**: Uses Renlin's component system where UI is built from reusable components with
reactive state binding.

**State Management**: Hakate provides reactive state containers with automatic UI updates when state changes. The Root
class manages global application state including routing.

**Routing System**: Client-side routing with history API fallback. Routes are defined in `Routes.kt` as a mapping
between URL patterns and page constructor functions.

**CSS-in-Kotlin**: Styling is done programmatically in Kotlin using Renlin's CSS DSL rather than separate stylesheets.

**Reactive Data Flow**: State changes trigger UI updates automatically. Components use `useValue()` to subscribe to
state changes.

### Key Configuration Files

- `build.gradle.kts` - Main build configuration with Kotlin Multiplatform setup
- `buildSrc/src/main/kotlin/common.gradle.kts` - Shared build logic and dependencies
- `webpack.config.d/rewritePath.js` - Webpack config for SPA routing support
- `Dockerfile` - Multi-stage Docker build with Nginx for deployment