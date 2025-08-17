plugins {
    kotlin("multiplatform")
}

repositories {
    mavenCentral()
}
kotlin{
    js {
        browser {
        }
    }
    sourceSets["commonMain"].dependencies {
        implementation("net.kigawa:hakate:3.3.1")
        implementation("net.kigawa:renlin:1.3.2")
        implementation("net.kigawa:renlin-router:1.3.0")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.9.0")
    }
    sourceSets["jsMain"].dependencies {
        // https://mvnrepository.com/artifact/org.jetbrains.kotlin/kotlin-stdlib-js
        implementation("org.jetbrains.kotlin:kotlin-stdlib-js:${Version.KOTLIN}")
    }
}