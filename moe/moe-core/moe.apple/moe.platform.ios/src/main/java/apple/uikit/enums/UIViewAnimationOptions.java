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
public final class UIViewAnimationOptions {
    @Generated @NUInt public static final long LayoutSubviews = 0x0000000000000001L;
    @Generated @NUInt public static final long AllowUserInteraction = 0x0000000000000002L;
    @Generated @NUInt public static final long BeginFromCurrentState = 0x0000000000000004L;
    @Generated @NUInt public static final long Repeat = 0x0000000000000008L;
    @Generated @NUInt public static final long Autoreverse = 0x0000000000000010L;
    @Generated @NUInt public static final long OverrideInheritedDuration = 0x0000000000000020L;
    @Generated @NUInt public static final long OverrideInheritedCurve = 0x0000000000000040L;
    @Generated @NUInt public static final long AllowAnimatedContent = 0x0000000000000080L;
    @Generated @NUInt public static final long ShowHideTransitionViews = 0x0000000000000100L;
    @Generated @NUInt public static final long OverrideInheritedOptions = 0x0000000000000200L;
    @Generated @NUInt public static final long CurveEaseInOut = 0x0000000000000000L;
    @Generated @NUInt public static final long CurveEaseIn = 0x0000000000010000L;
    @Generated @NUInt public static final long CurveEaseOut = 0x0000000000020000L;
    @Generated @NUInt public static final long CurveLinear = 0x0000000000030000L;
    @Generated @NUInt public static final long TransitionNone = 0x0000000000000000L;
    @Generated @NUInt public static final long TransitionFlipFromLeft = 0x0000000000100000L;
    @Generated @NUInt public static final long TransitionFlipFromRight = 0x0000000000200000L;
    @Generated @NUInt public static final long TransitionCurlUp = 0x0000000000300000L;
    @Generated @NUInt public static final long TransitionCurlDown = 0x0000000000400000L;
    @Generated @NUInt public static final long TransitionCrossDissolve = 0x0000000000500000L;
    @Generated @NUInt public static final long TransitionFlipFromTop = 0x0000000000600000L;
    @Generated @NUInt public static final long TransitionFlipFromBottom = 0x0000000000700000L;

    @Generated
    private UIViewAnimationOptions() {
    }

    @Generated @NUInt public static final long PreferredFramesPerSecondDefault = 0x0000000000000000L;
    @Generated @NUInt public static final long PreferredFramesPerSecond60 = 0x0000000003000000L;
    @Generated @NUInt public static final long PreferredFramesPerSecond30 = 0x0000000007000000L;
}
