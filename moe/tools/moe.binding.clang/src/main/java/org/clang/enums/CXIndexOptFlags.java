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
public final class CXIndexOptFlags {
    /**
     * Used to indicate that no special indexing options are needed.
     */
    @Generated public static final int CXIndexOpt_None = 0x00000000;
    /**
     * Used to indicate that IndexerCallbacks#indexEntityReference should
     * be invoked for only one reference of an entity per source file that does
     * not also include a declaration/definition of the entity.
     */
    @Generated public static final int CXIndexOpt_SuppressRedundantRefs = 0x00000001;
    /**
     * Function-local symbols should be indexed. If this is not set
     * function-local symbols will be ignored.
     */
    @Generated public static final int CXIndexOpt_IndexFunctionLocalSymbols = 0x00000002;
    /**
     * Implicit function/class template instantiations should be indexed.
     * If this is not set, implicit instantiations will be ignored.
     */
    @Generated public static final int CXIndexOpt_IndexImplicitTemplateInstantiations = 0x00000004;
    /**
     * Suppress all compiler warnings when parsing for indexing.
     */
    @Generated public static final int CXIndexOpt_SuppressWarnings = 0x00000008;
    /**
     * Skip a function/method body that was already parsed during an
     * indexing session associated with a \c CXIndexAction object.
     * Bodies in system headers are always skipped.
     */
    @Generated public static final int CXIndexOpt_SkipParsedBodiesInSession = 0x00000010;

    @Generated
    private CXIndexOptFlags() {
    }
}
