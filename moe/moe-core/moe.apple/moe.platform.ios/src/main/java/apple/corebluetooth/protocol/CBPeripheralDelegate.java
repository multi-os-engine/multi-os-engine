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

@Generated
@Library("CoreBluetooth")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CBPeripheralDelegate")
public interface CBPeripheralDelegate {
    @Generated
    @IsOptional
    @Selector("peripheral:didDiscoverCharacteristicsForService:error:")
    default void peripheralDidDiscoverCharacteristicsForServiceError(CBPeripheral peripheral, CBService service,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("peripheral:didDiscoverDescriptorsForCharacteristic:error:")
    default void peripheralDidDiscoverDescriptorsForCharacteristicError(CBPeripheral peripheral,
            CBCharacteristic characteristic, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("peripheral:didDiscoverIncludedServicesForService:error:")
    default void peripheralDidDiscoverIncludedServicesForServiceError(CBPeripheral peripheral, CBService service,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("peripheral:didDiscoverServices:")
    default void peripheralDidDiscoverServices(CBPeripheral peripheral, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("peripheral:didModifyServices:")
    default void peripheralDidModifyServices(CBPeripheral peripheral,
            NSArray<? extends CBService> invalidatedServices) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("peripheral:didReadRSSI:error:")
    default void peripheralDidReadRSSIError(CBPeripheral peripheral, NSNumber RSSI, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("peripheral:didUpdateNotificationStateForCharacteristic:error:")
    default void peripheralDidUpdateNotificationStateForCharacteristicError(CBPeripheral peripheral,
            CBCharacteristic characteristic, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("peripheral:didUpdateValueForCharacteristic:error:")
    default void peripheralDidUpdateValueForCharacteristicError(CBPeripheral peripheral,
            CBCharacteristic characteristic, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("peripheral:didUpdateValueForDescriptor:error:")
    default void peripheralDidUpdateValueForDescriptorError(CBPeripheral peripheral, CBDescriptor descriptor,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("peripheral:didWriteValueForCharacteristic:error:")
    default void peripheralDidWriteValueForCharacteristicError(CBPeripheral peripheral, CBCharacteristic characteristic,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("peripheral:didWriteValueForDescriptor:error:")
    default void peripheralDidWriteValueForDescriptorError(CBPeripheral peripheral, CBDescriptor descriptor,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("peripheralDidUpdateName:")
    default void peripheralDidUpdateName(CBPeripheral peripheral) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Deprecated
    @Selector("peripheralDidUpdateRSSI:error:")
    default void peripheralDidUpdateRSSIError(CBPeripheral peripheral, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }
}
