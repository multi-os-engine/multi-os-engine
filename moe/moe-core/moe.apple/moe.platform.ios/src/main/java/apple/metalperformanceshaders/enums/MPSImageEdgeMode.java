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

package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MPSImageEdgeMode {
    /**
     * Out of bound pixels are (0,0,0,1) for image with pixel format without alpha channel
     * and (0,0,0,0) for image with pixel format that has an alpha channel
     * 
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long Zero = 0x0000000000000000L;
    /**
     * Out of bound pixels are clamped to nearest edge pixel
     * 
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long Clamp = 0x0000000000000001L;

    @Generated
    private MPSImageEdgeMode() {
    }

    /**
     * Out of bound pixels are mirrored wrt. the nearest edge pixel center - ie. the edge of the image is not repeated.
     * NOTE: The only filter that currently supports this mode is @ref MPSNNPad - using this with other filters results
     * in undefined behavior.
     * 
     * API-Since: 12.1
     */
    @Generated @NUInt public static final long Mirror = 0x0000000000000002L;
    /**
     * Out of bound pixels are mirrored wrt. the nearest edge pixel nearest border - ie. the edge of the image is
     * repeated.
     * NOTE: The only filter that currently supports this mode is @ref MPSNNPad - using this with other filters results
     * in undefined behavior.
     * 
     * API-Since: 12.1
     */
    @Generated @NUInt public static final long MirrorWithEdge = 0x0000000000000003L;
    /**
     * Out of bound pixels are filled with a constant value defined by the filter.
     * NOTE: The only filter that currently supports this mode is @ref MPSNNPad - using this with other filters results
     * in undefined behavior.
     * 
     * API-Since: 12.1
     */
    @Generated @NUInt public static final long Constant = 0x0000000000000004L;
}
