plugins {
    id("version-catalog")
    id("com.automattic.android.publish-to-s3")
}

catalog {
    versionCatalog {
        from(files("../libs.versions.toml"))
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

