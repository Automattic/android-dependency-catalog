#!/bin/bash

set -euo pipefail

# Retrieve data from previous steps
PUBLISHED_CATALOG_VERSION=$(buildkite-agent meta-data get "PUBLISHED_CATALOG_VERSION")
GRADLE_RO_DEP_CACHE="$HOME/.gradle_ro_dep_cache"
S3_GRADLE_DEPENDENCY_CACHE_KEY="GRADLE_DEPENDENCY_CACHE"

mkdir -p "$GRADLE_RO_DEP_CACHE"

./gradlew :example:build -PcatalogVersion="$PUBLISHED_CATALOG_VERSION"

# https://docs.gradle.org/current/userguide/dependency_resolution.html#sub:cache_copy
# Gradle suggests removing the "*.lock" files and the `gc.properties` file for saving/restoring cache
cp -r ~/.gradle/caches/modules-2 "$GRADLE_RO_DEP_CACHE" \
    && find "$GRADLE_RO_DEP_CACHE" -print0 -name "*.lock" -or -name "gc.properties" | xargs rm -r

save_cache "$GRADLE_RO_DEP_CACHE" "$S3_GRADLE_DEPENDENCY_CACHE_KEY"
