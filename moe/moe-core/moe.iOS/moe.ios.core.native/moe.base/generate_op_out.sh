#!/bin/bash

#
# Copyright (C) 2014 Intel Corporation
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

TEMPLATED_HEADER="/* GENETATED SOURCE CODE, DO NOT EDIT! */

/*
 * Copyright (c) <YEAR> Intel Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the \"License\");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an \"AS IS\" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */"

YEAR=`date +'%Y'`
HEADER=${TEMPLATED_HEADER/"<YEAR>"/$YEAR}

realpath () {
[[ $1 = /* ]] && echo "$1" || echo "$PWD/${1#./}"
}

cd "$(dirname "$(realpath "$0")")";

if [ $# -ne 1 ]
then
    echo "Specify your copy of the android sources!"
    exit 1
else
    echo "Generating sources for $1"
fi

ANDROID_WORKSPACE_PATH=$1
ART_PATH="$ANDROID_WORKSPACE_PATH/art"
GEN_SCRIPT="$ART_PATH/tools/generate-operator-out.py"

# THESE VALUES ARE FROM runtime/Android.mk
LIBART_ENUM_OPERATOR_OUT_HEADER_FILES="image.h gc/weak_root_state.h dex_instruction_utils.h base/unix_file/fd_file.h profiler_options.h gc_root.h debugger.h instrumentation.h gc/allocator_type.h stack.h gc/allocator/rosalloc.h gc/collector_type.h base/mutex.h dex_file.h dex_instruction.h gc/collector/gc_type.h gc/space/space.h gc/heap.h indirect_reference_table.h arch/instruction_set.h invoke_type.h jdwp/jdwp.h jdwp/jdwp_constants.h lock_word.h mirror/class.h oat.h quick/inline_method_analyser.h thread.h thread_state.h verifier/method_verifier.h"

# THESE VALUES ARE FROM compiler/Android.mk
LIBART_COMPILER_COMMON_ENUM_OPERATOR_OUT_HEADER_FILES="image_writer.h driver/compiler_driver.h dex/global_value_numbering.h dex/quick/resource_mask.h dex/pass_me.h dex/compiler_enums.h optimizing/locations.h driver/compiler_options.h"
LIBART_COMPILER_ARM_ENUM_OPERATOR_OUT_HEADER_FILES="utils/arm/constants_arm.h dex/quick/arm/arm_lir.h"
LIBART_COMPILER_ARM64_ENUM_OPERATOR_OUT_HEADER_FILES="dex/quick/arm64/arm64_lir.h"

function generate {
    echo "Generating $1 to $2..."

    MODULE_PATH="$ART_PATH/$1"

    if [ -d "$2/$4_gen" ]
    then
        rm -R "$2/$4_gen"
    fi
    mkdir "$2/$4_gen"

    # Clear collected source
    echo -e "\n$HEADER\n" > "$2/$4_operator_outs.cc"

    echo "#ifdef MOE" >> "$2/$4_operator_outs.cc"

    for SRC_FILE in $3
    do
        echo "${SRC_FILE}"

        SRC_FILENAME=$(basename "$SRC_FILE")
        OUT_FILE_REL="$4_gen/${SRC_FILENAME%.*}_operator_out.cc"
        OUT_FILE="$2/$4_gen/${SRC_FILENAME%.*}_operator_out.cc"

        echo -e "$HEADER\n\n" > /tmp/newfile
        cat $(pwd)/$OUT_FILE >> /tmp/newfile
        cp /tmp/newfile $(pwd)/$OUT_FILE

        echo "#include \"$OUT_FILE_REL\"" >> "$2/$4_operator_outs.cc"
        python "$GEN_SCRIPT" "$MODULE_PATH" "$MODULE_PATH/$SRC_FILE" >> "$OUT_FILE"
    done

    echo "#endif /* MOE */" >> "$2/$4_operator_outs.cc"
}

generate runtime "../android.art.runtime/src/main/native" "$LIBART_ENUM_OPERATOR_OUT_HEADER_FILES" runtime
generate compiler "../android.art.compiler/src/main/native" "$LIBART_COMPILER_COMMON_ENUM_OPERATOR_OUT_HEADER_FILES" compiler_common
generate compiler "../android.art.compiler/src/main/native" "$LIBART_COMPILER_ARM_ENUM_OPERATOR_OUT_HEADER_FILES" compiler_arm
generate compiler "../android.art.compiler/src/main/native" "$LIBART_COMPILER_ARM64_ENUM_OPERATOR_OUT_HEADER_FILES" compiler_arm64
