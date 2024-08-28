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
public final class UITableViewCellStyle {
    /**
     * Simple cell with text label and optional image view (behavior of UITableViewCell in iPhoneOS 2.x)
     */
    @Generated @NInt public static final long Default = 0x0000000000000000L;
    /**
     * Left aligned label on left and right aligned label on right with blue text (Used in Settings)
     */
    @Generated @NInt public static final long Value1 = 0x0000000000000001L;
    /**
     * Right aligned label on left with blue text and left aligned label on right (Used in Phone/Contacts)
     */
    @Generated @NInt public static final long Value2 = 0x0000000000000002L;
    /**
     * Left aligned label on top and left aligned label on bottom with gray text (Used in iPod).
     */
    @Generated @NInt public static final long Subtitle = 0x0000000000000003L;

    @Generated
    private UITableViewCellStyle() {
    }
}
