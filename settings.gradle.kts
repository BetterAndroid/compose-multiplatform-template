enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
plugins {
    id("com.highcapable.sweetdependency") version "1.0.3"
    id("com.highcapable.sweetproperty") version "1.0.4"
}
sweetProperty {
    rootProject { all { isEnable = false } }
}
rootProject.name = "__PROJECT_NAME__"
include(":androidApp", ":desktopApp", ":shared")