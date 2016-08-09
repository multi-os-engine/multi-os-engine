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
BUILD_COMMAND=$BUILD_COMMAND' cd '$BUILD_DIR'/src && for I in $(find . -name "*.c"); do'
BUILD_COMMAND=$BUILD_COMMAND' echo "    Compiling $I" &&'
BUILD_COMMAND=$BUILD_COMMAND' mkdir -p ../'$CONFIG_BUILD_DIR'/obj/$(dirname "$I") &&'
BUILD_COMMAND=$BUILD_COMMAND' echo "'$CONFIG_BUILD_DIR'/obj/$I.o" >> ../'$CONFIG_BUILD_DIR'/obj/main.infiles &&'
BUILD_COMMAND=$BUILD_COMMAND' gcc -c -fPIC -mtune=generic '$FLAGS' $I -o ../'$CONFIG_BUILD_DIR'/obj/$I.o -I../include;'
BUILD_COMMAND=$BUILD_COMMAND' done'
ssh $REMOTE "$BUILD_COMMAND"

BUILD_COMMAND=""
BUILD_COMMAND=$BUILD_COMMAND' cd '$BUILD_DIR' &&'
BUILD_COMMAND=$BUILD_COMMAND' echo "    Linking" &&'
BUILD_COMMAND=$BUILD_COMMAND' gcc -shared -fPIC @'$CONFIG_BUILD_DIR'/obj/main.infiles -o '$CONFIG_BUILD_DIR'/libTestClassesC.so -Llib -lnatj'
ssh $REMOTE "$BUILD_COMMAND"
