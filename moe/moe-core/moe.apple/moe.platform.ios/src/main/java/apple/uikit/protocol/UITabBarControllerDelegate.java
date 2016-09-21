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

import apple.foundation.NSArray;
import apple.uikit.UITabBarController;
import apple.uikit.UIViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITabBarControllerDelegate")
public interface UITabBarControllerDelegate {
    @Generated
    @IsOptional
    @Selector("tabBarController:animationControllerForTransitionFromViewController:toViewController:")
    @MappedReturn(ObjCObjectMapper.class)
    default Object tabBarControllerAnimationControllerForTransitionFromViewControllerToViewController(
            UITabBarController tabBarController, UIViewController fromVC, UIViewController toVC) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tabBarController:didEndCustomizingViewControllers:changed:")
    default void tabBarControllerDidEndCustomizingViewControllersChanged(UITabBarController tabBarController,
            NSArray<? extends UIViewController> viewControllers, boolean changed) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tabBarController:didSelectViewController:")
    default void tabBarControllerDidSelectViewController(UITabBarController tabBarController,
            UIViewController viewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tabBarController:interactionControllerForAnimationController:")
    @MappedReturn(ObjCObjectMapper.class)
    default Object tabBarControllerInteractionControllerForAnimationController(UITabBarController tabBarController,
            @Mapped(ObjCObjectMapper.class) Object animationController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tabBarController:shouldSelectViewController:")
    default boolean tabBarControllerShouldSelectViewController(UITabBarController tabBarController,
            UIViewController viewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tabBarController:willBeginCustomizingViewControllers:")
    default void tabBarControllerWillBeginCustomizingViewControllers(UITabBarController tabBarController,
            NSArray<? extends UIViewController> viewControllers) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tabBarController:willEndCustomizingViewControllers:changed:")
    default void tabBarControllerWillEndCustomizingViewControllersChanged(UITabBarController tabBarController,
            NSArray<? extends UIViewController> viewControllers, boolean changed) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tabBarControllerPreferredInterfaceOrientationForPresentation:")
    @NInt
    default long tabBarControllerPreferredInterfaceOrientationForPresentation(UITabBarController tabBarController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tabBarControllerSupportedInterfaceOrientations:")
    @NUInt
    default long tabBarControllerSupportedInterfaceOrientations(UITabBarController tabBarController) {
        throw new java.lang.UnsupportedOperationException();
    }
}
