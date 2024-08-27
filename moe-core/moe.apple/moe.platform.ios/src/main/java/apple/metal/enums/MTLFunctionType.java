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
 * [@enum] MTLFunctionType
 * 
 * An identifier for a top-level Metal function.
 * 
 * Each location in the API where a program is used requires a function written for that specific usage.
 * 
 * [@constant] MTLFunctionTypeVertex
 * A vertex shader, usable for a MTLRenderPipelineState.
 * 
 * [@constant] MTLFunctionTypeFragment
 * A fragment shader, usable for a MTLRenderPipelineState.
 * 
 * [@constant] MTLFunctionTypeKernel
 * A compute kernel, usable to create a MTLComputePipelineState.
 * 
 * API-Since: 8.0
 */
@Generated
public final class MTLFunctionType {
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Vertex = 0x0000000000000001L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Fragment = 0x0000000000000002L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Kernel = 0x0000000000000003L;

    @Generated
    private MTLFunctionType() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long Visible = 0x0000000000000005L;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long Intersection = 0x0000000000000006L;
    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long Mesh = 0x0000000000000007L;
    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long Object = 0x0000000000000008L;
}
