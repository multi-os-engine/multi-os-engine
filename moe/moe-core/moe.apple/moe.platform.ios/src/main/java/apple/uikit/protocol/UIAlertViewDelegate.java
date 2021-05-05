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

import apple.uikit.UIAlertView;
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
@ObjCProtocolName("UIAlertViewDelegate")
public interface UIAlertViewDelegate {
    /**
     * Called when a button is clicked. The view will be automatically dismissed after this call returns
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("alertView:clickedButtonAtIndex:")
    default void alertViewClickedButtonAtIndex(UIAlertView alertView, @NInt long buttonIndex) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * after animation
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("alertView:didDismissWithButtonIndex:")
    default void alertViewDidDismissWithButtonIndex(UIAlertView alertView, @NInt long buttonIndex) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * before animation and hiding view
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("alertView:willDismissWithButtonIndex:")
    default void alertViewWillDismissWithButtonIndex(UIAlertView alertView, @NInt long buttonIndex) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when we cancel a view (eg. the user clicks the Home button). This is not called when the user clicks the cancel button.
     * If not defined in the delegate, we simulate a click in the cancel button
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("alertViewCancel:")
    default void alertViewCancel(UIAlertView alertView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called after edits in any of the default fields added by the style
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("alertViewShouldEnableFirstOtherButton:")
    default boolean alertViewShouldEnableFirstOtherButton(UIAlertView alertView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * after animation
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("didPresentAlertView:")
    default void didPresentAlertView(UIAlertView alertView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * before animation and showing view
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("willPresentAlertView:")
    default void willPresentAlertView(UIAlertView alertView) {
        throw new java.lang.UnsupportedOperationException();
    }
}
