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
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.struct.NSRange;
import apple.uikit.UIDictationPhrase;
import apple.uikit.UITextPosition;
import apple.uikit.UITextRange;
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
     * baseWritingDirectionForPosition:inDirection:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/baseWritingDirectionForPosition:inDirection:">iOS Dev Center</a>
     */
    @Generated
    @Selector("baseWritingDirectionForPosition:inDirection:")
    @NInt
    long baseWritingDirectionForPositionInDirection(UITextPosition position, @NInt long direction);

    /**
     * beginningOfDocument</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfp/UITextInput/beginningOfDocument">iOS Dev Center</a>
     */
    @Generated
    @Selector("beginningOfDocument")
    UITextPosition beginningOfDocument();

    /**
     * caretRectForPosition:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/caretRectForPosition:">iOS Dev Center</a>
     */
    @Generated
    @Selector("caretRectForPosition:")
    @ByValue
    CGRect caretRectForPosition(UITextPosition position);

    /**
     * characterOffsetOfPosition:withinRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/characterOffsetOfPosition:withinRange:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("characterOffsetOfPosition:withinRange:")
    @NInt
    default long characterOffsetOfPositionWithinRange(UITextPosition position, UITextRange range) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * characterRangeAtPoint:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/characterRangeAtPoint:">iOS Dev Center</a>
     */
    @Generated
    @Selector("characterRangeAtPoint:")
    UITextRange characterRangeAtPoint(@ByValue CGPoint point);

    /**
     * characterRangeByExtendingPosition:inDirection:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/characterRangeByExtendingPosition:inDirection:">iOS Dev Center</a>
     */
    @Generated
    @Selector("characterRangeByExtendingPosition:inDirection:")
    UITextRange characterRangeByExtendingPositionInDirection(UITextPosition position, @NInt long direction);

    /**
     * closestPositionToPoint:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/closestPositionToPoint:">iOS Dev Center</a>
     */
    @Generated
    @Selector("closestPositionToPoint:")
    UITextPosition closestPositionToPoint(@ByValue CGPoint point);

    /**
     * closestPositionToPoint:withinRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/closestPositionToPoint:withinRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("closestPositionToPoint:withinRange:")
    UITextPosition closestPositionToPointWithinRange(@ByValue CGPoint point, UITextRange range);

    /**
     * comparePosition:toPosition:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/comparePosition:toPosition:">iOS Dev Center</a>
     */
    @Generated
    @Selector("comparePosition:toPosition:")
    @NInt
    long comparePositionToPosition(UITextPosition position, UITextPosition other);

    /**
     * dictationRecognitionFailed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/dictationRecognitionFailed">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("dictationRecognitionFailed")
    default void dictationRecognitionFailed() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * dictationRecordingDidEnd</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/dictationRecordingDidEnd">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("dictationRecordingDidEnd")
    default void dictationRecordingDidEnd() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * endOfDocument</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfp/UITextInput/endOfDocument">iOS Dev Center</a>
     */
    @Generated
    @Selector("endOfDocument")
    UITextPosition endOfDocument();

    /**
     * firstRectForRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/firstRectForRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("firstRectForRange:")
    @ByValue
    CGRect firstRectForRange(UITextRange range);

    /**
     * frameForDictationResultPlaceholder:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/frameForDictationResultPlaceholder:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("frameForDictationResultPlaceholder:")
    @ByValue
    default CGRect frameForDictationResultPlaceholder(@Mapped(ObjCObjectMapper.class) Object placeholder) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * inputDelegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfp/UITextInput/inputDelegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("inputDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    Object inputDelegate();

    /**
     * insertDictationResult:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/insertDictationResult:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("insertDictationResult:")
    default void insertDictationResult(NSArray<? extends UIDictationPhrase> dictationResult) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * insertDictationResultPlaceholder</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/insertDictationResultPlaceholder">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("insertDictationResultPlaceholder")
    @MappedReturn(ObjCObjectMapper.class)
    default Object insertDictationResultPlaceholder() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * markedTextRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfp/UITextInput/markedTextRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("markedTextRange")
    UITextRange markedTextRange();

    /**
     * markedTextStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfp/UITextInput/markedTextStyle">iOS Dev Center</a>
     */
    @Generated
    @Selector("markedTextStyle")
    NSDictionary<?, ?> markedTextStyle();

    /**
     * offsetFromPosition:toPosition:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/offsetFromPosition:toPosition:">iOS Dev Center</a>
     */
    @Generated
    @Selector("offsetFromPosition:toPosition:")
    @NInt
    long offsetFromPositionToPosition(UITextPosition from, UITextPosition toPosition);

    /**
     * positionFromPosition:inDirection:offset:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/positionFromPosition:inDirection:offset:">iOS Dev Center</a>
     */
    @Generated
    @Selector("positionFromPosition:inDirection:offset:")
    UITextPosition positionFromPositionInDirectionOffset(UITextPosition position, @NInt long direction,
            @NInt long offset);

    /**
     * positionFromPosition:offset:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/positionFromPosition:offset:">iOS Dev Center</a>
     */
    @Generated
    @Selector("positionFromPosition:offset:")
    UITextPosition positionFromPositionOffset(UITextPosition position, @NInt long offset);

    /**
     * positionWithinRange:atCharacterOffset:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/positionWithinRange:atCharacterOffset:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("positionWithinRange:atCharacterOffset:")
    default UITextPosition positionWithinRangeAtCharacterOffset(UITextRange range, @NInt long offset) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * positionWithinRange:farthestInDirection:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/positionWithinRange:farthestInDirection:">iOS Dev Center</a>
     */
    @Generated
    @Selector("positionWithinRange:farthestInDirection:")
    UITextPosition positionWithinRangeFarthestInDirection(UITextRange range, @NInt long direction);

    /**
     * removeDictationResultPlaceholder:willInsertResult:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/removeDictationResultPlaceholder:willInsertResult:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("removeDictationResultPlaceholder:willInsertResult:")
    default void removeDictationResultPlaceholderWillInsertResult(@Mapped(ObjCObjectMapper.class) Object placeholder,
            boolean willInsertResult) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * replaceRange:withText:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/replaceRange:withText:">iOS Dev Center</a>
     */
    @Generated
    @Selector("replaceRange:withText:")
    void replaceRangeWithText(UITextRange range, String text);

    /**
     * selectedTextRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfp/UITextInput/selectedTextRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("selectedTextRange")
    UITextRange selectedTextRange();

    /**
     * selectionAffinity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfp/UITextInput/selectionAffinity">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("selectionAffinity")
    @NInt
    default long selectionAffinity() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * selectionRectsForRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/selectionRectsForRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("selectionRectsForRange:")
    NSArray<?> selectionRectsForRange(UITextRange range);

    /**
     * setBaseWritingDirection:forRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/setBaseWritingDirection:forRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBaseWritingDirection:forRange:")
    void setBaseWritingDirectionForRange(@NInt long writingDirection, UITextRange range);

    /**
     * inputDelegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfp/UITextInput/inputDelegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setInputDelegate:")
    void setInputDelegate(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * setMarkedText:selectedRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/setMarkedText:selectedRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMarkedText:selectedRange:")
    void setMarkedTextSelectedRange(String markedText, @ByValue NSRange selectedRange);

    /**
     * markedTextStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfp/UITextInput/markedTextStyle">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMarkedTextStyle:")
    void setMarkedTextStyle(NSDictionary<?, ?> value);

    /**
     * selectedTextRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfp/UITextInput/selectedTextRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSelectedTextRange:")
    void setSelectedTextRange(UITextRange value);

    /**
     * selectionAffinity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfp/UITextInput/selectionAffinity">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("setSelectionAffinity:")
    default void setSelectionAffinity(@NInt long value) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * shouldChangeTextInRange:replacementText:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/shouldChangeTextInRange:replacementText:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("shouldChangeTextInRange:replacementText:")
    default boolean shouldChangeTextInRangeReplacementText(UITextRange range, String text) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * textInRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/textInRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("textInRange:")
    String textInRange(UITextRange range);

    /**
     * textInputView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfp/UITextInput/textInputView">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("textInputView")
    default UIView textInputView() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * textRangeFromPosition:toPosition:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/textRangeFromPosition:toPosition:">iOS Dev Center</a>
     */
    @Generated
    @Selector("textRangeFromPosition:toPosition:")
    UITextRange textRangeFromPositionToPosition(UITextPosition fromPosition, UITextPosition toPosition);

    /**
     * textStylingAtPosition:inDirection:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/textStylingAtPosition:inDirection:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("textStylingAtPosition:inDirection:")
    default NSDictionary<String, ?> textStylingAtPositionInDirection(UITextPosition position, @NInt long direction) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * tokenizer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfp/UITextInput/tokenizer">iOS Dev Center</a>
     */
    @Generated
    @Selector("tokenizer")
    @MappedReturn(ObjCObjectMapper.class)
    Object tokenizer();

    /**
     * unmarkText</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInput_Protocol/index.html#//apple_ref/occ/intfm/UITextInput/unmarkText">iOS Dev Center</a>
     */
    @Generated
    @Selector("unmarkText")
    void unmarkText();

    @Generated
    @IsOptional
    @Selector("beginFloatingCursorAtPoint:")
    default void beginFloatingCursorAtPoint(@ByValue CGPoint point) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("endFloatingCursor")
    default void endFloatingCursor() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("updateFloatingCursorAtPoint:")
    default void updateFloatingCursorAtPoint(@ByValue CGPoint point) {
        throw new java.lang.UnsupportedOperationException();
    }
}
