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

__MOE_TARGET="$MOE_PREBUILTS_DIR/$MOE_PREBUILTS_TARGET_DIR"

export CROSSBINARYS=$MOE_PREBUILTS_DIR/build/linux-crosscompiler/x86_64-unknown-linux-gnu/bin
export SYSROOT=$MOE_PREBUILTS_DIR/build/linux-crosscompiler/x86_64-unknown-linux-gnu/x86_64-unknown-linux-gnu/sysroot/
export CFLAGS="--sysroot=${SYSROOT} -DMOE"
export CXXFLAGS="--sysroot=${SYSROOT}"
export LDFLAGS="--sysroot=${SYSROOT} -L${SYSROOT}/usr/lib"

./Configure linux-x86_64 \
--prefix="$__MOE_TARGET/x86_64" \
--cross-compile-prefix=$CROSSBINARYS/x86_64-unknown-linux-gnu- \
shared \
no-asm \
no-tests \
enable-deprecated

make depend
# Even if it is slow, DON'T multithread this! I got constantly random errors and just sometimes success
make
make install