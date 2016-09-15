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
import apple.homekit.HMCharacteristic;
import apple.homekit.HMService;
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
@ObjCProtocolName("HMAccessoryDelegate")
public interface HMAccessoryDelegate {
    /**
     * accessory:didUpdateAssociatedServiceTypeForService:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMAccessoryDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMAccessoryDelegate/accessory:didUpdateAssociatedServiceTypeForService:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("accessory:didUpdateAssociatedServiceTypeForService:")
    default void accessoryDidUpdateAssociatedServiceTypeForService(HMAccessory accessory, HMService service) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * accessory:didUpdateNameForService:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMAccessoryDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMAccessoryDelegate/accessory:didUpdateNameForService:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("accessory:didUpdateNameForService:")
    default void accessoryDidUpdateNameForService(HMAccessory accessory, HMService service) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * accessory:service:didUpdateValueForCharacteristic:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMAccessoryDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMAccessoryDelegate/accessory:service:didUpdateValueForCharacteristic:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("accessory:service:didUpdateValueForCharacteristic:")
    default void accessoryServiceDidUpdateValueForCharacteristic(HMAccessory accessory, HMService service,
            HMCharacteristic characteristic) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * accessoryDidUpdateName:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMAccessoryDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMAccessoryDelegate/accessoryDidUpdateName:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("accessoryDidUpdateName:")
    default void accessoryDidUpdateName(HMAccessory accessory) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * accessoryDidUpdateReachability:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMAccessoryDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMAccessoryDelegate/accessoryDidUpdateReachability:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("accessoryDidUpdateReachability:")
    default void accessoryDidUpdateReachability(HMAccessory accessory) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * accessoryDidUpdateServices:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMAccessoryDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMAccessoryDelegate/accessoryDidUpdateServices:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("accessoryDidUpdateServices:")
    default void accessoryDidUpdateServices(HMAccessory accessory) {
        throw new java.lang.UnsupportedOperationException();
    }
}
