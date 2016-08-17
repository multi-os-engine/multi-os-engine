#!/bin/sh

#
# BUILD moe.plugin.idea PROJECT
# 

qualifier="$1"
build_number="$2"
target_repo="$3"
repo_user="$4"
repo_pass="$5"

export MOE_MAVEN_ADDR=$target_repo

export MOE_PLUGIN_IDEA_BUILD_NUMBER=$build_number
export PUBLISH_TARGET_REPO_ADDR=$target_repo
export PUBLISH_TARGET_REPO_USER=$repo_user
export PUBLISH_TARGET_REPO_PASS=$repo_pass

# replace build version
#cat src/main/resources/META-INF/plugin.xml | sed "s/1.0.0.1/1.0.$build_number/g" > src/main/resources/META-INF/temp.xml
#mv -f src/main/resources/META-INF/temp.xml src/main/resources/META-INF/plugin.xml
#cat src/main/resources/Bundle.properties | sed "s/1.0.0.1/1.0.$build_number/g" > src/main/resources/Bundle_temp.properties
#mv -f src/main/resources/Bundle_temp.properties src/main/resources/Bundle.properties

./gradlew clean buildPlugin dependencies publish -Pmoe.publish.qualifier=$qualifier
