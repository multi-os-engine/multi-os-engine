#!/bin/bash

set -e

cd ../../../master
./gradlew :moe.tools.natjgen:build :moe.tools.common:build :moe.generator.project:build :moe.document.xib:build :moe.document.pbxproj:build
