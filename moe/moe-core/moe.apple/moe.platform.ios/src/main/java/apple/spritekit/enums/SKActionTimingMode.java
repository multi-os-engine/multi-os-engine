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
import org.moe.natj.general.ann.NInt;

/**
 * Adjust the timing of an action
 * 
 * [@enum] SKActionTimingLinear Specifies linear pacing. Linear pacing causes an
 * animation to occur evenly over its duration.
 * [@enum] SKActionTimingEaseIn Specifies ease-in pacing. Ease-in pacing causes the
 * animation to begin slowly, and then speed up as it progresses.
 * [@enum] SKActionTimingEaseOut Specifies ease-out pacing. Ease-out pacing causes
 * the animation to begin quickly, and then slow as it completes.
 * [@enum] SKActionTimingEaseInEaseOut Specifies ease-in ease-out pacing. An
 * ease-in ease-out animation begins slowly, accelerates through the middle
 * of its duration, and then slows again before completing.
 * 
 * API-Since: 7.0
 */
@Generated
public final class SKActionTimingMode {
    /**
     * API-Since: 7.0
     */
    @Generated @NInt public static final long Linear = 0x0000000000000000L;
    /**
     * API-Since: 7.0
     */
    @Generated @NInt public static final long EaseIn = 0x0000000000000001L;
    /**
     * API-Since: 7.0
     */
    @Generated @NInt public static final long EaseOut = 0x0000000000000002L;
    /**
     * API-Since: 7.0
     */
    @Generated @NInt public static final long EaseInEaseOut = 0x0000000000000003L;

    @Generated
    private SKActionTimingMode() {
    }
}
