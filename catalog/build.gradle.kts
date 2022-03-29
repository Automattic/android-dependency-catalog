plugins {
    id("version-catalog")
    id("com.automattic.android.publish-to-s3")
}

catalog {
    versionCatalog {
        plugin("androidGradlePlugin", "com.android.library").version("7.1.1")
        plugin("kotlinAndroid", "org.jetbrains.kotlin.android").version("1.5.10")
        library("activity-compose-1.4.0", "androidx.activity:activity-compose:1.4.0")
        library("activity-ktx-1.4.0", "androidx.activity:activity-ktx:1.4.0")
        library("activity-1.2.4", "androidx.activity:activity:1.2.4")
        library("activity-1.4.0", "androidx.activity:activity:1.4.0")
        library("annotation-experimental-1.1.0", "androidx.annotation:annotation-experimental:1.1.0")
        library("annotation-1.3.0", "androidx.annotation:annotation:1.3.0")
        library("appcompat-resources-1.4.0", "androidx.appcompat:appcompat-resources:1.4.0")
        library("appcompat-resources-1.4.1", "androidx.appcompat:appcompat-resources:1.4.1")
        library("appcompat-1.4.0", "androidx.appcompat:appcompat:1.4.0")
        library("appcompat-1.4.1", "androidx.appcompat:appcompat:1.4.1")
        library("core-common-2.1.0", "androidx.arch.core:core-common:2.1.0")
        library("core-runtime-2.1.0", "androidx.arch.core:core-runtime:2.1.0")
        library("asynclayoutinflater-1.0.0", "androidx.asynclayoutinflater:asynclayoutinflater:1.0.0")
        library("autofill-1.0.0", "androidx.autofill:autofill:1.0.0")
        library("browser-1.4.0", "androidx.browser:browser:1.4.0")
        library("cardview-1.0.0", "androidx.cardview:cardview:1.0.0")
        library("collection-ktx-1.1.0", "androidx.collection:collection-ktx:1.1.0")
        library("collection-1.1.0", "androidx.collection:collection:1.1.0")
        library("animation-core-1.1.1", "androidx.compose.animation:animation-core:1.1.1")
        library("animation-1.1.1", "androidx.compose.animation:animation:1.1.1")
        library("compiler-1.1.1", "androidx.compose.compiler:compiler:1.1.1")
        library("foundation-layout-1.1.1", "androidx.compose.foundation:foundation-layout:1.1.1")
        library("foundation-1.1.1", "androidx.compose.foundation:foundation:1.1.1")
        library("material-icons-core-1.1.1", "androidx.compose.material:material-icons-core:1.1.1")
        library("material-ripple-1.1.1", "androidx.compose.material:material-ripple:1.1.1")
        library("material-1.1.1", "androidx.compose.material:material:1.1.1")
        library("runtime-livedata-1.1.1", "androidx.compose.runtime:runtime-livedata:1.1.1")
        library("runtime-saveable-1.1.1", "androidx.compose.runtime:runtime-saveable:1.1.1")
        library("runtime-1.1.1", "androidx.compose.runtime:runtime:1.1.1")
        library("ui-geometry-1.1.1", "androidx.compose.ui:ui-geometry:1.1.1")
        library("ui-graphics-1.1.1", "androidx.compose.ui:ui-graphics:1.1.1")
        library("ui-text-1.1.1", "androidx.compose.ui:ui-text:1.1.1")
        library("ui-tooling-data-1.1.1", "androidx.compose.ui:ui-tooling-data:1.1.1")
        library("ui-tooling-preview-1.1.1", "androidx.compose.ui:ui-tooling-preview:1.1.1")
        library("ui-tooling-1.1.1", "androidx.compose.ui:ui-tooling:1.1.1")
        library("ui-unit-1.1.1", "androidx.compose.ui:ui-unit:1.1.1")
        library("ui-util-1.1.1", "androidx.compose.ui:ui-util:1.1.1")
        library("ui-1.1.1", "androidx.compose.ui:ui:1.1.1")
        library("concurrent-futures-1.0.0", "androidx.concurrent:concurrent-futures:1.0.0")
        library("constraintlayout-core-1.0.3", "androidx.constraintlayout:constraintlayout-core:1.0.3")
        library("constraintlayout-solver-2.0.1", "androidx.constraintlayout:constraintlayout-solver:2.0.1")
        library("constraintlayout-2.0.1", "androidx.constraintlayout:constraintlayout:2.0.1")
        library("constraintlayout-2.1.3", "androidx.constraintlayout:constraintlayout:2.1.3")
        library("coordinatorlayout-1.1.0", "androidx.coordinatorlayout:coordinatorlayout:1.1.0")
        library("core-ktx-1.7.0", "androidx.core:core-ktx:1.7.0")
        library("core-1.7.0", "androidx.core:core:1.7.0")
        library("cursoradapter-1.0.0", "androidx.cursoradapter:cursoradapter:1.0.0")
        library("customview-1.0.0", "androidx.customview:customview:1.0.0")
        library("customview-1.1.0", "androidx.customview:customview:1.1.0")
        library("viewbinding-7.1.1", "androidx.databinding:viewbinding:7.1.1")
        library("datastore-core-1.0.0", "androidx.datastore:datastore-core:1.0.0")
        library("datastore-preferences-core-1.0.0", "androidx.datastore:datastore-preferences-core:1.0.0")
        library("datastore-preferences-1.0.0", "androidx.datastore:datastore-preferences:1.0.0")
        library("datastore-1.0.0", "androidx.datastore:datastore:1.0.0")
        library("documentfile-1.0.0", "androidx.documentfile:documentfile:1.0.0")
        library("drawerlayout-1.0.0", "androidx.drawerlayout:drawerlayout:1.0.0")
        library("drawerlayout-1.1.1", "androidx.drawerlayout:drawerlayout:1.1.1")
        library("dynamicanimation-1.0.0", "androidx.dynamicanimation:dynamicanimation:1.0.0")
        library("emoji2-views-helper-1.0.0", "androidx.emoji2:emoji2-views-helper:1.0.0")
        library("emoji2-1.0.0", "androidx.emoji2:emoji2:1.0.0")
        library("exifinterface-1.2.0", "androidx.exifinterface:exifinterface:1.2.0")
        library("fragment-ktx-1.4.1", "androidx.fragment:fragment-ktx:1.4.1")
        library("fragment-1.3.6", "androidx.fragment:fragment:1.3.6")
        library("fragment-1.4.1", "androidx.fragment:fragment:1.4.1")
        library("gridlayout-1.0.0", "androidx.gridlayout:gridlayout:1.0.0")
        library("hilt-navigation-fragment-1.0.0", "androidx.hilt:hilt-navigation-fragment:1.0.0")
        library("hilt-navigation-1.0.0", "androidx.hilt:hilt-navigation:1.0.0")
        library("interpolator-1.0.0", "androidx.interpolator:interpolator:1.0.0")
        library("legacy-support-core-ui-1.0.0", "androidx.legacy:legacy-support-core-ui:1.0.0")
        library("legacy-support-core-utils-1.0.0", "androidx.legacy:legacy-support-core-utils:1.0.0")
        library("legacy-support-v13-1.0.0", "androidx.legacy:legacy-support-v13:1.0.0")
        library("legacy-support-v4-1.0.0", "androidx.legacy:legacy-support-v4:1.0.0")
        library("lifecycle-common-java8-2.4.0", "androidx.lifecycle:lifecycle-common-java8:2.4.0")
        library("lifecycle-common-2.4.0", "androidx.lifecycle:lifecycle-common:2.4.0")
        library("lifecycle-livedata-core-ktx-2.4.0", "androidx.lifecycle:lifecycle-livedata-core-ktx:2.4.0")
        library("lifecycle-livedata-core-2.4.0", "androidx.lifecycle:lifecycle-livedata-core:2.4.0")
        library("lifecycle-livedata-ktx-2.4.0", "androidx.lifecycle:lifecycle-livedata-ktx:2.4.0")
        library("lifecycle-livedata-2.4.0", "androidx.lifecycle:lifecycle-livedata:2.4.0")
        library("lifecycle-process-2.4.0", "androidx.lifecycle:lifecycle-process:2.4.0")
        library("lifecycle-runtime-ktx-2.3.1", "androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
        library("lifecycle-runtime-2.4.0", "androidx.lifecycle:lifecycle-runtime:2.4.0")
        library("lifecycle-viewmodel-compose-2.4.1", "androidx.lifecycle:lifecycle-viewmodel-compose:2.4.1")
        library("lifecycle-viewmodel-ktx-2.4.0", "androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.0")
        library("lifecycle-viewmodel-savedstate-2.3.1", "androidx.lifecycle:lifecycle-viewmodel-savedstate:2.3.1")
        library("lifecycle-viewmodel-savedstate-2.4.0", "androidx.lifecycle:lifecycle-viewmodel-savedstate:2.4.0")
        library("lifecycle-viewmodel-2.3.1", "androidx.lifecycle:lifecycle-viewmodel:2.3.1")
        library("lifecycle-viewmodel-2.4.0", "androidx.lifecycle:lifecycle-viewmodel:2.4.0")
        library("loader-1.0.0", "androidx.loader:loader:1.0.0")
        library("localbroadcastmanager-1.0.0", "androidx.localbroadcastmanager:localbroadcastmanager:1.0.0")
        library("media-1.2.1", "androidx.media:media:1.2.1")
        library("multidex-2.0.0", "androidx.multidex:multidex:2.0.0")
        library("navigation-common-ktx-2.4.1", "androidx.navigation:navigation-common-ktx:2.4.1")
        library("navigation-common-2.4.1", "androidx.navigation:navigation-common:2.4.1")
        library("navigation-compose-2.4.0-beta02", "androidx.navigation:navigation-compose:2.4.0-beta02")
        library("navigation-fragment-ktx-2.4.1", "androidx.navigation:navigation-fragment-ktx:2.4.1")
        library("navigation-fragment-2.4.1", "androidx.navigation:navigation-fragment:2.4.1")
        library("navigation-runtime-ktx-2.4.1", "androidx.navigation:navigation-runtime-ktx:2.4.1")
        library("navigation-runtime-2.4.1", "androidx.navigation:navigation-runtime:2.4.1")
        library("navigation-ui-ktx-2.4.1", "androidx.navigation:navigation-ui-ktx:2.4.1")
        library("navigation-ui-2.4.1", "androidx.navigation:navigation-ui:2.4.1")
        library("paging-common-2.1.2", "androidx.paging:paging-common:2.1.2")
        library("paging-runtime-2.1.2", "androidx.paging:paging-runtime:2.1.2")
        library("preference-1.1.1", "androidx.preference:preference:1.1.1")
        library("print-1.0.0", "androidx.print:print:1.0.0")
        library("profileinstaller-1.1.0", "androidx.profileinstaller:profileinstaller:1.1.0")
        library("recyclerview-selection-1.1.0", "androidx.recyclerview:recyclerview-selection:1.1.0")
        library("recyclerview-1.1.0", "androidx.recyclerview:recyclerview:1.1.0")
        library("recyclerview-1.2.1", "androidx.recyclerview:recyclerview:1.2.1")
        library("resourceinspection-annotation-1.0.0", "androidx.resourceinspection:resourceinspection-annotation:1.0.0")
        library("room-common-2.4.0", "androidx.room:room-common:2.4.0")
        library("room-ktx-2.3.0", "androidx.room:room-ktx:2.3.0")
        library("room-runtime-2.4.0", "androidx.room:room-runtime:2.4.0")
        library("savedstate-ktx-1.1.0", "androidx.savedstate:savedstate-ktx:1.1.0")
        library("savedstate-1.1.0", "androidx.savedstate:savedstate:1.1.0")
        library("slidingpanelayout-1.2.0", "androidx.slidingpanelayout:slidingpanelayout:1.2.0")
        library("sqlite-framework-2.2.0", "androidx.sqlite:sqlite-framework:2.2.0")
        library("sqlite-2.2.0", "androidx.sqlite:sqlite:2.2.0")
        library("startup-runtime-1.0.0", "androidx.startup:startup-runtime:1.0.0")
        library("swiperefreshlayout-1.1.0", "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
        library("tracing-1.0.0", "androidx.tracing:tracing:1.0.0")
        library("transition-1.2.0", "androidx.transition:transition:1.2.0")
        library("transition-1.4.1", "androidx.transition:transition:1.4.1")
        library("vectordrawable-animated-1.1.0", "androidx.vectordrawable:vectordrawable-animated:1.1.0")
        library("vectordrawable-1.1.0", "androidx.vectordrawable:vectordrawable:1.1.0")
        library("versionedparcelable-1.1.1", "androidx.versionedparcelable:versionedparcelable:1.1.1")
        library("viewpager2-1.0.0", "androidx.viewpager2:viewpager2:1.0.0")
        library("viewpager-1.0.0", "androidx.viewpager:viewpager:1.0.0")
        library("window-1.0.0", "androidx.window:window:1.0.0")
        library("protos-30.1.1", "com.android.tools.analytics-library:protos:30.1.1")
        library("shared-30.1.1", "com.android.tools.analytics-library:shared:30.1.1")
        library("tracker-30.1.1", "com.android.tools.analytics-library:tracker:30.1.1")
        library("aapt2-proto-7.0.0-beta04-7396180", "com.android.tools.build:aapt2-proto:7.0.0-beta04-7396180")
        library("aapt2-7.1.1-7984345", "com.android.tools.build:aapt2:7.1.1-7984345")
        library("apksig-7.1.1", "com.android.tools.build:apksig:7.1.1")
        library("apkzlib-7.1.1", "com.android.tools.build:apkzlib:7.1.1")
        library("builder-model-7.1.1", "com.android.tools.build:builder-model:7.1.1")
        library("builder-test-api-7.1.1", "com.android.tools.build:builder-test-api:7.1.1")
        library("builder-7.1.1", "com.android.tools.build:builder:7.1.1")
        library("manifest-merger-30.1.1", "com.android.tools.build:manifest-merger:30.1.1")
        library("ddmlib-30.1.1", "com.android.tools.ddms:ddmlib:30.1.1")
        library("intellij-core-30.1.1", "com.android.tools.external.com-intellij:intellij-core:30.1.1")
        library("kotlin-compiler-30.1.1", "com.android.tools.external.com-intellij:kotlin-compiler:30.1.1")
        library("uast-30.1.1", "com.android.tools.external.org-jetbrains:uast:30.1.1")
        library("layoutlib-api-30.1.1", "com.android.tools.layoutlib:layoutlib-api:30.1.1")
        library("lint-api-30.1.1", "com.android.tools.lint:lint-api:30.1.1")
        library("lint-checks-30.1.1", "com.android.tools.lint:lint-checks:30.1.1")
        library("lint-gradle-30.1.1", "com.android.tools.lint:lint-gradle:30.1.1")
        library("lint-model-30.1.1", "com.android.tools.lint:lint-model:30.1.1")
        library("lint-30.1.1", "com.android.tools.lint:lint:30.1.1")
        library("annotations-30.1.1", "com.android.tools:annotations:30.1.1")
        library("common-30.1.1", "com.android.tools:common:30.1.1")
        library("dvlib-30.1.1", "com.android.tools:dvlib:30.1.1")
        library("repository-30.1.1", "com.android.tools:repository:30.1.1")
        library("sdk-common-30.1.1", "com.android.tools:sdk-common:30.1.1")
        library("sdklib-30.1.1", "com.android.tools:sdklib:30.1.1")
        library("volley-1.2.0", "com.android.volley:volley:1.2.0")
        library("signflinger-7.1.1", "com.android:signflinger:7.1.1")
        library("zipflinger-7.1.1", "com.android:zipflinger:7.1.1")
        library("transport-api-3.0.0", "com.google.android.datatransport:transport-api:3.0.0")
        library("transport-backend-cct-3.0.0", "com.google.android.datatransport:transport-backend-cct:3.0.0")
        library("transport-runtime-3.0.0", "com.google.android.datatransport:transport-runtime:3.0.0")
        library("flexbox-3.0.0", "com.google.android.flexbox:flexbox:3.0.0")
        library("play-services-auth-api-phone-18.0.1", "com.google.android.gms:play-services-auth-api-phone:18.0.1")
        library("play-services-auth-base-18.0.1", "com.google.android.gms:play-services-auth-base:18.0.1")
        library("play-services-auth-20.1.0", "com.google.android.gms:play-services-auth:20.1.0")
        library("play-services-base-18.0.1", "com.google.android.gms:play-services-base:18.0.1")
        library("play-services-basement-18.0.0", "com.google.android.gms:play-services-basement:18.0.0")
        library("play-services-cloud-messaging-17.0.0", "com.google.android.gms:play-services-cloud-messaging:17.0.0")
        library("play-services-stats-17.0.0", "com.google.android.gms:play-services-stats:17.0.0")
        library("play-services-tasks-18.0.1", "com.google.android.gms:play-services-tasks:18.0.1")
        library("compose-theme-adapter-1.1.6", "com.google.android.material:compose-theme-adapter:1.1.6")
        library("material-1.4.0", "com.google.android.material:material:1.4.0")
        library("material-1.5.0", "com.google.android.material:material:1.5.0")
        library("core-1.10.3", "com.google.android.play:core:1.10.3")
        library("symbol-processing-api-1.5.30-1.0.0", "com.google.devtools.ksp:symbol-processing-api:1.5.30-1.0.0")
        library("firebase-annotations-16.0.0", "com.google.firebase:firebase-annotations:16.0.0")
        library("firebase-common-ktx-20.0.0", "com.google.firebase:firebase-common-ktx:20.0.0")
        library("firebase-common-20.0.0", "com.google.firebase:firebase-common:20.0.0")
        library("firebase-components-17.0.0", "com.google.firebase:firebase-components:17.0.0")
        library("firebase-datatransport-18.0.0", "com.google.firebase:firebase-datatransport:18.0.0")
        library("firebase-encoders-json-18.0.0", "com.google.firebase:firebase-encoders-json:18.0.0")
        library("firebase-encoders-17.0.0", "com.google.firebase:firebase-encoders:17.0.0")
        library("firebase-iid-interop-17.1.0", "com.google.firebase:firebase-iid-interop:17.1.0")
        library("firebase-installations-interop-17.0.0", "com.google.firebase:firebase-installations-interop:17.0.0")
        library("firebase-installations-17.0.0", "com.google.firebase:firebase-installations:17.0.0")
        library("firebase-measurement-connector-19.0.0", "com.google.firebase:firebase-measurement-connector:19.0.0")
        library("firebase-messaging-ktx-23.0.0", "com.google.firebase:firebase-messaging-ktx:23.0.0")
        library("firebase-messaging-23.0.0", "com.google.firebase:firebase-messaging:23.0.0")
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

