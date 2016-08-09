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

import ios.corebluetooth.CBATTRequest;
import ios.corebluetooth.CBCentral;
import ios.corebluetooth.CBCharacteristic;
import ios.corebluetooth.CBPeripheralManager;
import ios.corebluetooth.CBService;
import ios.foundation.NSArray;
import ios.foundation.NSDictionary;
import ios.foundation.NSError;

@Generated
@Library("CoreBluetooth")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CBPeripheralManagerDelegate")
public interface CBPeripheralManagerDelegate {
	/**
	 * peripheralManager:central:didSubscribeToCharacteristic:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBPeripheralManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CBPeripheralManagerDelegate/peripheralManager:central:didSubscribeToCharacteristic:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("peripheralManager:central:didSubscribeToCharacteristic:")
	default void peripheralManagerCentralDidSubscribeToCharacteristic(
			CBPeripheralManager peripheral, CBCentral central,
			CBCharacteristic characteristic) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * peripheralManager:central:didUnsubscribeFromCharacteristic:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBPeripheralManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CBPeripheralManagerDelegate/peripheralManager:central:didUnsubscribeFromCharacteristic:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("peripheralManager:central:didUnsubscribeFromCharacteristic:")
	default void peripheralManagerCentralDidUnsubscribeFromCharacteristic(
			CBPeripheralManager peripheral, CBCentral central,
			CBCharacteristic characteristic) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * peripheralManager:didAddService:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBPeripheralManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CBPeripheralManagerDelegate/peripheralManager:didAddService:error:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("peripheralManager:didAddService:error:")
	default void peripheralManagerDidAddServiceError(
			CBPeripheralManager peripheral, CBService service, NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * peripheralManager:didReceiveReadRequest:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBPeripheralManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CBPeripheralManagerDelegate/peripheralManager:didReceiveReadRequest:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("peripheralManager:didReceiveReadRequest:")
	default void peripheralManagerDidReceiveReadRequest(
			CBPeripheralManager peripheral, CBATTRequest request) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * peripheralManager:didReceiveWriteRequests:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBPeripheralManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CBPeripheralManagerDelegate/peripheralManager:didReceiveWriteRequests:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("peripheralManager:didReceiveWriteRequests:")
	default void peripheralManagerDidReceiveWriteRequests(
			CBPeripheralManager peripheral, NSArray<? extends CBATTRequest> requests) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * peripheralManager:willRestoreState:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBPeripheralManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CBPeripheralManagerDelegate/peripheralManager:willRestoreState:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("peripheralManager:willRestoreState:")
	default void peripheralManagerWillRestoreState(
			CBPeripheralManager peripheral, NSDictionary<String, ?> dict) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * peripheralManagerDidStartAdvertising:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBPeripheralManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CBPeripheralManagerDelegate/peripheralManagerDidStartAdvertising:error:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("peripheralManagerDidStartAdvertising:error:")
	default void peripheralManagerDidStartAdvertisingError(
			CBPeripheralManager peripheral, NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * peripheralManagerDidUpdateState:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBPeripheralManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CBPeripheralManagerDelegate/peripheralManagerDidUpdateState:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("peripheralManagerDidUpdateState:")
	void peripheralManagerDidUpdateState(CBPeripheralManager peripheral);

	/**
	 * peripheralManagerIsReadyToUpdateSubscribers:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBPeripheralManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CBPeripheralManagerDelegate/peripheralManagerIsReadyToUpdateSubscribers:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("peripheralManagerIsReadyToUpdateSubscribers:")
	default void peripheralManagerIsReadyToUpdateSubscribers(
			CBPeripheralManager peripheral) {
		throw new java.lang.UnsupportedOperationException();
	}
}
