plugins {
    id("version-catalog")
    id("com.automattic.android.publish-to-s3")
}

catalog {
    versionCatalog {
        plugin("android-gradle-plugin", "com.android.library").version("7.1.1")
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

