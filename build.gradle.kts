plugins {
    kotlin("multiplatform") version "1.5.10"
    kotlin("plugin.serialization") version "1.5.10"
}

group = "me.acoakley"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()

}

kotlin {
    val hostOs = System.getProperty("os.name")
    val isMingwX64 = hostOs.startsWith("Windows")
    val CoopSyncTarget = when {
        hostOs == "Mac OS X" -> macosX64("CoopSync")
        hostOs == "Linux" -> linuxX64("CoopSync")
        isMingwX64 -> mingwX64("CoopSync")
        else -> throw GradleException("Host OS is not supported in Kotlin/Native.")
    }

    CoopSyncTarget.apply {
        binaries {
            executable {
                entryPoint = "main"
            }
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.2.1")
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0")
                implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.2.1")
                implementation("org.jetbrains.kotlinx:kotlinx-cli:0.3.2")
            }
        }
        val CoopSyncMain by getting {
        }
        val CoopSyncTest by getting
    }
}
