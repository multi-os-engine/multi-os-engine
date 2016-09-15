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
    /**
     * documentInteractionController:canPerformAction:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UIDocumentInteractionControllerDelegate/documentInteractionController:canPerformAction:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("documentInteractionController:canPerformAction:")
    default boolean documentInteractionControllerCanPerformAction(UIDocumentInteractionController controller,
            SEL action) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * documentInteractionController:didEndSendingToApplication:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UIDocumentInteractionControllerDelegate/documentInteractionController:didEndSendingToApplication:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("documentInteractionController:didEndSendingToApplication:")
    default void documentInteractionControllerDidEndSendingToApplication(UIDocumentInteractionController controller,
            String application) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * documentInteractionController:performAction:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UIDocumentInteractionControllerDelegate/documentInteractionController:performAction:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("documentInteractionController:performAction:")
    default boolean documentInteractionControllerPerformAction(UIDocumentInteractionController controller, SEL action) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * documentInteractionController:willBeginSendingToApplication:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UIDocumentInteractionControllerDelegate/documentInteractionController:willBeginSendingToApplication:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("documentInteractionController:willBeginSendingToApplication:")
    default void documentInteractionControllerWillBeginSendingToApplication(UIDocumentInteractionController controller,
            String application) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * documentInteractionControllerDidDismissOpenInMenu:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UIDocumentInteractionControllerDelegate/documentInteractionControllerDidDismissOpenInMenu:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("documentInteractionControllerDidDismissOpenInMenu:")
    default void documentInteractionControllerDidDismissOpenInMenu(UIDocumentInteractionController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * documentInteractionControllerDidDismissOptionsMenu:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UIDocumentInteractionControllerDelegate/documentInteractionControllerDidDismissOptionsMenu:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("documentInteractionControllerDidDismissOptionsMenu:")
    default void documentInteractionControllerDidDismissOptionsMenu(UIDocumentInteractionController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * documentInteractionControllerDidEndPreview:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UIDocumentInteractionControllerDelegate/documentInteractionControllerDidEndPreview:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("documentInteractionControllerDidEndPreview:")
    default void documentInteractionControllerDidEndPreview(UIDocumentInteractionController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * documentInteractionControllerRectForPreview:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UIDocumentInteractionControllerDelegate/documentInteractionControllerRectForPreview:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("documentInteractionControllerRectForPreview:")
    @ByValue
    default CGRect documentInteractionControllerRectForPreview(UIDocumentInteractionController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * documentInteractionControllerViewControllerForPreview:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UIDocumentInteractionControllerDelegate/documentInteractionControllerViewControllerForPreview:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("documentInteractionControllerViewControllerForPreview:")
    default UIViewController documentInteractionControllerViewControllerForPreview(
            UIDocumentInteractionController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * documentInteractionControllerViewForPreview:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UIDocumentInteractionControllerDelegate/documentInteractionControllerViewForPreview:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("documentInteractionControllerViewForPreview:")
    default UIView documentInteractionControllerViewForPreview(UIDocumentInteractionController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * documentInteractionControllerWillBeginPreview:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UIDocumentInteractionControllerDelegate/documentInteractionControllerWillBeginPreview:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("documentInteractionControllerWillBeginPreview:")
    default void documentInteractionControllerWillBeginPreview(UIDocumentInteractionController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * documentInteractionControllerWillPresentOpenInMenu:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UIDocumentInteractionControllerDelegate/documentInteractionControllerWillPresentOpenInMenu:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("documentInteractionControllerWillPresentOpenInMenu:")
    default void documentInteractionControllerWillPresentOpenInMenu(UIDocumentInteractionController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * documentInteractionControllerWillPresentOptionsMenu:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UIDocumentInteractionControllerDelegate/documentInteractionControllerWillPresentOptionsMenu:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("documentInteractionControllerWillPresentOptionsMenu:")
    default void documentInteractionControllerWillPresentOptionsMenu(UIDocumentInteractionController controller) {
        throw new java.lang.UnsupportedOperationException();
    }
}
