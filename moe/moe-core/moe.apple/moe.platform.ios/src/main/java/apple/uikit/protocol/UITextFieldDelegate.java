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

import apple.foundation.struct.NSRange;
import apple.uikit.UITextField;
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
@ObjCProtocolName("UITextFieldDelegate")
public interface UITextFieldDelegate {
    /**
     * return NO to not change text
     */
    @Generated
    @IsOptional
    @Selector("textField:shouldChangeCharactersInRange:replacementString:")
    default boolean textFieldShouldChangeCharactersInRangeReplacementString(UITextField textField,
            @ByValue NSRange range, String string) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * became first responder
     */
    @Generated
    @IsOptional
    @Selector("textFieldDidBeginEditing:")
    default void textFieldDidBeginEditing(UITextField textField) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * may be called if forced even if shouldEndEditing returns NO (e.g. view removed from window) or endEditing:YES
     * called
     */
    @Generated
    @IsOptional
    @Selector("textFieldDidEndEditing:")
    default void textFieldDidEndEditing(UITextField textField) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * if implemented, called in place of textFieldDidEndEditing:
     */
    @Generated
    @IsOptional
    @Selector("textFieldDidEndEditing:reason:")
    default void textFieldDidEndEditingReason(UITextField textField, @NInt long reason) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * return NO to disallow editing.
     */
    @Generated
    @IsOptional
    @Selector("textFieldShouldBeginEditing:")
    default boolean textFieldShouldBeginEditing(UITextField textField) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * called when clear button pressed. return NO to ignore (no notifications)
     */
    @Generated
    @IsOptional
    @Selector("textFieldShouldClear:")
    default boolean textFieldShouldClear(UITextField textField) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * return YES to allow editing to stop and to resign first responder status. NO to disallow the editing session to
     * end
     */
    @Generated
    @IsOptional
    @Selector("textFieldShouldEndEditing:")
    default boolean textFieldShouldEndEditing(UITextField textField) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * called when 'return' key pressed. return NO to ignore.
     */
    @Generated
    @IsOptional
    @Selector("textFieldShouldReturn:")
    default boolean textFieldShouldReturn(UITextField textField) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textFieldDidChangeSelection:")
    default void textFieldDidChangeSelection(UITextField textField) {
        throw new java.lang.UnsupportedOperationException();
    }
}
