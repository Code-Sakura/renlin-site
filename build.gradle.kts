
plugins {
    id("common")
    id("root")
}

allprojects {
    apply(plugin = "common")

    group = RenlinSite.GROUP
    version = RenlinSite.VERSION


    kotlin {
        js {
            browser {
            }
            binaries.executable()
        }
        sourceSets["commonMain"].dependencies {
        }
        sourceSets["commonTest"].dependencies {
        }
        sourceSets["jsMain"].dependencies {
        }
        sourceSets["jsTest"].dependencies {
        }
        compilerOptions {
            freeCompilerArgs.add("-Xwhen-guards")
            freeCompilerArgs.add("-Xnon-local-break-continue")
            freeCompilerArgs.add("-Xmulti-dollar-interpolation")
        }
    }
}

group = RenlinSite.GROUP
version = RenlinSite.VERSION

repositories {
    mavenCentral()
}

dependencies {
}
