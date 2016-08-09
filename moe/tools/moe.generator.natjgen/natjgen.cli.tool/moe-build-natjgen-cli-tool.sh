#!/bin/sh

#
# BUILD natjgen.cli.tool PROJECT
# 

qualifier="$1"
build_number="$2"
target_repo="$3"
repo_user="$4"
repo_pass="$5"

export MOE_MAVEN_ADDR=$target_repo

export MOE_NATJGEN_CLI_TOOL_BUILD_NUMBER=$build_number
export PUBLISH_TARGET_REPO_ADDR=$target_repo
export PUBLISH_TARGET_REPO_USER=$repo_user
export PUBLISH_TARGET_REPO_PASS=$repo_pass

cd "../org.moe.mdt.natjgen"
chmod a+x moe-build-mdt-natjgen.sh
./moe-build-mdt-natjgen.sh "$1" "$2" "$3" "$4" "$5"

cd "../natjgen.cli.tool"
./gradlew clean build dependencies publish -Pmoe.publish.qualifier=$qualifier -x test