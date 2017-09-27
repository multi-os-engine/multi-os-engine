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

import apple.foundation.NSError;
import apple.homekit.HMAccessory;
import apple.homekit.HMActionSet;
import apple.homekit.HMHome;
import apple.homekit.HMRoom;
import apple.homekit.HMService;
import apple.homekit.HMServiceGroup;
import apple.homekit.HMTrigger;
import apple.homekit.HMUser;
import apple.homekit.HMZone;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("HMHomeDelegate")
public interface HMHomeDelegate {
    @Generated
    @IsOptional
    @Selector("home:didAddAccessory:")
    default void homeDidAddAccessory(HMHome home, HMAccessory accessory) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didAddActionSet:")
    default void homeDidAddActionSet(HMHome home, HMActionSet actionSet) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didAddRoom:")
    default void homeDidAddRoom(HMHome home, HMRoom room) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didAddRoom:toZone:")
    default void homeDidAddRoomToZone(HMHome home, HMRoom room, HMZone zone) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didAddService:toServiceGroup:")
    default void homeDidAddServiceToServiceGroup(HMHome home, HMService service, HMServiceGroup group) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didAddServiceGroup:")
    default void homeDidAddServiceGroup(HMHome home, HMServiceGroup group) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didAddTrigger:")
    default void homeDidAddTrigger(HMHome home, HMTrigger trigger) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didAddUser:")
    default void homeDidAddUser(HMHome home, HMUser user) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didAddZone:")
    default void homeDidAddZone(HMHome home, HMZone zone) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didEncounterError:forAccessory:")
    default void homeDidEncounterErrorForAccessory(HMHome home, NSError error, HMAccessory accessory) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didRemoveAccessory:")
    default void homeDidRemoveAccessory(HMHome home, HMAccessory accessory) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didRemoveActionSet:")
    default void homeDidRemoveActionSet(HMHome home, HMActionSet actionSet) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didRemoveRoom:")
    default void homeDidRemoveRoom(HMHome home, HMRoom room) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didRemoveRoom:fromZone:")
    default void homeDidRemoveRoomFromZone(HMHome home, HMRoom room, HMZone zone) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didRemoveService:fromServiceGroup:")
    default void homeDidRemoveServiceFromServiceGroup(HMHome home, HMService service, HMServiceGroup group) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didRemoveServiceGroup:")
    default void homeDidRemoveServiceGroup(HMHome home, HMServiceGroup group) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didRemoveTrigger:")
    default void homeDidRemoveTrigger(HMHome home, HMTrigger trigger) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didRemoveUser:")
    default void homeDidRemoveUser(HMHome home, HMUser user) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didRemoveZone:")
    default void homeDidRemoveZone(HMHome home, HMZone zone) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didUnblockAccessory:")
    default void homeDidUnblockAccessory(HMHome home, HMAccessory accessory) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didUpdateActionsForActionSet:")
    default void homeDidUpdateActionsForActionSet(HMHome home, HMActionSet actionSet) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didUpdateNameForActionSet:")
    default void homeDidUpdateNameForActionSet(HMHome home, HMActionSet actionSet) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didUpdateNameForRoom:")
    default void homeDidUpdateNameForRoom(HMHome home, HMRoom room) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didUpdateNameForServiceGroup:")
    default void homeDidUpdateNameForServiceGroup(HMHome home, HMServiceGroup group) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didUpdateNameForTrigger:")
    default void homeDidUpdateNameForTrigger(HMHome home, HMTrigger trigger) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didUpdateNameForZone:")
    default void homeDidUpdateNameForZone(HMHome home, HMZone zone) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didUpdateRoom:forAccessory:")
    default void homeDidUpdateRoomForAccessory(HMHome home, HMRoom room, HMAccessory accessory) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didUpdateTrigger:")
    default void homeDidUpdateTrigger(HMHome home, HMTrigger trigger) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("homeDidUpdateName:")
    default void homeDidUpdateName(HMHome home) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("home:didUpdateHomeHubState:")
    default void homeDidUpdateHomeHubState(HMHome home, @NUInt long homeHubState) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("homeDidUpdateAccessControlForCurrentUser:")
    default void homeDidUpdateAccessControlForCurrentUser(HMHome home) {
        throw new java.lang.UnsupportedOperationException();
    }
}
