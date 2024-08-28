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
 * when the connected screen is overscanning, UIScreen can attempt to compensate for the overscan to avoid clipping
 */
@Generated
public final class UIScreenOverscanCompensation {
    /**
     * the final composited framebuffer for the screen is scaled to avoid clipping
     */
    @Generated @NInt public static final long Scale = 0x0000000000000000L;
    /**
     * the screen's bounds will be inset in the framebuffer to avoid clipping. no scaling will occur
     */
    @Generated @NInt public static final long InsetBounds = 0x0000000000000001L;
    /**
     * no scaling will occur. use overscanCompensationInsets to determine the necessary insets to avoid clipping
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long None = 0x0000000000000002L;
    /**
     * API-Since: 5.0
     * Deprecated-Since: 9.0
     */
    @Deprecated @Generated @NInt public static final long InsetApplicationFrame = 0x0000000000000002L;

    @Generated
    private UIScreenOverscanCompensation() {
    }
}
