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

import apple.corebluetooth.CBCentralManager;
import apple.corebluetooth.CBPeripheral;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSNumber;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("CoreBluetooth")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CBCentralManagerDelegate")
public interface CBCentralManagerDelegate {
    @Generated
    @IsOptional
    @Selector("centralManager:didConnectPeripheral:")
    default void centralManagerDidConnectPeripheral(CBCentralManager central, CBPeripheral peripheral) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("centralManager:didDisconnectPeripheral:error:")
    default void centralManagerDidDisconnectPeripheralError(CBCentralManager central, CBPeripheral peripheral,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("centralManager:didDiscoverPeripheral:advertisementData:RSSI:")
    default void centralManagerDidDiscoverPeripheralAdvertisementDataRSSI(CBCentralManager central,
            CBPeripheral peripheral, NSDictionary<String, ?> advertisementData, NSNumber RSSI) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("centralManager:didFailToConnectPeripheral:error:")
    default void centralManagerDidFailToConnectPeripheralError(CBCentralManager central, CBPeripheral peripheral,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("centralManager:willRestoreState:")
    default void centralManagerWillRestoreState(CBCentralManager central, NSDictionary<String, ?> dict) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("centralManagerDidUpdateState:")
    void centralManagerDidUpdateState(CBCentralManager central);

    @Generated
    @IsOptional
    @Selector("centralManager:connectionEventDidOccur:forPeripheral:")
    default void centralManagerConnectionEventDidOccurForPeripheral(CBCentralManager central, @NInt long event,
            CBPeripheral peripheral) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("centralManager:didUpdateANCSAuthorizationForPeripheral:")
    default void centralManagerDidUpdateANCSAuthorizationForPeripheral(CBCentralManager central,
            CBPeripheral peripheral) {
        throw new java.lang.UnsupportedOperationException();
    }
}
