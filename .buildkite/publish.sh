#!/bin/bash

set -euo pipefail

./gradlew -p catalog prepareToPublishToS3 $(prepare_to_publish_to_s3_params) publishMavenPublicationToS3Repository
cat ./catalog/build/published-version.txt | buildkite-agent meta-data set "PUBLISHED_CATALOG_VERSION"
