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
public final class CXResult {
    /**
     * Function returned successfully.
     */
    @Generated public static final int CXResult_Success = 0x00000000;
    /**
     * One of the parameters was invalid for the function.
     */
    @Generated public static final int CXResult_Invalid = 0x00000001;
    /**
     * The function was terminated by a callback (e.g. it returned
     * CXVisit_Break)
     */
    @Generated public static final int CXResult_VisitBreak = 0x00000002;

    @Generated
    private CXResult() {
    }
}
