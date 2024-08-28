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
 * API-Since: 8.0
 */
@Generated
public final class MTLBlendFactor {
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Zero = 0x0000000000000000L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long One = 0x0000000000000001L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long SourceColor = 0x0000000000000002L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long OneMinusSourceColor = 0x0000000000000003L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long SourceAlpha = 0x0000000000000004L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long OneMinusSourceAlpha = 0x0000000000000005L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long DestinationColor = 0x0000000000000006L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long OneMinusDestinationColor = 0x0000000000000007L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long DestinationAlpha = 0x0000000000000008L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long OneMinusDestinationAlpha = 0x0000000000000009L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long SourceAlphaSaturated = 0x000000000000000AL;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long BlendColor = 0x000000000000000BL;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long OneMinusBlendColor = 0x000000000000000CL;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long BlendAlpha = 0x000000000000000DL;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long OneMinusBlendAlpha = 0x000000000000000EL;

    @Generated
    private MTLBlendFactor() {
    }

    /**
     * API-Since: 10.11
     */
    @Generated @NUInt public static final long Source1Color = 0x000000000000000FL;
    /**
     * API-Since: 10.11
     */
    @Generated @NUInt public static final long OneMinusSource1Color = 0x0000000000000010L;
    /**
     * API-Since: 10.11
     */
    @Generated @NUInt public static final long Source1Alpha = 0x0000000000000011L;
    /**
     * API-Since: 10.11
     */
    @Generated @NUInt public static final long OneMinusSource1Alpha = 0x0000000000000012L;
}
