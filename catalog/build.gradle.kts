plugins {
    id("version-catalog")
    id("com.automattic.android.publish-to-s3")
}

catalog {
    versionCatalog {
        plugin("androidGradlePlugin", "com.android.library").version("7.1.1")
        plugin("kotlinAndroid", "org.jetbrains.kotlin.android").version("1.5.10")
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["versionCatalog"])
            group = "com.automattic"
            artifactId = "dependency-catalog"
        }
    }
}

