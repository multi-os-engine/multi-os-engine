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
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.struct.NSRange;
import ios.uikit.NSTextStorage;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSTextStorageDelegate")
public interface NSTextStorageDelegate {
	/**
	 * textStorage:didProcessEditing:range:changeInLength:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSTextStorageDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSTextStorageDelegate/textStorage:didProcessEditing:range:changeInLength:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("textStorage:didProcessEditing:range:changeInLength:")
	default void textStorageDidProcessEditingRangeChangeInLength(
			NSTextStorage textStorage, @NUInt long editedMask,
			@ByValue NSRange editedRange, @NInt long delta) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * textStorage:willProcessEditing:range:changeInLength:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSTextStorageDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSTextStorageDelegate/textStorage:willProcessEditing:range:changeInLength:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("textStorage:willProcessEditing:range:changeInLength:")
	default void textStorageWillProcessEditingRangeChangeInLength(
			NSTextStorage textStorage, @NUInt long editedMask,
			@ByValue NSRange editedRange, @NInt long delta) {
		throw new java.lang.UnsupportedOperationException();
	}
}
