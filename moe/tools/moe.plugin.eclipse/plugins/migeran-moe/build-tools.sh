#!/bin/bash
cd ../../../
rm -r ./moe.tools.natjgen/build
rm -r ./moe.tools.common/build
rm -r ./moe.generator.project/build
cd master
./gradlew :moe.plugin.idea:build
