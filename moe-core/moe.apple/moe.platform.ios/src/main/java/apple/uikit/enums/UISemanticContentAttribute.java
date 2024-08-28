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

package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 9.0
 */
@Generated
public final class UISemanticContentAttribute {
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Unspecified = 0x0000000000000000L;
    /**
     * for playback controls such as Play/RW/FF buttons and playhead scrubbers
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Playback = 0x0000000000000001L;
    /**
     * for controls that result in some sort of directional change in the UI, e.g. a segmented control for text
     * alignment or a D-pad in a game
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Spatial = 0x0000000000000002L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long ForceLeftToRight = 0x0000000000000003L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long ForceRightToLeft = 0x0000000000000004L;

    @Generated
    private UISemanticContentAttribute() {
    }
}
