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

git apply libplist-pretty-natjgen.patch

__MOE_MINGW="x86_64-w64-mingw32"
__MOE_TARGET="$MOE_PREBUILTS_DIR/$MOE_PREBUILTS_TARGET_DIR/$__MOE_MINGW"
__MOE_PREBUILTS_DIR="$MOE_PREBUILTS_DIR/external/libimobiledevice/libxml2/build/windows/$__MOE_MINGW/lib/pkgconfig"

./autogen.sh \
--prefix="$__MOE_TARGET" \
--host=$__MOE_MINGW \
--disable-shared \
CFLAGS="-DMOE" \
--without-cython \
PKG_CONFIG_LIBDIR="$__MOE_PREBUILTS_DIR"
make
make install
