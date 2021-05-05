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
    @Generated
    @IsOptional
    @Selector("animationControllerForDismissedController:")
    @MappedReturn(ObjCObjectMapper.class)
    default UIViewControllerAnimatedTransitioning animationControllerForDismissedController(
            UIViewController dismissed) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("animationControllerForPresentedController:presentingController:sourceController:")
    @MappedReturn(ObjCObjectMapper.class)
    default UIViewControllerAnimatedTransitioning animationControllerForPresentedControllerPresentingControllerSourceController(
            UIViewController presented, UIViewController presenting, UIViewController source) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("interactionControllerForDismissal:")
    @MappedReturn(ObjCObjectMapper.class)
    default UIViewControllerInteractiveTransitioning interactionControllerForDismissal(
            @Mapped(ObjCObjectMapper.class) UIViewControllerAnimatedTransitioning animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("interactionControllerForPresentation:")
    @MappedReturn(ObjCObjectMapper.class)
    default UIViewControllerInteractiveTransitioning interactionControllerForPresentation(
            @Mapped(ObjCObjectMapper.class) UIViewControllerAnimatedTransitioning animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("presentationControllerForPresentedViewController:presentingViewController:sourceViewController:")
    default UIPresentationController presentationControllerForPresentedViewControllerPresentingViewControllerSourceViewController(
            UIViewController presented, UIViewController presenting, UIViewController source) {
        throw new java.lang.UnsupportedOperationException();
    }
}
