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

package apple.modelio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] MDLVertexFormat
 * <p>
 * Describes the format of a an attribute in a vertex buffer
 * <p>
 * Designed to be very similar to MTLVertexDescriptor to ease the
 * translation from one to the other. Values are chosen such that
 * packed types would all be less than 0x1000 and the bottom 5 bits
 * can be used to determine the number of channels/components in the
 * format.
 */
@Generated
public final class MDLVertexFormat {
    @Generated @NUInt public static final long Invalid = 0x0000000000000000L;
    @Generated @NUInt public static final long PackedBit = 0x0000000000001000L;
    @Generated @NUInt public static final long UCharBits = 0x0000000000010000L;
    @Generated @NUInt public static final long CharBits = 0x0000000000020000L;
    @Generated @NUInt public static final long UCharNormalizedBits = 0x0000000000030000L;
    @Generated @NUInt public static final long CharNormalizedBits = 0x0000000000040000L;
    @Generated @NUInt public static final long UShortBits = 0x0000000000050000L;
    @Generated @NUInt public static final long ShortBits = 0x0000000000060000L;
    @Generated @NUInt public static final long UShortNormalizedBits = 0x0000000000070000L;
    @Generated @NUInt public static final long ShortNormalizedBits = 0x0000000000080000L;
    @Generated @NUInt public static final long UIntBits = 0x0000000000090000L;
    @Generated @NUInt public static final long IntBits = 0x00000000000A0000L;
    @Generated @NUInt public static final long HalfBits = 0x00000000000B0000L;
    @Generated @NUInt public static final long FloatBits = 0x00000000000C0000L;
    @Generated @NUInt public static final long UChar = 0x0000000000010001L;
    @Generated @NUInt public static final long UChar2 = 0x0000000000010002L;
    @Generated @NUInt public static final long UChar3 = 0x0000000000010003L;
    @Generated @NUInt public static final long UChar4 = 0x0000000000010004L;
    @Generated @NUInt public static final long Char = 0x0000000000020001L;
    @Generated @NUInt public static final long Char2 = 0x0000000000020002L;
    @Generated @NUInt public static final long Char3 = 0x0000000000020003L;
    @Generated @NUInt public static final long Char4 = 0x0000000000020004L;
    @Generated @NUInt public static final long UCharNormalized = 0x0000000000030001L;
    @Generated @NUInt public static final long UChar2Normalized = 0x0000000000030002L;
    @Generated @NUInt public static final long UChar3Normalized = 0x0000000000030003L;
    @Generated @NUInt public static final long UChar4Normalized = 0x0000000000030004L;
    @Generated @NUInt public static final long CharNormalized = 0x0000000000040001L;
    @Generated @NUInt public static final long Char2Normalized = 0x0000000000040002L;
    @Generated @NUInt public static final long Char3Normalized = 0x0000000000040003L;
    @Generated @NUInt public static final long Char4Normalized = 0x0000000000040004L;
    @Generated @NUInt public static final long UShort = 0x0000000000050001L;
    @Generated @NUInt public static final long UShort2 = 0x0000000000050002L;
    @Generated @NUInt public static final long UShort3 = 0x0000000000050003L;
    @Generated @NUInt public static final long UShort4 = 0x0000000000050004L;
    @Generated @NUInt public static final long Short = 0x0000000000060001L;
    @Generated @NUInt public static final long Short2 = 0x0000000000060002L;
    @Generated @NUInt public static final long Short3 = 0x0000000000060003L;
    @Generated @NUInt public static final long Short4 = 0x0000000000060004L;
    @Generated @NUInt public static final long UShortNormalized = 0x0000000000070001L;
    @Generated @NUInt public static final long UShort2Normalized = 0x0000000000070002L;
    @Generated @NUInt public static final long UShort3Normalized = 0x0000000000070003L;
    @Generated @NUInt public static final long UShort4Normalized = 0x0000000000070004L;
    @Generated @NUInt public static final long ShortNormalized = 0x0000000000080001L;
    @Generated @NUInt public static final long Short2Normalized = 0x0000000000080002L;
    @Generated @NUInt public static final long Short3Normalized = 0x0000000000080003L;
    @Generated @NUInt public static final long Short4Normalized = 0x0000000000080004L;
    @Generated @NUInt public static final long UInt = 0x0000000000090001L;
    @Generated @NUInt public static final long UInt2 = 0x0000000000090002L;
    @Generated @NUInt public static final long UInt3 = 0x0000000000090003L;
    @Generated @NUInt public static final long UInt4 = 0x0000000000090004L;
    @Generated @NUInt public static final long Int = 0x00000000000A0001L;
    @Generated @NUInt public static final long Int2 = 0x00000000000A0002L;
    @Generated @NUInt public static final long Int3 = 0x00000000000A0003L;
    @Generated @NUInt public static final long Int4 = 0x00000000000A0004L;
    @Generated @NUInt public static final long Half = 0x00000000000B0001L;
    @Generated @NUInt public static final long Half2 = 0x00000000000B0002L;
    @Generated @NUInt public static final long Half3 = 0x00000000000B0003L;
    @Generated @NUInt public static final long Half4 = 0x00000000000B0004L;
    @Generated @NUInt public static final long Float = 0x00000000000C0001L;
    @Generated @NUInt public static final long Float2 = 0x00000000000C0002L;
    @Generated @NUInt public static final long Float3 = 0x00000000000C0003L;
    @Generated @NUInt public static final long Float4 = 0x00000000000C0004L;
    @Generated @NUInt public static final long Int1010102Normalized = 0x00000000000A1004L;
    @Generated @NUInt public static final long UInt1010102Normalized = 0x0000000000091004L;

    @Generated
    private MDLVertexFormat() {
    }
}
