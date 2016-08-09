#!/bin/bash

realpath () {
  [[ $1 = /* ]] && echo "$1" || echo "$PWD/${1#./}"
}
WORKSPACE="$(dirname "$(realpath "$0")")"
cd "$WORKSPACE"

rm -rf build

# build natj
$NDK_PATH/ndk-build NDK_OUT=build/Debug/obj NDK_APP_LIBS_OUT=build/Debug/libs DEBUG=1
$NDK_PATH/ndk-build NDK_OUT=build/Release/obj NDK_APP_LIBS_OUT=build/Release/libs
