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
 * Describe the linkage of the entity referred to by a cursor.
 */
@Generated
public final class CXLinkageKind {
    /**
     * This value indicates that no linkage information is available
     * for a provided CXCursor.
     */
    @Generated public static final int Invalid = 0x00000000;
    /**
     * This is the linkage for variables, parameters, and so on that
     * have automatic storage.  This covers normal (non-extern) local variables.
     */
    @Generated public static final int NoLinkage = 0x00000001;
    /**
     * This is the linkage for static variables and static functions.
     */
    @Generated public static final int Internal = 0x00000002;
    /**
     * This is the linkage for entities with external linkage that live
     * in C++ anonymous namespaces.
     */
    @Generated public static final int UniqueExternal = 0x00000003;
    /**
     * This is the linkage for entities with true, external linkage.
     */
    @Generated public static final int External = 0x00000004;

    @Generated
    private CXLinkageKind() {
    }
}
