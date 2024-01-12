plugins {
    autowire(libs.plugins.kotlin.multiplatform)
    autowire(libs.plugins.jetbrains.compose)
}

group = property.project.groupName

kotlin {
    jvm("desktop")
    jvmToolchain(17)
    sourceSets {
        val desktopMain by getting {
            dependencies {
                implementation(projects.shared)
            }
        }
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

compose.desktop {
    application {
        mainClass = "$group.MainKt"
    }
}