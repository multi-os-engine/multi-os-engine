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
public final class UIBarButtonItemStyle {
    @Generated @NInt public static final long Plain = 0x0000000000000000L;
    /**
     * A button item style for a prominent button.
     * 
     * For example, use this for a button that completes or finalizes some task.
     * Buttons with this style will not be visually grouped with other items
     * in a navigation bar or toolbar, and will also have other styling changes
     * appropriate to their context to indicate their prominence.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 8.0
     */
    @Deprecated @Generated @NInt public static final long Bordered = 0x0000000000000001L;
    /**
     * A button item style for a prominent button.
     * 
     * For example, use this for a button that completes or finalizes some task.
     * Buttons with this style will not be visually grouped with other items
     * in a navigation bar or toolbar, and will also have other styling changes
     * appropriate to their context to indicate their prominence.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 26.0
     */
    @Deprecated @Generated @NInt public static final long Done = 0x0000000000000002L;

    @Generated
    private UIBarButtonItemStyle() {
    }

    /**
     * A button item style for a prominent button.
     * 
     * For example, use this for a button that completes or finalizes some task.
     * Buttons with this style will not be visually grouped with other items
     * in a navigation bar or toolbar, and will also have other styling changes
     * appropriate to their context to indicate their prominence.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Prominent = 0x0000000000000002L;
}
