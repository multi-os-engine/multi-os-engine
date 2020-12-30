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

package apple.corebluetooth.protocol;

import apple.corebluetooth.CBCharacteristic;
import apple.corebluetooth.CBDescriptor;
import apple.corebluetooth.CBL2CAPChannel;
import apple.corebluetooth.CBPeripheral;
import apple.corebluetooth.CBService;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSNumber;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] CBPeripheralDelegate
 * 
 * Delegate for CBPeripheral.
 */
@Generated
@Library("CoreBluetooth")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CBPeripheralDelegate")
public interface CBPeripheralDelegate {
    /**
     * peripheral:didDiscoverCharacteristicsForService:error:
     * 
     * This method returns the result of a @link discoverCharacteristics:forService: @/link call. If the characteristic(s) were read successfully,
     * 					they can be retrieved via <i>service</i>'s <code>characteristics</code> property.
     * 
     *  @param peripheral	The peripheral providing this information.
     *  @param service		The <code>CBService</code> object containing the characteristic(s).
     * @param error		If an error occurred, the cause of the failure.
     */
    @Generated
    @IsOptional
    @Selector("peripheral:didDiscoverCharacteristicsForService:error:")
    default void peripheralDidDiscoverCharacteristicsForServiceError(CBPeripheral peripheral, CBService service,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * peripheral:didDiscoverDescriptorsForCharacteristic:error:
     * 
     * This method returns the result of a @link discoverDescriptorsForCharacteristic: @/link call. If the descriptors were read successfully,
     * 						they can be retrieved via <i>characteristic</i>'s <code>descriptors</code> property.
     * 
     *  @param peripheral		The peripheral providing this information.
     *  @param characteristic	A <code>CBCharacteristic</code> object.
     * @param error			If an error occurred, the cause of the failure.
     */
    @Generated
    @IsOptional
    @Selector("peripheral:didDiscoverDescriptorsForCharacteristic:error:")
    default void peripheralDidDiscoverDescriptorsForCharacteristicError(CBPeripheral peripheral,
            CBCharacteristic characteristic, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * peripheral:didDiscoverIncludedServicesForService:error:
     * 
     * This method returns the result of a @link discoverIncludedServices:forService: @/link call. If the included service(s) were read successfully,
     * 					they can be retrieved via <i>service</i>'s <code>includedServices</code> property.
     * 
     *  @param peripheral	The peripheral providing this information.
     *  @param service		The <code>CBService</code> object containing the included services.
     * @param error		If an error occurred, the cause of the failure.
     */
    @Generated
    @IsOptional
    @Selector("peripheral:didDiscoverIncludedServicesForService:error:")
    default void peripheralDidDiscoverIncludedServicesForServiceError(CBPeripheral peripheral, CBService service,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * peripheral:didDiscoverServices:
     * 
     * This method returns the result of a @link discoverServices: @/link call. If the service(s) were read successfully, they can be retrieved via
     * 					<i>peripheral</i>'s @link services @/link property.
     * 
     *  @param peripheral	The peripheral providing this information.
     * @param error		If an error occurred, the cause of the failure.
     */
    @Generated
    @IsOptional
    @Selector("peripheral:didDiscoverServices:")
    default void peripheralDidDiscoverServices(CBPeripheral peripheral, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * peripheral:didModifyServices:
     * 
     * This method is invoked when the @link services @/link of <i>peripheral</i> have been changed.
     * 				At this point, the designated <code>CBService</code> objects have been invalidated.
     * 				Services can be re-discovered via @link discoverServices: @/link.
     * 
     * @param peripheral			The peripheral providing this update.
     * @param invalidatedServices	The services that have been invalidated
     */
    @Generated
    @IsOptional
    @Selector("peripheral:didModifyServices:")
    default void peripheralDidModifyServices(CBPeripheral peripheral,
            NSArray<? extends CBService> invalidatedServices) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * peripheral:didReadRSSI:error:
     * 
     * This method returns the result of a @link readRSSI: @/link call.
     * 
     * @param peripheral	The peripheral providing this update.
     * @param RSSI			The current RSSI of the link.
     * @param error		If an error occurred, the cause of the failure.
     */
    @Generated
    @IsOptional
    @Selector("peripheral:didReadRSSI:error:")
    default void peripheralDidReadRSSIError(CBPeripheral peripheral, NSNumber RSSI, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * peripheral:didUpdateNotificationStateForCharacteristic:error:
     * 
     * This method returns the result of a @link setNotifyValue:forCharacteristic: @/link call.
     * 
     *  @param peripheral		The peripheral providing this information.
     *  @param characteristic	A <code>CBCharacteristic</code> object.
     * @param error			If an error occurred, the cause of the failure.
     */
    @Generated
    @IsOptional
    @Selector("peripheral:didUpdateNotificationStateForCharacteristic:error:")
    default void peripheralDidUpdateNotificationStateForCharacteristicError(CBPeripheral peripheral,
            CBCharacteristic characteristic, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * peripheral:didUpdateValueForCharacteristic:error:
     * 
     * This method is invoked after a @link readValueForCharacteristic: @/link call, or upon receipt of a notification/indication.
     * 
     *  @param peripheral		The peripheral providing this information.
     *  @param characteristic	A <code>CBCharacteristic</code> object.
     * @param error			If an error occurred, the cause of the failure.
     */
    @Generated
    @IsOptional
    @Selector("peripheral:didUpdateValueForCharacteristic:error:")
    default void peripheralDidUpdateValueForCharacteristicError(CBPeripheral peripheral,
            CBCharacteristic characteristic, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * peripheral:didUpdateValueForDescriptor:error:
     * 
     * This method returns the result of a @link readValueForDescriptor: @/link call.
     * 
     *  @param peripheral		The peripheral providing this information.
     *  @param descriptor		A <code>CBDescriptor</code> object.
     * @param error			If an error occurred, the cause of the failure.
     */
    @Generated
    @IsOptional
    @Selector("peripheral:didUpdateValueForDescriptor:error:")
    default void peripheralDidUpdateValueForDescriptorError(CBPeripheral peripheral, CBDescriptor descriptor,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * peripheral:didWriteValueForCharacteristic:error:
     * 
     * This method returns the result of a {@link writeValue:forCharacteristic:type:} call, when the <code>CBCharacteristicWriteWithResponse</code> type is used.
     * 
     *  @param peripheral		The peripheral providing this information.
     *  @param characteristic	A <code>CBCharacteristic</code> object.
     * @param error			If an error occurred, the cause of the failure.
     */
    @Generated
    @IsOptional
    @Selector("peripheral:didWriteValueForCharacteristic:error:")
    default void peripheralDidWriteValueForCharacteristicError(CBPeripheral peripheral, CBCharacteristic characteristic,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * peripheral:didWriteValueForDescriptor:error:
     * 
     * This method returns the result of a @link writeValue:forDescriptor: @/link call.
     * 
     *  @param peripheral		The peripheral providing this information.
     *  @param descriptor		A <code>CBDescriptor</code> object.
     * @param error			If an error occurred, the cause of the failure.
     */
    @Generated
    @IsOptional
    @Selector("peripheral:didWriteValueForDescriptor:error:")
    default void peripheralDidWriteValueForDescriptorError(CBPeripheral peripheral, CBDescriptor descriptor,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * peripheralDidUpdateName:
     * 
     * This method is invoked when the @link name @/link of <i>peripheral</i> changes.
     * 
     * @param peripheral	The peripheral providing this update.
     */
    @Generated
    @IsOptional
    @Selector("peripheralDidUpdateName:")
    default void peripheralDidUpdateName(CBPeripheral peripheral) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * peripheralDidUpdateRSSI:error:
     * 
     * This method returns the result of a @link readRSSI: @/link call.
     * 
     *  @param peripheral	The peripheral providing this update.
     * @param error		If an error occurred, the cause of the failure.
     * 
     *  @deprecated			Use {@link peripheral:didReadRSSI:error:} instead.
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("peripheralDidUpdateRSSI:error:")
    default void peripheralDidUpdateRSSIError(CBPeripheral peripheral, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * peripheral:didOpenL2CAPChannel:error:
     * 
     * This method returns the result of a @link openL2CAPChannel: @link call.
     * 
     *  @param peripheral		The peripheral providing this information.
     *  @param channel			A <code>CBL2CAPChannel</code> object.
     * @param error			If an error occurred, the cause of the failure.
     */
    @Generated
    @IsOptional
    @Selector("peripheral:didOpenL2CAPChannel:error:")
    default void peripheralDidOpenL2CAPChannelError(CBPeripheral peripheral, CBL2CAPChannel channel, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * peripheralIsReadyToSendWriteWithoutResponse:
     * 
     * This method is invoked after a failed call to @link writeValue:forCharacteristic:type: @/link, when <i>peripheral</i> is again
     *                     ready to send characteristic value updates.
     * 
     * @param peripheral   The peripheral providing this update.
     */
    @Generated
    @IsOptional
    @Selector("peripheralIsReadyToSendWriteWithoutResponse:")
    default void peripheralIsReadyToSendWriteWithoutResponse(CBPeripheral peripheral) {
        throw new java.lang.UnsupportedOperationException();
    }
}
