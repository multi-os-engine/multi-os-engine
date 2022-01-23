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
    /**
     * Writing direction
     */
    @Generated
    @Selector("baseWritingDirectionForPosition:inDirection:")
    @NInt
    long baseWritingDirectionForPositionInDirection(UITextPosition position, @NInt long direction);

    /**
     * The following three optional methods are for clients that wish to display a floating cursor to
     * guide user manipulation of the selected text range via the system-provided keyboard. If a client
     * does not implement these methods, user feedback will be limited to the outcome after setting the
     * selected text range using positions resulting from hit testing.
     */
    @Generated
    @IsOptional
    @Selector("beginFloatingCursorAtPoint:")
    default void beginFloatingCursorAtPoint(@ByValue CGPoint point) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The end and beginning of the the text document.
     */
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

    /**
     * Hit testing.
     */
    @Generated
    @Selector("closestPositionToPoint:")
    UITextPosition closestPositionToPoint(@ByValue CGPoint point);

    @Generated
    @Selector("closestPositionToPoint:withinRange:")
    UITextPosition closestPositionToPointWithinRange(@ByValue CGPoint point, UITextRange range);

    /**
     * Simple evaluation of positions
     */
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

    /**
     * These are optional methods for clients that wish to know when there are pending dictation results.
     */
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

    /**
     * Geometry used to provide, for example, a correction rect.
     */
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

    /**
     * A system-provided input delegate is assigned when the system is interested in input changes.
     */
    @Generated
    @Selector("inputDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    UITextInputDelegate inputDelegate();

    /**
     * This is an optional method for clients that wish to support dictation phrase alternatives. If
     * they do not implement this method, dictation will just insert the most likely interpretation
     * of what was spoken via -insertText:.
     * dictationResult is an array of UIDictationPhrases.
     */
    @Generated
    @IsOptional
    @Selector("insertDictationResult:")
    default void insertDictationResult(NSArray<? extends UIDictationPhrase> dictationResult) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The following three optional methods are for clients that wish to support a placeholder for
     * pending dictation results. -insertDictationPlaceholder must return a reference to the
     * placeholder. This reference will be used to identify the placeholder by the other methods
     * (there may be more than one placeholder).
     */
    @Generated
    @IsOptional
    @Selector("insertDictationResultPlaceholder")
    @MappedReturn(ObjCObjectMapper.class)
    default Object insertDictationResultPlaceholder() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Nil if no marked text.
     */
    @Generated
    @Selector("markedTextRange")
    UITextRange markedTextRange();

    /**
     * Describes how the marked text should be drawn.
     */
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

    /**
     * To be implemented if there is not a one-to-one correspondence between text positions within range and character offsets into the associated string.
     */
    @Generated
    @IsOptional
    @Selector("positionWithinRange:atCharacterOffset:")
    default UITextPosition positionWithinRangeAtCharacterOffset(UITextRange range, @NInt long offset) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Layout questions.
     */
    @Generated
    @Selector("positionWithinRange:farthestInDirection:")
    UITextPosition positionWithinRangeFarthestInDirection(UITextRange range, @NInt long direction);

    /**
     * willInsertResult will be NO if the recognition failed.
     */
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

    /**
     * Text may have a selection, either zero-length (a caret) or ranged.  Editing operations are
     * always performed on the text from this selection.  nil corresponds to no selection.
     */
    @Generated
    @Selector("selectedTextRange")
    UITextRange selectedTextRange();

    /**
     * Selection affinity determines whether, for example, the insertion point appears after the last
     * character on a line or before the first character on the following line in cases where text
     * wraps across line boundaries.
     */
    @Generated
    @IsOptional
    @Selector("selectionAffinity")
    @NInt
    default long selectionAffinity() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Returns an array of UITextSelectionRects
     */
    @Generated
    @Selector("selectionRectsForRange:")
    NSArray<? extends UITextSelectionRect> selectionRectsForRange(UITextRange range);

    @Generated
    @Selector("setBaseWritingDirection:forRange:")
    void setBaseWritingDirectionForRange(@NInt long writingDirection, UITextRange range);

    /**
     * A system-provided input delegate is assigned when the system is interested in input changes.
     */
    @Generated
    @Selector("setInputDelegate:")
    void setInputDelegate_unsafe(@Mapped(ObjCObjectMapper.class) UITextInputDelegate value);

    /**
     * selectedRange is a range within the markedText
     */
    @Generated
    @Selector("setMarkedText:selectedRange:")
    void setMarkedTextSelectedRange(String markedText, @ByValue NSRange selectedRange);

    /**
     * Describes how the marked text should be drawn.
     */
    @Generated
    @Selector("setMarkedTextStyle:")
    void setMarkedTextStyle(NSDictionary<String, ?> value);

    /**
     * Text may have a selection, either zero-length (a caret) or ranged.  Editing operations are
     * always performed on the text from this selection.  nil corresponds to no selection.
     */
    @Generated
    @Selector("setSelectedTextRange:")
    void setSelectedTextRange(UITextRange value);

    /**
     * Selection affinity determines whether, for example, the insertion point appears after the last
     * character on a line or before the first character on the following line in cases where text
     * wraps across line boundaries.
     */
    @Generated
    @IsOptional
    @Selector("setSelectionAffinity:")
    default void setSelectionAffinity(@NInt long value) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * return NO to not change text
     */
    @Generated
    @IsOptional
    @Selector("shouldChangeTextInRange:replacementText:")
    default boolean shouldChangeTextInRangeReplacementText(UITextRange range, String text) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Methods for manipulating text.
     */
    @Generated
    @Selector("textInRange:")
    String textInRange(UITextRange range);

    /**
     * An affiliated view that provides a coordinate system for all geometric values in this protocol.
     * If unimplemented, the first view in the responder chain will be selected.
     */
    @Generated
    @IsOptional
    @Selector("textInputView")
    default UIView textInputView() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Methods for creating ranges and positions.
     */
    @Generated
    @Selector("textRangeFromPosition:toPosition:")
    UITextRange textRangeFromPositionToPosition(UITextPosition fromPosition, UITextPosition toPosition);

    /**
     * Text styling information can affect, for example, the appearance of a correction rect.
     * Returns a dictionary containing NSAttributedString keys.
     */
    @Generated
    @IsOptional
    @Selector("textStylingAtPosition:inDirection:")
    default NSDictionary<String, ?> textStylingAtPositionInDirection(UITextPosition position, @NInt long direction) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * A tokenizer must be provided to inform the text input system about text units of varying granularity.
     */
    @Generated
    @Selector("tokenizer")
    @MappedReturn(ObjCObjectMapper.class)
    UITextInputTokenizer tokenizer();

    @Generated
    @Selector("unmarkText")
    void unmarkText();

    @Generated
    @IsOptional
    @Selector("updateFloatingCursorAtPoint:")
    default void updateFloatingCursorAtPoint(@ByValue CGPoint point) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This is an optional method for clients that wish to support text phrase alternatives. If they do not implement this method,
     * the text will be inserted by -insertText: without the phase alternatives.
     */
    @Generated
    @IsOptional
    @Selector("insertText:alternatives:style:")
    default void insertTextAlternativesStyle(String text, NSArray<String> alternatives, @NInt long style) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Insert a placeholder
     * If `size.height` is <= 0, then the placeholder is inline and line height.
     * If `size.height` is > 0, then the placeholder is treated as a paragraph of height `size.height`.
     */
    @Generated
    @IsOptional
    @Selector("insertTextPlaceholderWithSize:")
    default UITextPlaceholder insertTextPlaceholderWithSize(@ByValue CGSize size) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Remove the placeholder.
     */
    @Generated
    @IsOptional
    @Selector("removeTextPlaceholder:")
    default void removeTextPlaceholder(UITextPlaceholder textPlaceholder) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * set attributedString as markedText, selectedRange is a range within the markedText
     */
    @Generated
    @IsOptional
    @Selector("setAttributedMarkedText:selectedRange:")
    default void setAttributedMarkedTextSelectedRange(NSAttributedString markedText, @ByValue NSRange selectedRange) {
        throw new java.lang.UnsupportedOperationException();
    }
}
