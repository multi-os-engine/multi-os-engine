#!/bin/bash

#
# BUILD all
#

qualifier="$1"
build_number="$2"
target_repo="`cd $3;pwd;cd - >/dev/null`"
repo_user="$4"
repo_pass="$5"

call_tool () {
    chmod a+x $1 &&
    if ! $*; then
        echo FAILED: $*
    fi
}

call_tool ./build-tools.sh "$1" "$2" "$target_repo" "$4" "$5" &&
call_tool ./build-sdk.sh "$1" "$2" "$target_repo" "$4" "$5"
call_tool ./build-moe-pack.sh "$1" "$2" "$target_repo" "$4" "$5"
exit $?
