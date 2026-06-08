#!/usr/bin/env bash

set -e

function exit_with_usage_error() {
  echo "Script to set component version numbers."
  echo "Usage: $0 COMPONENT VERSION"
  echo "    COMPONENT   moe/idea"
  echo "        moe     MOE SDK + Gradle plugin"
  echo "        idea    MOE IDEA/Android Studio plugin"
  echo "    VERSION     the base version code (without -SNAPSHOT)"
  echo ""
  echo "Note: SNAPSHOT suffix is controlled at build time via -PRELEASE flag,"
  echo "not by this script."
  exit 1
}

if [[ "$#" != "2" ]]; then
  exit_with_usage_error
fi

COMPONENT="$1"
VERSION="$2"

MOE_BASE_DIR="$(cd "$(dirname "$0")" && pwd)"
MOE_TOOLS_DIR="$MOE_BASE_DIR/tools"
MOE_CORE_DIR="$MOE_BASE_DIR/moe-core"
MOE_IDEA_PLUGIN_DIR="$MOE_TOOLS_DIR/moe.plugin.idea"

WORKED=

if [[ "$COMPONENT" == "moe" ]]; then
  echo "Updating MOE version..."

  WORKED=1

  sed -E -i '' "s/^version += +\".+\"/version = \"$VERSION\"/" "$MOE_CORE_DIR/build.gradle.kts"
  sed -E -i '' "s/^MOE_VERSION=.+$/MOE_VERSION=$VERSION/" "$MOE_TOOLS_DIR/gradle.properties"
fi

if [[ "$COMPONENT" == "idea" ]]; then
  echo "Updating MOE IDEA plugin version..."

  WORKED=1

  sed -E -i '' "s/^version += +'.+'/version = '$VERSION'/" "$MOE_IDEA_PLUGIN_DIR/build.gradle.kts"
fi

if [[ ! "$WORKED" ]]; then
  exit_with_usage_error
fi

echo "Update complete! Don't forget to commit the changes."
