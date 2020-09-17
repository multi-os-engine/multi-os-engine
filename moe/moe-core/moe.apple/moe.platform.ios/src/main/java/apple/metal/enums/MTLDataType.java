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

@Generated
public final class MTLDataType {
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    @Generated @NUInt public static final long Struct = 0x0000000000000001L;
    @Generated @NUInt public static final long Array = 0x0000000000000002L;
    @Generated @NUInt public static final long Float = 0x0000000000000003L;
    @Generated @NUInt public static final long Float2 = 0x0000000000000004L;
    @Generated @NUInt public static final long Float3 = 0x0000000000000005L;
    @Generated @NUInt public static final long Float4 = 0x0000000000000006L;
    @Generated @NUInt public static final long Float2x2 = 0x0000000000000007L;
    @Generated @NUInt public static final long Float2x3 = 0x0000000000000008L;
    @Generated @NUInt public static final long Float2x4 = 0x0000000000000009L;
    @Generated @NUInt public static final long Float3x2 = 0x000000000000000AL;
    @Generated @NUInt public static final long Float3x3 = 0x000000000000000BL;
    @Generated @NUInt public static final long Float3x4 = 0x000000000000000CL;
    @Generated @NUInt public static final long Float4x2 = 0x000000000000000DL;
    @Generated @NUInt public static final long Float4x3 = 0x000000000000000EL;
    @Generated @NUInt public static final long Float4x4 = 0x000000000000000FL;
    @Generated @NUInt public static final long Half = 0x0000000000000010L;
    @Generated @NUInt public static final long Half2 = 0x0000000000000011L;
    @Generated @NUInt public static final long Half3 = 0x0000000000000012L;
    @Generated @NUInt public static final long Half4 = 0x0000000000000013L;
    @Generated @NUInt public static final long Half2x2 = 0x0000000000000014L;
    @Generated @NUInt public static final long Half2x3 = 0x0000000000000015L;
    @Generated @NUInt public static final long Half2x4 = 0x0000000000000016L;
    @Generated @NUInt public static final long Half3x2 = 0x0000000000000017L;
    @Generated @NUInt public static final long Half3x3 = 0x0000000000000018L;
    @Generated @NUInt public static final long Half3x4 = 0x0000000000000019L;
    @Generated @NUInt public static final long Half4x2 = 0x000000000000001AL;
    @Generated @NUInt public static final long Half4x3 = 0x000000000000001BL;
    @Generated @NUInt public static final long Half4x4 = 0x000000000000001CL;
    @Generated @NUInt public static final long Int = 0x000000000000001DL;
    @Generated @NUInt public static final long Int2 = 0x000000000000001EL;
    @Generated @NUInt public static final long Int3 = 0x000000000000001FL;
    @Generated @NUInt public static final long Int4 = 0x0000000000000020L;
    @Generated @NUInt public static final long UInt = 0x0000000000000021L;
    @Generated @NUInt public static final long UInt2 = 0x0000000000000022L;
    @Generated @NUInt public static final long UInt3 = 0x0000000000000023L;
    @Generated @NUInt public static final long UInt4 = 0x0000000000000024L;
    @Generated @NUInt public static final long Short = 0x0000000000000025L;
    @Generated @NUInt public static final long Short2 = 0x0000000000000026L;
    @Generated @NUInt public static final long Short3 = 0x0000000000000027L;
    @Generated @NUInt public static final long Short4 = 0x0000000000000028L;
    @Generated @NUInt public static final long UShort = 0x0000000000000029L;
    @Generated @NUInt public static final long UShort2 = 0x000000000000002AL;
    @Generated @NUInt public static final long UShort3 = 0x000000000000002BL;
    @Generated @NUInt public static final long UShort4 = 0x000000000000002CL;
    @Generated @NUInt public static final long Char = 0x000000000000002DL;
    @Generated @NUInt public static final long Char2 = 0x000000000000002EL;
    @Generated @NUInt public static final long Char3 = 0x000000000000002FL;
    @Generated @NUInt public static final long Char4 = 0x0000000000000030L;
    @Generated @NUInt public static final long UChar = 0x0000000000000031L;
    @Generated @NUInt public static final long UChar2 = 0x0000000000000032L;
    @Generated @NUInt public static final long UChar3 = 0x0000000000000033L;
    @Generated @NUInt public static final long UChar4 = 0x0000000000000034L;
    @Generated @NUInt public static final long Bool = 0x0000000000000035L;
    @Generated @NUInt public static final long Bool2 = 0x0000000000000036L;
    @Generated @NUInt public static final long Bool3 = 0x0000000000000037L;
    @Generated @NUInt public static final long Bool4 = 0x0000000000000038L;

    @Generated
    private MTLDataType() {
    }

    @Generated @NUInt public static final long Texture = 0x000000000000003AL;
    @Generated @NUInt public static final long Sampler = 0x000000000000003BL;
    @Generated @NUInt public static final long Pointer = 0x000000000000003CL;
    @Generated @NUInt public static final long R8Unorm = 0x000000000000003EL;
    @Generated @NUInt public static final long R8Snorm = 0x000000000000003FL;
    @Generated @NUInt public static final long R16Unorm = 0x0000000000000040L;
    @Generated @NUInt public static final long R16Snorm = 0x0000000000000041L;
    @Generated @NUInt public static final long RG8Unorm = 0x0000000000000042L;
    @Generated @NUInt public static final long RG8Snorm = 0x0000000000000043L;
    @Generated @NUInt public static final long RG16Unorm = 0x0000000000000044L;
    @Generated @NUInt public static final long RG16Snorm = 0x0000000000000045L;
    @Generated @NUInt public static final long RGBA8Unorm = 0x0000000000000046L;
    @Generated @NUInt public static final long RGBA8Unorm_sRGB = 0x0000000000000047L;
    @Generated @NUInt public static final long RGBA8Snorm = 0x0000000000000048L;
    @Generated @NUInt public static final long RGBA16Unorm = 0x0000000000000049L;
    @Generated @NUInt public static final long RGBA16Snorm = 0x000000000000004AL;
    @Generated @NUInt public static final long RGB10A2Unorm = 0x000000000000004BL;
    @Generated @NUInt public static final long RG11B10Float = 0x000000000000004CL;
    @Generated @NUInt public static final long RGB9E5Float = 0x000000000000004DL;
    @Generated @NUInt public static final long RenderPipeline = 0x000000000000004EL;
    @Generated @NUInt public static final long ComputePipeline = 0x000000000000004FL;
    @Generated @NUInt public static final long IndirectCommandBuffer = 0x0000000000000050L;
    @Generated @NUInt public static final long VisibleFunctionTable = 0x0000000000000073L;
    @Generated @NUInt public static final long IntersectionFunctionTable = 0x0000000000000074L;
    @Generated @NUInt public static final long PrimitiveAccelerationStructure = 0x0000000000000075L;
    @Generated @NUInt public static final long InstanceAccelerationStructure = 0x0000000000000076L;
}
