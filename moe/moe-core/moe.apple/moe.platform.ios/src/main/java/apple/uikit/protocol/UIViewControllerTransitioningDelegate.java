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
import apple.uikit.UIViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIViewControllerTransitioningDelegate")
public interface UIViewControllerTransitioningDelegate {
    /**
     * animationControllerForDismissedController:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerTransitioningDelegate_protocol/index.html#//apple_ref/occ/intfm/UIViewControllerTransitioningDelegate/animationControllerForDismissedController:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("animationControllerForDismissedController:")
    @MappedReturn(ObjCObjectMapper.class)
    default Object animationControllerForDismissedController(UIViewController dismissed) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * animationControllerForPresentedController:presentingController:sourceController:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerTransitioningDelegate_protocol/index.html#//apple_ref/occ/intfm/UIViewControllerTransitioningDelegate/animationControllerForPresentedController:presentingController:sourceController:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("animationControllerForPresentedController:presentingController:sourceController:")
    @MappedReturn(ObjCObjectMapper.class)
    default Object animationControllerForPresentedControllerPresentingControllerSourceController(
            UIViewController presented, UIViewController presenting, UIViewController source) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * interactionControllerForDismissal:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerTransitioningDelegate_protocol/index.html#//apple_ref/occ/intfm/UIViewControllerTransitioningDelegate/interactionControllerForDismissal:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("interactionControllerForDismissal:")
    @MappedReturn(ObjCObjectMapper.class)
    default Object interactionControllerForDismissal(@Mapped(ObjCObjectMapper.class) Object animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * interactionControllerForPresentation:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerTransitioningDelegate_protocol/index.html#//apple_ref/occ/intfm/UIViewControllerTransitioningDelegate/interactionControllerForPresentation:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("interactionControllerForPresentation:")
    @MappedReturn(ObjCObjectMapper.class)
    default Object interactionControllerForPresentation(@Mapped(ObjCObjectMapper.class) Object animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * presentationControllerForPresentedViewController:presentingViewController:sourceViewController:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerTransitioningDelegate_protocol/index.html#//apple_ref/occ/intfm/UIViewControllerTransitioningDelegate/presentationControllerForPresentedViewController:presentingViewController:sourceViewController:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("presentationControllerForPresentedViewController:presentingViewController:sourceViewController:")
    default UIPresentationController presentationControllerForPresentedViewControllerPresentingViewControllerSourceViewController(
            UIViewController presented, UIViewController presenting, UIViewController source) {
        throw new java.lang.UnsupportedOperationException();
    }
}
