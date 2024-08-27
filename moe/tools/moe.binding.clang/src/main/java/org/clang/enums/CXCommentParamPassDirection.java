/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.clang.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Describes parameter passing direction for \\param or \\arg command.
 */
@Generated
public final class CXCommentParamPassDirection {
    /**
     * The parameter is an input parameter.
     */
    @Generated public static final int In = 0x00000000;
    /**
     * The parameter is an output parameter.
     */
    @Generated public static final int Out = 0x00000001;
    /**
     * The parameter is an input and output parameter.
     */
    @Generated public static final int InOut = 0x00000002;

    @Generated
    private CXCommentParamPassDirection() {
    }
}
