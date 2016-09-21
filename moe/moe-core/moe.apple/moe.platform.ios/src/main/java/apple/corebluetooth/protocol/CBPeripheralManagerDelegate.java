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

import apple.corebluetooth.CBATTRequest;
import apple.corebluetooth.CBCentral;
import apple.corebluetooth.CBCharacteristic;
import apple.corebluetooth.CBPeripheralManager;
import apple.corebluetooth.CBService;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
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
@ObjCProtocolName("CBPeripheralManagerDelegate")
public interface CBPeripheralManagerDelegate {
    @Generated
    @IsOptional
    @Selector("peripheralManager:central:didSubscribeToCharacteristic:")
    default void peripheralManagerCentralDidSubscribeToCharacteristic(CBPeripheralManager peripheral, CBCentral central,
            CBCharacteristic characteristic) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("peripheralManager:central:didUnsubscribeFromCharacteristic:")
    default void peripheralManagerCentralDidUnsubscribeFromCharacteristic(CBPeripheralManager peripheral,
            CBCentral central, CBCharacteristic characteristic) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("peripheralManager:didAddService:error:")
    default void peripheralManagerDidAddServiceError(CBPeripheralManager peripheral, CBService service, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("peripheralManager:didReceiveReadRequest:")
    default void peripheralManagerDidReceiveReadRequest(CBPeripheralManager peripheral, CBATTRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("peripheralManager:didReceiveWriteRequests:")
    default void peripheralManagerDidReceiveWriteRequests(CBPeripheralManager peripheral,
            NSArray<? extends CBATTRequest> requests) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("peripheralManager:willRestoreState:")
    default void peripheralManagerWillRestoreState(CBPeripheralManager peripheral, NSDictionary<String, ?> dict) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("peripheralManagerDidStartAdvertising:error:")
    default void peripheralManagerDidStartAdvertisingError(CBPeripheralManager peripheral, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("peripheralManagerDidUpdateState:")
    void peripheralManagerDidUpdateState(CBPeripheralManager peripheral);

    @Generated
    @IsOptional
    @Selector("peripheralManagerIsReadyToUpdateSubscribers:")
    default void peripheralManagerIsReadyToUpdateSubscribers(CBPeripheralManager peripheral) {
        throw new java.lang.UnsupportedOperationException();
    }
}
