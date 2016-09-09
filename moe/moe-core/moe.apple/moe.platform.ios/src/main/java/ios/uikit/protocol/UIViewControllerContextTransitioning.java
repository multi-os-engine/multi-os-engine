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


import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.coregraphics.struct.CGAffineTransform;
import ios.coregraphics.struct.CGRect;
import ios.uikit.UIView;
import ios.uikit.UIViewController;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIViewControllerContextTransitioning")
public interface UIViewControllerContextTransitioning {
	/**
	 * cancelInteractiveTransition</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerContextTransitioning_protocol/index.html#//apple_ref/occ/intfm/UIViewControllerContextTransitioning/cancelInteractiveTransition">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cancelInteractiveTransition")
	void cancelInteractiveTransition();

	/**
	 * completeTransition:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerContextTransitioning_protocol/index.html#//apple_ref/occ/intfm/UIViewControllerContextTransitioning/completeTransition:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("completeTransition:")
	void completeTransition(boolean didComplete);

	/**
	 * containerView</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerContextTransitioning_protocol/index.html#//apple_ref/occ/intfm/UIViewControllerContextTransitioning/containerView">iOS Dev Center</a>
	 */
	@Generated
	@Selector("containerView")
	UIView containerView();

	/**
	 * finalFrameForViewController:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerContextTransitioning_protocol/index.html#//apple_ref/occ/intfm/UIViewControllerContextTransitioning/finalFrameForViewController:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("finalFrameForViewController:")
	@ByValue
	CGRect finalFrameForViewController(UIViewController vc);

	/**
	 * finishInteractiveTransition</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerContextTransitioning_protocol/index.html#//apple_ref/occ/intfm/UIViewControllerContextTransitioning/finishInteractiveTransition">iOS Dev Center</a>
	 */
	@Generated
	@Selector("finishInteractiveTransition")
	void finishInteractiveTransition();

	/**
	 * initialFrameForViewController:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerContextTransitioning_protocol/index.html#//apple_ref/occ/intfm/UIViewControllerContextTransitioning/initialFrameForViewController:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initialFrameForViewController:")
	@ByValue
	CGRect initialFrameForViewController(UIViewController vc);

	/**
	 * isAnimated</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerContextTransitioning_protocol/index.html#//apple_ref/occ/intfm/UIViewControllerContextTransitioning/isAnimated">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isAnimated")
	boolean isAnimated();

	/**
	 * isInteractive</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerContextTransitioning_protocol/index.html#//apple_ref/occ/intfm/UIViewControllerContextTransitioning/isInteractive">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isInteractive")
	boolean isInteractive();

	/**
	 * presentationStyle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerContextTransitioning_protocol/index.html#//apple_ref/occ/intfm/UIViewControllerContextTransitioning/presentationStyle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("presentationStyle")
	@NInt
	long presentationStyle();

	/**
	 * targetTransform</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerContextTransitioning_protocol/index.html#//apple_ref/occ/intfm/UIViewControllerContextTransitioning/targetTransform">iOS Dev Center</a>
	 */
	@Generated
	@Selector("targetTransform")
	@ByValue
	CGAffineTransform targetTransform();

	/**
	 * transitionWasCancelled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerContextTransitioning_protocol/index.html#//apple_ref/occ/intfm/UIViewControllerContextTransitioning/transitionWasCancelled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("transitionWasCancelled")
	boolean transitionWasCancelled();

	/**
	 * updateInteractiveTransition:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerContextTransitioning_protocol/index.html#//apple_ref/occ/intfm/UIViewControllerContextTransitioning/updateInteractiveTransition:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("updateInteractiveTransition:")
	void updateInteractiveTransition(@NFloat double percentComplete);

	/**
	 * viewControllerForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerContextTransitioning_protocol/index.html#//apple_ref/occ/intfm/UIViewControllerContextTransitioning/viewControllerForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("viewControllerForKey:")
	UIViewController viewControllerForKey(String key);

	/**
	 * viewForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerContextTransitioning_protocol/index.html#//apple_ref/occ/intfm/UIViewControllerContextTransitioning/viewForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("viewForKey:")
	UIView viewForKey(String key);
}
