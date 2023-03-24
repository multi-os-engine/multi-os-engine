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
import apple.foundation.NSArray;
import apple.uikit.UIMenu;
import apple.uikit.UIMenuElement;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
    default boolean textFieldShouldChangeCharactersInRangeReplacementString(@NotNull UITextField textField,
            @ByValue NSRange range, @NotNull String string) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * became first responder
     */
    @Generated
    @IsOptional
    @Selector("textFieldDidBeginEditing:")
    default void textFieldDidBeginEditing(@NotNull UITextField textField) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * may be called if forced even if shouldEndEditing returns NO (e.g. view removed from window) or endEditing:YES
     * called
     */
    @Generated
    @IsOptional
    @Selector("textFieldDidEndEditing:")
    default void textFieldDidEndEditing(@NotNull UITextField textField) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * if implemented, called in place of textFieldDidEndEditing:
     * 
     * API-Since: 10.0
     */
    @Generated
    @IsOptional
    @Selector("textFieldDidEndEditing:reason:")
    default void textFieldDidEndEditingReason(@NotNull UITextField textField, @NInt long reason) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * return NO to disallow editing.
     */
    @Generated
    @IsOptional
    @Selector("textFieldShouldBeginEditing:")
    default boolean textFieldShouldBeginEditing(@NotNull UITextField textField) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * called when clear button pressed. return NO to ignore (no notifications)
     */
    @Generated
    @IsOptional
    @Selector("textFieldShouldClear:")
    default boolean textFieldShouldClear(@NotNull UITextField textField) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * return YES to allow editing to stop and to resign first responder status. NO to disallow the editing session to
     * end
     */
    @Generated
    @IsOptional
    @Selector("textFieldShouldEndEditing:")
    default boolean textFieldShouldEndEditing(@NotNull UITextField textField) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * called when 'return' key pressed. return NO to ignore.
     */
    @Generated
    @IsOptional
    @Selector("textFieldShouldReturn:")
    default boolean textFieldShouldReturn(@NotNull UITextField textField) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("textFieldDidChangeSelection:")
    default void textFieldDidChangeSelection(@NotNull UITextField textField) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Asks the delegate for the menu to be shown for the specified text range.
     * 
     * @param textField        The text field requesting the menu.
     * @param range            The characters range for which the menu is presented for.
     * @param suggestedActions The actions and commands that the system suggests.
     * 
     * @return Return a UIMenu describing the desired menu hierarchy. Return @c nil to present the default system menu.
     * 
     *         API-Since: 16.0
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("textField:editMenuForCharactersInRange:suggestedActions:")
    default UIMenu textFieldEditMenuForCharactersInRangeSuggestedActions(@NotNull UITextField textField,
            @ByValue NSRange range, @NotNull NSArray<? extends UIMenuElement> suggestedActions) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the text field is about to dismiss the edit menu.
     * 
     * @param textField The text field displaying the menu.
     * @param animator  Dismissal animator. Add animations to this object to run them alongside the dismissal
     *                  transition.
     * 
     *                  API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("textField:willDismissEditMenuWithAnimator:")
    default void textFieldWillDismissEditMenuWithAnimator(@NotNull UITextField textField,
            @NotNull @Mapped(ObjCObjectMapper.class) UIEditMenuInteractionAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the text field is about to present the edit menu.
     * 
     * @param textField The text field displaying the menu.
     * @param animator  Appearance animator. Add animations to this object to run them alongside the appearance
     *                  transition.
     * 
     *                  API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("textField:willPresentEditMenuWithAnimator:")
    default void textFieldWillPresentEditMenuWithAnimator(@NotNull UITextField textField,
            @NotNull @Mapped(ObjCObjectMapper.class) UIEditMenuInteractionAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }
}
