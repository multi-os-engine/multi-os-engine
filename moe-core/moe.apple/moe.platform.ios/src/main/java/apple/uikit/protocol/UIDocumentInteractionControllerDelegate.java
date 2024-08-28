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

import apple.uikit.UIDocumentInteractionController;
import apple.uikit.UIView;
import apple.uikit.UIViewController;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 3.2
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIDocumentInteractionControllerDelegate")
public interface UIDocumentInteractionControllerDelegate {
    /**
     * Used to handle additional menu items that can be performed on the item specified by URL. Currently only supports
     * the "copy:", "print:" and "saveToCameraRoll:" actions.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 6.0
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("documentInteractionController:canPerformAction:")
    default boolean documentInteractionControllerCanPerformAction(@NotNull UIDocumentInteractionController controller,
            @Nullable SEL action) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentInteractionController:didEndSendingToApplication:")
    default void documentInteractionControllerDidEndSendingToApplication(
            @NotNull UIDocumentInteractionController controller, @Nullable String application) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 3.2
     * Deprecated-Since: 6.0
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("documentInteractionController:performAction:")
    default boolean documentInteractionControllerPerformAction(@NotNull UIDocumentInteractionController controller,
            @Nullable SEL action) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * bundle ID
     */
    @Generated
    @IsOptional
    @Selector("documentInteractionController:willBeginSendingToApplication:")
    default void documentInteractionControllerWillBeginSendingToApplication(
            @NotNull UIDocumentInteractionController controller, @Nullable String application) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentInteractionControllerDidDismissOpenInMenu:")
    default void documentInteractionControllerDidDismissOpenInMenu(
            @NotNull UIDocumentInteractionController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentInteractionControllerDidDismissOptionsMenu:")
    default void documentInteractionControllerDidDismissOptionsMenu(
            @NotNull UIDocumentInteractionController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentInteractionControllerDidEndPreview:")
    default void documentInteractionControllerDidEndPreview(@NotNull UIDocumentInteractionController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * If preview is supported, these provide the view and rect that will be used as the starting point for the
     * animation to the full screen preview.
     * The actual animation that is performed depends upon the platform and other factors.
     * If documentInteractionControllerRectForPreview is not implemented, the specified view's bounds will be used.
     * If documentInteractionControllerViewForPreview is not implemented, the preview controller will simply fade in
     * instead of scaling up.
     */
    @Generated
    @IsOptional
    @Selector("documentInteractionControllerRectForPreview:")
    @ByValue
    default CGRect documentInteractionControllerRectForPreview(@NotNull UIDocumentInteractionController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * If preview is supported, this provides the view controller on which the preview will be presented.
     * This method is required if preview is supported.
     * If presenting atop a navigation stack, provide the navigation controller in order to animate in a manner
     * consistent with the rest of the platform.
     */
    @NotNull
    @Generated
    @IsOptional
    @Selector("documentInteractionControllerViewControllerForPreview:")
    default UIViewController documentInteractionControllerViewControllerForPreview(
            @NotNull UIDocumentInteractionController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Nullable
    @Generated
    @IsOptional
    @Selector("documentInteractionControllerViewForPreview:")
    default UIView documentInteractionControllerViewForPreview(@NotNull UIDocumentInteractionController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Preview presented/dismissed on document. Use to set up any HI underneath.
     */
    @Generated
    @IsOptional
    @Selector("documentInteractionControllerWillBeginPreview:")
    default void documentInteractionControllerWillBeginPreview(@NotNull UIDocumentInteractionController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Open in menu presented/dismissed on document. Use to set up any HI underneath.
     */
    @Generated
    @IsOptional
    @Selector("documentInteractionControllerWillPresentOpenInMenu:")
    default void documentInteractionControllerWillPresentOpenInMenu(
            @NotNull UIDocumentInteractionController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Options menu presented/dismissed on document. Use to set up any HI underneath.
     */
    @Generated
    @IsOptional
    @Selector("documentInteractionControllerWillPresentOptionsMenu:")
    default void documentInteractionControllerWillPresentOptionsMenu(
            @NotNull UIDocumentInteractionController controller) {
        throw new java.lang.UnsupportedOperationException();
    }
}
