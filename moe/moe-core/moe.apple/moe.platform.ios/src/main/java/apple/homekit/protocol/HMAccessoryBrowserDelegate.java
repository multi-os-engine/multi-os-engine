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

package apple.homekit.protocol;

import apple.homekit.HMAccessory;
import apple.homekit.HMAccessoryBrowser;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * This delegate receives updates about new accessories in the home.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("HMAccessoryBrowserDelegate")
public interface HMAccessoryBrowserDelegate {
    /**
     * Informs the delegate about new accessories discovered in the home.
     * 
     * @param browser   Sender of the message.
     * 
     * @param accessory New accessory that was discovered.
     */
    @Generated
    @IsOptional
    @Selector("accessoryBrowser:didFindNewAccessory:")
    default void accessoryBrowserDidFindNewAccessory(@NotNull HMAccessoryBrowser browser,
            @NotNull HMAccessory accessory) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate about new accessories removed from the home.
     * 
     * @param browser   Sender of the message.
     * 
     * @param accessory Accessory that was previously discovered but are no longer reachable.
     *                  This method is also invoked when an accessory is added to a home.
     */
    @Generated
    @IsOptional
    @Selector("accessoryBrowser:didRemoveNewAccessory:")
    default void accessoryBrowserDidRemoveNewAccessory(@NotNull HMAccessoryBrowser browser,
            @NotNull HMAccessory accessory) {
        throw new java.lang.UnsupportedOperationException();
    }
}
