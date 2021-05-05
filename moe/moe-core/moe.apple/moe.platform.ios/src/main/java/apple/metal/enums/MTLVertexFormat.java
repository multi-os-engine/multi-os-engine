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

package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] MTLVertexFormat
 * 
 * specifies how the vertex attribute data is laid out in memory.
 */
@Generated
public final class MTLVertexFormat {
    @Generated @NUInt public static final long Invalid = 0x0000000000000000L;
    @Generated @NUInt public static final long UChar2 = 0x0000000000000001L;
    @Generated @NUInt public static final long UChar3 = 0x0000000000000002L;
    @Generated @NUInt public static final long UChar4 = 0x0000000000000003L;
    @Generated @NUInt public static final long Char2 = 0x0000000000000004L;
    @Generated @NUInt public static final long Char3 = 0x0000000000000005L;
    @Generated @NUInt public static final long Char4 = 0x0000000000000006L;
    @Generated @NUInt public static final long UChar2Normalized = 0x0000000000000007L;
    @Generated @NUInt public static final long UChar3Normalized = 0x0000000000000008L;
    @Generated @NUInt public static final long UChar4Normalized = 0x0000000000000009L;
    @Generated @NUInt public static final long Char2Normalized = 0x000000000000000AL;
    @Generated @NUInt public static final long Char3Normalized = 0x000000000000000BL;
    @Generated @NUInt public static final long Char4Normalized = 0x000000000000000CL;
    @Generated @NUInt public static final long UShort2 = 0x000000000000000DL;
    @Generated @NUInt public static final long UShort3 = 0x000000000000000EL;
    @Generated @NUInt public static final long UShort4 = 0x000000000000000FL;
    @Generated @NUInt public static final long Short2 = 0x0000000000000010L;
    @Generated @NUInt public static final long Short3 = 0x0000000000000011L;
    @Generated @NUInt public static final long Short4 = 0x0000000000000012L;
    @Generated @NUInt public static final long UShort2Normalized = 0x0000000000000013L;
    @Generated @NUInt public static final long UShort3Normalized = 0x0000000000000014L;
    @Generated @NUInt public static final long UShort4Normalized = 0x0000000000000015L;
    @Generated @NUInt public static final long Short2Normalized = 0x0000000000000016L;
    @Generated @NUInt public static final long Short3Normalized = 0x0000000000000017L;
    @Generated @NUInt public static final long Short4Normalized = 0x0000000000000018L;
    @Generated @NUInt public static final long Half2 = 0x0000000000000019L;
    @Generated @NUInt public static final long Half3 = 0x000000000000001AL;
    @Generated @NUInt public static final long Half4 = 0x000000000000001BL;
    @Generated @NUInt public static final long Float = 0x000000000000001CL;
    @Generated @NUInt public static final long Float2 = 0x000000000000001DL;
    @Generated @NUInt public static final long Float3 = 0x000000000000001EL;
    @Generated @NUInt public static final long Float4 = 0x000000000000001FL;
    @Generated @NUInt public static final long Int = 0x0000000000000020L;
    @Generated @NUInt public static final long Int2 = 0x0000000000000021L;
    @Generated @NUInt public static final long Int3 = 0x0000000000000022L;
    @Generated @NUInt public static final long Int4 = 0x0000000000000023L;
    @Generated @NUInt public static final long UInt = 0x0000000000000024L;
    @Generated @NUInt public static final long UInt2 = 0x0000000000000025L;
    @Generated @NUInt public static final long UInt3 = 0x0000000000000026L;
    @Generated @NUInt public static final long UInt4 = 0x0000000000000027L;
    @Generated @NUInt public static final long Int1010102Normalized = 0x0000000000000028L;
    @Generated @NUInt public static final long UInt1010102Normalized = 0x0000000000000029L;

    @Generated
    private MTLVertexFormat() {
    }

    @Generated @NUInt public static final long UChar4Normalized_BGRA = 0x000000000000002AL;
    @Generated @NUInt public static final long UChar = 0x000000000000002DL;
    @Generated @NUInt public static final long Char = 0x000000000000002EL;
    @Generated @NUInt public static final long UCharNormalized = 0x000000000000002FL;
    @Generated @NUInt public static final long CharNormalized = 0x0000000000000030L;
    @Generated @NUInt public static final long UShort = 0x0000000000000031L;
    @Generated @NUInt public static final long Short = 0x0000000000000032L;
    @Generated @NUInt public static final long UShortNormalized = 0x0000000000000033L;
    @Generated @NUInt public static final long ShortNormalized = 0x0000000000000034L;
    @Generated @NUInt public static final long Half = 0x0000000000000035L;
}
