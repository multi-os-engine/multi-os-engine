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

import apple.coregraphics.struct.CGSize;
import apple.uikit.struct.UIEdgeInsets;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * 'NCWidgetProviding' is an optional protocol for further customizing aspects of the provided content.
 */
@Generated
@Library("NotificationCenter")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NCWidgetProviding")
public interface NCWidgetProviding {
    /**
     * If implemented, called when the active display mode changes.
     * The widget may wish to change its preferredContentSize to better accommodate the new display mode.
     */
    @Generated
    @IsOptional
    @Selector("widgetActiveDisplayModeDidChange:withMaximumSize:")
    default void widgetActiveDisplayModeDidChangeWithMaximumSize(@NInt long activeDisplayMode,
            @ByValue CGSize maxSize) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Widgets wishing to customize the default margin insets can return their preferred values.
     * Widgets that choose not to implement this method will receive the default margin insets.
     */
    @Generated
    @IsOptional
    @Selector("widgetMarginInsetsForProposedMarginInsets:")
    @ByValue
    default UIEdgeInsets widgetMarginInsetsForProposedMarginInsets(@ByValue UIEdgeInsets defaultMarginInsets) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * If implemented, the system will call at opportune times for the widget to update its state, both when the
     * Notification Center is visible as well as in the background.
     * An implementation is required to enable background updates.
     * It's expected that the widget will perform the work to update asynchronously and off the main thread as much as
     * possible.
     * Widgets should call the argument block when the work is complete, passing the appropriate 'NCUpdateResult'.
     * Widgets should NOT block returning from 'viewWillAppear:' on the results of this operation.
     * Instead, widgets should load cached state in 'viewWillAppear:' in order to match the state of the view from the
     * last 'viewWillDisappear:', then transition smoothly to the new data when it arrives.
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
        void call_widgetPerformUpdateWithCompletionHandler(@NUInt long result);
    }
}
