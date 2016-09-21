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

import apple.foundation.NSURL;
import apple.foundation.struct.NSRange;
import apple.uikit.NSTextAttachment;
import apple.uikit.UITextView;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextViewDelegate")
public interface UITextViewDelegate extends UIScrollViewDelegate {
    @Generated
    @IsOptional
    @Selector("textView:shouldChangeTextInRange:replacementText:")
    default boolean textViewShouldChangeTextInRangeReplacementText(UITextView textView, @ByValue NSRange range,
            String text) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textView:shouldInteractWithTextAttachment:inRange:")
    default boolean textViewShouldInteractWithTextAttachmentInRange(UITextView textView,
            NSTextAttachment textAttachment, @ByValue NSRange characterRange) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textView:shouldInteractWithTextAttachment:inRange:interaction:")
    default boolean textViewShouldInteractWithTextAttachmentInRangeInteraction(UITextView textView,
            NSTextAttachment textAttachment, @ByValue NSRange characterRange, @NInt long interaction) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textView:shouldInteractWithURL:inRange:")
    default boolean textViewShouldInteractWithURLInRange(UITextView textView, NSURL URL,
            @ByValue NSRange characterRange) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textView:shouldInteractWithURL:inRange:interaction:")
    default boolean textViewShouldInteractWithURLInRangeInteraction(UITextView textView, NSURL URL,
            @ByValue NSRange characterRange, @NInt long interaction) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textViewDidBeginEditing:")
    default void textViewDidBeginEditing(UITextView textView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textViewDidChange:")
    default void textViewDidChange(UITextView textView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textViewDidChangeSelection:")
    default void textViewDidChangeSelection(UITextView textView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textViewDidEndEditing:")
    default void textViewDidEndEditing(UITextView textView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textViewShouldBeginEditing:")
    default boolean textViewShouldBeginEditing(UITextView textView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textViewShouldEndEditing:")
    default boolean textViewShouldEndEditing(UITextView textView) {
        throw new java.lang.UnsupportedOperationException();
    }
}
