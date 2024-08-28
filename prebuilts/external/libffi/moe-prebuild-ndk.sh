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

# Check prerequisits
if [ ! -d "$NDK_PATH/platforms/android-21" ]; then
    echo "Missing Android platform 21 from NDK" 1>&2
    exit 1
fi

# Shared pre-build setup
./autogen.sh

# Properties
SDKS="x86_64-w64-mingw32 i686-w64-mingw32"

arm=(arm arm arm -linux-androideabi -linux-androideabi)
aarch64=(aarch64 arm64 aarch64 -linux-android -linux-android)
mipsel=(mipsel mips mipsel -linux-android -linux-android)
mips64el=(mips64el mips64 mips64el -linux-android -linux-android)
x86=(x86 x86 i686 -linux-android)
x86_64=(x86_64 x86_64 x86_64 -linux-android)

# Build
for SDK in arm aarch64 mipsel mips64el x86 x86_64; do
    eval array=\( \${${SDK}[@]} \)

    export SYSROOT="$NDK_PATH/platforms/android-21/arch-${array[1]}"
    export CC="$NDK_PATH/toolchains/${array[0]}${array[4]}-4.9/prebuilt/darwin-x86_64/bin/${array[2]}${array[3]}-gcc --sysroot=$SYSROOT"
    export RANLIB="$NDK_PATH/toolchains/${array[0]}${array[4]}-4.9/prebuilt/darwin-x86_64/bin/${array[2]}${array[3]}-gcc-ranlib"
    export AR="$NDK_PATH/toolchains/${array[0]}${array[4]}-4.9/prebuilt/darwin-x86_64/bin/${array[2]}${array[3]}-gcc-ar"

    __MOE_TARGET="$MOE_PREBUILTS_DIR/$MOE_PREBUILTS_TARGET_DIR/$SDK"
    ./configure \
    --prefix="$__MOE_TARGET" \
    --host="${array[2]}${array[3]}" \
    --disable-shared \
    --enable-static \
    --enable-portable-binary \
    PKG_CONFIG_LIBDIR="$__MOE_TARGET/lib/pkgconfig"
    make
    make install
    make clean
done
