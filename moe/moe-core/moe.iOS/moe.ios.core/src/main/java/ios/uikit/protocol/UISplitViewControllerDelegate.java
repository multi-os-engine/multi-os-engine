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

package ios.uikit.protocol;


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

import ios.uikit.UIBarButtonItem;
import ios.uikit.UIPopoverController;
import ios.uikit.UISplitViewController;
import ios.uikit.UIViewController;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UISplitViewControllerDelegate")
public interface UISplitViewControllerDelegate {
	/**
	 * primaryViewControllerForCollapsingSplitViewController:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UISplitViewControllerDelegate/primaryViewControllerForCollapsingSplitViewController:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("primaryViewControllerForCollapsingSplitViewController:")
	default UIViewController primaryViewControllerForCollapsingSplitViewController(
			UISplitViewController splitViewController) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * primaryViewControllerForExpandingSplitViewController:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UISplitViewControllerDelegate/primaryViewControllerForExpandingSplitViewController:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("primaryViewControllerForExpandingSplitViewController:")
	default UIViewController primaryViewControllerForExpandingSplitViewController(
			UISplitViewController splitViewController) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * splitViewController:collapseSecondaryViewController:ontoPrimaryViewController:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UISplitViewControllerDelegate/splitViewController:collapseSecondaryViewController:ontoPrimaryViewController:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("splitViewController:collapseSecondaryViewController:ontoPrimaryViewController:")
	default boolean splitViewControllerCollapseSecondaryViewControllerOntoPrimaryViewController(
			UISplitViewController splitViewController,
			UIViewController secondaryViewController,
			UIViewController primaryViewController) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * splitViewController:popoverController:willPresentViewController:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UISplitViewControllerDelegate/splitViewController:popoverController:willPresentViewController:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Deprecated
	@Selector("splitViewController:popoverController:willPresentViewController:")
	default void splitViewControllerPopoverControllerWillPresentViewController(
			UISplitViewController svc, UIPopoverController pc,
			UIViewController aViewController) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * splitViewController:separateSecondaryViewControllerFromPrimaryViewController:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UISplitViewControllerDelegate/splitViewController:separateSecondaryViewControllerFromPrimaryViewController:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("splitViewController:separateSecondaryViewControllerFromPrimaryViewController:")
	default UIViewController splitViewControllerSeparateSecondaryViewControllerFromPrimaryViewController(
			UISplitViewController splitViewController,
			UIViewController primaryViewController) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * splitViewController:shouldHideViewController:inOrientation:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UISplitViewControllerDelegate/splitViewController:shouldHideViewController:inOrientation:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Deprecated
	@Selector("splitViewController:shouldHideViewController:inOrientation:")
	default boolean splitViewControllerShouldHideViewControllerInOrientation(
			UISplitViewController svc, UIViewController vc,
			@NInt long orientation) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * splitViewController:showDetailViewController:sender:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UISplitViewControllerDelegate/splitViewController:showDetailViewController:sender:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("splitViewController:showDetailViewController:sender:")
	default boolean splitViewControllerShowDetailViewControllerSender(
			UISplitViewController splitViewController, UIViewController vc,
			@Mapped(ObjCObjectMapper.class) Object sender) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * splitViewController:showViewController:sender:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UISplitViewControllerDelegate/splitViewController:showViewController:sender:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("splitViewController:showViewController:sender:")
	default boolean splitViewControllerShowViewControllerSender(
			UISplitViewController splitViewController, UIViewController vc,
			@Mapped(ObjCObjectMapper.class) Object sender) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * splitViewController:willChangeToDisplayMode:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UISplitViewControllerDelegate/splitViewController:willChangeToDisplayMode:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("splitViewController:willChangeToDisplayMode:")
	default void splitViewControllerWillChangeToDisplayMode(
			UISplitViewController svc, @NInt long displayMode) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * splitViewController:willHideViewController:withBarButtonItem:forPopoverController:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UISplitViewControllerDelegate/splitViewController:willHideViewController:withBarButtonItem:forPopoverController:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Deprecated
	@Selector("splitViewController:willHideViewController:withBarButtonItem:forPopoverController:")
	default void splitViewControllerWillHideViewControllerWithBarButtonItemForPopoverController(
			UISplitViewController svc, UIViewController aViewController,
			UIBarButtonItem barButtonItem, UIPopoverController pc) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * splitViewController:willShowViewController:invalidatingBarButtonItem:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UISplitViewControllerDelegate/splitViewController:willShowViewController:invalidatingBarButtonItem:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Deprecated
	@Selector("splitViewController:willShowViewController:invalidatingBarButtonItem:")
	default void splitViewControllerWillShowViewControllerInvalidatingBarButtonItem(
			UISplitViewController svc, UIViewController aViewController,
			UIBarButtonItem barButtonItem) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * splitViewControllerPreferredInterfaceOrientationForPresentation:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UISplitViewControllerDelegate/splitViewControllerPreferredInterfaceOrientationForPresentation:">iOS Dev Center</a>
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
	 * splitViewControllerSupportedInterfaceOrientations:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UISplitViewControllerDelegate/splitViewControllerSupportedInterfaceOrientations:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("splitViewControllerSupportedInterfaceOrientations:")
	@NUInt
	default long splitViewControllerSupportedInterfaceOrientations(
			UISplitViewController splitViewController) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * targetDisplayModeForActionInSplitViewController:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UISplitViewControllerDelegate/targetDisplayModeForActionInSplitViewController:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("targetDisplayModeForActionInSplitViewController:")
	@NInt
	default long targetDisplayModeForActionInSplitViewController(
			UISplitViewController svc) {
		throw new java.lang.UnsupportedOperationException();
	}
}
