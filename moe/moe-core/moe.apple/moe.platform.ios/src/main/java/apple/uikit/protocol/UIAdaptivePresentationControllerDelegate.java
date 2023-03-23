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

import apple.uikit.UIPresentationController;
import apple.uikit.UITraitCollection;
import apple.uikit.UIViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIAdaptivePresentationControllerDelegate")
public interface UIAdaptivePresentationControllerDelegate {
    /**
     * For iOS 8.0, the only supported adaptive presentation styles are UIModalPresentationFullScreen and
     * UIModalPresentationOverFullScreen.
     */
    @Generated
    @IsOptional
    @Selector("adaptivePresentationStyleForPresentationController:")
    @NInt
    default long adaptivePresentationStyleForPresentationController(UIPresentationController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Returning UIModalPresentationNone will indicate that an adaptation should not happen.
     * 
     * API-Since: 8.3
     */
    @Generated
    @IsOptional
    @Selector("adaptivePresentationStyleForPresentationController:traitCollection:")
    @NInt
    default long adaptivePresentationStyleForPresentationControllerTraitCollection(UIPresentationController controller,
            UITraitCollection traitCollection) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * If this method is not implemented, or returns nil, then the originally presented view controller is used.
     */
    @Generated
    @IsOptional
    @Selector("presentationController:viewControllerForAdaptivePresentationStyle:")
    default UIViewController presentationControllerViewControllerForAdaptivePresentationStyle(
            UIPresentationController controller, @NInt long style) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * If there is no adaptation happening and an original style is used UIModalPresentationNone will be passed as an
     * argument.
     * 
     * API-Since: 8.3
     */
    @Generated
    @IsOptional
    @Selector("presentationController:willPresentWithAdaptiveStyle:transitionCoordinator:")
    default void presentationControllerWillPresentWithAdaptiveStyleTransitionCoordinator(
            UIPresentationController presentationController, @NInt long style,
            @Mapped(ObjCObjectMapper.class) UIViewControllerTransitionCoordinator transitionCoordinator) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called on the delegate when the user attempts to dismiss the presentation, but user-initiated dismissal is
     * prevented because the presentedViewController isModalInPresentation or presentationControllerShouldDismiss:
     * returned NO.
     * When this method is called, it is recommended that the user be informed why they cannot dismiss the presentation,
     * such as by presenting an instance of UIAlertController.
     * 
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("presentationControllerDidAttemptToDismiss:")
    default void presentationControllerDidAttemptToDismiss(UIPresentationController presentationController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called on the delegate when the user has taken action to dismiss the presentation successfully, after all
     * animations are finished.
     * This is not called if the presentation is dismissed programatically.
     * 
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("presentationControllerDidDismiss:")
    default void presentationControllerDidDismiss(UIPresentationController presentationController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called on the delegate to determine if the presentation controller may dismiss in response to user action.
     * This method may be called at any time, and may not necessarily be followed by presentationControllerWillDismiss:
     * or presentationControllerDidDismiss:.
     * Any implementation of this method should be fast.
     * Return NO to prevent dismissal of the view controller.
     * 
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("presentationControllerShouldDismiss:")
    default boolean presentationControllerShouldDismiss(UIPresentationController presentationController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called on the delegate when the user has taken action to dismiss the presentation, before interaction or
     * animations begin.
     * Use this callback to setup alongside animations or interaction notifications with the presentingViewController's
     * transitionCoordinator.
     * This is not called if the presentation is dismissed programatically.
     * 
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("presentationControllerWillDismiss:")
    default void presentationControllerWillDismiss(UIPresentationController presentationController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called during adaptation so the delegate may configure properties of the adaptive presentation controller before
     * it is presented.
     * 
     * API-Since: 15.0
     */
    @Generated
    @IsOptional
    @Selector("presentationController:prepareAdaptivePresentationController:")
    default void presentationControllerPrepareAdaptivePresentationController(
            UIPresentationController presentationController, UIPresentationController adaptivePresentationController) {
        throw new java.lang.UnsupportedOperationException();
    }
}
