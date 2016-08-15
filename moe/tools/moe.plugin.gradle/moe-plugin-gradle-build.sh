#!/bin/sh

#
# BUILD moe.plugin.gradle PROJECT
# 

qualifier="$1"
build_number="$2"
target_repo="$3"
repo_user="$4"
repo_pass="$5"

export MOE_REPO=$target_repo

export MOE_PLUGIN_GRADLE_BUILD_NUMBER=$build_number
export PUBLISH_TARGET_REPO_ADDR=$target_repo
export PUBLISH_TARGET_REPO_USER=$repo_user
export PUBLISH_TARGET_REPO_PASS=$repo_pass

./gradlew clean build dependencies publish -x test
