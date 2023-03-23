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

import apple.uikit.UIPopoverController;
import apple.uikit.UIView;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import apple.corefoundation.struct.CGRect;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIPopoverControllerDelegate")
public interface UIPopoverControllerDelegate {
    /**
     * -popoverController:willRepositionPopoverToRect:inView: is called on your delegate when the popover may require a
     * different view or rectangle
     * 
     * API-Since: 7.0
     * Deprecated-Since: 9.0
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("popoverController:willRepositionPopoverToRect:inView:")
    default void popoverControllerWillRepositionPopoverToRectInView(UIPopoverController popoverController, CGRect rect,
            @ReferenceInfo(type = UIView.class) Ptr<UIView> view) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called on the delegate when the user has taken action to dismiss the popover. This is not called when
     * -dismissPopoverAnimated: is called directly.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("popoverControllerDidDismissPopover:")
    default void popoverControllerDidDismissPopover(UIPopoverController popoverController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called on the delegate when the popover controller will dismiss the popover. Return NO to prevent the dismissal
     * of the view.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("popoverControllerShouldDismissPopover:")
    default boolean popoverControllerShouldDismissPopover(UIPopoverController popoverController) {
        throw new java.lang.UnsupportedOperationException();
    }
}
