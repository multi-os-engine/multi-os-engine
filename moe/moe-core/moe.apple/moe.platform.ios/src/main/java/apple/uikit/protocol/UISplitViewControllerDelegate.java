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
    @Generated
    @IsOptional
    @Selector("primaryViewControllerForCollapsingSplitViewController:")
    default UIViewController primaryViewControllerForCollapsingSplitViewController(
            UISplitViewController splitViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("primaryViewControllerForExpandingSplitViewController:")
    default UIViewController primaryViewControllerForExpandingSplitViewController(
            UISplitViewController splitViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("splitViewController:collapseSecondaryViewController:ontoPrimaryViewController:")
    default boolean splitViewControllerCollapseSecondaryViewControllerOntoPrimaryViewController(
            UISplitViewController splitViewController, UIViewController secondaryViewController,
            UIViewController primaryViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Deprecated
    @Selector("splitViewController:popoverController:willPresentViewController:")
    default void splitViewControllerPopoverControllerWillPresentViewController(UISplitViewController svc,
            UIPopoverController pc, UIViewController aViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("splitViewController:separateSecondaryViewControllerFromPrimaryViewController:")
    default UIViewController splitViewControllerSeparateSecondaryViewControllerFromPrimaryViewController(
            UISplitViewController splitViewController, UIViewController primaryViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Deprecated
    @Selector("splitViewController:shouldHideViewController:inOrientation:")
    default boolean splitViewControllerShouldHideViewControllerInOrientation(UISplitViewController svc,
            UIViewController vc, @NInt long orientation) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("splitViewController:showDetailViewController:sender:")
    default boolean splitViewControllerShowDetailViewControllerSender(UISplitViewController splitViewController,
            UIViewController vc, @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("splitViewController:showViewController:sender:")
    default boolean splitViewControllerShowViewControllerSender(UISplitViewController splitViewController,
            UIViewController vc, @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("splitViewController:willChangeToDisplayMode:")
    default void splitViewControllerWillChangeToDisplayMode(UISplitViewController svc, @NInt long displayMode) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Deprecated
    @Selector("splitViewController:willHideViewController:withBarButtonItem:forPopoverController:")
    default void splitViewControllerWillHideViewControllerWithBarButtonItemForPopoverController(
            UISplitViewController svc, UIViewController aViewController, UIBarButtonItem barButtonItem,
            UIPopoverController pc) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Deprecated
    @Selector("splitViewController:willShowViewController:invalidatingBarButtonItem:")
    default void splitViewControllerWillShowViewControllerInvalidatingBarButtonItem(UISplitViewController svc,
            UIViewController aViewController, UIBarButtonItem barButtonItem) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("splitViewControllerPreferredInterfaceOrientationForPresentation:")
    @NInt
    default long splitViewControllerPreferredInterfaceOrientationForPresentation(
            UISplitViewController splitViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("splitViewControllerSupportedInterfaceOrientations:")
    @NUInt
    default long splitViewControllerSupportedInterfaceOrientations(UISplitViewController splitViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("targetDisplayModeForActionInSplitViewController:")
    @NInt
    default long targetDisplayModeForActionInSplitViewController(UISplitViewController svc) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("splitViewController:displayModeForExpandingToProposedDisplayMode:")
    @NInt
    default long splitViewControllerDisplayModeForExpandingToProposedDisplayMode(UISplitViewController svc,
            @NInt long proposedDisplayMode) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("splitViewController:topColumnForCollapsingToProposedTopColumn:")
    @NInt
    default long splitViewControllerTopColumnForCollapsingToProposedTopColumn(UISplitViewController svc,
            @NInt long proposedTopColumn) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("splitViewController:willHideColumn:")
    default void splitViewControllerWillHideColumn(UISplitViewController svc, @NInt long column) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("splitViewController:willShowColumn:")
    default void splitViewControllerWillShowColumn(UISplitViewController svc, @NInt long column) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("splitViewControllerDidCollapse:")
    default void splitViewControllerDidCollapse(UISplitViewController svc) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("splitViewControllerDidExpand:")
    default void splitViewControllerDidExpand(UISplitViewController svc) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("splitViewControllerInteractivePresentationGestureDidEnd:")
    default void splitViewControllerInteractivePresentationGestureDidEnd(UISplitViewController svc) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("splitViewControllerInteractivePresentationGestureWillBegin:")
    default void splitViewControllerInteractivePresentationGestureWillBegin(UISplitViewController svc) {
        throw new java.lang.UnsupportedOperationException();
    }
}
