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
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 7.0
 */
@Generated
public final class UIViewKeyframeAnimationOptions {
    /**
     * API-Since: 7.0
     */
    @Generated @NUInt public static final long LayoutSubviews = 0x0000000000000001L;
    /**
     * turn on user interaction while animating
     * 
     * API-Since: 7.0
     */
    @Generated @NUInt public static final long AllowUserInteraction = 0x0000000000000002L;
    /**
     * start all views from current value, not initial value
     * 
     * API-Since: 7.0
     */
    @Generated @NUInt public static final long BeginFromCurrentState = 0x0000000000000004L;
    /**
     * repeat animation indefinitely
     * 
     * API-Since: 7.0
     */
    @Generated @NUInt public static final long Repeat = 0x0000000000000008L;
    /**
     * if repeat, run animation back and forth
     * 
     * API-Since: 7.0
     */
    @Generated @NUInt public static final long Autoreverse = 0x0000000000000010L;
    /**
     * ignore nested duration
     * 
     * API-Since: 7.0
     */
    @Generated @NUInt public static final long OverrideInheritedDuration = 0x0000000000000020L;
    /**
     * do not inherit any options or animation type
     * 
     * API-Since: 7.0
     */
    @Generated @NUInt public static final long OverrideInheritedOptions = 0x0000000000000200L;
    /**
     * default
     * 
     * API-Since: 7.0
     */
    @Generated @NUInt public static final long CalculationModeLinear = 0x0000000000000000L;
    /**
     * API-Since: 7.0
     */
    @Generated @NUInt public static final long CalculationModeDiscrete = 0x0000000000000400L;
    /**
     * API-Since: 7.0
     */
    @Generated @NUInt public static final long CalculationModePaced = 0x0000000000000800L;
    /**
     * API-Since: 7.0
     */
    @Generated @NUInt public static final long CalculationModeCubic = 0x0000000000000C00L;
    /**
     * API-Since: 7.0
     */
    @Generated @NUInt public static final long CalculationModeCubicPaced = 0x0000000000001000L;

    @Generated
    private UIViewKeyframeAnimationOptions() {
    }
}
