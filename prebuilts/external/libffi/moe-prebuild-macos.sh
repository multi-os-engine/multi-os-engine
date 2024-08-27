#!/bin/bash

set -e

if [ -z "$MOE_PREBUILTS_DIR" ]; then
    echo "MOE_PREBUILTS_DIR env var is not set" 1>&2
    exit 1
fi
echo "MOE_PREBUILTS_DIR=$MOE_PREBUILTS_DIR"

if [ -z "$MOE_PREBUILTS_TARGET_DIR" ]; then
    echo "MOE_PREBUILTS_TARGET_DIR env var is not set" 1>&2
    exit 1
fi
echo "MOE_PREBUILTS_TARGET_DIR=$MOE_PREBUILTS_TARGET_DIR"

# Clean old build
rm -rf "$MOE_PREBUILTS_DIR/$MOE_PREBUILTS_TARGET_DIR"

# Shared pre-build setup
./autogen.sh
python3 generate-darwin-source-and-headers.py

# Properties
SDKS="macosx"
CONFIGURATIONS="Debug Release"

# Build
for SDK in $SDKS; do for CONFIGURATION in $CONFIGURATIONS; do
    OTHER_ARGS="\
    DSTROOT=$MOE_PREBUILTS_DIR \
    INSTALL_PATH=/$MOE_PREBUILTS_TARGET_DIR/$CONFIGURATION \
    SKIP_INSTALL=NO \
    PUBLIC_HEADERS_FOLDER_PATH=/$MOE_PREBUILTS_TARGET_DIR/$CONFIGURATION/include \
    install"

    # Build
    xcodebuild -target libffi-static-Mac -configuration $CONFIGURATION -sdk $SDK build $OTHER_ARGS
done done
