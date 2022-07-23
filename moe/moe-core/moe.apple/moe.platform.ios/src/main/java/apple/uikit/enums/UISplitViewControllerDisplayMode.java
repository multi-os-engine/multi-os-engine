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

@Generated
public final class UISplitViewControllerDisplayMode {
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    @Generated @NInt public static final long PrimaryHidden = 0x0000000000000001L;
    @Generated @NInt public static final long AllVisible = 0x0000000000000002L;
    @Generated @NInt public static final long PrimaryOverlay = 0x0000000000000003L;

    @Generated
    private UISplitViewControllerDisplayMode() {
    }

    @Generated @NInt public static final long SecondaryOnly = 0x0000000000000001L;
    /**
     * Two tiled columns. Leading will be UISplitViewControllerColumnSupplementary for
     * UISplitViewControllerStyleTripleColumn, Primary otherwise
     */
    @Generated @NInt public static final long OneBesideSecondary = 0x0000000000000002L;
    /**
     * Supplementary column overlaid on Secondary column for UISplitViewControllerStyleTripleColumn, Primary overlaid
     * otherwise
     */
    @Generated @NInt public static final long OneOverSecondary = 0x0000000000000003L;
    /**
     * All three columns fully displayed side-by-side and interactive
     */
    @Generated @NInt public static final long TwoBesideSecondary = 0x0000000000000004L;
    /**
     * primary and supplementary columns side-by-side in overlay on top of partially visible detail column (detail
     * column has dimming view). For widths too narrow to see much of the detail when the primary and supplementary
     * columns are tiled.
     */
    @Generated @NInt public static final long TwoOverSecondary = 0x0000000000000005L;
    /**
     * primary, supplementary and detail columns side-by-side, but the dimmed, noninteractive detail has been displaced
     * toward and cropped on the trailing edge. For wider widths than in TwoOverSecondary but still too narrow for
     * TwoBesideSecondary
     */
    @Generated @NInt public static final long TwoDisplaceSecondary = 0x0000000000000006L;
}
