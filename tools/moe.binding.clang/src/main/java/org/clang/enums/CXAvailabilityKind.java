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
 * Describes the availability of a particular entity, which indicates
 * whether the use of this entity will result in a warning or error due to
 * it being deprecated or unavailable.
 */
@Generated
public final class CXAvailabilityKind {
    /**
     * The entity is available.
     */
    @Generated public static final int Available = 0x00000000;
    /**
     * The entity is available, but has been deprecated (and its use is
     * not recommended).
     */
    @Generated public static final int Deprecated = 0x00000001;
    /**
     * The entity is not available; any use of it will be an error.
     */
    @Generated public static final int NotAvailable = 0x00000002;
    /**
     * The entity is available, but not accessible; any use of it will be
     * an error.
     */
    @Generated public static final int NotAccessible = 0x00000003;

    @Generated
    private CXAvailabilityKind() {
    }
}
