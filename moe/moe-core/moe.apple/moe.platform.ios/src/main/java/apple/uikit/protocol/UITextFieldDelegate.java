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
     * textField:shouldChangeCharactersInRange:replacementString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextFieldDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITextFieldDelegate/textField:shouldChangeCharactersInRange:replacementString:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("textField:shouldChangeCharactersInRange:replacementString:")
    default boolean textFieldShouldChangeCharactersInRangeReplacementString(UITextField textField,
            @ByValue NSRange range, String string) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * textFieldDidBeginEditing:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextFieldDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITextFieldDelegate/textFieldDidBeginEditing:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("textFieldDidBeginEditing:")
    default void textFieldDidBeginEditing(UITextField textField) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * textFieldDidEndEditing:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextFieldDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITextFieldDelegate/textFieldDidEndEditing:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("textFieldDidEndEditing:")
    default void textFieldDidEndEditing(UITextField textField) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * textFieldShouldBeginEditing:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextFieldDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITextFieldDelegate/textFieldShouldBeginEditing:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("textFieldShouldBeginEditing:")
    default boolean textFieldShouldBeginEditing(UITextField textField) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * textFieldShouldClear:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextFieldDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITextFieldDelegate/textFieldShouldClear:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("textFieldShouldClear:")
    default boolean textFieldShouldClear(UITextField textField) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * textFieldShouldEndEditing:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextFieldDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITextFieldDelegate/textFieldShouldEndEditing:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("textFieldShouldEndEditing:")
    default boolean textFieldShouldEndEditing(UITextField textField) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * textFieldShouldReturn:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextFieldDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITextFieldDelegate/textFieldShouldReturn:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("textFieldShouldReturn:")
    default boolean textFieldShouldReturn(UITextField textField) {
        throw new java.lang.UnsupportedOperationException();
    }
}
