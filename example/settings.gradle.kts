val catalogVersion: String? by settings
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
        exclusiveContent {
            forRepository {
                maven {
                    url = uri("https://a8c-libs.s3.amazonaws.com/android")
                }
            }
            filter {
                includeModule("com.automattic", "Automattic-Tracks-Android")
                includeModule("com.automattic", "about")
                includeModule("com.automattic", "dependency-catalog")
                includeModule("org.wordpress", "aztec")
                includeModule("org.wordpress", "libaddressinput.common")
                includeModule("org.wordpress", "utils")
                includeModule("org.wordpress", "wellsql")
                includeModule("org.wordpress.aztec", "glide-loader")
                includeModule("org.wordpress.wellsql", "wellsql-annotations")
                includeModule("org.wordpress.wellsql", "wellsql-processor")
            }
        }
        exclusiveContent {
            forRepository {
                maven {
                    url = uri("https://zendesk.jfrog.io/zendesk/repo")
                }
            }
            filter {
                includeGroup("com.zendesk")
                includeGroup("com.zendesk.belvedere2")
            }
        }
        mavenCentral()
        google()
        maven {
            url = uri("https://a8c-libs.s3.amazonaws.com/android/jcenter-mirror")
            content {
                includeVersion("com.android.volley", "volley", "1.1.1")
                includeVersion("com.google.android", "flexbox", "2.0.1")
                includeVersion("com.jraska", "falcon", "2.1.1")
                includeVersion("org.wordpress", "wellsql", "1.6.0")
                includeVersion("org.wordpress", "wellsql-core", "1.6.0")
            }
        }
        maven {
            url = uri("https://jitpack.io")
            content {
                includeModule("com.github.chrisbanes", "PhotoView")
                includeModule("com.github.PhilJay", "MPAndroidChart")
            }
        }
    }
    versionCatalogs {
        create("libs") {
            if (catalogVersion != null) {
                from("com.automattic:dependency-catalog:$catalogVersion")
            } else {
                from(files("../libs.versions.toml"))
            }
        }
    }
}

