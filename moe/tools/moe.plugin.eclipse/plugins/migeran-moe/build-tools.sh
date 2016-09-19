#!/bin/bash
cd ../../../
rm -r ./moe.tools.natjgen/build
rm -r ./moe.tools.common/build
rm -r ./moe.generator.project/build
rm -r ./moe.document.xib/build
rm -r ./moe.document.pbxproj/build
cd master
./gradlew :moe.plugin.idea:build
