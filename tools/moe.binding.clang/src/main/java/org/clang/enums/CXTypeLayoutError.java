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
 * List the possible error codes for \c clang_Type_getSizeOf,
 * \c clang_Type_getAlignOf, \c clang_Type_getOffsetOf and
 * \c clang_Cursor_getOffsetOf.
 * <p>
 * A value of this enumeration type can be returned if the target type is not
 * a valid argument to sizeof, alignof or offsetof.
 */
@Generated
public final class CXTypeLayoutError {
    /**
     * Type is of kind CXType_Invalid.
     */
    @Generated public static final int Invalid = 0xFFFFFFFF;
    /**
     * The type is an incomplete Type.
     */
    @Generated public static final int Incomplete = 0xFFFFFFFE;
    /**
     * The type is a dependent Type.
     */
    @Generated public static final int Dependent = 0xFFFFFFFD;
    /**
     * The type is not a constant size type.
     */
    @Generated public static final int NotConstantSize = 0xFFFFFFFC;
    /**
     * The Field name is not valid for this record.
     */
    @Generated public static final int InvalidFieldName = 0xFFFFFFFB;

    @Generated
    private CXTypeLayoutError() {
    }

    /**
     * The type is undeduced.
     */
    @Generated public static final int Undeduced = 0xFFFFFFFA;
}
