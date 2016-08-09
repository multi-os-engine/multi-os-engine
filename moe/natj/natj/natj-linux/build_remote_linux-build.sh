#!/bin/bash

set -e

CONFIG=$1
FLAGS=$2

trap 'echo "ERROR: ${FAIL_MESSAGE}"' ERR

echo "    --- Building $CONFIG ---"
export FAIL_MESSAGE="Failed to create $CONFIG build directory!"
CONFIG_BUILD_DIR=build/$CONFIG
PER_CONFIG_BUILD_DIR=$BUILD_DIR/$CONFIG_BUILD_DIR
ssh $REMOTE "mkdir -p $PER_CONFIG_BUILD_DIR/obj"

export FAIL_MESSAGE="Failed to build $CONFIG on remote!"
BUILD_COMMAND=""
BUILD_COMMAND=$BUILD_COMMAND' cd '$BUILD_DIR' && for I in $(find src -name "*.cpp" -printf "%f\n"); do'
BUILD_COMMAND=$BUILD_COMMAND' echo "    Compiling src/$I" &&'
BUILD_COMMAND=$BUILD_COMMAND' echo "'$CONFIG_BUILD_DIR'/obj/$I.o" >> '$CONFIG_BUILD_DIR'/obj/main.infiles &&'
BUILD_COMMAND=$BUILD_COMMAND' gcc -c -fPIC -std=c++11 -mtune=generic '$FLAGS' src/$I -o '$CONFIG_BUILD_DIR'/obj/$I.o -Ilibffi/include -Iinclude;'
BUILD_COMMAND=$BUILD_COMMAND' done'
ssh $REMOTE "$BUILD_COMMAND"

BUILD_COMMAND=""
BUILD_COMMAND=$BUILD_COMMAND' cd '$BUILD_DIR' &&'
BUILD_COMMAND=$BUILD_COMMAND' echo "    Linking" &&'
BUILD_COMMAND=$BUILD_COMMAND' gcc -shared -fPIC @'$CONFIG_BUILD_DIR'/obj/main.infiles -Wl,-soname=libnatj.so -o '$CONFIG_BUILD_DIR'/libnatj.so -lstdc++ libffi/.libs/libffi.a'
ssh $REMOTE "$BUILD_COMMAND"
