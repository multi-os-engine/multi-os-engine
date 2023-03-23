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
 * Generic render stage enum
 * 
 * Can also be used for points at which a fence may be waited on or signaled.
 * [@constant] MTLRenderStageVertex All vertex work prior to rasterization has completed.
 * [@constant] MTLRenderStageFragment All rendering work has completed.
 * 
 * API-Since: 10.0
 */
@Generated
public final class MTLRenderStages {
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Vertex = 0x0000000000000001L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Fragment = 0x0000000000000002L;

    @Generated
    private MTLRenderStages() {
    }

    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long Tile = 0x0000000000000004L;
    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long Object = 0x0000000000000008L;
    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long Mesh = 0x0000000000000010L;
}
