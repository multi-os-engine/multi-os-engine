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
import org.jetbrains.annotations.NotNull;

/**
 * This delegate receives update on the various accessories, action sets, groups and triggers
 * managed in the home.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("HMHomeDelegate")
public interface HMHomeDelegate {
    /**
     * Informs the delegate of addition of an accessory to the home.
     * 
     * @param home      Sender of the message.
     * 
     * @param accessory Accessory that was added to the home.
     */
    @Generated
    @IsOptional
    @Selector("home:didAddAccessory:")
    default void homeDidAddAccessory(@NotNull HMHome home, @NotNull HMAccessory accessory) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that an action set was added to the home.
     * 
     * @param home      Sender of this message.
     * 
     * @param actionSet Action set that was added to the home.
     */
    @Generated
    @IsOptional
    @Selector("home:didAddActionSet:")
    default void homeDidAddActionSet(@NotNull HMHome home, @NotNull HMActionSet actionSet) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate of addition of a room to the home.
     * 
     * @param home Sender of the message.
     * 
     * @param room Room that was added to the home.
     */
    @Generated
    @IsOptional
    @Selector("home:didAddRoom:")
    default void homeDidAddRoom(@NotNull HMHome home, @NotNull HMRoom room) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that the room was added to a zone.
     * 
     * @param home Sender of this message.
     * 
     * @param room Room that was added to the zone.
     * 
     * @param zone Zone that was modified.
     */
    @Generated
    @IsOptional
    @Selector("home:didAddRoom:toZone:")
    default void homeDidAddRoomToZone(@NotNull HMHome home, @NotNull HMRoom room, @NotNull HMZone zone) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that a service was added to a service group.
     * 
     * @param home    Sender of this message.
     * 
     * @param service Service that was added to the service group.
     * 
     * @param group   Service group that was modified.
     */
    @Generated
    @IsOptional
    @Selector("home:didAddService:toServiceGroup:")
    default void homeDidAddServiceToServiceGroup(@NotNull HMHome home, @NotNull HMService service,
            @NotNull HMServiceGroup group) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that a service group was added to the home.
     * 
     * @param home  Sender of the message.
     * 
     * @param group Service group that was added to the home.
     */
    @Generated
    @IsOptional
    @Selector("home:didAddServiceGroup:")
    default void homeDidAddServiceGroup(@NotNull HMHome home, @NotNull HMServiceGroup group) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate of the addition of a trigger to the home.
     * 
     * @param home    Sender of the message.
     * 
     * @param trigger Trigger that was added to the home.
     */
    @Generated
    @IsOptional
    @Selector("home:didAddTrigger:")
    default void homeDidAddTrigger(@NotNull HMHome home, @NotNull HMTrigger trigger) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that a user was added to the home.
     * 
     * @param home Sender of this message.
     * 
     * @param user User who was granted access to the home.
     */
    @Generated
    @IsOptional
    @Selector("home:didAddUser:")
    default void homeDidAddUser(@NotNull HMHome home, @NotNull HMUser user) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate of addition of a zone to the home.
     * 
     * @param home Sender of the message.
     * 
     * @param zone Zone that was added to the home.
     */
    @Generated
    @IsOptional
    @Selector("home:didAddZone:")
    default void homeDidAddZone(@NotNull HMHome home, @NotNull HMZone zone) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that a configured accessory encountered an error. The
     * delegate should check the blocked state of the accessory
     * 
     * @param home      Sender of this message.
     * 
     * @param error     Error encountered by accessory.
     * 
     * @param accessory Accessory that encountered the error
     */
    @Generated
    @IsOptional
    @Selector("home:didEncounterError:forAccessory:")
    default void homeDidEncounterErrorForAccessory(@NotNull HMHome home, @NotNull NSError error,
            @NotNull HMAccessory accessory) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate of removal of an accessory from the home.
     * 
     * @param home      Sender of the message.
     * 
     * @param accessory Accessory that was removed from the home.
     */
    @Generated
    @IsOptional
    @Selector("home:didRemoveAccessory:")
    default void homeDidRemoveAccessory(@NotNull HMHome home, @NotNull HMAccessory accessory) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that an action set was removed from the home.
     * 
     * @param home      Sender of this message.
     * 
     * @param actionSet Action set that was removed from the home.
     */
    @Generated
    @IsOptional
    @Selector("home:didRemoveActionSet:")
    default void homeDidRemoveActionSet(@NotNull HMHome home, @NotNull HMActionSet actionSet) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate of removal of a room from the home.
     * 
     * @param home Sender of the message.
     * 
     * @param room Room that was removed from the home.
     */
    @Generated
    @IsOptional
    @Selector("home:didRemoveRoom:")
    default void homeDidRemoveRoom(@NotNull HMHome home, @NotNull HMRoom room) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that the room was removed from a zone.
     * 
     * @param home Sender of this message.
     * 
     * @param room Room that was removed from the zone.
     * 
     * @param zone Zone that was modified.
     */
    @Generated
    @IsOptional
    @Selector("home:didRemoveRoom:fromZone:")
    default void homeDidRemoveRoomFromZone(@NotNull HMHome home, @NotNull HMRoom room, @NotNull HMZone zone) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that a service was removed from a service group.
     * 
     * @param home    Sender of this message.
     * 
     * @param service Service that was removed from the service group.
     * 
     * @param group   Service group that was modified.
     */
    @Generated
    @IsOptional
    @Selector("home:didRemoveService:fromServiceGroup:")
    default void homeDidRemoveServiceFromServiceGroup(@NotNull HMHome home, @NotNull HMService service,
            @NotNull HMServiceGroup group) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that a service group was removed from the home.
     * 
     * @param home  Sender of the message.
     * 
     * @param group Service group that was removed from the home.
     */
    @Generated
    @IsOptional
    @Selector("home:didRemoveServiceGroup:")
    default void homeDidRemoveServiceGroup(@NotNull HMHome home, @NotNull HMServiceGroup group) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate of removal of a trigger from the home.
     * 
     * @param home    Sender of the message.
     * 
     * @param trigger Trigger that was removed from the home.
     */
    @Generated
    @IsOptional
    @Selector("home:didRemoveTrigger:")
    default void homeDidRemoveTrigger(@NotNull HMHome home, @NotNull HMTrigger trigger) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that a user was removed from the home.
     * 
     * @param home Sender of this message.
     * 
     * @param user User whose access was revoked from the home.
     */
    @Generated
    @IsOptional
    @Selector("home:didRemoveUser:")
    default void homeDidRemoveUser(@NotNull HMHome home, @NotNull HMUser user) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate of removal of a zone from the home.
     * 
     * @param home Sender of the message.
     * 
     * @param zone Zone that was removed from the home.
     */
    @Generated
    @IsOptional
    @Selector("home:didRemoveZone:")
    default void homeDidRemoveZone(@NotNull HMHome home, @NotNull HMZone zone) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that an accessory has been unblocked
     * 
     * @param home      Sender of this message.
     * 
     * @param accessory Accessory that was unblocked
     */
    @Generated
    @IsOptional
    @Selector("home:didUnblockAccessory:")
    default void homeDidUnblockAccessory(@NotNull HMHome home, @NotNull HMAccessory accessory) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that the actions of an action set was modified.
     * This indicates that an action was added/removed or modified (value replaced)
     * 
     * @param home      Sender of this message.
     * 
     * @param actionSet Action set that was modified.
     */
    @Generated
    @IsOptional
    @Selector("home:didUpdateActionsForActionSet:")
    default void homeDidUpdateActionsForActionSet(@NotNull HMHome home, @NotNull HMActionSet actionSet) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that the name of an action set was modified.
     * 
     * @param home      Sender of this message.
     * 
     * @param actionSet Action set that was modified.
     */
    @Generated
    @IsOptional
    @Selector("home:didUpdateNameForActionSet:")
    default void homeDidUpdateNameForActionSet(@NotNull HMHome home, @NotNull HMActionSet actionSet) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that the name of a room was modified
     * 
     * @param home Sender of this message.
     * 
     * @param room Room that was modified.
     */
    @Generated
    @IsOptional
    @Selector("home:didUpdateNameForRoom:")
    default void homeDidUpdateNameForRoom(@NotNull HMHome home, @NotNull HMRoom room) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that the name of a service group was modified.
     * 
     * @param home  Sender of this message.
     * 
     * @param group The service group that was modfied.
     */
    @Generated
    @IsOptional
    @Selector("home:didUpdateNameForServiceGroup:")
    default void homeDidUpdateNameForServiceGroup(@NotNull HMHome home, @NotNull HMServiceGroup group) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that the name of the trigger was modified.
     * 
     * @param home    Sender of this message.
     * 
     * @param trigger Trigger that was modified.
     */
    @Generated
    @IsOptional
    @Selector("home:didUpdateNameForTrigger:")
    default void homeDidUpdateNameForTrigger(@NotNull HMHome home, @NotNull HMTrigger trigger) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that the name of a zone was modified.
     * 
     * @param home Sender of this message.
     * 
     * @param zone Zone that was modified.
     */
    @Generated
    @IsOptional
    @Selector("home:didUpdateNameForZone:")
    default void homeDidUpdateNameForZone(@NotNull HMHome home, @NotNull HMZone zone) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate when a new room is assigned to an accessory
     * 
     * @param home      Sender of the message.
     * 
     * @param room      New room for the accessory.
     * 
     * @param accessory Accessory that was assigned a new room.
     */
    @Generated
    @IsOptional
    @Selector("home:didUpdateRoom:forAccessory:")
    default void homeDidUpdateRoomForAccessory(@NotNull HMHome home, @NotNull HMRoom room,
            @NotNull HMAccessory accessory) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate whenever a trigger is updated. For example, this method may be
     * invoked when a trigger is activated, when a trigger fires, or when the action sets
     * associated with a trigger are modified.
     * 
     * @param home    Sender of this message.
     * 
     * @param trigger The trigger that was updated.
     */
    @Generated
    @IsOptional
    @Selector("home:didUpdateTrigger:")
    default void homeDidUpdateTrigger(@NotNull HMHome home, @NotNull HMTrigger trigger) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate of a change in the name of a home.
     * 
     * @param home Sender of this message.
     */
    @Generated
    @IsOptional
    @Selector("homeDidUpdateName:")
    default void homeDidUpdateName(@NotNull HMHome home) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate when state of the home hub changes.
     * 
     * @param home         Sender of the message.
     * 
     * @param homeHubState The new home hub state.
     * 
     *                     API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("home:didUpdateHomeHubState:")
    default void homeDidUpdateHomeHubState(@NotNull HMHome home, @NUInt long homeHubState) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate when the access control for current user has been updated.
     * 
     * @param home Sender of the message.
     * 
     *             API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("homeDidUpdateAccessControlForCurrentUser:")
    default void homeDidUpdateAccessControlForCurrentUser(@NotNull HMHome home) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate when the supported features of this home changes.
     * 
     * The supported features covered by this are currently:
     * - supportsAddingNetworkRouter
     * 
     * @param home Sender of the message.
     * 
     *             API-Since: 13.2
     */
    @Generated
    @IsOptional
    @Selector("homeDidUpdateSupportedFeatures:")
    default void homeDidUpdateSupportedFeatures(@NotNull HMHome home) {
        throw new java.lang.UnsupportedOperationException();
    }
}
