#!/bin/bash

# REQUIREMENTS

set -e

cd "${0%/*}"

export TIME=$(date "+%Y%m%d-%H%M%S")
export BUILD_ROOT=build-jobs/natj
export BUILD_DIR=$BUILD_ROOT/$TIME

if [ $# -ne 2 ]; then
	echo "Parameters: <user>@<server> <i686|x86_64>"
	exit 1
fi

export REMOTE=$1
export ARCH=$2
export TARGET_PLATFORM="linux-$ARCH"
trap 'echo "$TARGET_PLATFORM: ERROR: ${FAIL_MESSAGE}"' ERR

echo "$TARGET_PLATFORM: Checking architecture"
export FAIL_MESSAGE="Remote system is not $ARCH!"
if [ $ARCH == "i686" ]; then
	ssh $REMOTE '[ $(uname -i | grep i686 | wc -l) -eq 1 ]'
elif [ $ARCH == "x86_64" ]; then
	ssh $REMOTE '[ $(uname -i | grep x86_64 | wc -l) -eq 1 ]'
else
	echo "ERROR: Unsupported architecture! Supported: i686, x86_64"
	exit 1
fi

export FAIL_MESSAGE="Failed to create build directory!"
ssh $REMOTE "mkdir -p $BUILD_DIR"
ssh $REMOTE "if [ -L $BUILD_ROOT/latest ]; then rm $BUILD_ROOT/latest; fi"
ssh $REMOTE "cd $BUILD_ROOT && ln -s $TIME latest"

export FAIL_MESSAGE="Failed to copy file to remote!"
ssh $REMOTE "mkdir -p $BUILD_DIR/src"
ssh $REMOTE "mkdir -p $BUILD_DIR/include"
echo "$TARGET_PLATFORM: Copying resources to target..."
scp -q ../src/main/native/natj/CHandlers.*  $REMOTE:$BUILD_DIR/src/
scp -q ../src/main/native/natj/CRuntime.*   $REMOTE:$BUILD_DIR/src/
scp -q ../src/main/native/natj/CxxRuntime.* $REMOTE:$BUILD_DIR/src/
scp -q ../src/main/native/natj/Logging.*    $REMOTE:$BUILD_DIR/src/
scp -q ../src/main/native/natj/NatJ.*       $REMOTE:$BUILD_DIR/src/
scp -q ../src/main/native/include/jni.h     $REMOTE:$BUILD_DIR/include/

if [ $ARCH == "i686" ]; then
	scp -q -r ../libffi/i686-pc-linux-gnu/ $REMOTE:$BUILD_DIR/libffi
elif [ $ARCH == "x86_64" ]; then
	scp -q -r ../libffi/x86_64-unknown-linux-gnu/ $REMOTE:$BUILD_DIR/libffi
else
	echo "ERROR: Unsupported architecture! Supported: i686, x86_64"
	exit 1
fi

echo "$TARGET_PLATFORM: Building on target..."
export FAIL_MESSAGE="Debug build failed!"
./build_remote_linux-build.sh "Debug" "-O0 -g -Wall -Wno-strict-aliasing -Wno-unknown-pragmas"
export FAIL_MESSAGE="Release build failed!"
./build_remote_linux-build.sh "Release" "-Os -Wall -Wno-strict-aliasing -Wno-unknown-pragmas"

export FAIL_MESSAGE="Failed to copy build results from remote!"
echo "$TARGET_PLATFORM: Copying built files to host..."
if [ $ARCH == "i686" ]; then
	if [ -d build/i686-pc-linux-gnu ]; then rm -rf build/i686-pc-linux-gnu; fi
	mkdir -p build/i686-pc-linux-gnu
	scp -q -r $REMOTE:$BUILD_DIR/build/Debug ./build/i686-pc-linux-gnu/Debug
	scp -q -r $REMOTE:$BUILD_DIR/build/Release ./build/i686-pc-linux-gnu/Release
elif [ $ARCH == "x86_64" ]; then
	if [ -d build/x86_64-unknown-linux-gnu ]; then rm -rf build/x86_64-unknown-linux-gnu; fi
	mkdir -p build/x86_64-unknown-linux-gnu
	scp -q -r $REMOTE:$BUILD_DIR/build/Debug ./build/x86_64-unknown-linux-gnu/Debug
	scp -q -r $REMOTE:$BUILD_DIR/build/Release ./build/x86_64-unknown-linux-gnu/Release
else
	echo "ERROR: Unsupported architecture! Supported: i686, x86_64"
	exit 1
fi

echo "$TARGET_PLATFORM: Remote build completed"
