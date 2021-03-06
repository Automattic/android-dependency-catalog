val versionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")
plugins {
    alias(libs.plugins.android.library)

    alias(libs.plugins.android.application).apply(false)
    alias(libs.plugins.automattic.publishToS3).apply(false)
    alias(libs.plugins.kotlin.android).apply(false)
    alias(libs.plugins.kotlin.android.extensions).apply(false)
    alias(libs.plugins.kotlin.jvm).apply(false)
    alias(libs.plugins.kotlin.kapt).apply(false)
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
