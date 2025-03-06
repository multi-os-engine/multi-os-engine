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
import apple.uikit.UITab;
import apple.uikit.UITabGroup;

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

    /**
     * Called when the selected tab has changed in the tab bar controller. The specified selected `tab` is either a root
     * tab or its decendants.
     * 
     * API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("tabBarController:didSelectTab:previousTab:")
    default void tabBarControllerDidSelectTabPreviousTab(@NotNull UITabBarController tabBarController,
            @NotNull UITab selectedTab, @Nullable UITab previousTab) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notifies the deleagte that the display order for the specified tab has been changed by the user.
     * 
     * API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("tabBarController:displayOrderDidChangeForGroup:")
    default void tabBarControllerDisplayOrderDidChangeForGroup(@NotNull UITabBarController tabBarController,
            @NotNull UITabGroup group) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Used with `UITabGroup.managingNavigationController`, this method allows the delegate to customize the displayed
     * view controllers
     * within the navigation stack for each level of selected tab. This method is called by the system if the selected
     * tab in the `UITabBarController`
     * belongs to or is in the hierarchy of a managing tab group (i.e. a `UITabGroup` with a non-nil
     * `managingNavigationController`). By default,
     * if this method is not implemented, the system will build the navigation stack by adding each tab's
     * `viewController` into the hierarchy, if one exists.
     * This is especially useful to hide certain view controllers when transitioning between compact and regular size
     * classes.
     * 
     * @param tabBarController        The tab bar controller managed by the delegate.
     * @param tab                     The tab for which the displayed view controllers is being requested for by its
     *                                `managingTabGroup`. Each tab in the selection hierarchy will be called once.
     * @param proposedViewControllers The proposed view controllers for the given tab. In general, the propoesd view
     *                                controller is a single-item array of the tab's viewController. If other view
     *                                controllers are pushed onto the navigation stack, they will be part of the last
     *                                (leafmost) tab's `proposedViewControllers` such that they are preserved between
     *                                updates.
     * 
     * @return A list of view controllers represented by the tab in the navigation stack.
     * 
     *         API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("tabBarController:displayedViewControllersForTab:proposedViewControllers:")
    @NotNull
    default NSArray<? extends UIViewController> tabBarControllerDisplayedViewControllersForTabProposedViewControllers(
            @NotNull UITabBarController tabBarController, @NotNull UITab tab,
            @NotNull NSArray<? extends UIViewController> proposedViewControllers) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Return YES if the specified `tab` can be selected by the user. Otherwise, return NO.
     * 
     * API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("tabBarController:shouldSelectTab:")
    default boolean tabBarControllerShouldSelectTab(@NotNull UITabBarController tabBarController, @NotNull UITab tab) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Receive the drop from into the tab using the specified session. This is only called if the drop operation
     * returned
     * from `tabBarController:tab:operationForAcceptingItemsFromDropSession` is valid for a drop.
     * 
     * API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("tabBarController:tab:acceptItemsFromDropSession:")
    default void tabBarControllerTabAcceptItemsFromDropSession(@NotNull UITabBarController tabBarController,
            @NotNull UITab tab, @Mapped(ObjCObjectMapper.class) @NotNull UIDropSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Determines if items from the specified drop session can be dropped into the specified `tab`. If the operation is
     * either a `.move` or `.copy`,
     * then the drop will proceed and `tabBarController:tab:acceptItemsFromDropSession:` is called. By default, the drop
     * will be
     * treated as a cancel operation if this is not implemented.
     * 
     * API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("tabBarController:tab:operationForAcceptingItemsFromDropSession:")
    @NUInt
    default long tabBarControllerTabOperationForAcceptingItemsFromDropSession(
            @NotNull UITabBarController tabBarController, @NotNull UITab tab,
            @Mapped(ObjCObjectMapper.class) @NotNull UIDropSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notifies the delegate when editing has ended and the specified tabs have had their `isHidden` values changed by
     * the user.
     * 
     * API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("tabBarController:visibilityDidChangeForTabs:")
    default void tabBarControllerVisibilityDidChangeForTabs(@NotNull UITabBarController tabBarController,
            @NotNull NSArray<? extends UITab> tabs) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notifies the delegate when the tab bar controller's current editing state has ended.
     * 
     * API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("tabBarControllerDidEndEditing:")
    default void tabBarControllerDidEndEditing(@NotNull UITabBarController tabBarController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notifies the delegate when the tab bar controller is about to begin editing.
     * 
     * API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("tabBarControllerWillBeginEditing:")
    default void tabBarControllerWillBeginEditing(@NotNull UITabBarController tabBarController) {
        throw new java.lang.UnsupportedOperationException();
    }
}
