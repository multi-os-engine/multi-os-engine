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
 * Describes how the traversal of the children of a particular
 * cursor should proceed after visiting a particular child cursor.
 * <p>
 * A value of this enumeration type should be returned by each
 * \c CXCursorVisitor to indicate how clang_visitChildren() proceed.
 */
@Generated
public final class CXChildVisitResult {
    /**
     * Terminates the cursor traversal.
     */
    @Generated public static final int Break = 0x00000000;
    /**
     * Continues the cursor traversal with the next sibling of
     * the cursor just visited, without visiting its children.
     */
    @Generated public static final int Continue = 0x00000001;
    /**
     * Recursively traverse the children of this cursor, using
     * the same visitor and client data.
     */
    @Generated public static final int Recurse = 0x00000002;

    @Generated
    private CXChildVisitResult() {
    }
}
