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

# Properties
# SDKS="x86_64-w64-mingw32 i686-w64-mingw32"
SDKS="x86_64-w64-mingw32"

# Build
for SDK in $SDKS; do
	__MOE_TARGET="$MOE_PREBUILTS_DIR/$MOE_PREBUILTS_TARGET_DIR/$SDK"
	./configure \
	--prefix="$__MOE_TARGET" \
	--host="$SDK" \
	--disable-shared \
	--enable-static \
	--enable-portable-binary \
	PKG_CONFIG_LIBDIR="$__MOE_TARGET/lib/pkgconfig"
	make
	make install
done
