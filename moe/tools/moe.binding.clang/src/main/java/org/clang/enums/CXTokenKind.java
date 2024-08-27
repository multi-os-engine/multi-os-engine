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
 * Describes a kind of token.
 */
@Generated
public final class CXTokenKind {
    /**
     * A token that contains some kind of punctuation.
     */
    @Generated public static final int Punctuation = 0x00000000;
    /**
     * A language keyword.
     */
    @Generated public static final int Keyword = 0x00000001;
    /**
     * An identifier (that is not a keyword).
     */
    @Generated public static final int Identifier = 0x00000002;
    /**
     * A numeric, string, or character literal.
     */
    @Generated public static final int Literal = 0x00000003;
    /**
     * A comment.
     */
    @Generated public static final int Comment = 0x00000004;

    @Generated
    private CXTokenKind() {
    }
}
