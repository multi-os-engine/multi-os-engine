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
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.ConstCharPtr;
import org.moe.natj.general.ptr.ConstNIntPtr;
import org.moe.natj.general.ptr.ConstNUIntPtr;
import org.moe.natj.general.ptr.NFloatPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.coregraphics.struct.CGPoint;
import ios.coregraphics.struct.CGRect;
import ios.coregraphics.struct.CGSize;
import ios.foundation.struct.NSRange;
import ios.uikit.NSLayoutManager;
import ios.uikit.NSTextContainer;
import ios.uikit.UIFont;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSLayoutManagerDelegate")
public interface NSLayoutManagerDelegate {
	/**
	 * layoutManager:boundingBoxForControlGlyphAtIndex:forTextContainer:proposedLineFragment:glyphPosition:characterIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSLayoutManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSLayoutManagerDelegate/layoutManager:boundingBoxForControlGlyphAtIndex:forTextContainer:proposedLineFragment:glyphPosition:characterIndex:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("layoutManager:boundingBoxForControlGlyphAtIndex:forTextContainer:proposedLineFragment:glyphPosition:characterIndex:")
	@ByValue
	default CGRect layoutManagerBoundingBoxForControlGlyphAtIndexForTextContainerProposedLineFragmentGlyphPositionCharacterIndex(
			NSLayoutManager layoutManager, @NUInt long glyphIndex,
			NSTextContainer textContainer, @ByValue CGRect proposedRect,
			@ByValue CGPoint glyphPosition, @NUInt long charIndex) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * layoutManager:didCompleteLayoutForTextContainer:atEnd:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSLayoutManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSLayoutManagerDelegate/layoutManager:didCompleteLayoutForTextContainer:atEnd:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("layoutManager:didCompleteLayoutForTextContainer:atEnd:")
	default void layoutManagerDidCompleteLayoutForTextContainerAtEnd(
			NSLayoutManager layoutManager, NSTextContainer textContainer,
			boolean layoutFinishedFlag) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * layoutManager:lineSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSLayoutManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSLayoutManagerDelegate/layoutManager:lineSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("layoutManager:lineSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:")
	@NFloat
	default double layoutManagerLineSpacingAfterGlyphAtIndexWithProposedLineFragmentRect(
			NSLayoutManager layoutManager, @NUInt long glyphIndex,
			@ByValue CGRect rect) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * layoutManager:paragraphSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSLayoutManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSLayoutManagerDelegate/layoutManager:paragraphSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("layoutManager:paragraphSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:")
	@NFloat
	default double layoutManagerParagraphSpacingAfterGlyphAtIndexWithProposedLineFragmentRect(
			NSLayoutManager layoutManager, @NUInt long glyphIndex,
			@ByValue CGRect rect) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * layoutManager:paragraphSpacingBeforeGlyphAtIndex:withProposedLineFragmentRect:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSLayoutManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSLayoutManagerDelegate/layoutManager:paragraphSpacingBeforeGlyphAtIndex:withProposedLineFragmentRect:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("layoutManager:paragraphSpacingBeforeGlyphAtIndex:withProposedLineFragmentRect:")
	@NFloat
	default double layoutManagerParagraphSpacingBeforeGlyphAtIndexWithProposedLineFragmentRect(
			NSLayoutManager layoutManager, @NUInt long glyphIndex,
			@ByValue CGRect rect) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * layoutManager:shouldBreakLineByHyphenatingBeforeCharacterAtIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSLayoutManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSLayoutManagerDelegate/layoutManager:shouldBreakLineByHyphenatingBeforeCharacterAtIndex:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("layoutManager:shouldBreakLineByHyphenatingBeforeCharacterAtIndex:")
	default boolean layoutManagerShouldBreakLineByHyphenatingBeforeCharacterAtIndex(
			NSLayoutManager layoutManager, @NUInt long charIndex) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * layoutManager:shouldBreakLineByWordBeforeCharacterAtIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSLayoutManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSLayoutManagerDelegate/layoutManager:shouldBreakLineByWordBeforeCharacterAtIndex:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("layoutManager:shouldBreakLineByWordBeforeCharacterAtIndex:")
	default boolean layoutManagerShouldBreakLineByWordBeforeCharacterAtIndex(
			NSLayoutManager layoutManager, @NUInt long charIndex) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * layoutManager:shouldGenerateGlyphs:properties:characterIndexes:font:forGlyphRange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSLayoutManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSLayoutManagerDelegate/layoutManager:shouldGenerateGlyphs:properties:characterIndexes:font:forGlyphRange:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("layoutManager:shouldGenerateGlyphs:properties:characterIndexes:font:forGlyphRange:")
	@NUInt
	default long layoutManagerShouldGenerateGlyphsPropertiesCharacterIndexesFontForGlyphRange(
			NSLayoutManager layoutManager, ConstCharPtr glyphs,
			ConstNIntPtr props, ConstNUIntPtr charIndexes, UIFont aFont,
			@ByValue NSRange glyphRange) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * layoutManager:shouldUseAction:forControlCharacterAtIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSLayoutManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSLayoutManagerDelegate/layoutManager:shouldUseAction:forControlCharacterAtIndex:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("layoutManager:shouldUseAction:forControlCharacterAtIndex:")
	@NInt
	default long layoutManagerShouldUseActionForControlCharacterAtIndex(
			NSLayoutManager layoutManager, @NInt long action,
			@NUInt long charIndex) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * layoutManager:textContainer:didChangeGeometryFromSize:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSLayoutManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSLayoutManagerDelegate/layoutManager:textContainer:didChangeGeometryFromSize:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("layoutManager:textContainer:didChangeGeometryFromSize:")
	default void layoutManagerTextContainerDidChangeGeometryFromSize(
			NSLayoutManager layoutManager, NSTextContainer textContainer,
			@ByValue CGSize oldSize) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * layoutManagerDidInvalidateLayout:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSLayoutManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSLayoutManagerDelegate/layoutManagerDidInvalidateLayout:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("layoutManagerDidInvalidateLayout:")
	default void layoutManagerDidInvalidateLayout(NSLayoutManager sender) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("layoutManager:shouldSetLineFragmentRect:lineFragmentUsedRect:baselineOffset:inTextContainer:forGlyphRange:")
	default boolean layoutManagerShouldSetLineFragmentRectLineFragmentUsedRectBaselineOffsetInTextContainerForGlyphRange(
			NSLayoutManager layoutManager,
			CGRect lineFragmentRect,
			CGRect lineFragmentUsedRect,
			NFloatPtr baselineOffset, NSTextContainer textContainer, @ByValue NSRange glyphRange) {
		throw new java.lang.UnsupportedOperationException();
	}
}
