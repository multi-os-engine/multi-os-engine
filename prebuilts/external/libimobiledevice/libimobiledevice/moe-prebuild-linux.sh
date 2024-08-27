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
__MOE_PREBUILTS_DIR="$MOE_PREBUILTS_DIR/external/libimobiledevice/libplist/build/linux/lib/pkgconfig"
__MOE_PREBUILTS_DIR="$__MOE_PREBUILTS_DIR:$MOE_PREBUILTS_DIR/external/libimobiledevice/libusbmuxd/build/linux/lib/pkgconfig"

export CROSSBINARYS=$MOE_PREBUILTS_DIR/build/linux-crosscompiler/x86_64-unknown-linux-gnu/bin
export CC=$CROSSBINARYS/x86_64-unknown-linux-gnu-gcc
export CXX=$CROSSBINARYS/x86_64-unknown-linux-gnu-g++
export SYSROOT=$MOE_PREBUILTS_DIR/build/linux-crosscompiler/x86_64-unknown-linux-gnu/x86_64-unknown-linux-gnu/sysroot/
export CFLAGS="-fPIC --sysroot=${SYSROOT} -DMOE -I$MOE_PREBUILTS_DIR/external/libimobiledevice/openssl/build/linux/x86_64/include -I$MOE_PREBUILTS_DIR/external/libimobiledevice/libusbmuxd/build/linux/include"
export CXXFLAGS="--sysroot=${SYSROOT}"
export LDFLAGS="--sysroot=${SYSROOT} -L${SYSROOT}/usr/lib -ldl"
export AR=$CROSSBINARYS/x86_64-unknown-linux-gnu-gcc-ar
export RANLIB=$CROSSBINARYS/x86_64-unknown-linux-gnu-gcc-ranlib

export SDK="x86_64"

./autogen.sh \
--prefix="$__MOE_TARGET/x86_64" \
--disable-shared \
--host="$SDK" \
--build="$SDK-pc-linux-gnu" \
--without-cython \
PKG_CONFIG_LIBDIR="$__MOE_PREBUILTS_DIR:$MOE_PREBUILTS_DIR/external/libimobiledevice/openssl/build/linux/x86_64/lib/pkgconfig"
make -j$(sysctl -n hw.logicalcpu)
make install
