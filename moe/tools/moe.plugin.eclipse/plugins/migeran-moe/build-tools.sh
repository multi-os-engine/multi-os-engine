#!/bin/bash

set -e
set -x

CURRENT_DIR=`pwd`

cd ../../../master
./gradlew \
    :moe.tools.natjgen:build \
    :moe.tools.common:build \
    :moe.generator.project:build \
    :moe.document.pbxproj:build \
    :moe.plugin.common:build

cd "$CURRENT_DIR"
cp ../../../moe.tools.natjgen/build/libs/*.jar lib/
cp ../../../moe.tools.common/build/libs/*.jar lib/
cp ../../../moe.generator.project/build/libs/*.jar lib/
cp ../../../moe.document.pbxproj/build/libs/*.jar lib/
cp ../../../moe.plugin.common/build/libs/*.jar lib/
