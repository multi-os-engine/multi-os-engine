#!/bin/sh

#
# BUILD moe.binding.clang PROJECT
# 

qualifier="$1"
build_number="$2"
target_repo="$3"
repo_user="$4"
repo_pass="$5"

export MOE_MAVEN_ADDR=$target_repo

export MOE_BINDING_CLANG_BUILD_NUMBER=$build_number
export PUBLISH_TARGET_REPO_ADDR=$target_repo
export PUBLISH_TARGET_REPO_USER=$repo_user
export PUBLISH_TARGET_REPO_PASS=$repo_pass

./gradlew clean build dependencies publish -Pmoe.publish.qualifier=$qualifier -x test