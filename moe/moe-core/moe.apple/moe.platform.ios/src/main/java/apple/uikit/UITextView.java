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

package apple.uikit;

import apple.NSObject;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.struct.NSRange;
import apple.uikit.protocol.UITextInput;
import apple.uikit.struct.UIEdgeInsets;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITextView extends UIScrollView implements UITextInput {
    static {
        NatJ.register();
    }

    @Generated
    protected UITextView(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITextView alloc();

    /**
     * allowsEditingTextAttributes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/allowsEditingTextAttributes">iOS Dev Center</a>
     */
    @Generated
    @Selector("allowsEditingTextAttributes")
    public native boolean allowsEditingTextAttributes();

    /**
     * attributedText</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/attributedText">iOS Dev Center</a>
     */
    @Generated
    @Selector("attributedText")
    public native NSAttributedString attributedText();

    @Generated
    @IsOptional
    @Selector("autocapitalizationType")
    @NInt
    public native long autocapitalizationType();

    @Generated
    @IsOptional
    @Selector("autocorrectionType")
    @NInt
    public native long autocorrectionType();

    @Generated
    @Selector("baseWritingDirectionForPosition:inDirection:")
    @NInt
    public native long baseWritingDirectionForPositionInDirection(UITextPosition position, @NInt long direction);

    @Generated
    @Selector("beginningOfDocument")
    public native UITextPosition beginningOfDocument();

    @Generated
    @Selector("caretRectForPosition:")
    @ByValue
    public native CGRect caretRectForPosition(UITextPosition position);

    @Generated
    @IsOptional
    @Selector("characterOffsetOfPosition:withinRange:")
    @NInt
    public native long characterOffsetOfPositionWithinRange(UITextPosition position, UITextRange range);

    @Generated
    @Selector("characterRangeAtPoint:")
    public native UITextRange characterRangeAtPoint(@ByValue CGPoint point);

    @Generated
    @Selector("characterRangeByExtendingPosition:inDirection:")
    public native UITextRange characterRangeByExtendingPositionInDirection(UITextPosition position,
            @NInt long direction);

    /**
     * clearsOnInsertion</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/clearsOnInsertion">iOS Dev Center</a>
     */
    @Generated
    @Selector("clearsOnInsertion")
    public native boolean clearsOnInsertion();

    @Generated
    @Selector("closestPositionToPoint:")
    public native UITextPosition closestPositionToPoint(@ByValue CGPoint point);

    @Generated
    @Selector("closestPositionToPoint:withinRange:")
    public native UITextPosition closestPositionToPointWithinRange(@ByValue CGPoint point, UITextRange range);

    @Generated
    @Selector("comparePosition:toPosition:")
    @NInt
    public native long comparePositionToPosition(UITextPosition position, UITextPosition other);

    /**
     * dataDetectorTypes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/dataDetectorTypes">iOS Dev Center</a>
     */
    @Generated
    @Selector("dataDetectorTypes")
    @NUInt
    public native long dataDetectorTypes();

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object delegate();

    @Generated
    @Selector("deleteBackward")
    public native void deleteBackward();

    @Generated
    @IsOptional
    @Selector("dictationRecognitionFailed")
    public native void dictationRecognitionFailed();

    @Generated
    @IsOptional
    @Selector("dictationRecordingDidEnd")
    public native void dictationRecordingDidEnd();

    @Generated
    @IsOptional
    @Selector("enablesReturnKeyAutomatically")
    public native boolean enablesReturnKeyAutomatically();

    @Generated
    @Selector("endOfDocument")
    public native UITextPosition endOfDocument();

    @Generated
    @Selector("firstRectForRange:")
    @ByValue
    public native CGRect firstRectForRange(UITextRange range);

    /**
     * font</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/font">iOS Dev Center</a>
     */
    @Generated
    @Selector("font")
    public native UIFont font();

    @Generated
    @IsOptional
    @Selector("frameForDictationResultPlaceholder:")
    @ByValue
    public native CGRect frameForDictationResultPlaceholder(@Mapped(ObjCObjectMapper.class) Object placeholder);

    @Generated
    @Selector("hasText")
    public native boolean hasText();

    @Generated
    @Selector("init")
    public native UITextView init();

    @Generated
    @Selector("initWithFrame:")
    public native UITextView initWithFrame(@ByValue CGRect frame);

    /**
     * initWithFrame:textContainer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instm/UITextView/initWithFrame:textContainer:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithFrame:textContainer:")
    public native UITextView initWithFrameTextContainer(@ByValue CGRect frame, NSTextContainer textContainer);

    /**
     * inputAccessoryView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/inputAccessoryView">iOS Dev Center</a>
     */
    @Generated
    @Selector("inputAccessoryView")
    public native UIView inputAccessoryView();

    @Generated
    @Selector("inputDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object inputDelegate();

    /**
     * inputView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/inputView">iOS Dev Center</a>
     */
    @Generated
    @Selector("inputView")
    public native UIView inputView();

    @Generated
    @IsOptional
    @Selector("insertDictationResult:")
    public native void insertDictationResult(NSArray<? extends UIDictationPhrase> dictationResult);

    @Generated
    @IsOptional
    @Selector("insertDictationResultPlaceholder")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object insertDictationResultPlaceholder();

    @Generated
    @Selector("insertText:")
    public native void insertText(String text);

    /**
     * editable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/editable">iOS Dev Center</a>
     */
    @Generated
    @Selector("isEditable")
    public native boolean isEditable();

    @Generated
    @IsOptional
    @Selector("isSecureTextEntry")
    public native boolean isSecureTextEntry();

    /**
     * selectable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/selectable">iOS Dev Center</a>
     */
    @Generated
    @Selector("isSelectable")
    public native boolean isSelectable();

    @Generated
    @IsOptional
    @Selector("keyboardAppearance")
    @NInt
    public native long keyboardAppearance();

    @Generated
    @IsOptional
    @Selector("keyboardType")
    @NInt
    public native long keyboardType();

    /**
     * layoutManager</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/layoutManager">iOS Dev Center</a>
     */
    @Generated
    @Selector("layoutManager")
    public native NSLayoutManager layoutManager();

    /**
     * linkTextAttributes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/linkTextAttributes">iOS Dev Center</a>
     */
    @Generated
    @Selector("linkTextAttributes")
    public native NSDictionary<String, ?> linkTextAttributes();

    @Generated
    @Selector("markedTextRange")
    public native UITextRange markedTextRange();

    @Generated
    @Selector("markedTextStyle")
    public native NSDictionary<?, ?> markedTextStyle();

    @Generated
    @Selector("offsetFromPosition:toPosition:")
    @NInt
    public native long offsetFromPositionToPosition(UITextPosition from, UITextPosition toPosition);

    @Generated
    @Selector("positionFromPosition:inDirection:offset:")
    public native UITextPosition positionFromPositionInDirectionOffset(UITextPosition position, @NInt long direction,
            @NInt long offset);

    @Generated
    @Selector("positionFromPosition:offset:")
    public native UITextPosition positionFromPositionOffset(UITextPosition position, @NInt long offset);

    @Generated
    @IsOptional
    @Selector("positionWithinRange:atCharacterOffset:")
    public native UITextPosition positionWithinRangeAtCharacterOffset(UITextRange range, @NInt long offset);

    @Generated
    @Selector("positionWithinRange:farthestInDirection:")
    public native UITextPosition positionWithinRangeFarthestInDirection(UITextRange range, @NInt long direction);

    @Generated
    @IsOptional
    @Selector("removeDictationResultPlaceholder:willInsertResult:")
    public native void removeDictationResultPlaceholderWillInsertResult(
            @Mapped(ObjCObjectMapper.class) Object placeholder, boolean willInsertResult);

    @Generated
    @Selector("replaceRange:withText:")
    public native void replaceRangeWithText(UITextRange range, String text);

    @Generated
    @IsOptional
    @Selector("returnKeyType")
    @NInt
    public native long returnKeyType();

    /**
     * scrollRangeToVisible:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instm/UITextView/scrollRangeToVisible:">iOS Dev Center</a>
     */
    @Generated
    @Selector("scrollRangeToVisible:")
    public native void scrollRangeToVisible(@ByValue NSRange range);

    /**
     * selectedRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/selectedRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("selectedRange")
    @ByValue
    public native NSRange selectedRange();

    @Generated
    @Selector("selectedTextRange")
    public native UITextRange selectedTextRange();

    @Generated
    @IsOptional
    @Selector("selectionAffinity")
    @NInt
    public native long selectionAffinity();

    @Generated
    @Selector("selectionRectsForRange:")
    public native NSArray<?> selectionRectsForRange(UITextRange range);

    /**
     * allowsEditingTextAttributes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/allowsEditingTextAttributes">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAllowsEditingTextAttributes:")
    public native void setAllowsEditingTextAttributes(boolean value);

    /**
     * attributedText</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/attributedText">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAttributedText:")
    public native void setAttributedText(NSAttributedString value);

    @Generated
    @IsOptional
    @Selector("setAutocapitalizationType:")
    public native void setAutocapitalizationType(@NInt long value);

    @Generated
    @IsOptional
    @Selector("setAutocorrectionType:")
    public native void setAutocorrectionType(@NInt long value);

    @Generated
    @Selector("setBaseWritingDirection:forRange:")
    public native void setBaseWritingDirectionForRange(@NInt long writingDirection, UITextRange range);

    /**
     * clearsOnInsertion</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/clearsOnInsertion">iOS Dev Center</a>
     */
    @Generated
    @Selector("setClearsOnInsertion:")
    public native void setClearsOnInsertion(boolean value);

    /**
     * dataDetectorTypes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/dataDetectorTypes">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDataDetectorTypes:")
    public native void setDataDetectorTypes(@NUInt long value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/delegate">iOS Dev Center</a>
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) Object value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * editable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/editable">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEditable:")
    public native void setEditable(boolean value);

    @Generated
    @IsOptional
    @Selector("setEnablesReturnKeyAutomatically:")
    public native void setEnablesReturnKeyAutomatically(boolean value);

    /**
     * font</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/font">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFont:")
    public native void setFont(UIFont value);

    /**
     * inputAccessoryView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/inputAccessoryView">iOS Dev Center</a>
     */
    @Generated
    @Selector("setInputAccessoryView:")
    public native void setInputAccessoryView(UIView value);

    @Generated
    @Selector("setInputDelegate:")
    public native void setInputDelegate_unsafe(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    public void setInputDelegate(@Mapped(ObjCObjectMapper.class) Object value) {
        Object __old = inputDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setInputDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * inputView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/inputView">iOS Dev Center</a>
     */
    @Generated
    @Selector("setInputView:")
    public native void setInputView(UIView value);

    @Generated
    @IsOptional
    @Selector("setKeyboardAppearance:")
    public native void setKeyboardAppearance(@NInt long value);

    @Generated
    @IsOptional
    @Selector("setKeyboardType:")
    public native void setKeyboardType(@NInt long value);

    /**
     * linkTextAttributes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/linkTextAttributes">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLinkTextAttributes:")
    public native void setLinkTextAttributes(NSDictionary<String, ?> value);

    @Generated
    @Selector("setMarkedText:selectedRange:")
    public native void setMarkedTextSelectedRange(String markedText, @ByValue NSRange selectedRange);

    @Generated
    @Selector("setMarkedTextStyle:")
    public native void setMarkedTextStyle(NSDictionary<?, ?> value);

    @Generated
    @IsOptional
    @Selector("setReturnKeyType:")
    public native void setReturnKeyType(@NInt long value);

    @Generated
    @IsOptional
    @Selector("setSecureTextEntry:")
    public native void setSecureTextEntry(boolean value);

    /**
     * selectable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/selectable">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSelectable:")
    public native void setSelectable(boolean value);

    /**
     * selectedRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/selectedRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSelectedRange:")
    public native void setSelectedRange(@ByValue NSRange value);

    @Generated
    @Selector("setSelectedTextRange:")
    public native void setSelectedTextRange(UITextRange value);

    @Generated
    @IsOptional
    @Selector("setSelectionAffinity:")
    public native void setSelectionAffinity(@NInt long value);

    @Generated
    @IsOptional
    @Selector("setSpellCheckingType:")
    public native void setSpellCheckingType(@NInt long value);

    /**
     * text</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/text">iOS Dev Center</a>
     */
    @Generated
    @Selector("setText:")
    public native void setText(String value);

    /**
     * textAlignment</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/textAlignment">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTextAlignment:")
    public native void setTextAlignment(@NInt long value);

    /**
     * textColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/textColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTextColor:")
    public native void setTextColor(UIColor value);

    /**
     * textContainerInset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/textContainerInset">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTextContainerInset:")
    public native void setTextContainerInset(@ByValue UIEdgeInsets value);

    /**
     * typingAttributes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/typingAttributes">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTypingAttributes:")
    public native void setTypingAttributes(NSDictionary<String, ?> value);

    @Generated
    @IsOptional
    @Selector("shouldChangeTextInRange:replacementText:")
    public native boolean shouldChangeTextInRangeReplacementText(UITextRange range, String text);

    @Generated
    @IsOptional
    @Selector("spellCheckingType")
    @NInt
    public native long spellCheckingType();

    /**
     * text</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/text">iOS Dev Center</a>
     */
    @Generated
    @Selector("text")
    public native String text();

    /**
     * textAlignment</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/textAlignment">iOS Dev Center</a>
     */
    @Generated
    @Selector("textAlignment")
    @NInt
    public native long textAlignment();

    /**
     * textColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/textColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("textColor")
    public native UIColor textColor();

    /**
     * textContainer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/textContainer">iOS Dev Center</a>
     */
    @Generated
    @Selector("textContainer")
    public native NSTextContainer textContainer();

    /**
     * textContainerInset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/textContainerInset">iOS Dev Center</a>
     */
    @Generated
    @Selector("textContainerInset")
    @ByValue
    public native UIEdgeInsets textContainerInset();

    @Generated
    @Selector("textInRange:")
    public native String textInRange(UITextRange range);

    @Generated
    @IsOptional
    @Selector("textInputView")
    public native UIView textInputView();

    @Generated
    @Selector("textRangeFromPosition:toPosition:")
    public native UITextRange textRangeFromPositionToPosition(UITextPosition fromPosition, UITextPosition toPosition);

    /**
     * textStorage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/textStorage">iOS Dev Center</a>
     */
    @Generated
    @Selector("textStorage")
    public native NSTextStorage textStorage();

    @Generated
    @IsOptional
    @Selector("textStylingAtPosition:inDirection:")
    public native NSDictionary<String, ?> textStylingAtPositionInDirection(UITextPosition position,
            @NInt long direction);

    @Generated
    @Selector("tokenizer")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object tokenizer();

    /**
     * typingAttributes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextView_Class/index.html#//apple_ref/occ/instp/UITextView/typingAttributes">iOS Dev Center</a>
     */
    @Generated
    @Selector("typingAttributes")
    public native NSDictionary<String, ?> typingAttributes();

    @Generated
    @Selector("unmarkText")
    public native void unmarkText();

    @Generated
    @IsOptional
    @Selector("beginFloatingCursorAtPoint:")
    public native void beginFloatingCursorAtPoint(@ByValue CGPoint point);

    @Generated
    @IsOptional
    @Selector("endFloatingCursor")
    public native void endFloatingCursor();

    @Generated
    @Selector("initWithCoder:")
    public native UITextView initWithCoder(NSCoder aDecoder);

    @Generated
    @IsOptional
    @Selector("updateFloatingCursorAtPoint:")
    public native void updateFloatingCursorAtPoint(@ByValue CGPoint point);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("addKeyframeWithRelativeStartTime:relativeDuration:animations:")
    public static native void addKeyframeWithRelativeStartTimeRelativeDurationAnimations(double frameStartTime,
            double frameDuration,
            @ObjCBlock(name = "call_addKeyframeWithRelativeStartTimeRelativeDurationAnimations") UIView.Block_addKeyframeWithRelativeStartTimeRelativeDurationAnimations animations);

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("animateKeyframesWithDuration:delay:options:animations:completion:")
    public static native void animateKeyframesWithDurationDelayOptionsAnimationsCompletion(double duration,
            double delay, @NUInt long options,
            @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:animations:")
    public static native void animateWithDurationAnimations(double duration,
            @ObjCBlock(name = "call_animateWithDurationAnimations") UIView.Block_animateWithDurationAnimations animations);

    @Generated
    @Selector("animateWithDuration:animations:completion:")
    public static native void animateWithDurationAnimationsCompletion(double duration,
            @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_1") UIView.Block_animateWithDurationAnimationsCompletion_1 animations,
            @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_2") UIView.Block_animateWithDurationAnimationsCompletion_2 completion);

    @Generated
    @Selector("animateWithDuration:delay:options:animations:completion:")
    public static native void animateWithDurationDelayOptionsAnimationsCompletion(double duration, double delay,
            @NUInt long options,
            @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:delay:usingSpringWithDamping:initialSpringVelocity:options:animations:completion:")
    public static native void animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion(
            double duration, double delay, @NFloat double dampingRatio, @NFloat double velocity, @NUInt long options,
            @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5 animations,
            @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6 completion);

    @Generated
    @Selector("appearance")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearance();

    @Generated
    @ProtocolClassMethod("appearance")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearance() {
        return appearance();
    }

    @Generated
    @Selector("appearanceForTraitCollection:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceForTraitCollection(UITraitCollection trait);

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollection(UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs);

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes);

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) Object ContainerClass,
            Object... varargs);

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes);

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    @Generated
    @Selector("areAnimationsEnabled")
    public static native boolean areAnimationsEnabled();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("beginAnimations:context:")
    public static native void beginAnimationsContext(String animationID, VoidPtr context);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

    @Generated
    @Selector("commitAnimations")
    public static native void commitAnimations();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("inheritedAnimationDuration")
    public static native double inheritedAnimationDuration();

    @Generated
    @Selector("initialize")
    public static native void initialize();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("layerClass")
    public static native Class layerClass();

    @Generated
    @Selector("load")
    public static native void load_objc_static();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("performSystemAnimation:onViews:options:animations:completion:")
    public static native void performSystemAnimationOnViewsOptionsAnimationsCompletion(@NUInt long animation,
            NSArray<? extends UIView> views, @NUInt long options,
            @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_3") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_3 parallelAnimations,
            @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_4") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("performWithoutAnimation:")
    public static native void performWithoutAnimation(
            @ObjCBlock(name = "call_performWithoutAnimation") UIView.Block_performWithoutAnimation actionsWithoutAnimation);

    @Generated
    @Selector("requiresConstraintBasedLayout")
    public static native boolean requiresConstraintBasedLayout();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setAnimationBeginsFromCurrentState:")
    public static native void setAnimationBeginsFromCurrentState(boolean fromCurrentState);

    @Generated
    @Selector("setAnimationCurve:")
    public static native void setAnimationCurve(@NInt long curve);

    @Generated
    @Selector("setAnimationDelay:")
    public static native void setAnimationDelay(double delay);

    @Generated
    @Selector("setAnimationDelegate:")
    public static native void setAnimationDelegate(@Mapped(ObjCObjectMapper.class) Object delegate);

    @Generated
    @Selector("setAnimationDidStopSelector:")
    public static native void setAnimationDidStopSelector(SEL selector);

    @Generated
    @Selector("setAnimationDuration:")
    public static native void setAnimationDuration(double duration);

    @Generated
    @Selector("setAnimationRepeatAutoreverses:")
    public static native void setAnimationRepeatAutoreverses(boolean repeatAutoreverses);

    @Generated
    @Selector("setAnimationRepeatCount:")
    public static native void setAnimationRepeatCount(float repeatCount);

    @Generated
    @Selector("setAnimationStartDate:")
    public static native void setAnimationStartDate(NSDate startDate);

    @Generated
    @Selector("setAnimationTransition:forView:cache:")
    public static native void setAnimationTransitionForViewCache(@NInt long transition, UIView view, boolean cache);

    @Generated
    @Selector("setAnimationWillStartSelector:")
    public static native void setAnimationWillStartSelector(SEL selector);

    @Generated
    @Selector("setAnimationsEnabled:")
    public static native void setAnimationsEnabled(boolean enabled);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("transitionFromView:toView:duration:options:completion:")
    public static native void transitionFromViewToViewDurationOptionsCompletion(UIView fromView, UIView toView,
            double duration, @NUInt long options,
            @ObjCBlock(name = "call_transitionFromViewToViewDurationOptionsCompletion") UIView.Block_transitionFromViewToViewDurationOptionsCompletion completion);

    @Generated
    @Selector("transitionWithView:duration:options:animations:completion:")
    public static native void transitionWithViewDurationOptionsAnimationsCompletion(UIView view, double duration,
            @NUInt long options,
            @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_3") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_4") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:")
    @NInt
    public static native long userInterfaceLayoutDirectionForSemanticContentAttribute(@NInt long attribute);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
