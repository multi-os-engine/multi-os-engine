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

package apple.uikit.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 10.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIContentSizeCategoryAdjusting")
public interface UIContentSizeCategoryAdjusting {
    /**
     * Indicates whether the corresponding element should automatically update its font when the device’s
     * UIContentSizeCategory is changed.
     * For this property to take effect, the element’s font must be one of the following:
     * - a font vended using +preferredFontForTextStyle: or +preferredFontForTextStyle:compatibleWithTraitCollection:
     * with a valid UIFontTextStyle
     * - a font vended using - [UIFontMetrics scaledFontForFont:] or one of its variants
     */
    @Generated
    @Selector("adjustsFontForContentSizeCategory")
    boolean adjustsFontForContentSizeCategory();

    /**
     * Indicates whether the corresponding element should automatically update its font when the device’s
     * UIContentSizeCategory is changed.
     * For this property to take effect, the element’s font must be one of the following:
     * - a font vended using +preferredFontForTextStyle: or +preferredFontForTextStyle:compatibleWithTraitCollection:
     * with a valid UIFontTextStyle
     * - a font vended using - [UIFontMetrics scaledFontForFont:] or one of its variants
     */
    @Generated
    @Selector("setAdjustsFontForContentSizeCategory:")
    void setAdjustsFontForContentSizeCategory(boolean value);
}
