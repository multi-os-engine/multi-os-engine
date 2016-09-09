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
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.uikit.UIActionSheet;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIActionSheetDelegate")
public interface UIActionSheetDelegate {
	/**
	 * actionSheet:clickedButtonAtIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIModalViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIActionSheetDelegate/actionSheet:clickedButtonAtIndex:">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@IsOptional
	@Selector("actionSheet:clickedButtonAtIndex:")
	default void actionSheetClickedButtonAtIndex(
			UIActionSheet actionSheet, @NInt long buttonIndex) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * actionSheet:didDismissWithButtonIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIModalViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIActionSheetDelegate/actionSheet:didDismissWithButtonIndex:">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@IsOptional
	@Selector("actionSheet:didDismissWithButtonIndex:")
	default void actionSheetDidDismissWithButtonIndex(
			UIActionSheet actionSheet, @NInt long buttonIndex) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * actionSheet:willDismissWithButtonIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIModalViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIActionSheetDelegate/actionSheet:willDismissWithButtonIndex:">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@IsOptional
	@Selector("actionSheet:willDismissWithButtonIndex:")
	default void actionSheetWillDismissWithButtonIndex(
			UIActionSheet actionSheet, @NInt long buttonIndex) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * actionSheetCancel:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIModalViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIActionSheetDelegate/actionSheetCancel:">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@IsOptional
	@Selector("actionSheetCancel:")
	default void actionSheetCancel(UIActionSheet actionSheet) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * didPresentActionSheet:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIModalViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIActionSheetDelegate/didPresentActionSheet:">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@IsOptional
	@Selector("didPresentActionSheet:")
	default void didPresentActionSheet(UIActionSheet actionSheet) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * willPresentActionSheet:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIModalViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIActionSheetDelegate/willPresentActionSheet:">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@IsOptional
	@Selector("willPresentActionSheet:")
	default void willPresentActionSheet(UIActionSheet actionSheet) {
		throw new java.lang.UnsupportedOperationException();
	}
}
