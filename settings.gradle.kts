pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = ("anitomyandroid")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(
    "app",
    "library-android",
    "library-compose",
    "library-kotlin"
)
