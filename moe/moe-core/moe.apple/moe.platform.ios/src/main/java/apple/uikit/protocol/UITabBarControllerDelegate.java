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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITabBarControllerDelegate")
public interface UITabBarControllerDelegate {
    /**
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("tabBarController:animationControllerForTransitionFromViewController:toViewController:")
    @MappedReturn(ObjCObjectMapper.class)
    default UIViewControllerAnimatedTransitioning tabBarControllerAnimationControllerForTransitionFromViewControllerToViewController(
            @NotNull UITabBarController tabBarController, @NotNull UIViewController fromVC,
            @NotNull UIViewController toVC) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tabBarController:didEndCustomizingViewControllers:changed:")
    default void tabBarControllerDidEndCustomizingViewControllersChanged(@NotNull UITabBarController tabBarController,
            @NotNull NSArray<? extends UIViewController> viewControllers, boolean changed) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tabBarController:didSelectViewController:")
    default void tabBarControllerDidSelectViewController(@NotNull UITabBarController tabBarController,
            @NotNull UIViewController viewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("tabBarController:interactionControllerForAnimationController:")
    @MappedReturn(ObjCObjectMapper.class)
    default UIViewControllerInteractiveTransitioning tabBarControllerInteractionControllerForAnimationController(
            @NotNull UITabBarController tabBarController,
            @NotNull @Mapped(ObjCObjectMapper.class) UIViewControllerAnimatedTransitioning animationController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 3.0
     */
    @Generated
    @IsOptional
    @Selector("tabBarController:shouldSelectViewController:")
    default boolean tabBarControllerShouldSelectViewController(@NotNull UITabBarController tabBarController,
            @NotNull UIViewController viewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 3.0
     */
    @Generated
    @IsOptional
    @Selector("tabBarController:willBeginCustomizingViewControllers:")
    default void tabBarControllerWillBeginCustomizingViewControllers(@NotNull UITabBarController tabBarController,
            @NotNull NSArray<? extends UIViewController> viewControllers) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 3.0
     */
    @Generated
    @IsOptional
    @Selector("tabBarController:willEndCustomizingViewControllers:changed:")
    default void tabBarControllerWillEndCustomizingViewControllersChanged(@NotNull UITabBarController tabBarController,
            @NotNull NSArray<? extends UIViewController> viewControllers, boolean changed) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("tabBarControllerPreferredInterfaceOrientationForPresentation:")
    @NInt
    default long tabBarControllerPreferredInterfaceOrientationForPresentation(
            @NotNull UITabBarController tabBarController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("tabBarControllerSupportedInterfaceOrientations:")
    @NUInt
    default long tabBarControllerSupportedInterfaceOrientations(@NotNull UITabBarController tabBarController) {
        throw new java.lang.UnsupportedOperationException();
    }
}
