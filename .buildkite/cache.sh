#!/bin/bash

set -euo pipefail

# Retrieve data from previous steps
PUBLISHED_CATALOG_VERSION=$(buildkite-agent meta-data get "PUBLISHED_CATALOG_VERSION")

./gradlew -p example -PcatalogVersion="$PUBLISHED_CATALOG_VERSION" build

# https://docs.gradle.org/current/userguide/dependency_resolution.html#sub:cache_copy
mkdir gradle-modules-cache \
  && cp -r ~/.gradle/caches/modules-2 ./gradle-modules-cache \
  && find gradle-modules-cache/ -name "*.lock" -or -name "gc.properties" | xargs rm -r

save_cache gradle-modules-cache "GRADLE-DEPENDENCIES-FOR-CATALOG-$PUBLISHED_CATALOG_VERSION"
