#!/bin/sh

#
# BUILD sdk
#

qualifier="$1"
build_number="$2"
target_repo="$3"
repo_user="$4"
repo_pass="$5"

cd ".." &&
echo Executing in $PWD
chmod a+x ios-sdk-build.sh &&
./ios-sdk-build.sh "$1" "$2" "$3" "$4" "$5"
