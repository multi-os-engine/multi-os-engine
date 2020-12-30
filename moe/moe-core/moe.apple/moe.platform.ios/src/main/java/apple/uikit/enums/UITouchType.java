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
public final class UITouchType {
    /**
     * A direct touch from a finger (on a screen)
     */
    @Generated @NInt public static final long Direct = 0x0000000000000000L;
    /**
     * An indirect touch (not a screen)
     */
    @Generated @NInt public static final long Indirect = 0x0000000000000001L;
    /**
     * A touch from a stylus (deprecated name, use pencil)
     */
    @Generated @NInt public static final long Stylus = 0x0000000000000002L;

    @Generated
    private UITouchType() {
    }

    /**
     * Add pencil name variant
     */
    @Generated @NInt public static final long Pencil = 0x0000000000000002L;
    /**
     * A touch representing a button-based, indirect input device describing the input sequence from button press to button release
     */
    @Generated @NInt public static final long IndirectPointer = 0x0000000000000003L;
}
