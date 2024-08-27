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
 * The most appropriate rendering mode for an inline command, chosen on
 * command semantics in Doxygen.
 */
@Generated
public final class CXCommentInlineCommandRenderKind {
    /**
     * Command argument should be rendered in a normal font.
     */
    @Generated public static final int Normal = 0x00000000;
    /**
     * Command argument should be rendered in a bold font.
     */
    @Generated public static final int Bold = 0x00000001;
    /**
     * Command argument should be rendered in a monospaced font.
     */
    @Generated public static final int Monospaced = 0x00000002;
    /**
     * Command argument should be rendered emphasized (typically italic
     * font).
     */
    @Generated public static final int Emphasized = 0x00000003;

    @Generated
    private CXCommentInlineCommandRenderKind() {
    }

    /**
     * Command argument should not be rendered (since it only defines an anchor).
     */
    @Generated public static final int Anchor = 0x00000004;
}
