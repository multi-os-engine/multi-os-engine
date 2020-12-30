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

package apple.accelerate.enums;

import org.moe.natj.general.ann.Generated;

/**
 * @abstract The type reflecting the status of an operations.
 * 
 * @constant SPARSE_SUCCESS
 * Operation was a success
 * 
 * @constant SPARSE_ILLEGAL_PARAMETER
 * Operation was not completed because one or more of the arguments had an illegal
 * value.
 * 
 * @constant SPARSE_CANNOT_SET_PROPERTY
 * Matrix properties can only be set before any values are inserted into the
 * matrix.  This error occurs if that order is not repsected.
 * 
 * @constant SPARSE_SYSTEM_ERROR
 * An internal error has occured, such as non enough memory.
 */
@Generated
public final class sparse_status {
    @Generated public static final int SPARSE_SUCCESS = 0x00000000;
    @Generated public static final int SPARSE_ILLEGAL_PARAMETER = 0xFFFFFC18;
    @Generated public static final int SPARSE_CANNOT_SET_PROPERTY = 0xFFFFFC17;
    @Generated public static final int SPARSE_SYSTEM_ERROR = 0xFFFFFC16;

    @Generated
    private sparse_status() {
    }
}
