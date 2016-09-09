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
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.uikit.UITextPosition;
import ios.uikit.UITextRange;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextInputTokenizer")
public interface UITextInputTokenizer {
	/**
	 * isPosition:atBoundary:inDirection:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInputTokenizer_Protocol/index.html#//apple_ref/occ/intfm/UITextInputTokenizer/isPosition:atBoundary:inDirection:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isPosition:atBoundary:inDirection:")
	boolean isPositionAtBoundaryInDirection(UITextPosition position,
			@NInt long granularity, @NInt long direction);

	/**
	 * isPosition:withinTextUnit:inDirection:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInputTokenizer_Protocol/index.html#//apple_ref/occ/intfm/UITextInputTokenizer/isPosition:withinTextUnit:inDirection:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isPosition:withinTextUnit:inDirection:")
	boolean isPositionWithinTextUnitInDirection(UITextPosition position,
			@NInt long granularity, @NInt long direction);

	/**
	 * positionFromPosition:toBoundary:inDirection:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInputTokenizer_Protocol/index.html#//apple_ref/occ/intfm/UITextInputTokenizer/positionFromPosition:toBoundary:inDirection:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("positionFromPosition:toBoundary:inDirection:")
	UITextPosition positionFromPositionToBoundaryInDirection(
			UITextPosition position, @NInt long granularity,
			@NInt long direction);

	/**
	 * rangeEnclosingPosition:withGranularity:inDirection:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInputTokenizer_Protocol/index.html#//apple_ref/occ/intfm/UITextInputTokenizer/rangeEnclosingPosition:withGranularity:inDirection:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("rangeEnclosingPosition:withGranularity:inDirection:")
	UITextRange rangeEnclosingPositionWithGranularityInDirection(
			UITextPosition position, @NInt long granularity,
			@NInt long direction);
}
