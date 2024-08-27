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

export CROSSBINARYS=$MOE_PREBUILTS_DIR/build/linux-crosscompiler/x86_64-unknown-linux-gnu/bin
export CC=$CROSSBINARYS/x86_64-unknown-linux-gnu-gcc
export CXX=$CROSSBINARYS/x86_64-unknown-linux-gnu-g++
export SYSROOT=$MOE_PREBUILTS_DIR/build/linux-crosscompiler/x86_64-unknown-linux-gnu/x86_64-unknown-linux-gnu/sysroot/
export CFLAGS="--sysroot=${SYSROOT}"
export CXXFLAGS="--sysroot=${SYSROOT}"
export LDFLAGS="--sysroot=${SYSROOT} -L${SYSROOT}/usr/lib"
export AR=$CROSSBINARYS/x86_64-unknown-linux-gnu-gcc-ar
export RANLIB=$CROSSBINARYS/x86_64-unknown-linux-gnu-gcc-ranlib

SDKS="x86_64"

# Build
for SDK in $SDKS; do
	__MOE_TARGET="$MOE_PREBUILTS_DIR/$MOE_PREBUILTS_TARGET_DIR/$SDK"
	./configure \
	--prefix="$__MOE_TARGET" \
	--host="$SDK" \
	--disable-shared \
	--enable-static \
	--enable-portable-binary \
	--with-pic="yes" \
	--build="$SDK-pc-linux-gnu" \
	--with-sysroot="$SYSROOT"
	PKG_CONFIG_LIBDIR="$__MOE_TARGET/lib/pkgconfig"

  # TODO: REMOVE THIS
	sed -i '' 's/%:.*//' Makefile

	make -j$(sysctl -n hw.logicalcpu)
	make install
done
