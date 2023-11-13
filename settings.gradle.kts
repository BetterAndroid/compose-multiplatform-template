enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
plugins {
    id("com.highcapable.sweetdependency") version "__SWEET_DEPENDENCY_VERSION__"
    id("com.highcapable.sweetproperty") version "__SWEET_PROPERTY_VERSION__"
}
sweetDependency {
    isUseDependencyResolutionManagement = false
}
sweetProperty {
    rootProject { all { isEnable = false } }
}
rootProject.name = "__PROJECT_NAME__"
include(":androidApp", ":desktopApp", ":shared")