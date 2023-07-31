# Android Dependency Catalog

This project is a shared Android dependency catalog for Automattic projects which uses [Gradle's version catalog feature](https://docs.gradle.org/current/userguide/platforms.html). It's also used for generating a dependency cache that we use in our CIs to speed up our builds.

## Table of Contents

* [Importing the version catalog to your project](#importing-the-version-catalog-to-your-project)
* [Updating a dependency version](#updating-a-dependency-version)
* [Adding a new dependency](#adding-a-new-dependency)
* [Releasing a new catalog version](#releasing-a-new-catalog-version)
* [Naming conventions](#naming-conventions)
* [Building locally](#building-locally)
* [Dependency caching](#dependency-caching)
* [Automatically updating dependency versions in the catalog](#automatically-updating-dependency-versions-in-the-catalog)
* [Setting up your projects to automatically update the catalog version](#setting-up-your-projects-to-automatically-update-the-catalog-version)

## Importing the version catalog to your project

Add the following to your `settings.gradle`:

```groovy
dependencyResolutionManagement {
    versionCatalogs {
        sharedLibs {
            from("com.automattic:dependency-catalog:$catalogVersion")

            // You can override the declared versions with the following syntax:
            // version("kotlin", "1.6.21")
        }
    }
}
```

Now you can use the catalog in your `build.gradle` file as such:

```groovy
plugins {
    alias(sharedLibs.plugins.android.library)
    alias(sharedLibs.plugins.kotlin.android)
}

dependencies {
    implementation sharedLibs.androidx.recyclerview
}
```

See [Gradle documentation](https://docs.gradle.org/current/userguide/platforms.html) for more details.

## Updating a dependency version

* Create a new branch from `trunk`
* Update the version in [libs.versions.toml](libs.versions.toml)
* Follow the instructions for [releasing a new catalog version](#releasing-a-new-catalog-version)

## Adding a new dependency

* Check out [naming conventions](#naming-conventions) before you get started
* Add the version of the dependency under the `[versions]` section in [libs.versions.toml](libs.versions.toml) - you can skip this step if you'll reuse an existing version
* Add the dependency using the format below to `[libraries]` or `[plugins]` section:
```
androidx-recyclerview = { module = "androidx.recyclerview:recyclerview", version.ref = "androidx-recyclerview" }
```
* `version.ref` refers to the version name from `[versions]` section in the [libs.versions.toml](libs.versions.toml) file
* If this is a new plugin, add it under `plugins` section in [example/build.gradle.kts](example/build.gradle.kts) - make sure to add `.apply(false)`. This step is necessary because we use the `example` module to generate a dependency cache we use to speed up CI in other projects. We are able to automatically add the library dependencies, so this step is not necessary, but plugins need to be added manually.
* [Build the catalog & example projects](#building-locally) - if you get `Could not find {dependency}` error, make sure the repository for the new dependency you've added is included in [example/settings.gradle.kts](example/settings.gradle.kts)
* Follow the instructions for [releasing a new catalog version](#releasing-a-new-catalog-version)

## Releasing a new catalog version

* Create a new pull request that adds a new dependency or update an existing version
* If you're updating an existing version, include any information you can find about what changed between the existing & new version in the pull request description
* A new version catalog will be published by Buildkite with the version name: `{prNumber}-{commitSHA1}`. You can use this version to test your project. An easier way to test the version change is to temporarily override it in your project following [these instructions](https://docs.gradle.org/current/userguide/platforms.html#sec:overwriting-catalog-versions).
* Review & merge the pull request to `trunk`
* Create a new tag by incrementing the `MINOR` version in `MAJOR.MINOR.PATCH` format: `git checkout trunk && git pull && git tag {VERSION} && git push origin {VERSION}`
* Wait for GitHub Actions to create a new release draft and Buildkite to publish the version catalog
* Publish the GitHub release draft by auto-generating the release notes and adding any other relevant information to it

## Naming conventions

We'll need to iterate on our naming conventions, but here are some general guidelines we have used so far:

* If the name is unique, it can be added as one word. Examples: `dagger`, `eventbus`, `kotlin`, `volley`, `wellsql`, `wiremock`, 
* If the domain name and the artifact name is the same, it can be added as one word. Examples: `restAssured`, `robolectric`
* In general, we use `{domainName}-{artifactName}`. Examples: `androidx-appcompat`, `androidx-room-ktx`, `facebook-flipper`, `facebook-flipper-network-plugin`, `squareup-javapoet`, `tinder-statemachine`
* The `-` character acts as a form of encapsulation. For example adding `androidx-annotation` & `androidx-appcompat` will create an `androidx` property which will have `androidx.annotation` and `androidx.appcompat` properties added to it. Keep this structure in mind while using `-` character.
* Replace `-` with camelCase if it makes more sense to keep something as one word. For example, `com.automattic.android.publish-to-s3` is added as `automattic-publishToS3`.

## Building locally

* You can generate the version catalog by running `./gradlew :catalog:generateCatalogAsToml` command. The generated catalog will be available at: `catalog/build/version-catalog/libs.versions.toml`
* You can build the example project by running `./gradlew :example:build` which will use the root `libs.versions.toml` file  as its version catalog.
* Alternatively, you can run the example project using an already published catalog by running `./gradlew :example:build -PcatalogVersion={catalogVersion}` command.

**Note that `example` project does NOT use the generated version catalog from the `catalog` project.** Although this is not likely to cause a difference in practice, it's an important distinction to be aware of.

## Dependency caching

We use the `example` project to generate a dependency cache which is uploaded to S3 by CI and then used in several projects.

Note that all libraries within the version catalog will be automatically added as a dependency to the `example` project, but the plugins need to be added manually.

## Automatically updating dependency versions in the catalog

This feature is not available yet.

We can use [renovate](https://github.com/renovatebot/renovate) to keep the versions in our catalog up to date. We intentionally haven't enabled this feature, as we are not yet in a position to take advantage of it in our projects.

## Setting up your projects to automatically update the catalog version

A version catalog is just another Maven publication, so bots such as `Dependabot` or `renovate` can be used to automatically update the catalog version in projects. However, it's not yet added to any project as we'd like to figure out implementation details and collect feedback before adding this automation.

