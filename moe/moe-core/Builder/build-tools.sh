#!/bin/sh

#
# BUILD tools
#

qualifier="$1"
build_number="$2"
target_repo="$3"
repo_user="$4"
repo_pass="$5"

export args="$qualifier $build_number $target_repo $repo_user $repo_pass"

call_sub () {
    command="./$2 $args"
    cd $1 &&
    echo Executing $command in $PWD &&
    chmod a+x $2 &&
    $command
    err=$?
    cd - >/dev/null
    if [[ $err != 0 ]]; then
        echo FAILED: $command in $1
    fi
    return $err
}

call_sub ../../../external/libffi build_all.sh
call_sub ../../natj/natj natj-build.sh &&
call_sub ../../../external/llvm moe_build_minsizerel.sh &&
call_sub ../../tools/moe.tools.common moe-tools-common-build.sh &&
call_sub ../../tools/moe.protocol.gdbremote moe-protocol-gdbremote-build.sh &&
call_sub ../../tools/moe.mac.core moe-mac-core-build.sh &&
call_sub ../../tools/moe.binding.clang moe-binding-clang-build.sh &&
call_sub ../../tools/moe.binding.libimobiledevice moe-binding-libimobiledevice-build.sh &&
call_sub ../../natj/natjgen/natjgen.cli.tool moe-build-natjgen-cli-tool.sh &&
call_sub ../../tools/moe.document.pbxproj moe-document-pbxproj-build.sh &&
call_sub ../../tools/moe.document.xib moe-document-xib-build.sh &&
call_sub ../../tools/moe.generator.project moe-generator-project-build.sh &&
call_sub ../../tools/moe.ios.device.launcher moe-ios-device-launcher-build.sh &&
call_sub ../../tools/moe.ios.simulator.launcher moe-ios-simulator-launcher-build.sh &&
call_sub ../../tools/moe.build.gradle moe-build-gradle-build.sh &&
call_sub ../../tools/moe.executable.builder moe-executable-builder-build.sh &&
call_sub ../../tools/moe.ui.transformer moe-tools-ui-transformer.sh &&
#call_sub ../../tools/moe.ui.designer moe-tools-ui-designer.sh &&
call_sub ../../tools/moe.plugin.idea moe-plugin-idea-build.sh
exit $?

