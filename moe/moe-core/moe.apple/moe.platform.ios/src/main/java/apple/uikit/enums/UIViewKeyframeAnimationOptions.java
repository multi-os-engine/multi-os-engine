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

@Generated
public final class UIViewKeyframeAnimationOptions {
    @Generated
    private UIViewKeyframeAnimationOptions() {
    }

    @Generated @NUInt public static final long LayoutSubviews = 0x0000000000000001L;
    @Generated @NUInt public static final long AllowUserInteraction = 0x0000000000000002L;
    @Generated @NUInt public static final long BeginFromCurrentState = 0x0000000000000004L;
    @Generated @NUInt public static final long Repeat = 0x0000000000000008L;
    @Generated @NUInt public static final long Autoreverse = 0x0000000000000010L;
    @Generated @NUInt public static final long OverrideInheritedDuration = 0x0000000000000020L;
    @Generated @NUInt public static final long OverrideInheritedOptions = 0x0000000000000200L;
    @Generated @NUInt public static final long CalculationModeLinear = 0x0000000000000000L;
    @Generated @NUInt public static final long CalculationModeDiscrete = 0x0000000000000400L;
    @Generated @NUInt public static final long CalculationModePaced = 0x0000000000000800L;
    @Generated @NUInt public static final long CalculationModeCubic = 0x0000000000000C00L;
    @Generated @NUInt public static final long CalculationModeCubicPaced = 0x0000000000001000L;
}
