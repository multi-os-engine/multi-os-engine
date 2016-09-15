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
import apple.uikit.UIPopoverPresentationController;
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
@ObjCProtocolName("UIPopoverPresentationControllerDelegate")
public interface UIPopoverPresentationControllerDelegate extends UIAdaptivePresentationControllerDelegate {
    /**
     * popoverPresentationController:willRepositionPopoverToRect:inView:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPopoverPresentationControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UIPopoverPresentationControllerDelegate/popoverPresentationController:willRepositionPopoverToRect:inView:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("popoverPresentationController:willRepositionPopoverToRect:inView:")
    default void popoverPresentationControllerWillRepositionPopoverToRectInView(
            UIPopoverPresentationController popoverPresentationController, CGRect rect, Ptr<UIView> view) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * popoverPresentationControllerDidDismissPopover:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPopoverPresentationControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UIPopoverPresentationControllerDelegate/popoverPresentationControllerDidDismissPopover:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("popoverPresentationControllerDidDismissPopover:")
    default void popoverPresentationControllerDidDismissPopover(
            UIPopoverPresentationController popoverPresentationController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * popoverPresentationControllerShouldDismissPopover:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPopoverPresentationControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UIPopoverPresentationControllerDelegate/popoverPresentationControllerShouldDismissPopover:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("popoverPresentationControllerShouldDismissPopover:")
    default boolean popoverPresentationControllerShouldDismissPopover(
            UIPopoverPresentationController popoverPresentationController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * prepareForPopoverPresentation:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPopoverPresentationControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UIPopoverPresentationControllerDelegate/prepareForPopoverPresentation:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("prepareForPopoverPresentation:")
    default void prepareForPopoverPresentation(UIPopoverPresentationController popoverPresentationController) {
        throw new java.lang.UnsupportedOperationException();
    }
}
