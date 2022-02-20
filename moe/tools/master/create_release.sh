#!/usr/bin/env bash

set -e

function exit_with_usage_error() {
  echo "Script to create a release."
  echo "Usage: $0 COMPONENT VERSION"
  echo "    COMPONENT   core/gradle/idea"
  echo "        core    MOE SDK core"
  echo "        gradle  MOE Gradle plugin"
  echo "        idea    MOE IDEA/Android Studio plugin"
  echo "    VERSION     the version code of the release"
  exit 1
}

if [[ "$#" != "2" ]]; then
  exit_with_usage_error
fi

COMPONENT="$1"
VERSION="$2"

TOOL_MASTER_DIR="$(cd "$(dirname "$0")" && pwd)"
REPO_ROOT_DIR="$TOOL_MASTER_DIR/../../.."
MANIFESTS_DIR="$REPO_ROOT_DIR/.repo/manifests"

if [[ "$COMPONENT" == "core" ]]; then
  BRANCH_NAME="moe-sdk-release"
  TAG_NAME="moe-sdk-$VERSION"
elif [[ "$COMPONENT" == "gradle" ]]; then
  BRANCH_NAME="moe-gradle-release"
  TAG_NAME="moe-gradle-$VERSION"
elif [[ "$COMPONENT" == "idea" ]]; then
  BRANCH_NAME="moe-idea-release"
  TAG_NAME="moe-idea-$VERSION"
else
  exit_with_usage_error
fi

echo "In case the process failed halfway through, run the following command to clean up the repository (Destructive! Run with caution!):"
echo "repo forall -c git tag -d $TAG_NAME"

echo ""
echo "Tagging repository with tag $TAG_NAME..."
repo forall -c git tag -a "$TAG_NAME" -m "Release $TAG_NAME"

echo "Updating manifests..."
git --git-dir "$MANIFESTS_DIR/.git" --work-tree="$MANIFESTS_DIR" checkout "$BRANCH_NAME"
sed -E -i '' "s/(<default .*revision=\").*(\" +\\/>)/\\1refs\\/tags\\/$TAG_NAME\\2/" "$MANIFESTS_DIR/default.xml"
git --git-dir "$MANIFESTS_DIR/.git" --work-tree="$MANIFESTS_DIR" add default.xml
git --git-dir "$MANIFESTS_DIR/.git" --work-tree="$MANIFESTS_DIR" commit -m "Create release $VERSION"

echo ""
echo "Release created! Push the release to remote with the following command:"
echo "cd \"$MANIFESTS_DIR\""
echo "repo forall -c git push multi-os-engine $TAG_NAME"
echo "git push origin \"$BRANCH_NAME\""
