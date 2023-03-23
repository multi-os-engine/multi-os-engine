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

import apple.uikit.UIBarButtonItem;
import apple.uikit.UIPopoverController;
import apple.uikit.UISplitViewController;
import apple.uikit.UIViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
@ObjCProtocolName("UISplitViewControllerDelegate")
public interface UISplitViewControllerDelegate {
    /**
     * Return the view controller which is to become the primary view controller after `splitViewController` is
     * collapsed due to a transition to
     * the horizontally-compact size class. If you return `nil`, then the argument will perform its default behavior
     * (i.e. to use its current primary view
     * controller).
     * 
     * API-Since: 8.0
     */
    @Generated
    @IsOptional
    @Selector("primaryViewControllerForCollapsingSplitViewController:")
    default UIViewController primaryViewControllerForCollapsingSplitViewController(
            UISplitViewController splitViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Return the view controller which is to become the primary view controller after the `splitViewController` is
     * expanded due to a transition
     * to the horizontally-regular size class. If you return `nil`, then the argument will perform its default behavior
     * (i.e. to use its current
     * primary view controller.)
     * 
     * API-Since: 8.0
     */
    @Generated
    @IsOptional
    @Selector("primaryViewControllerForExpandingSplitViewController:")
    default UIViewController primaryViewControllerForExpandingSplitViewController(
            UISplitViewController splitViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This method is called when a split view controller is collapsing its children for a transition to a compact-width
     * size class. Override this
     * method to perform custom adjustments to the view controller hierarchy of the target controller. When you return
     * from this method, you're
     * expected to have modified the `primaryViewController` so as to be suitable for display in a compact-width split
     * view controller, potentially
     * using `secondaryViewController` to do so. Return YES to prevent UIKit from applying its default behavior; return
     * NO to request that UIKit
     * perform its default collapsing behavior.
     * 
     * API-Since: 8.0
     */
    @Generated
    @IsOptional
    @Selector("splitViewController:collapseSecondaryViewController:ontoPrimaryViewController:")
    default boolean splitViewControllerCollapseSecondaryViewControllerOntoPrimaryViewController(
            UISplitViewController splitViewController, UIViewController secondaryViewController,
            UIViewController primaryViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the view controller is shown in a popover so the delegate can take action like hiding other popovers.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 8.0
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("splitViewController:popoverController:willPresentViewController:")
    default void splitViewControllerPopoverControllerWillPresentViewController(UISplitViewController svc,
            UIPopoverController pc, UIViewController aViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This method is called when a split view controller is separating its child into two children for a transition
     * from a compact-width size
     * class to a regular-width size class. Override this method to perform custom separation behavior. The controller
     * returned from this method
     * will be set as the secondary view controller of the split view controller. When you return from this method,
     * `primaryViewController` should
     * have been configured for display in a regular-width split view controller. If you return `nil`, then
     * `UISplitViewController` will perform
     * its default behavior.
     * 
     * API-Since: 8.0
     */
    @Generated
    @IsOptional
    @Selector("splitViewController:separateSecondaryViewControllerFromPrimaryViewController:")
    default UIViewController splitViewControllerSeparateSecondaryViewControllerFromPrimaryViewController(
            UISplitViewController splitViewController, UIViewController primaryViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Returns YES if a view controller should be hidden by the split view controller in a given orientation.
     * (This method is only called on the leftmost view controller and only discriminates portrait from landscape.)
     * 
     * API-Since: 5.0
     * Deprecated-Since: 8.0
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("splitViewController:shouldHideViewController:inOrientation:")
    default boolean splitViewControllerShouldHideViewControllerInOrientation(UISplitViewController svc,
            UIViewController vc, @NInt long orientation) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Override this method to customize the behavior of `showDetailViewController:` on a split view controller. Return
     * YES to indicate that you've
     * handled the action yourself; return NO to cause the default behavior to be executed.
     * 
     * API-Since: 8.0
     */
    @Generated
    @IsOptional
    @Selector("splitViewController:showDetailViewController:sender:")
    default boolean splitViewControllerShowDetailViewControllerSender(UISplitViewController splitViewController,
            UIViewController vc, @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Override this method to customize the behavior of `showViewController:` on a split view controller. Return YES to
     * indicate that you've handled
     * the action yourself; return NO to cause the default behavior to be executed.
     * 
     * API-Since: 8.0
     */
    @Generated
    @IsOptional
    @Selector("splitViewController:showViewController:sender:")
    default boolean splitViewControllerShowViewControllerSender(UISplitViewController splitViewController,
            UIViewController vc, @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This method allows a client to update any bar button items etc.
     * 
     * API-Since: 8.0
     */
    @Generated
    @IsOptional
    @Selector("splitViewController:willChangeToDisplayMode:")
    default void splitViewControllerWillChangeToDisplayMode(UISplitViewController svc, @NInt long displayMode) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a button should be added to a toolbar for a hidden view controller.
     * Implementing this method allows the hidden view controller to be presented via a swipe gesture if
     * 'presentsWithGesture' is 'YES' (the default).
     * 
     * API-Since: 2.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use splitViewController:willChangeToDisplayMode: and displayModeButtonItem instead
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("splitViewController:willHideViewController:withBarButtonItem:forPopoverController:")
    default void splitViewControllerWillHideViewControllerWithBarButtonItemForPopoverController(
            UISplitViewController svc, UIViewController aViewController, UIBarButtonItem barButtonItem,
            UIPopoverController pc) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the view is shown again in the split view, invalidating the button and popover controller.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use splitViewController:willChangeToDisplayMode: and displayModeButtonItem instead
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("splitViewController:willShowViewController:invalidatingBarButtonItem:")
    default void splitViewControllerWillShowViewControllerInvalidatingBarButtonItem(UISplitViewController svc,
            UIViewController aViewController, UIBarButtonItem barButtonItem) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("splitViewControllerPreferredInterfaceOrientationForPresentation:")
    @NInt
    default long splitViewControllerPreferredInterfaceOrientationForPresentation(
            UISplitViewController splitViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("splitViewControllerSupportedInterfaceOrientations:")
    @NUInt
    default long splitViewControllerSupportedInterfaceOrientations(UISplitViewController splitViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called by the gesture AND barButtonItem to determine what they will set the display mode to (and what the
     * displayModeButtonItem's appearance will be.) Return UISplitViewControllerDisplayModeAutomatic to get the default
     * behavior.
     * 
     * API-Since: 8.0
     */
    @Generated
    @IsOptional
    @Selector("targetDisplayModeForActionInSplitViewController:")
    @NInt
    default long targetDisplayModeForActionInSplitViewController(UISplitViewController svc) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 14.0
     */
    @Generated
    @IsOptional
    @Selector("splitViewController:displayModeForExpandingToProposedDisplayMode:")
    @NInt
    default long splitViewControllerDisplayModeForExpandingToProposedDisplayMode(UISplitViewController svc,
            @NInt long proposedDisplayMode) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 14.0
     */
    @Generated
    @IsOptional
    @Selector("splitViewController:topColumnForCollapsingToProposedTopColumn:")
    @NInt
    default long splitViewControllerTopColumnForCollapsingToProposedTopColumn(UISplitViewController svc,
            @NInt long proposedTopColumn) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 14.0
     */
    @Generated
    @IsOptional
    @Selector("splitViewController:willHideColumn:")
    default void splitViewControllerWillHideColumn(UISplitViewController svc, @NInt long column) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 14.0
     */
    @Generated
    @IsOptional
    @Selector("splitViewController:willShowColumn:")
    default void splitViewControllerWillShowColumn(UISplitViewController svc, @NInt long column) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 14.0
     */
    @Generated
    @IsOptional
    @Selector("splitViewControllerDidCollapse:")
    default void splitViewControllerDidCollapse(UISplitViewController svc) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 14.0
     */
    @Generated
    @IsOptional
    @Selector("splitViewControllerDidExpand:")
    default void splitViewControllerDidExpand(UISplitViewController svc) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 14.0
     */
    @Generated
    @IsOptional
    @Selector("splitViewControllerInteractivePresentationGestureDidEnd:")
    default void splitViewControllerInteractivePresentationGestureDidEnd(UISplitViewController svc) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 14.0
     */
    @Generated
    @IsOptional
    @Selector("splitViewControllerInteractivePresentationGestureWillBegin:")
    default void splitViewControllerInteractivePresentationGestureWillBegin(UISplitViewController svc) {
        throw new java.lang.UnsupportedOperationException();
    }
}
