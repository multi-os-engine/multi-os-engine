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

import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.foundation.struct.NSRange;
import apple.uikit.NSLayoutManager;
import apple.uikit.NSTextContainer;
import apple.uikit.UIFont;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstCharPtr;
import org.moe.natj.general.ptr.ConstNIntPtr;
import org.moe.natj.general.ptr.ConstNUIntPtr;
import org.moe.natj.general.ptr.NFloatPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSLayoutManagerDelegate")
public interface NSLayoutManagerDelegate {
    @Generated
    @IsOptional
    @Selector("layoutManager:boundingBoxForControlGlyphAtIndex:forTextContainer:proposedLineFragment:glyphPosition:characterIndex:")
    @ByValue
    default CGRect layoutManagerBoundingBoxForControlGlyphAtIndexForTextContainerProposedLineFragmentGlyphPositionCharacterIndex(
            NSLayoutManager layoutManager, @NUInt long glyphIndex, NSTextContainer textContainer,
            @ByValue CGRect proposedRect, @ByValue CGPoint glyphPosition, @NUInt long charIndex) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("layoutManager:didCompleteLayoutForTextContainer:atEnd:")
    default void layoutManagerDidCompleteLayoutForTextContainerAtEnd(NSLayoutManager layoutManager,
            NSTextContainer textContainer, boolean layoutFinishedFlag) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("layoutManager:lineSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:")
    @NFloat
    default double layoutManagerLineSpacingAfterGlyphAtIndexWithProposedLineFragmentRect(NSLayoutManager layoutManager,
            @NUInt long glyphIndex, @ByValue CGRect rect) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("layoutManager:paragraphSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:")
    @NFloat
    default double layoutManagerParagraphSpacingAfterGlyphAtIndexWithProposedLineFragmentRect(
            NSLayoutManager layoutManager, @NUInt long glyphIndex, @ByValue CGRect rect) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("layoutManager:paragraphSpacingBeforeGlyphAtIndex:withProposedLineFragmentRect:")
    @NFloat
    default double layoutManagerParagraphSpacingBeforeGlyphAtIndexWithProposedLineFragmentRect(
            NSLayoutManager layoutManager, @NUInt long glyphIndex, @ByValue CGRect rect) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("layoutManager:shouldBreakLineByHyphenatingBeforeCharacterAtIndex:")
    default boolean layoutManagerShouldBreakLineByHyphenatingBeforeCharacterAtIndex(NSLayoutManager layoutManager,
            @NUInt long charIndex) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("layoutManager:shouldBreakLineByWordBeforeCharacterAtIndex:")
    default boolean layoutManagerShouldBreakLineByWordBeforeCharacterAtIndex(NSLayoutManager layoutManager,
            @NUInt long charIndex) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("layoutManager:shouldGenerateGlyphs:properties:characterIndexes:font:forGlyphRange:")
    @NUInt
    default long layoutManagerShouldGenerateGlyphsPropertiesCharacterIndexesFontForGlyphRange(
            NSLayoutManager layoutManager, ConstCharPtr glyphs, ConstNIntPtr props, ConstNUIntPtr charIndexes,
            UIFont aFont, @ByValue NSRange glyphRange) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("layoutManager:shouldSetLineFragmentRect:lineFragmentUsedRect:baselineOffset:inTextContainer:forGlyphRange:")
    default boolean layoutManagerShouldSetLineFragmentRectLineFragmentUsedRectBaselineOffsetInTextContainerForGlyphRange(
            NSLayoutManager layoutManager, CGRect lineFragmentRect, CGRect lineFragmentUsedRect,
            NFloatPtr baselineOffset, NSTextContainer textContainer, @ByValue NSRange glyphRange) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("layoutManager:shouldUseAction:forControlCharacterAtIndex:")
    @NInt
    default long layoutManagerShouldUseActionForControlCharacterAtIndex(NSLayoutManager layoutManager,
            @NInt long action, @NUInt long charIndex) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("layoutManager:textContainer:didChangeGeometryFromSize:")
    default void layoutManagerTextContainerDidChangeGeometryFromSize(NSLayoutManager layoutManager,
            NSTextContainer textContainer, @ByValue CGSize oldSize) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("layoutManagerDidInvalidateLayout:")
    default void layoutManagerDidInvalidateLayout(NSLayoutManager sender) {
        throw new java.lang.UnsupportedOperationException();
    }
}
