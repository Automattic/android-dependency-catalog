val versionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")
plugins {
    alias(libs.plugins.androidGradlePlugin)
    alias(libs.plugins.kotlinAndroid)
}

android {
    defaultConfig {
        compileSdkVersion(31)
    }
}

dependencies {
    versionCatalog.getLibraryAliases().forEach { libraryAlias ->
        versionCatalog.findLibrary(libraryAlias).ifPresent {
            implementation(it)
        }
    }
}
