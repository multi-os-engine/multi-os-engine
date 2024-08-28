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
 * [@enum] MTLTextureType
 * 
 * MTLTextureType describes the dimensionality of each image, and if multiple images are arranged into an array or cube.
 * 
 * API-Since: 8.0
 */
@Generated
public final class MTLTextureType {
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Type1D = 0x0000000000000000L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Type1DArray = 0x0000000000000001L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Type2D = 0x0000000000000002L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Type2DArray = 0x0000000000000003L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Type2DMultisample = 0x0000000000000004L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long TypeCube = 0x0000000000000005L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Type3D = 0x0000000000000007L;

    @Generated
    private MTLTextureType() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long TypeCubeArray = 0x0000000000000006L;
    /**
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long TypeTextureBuffer = 0x0000000000000009L;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long Type2DMultisampleArray = 0x0000000000000008L;
}
