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
 * An enumeration of the different data types in Metal.
 * 
 * API-Since: 8.0
 */
@Generated
public final class MTLDataType {
    /**
     * Represents no data type.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Represents a struct data type.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Struct = 0x0000000000000001L;
    /**
     * Represents an array data type.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Array = 0x0000000000000002L;
    /**
     * Represents a data type consisting of a single floating-point value.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Float = 0x0000000000000003L;
    /**
     * Represents a data type consisting of a vector of two floating-point values.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Float2 = 0x0000000000000004L;
    /**
     * Represents a data type consisting of a vector of three floating-point values.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Float3 = 0x0000000000000005L;
    /**
     * Represents a data type consisting of a vector of four floating-point values.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Float4 = 0x0000000000000006L;
    /**
     * Represents a data type consisting of a 2x2 floating-point matrix.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Float2x2 = 0x0000000000000007L;
    /**
     * Represents a data type consisting of a 2x3 floating-point matrix.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Float2x3 = 0x0000000000000008L;
    /**
     * Represents a data type consisting of a 2x4 floating-point matrix.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Float2x4 = 0x0000000000000009L;
    /**
     * Represents a data type consisting of a 3x2 floating-point matrix.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Float3x2 = 0x000000000000000AL;
    /**
     * Represents a data type consisting of a 3x3 floating-point matrix.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Float3x3 = 0x000000000000000BL;
    /**
     * Represents a data type consisting of a 3x4 floating-point matrix.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Float3x4 = 0x000000000000000CL;
    /**
     * Represents a data type consisting of a 4x2 floating-point matrix.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Float4x2 = 0x000000000000000DL;
    /**
     * Represents a data type consisting of a 4x3 floating-point matrix.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Float4x3 = 0x000000000000000EL;
    /**
     * Represents a data type consisting of a 4x4 floating-point matrix.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Float4x4 = 0x000000000000000FL;
    /**
     * Represents a data type consisting of a half-precision floating-point value.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Half = 0x0000000000000010L;
    /**
     * Represents a data type consisting of a vector of two half-precision floating-point values.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Half2 = 0x0000000000000011L;
    /**
     * Represents a data type consisting of a vector of three half-precision floating-point values.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Half3 = 0x0000000000000012L;
    /**
     * Represents a data type consisting of a vector of four half-precision floating-point values.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Half4 = 0x0000000000000013L;
    /**
     * Represents a data type consisting of a 2x2 half-precision floating-point matrix.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Half2x2 = 0x0000000000000014L;
    /**
     * Represents a data type consisting of a 2x3 half-precision floating-point matrix.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Half2x3 = 0x0000000000000015L;
    /**
     * Represents a data type consisting of a 2x4 half-precision floating-point matrix.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Half2x4 = 0x0000000000000016L;
    /**
     * Represents a data type consisting of a 3x2 half-precision floating-point matrix.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Half3x2 = 0x0000000000000017L;
    /**
     * Represents a data type consisting of a 3x3 half-precision floating-point matrix.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Half3x3 = 0x0000000000000018L;
    /**
     * Represents a data type consisting of a 3x4 half-precision floating-point matrix.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Half3x4 = 0x0000000000000019L;
    /**
     * Represents a data type consisting of a 4x2 half-precision floating-point matrix.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Half4x2 = 0x000000000000001AL;
    /**
     * Represents a data type consisting of a 4x3 half-precision floating-point matrix.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Half4x3 = 0x000000000000001BL;
    /**
     * Represents a data type consisting of a 4x4 half-precision floating-point matrix.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Half4x4 = 0x000000000000001CL;
    /**
     * Represents a data type consisting of a single signed integer value.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Int = 0x000000000000001DL;
    /**
     * Represents a data type consisting of a vector of two signed integer values.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Int2 = 0x000000000000001EL;
    /**
     * Represents a data type consisting of a vector of three signed integer values.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Int3 = 0x000000000000001FL;
    /**
     * Represents a data type consisting of a vector of four signed integer values.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Int4 = 0x0000000000000020L;
    /**
     * Represents a data type consisting of a single unsigned integer value.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long UInt = 0x0000000000000021L;
    /**
     * Represents a data type consisting of a vector of two unsigned integer values.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long UInt2 = 0x0000000000000022L;
    /**
     * Represents a data type consisting of a vector of three unsigned integer values.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long UInt3 = 0x0000000000000023L;
    /**
     * Represents a data type consisting of a vector of four unsigned integer values.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long UInt4 = 0x0000000000000024L;
    /**
     * Represents a data type consisting of a single 16-bit signed integer value.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Short = 0x0000000000000025L;
    /**
     * Represents a data type consisting of a vector of two 16-bit signed integer values.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Short2 = 0x0000000000000026L;
    /**
     * Represents a data type consisting of a vector of three 16-bit signed integer values.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Short3 = 0x0000000000000027L;
    /**
     * Represents a data type consisting of a vector of three 16-bit signed integer values.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Short4 = 0x0000000000000028L;
    /**
     * Represents a data type consisting of a single 16-bit unsigned integer value.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long UShort = 0x0000000000000029L;
    /**
     * Represents a data type consisting of a vector of two 16-bit unsigned integer values.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long UShort2 = 0x000000000000002AL;
    /**
     * Represents a data type consisting of a vector of three 16-bit unsigned integer values.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long UShort3 = 0x000000000000002BL;
    /**
     * Represents a data type consisting of a vector of four 16-bit unsigned integer values.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long UShort4 = 0x000000000000002CL;
    /**
     * Represents a data type consisting of a single signed character value.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Char = 0x000000000000002DL;
    /**
     * Represents a data type consisting of a vector of two signed character values.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Char2 = 0x000000000000002EL;
    /**
     * Represents a data type consisting of a vector of three signed character values.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Char3 = 0x000000000000002FL;
    /**
     * Represents a data type consisting of a vector of four signed character values.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Char4 = 0x0000000000000030L;
    /**
     * Represents a data type consisting of a single unsigned character value.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long UChar = 0x0000000000000031L;
    /**
     * Represents a data type consisting of a vector of two unsigned character values.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long UChar2 = 0x0000000000000032L;
    /**
     * Represents a data type consisting of a vector of three unsigned character values.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long UChar3 = 0x0000000000000033L;
    /**
     * Represents a data type consisting of a vector of four unsigned character values.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long UChar4 = 0x0000000000000034L;
    /**
     * Represents a data type consisting of a single boolean value.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Bool = 0x0000000000000035L;
    /**
     * Represents a data type consisting of a vector of two boolean values.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Bool2 = 0x0000000000000036L;
    /**
     * Represents a data type consisting of a vector of three boolean values.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Bool3 = 0x0000000000000037L;
    /**
     * Represents a data type consisting of a vector of four boolean values.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Bool4 = 0x0000000000000038L;

    @Generated
    private MTLDataType() {
    }

    /**
     * Represents a data type corresponding to a texture object.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Texture = 0x000000000000003AL;
    /**
     * Represents a data type corresponding to a sampler state object.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Sampler = 0x000000000000003BL;
    /**
     * Represents a data type corresponding to a pointer.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Pointer = 0x000000000000003CL;
    /**
     * Represents an image block data type consisting of an unsigned 8-bit red channel normalized to the [0-1] range.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long R8Unorm = 0x000000000000003EL;
    /**
     * Represents an image block data type consisting of an signed 8-bit red channel normalized to the [0-1] range.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long R8Snorm = 0x000000000000003FL;
    /**
     * Represents an image block data type consisting of an unsigned 16-bit red channel normalized to the [0-1] range.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long R16Unorm = 0x0000000000000040L;
    /**
     * Represents an image block data type consisting of a signed 16-bit red channel normalized to the [0-1] range.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long R16Snorm = 0x0000000000000041L;
    /**
     * Represents an image block data type consisting of an unsigned 8-bit red channel and a unsigned 8-bit green
     * channel, both normalized to the [0-1] range.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long RG8Unorm = 0x0000000000000042L;
    /**
     * Represents an image block data type consisting of a signed 8-bit red channel and a signed 8-bit green channel,
     * both normalized to the [0-1] range.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long RG8Snorm = 0x0000000000000043L;
    /**
     * Represents an image block data type consisting of an unsigned 16-bit red channel and an unsigned 16-bit green
     * channel, both normalized to the [0-1] range.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long RG16Unorm = 0x0000000000000044L;
    /**
     * Represents an image block data type consisting of a signed 16-bit red channel and a signed 16-bit green channel,
     * both normalized to the [0-1] range.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long RG16Snorm = 0x0000000000000045L;
    /**
     * Represents an image block data type consisting of four unsigned 8-bit channels normalized to the [0-1] range.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long RGBA8Unorm = 0x0000000000000046L;
    /**
     * Represents an image block data type consisting of four unsigned 8-bit channels normalized to the [0-1] range and
     * subject to gamma-correction.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long RGBA8Unorm_sRGB = 0x0000000000000047L;
    /**
     * Represents an image block data type consisting of four signed 8-bit channels normalized to the [0-1] range.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long RGBA8Snorm = 0x0000000000000048L;
    /**
     * Represents an image block data type consisting of four unsigned 16-bit channels normalized to the [0-1] range.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long RGBA16Unorm = 0x0000000000000049L;
    /**
     * Represents an image block data type consisting of four signed 16-bit channels normalized to the [0-1] range.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long RGBA16Snorm = 0x000000000000004AL;
    /**
     * Represents an image block data type consisting of three unsigned 10-bit channels and one 2-bit unsigned alpha
     * channel, all normalized to the [0-1] range.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long RGB10A2Unorm = 0x000000000000004BL;
    /**
     * Represents an image block data type consisting of two 11-bit floating-point channels, and one 10-bit
     * floating-point blue channel.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long RG11B10Float = 0x000000000000004CL;
    /**
     * Represents an image block data type consisting of three 9-bit floating-point channels, and one 5-bit
     * floating-point exponent.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long RGB9E5Float = 0x000000000000004DL;
    /**
     * Represents a data type corresponding to a render pipeline state object.
     * 
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long RenderPipeline = 0x000000000000004EL;
    /**
     * Represents a data type corresponding to a compute pipeline state object.
     * 
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long ComputePipeline = 0x000000000000004FL;
    /**
     * Represents a data type corresponding to an indirect command buffer object.
     * 
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long IndirectCommandBuffer = 0x0000000000000050L;
    /**
     * Represents a data type corresponding to a visible function table object.
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long VisibleFunctionTable = 0x0000000000000073L;
    /**
     * Represents a data type corresponding to an intersection function table object.
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long IntersectionFunctionTable = 0x0000000000000074L;
    /**
     * Represents a data type corresponding to a primitive acceleration structure.
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long PrimitiveAccelerationStructure = 0x0000000000000075L;
    /**
     * Represents a data type corresponding to an instance acceleration structure.
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long InstanceAccelerationStructure = 0x0000000000000076L;
    /**
     * Represents a data type consisting of a signed long integer value.
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long Long = 0x0000000000000051L;
    /**
     * Represents a data type consisting of a vector of two signed long integer values.
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long Long2 = 0x0000000000000052L;
    /**
     * Represents a data type consisting of a vector of three signed long integer values.
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long Long3 = 0x0000000000000053L;
    /**
     * Represents a data type consisting of a vector of four signed long integer values.
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long Long4 = 0x0000000000000054L;
    /**
     * Represents a data type consisting of an unsigned long integer value.
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long ULong = 0x0000000000000055L;
    /**
     * Represents a data type consisting of a vector two unsigned long integer values.
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long ULong2 = 0x0000000000000056L;
    /**
     * Represents a data type consisting of a vector three unsigned long integer values.
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long ULong3 = 0x0000000000000057L;
    /**
     * Represents a data type consisting of a vector four unsigned long integer values.
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long ULong4 = 0x0000000000000058L;
    /**
     * Represents a data type consisting of a single BFloat value.
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long BFloat = 0x0000000000000079L;
    /**
     * Represents a data type consisting of a vector two BFloat values.
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long BFloat2 = 0x000000000000007AL;
    /**
     * Represents a data type consisting of a vector three BFloat values.
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long BFloat3 = 0x000000000000007BL;
    /**
     * Represents a data type consisting of a vector four BFloat values.
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long BFloat4 = 0x000000000000007CL;
    /**
     * Represents a data type corresponding to a depth-stencil state object.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long DepthStencilState = 0x000000000000008BL;
    /**
     * Represents a data type corresponding to a machine learning tensor.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long Tensor = 0x000000000000008CL;
}
