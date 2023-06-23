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
 * Images are created with UIImageRenderingModeAutomatic by default. An image with this mode is interpreted as a
 * template image or an original image based on the context in which it is rendered. For example, navigation bars, tab
 * bars, toolbars, and segmented controls automatically treat their foreground images as templates, while image views
 * and web views treat their images as originals. You can use UIImageRenderingModeAlwaysTemplate to force your image to
 * always be rendered as a template or UIImageRenderingModeAlwaysOriginal to force your image to always be rendered as
 * an original.
 * 
 * API-Since: 7.0
 */
@Generated
public final class UIImageRenderingMode {
    /**
     * Use the default rendering mode for the context where the image is used
     * 
     * API-Since: 7.0
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * Always draw the original image, without treating it as a template
     * 
     * API-Since: 7.0
     */
    @Generated @NInt public static final long AlwaysOriginal = 0x0000000000000001L;
    /**
     * Always draw the image as a template image, ignoring its color information
     * 
     * API-Since: 7.0
     */
    @Generated @NInt public static final long AlwaysTemplate = 0x0000000000000002L;

    @Generated
    private UIImageRenderingMode() {
    }
}
