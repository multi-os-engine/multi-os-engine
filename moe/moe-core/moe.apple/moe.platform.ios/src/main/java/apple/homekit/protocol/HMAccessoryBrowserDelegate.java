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

@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("HMAccessoryBrowserDelegate")
public interface HMAccessoryBrowserDelegate {
    /**
     * accessoryBrowser:didFindNewAccessory:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMAccessoryBrowserDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMAccessoryBrowserDelegate/accessoryBrowser:didFindNewAccessory:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("accessoryBrowser:didFindNewAccessory:")
    default void accessoryBrowserDidFindNewAccessory(HMAccessoryBrowser browser, HMAccessory accessory) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * accessoryBrowser:didRemoveNewAccessory:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMAccessoryBrowserDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMAccessoryBrowserDelegate/accessoryBrowser:didRemoveNewAccessory:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("accessoryBrowser:didRemoveNewAccessory:")
    default void accessoryBrowserDidRemoveNewAccessory(HMAccessoryBrowser browser, HMAccessory accessory) {
        throw new java.lang.UnsupportedOperationException();
    }
}
