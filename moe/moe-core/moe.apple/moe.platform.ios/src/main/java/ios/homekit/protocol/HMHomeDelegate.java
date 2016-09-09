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

package ios.homekit.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSError;
import ios.homekit.HMAccessory;
import ios.homekit.HMActionSet;
import ios.homekit.HMHome;
import ios.homekit.HMRoom;
import ios.homekit.HMService;
import ios.homekit.HMServiceGroup;
import ios.homekit.HMTrigger;
import ios.homekit.HMUser;
import ios.homekit.HMZone;

@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("HMHomeDelegate")
public interface HMHomeDelegate {
	/**
	 * home:didAddAccessory:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didAddAccessory:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didAddAccessory:")
	default void homeDidAddAccessory(HMHome home, HMAccessory accessory) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * home:didAddActionSet:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didAddActionSet:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didAddActionSet:")
	default void homeDidAddActionSet(HMHome home, HMActionSet actionSet) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * home:didAddRoom:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didAddRoom:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didAddRoom:")
	default void homeDidAddRoom(HMHome home, HMRoom room) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * home:didAddRoom:toZone:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didAddRoom:toZone:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didAddRoom:toZone:")
	default void homeDidAddRoomToZone(HMHome home, HMRoom room,
			HMZone zone) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * home:didAddService:toServiceGroup:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didAddService:toServiceGroup:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didAddService:toServiceGroup:")
	default void homeDidAddServiceToServiceGroup(HMHome home,
			HMService service, HMServiceGroup group) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * home:didAddServiceGroup:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didAddServiceGroup:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didAddServiceGroup:")
	default void homeDidAddServiceGroup(HMHome home, HMServiceGroup group) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * home:didAddTrigger:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didAddTrigger:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didAddTrigger:")
	default void homeDidAddTrigger(HMHome home, HMTrigger trigger) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * home:didAddUser:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didAddUser:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didAddUser:")
	default void homeDidAddUser(HMHome home, HMUser user) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * home:didAddZone:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didAddZone:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didAddZone:")
	default void homeDidAddZone(HMHome home, HMZone zone) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * home:didEncounterError:forAccessory:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didEncounterError:forAccessory:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didEncounterError:forAccessory:")
	default void homeDidEncounterErrorForAccessory(HMHome home,
			NSError error, HMAccessory accessory) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * home:didRemoveAccessory:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didRemoveAccessory:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didRemoveAccessory:")
	default void homeDidRemoveAccessory(HMHome home,
			HMAccessory accessory) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * home:didRemoveActionSet:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didRemoveActionSet:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didRemoveActionSet:")
	default void homeDidRemoveActionSet(HMHome home,
			HMActionSet actionSet) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * home:didRemoveRoom:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didRemoveRoom:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didRemoveRoom:")
	default void homeDidRemoveRoom(HMHome home, HMRoom room) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * home:didRemoveRoom:fromZone:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didRemoveRoom:fromZone:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didRemoveRoom:fromZone:")
	default void homeDidRemoveRoomFromZone(HMHome home, HMRoom room,
			HMZone zone) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * home:didRemoveService:fromServiceGroup:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didRemoveService:fromServiceGroup:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didRemoveService:fromServiceGroup:")
	default void homeDidRemoveServiceFromServiceGroup(HMHome home,
			HMService service, HMServiceGroup group) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * home:didRemoveServiceGroup:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didRemoveServiceGroup:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didRemoveServiceGroup:")
	default void homeDidRemoveServiceGroup(HMHome home,
			HMServiceGroup group) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * home:didRemoveTrigger:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didRemoveTrigger:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didRemoveTrigger:")
	default void homeDidRemoveTrigger(HMHome home, HMTrigger trigger) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * home:didRemoveUser:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didRemoveUser:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didRemoveUser:")
	default void homeDidRemoveUser(HMHome home, HMUser user) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * home:didRemoveZone:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didRemoveZone:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didRemoveZone:")
	default void homeDidRemoveZone(HMHome home, HMZone zone) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * home:didUnblockAccessory:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didUnblockAccessory:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didUnblockAccessory:")
	default void homeDidUnblockAccessory(HMHome home,
			HMAccessory accessory) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * home:didUpdateActionsForActionSet:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didUpdateActionsForActionSet:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didUpdateActionsForActionSet:")
	default void homeDidUpdateActionsForActionSet(HMHome home,
			HMActionSet actionSet) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * home:didUpdateNameForActionSet:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didUpdateNameForActionSet:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didUpdateNameForActionSet:")
	default void homeDidUpdateNameForActionSet(HMHome home,
			HMActionSet actionSet) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * home:didUpdateNameForRoom:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didUpdateNameForRoom:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didUpdateNameForRoom:")
	default void homeDidUpdateNameForRoom(HMHome home, HMRoom room) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * home:didUpdateNameForServiceGroup:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didUpdateNameForServiceGroup:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didUpdateNameForServiceGroup:")
	default void homeDidUpdateNameForServiceGroup(HMHome home,
			HMServiceGroup group) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * home:didUpdateNameForTrigger:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didUpdateNameForTrigger:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didUpdateNameForTrigger:")
	default void homeDidUpdateNameForTrigger(HMHome home,
			HMTrigger trigger) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * home:didUpdateNameForZone:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didUpdateNameForZone:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didUpdateNameForZone:")
	default void homeDidUpdateNameForZone(HMHome home, HMZone zone) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * home:didUpdateRoom:forAccessory:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didUpdateRoom:forAccessory:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didUpdateRoom:forAccessory:")
	default void homeDidUpdateRoomForAccessory(HMHome home, HMRoom room,
			HMAccessory accessory) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * home:didUpdateTrigger:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/home:didUpdateTrigger:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("home:didUpdateTrigger:")
	default void homeDidUpdateTrigger(HMHome home, HMTrigger trigger) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * homeDidUpdateName:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeDelegate/homeDidUpdateName:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("homeDidUpdateName:")
	default void homeDidUpdateName(HMHome home) {
		throw new java.lang.UnsupportedOperationException();
	}
}
