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
    @Generated
    @IsOptional
    @Deprecated
    @Selector("alertView:clickedButtonAtIndex:")
    default void alertViewClickedButtonAtIndex(UIAlertView alertView, @NInt long buttonIndex) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Deprecated
    @Selector("alertView:didDismissWithButtonIndex:")
    default void alertViewDidDismissWithButtonIndex(UIAlertView alertView, @NInt long buttonIndex) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Deprecated
    @Selector("alertView:willDismissWithButtonIndex:")
    default void alertViewWillDismissWithButtonIndex(UIAlertView alertView, @NInt long buttonIndex) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Deprecated
    @Selector("alertViewCancel:")
    default void alertViewCancel(UIAlertView alertView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Deprecated
    @Selector("alertViewShouldEnableFirstOtherButton:")
    default boolean alertViewShouldEnableFirstOtherButton(UIAlertView alertView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Deprecated
    @Selector("didPresentAlertView:")
    default void didPresentAlertView(UIAlertView alertView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Deprecated
    @Selector("willPresentAlertView:")
    default void willPresentAlertView(UIAlertView alertView) {
        throw new java.lang.UnsupportedOperationException();
    }
}
