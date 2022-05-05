#!/bin/bash

set -euo pipefail

./gradlew :catalog:prepareToPublishToS3 $(prepare_to_publish_to_s3_params) :catalog:publishMavenPublicationToS3Repository
buildkite-agent meta-data set "PUBLISHED_CATALOG_VERSION" < ./catalog/build/published-version.txt
