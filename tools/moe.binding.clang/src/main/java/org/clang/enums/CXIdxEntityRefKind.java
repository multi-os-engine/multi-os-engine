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
 * Data for IndexerCallbacks#indexEntityReference.
 * <p>
 * This may be deprecated in a future version as this duplicates
 * the \c CXSymbolRole_Implicit bit in \c CXSymbolRole.
 */
@Generated
public final class CXIdxEntityRefKind {
    /**
     * The entity is referenced directly in user's code.
     */
    @Generated public static final int CXIdxEntityRef_Direct = 0x00000001;
    /**
     * An implicit reference, e.g. a reference of an Objective-C method
     * via the dot syntax.
     */
    @Generated public static final int CXIdxEntityRef_Implicit = 0x00000002;

    @Generated
    private CXIdxEntityRefKind() {
    }
}
