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
 * API-Since: 7.0
 */
@Generated
public final class UIScrollViewKeyboardDismissMode {
    /**
     * API-Since: 7.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * dismisses the keyboard when a drag begins
     * 
     * API-Since: 7.0
     */
    @Generated @NInt public static final long OnDrag = 0x0000000000000001L;
    /**
     * the keyboard follows the dragging touch off screen, and may be pulled upward again to cancel the dismiss
     * 
     * API-Since: 7.0
     */
    @Generated @NInt public static final long Interactive = 0x0000000000000002L;

    @Generated
    private UIScrollViewKeyboardDismissMode() {
    }

    /**
     * dismisses both keyboard and accessory in the style of UIScrollViewKeyboardDismissModeOnDrag
     * 
     * API-Since: 7.0
     */
    @Generated @NInt public static final long OnDragWithAccessory = 0x0000000000000003L;
    /**
     * dismisses both keyboard and accessory in the style of UIScrollViewKeyboardDismissModeInteractive
     * 
     * API-Since: 7.0
     */
    @Generated @NInt public static final long InteractiveWithAccessory = 0x0000000000000004L;
}
