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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIDocumentInteractionControllerDelegate")
public interface UIDocumentInteractionControllerDelegate {
    @Generated
    @IsOptional
    @Deprecated
    @Selector("documentInteractionController:canPerformAction:")
    default boolean documentInteractionControllerCanPerformAction(UIDocumentInteractionController controller,
            SEL action) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentInteractionController:didEndSendingToApplication:")
    default void documentInteractionControllerDidEndSendingToApplication(UIDocumentInteractionController controller,
            String application) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Deprecated
    @Selector("documentInteractionController:performAction:")
    default boolean documentInteractionControllerPerformAction(UIDocumentInteractionController controller, SEL action) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentInteractionController:willBeginSendingToApplication:")
    default void documentInteractionControllerWillBeginSendingToApplication(UIDocumentInteractionController controller,
            String application) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentInteractionControllerDidDismissOpenInMenu:")
    default void documentInteractionControllerDidDismissOpenInMenu(UIDocumentInteractionController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentInteractionControllerDidDismissOptionsMenu:")
    default void documentInteractionControllerDidDismissOptionsMenu(UIDocumentInteractionController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentInteractionControllerDidEndPreview:")
    default void documentInteractionControllerDidEndPreview(UIDocumentInteractionController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentInteractionControllerRectForPreview:")
    @ByValue
    default CGRect documentInteractionControllerRectForPreview(UIDocumentInteractionController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentInteractionControllerViewControllerForPreview:")
    default UIViewController documentInteractionControllerViewControllerForPreview(
            UIDocumentInteractionController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentInteractionControllerViewForPreview:")
    default UIView documentInteractionControllerViewForPreview(UIDocumentInteractionController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentInteractionControllerWillBeginPreview:")
    default void documentInteractionControllerWillBeginPreview(UIDocumentInteractionController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentInteractionControllerWillPresentOpenInMenu:")
    default void documentInteractionControllerWillPresentOpenInMenu(UIDocumentInteractionController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentInteractionControllerWillPresentOptionsMenu:")
    default void documentInteractionControllerWillPresentOptionsMenu(UIDocumentInteractionController controller) {
        throw new java.lang.UnsupportedOperationException();
    }
}
