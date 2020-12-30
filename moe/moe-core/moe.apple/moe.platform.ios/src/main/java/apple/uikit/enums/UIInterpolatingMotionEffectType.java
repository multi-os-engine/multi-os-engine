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
 * ---------------------------------------------------------------------
 */
@Generated
public final class UIInterpolatingMotionEffectType {
    /**
     * Tracks the device being tilted left/right relative to the viewer. The minimum
     * relative values maps to the device being tilted all the way to the left, the
     * maximum to the right. 
     */
    @Generated @NInt public static final long HorizontalAxis = 0x0000000000000000L;
    /**
     * Tracks the device being tilted up/down relative to the viewer. The minimum
     * relative values maps to the device being tilted all the way down, the maximum
     * all the way up. 
     */
    @Generated @NInt public static final long VerticalAxis = 0x0000000000000001L;

    @Generated
    private UIInterpolatingMotionEffectType() {
    }
}
