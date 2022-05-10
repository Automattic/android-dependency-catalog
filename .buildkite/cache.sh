#!/bin/bash

set -euo pipefail

# Retrieve data from previous steps
PUBLISHED_CATALOG_VERSION=$(buildkite-agent meta-data get "PUBLISHED_CATALOG_VERSION")

mkdir -p "$GRADLE_RO_DEP_CACHE"

./gradlew :example:build -PcatalogVersion="$PUBLISHED_CATALOG_VERSION"

# https://docs.gradle.org/current/userguide/dependency_resolution.html#sub:cache_copy
# Gradle suggests removing the "*.lock" files and the `gc.properties` file for saving/restoring cache
cp -r ~/.gradle/caches/modules-2 "$GRADLE_RO_DEP_CACHE" \
    && find "$GRADLE_RO_DEP_CACHE" -name "*.lock" -type f -delete \
    && find "$GRADLE_RO_DEP_CACHE" -name "gc.properties" -type f -delete

save_cache "$GRADLE_RO_DEP_CACHE" "$GRADLE_DEPENDENCY_CACHE_KEY"
