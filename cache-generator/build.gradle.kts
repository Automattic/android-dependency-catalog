val versionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")
plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    defaultConfig {
        compileSdkVersion(31)
        minSdkVersion(21)
    }
    lintOptions {
        lintConfig = file("config/lint.xml")
    }
}

dependencies {
    versionCatalog.getLibraryAliases().forEach { libraryAlias ->
        versionCatalog.findLibrary(libraryAlias).ifPresent {
            implementation(it)
        }
    }
}
