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
 * Error codes returned by libclang routines.
 * <p>
 * Zero (\c CXError_Success) is the only error code indicating success.  Other
 * error codes, including not yet assigned non-zero values, indicate errors.
 */
@Generated
public final class CXErrorCode {
    /**
     * No error.
     */
    @Generated public static final int Success = 0x00000000;
    /**
     * A generic error code, no further details are available.
     * <p>
     * Errors of this kind can get their own specific error codes in future
     * libclang versions.
     */
    @Generated public static final int Failure = 0x00000001;
    /**
     * libclang crashed while performing the requested operation.
     */
    @Generated public static final int Crashed = 0x00000002;
    /**
     * The function detected that the arguments violate the function
     * contract.
     */
    @Generated public static final int InvalidArguments = 0x00000003;
    /**
     * An AST deserialization error has occurred.
     */
    @Generated public static final int ASTReadError = 0x00000004;

    @Generated
    private CXErrorCode() {
    }
}
