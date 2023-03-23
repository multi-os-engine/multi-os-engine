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

package apple.spritekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Adjust the rotation of the tile definition image, in 90 degree increments.
 * 
 * API-Since: 10.0
 */
@Generated
public final class SKTileDefinitionRotation {
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Rotation0 = 0x0000000000000000L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Rotation90 = 0x0000000000000001L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Rotation180 = 0x0000000000000002L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Rotation270 = 0x0000000000000003L;

    @Generated
    private SKTileDefinitionRotation() {
    }
}
