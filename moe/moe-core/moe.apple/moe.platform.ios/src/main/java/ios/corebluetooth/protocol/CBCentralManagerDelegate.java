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

package ios.corebluetooth.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.corebluetooth.CBCentralManager;
import ios.corebluetooth.CBPeripheral;
import ios.foundation.NSDictionary;
import ios.foundation.NSError;
import ios.foundation.NSNumber;

@Generated
@Library("CoreBluetooth")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CBCentralManagerDelegate")
public interface CBCentralManagerDelegate {
	/**
	 * centralManager:didConnectPeripheral:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBCentralManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CBCentralManagerDelegate/centralManager:didConnectPeripheral:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("centralManager:didConnectPeripheral:")
	default void centralManagerDidConnectPeripheral(
			CBCentralManager central, CBPeripheral peripheral) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * centralManager:didDisconnectPeripheral:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBCentralManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CBCentralManagerDelegate/centralManager:didDisconnectPeripheral:error:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("centralManager:didDisconnectPeripheral:error:")
	default void centralManagerDidDisconnectPeripheralError(
			CBCentralManager central, CBPeripheral peripheral, NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * centralManager:didDiscoverPeripheral:advertisementData:RSSI:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBCentralManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CBCentralManagerDelegate/centralManager:didDiscoverPeripheral:advertisementData:RSSI:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("centralManager:didDiscoverPeripheral:advertisementData:RSSI:")
	default void centralManagerDidDiscoverPeripheralAdvertisementDataRSSI(
			CBCentralManager central, CBPeripheral peripheral,
			NSDictionary<String, ?> advertisementData, NSNumber RSSI) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * centralManager:didFailToConnectPeripheral:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBCentralManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CBCentralManagerDelegate/centralManager:didFailToConnectPeripheral:error:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("centralManager:didFailToConnectPeripheral:error:")
	default void centralManagerDidFailToConnectPeripheralError(
			CBCentralManager central, CBPeripheral peripheral, NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * centralManager:willRestoreState:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBCentralManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CBCentralManagerDelegate/centralManager:willRestoreState:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("centralManager:willRestoreState:")
	default void centralManagerWillRestoreState(
			CBCentralManager central, NSDictionary<String, ?> dict) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * centralManagerDidUpdateState:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBCentralManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CBCentralManagerDelegate/centralManagerDidUpdateState:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("centralManagerDidUpdateState:")
	void centralManagerDidUpdateState(CBCentralManager central);
}
