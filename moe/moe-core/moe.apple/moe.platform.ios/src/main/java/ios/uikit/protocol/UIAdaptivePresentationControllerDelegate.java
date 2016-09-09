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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.uikit.UIPresentationController;
import ios.uikit.UITraitCollection;
import ios.uikit.UIViewController;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIAdaptivePresentationControllerDelegate")
public interface UIAdaptivePresentationControllerDelegate {
	/**
	 * adaptivePresentationStyleForPresentationController:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAdaptivePresentationControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UIAdaptivePresentationControllerDelegate/adaptivePresentationStyleForPresentationController:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("adaptivePresentationStyleForPresentationController:")
	@NInt
	default long adaptivePresentationStyleForPresentationController(
			UIPresentationController controller) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * adaptivePresentationStyleForPresentationController:traitCollection:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAdaptivePresentationControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UIAdaptivePresentationControllerDelegate/adaptivePresentationStyleForPresentationController:traitCollection:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("adaptivePresentationStyleForPresentationController:traitCollection:")
	@NInt
	default long adaptivePresentationStyleForPresentationControllerTraitCollection(
			UIPresentationController controller,
			UITraitCollection traitCollection) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * presentationController:viewControllerForAdaptivePresentationStyle:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAdaptivePresentationControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UIAdaptivePresentationControllerDelegate/presentationController:viewControllerForAdaptivePresentationStyle:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("presentationController:viewControllerForAdaptivePresentationStyle:")
	default UIViewController presentationControllerViewControllerForAdaptivePresentationStyle(
			UIPresentationController controller, @NInt long style) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * presentationController:willPresentWithAdaptiveStyle:transitionCoordinator:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAdaptivePresentationControllerDelegate_protocol/index.html#//apple_ref/occ/intfm/UIAdaptivePresentationControllerDelegate/presentationController:willPresentWithAdaptiveStyle:transitionCoordinator:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("presentationController:willPresentWithAdaptiveStyle:transitionCoordinator:")
	default void presentationControllerWillPresentWithAdaptiveStyleTransitionCoordinator(
			UIPresentationController presentationController, @NInt long style,
			@Mapped(ObjCObjectMapper.class) Object transitionCoordinator) {
		throw new java.lang.UnsupportedOperationException();
	}
}
