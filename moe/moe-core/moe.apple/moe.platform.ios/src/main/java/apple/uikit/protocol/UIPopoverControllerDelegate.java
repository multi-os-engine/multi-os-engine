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

import apple.coregraphics.struct.CGRect;
import apple.uikit.UIPopoverController;
import apple.uikit.UIView;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIPopoverControllerDelegate")
public interface UIPopoverControllerDelegate {
    /**
     * popoverController:willRepositionPopoverToRect:inView:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPopoverControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UIPopoverControllerDelegate/popoverController:willRepositionPopoverToRect:inView:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("popoverController:willRepositionPopoverToRect:inView:")
    default void popoverControllerWillRepositionPopoverToRectInView(UIPopoverController popoverController, CGRect rect,
            Ptr<UIView> view) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * popoverControllerDidDismissPopover:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPopoverControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UIPopoverControllerDelegate/popoverControllerDidDismissPopover:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("popoverControllerDidDismissPopover:")
    default void popoverControllerDidDismissPopover(UIPopoverController popoverController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * popoverControllerShouldDismissPopover:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPopoverControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UIPopoverControllerDelegate/popoverControllerShouldDismissPopover:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("popoverControllerShouldDismissPopover:")
    default boolean popoverControllerShouldDismissPopover(UIPopoverController popoverController) {
        throw new java.lang.UnsupportedOperationException();
    }
}
