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

@Generated
public final class CXObjCTypeParamVariance {
    @Generated public static final int Invalid = 0xFFFFFFFF;
    /**
     * The parameter is invariant: must match exactly.
     */
    @Generated public static final int Invariant = 0x00000000;
    /**
     * The parameter is covariant, e.g., X<T> is a subtype of X<U> when
     * the type parameter is covariant and T is a subtype of U.
     */
    @Generated public static final int Covariant = 0x00000001;
    /**
     * The parameter is contravariant, e.g., X<T> is a subtype of X<U>
     * when the type parameter is covariant and U is a subtype of T.
     */
    @Generated public static final int Contravariant = 0x00000002;

    @Generated
    private CXObjCTypeParamVariance() {
    }
}
