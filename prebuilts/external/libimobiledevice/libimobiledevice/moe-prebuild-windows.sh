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

__MOE_MINGW="x86_64-w64-mingw32"
__MOE_TARGET="$MOE_PREBUILTS_DIR/$MOE_PREBUILTS_TARGET_DIR/$__MOE_MINGW"
__MOE_PREBUILTS_DIR="$MOE_PREBUILTS_DIR/external/libimobiledevice/libxml2/build/windows/$__MOE_MINGW/lib/pkgconfig"
__MOE_PREBUILTS_DIR="$__MOE_PREBUILTS_DIR:$MOE_PREBUILTS_DIR/external/libimobiledevice/libplist/build/windows/$__MOE_MINGW/lib/pkgconfig"
__MOE_PREBUILTS_DIR="$__MOE_PREBUILTS_DIR:$MOE_PREBUILTS_DIR/external/libimobiledevice/libusbmuxd/build/windows/$__MOE_MINGW/lib/pkgconfig"
__MOE_PREBUILTS_DIR="$__MOE_PREBUILTS_DIR:$MOE_PREBUILTS_DIR/external/libimobiledevice/openssl/build/windows/$__MOE_MINGW/lib/pkgconfig"

./autogen.sh \
--prefix="$__MOE_TARGET" \
--host=$__MOE_MINGW \
--disable-shared \
CFLAGS="-std=gnu99 -DMOE -DWIN32" \
LDFLAGS="-lgdi32" \
--without-cython \
PKG_CONFIG_LIBDIR="$__MOE_PREBUILTS_DIR"
make
make install
