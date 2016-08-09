#!/bin/sh

#
# BUILD NATJ PROJECT
#

set -e

qualifier="$1"
build_number="$2"
target_repo="$3"
repo_user="$4"
repo_pass="$5"

export BUILD_NUMBER=$build_number
export PUBLISH_TARGET_REPO_ADDR=$target_repo
export PUBLISH_TARGET_REPO_USER=$repo_user
export PUBLISH_TARGET_REPO_PASS=$repo_pass

which i686-w64-mingw32-g++
i686-w64-mingw32-g++ --version
which x86_64-w64-mingw32-g++
x86_64-w64-mingw32-g++ --version

export CXXFLAGS="-std=c++11"
./gradlew clean publish -x test -Pmoe.publish.qualifier=$qualifier
