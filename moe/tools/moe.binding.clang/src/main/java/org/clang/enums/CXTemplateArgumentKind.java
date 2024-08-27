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
 * Describes the kind of a template argument.
 * <p>
 * See the definition of llvm::clang::TemplateArgument::ArgKind for full
 * element descriptions.
 */
@Generated
public final class CXTemplateArgumentKind {
    @Generated public static final int Null = 0x00000000;
    @Generated public static final int Type = 0x00000001;
    @Generated public static final int Declaration = 0x00000002;
    @Generated public static final int NullPtr = 0x00000003;
    @Generated public static final int Integral = 0x00000004;
    @Generated public static final int Template = 0x00000005;
    @Generated public static final int TemplateExpansion = 0x00000006;
    @Generated public static final int Expression = 0x00000007;
    @Generated public static final int Pack = 0x00000008;
    /**
     * Indicates an error case, preventing the kind from being deduced.
     */
    @Generated public static final int Invalid = 0x00000009;

    @Generated
    private CXTemplateArgumentKind() {
    }
}
