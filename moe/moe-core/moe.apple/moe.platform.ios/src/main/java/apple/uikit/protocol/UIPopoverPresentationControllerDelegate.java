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

import apple.uikit.UIPopoverPresentationController;
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
import org.jetbrains.annotations.NotNull;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIPopoverPresentationControllerDelegate")
public interface UIPopoverPresentationControllerDelegate extends UIAdaptivePresentationControllerDelegate {
    /**
     * -popoverPresentationController:willRepositionPopoverToRect:inView: is called on your delegate when the
     * popover may require a different view or rectangle.
     */
    @Generated
    @IsOptional
    @Selector("popoverPresentationController:willRepositionPopoverToRect:inView:")
    default void popoverPresentationControllerWillRepositionPopoverToRectInView(
            @NotNull UIPopoverPresentationController popoverPresentationController, @NotNull CGRect rect,
            @NotNull @ReferenceInfo(type = UIView.class) Ptr<UIView> view) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called on the delegate when the user has taken action to dismiss the popover. This is not called when the popover
     * is dismissed programatically.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("popoverPresentationControllerDidDismissPopover:")
    default void popoverPresentationControllerDidDismissPopover(
            @NotNull UIPopoverPresentationController popoverPresentationController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called on the delegate when the popover controller will dismiss the popover. Return NO to prevent the
     * dismissal of the view.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("popoverPresentationControllerShouldDismissPopover:")
    default boolean popoverPresentationControllerShouldDismissPopover(
            @NotNull UIPopoverPresentationController popoverPresentationController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("prepareForPopoverPresentation:")
    default void prepareForPopoverPresentation(@NotNull UIPopoverPresentationController popoverPresentationController) {
        throw new java.lang.UnsupportedOperationException();
    }
}
