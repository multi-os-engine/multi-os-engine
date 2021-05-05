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

import apple.uikit.UITextInputPasswordRules;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * UITextInputTraits
 * 
 * Controls features of text widgets (or other custom objects that might wish
 * to respond to keyboard input).
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextInputTraits")
public interface UITextInputTraits {
    /**
     * default is UITextAutocapitalizationTypeSentences
     */
    @Generated
    @IsOptional
    @Selector("autocapitalizationType")
    @NInt
    default long autocapitalizationType() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * default is UITextAutocorrectionTypeDefault
     */
    @Generated
    @IsOptional
    @Selector("autocorrectionType")
    @NInt
    default long autocorrectionType() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * default is NO (when YES, will automatically disable return key when text widget has zero-length contents, and will automatically enable when text widget has non-zero-length contents)
     */
    @Generated
    @IsOptional
    @Selector("enablesReturnKeyAutomatically")
    default boolean enablesReturnKeyAutomatically() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * default is NO
     */
    @Generated
    @IsOptional
    @Selector("isSecureTextEntry")
    default boolean isSecureTextEntry() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * default is NO
     */
    @Generated
    @IsOptional
    @Selector("setSecureTextEntry:")
    default void setSecureTextEntry(boolean value) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * default is UIKeyboardAppearanceDefault
     */
    @Generated
    @IsOptional
    @Selector("keyboardAppearance")
    @NInt
    default long keyboardAppearance() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * default is UIKeyboardTypeDefault
     */
    @Generated
    @IsOptional
    @Selector("keyboardType")
    @NInt
    default long keyboardType() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * default is UIReturnKeyDefault (See note under UIReturnKeyType enum)
     */
    @Generated
    @IsOptional
    @Selector("returnKeyType")
    @NInt
    default long returnKeyType() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * default is UITextAutocapitalizationTypeSentences
     */
    @Generated
    @IsOptional
    @Selector("setAutocapitalizationType:")
    default void setAutocapitalizationType(@NInt long value) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * default is UITextAutocorrectionTypeDefault
     */
    @Generated
    @IsOptional
    @Selector("setAutocorrectionType:")
    default void setAutocorrectionType(@NInt long value) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * default is NO (when YES, will automatically disable return key when text widget has zero-length contents, and will automatically enable when text widget has non-zero-length contents)
     */
    @Generated
    @IsOptional
    @Selector("setEnablesReturnKeyAutomatically:")
    default void setEnablesReturnKeyAutomatically(boolean value) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * default is UIKeyboardAppearanceDefault
     */
    @Generated
    @IsOptional
    @Selector("setKeyboardAppearance:")
    default void setKeyboardAppearance(@NInt long value) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * default is UIKeyboardTypeDefault
     */
    @Generated
    @IsOptional
    @Selector("setKeyboardType:")
    default void setKeyboardType(@NInt long value) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * default is UIReturnKeyDefault (See note under UIReturnKeyType enum)
     */
    @Generated
    @IsOptional
    @Selector("setReturnKeyType:")
    default void setReturnKeyType(@NInt long value) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * default is UITextSpellCheckingTypeDefault;
     */
    @Generated
    @IsOptional
    @Selector("setSpellCheckingType:")
    default void setSpellCheckingType(@NInt long value) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * default is nil
     */
    @Generated
    @IsOptional
    @Selector("setTextContentType:")
    default void setTextContentType(String value) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * default is UITextSpellCheckingTypeDefault;
     */
    @Generated
    @IsOptional
    @Selector("spellCheckingType")
    @NInt
    default long spellCheckingType() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * default is nil
     */
    @Generated
    @IsOptional
    @Selector("textContentType")
    default String textContentType() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * default is UITextSmartDashesTypeDefault;
     */
    @Generated
    @IsOptional
    @Selector("setSmartDashesType:")
    default void setSmartDashesType(@NInt long value) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * default is UITextSmartInsertDeleteTypeDefault;
     */
    @Generated
    @IsOptional
    @Selector("setSmartInsertDeleteType:")
    default void setSmartInsertDeleteType(@NInt long value) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * default is UITextSmartQuotesTypeDefault;
     */
    @Generated
    @IsOptional
    @Selector("setSmartQuotesType:")
    default void setSmartQuotesType(@NInt long value) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * default is UITextSmartDashesTypeDefault;
     */
    @Generated
    @IsOptional
    @Selector("smartDashesType")
    @NInt
    default long smartDashesType() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * default is UITextSmartInsertDeleteTypeDefault;
     */
    @Generated
    @IsOptional
    @Selector("smartInsertDeleteType")
    @NInt
    default long smartInsertDeleteType() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * default is UITextSmartQuotesTypeDefault;
     */
    @Generated
    @IsOptional
    @Selector("smartQuotesType")
    @NInt
    default long smartQuotesType() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * default is nil
     */
    @Generated
    @IsOptional
    @Selector("passwordRules")
    default UITextInputPasswordRules passwordRules() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * default is nil
     */
    @Generated
    @IsOptional
    @Selector("setPasswordRules:")
    default void setPasswordRules(UITextInputPasswordRules value) {
        throw new java.lang.UnsupportedOperationException();
    }
}
