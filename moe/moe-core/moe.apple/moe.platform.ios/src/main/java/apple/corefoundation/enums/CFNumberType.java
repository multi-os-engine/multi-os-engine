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

package apple.corefoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class CFNumberType {
    /**
     * Fixed-width types
     */
    @Generated @NInt public static final long SInt8Type = 0x0000000000000001L;
    /**
     * Fixed-width types
     */
    @Generated @NInt public static final long SInt16Type = 0x0000000000000002L;
    /**
     * Fixed-width types
     */
    @Generated @NInt public static final long SInt32Type = 0x0000000000000003L;
    /**
     * Fixed-width types
     */
    @Generated @NInt public static final long SInt64Type = 0x0000000000000004L;
    /**
     * Fixed-width types
     */
    @Generated @NInt public static final long Float32Type = 0x0000000000000005L;
    /**
     * 64-bit IEEE 754
     */
    @Generated @NInt public static final long Float64Type = 0x0000000000000006L;
    /**
     * Basic C types
     */
    @Generated @NInt public static final long CharType = 0x0000000000000007L;
    /**
     * Basic C types
     */
    @Generated @NInt public static final long ShortType = 0x0000000000000008L;
    /**
     * Basic C types
     */
    @Generated @NInt public static final long IntType = 0x0000000000000009L;
    /**
     * Basic C types
     */
    @Generated @NInt public static final long LongType = 0x000000000000000AL;
    /**
     * Basic C types
     */
    @Generated @NInt public static final long LongLongType = 0x000000000000000BL;
    /**
     * Basic C types
     */
    @Generated @NInt public static final long FloatType = 0x000000000000000CL;
    /**
     * Basic C types
     */
    @Generated @NInt public static final long DoubleType = 0x000000000000000DL;
    /**
     * Other
     */
    @Generated @NInt public static final long CFIndexType = 0x000000000000000EL;
    /**
     * Other
     * 
     * API-Since: 2.0
     */
    @Generated @NInt public static final long NSIntegerType = 0x000000000000000FL;
    /**
     * Other
     * 
     * API-Since: 2.0
     */
    @Generated @NInt public static final long CGFloatType = 0x0000000000000010L;
    /**
     * Other
     */
    @Generated @NInt public static final long MaxType = 0x0000000000000010L;

    @Generated
    private CFNumberType() {
    }
}
