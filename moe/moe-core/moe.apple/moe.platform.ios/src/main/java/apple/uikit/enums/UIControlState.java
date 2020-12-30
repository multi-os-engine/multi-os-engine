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
public final class UIControlState {
    @Generated @NUInt public static final long Normal = 0x0000000000000000L;
    /**
     * used when UIControl isHighlighted is set
     */
    @Generated @NUInt public static final long Highlighted = 0x0000000000000001L;
    @Generated @NUInt public static final long Disabled = 0x0000000000000002L;
    /**
     * flag usable by app (see below)
     */
    @Generated @NUInt public static final long Selected = 0x0000000000000004L;
    /**
     * Applicable only when the screen supports focus
     */
    @Generated @NUInt public static final long Focused = 0x0000000000000008L;
    /**
     * additional flags available for application use
     */
    @Generated @NUInt public static final long Application = 0x0000000000FF0000L;
    /**
     * flags reserved for internal framework use
     */
    @Generated @NUInt public static final long Reserved = 0x00000000FF000000L;

    @Generated
    private UIControlState() {
    }
}
