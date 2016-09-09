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
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.foundation.NSArray;
import ios.uikit.UITabBarController;
import ios.uikit.UIViewController;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITabBarControllerDelegate")
public interface UITabBarControllerDelegate {
	/**
	 * tabBarController:animationControllerForTransitionFromViewController:toViewController:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITabBarControllerDelegate/tabBarController:animationControllerForTransitionFromViewController:toViewController:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tabBarController:animationControllerForTransitionFromViewController:toViewController:")
	@MappedReturn(ObjCObjectMapper.class)
	default Object tabBarControllerAnimationControllerForTransitionFromViewControllerToViewController(
			UITabBarController tabBarController, UIViewController fromVC,
			UIViewController toVC) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tabBarController:didEndCustomizingViewControllers:changed:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITabBarControllerDelegate/tabBarController:didEndCustomizingViewControllers:changed:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tabBarController:didEndCustomizingViewControllers:changed:")
	default void tabBarControllerDidEndCustomizingViewControllersChanged(
			UITabBarController tabBarController, NSArray<? extends UIViewController> viewControllers,
			boolean changed) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tabBarController:didSelectViewController:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITabBarControllerDelegate/tabBarController:didSelectViewController:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tabBarController:didSelectViewController:")
	default void tabBarControllerDidSelectViewController(
			UITabBarController tabBarController, UIViewController viewController) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tabBarController:interactionControllerForAnimationController:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITabBarControllerDelegate/tabBarController:interactionControllerForAnimationController:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tabBarController:interactionControllerForAnimationController:")
	@MappedReturn(ObjCObjectMapper.class)
	default Object tabBarControllerInteractionControllerForAnimationController(
			UITabBarController tabBarController,
			@Mapped(ObjCObjectMapper.class) Object animationController) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tabBarController:shouldSelectViewController:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITabBarControllerDelegate/tabBarController:shouldSelectViewController:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tabBarController:shouldSelectViewController:")
	default boolean tabBarControllerShouldSelectViewController(
			UITabBarController tabBarController, UIViewController viewController) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tabBarController:willBeginCustomizingViewControllers:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITabBarControllerDelegate/tabBarController:willBeginCustomizingViewControllers:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tabBarController:willBeginCustomizingViewControllers:")
	default void tabBarControllerWillBeginCustomizingViewControllers(
			UITabBarController tabBarController, NSArray<? extends UIViewController> viewControllers) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tabBarController:willEndCustomizingViewControllers:changed:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITabBarControllerDelegate/tabBarController:willEndCustomizingViewControllers:changed:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tabBarController:willEndCustomizingViewControllers:changed:")
	default void tabBarControllerWillEndCustomizingViewControllersChanged(
			UITabBarController tabBarController, NSArray<? extends UIViewController> viewControllers,
			boolean changed) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tabBarControllerPreferredInterfaceOrientationForPresentation:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITabBarControllerDelegate/tabBarControllerPreferredInterfaceOrientationForPresentation:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tabBarControllerPreferredInterfaceOrientationForPresentation:")
	@NInt
	default long tabBarControllerPreferredInterfaceOrientationForPresentation(
			UITabBarController tabBarController) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tabBarControllerSupportedInterfaceOrientations:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITabBarControllerDelegate/tabBarControllerSupportedInterfaceOrientations:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tabBarControllerSupportedInterfaceOrientations:")
	@NUInt
	default long tabBarControllerSupportedInterfaceOrientations(
			UITabBarController tabBarController) {
		throw new java.lang.UnsupportedOperationException();
	}
}
