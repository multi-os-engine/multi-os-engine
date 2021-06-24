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

git apply openssl-enable-deprecated.patch

git apply openssl-darwin-arm64.patch

__MOE_TARGET="$MOE_PREBUILTS_DIR/$MOE_PREBUILTS_TARGET_DIR"
./Configure darwin64-x86_64-cc \
--prefix="$__MOE_TARGET/x86_64" \
no-shared \
no-dynamic \
no-asm \
enable-deprecated
make depend
make
make install

make clean

./Configure darwin64-arm64-cc \
--prefix="$__MOE_TARGET/arm64" \
no-shared \
no-dynamic \
no-asm \
enable-deprecated
make depend
make
make install
