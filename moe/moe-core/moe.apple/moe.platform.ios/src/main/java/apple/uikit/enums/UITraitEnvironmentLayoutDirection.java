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
 * These values are only used for the layout direction trait, which informs but does not completely dictate the layout direction of views. To determine the effective layout direction of a view, consult the UIView.effectiveUserInterfaceLayoutDirection property, whose values are members of the UIUserInterfaceLayoutDirection enum.
 */
@Generated
public final class UITraitEnvironmentLayoutDirection {
    @Generated @NInt public static final long Unspecified = 0xFFFFFFFFFFFFFFFFL;
    @Generated @NInt public static final long LeftToRight = 0x0000000000000000L;
    @Generated @NInt public static final long RightToLeft = 0x0000000000000001L;

    @Generated
    private UITraitEnvironmentLayoutDirection() {
    }
}
