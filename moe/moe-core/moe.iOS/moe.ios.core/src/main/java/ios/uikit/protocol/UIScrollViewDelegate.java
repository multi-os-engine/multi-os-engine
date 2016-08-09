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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.coregraphics.struct.CGPoint;
import ios.uikit.UIScrollView;
import ios.uikit.UIView;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIScrollViewDelegate")
public interface UIScrollViewDelegate {
	/**
	 * scrollViewDidEndDecelerating:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIScrollViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIScrollViewDelegate/scrollViewDidEndDecelerating:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("scrollViewDidEndDecelerating:")
	default void scrollViewDidEndDecelerating(UIScrollView scrollView) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * scrollViewDidEndDragging:willDecelerate:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIScrollViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIScrollViewDelegate/scrollViewDidEndDragging:willDecelerate:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("scrollViewDidEndDragging:willDecelerate:")
	default void scrollViewDidEndDraggingWillDecelerate(
			UIScrollView scrollView, boolean decelerate) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * scrollViewDidEndScrollingAnimation:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIScrollViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIScrollViewDelegate/scrollViewDidEndScrollingAnimation:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("scrollViewDidEndScrollingAnimation:")
	default void scrollViewDidEndScrollingAnimation(
			UIScrollView scrollView) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * scrollViewDidEndZooming:withView:atScale:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIScrollViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIScrollViewDelegate/scrollViewDidEndZooming:withView:atScale:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("scrollViewDidEndZooming:withView:atScale:")
	default void scrollViewDidEndZoomingWithViewAtScale(
			UIScrollView scrollView, UIView view, @NFloat double scale) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * scrollViewDidScroll:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIScrollViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIScrollViewDelegate/scrollViewDidScroll:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("scrollViewDidScroll:")
	default void scrollViewDidScroll(UIScrollView scrollView) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * scrollViewDidScrollToTop:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIScrollViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIScrollViewDelegate/scrollViewDidScrollToTop:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("scrollViewDidScrollToTop:")
	default void scrollViewDidScrollToTop(UIScrollView scrollView) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * scrollViewDidZoom:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIScrollViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIScrollViewDelegate/scrollViewDidZoom:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("scrollViewDidZoom:")
	default void scrollViewDidZoom(UIScrollView scrollView) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * scrollViewShouldScrollToTop:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIScrollViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIScrollViewDelegate/scrollViewShouldScrollToTop:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("scrollViewShouldScrollToTop:")
	default boolean scrollViewShouldScrollToTop(UIScrollView scrollView) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * scrollViewWillBeginDecelerating:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIScrollViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIScrollViewDelegate/scrollViewWillBeginDecelerating:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("scrollViewWillBeginDecelerating:")
	default void scrollViewWillBeginDecelerating(UIScrollView scrollView) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * scrollViewWillBeginDragging:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIScrollViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIScrollViewDelegate/scrollViewWillBeginDragging:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("scrollViewWillBeginDragging:")
	default void scrollViewWillBeginDragging(UIScrollView scrollView) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * scrollViewWillBeginZooming:withView:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIScrollViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIScrollViewDelegate/scrollViewWillBeginZooming:withView:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("scrollViewWillBeginZooming:withView:")
	default void scrollViewWillBeginZoomingWithView(
			UIScrollView scrollView, UIView view) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * scrollViewWillEndDragging:withVelocity:targetContentOffset:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIScrollViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIScrollViewDelegate/scrollViewWillEndDragging:withVelocity:targetContentOffset:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("scrollViewWillEndDragging:withVelocity:targetContentOffset:")
	default void scrollViewWillEndDraggingWithVelocityTargetContentOffset(
			UIScrollView scrollView,
			@ByValue CGPoint velocity,
			CGPoint targetContentOffset) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * viewForZoomingInScrollView:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIScrollViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIScrollViewDelegate/viewForZoomingInScrollView:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("viewForZoomingInScrollView:")
	default UIView viewForZoomingInScrollView(UIScrollView scrollView) {
		throw new java.lang.UnsupportedOperationException();
	}
}
