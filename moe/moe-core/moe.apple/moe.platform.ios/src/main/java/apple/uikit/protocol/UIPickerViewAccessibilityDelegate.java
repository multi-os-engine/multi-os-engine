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

import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.uikit.UIPickerView;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Optionally implement the following methods in a UIPickerView delegate
 * in order to provide accessibility information per component.
 * See UIAccessibility.h for more information about hints and labels.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIPickerViewAccessibilityDelegate")
public interface UIPickerViewAccessibilityDelegate extends UIPickerViewDelegate {
    @Nullable
    @Generated
    @IsOptional
    @Selector("pickerView:accessibilityHintForComponent:")
    default String pickerViewAccessibilityHintForComponent(@NotNull UIPickerView pickerView, @NInt long component) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Nullable
    @Generated
    @IsOptional
    @Selector("pickerView:accessibilityLabelForComponent:")
    default String pickerViewAccessibilityLabelForComponent(@NotNull UIPickerView pickerView, @NInt long component) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("pickerView:accessibilityAttributedHintForComponent:")
    default NSAttributedString pickerViewAccessibilityAttributedHintForComponent(@NotNull UIPickerView pickerView,
            @NInt long component) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * If an object adopting this protocol responds to these methods, the system will try sending them before sending
     * their non-attributed versions.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("pickerView:accessibilityAttributedLabelForComponent:")
    default NSAttributedString pickerViewAccessibilityAttributedLabelForComponent(@NotNull UIPickerView pickerView,
            @NInt long component) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @IsOptional
    @Selector("pickerView:accessibilityAttributedUserInputLabelsForComponent:")
    default NSArray<? extends NSAttributedString> pickerViewAccessibilityAttributedUserInputLabelsForComponent(
            @NotNull UIPickerView pickerView, @NInt long component) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @IsOptional
    @Selector("pickerView:accessibilityUserInputLabelsForComponent:")
    default NSArray<String> pickerViewAccessibilityUserInputLabelsForComponent(@NotNull UIPickerView pickerView,
            @NInt long component) {
        throw new java.lang.UnsupportedOperationException();
    }
}
