#!/usr/bin/env bash

set -e

function exit_with_usage_error() {
  echo "Script to set component version numbers."
  echo "Usage: $0 COMPONENT VERSION"
  echo "    COMPONENT   core/gradle/idea/build/all"
  echo "        core    MOE SDK core"
  echo "        gradle  MOE Gradle plugin"
  echo "        idea    MOE IDEA/Android Studio plugin"
  echo "        build   MOE SDK + Gradle plugin"
  echo "        all     all components above"
  echo "    VERSION     the version code to set to"
  exit 1
}

if [[ "$#" != "2" ]]; then
  exit_with_usage_error
fi

COMPONENT="$1"
VERSION="$2"

TOOL_MASTER_DIR="$(cd "$(dirname "$0")" && pwd)"
REPO_ROOT_DIR="$TOOL_MASTER_DIR/../../.."
MOE_DIR="$REPO_ROOT_DIR/moe"
MOE_CORE_DIR="$MOE_DIR/moe-core"
MOE_TOOLS_DIR="$MOE_DIR/tools"
MOE_GRADLE_PROPERTIES="$MOE_TOOLS_DIR/moe.plugin.gradle/src/main/resources/org/moe/gradle/moe.properties"
MOE_IDEA_PLUGIN_DIR="$MOE_TOOLS_DIR/moe.plugin.idea"

WORKED=

if [[ "$COMPONENT" == "core" || "$COMPONENT" == "build" || "$COMPONENT" == "all" ]]; then
  echo "Updating MOE core version..."

  WORKED=1

  sed -E -i '' "s/^version +'.+'/version '$VERSION'/" "$MOE_CORE_DIR/build.gradle"
  sed -E -i '' "s/^version +'.+'/version '$VERSION'/" "$MOE_TOOLS_DIR/moe.sdk.publisher/build.gradle"
  sed -E -i '' "s/^MOE-SDK-Version=.+$/MOE-SDK-Version=$VERSION/" "$MOE_GRADLE_PROPERTIES"
fi

if [[ "$COMPONENT" == "gradle" || "$COMPONENT" == "build" || "$COMPONENT" == "all" ]]; then
  echo "Updating MOE Gradle plugin version..."

  WORKED=1

  sed -E -i '' "s/^MOE-Plugin-Version=.+$/MOE-Plugin-Version=$VERSION/" "$MOE_GRADLE_PROPERTIES"
fi

if [[ "$COMPONENT" == "idea" || "$COMPONENT" == "all" ]]; then
  echo "Updating MOE IDEA plugin version..."

  WORKED=1

  sed -E -i '' "s/^version +'.+'/version '$VERSION'/" "$MOE_IDEA_PLUGIN_DIR/build.gradle"
fi

if [[ ! "$WORKED" ]]; then
  exit_with_usage_error
fi

echo "Update complete! Don't forget to commit the changes."
