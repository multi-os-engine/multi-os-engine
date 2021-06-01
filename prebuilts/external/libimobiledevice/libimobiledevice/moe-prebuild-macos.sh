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

git apply libimobiledevice-fix-ssl_read_with_timeout.patch

__MOE_TARGET="$MOE_PREBUILTS_DIR/$MOE_PREBUILTS_TARGET_DIR"
__MOE_PREBUILTS_DIR="$MOE_PREBUILTS_DIR/external/libimobiledevice/libplist/build/macos/lib/pkgconfig"
__MOE_PREBUILTS_DIR="$__MOE_PREBUILTS_DIR:$MOE_PREBUILTS_DIR/external/libimobiledevice/libusbmuxd/build/macos/lib/pkgconfig"

./autogen.sh \
--prefix="$__MOE_TARGET/x86_64" \
--disable-shared \
CFLAGS="-DMOE -arch x86_64"\
" -I$MOE_PREBUILTS_DIR/external/libimobiledevice/openssl/build/macos/x86_64/include"\
" -I$MOE_PREBUILTS_DIR/external/libimobiledevice/libusbmuxd/build/macos/include" \
--without-cython \
PKG_CONFIG_LIBDIR="$__MOE_PREBUILTS_DIR:$MOE_PREBUILTS_DIR/external/libimobiledevice/openssl/build/macos/x86_64/lib/pkgconfig"
make
make install

make clean

./autogen.sh \
--prefix="$__MOE_TARGET/arm64" \
--disable-shared \
CFLAGS="-DMOE -arch arm64"\
" -I$MOE_PREBUILTS_DIR/external/libimobiledevice/openssl/build/macos/arm64/include"\
" -I$MOE_PREBUILTS_DIR/external/libimobiledevice/libusbmuxd/build/macos/include" \
--without-cython \
PKG_CONFIG_LIBDIR="$__MOE_PREBUILTS_DIR:$MOE_PREBUILTS_DIR/external/libimobiledevice/openssl/build/macos/arm64/lib/pkgconfig"
make
make install
