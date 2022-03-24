val catalogVersion: String by settings
pluginManagement {
    repositories {
        maven {
            url = uri("https://a8c-libs.s3.amazonaws.com/android")
            content {
                includeGroup("com.automattic.android")
                includeGroup("com.automattic.android.publish-to-s3")
            }
        }
        gradlePluginPortal()
        mavenCentral()
        google()
    }
}
dependencyResolutionManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
    }
    versionCatalogs {
        create("libs") {
            from("com.automattic:dependency-catalog:$catalogVersion")
        }
    }
}

