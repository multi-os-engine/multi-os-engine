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

package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class MPSDataType {
    /**
     * API-Since: 10.0
     */
    @Generated public static final int FloatBit = 0x10000000;
    /**
     * API-Since: 10.0
     */
    @Generated public static final int Float32 = 0x10000020;

    @Generated
    private MPSDataType() {
    }

    /**
     * API-Since: 10.0
     */
    @Generated public static final int Invalid = 0x00000000;
    /**
     * API-Since: 11.0
     */
    @Generated public static final int Float16 = 0x10000010;
    /**
     * signed integers
     * 
     * API-Since: 10.0
     */
    @Generated public static final int SignedBit = 0x20000000;
    /**
     * signed integers
     */
    @Generated public static final int IntBit = 0x20000000;
    /**
     * signed integers
     * 
     * API-Since: 10.0
     */
    @Generated public static final int Int8 = 0x20000008;
    /**
     * signed integers
     * 
     * API-Since: 10.0
     */
    @Generated public static final int Int16 = 0x20000010;
    /**
     * unsigned integers. Range: [0, UTYPE_MAX]
     * 
     * API-Since: 10.0
     */
    @Generated public static final int UInt8 = 0x00000008;
    /**
     * unsigned integers. Range: [0, UTYPE_MAX]
     * 
     * API-Since: 10.0
     */
    @Generated public static final int UInt16 = 0x00000010;
    /**
     * unsigned integers. Range: [0, UTYPE_MAX]
     * 
     * API-Since: 10.0
     */
    @Generated public static final int UInt32 = 0x00000020;
    /**
     * unsigned normalized (see for example Metal's unorm8 and unorm16 pixel formats). Range: [0, 1.0]
     * 
     * API-Since: 11.0
     */
    @Generated public static final int NormalizedBit = 0x40000000;
    /**
     * unsigned normalized (see for example Metal's unorm8 and unorm16 pixel formats). Range: [0, 1.0]
     * 
     * API-Since: 11.0
     */
    @Generated public static final int Unorm1 = 0x40000001;
    /**
     * unsigned normalized (see for example Metal's unorm8 and unorm16 pixel formats). Range: [0, 1.0]
     * 
     * API-Since: 11.0
     */
    @Generated public static final int Unorm8 = 0x40000008;
    /**
     * signed integers
     * 
     * API-Since: 10.0
     */
    @Generated public static final int Int32 = 0x20000020;
    /**
     * signed integers
     * 
     * API-Since: 14.1
     */
    @Generated public static final int Int64 = 0x20000040;
    /**
     * unsigned integers. Range: [0, UTYPE_MAX]
     * 
     * API-Since: 14.1
     */
    @Generated public static final int UInt64 = 0x00000040;
    /**
     * unsigned integers. Range: [0, UTYPE_MAX]
     * 
     * API-Since: 15.0
     */
    @Generated public static final int AlternateEncodingBit = 0x80000000;
    /**
     * unsigned integers. Range: [0, UTYPE_MAX]
     * 
     * API-Since: 15.0
     */
    @Generated public static final int Bool = 0x80000008;
    /**
     * API-Since: 16.2
     */
    @Generated public static final int ComplexBit = 0x01000000;
    /**
     * API-Since: 16.2
     */
    @Generated public static final int ComplexFloat32 = 0x11000040;
    /**
     * API-Since: 16.2
     */
    @Generated public static final int ComplexFloat16 = 0x11000020;
}
