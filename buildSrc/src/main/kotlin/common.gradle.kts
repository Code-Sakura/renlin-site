plugins {
    kotlin("multiplatform")
}

repositories {
    mavenCentral()
}
kotlin{
    sourceSets["commonMain"].dependencies {
        implementation("net.kigawa:hakate:3.3.1")
        implementation("net.kigawa:renlin:1.2.1")
        implementation("net.kigawa:renlin-router:1.2.0")
    }
}