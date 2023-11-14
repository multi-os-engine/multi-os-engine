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

# Build
#__MOE_MINGW="i686-w64-mingw32"
#__MOE_TARGET="$MOE_PREBUILTS_DIR/$MOE_PREBUILTS_TARGET_DIR/$__MOE_MINGW"
#CROSS_COMPILE="$__MOE_MINGW-" ./Configure mingw \
#--prefix="$__MOE_TARGET" \
#shared \
#no-asm \
#enable-deprecated
#make depend
#make
#make install
#
#make clean

__MOE_MINGW="x86_64-w64-mingw32"
__MOE_TARGET="$MOE_PREBUILTS_DIR/$MOE_PREBUILTS_TARGET_DIR/$__MOE_MINGW"
CROSS_COMPILE="$__MOE_MINGW-" ./Configure mingw64 \
--prefix="$__MOE_TARGET" \
no-shared \
no-asm \
enable-deprecated
make depend
make -j$(sysctl -n hw.logicalcpu)
make install
