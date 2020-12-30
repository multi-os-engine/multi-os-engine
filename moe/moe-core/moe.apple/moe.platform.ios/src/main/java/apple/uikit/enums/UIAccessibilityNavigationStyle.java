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
 * The following values describe how the receiver's elements should be navigated by an assistive technology.
 */
@Generated
public final class UIAccessibilityNavigationStyle {
    /**
     * The assistive technology will automatically determine how the receiver's elements should be navigated.
     * This is the default value.
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * The receiver's elements should be navigated as separate elements.
     */
    @Generated @NInt public static final long Separate = 0x0000000000000001L;
    /**
     * The receiver’s elements should be combined and navigated as a single item.
     * When the combined item has been selected, the assistive technology will navigate each element separately.
     */
    @Generated @NInt public static final long Combined = 0x0000000000000002L;

    @Generated
    private UIAccessibilityNavigationStyle() {
    }
}
