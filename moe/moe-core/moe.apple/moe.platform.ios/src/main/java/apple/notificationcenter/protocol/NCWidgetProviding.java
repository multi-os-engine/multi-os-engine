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

package apple.notificationcenter.protocol;

import apple.uikit.struct.UIEdgeInsets;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("NotificationCenter")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NCWidgetProviding")
public interface NCWidgetProviding {
    /**
     * widgetMarginInsetsForProposedMarginInsets:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NotificationCenter/Reference/NCWidgetProviding_Protocol/index.html#//apple_ref/occ/intfm/NCWidgetProviding/widgetMarginInsetsForProposedMarginInsets:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("widgetMarginInsetsForProposedMarginInsets:")
    @ByValue
    default UIEdgeInsets widgetMarginInsetsForProposedMarginInsets(@ByValue UIEdgeInsets defaultMarginInsets) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * widgetPerformUpdateWithCompletionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NotificationCenter/Reference/NCWidgetProviding_Protocol/index.html#//apple_ref/occ/intfm/NCWidgetProviding/widgetPerformUpdateWithCompletionHandler:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("widgetPerformUpdateWithCompletionHandler:")
    default void widgetPerformUpdateWithCompletionHandler(
            @ObjCBlock(name = "call_widgetPerformUpdateWithCompletionHandler") Block_widgetPerformUpdateWithCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_widgetPerformUpdateWithCompletionHandler {
        @Generated
        void call_widgetPerformUpdateWithCompletionHandler(@NUInt long arg0);
    }
}
