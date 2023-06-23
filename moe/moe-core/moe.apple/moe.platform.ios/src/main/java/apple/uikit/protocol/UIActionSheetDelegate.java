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

import apple.uikit.UIActionSheet;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIActionSheetDelegate")
public interface UIActionSheetDelegate {
    /**
     * Called when a button is clicked. The view will be automatically dismissed after this call returns
     * 
     * API-Since: 2.0
     * Deprecated-Since: 8.3
     * Deprecated-Message: Use UIAlertController instead.
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("actionSheet:clickedButtonAtIndex:")
    default void actionSheetClickedButtonAtIndex(@NotNull UIActionSheet actionSheet, @NInt long buttonIndex) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * after animation
     * 
     * API-Since: 2.0
     * Deprecated-Since: 8.3
     * Deprecated-Message: Use UIAlertController instead.
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("actionSheet:didDismissWithButtonIndex:")
    default void actionSheetDidDismissWithButtonIndex(@NotNull UIActionSheet actionSheet, @NInt long buttonIndex) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * before animation and hiding view
     * 
     * API-Since: 2.0
     * Deprecated-Since: 8.3
     * Deprecated-Message: Use UIAlertController instead.
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("actionSheet:willDismissWithButtonIndex:")
    default void actionSheetWillDismissWithButtonIndex(@NotNull UIActionSheet actionSheet, @NInt long buttonIndex) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when we cancel a view (eg. the user clicks the Home button). This is not called when the user clicks the
     * cancel button.
     * If not defined in the delegate, we simulate a click in the cancel button
     * 
     * API-Since: 2.0
     * Deprecated-Since: 8.3
     * Deprecated-Message: Use UIAlertController instead.
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("actionSheetCancel:")
    default void actionSheetCancel(@NotNull UIActionSheet actionSheet) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * after animation
     * 
     * API-Since: 2.0
     * Deprecated-Since: 8.3
     * Deprecated-Message: Use UIAlertController instead.
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("didPresentActionSheet:")
    default void didPresentActionSheet(@NotNull UIActionSheet actionSheet) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * before animation and showing view
     * 
     * API-Since: 2.0
     * Deprecated-Since: 8.3
     * Deprecated-Message: Use UIAlertController instead.
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("willPresentActionSheet:")
    default void willPresentActionSheet(@NotNull UIActionSheet actionSheet) {
        throw new java.lang.UnsupportedOperationException();
    }
}
