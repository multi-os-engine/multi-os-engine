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
public final class CXNameRefFlags {
    /**
     * Include the nested-name-specifier, e.g. Foo:: in x.Foo::y, in the
     * range.
     */
    @Generated public static final int Qualifier = 0x00000001;
    /**
     * Include the explicit template arguments, e.g. \<int> in x.f<int>,
     * in the range.
     */
    @Generated public static final int TemplateArgs = 0x00000002;
    /**
     * If the name is non-contiguous, return the full spanning range.
     * <p>
     * Non-contiguous names occur in Objective-C when a selector with two or more
     * parameters is used, or in C++ when using an operator:
     * \code
     * [object doSomething:here withValue:there]; // Objective-C
     * return some_vector[1]; // C++
     * \endcode
     */
    @Generated public static final int SinglePiece = 0x00000004;

    @Generated
    private CXNameRefFlags() {
    }
}
