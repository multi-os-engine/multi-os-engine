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
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSDictionary;
import apple.foundation.struct.NSRange;
import apple.uikit.UIDictationPhrase;
import apple.uikit.UITextPlaceholder;
import apple.uikit.UITextPosition;
import apple.uikit.UITextRange;
import apple.uikit.UITextSelectionRect;
import apple.uikit.UIView;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextInput")
public interface UITextInput extends UIKeyInput {
    @Generated
    @Selector("baseWritingDirectionForPosition:inDirection:")
    @NInt
    long baseWritingDirectionForPositionInDirection(UITextPosition position, @NInt long direction);

    @Generated
    @IsOptional
    @Selector("beginFloatingCursorAtPoint:")
    default void beginFloatingCursorAtPoint(@ByValue CGPoint point) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("beginningOfDocument")
    UITextPosition beginningOfDocument();

    @Generated
    @Selector("caretRectForPosition:")
    @ByValue
    CGRect caretRectForPosition(UITextPosition position);

    @Generated
    @IsOptional
    @Selector("characterOffsetOfPosition:withinRange:")
    @NInt
    default long characterOffsetOfPositionWithinRange(UITextPosition position, UITextRange range) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("characterRangeAtPoint:")
    UITextRange characterRangeAtPoint(@ByValue CGPoint point);

    @Generated
    @Selector("characterRangeByExtendingPosition:inDirection:")
    UITextRange characterRangeByExtendingPositionInDirection(UITextPosition position, @NInt long direction);

    @Generated
    @Selector("closestPositionToPoint:")
    UITextPosition closestPositionToPoint(@ByValue CGPoint point);

    @Generated
    @Selector("closestPositionToPoint:withinRange:")
    UITextPosition closestPositionToPointWithinRange(@ByValue CGPoint point, UITextRange range);

    @Generated
    @Selector("comparePosition:toPosition:")
    @NInt
    long comparePositionToPosition(UITextPosition position, UITextPosition other);

    @Generated
    @IsOptional
    @Selector("dictationRecognitionFailed")
    default void dictationRecognitionFailed() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("dictationRecordingDidEnd")
    default void dictationRecordingDidEnd() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("endFloatingCursor")
    default void endFloatingCursor() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("endOfDocument")
    UITextPosition endOfDocument();

    @Generated
    @Selector("firstRectForRange:")
    @ByValue
    CGRect firstRectForRange(UITextRange range);

    @Generated
    @IsOptional
    @Selector("frameForDictationResultPlaceholder:")
    @ByValue
    default CGRect frameForDictationResultPlaceholder(@Mapped(ObjCObjectMapper.class) Object placeholder) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("inputDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    Object inputDelegate();

    @Generated
    @IsOptional
    @Selector("insertDictationResult:")
    default void insertDictationResult(NSArray<? extends UIDictationPhrase> dictationResult) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("insertDictationResultPlaceholder")
    @MappedReturn(ObjCObjectMapper.class)
    default Object insertDictationResultPlaceholder() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("markedTextRange")
    UITextRange markedTextRange();

    @Generated
    @Selector("markedTextStyle")
    NSDictionary<String, ?> markedTextStyle();

    @Generated
    @Selector("offsetFromPosition:toPosition:")
    @NInt
    long offsetFromPositionToPosition(UITextPosition from, UITextPosition toPosition);

    @Generated
    @Selector("positionFromPosition:inDirection:offset:")
    UITextPosition positionFromPositionInDirectionOffset(UITextPosition position, @NInt long direction,
            @NInt long offset);

    @Generated
    @Selector("positionFromPosition:offset:")
    UITextPosition positionFromPositionOffset(UITextPosition position, @NInt long offset);

    @Generated
    @IsOptional
    @Selector("positionWithinRange:atCharacterOffset:")
    default UITextPosition positionWithinRangeAtCharacterOffset(UITextRange range, @NInt long offset) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("positionWithinRange:farthestInDirection:")
    UITextPosition positionWithinRangeFarthestInDirection(UITextRange range, @NInt long direction);

    @Generated
    @IsOptional
    @Selector("removeDictationResultPlaceholder:willInsertResult:")
    default void removeDictationResultPlaceholderWillInsertResult(@Mapped(ObjCObjectMapper.class) Object placeholder,
            boolean willInsertResult) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("replaceRange:withText:")
    void replaceRangeWithText(UITextRange range, String text);

    @Generated
    @Selector("selectedTextRange")
    UITextRange selectedTextRange();

    @Generated
    @IsOptional
    @Selector("selectionAffinity")
    @NInt
    default long selectionAffinity() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("selectionRectsForRange:")
    NSArray<? extends UITextSelectionRect> selectionRectsForRange(UITextRange range);

    @Generated
    @Selector("setBaseWritingDirection:forRange:")
    void setBaseWritingDirectionForRange(@NInt long writingDirection, UITextRange range);

    @Generated
    @Selector("setInputDelegate:")
    void setInputDelegate(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("setMarkedText:selectedRange:")
    void setMarkedTextSelectedRange(String markedText, @ByValue NSRange selectedRange);

    @Generated
    @Selector("setMarkedTextStyle:")
    void setMarkedTextStyle(NSDictionary<String, ?> value);

    @Generated
    @Selector("setSelectedTextRange:")
    void setSelectedTextRange(UITextRange value);

    @Generated
    @IsOptional
    @Selector("setSelectionAffinity:")
    default void setSelectionAffinity(@NInt long value) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("shouldChangeTextInRange:replacementText:")
    default boolean shouldChangeTextInRangeReplacementText(UITextRange range, String text) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("textInRange:")
    String textInRange(UITextRange range);

    @Generated
    @IsOptional
    @Selector("textInputView")
    default UIView textInputView() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("textRangeFromPosition:toPosition:")
    UITextRange textRangeFromPositionToPosition(UITextPosition fromPosition, UITextPosition toPosition);

    @Generated
    @IsOptional
    @Selector("textStylingAtPosition:inDirection:")
    default NSDictionary<String, ?> textStylingAtPositionInDirection(UITextPosition position, @NInt long direction) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("tokenizer")
    @MappedReturn(ObjCObjectMapper.class)
    Object tokenizer();

    @Generated
    @Selector("unmarkText")
    void unmarkText();

    @Generated
    @IsOptional
    @Selector("updateFloatingCursorAtPoint:")
    default void updateFloatingCursorAtPoint(@ByValue CGPoint point) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("insertText:alternatives:style:")
    default void insertTextAlternativesStyle(String text, NSArray<String> alternatives, @NInt long style) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("insertTextPlaceholderWithSize:")
    default UITextPlaceholder insertTextPlaceholderWithSize(@ByValue CGSize size) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("removeTextPlaceholder:")
    default void removeTextPlaceholder(UITextPlaceholder textPlaceholder) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("setAttributedMarkedText:selectedRange:")
    default void setAttributedMarkedTextSelectedRange(NSAttributedString markedText, @ByValue NSRange selectedRange) {
        throw new java.lang.UnsupportedOperationException();
    }
}
