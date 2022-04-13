#!/bin/bash

set -euo pipefail

# Retrieve data from previous steps
PUBLISHED_CATALOG_VERSION=$(buildkite-agent meta-data get "PUBLISHED_CATALOG_VERSION")

./gradlew -p example -PcatalogVersion="$PUBLISHED_CATALOG_VERSION" build

mkdir -p "$GRADLE_RO_DEP_CACHE"

# https://docs.gradle.org/current/userguide/dependency_resolution.html#sub:cache_copy
# Gradle suggests removing the "*.lock" files and the `gc.properties` file for saving/restoring cache
cp -r ~/.gradle/caches/modules-2 "$GRADLE_RO_DEP_CACHE" \
    && find "$GRADLE_RO_DEP_CACHE" -print0 -name "*.lock" -or -name "gc.properties" | xargs rm -r

save_cache "$GRADLE_RO_DEP_CACHE" "GRADLE-DEPENDENCIES-FOR-CATALOG-$PUBLISHED_CATALOG_VERSION"
