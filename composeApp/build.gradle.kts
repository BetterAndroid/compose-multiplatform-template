plugins {
    autowire(libs.plugins.kotlin.multiplatform)
    autowire(libs.plugins.android.library)
    autowire(libs.plugins.jetbrains.compose)
}

kotlin {
    androidTarget()
    jvm("desktop")
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "ComposeApp"
            isStatic = true
        }
    }
    jvmToolchain(17)
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.foundation)
                api(com.highcapable.flexiui.core)
                api(com.highcapable.betterandroid.compose.extension)
                api(com.highcapable.betterandroid.compose.multiplatform)
            }
        }
        val androidMain by getting {
            dependencies {
                api(androidx.core.core.ktx)
                api(androidx.activity.activity)
                api(androidx.activity.activity.compose)
                api(com.highcapable.betterandroid.ui.component)
                api(com.highcapable.betterandroid.ui.extension)
                api(com.highcapable.betterandroid.system.extension)
            }
        }
        val desktopMain by getting {
            dependencies {
                api(compose.desktop.currentOs)
            }
        }
        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
        }
    }
}

android {
    namespace = property.project.groupName
    compileSdk = property.project.android.compileSdk

    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    sourceSets["main"].res.srcDirs("src/androidMain/res")
    sourceSets["main"].resources.srcDirs("src/commonMain/resources")

    defaultConfig {
        minSdk = property.project.android.minSdk
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}