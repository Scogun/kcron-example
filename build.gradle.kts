plugins {
    kotlin("multiplatform") version "2.0.0-Beta4"
}

kotlin {
    macosArm64 {
        binaries.executable()
    }
    js {
        browser()
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("com.ucasoft.kcron:kcron-common:0.10.5")
            }
        }
    }
}

repositories {
    mavenCentral()
}