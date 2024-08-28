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

package apple.quartzcore.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Bit definitions for `edgeAntialiasingMask' property.
 */
@Generated
public final class CAEdgeAntialiasingMask {
    /**
     * Minimum X edge.
     */
    @Generated public static final int LeftEdge = 0x00000001;
    /**
     * Maximum X edge.
     */
    @Generated public static final int RightEdge = 0x00000002;
    /**
     * Minimum Y edge.
     */
    @Generated public static final int BottomEdge = 0x00000004;
    /**
     * Maximum Y edge.
     */
    @Generated public static final int TopEdge = 0x00000008;

    @Generated
    private CAEdgeAntialiasingMask() {
    }
}
