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
 * [@enum] MTLArgumentType
 * 
 * The type for an input to a MTLRenderPipelineState or a MTLComputePipelineState
 * 
 * [@constant] MTLArgumentTypeBuffer
 * This input is a MTLBuffer
 * 
 * [@constant] MTLArgumentTypeThreadgroupMemory
 * This input is a pointer to the threadgroup memory.
 * 
 * [@constant] MTLArgumentTypeTexture
 * This input is a MTLTexture.
 * 
 * [@constant] MTLArgumentTypeSampler
 * This input is a sampler.
 * 
 * API-Since: 8.0
 * Deprecated-Since: 16.0
 */
@Deprecated
@Generated
public final class MTLArgumentType {
    /**
     * API-Since: 8.0
     * Deprecated-Since: 16.0
     */
    @Deprecated @Generated @NUInt public static final long Buffer = 0x0000000000000000L;
    /**
     * API-Since: 8.0
     * Deprecated-Since: 16.0
     */
    @Deprecated @Generated @NUInt public static final long ThreadgroupMemory = 0x0000000000000001L;
    /**
     * API-Since: 8.0
     * Deprecated-Since: 16.0
     */
    @Deprecated @Generated @NUInt public static final long Texture = 0x0000000000000002L;
    /**
     * API-Since: 8.0
     * Deprecated-Since: 16.0
     */
    @Deprecated @Generated @NUInt public static final long Sampler = 0x0000000000000003L;

    @Generated
    private MTLArgumentType() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long ImageblockData = 0x0000000000000010L;
    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Imageblock = 0x0000000000000011L;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long VisibleFunctionTable = 0x0000000000000018L;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long PrimitiveAccelerationStructure = 0x0000000000000019L;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long InstanceAccelerationStructure = 0x000000000000001AL;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long IntersectionFunctionTable = 0x000000000000001BL;
}
