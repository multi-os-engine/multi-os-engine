#!/bin/bash

# REQUIREMENTS

set -e

cd "${0%/*}"
export WORKSPACE=$(pwd)

export TIME=$(date "+%Y%m%d-%H%M%S")
export BUILD_ROOT=build-jobs/natj-ctests
export BUILD_DIR=$BUILD_ROOT/$TIME

if [ $# -ne 2 ]; then
	echo "Parameters: <user>@<server> <i686|x86_64>"
	exit 1
fi

export REMOTE=$1
export ARCH=$2
export TARGET_PLATFORM="linux-$ARCH"
trap 'echo "$TARGET_PLATFORM: ERROR: ${FAIL_MESSAGE}"' ERR

export FAIL_MESSAGE="Failed to build libnatj.so"
../../natj-linux/build_remote_linux.sh $REMOTE $ARCH

echo "$TARGET_PLATFORM: Checking architecture"
export FAIL_MESSAGE="Remote system is not $ARCH!"
if [ $ARCH == "i686" ]; then
	ssh $REMOTE '[ $(uname -i | grep i686 | wc -l) -eq 1 ]'
	export NATJ_SO=../../natj-linux/build/i686-pc-linux-gnu/Debug/libnatj.so
elif [ $ARCH == "x86_64" ]; then
	ssh $REMOTE '[ $(uname -i | grep x86_64 | wc -l) -eq 1 ]'
	export NATJ_SO=../../natj-linux/build/x86_64-unknown-linux-gnu/Debug/libnatj.so
else
	echo "ERROR: Unsupported architecture! Supported: i686, x86_64"
	exit 1
fi

export FAIL_MESSAGE="$NATJ_SO does not exist!"
[ -f $NATJ_SO ]

export FAIL_MESSAGE="Failed to create test resources!"
echo "$TARGET_PLATFORM: Preparing test resources on host..."
cd ../../
./gradlew natj-ctests:compileTest
cd $WORKSPACE
[ -d ../build/classes/test ]

export FAIL_MESSAGE="Failed to create build directory!"
ssh $REMOTE "mkdir -p $BUILD_DIR"
ssh $REMOTE "if [ -L $BUILD_ROOT/latest ]; then rm $BUILD_ROOT/latest; fi"
ssh $REMOTE "cd $BUILD_ROOT && ln -s $TIME latest"

export FAIL_MESSAGE="Failed to copy file to remote!"
ssh $REMOTE "mkdir -p $BUILD_DIR/src/test/resources"
ssh $REMOTE "mkdir -p $BUILD_DIR/include"
ssh $REMOTE "mkdir -p $BUILD_DIR/lib"
ssh $REMOTE "mkdir -p $BUILD_DIR/classes"
echo "$TARGET_PLATFORM: Copying resources to target..."
scp -q build.gradle               $REMOTE:$BUILD_DIR/
scp -q -r ../../gradle            $REMOTE:$BUILD_DIR/
scp -q ../../gradlew              $REMOTE:$BUILD_DIR/
scp -q ../../build/libs/natj.jar  $REMOTE:$BUILD_DIR/
scp -q -r ../src/test/native/*    $REMOTE:$BUILD_DIR/src/
scp -q -r ../src/test/resources/* $REMOTE:$BUILD_DIR/src/test/resources/
scp -q -r ../build/classes/test/* $REMOTE:$BUILD_DIR/classes/

export FAIL_MESSAGE="Failed to copy libnatj.so!"
scp -q $NATJ_SO $REMOTE:$BUILD_DIR/lib/

echo "$TARGET_PLATFORM: Building on target..."
#export FAIL_MESSAGE="Debug build failed!"
#./test_remote_linux-build.sh "Debug" "-O0 -g -Wall -Wno-strict-aliasing -Wno-unknown-pragmas"
export FAIL_MESSAGE="Release build failed!"
./test_remote_linux-build.sh "Release" "-Os -Wall -Wno-strict-aliasing -Wno-unknown-pragmas"

set +e
export FAIL_MESSAGE=""
ssh $REMOTE 'cd '$BUILD_DIR' && ./gradlew test'
EXIT_CODE=$?

export FAIL_MESSAGE="Failed to copy build results from remote!"
echo "$TARGET_PLATFORM: Copying test results to host..."
if [ $ARCH == "i686" ]; then
	if [ -d build/i686-pc-linux-gnu ]; then rm -rf build/i686-pc-linux-gnu; fi
	mkdir -p build/i686-pc-linux-gnu
	scp -q -r $REMOTE:$BUILD_DIR/build/reports ./build/i686-pc-linux-gnu/
elif [ $ARCH == "x86_64" ]; then
	if [ -d build/x86_64-unknown-linux-gnu ]; then rm -rf build/x86_64-unknown-linux-gnu; fi
	mkdir -p build/x86_64-unknown-linux-gnu
	scp -q -r $REMOTE:$BUILD_DIR/build/reports ./build/x86_64-unknown-linux-gnu/
else
	echo "ERROR: Unsupported architecture! Supported: i686, x86_64"
	exit 1
fi

echo "$TARGET_PLATFORM: Completed with exit code $EXIT_CODE"
exit $EXIT_CODE
