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
public final class UIBarPosition {
    @Generated @NInt public static final long Any = 0x0000000000000000L;
    /**
     * The bar is at the bottom of its local context, and directional decoration draws accordingly (e.g., shadow above the bar).
     */
    @Generated @NInt public static final long Bottom = 0x0000000000000001L;
    /**
     * The bar is at the top of its local context, and directional decoration draws accordingly (e.g., shadow below the bar)
     */
    @Generated @NInt public static final long Top = 0x0000000000000002L;
    /**
     * The bar is at the top of the screen (as well as its local context), and its background extends upward—currently only enough for the status bar.
     */
    @Generated @NInt public static final long TopAttached = 0x0000000000000003L;

    @Generated
    private UIBarPosition() {
    }
}
