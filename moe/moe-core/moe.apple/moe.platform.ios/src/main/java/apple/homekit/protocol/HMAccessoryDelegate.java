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
import apple.homekit.HMAccessoryProfile;
import apple.homekit.HMCharacteristic;
import apple.homekit.HMService;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * This defines the protocol for a delegate to receive updates about
 * different aspects of an accessory
 * 
 * API-Since: 8.0
 */
@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("HMAccessoryDelegate")
public interface HMAccessoryDelegate {
    /**
     * Informs the delegate when the associated service type of a service is modified.
     * 
     * @param accessory Sender of the message.
     * 
     * @param service   Service whose associated service type was modified.
     */
    @Generated
    @IsOptional
    @Selector("accessory:didUpdateAssociatedServiceTypeForService:")
    default void accessoryDidUpdateAssociatedServiceTypeForService(HMAccessory accessory, HMService service) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate when the name of a service is modfied.
     * 
     * @param accessory Sender of the message.
     * 
     * @param service   Service whose name was modified.
     */
    @Generated
    @IsOptional
    @Selector("accessory:didUpdateNameForService:")
    default void accessoryDidUpdateNameForService(HMAccessory accessory, HMService service) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate of a change in value of a characteristic.
     * 
     * @param accessory      Sender of this message
     * 
     * @param service        HMService that contains the characteristic whose value was modified.
     * 
     * @param characteristic The characteristic whose value was changed.
     */
    @Generated
    @IsOptional
    @Selector("accessory:service:didUpdateValueForCharacteristic:")
    default void accessoryServiceDidUpdateValueForCharacteristic(HMAccessory accessory, HMService service,
            HMCharacteristic characteristic) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate when the name of the accessory is modified.
     * 
     * @param accessory Sender of the message.
     */
    @Generated
    @IsOptional
    @Selector("accessoryDidUpdateName:")
    default void accessoryDidUpdateName(HMAccessory accessory) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate when the reachability of the accessory changes.
     * 
     * @param accessory Sender of the message.
     */
    @Generated
    @IsOptional
    @Selector("accessoryDidUpdateReachability:")
    default void accessoryDidUpdateReachability(HMAccessory accessory) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate when the services on the accessory have been dynamically updated.
     * The services discovered are accessible via the 'services' property of the accessory.
     * 
     * @param accessory Sender of the message.
     */
    @Generated
    @IsOptional
    @Selector("accessoryDidUpdateServices:")
    default void accessoryDidUpdateServices(HMAccessory accessory) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate when a profile is added to an accessory.
     * 
     * @param accessory Sender of the message.
     * @param profile   The added profile.
     * 
     *                  API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("accessory:didAddProfile:")
    default void accessoryDidAddProfile(HMAccessory accessory, HMAccessoryProfile profile) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate when a profile is removed from an accessory.
     * 
     * @param accessory Sender of the message.
     * @param profile   The removed profile.
     * 
     *                  API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("accessory:didRemoveProfile:")
    default void accessoryDidRemoveProfile(HMAccessory accessory, HMAccessoryProfile profile) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate when firmwareVersion has been changed for an accessory.
     * 
     * @param accessory       Sender of the message.
     * 
     * @param firmwareVersion The newly updated firmwareVersion.
     * 
     *                        API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("accessory:didUpdateFirmwareVersion:")
    default void accessoryDidUpdateFirmwareVersion(HMAccessory accessory, String firmwareVersion) {
        throw new java.lang.UnsupportedOperationException();
    }
}
