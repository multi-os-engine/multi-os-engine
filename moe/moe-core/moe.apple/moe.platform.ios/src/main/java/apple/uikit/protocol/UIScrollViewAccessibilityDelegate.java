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

import apple.foundation.NSAttributedString;
import apple.uikit.UIScrollView;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Provide a custom status string when VoiceOver scrolls with accessibilityScroll:
 * For example, in a bookcase user interface that displays a list of books, you can implement 
 * this protocol to announce "Showing books 10 through 20".
 * By default, VoiceOver will announce "Page X of Y" when scrolling. 
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIScrollViewAccessibilityDelegate")
public interface UIScrollViewAccessibilityDelegate extends UIScrollViewDelegate {
    @Generated
    @IsOptional
    @Selector("accessibilityScrollStatusForScrollView:")
    default String accessibilityScrollStatusForScrollView(UIScrollView scrollView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * If an object adopting this protocol responds to this method, the system will try sending it before sending its non-attributed version.
     */
    @Generated
    @IsOptional
    @Selector("accessibilityAttributedScrollStatusForScrollView:")
    default NSAttributedString accessibilityAttributedScrollStatusForScrollView(UIScrollView scrollView) {
        throw new java.lang.UnsupportedOperationException();
    }
}
