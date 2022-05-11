#!/bin/bash

set -euo pipefail

# Retrieve data from previous steps
PUBLISHED_CATALOG_VERSION=$(buildkite-agent meta-data get "PUBLISHED_CATALOG_VERSION")

./gradlew :example:build -PcatalogVersion="$PUBLISHED_CATALOG_VERSION"

save_gradle_dependency_cache
