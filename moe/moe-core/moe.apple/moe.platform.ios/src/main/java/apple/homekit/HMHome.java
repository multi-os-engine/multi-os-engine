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

package apple.homekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUUID;
import apple.homekit.protocol.HMHomeDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.foundation.NSXPCConnection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents a home.
 * 
 * This class represents a home and is the entry point to communicate and
 * configure different accessories in the home. This is also used to manage
 * all the rooms, zones, service groups, users, triggers, and action sets in
 * the home.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HMHome extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected HMHome(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HMHome alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native HMHome allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native HMHome new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Array of HMAccessory objects that represents all accessories added to the home.
     */
    @NotNull
    @Generated
    @Selector("accessories")
    public native NSArray<? extends HMAccessory> accessories();

    /**
     * Array of HMActionSet objects that represents all the action sets in the home.
     */
    @NotNull
    @Generated
    @Selector("actionSets")
    public native NSArray<? extends HMActionSet> actionSets();

    /**
     * Adds a new accessory to the home.
     * 
     * @param accessory  Accessory to add to the home.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("addAccessory:completionHandler:")
    public native void addAccessoryCompletionHandler(@NotNull HMAccessory accessory,
            @NotNull @ObjCBlock(name = "call_addAccessoryCompletionHandler") Block_addAccessoryCompletionHandler completion);

    /**
     * Adds a new action set to the home.
     * 
     * @param actionSetName Name of the action set to add to the home.
     * 
     * @param completion    Block that is invoked once the request is processed.
     *                      The HMActionSet parameter is the new action set added to the home.
     *                      The NSError provides more information on the status of the request, error
     *                      will be nil on success.
     */
    @Generated
    @Selector("addActionSetWithName:completionHandler:")
    public native void addActionSetWithNameCompletionHandler(@NotNull String actionSetName,
            @NotNull @ObjCBlock(name = "call_addActionSetWithNameCompletionHandler") Block_addActionSetWithNameCompletionHandler completion);

    /**
     * Find nearby accessories and add them to the home. During this process, each of the accessories added
     * to the home is assigned to a room and its services are configured.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     * 
     *                   API-Since: 10.0
     *                   Deprecated-Since: 15.4
     *                   Deprecated-Message: Use -[HMAccessorySetupManager
     *                   performAccessorySetupUsingRequest:completionHandler:] instead
     */
    @Deprecated
    @Generated
    @Selector("addAndSetupAccessoriesWithCompletionHandler:")
    public native void addAndSetupAccessoriesWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_addAndSetupAccessoriesWithCompletionHandler") Block_addAndSetupAccessoriesWithCompletionHandler completion);

    /**
     * Adds a room to the home.
     * 
     * @param roomName   Name of the room to add to the home.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The HMRoom is the new room added to the home.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("addRoomWithName:completionHandler:")
    public native void addRoomWithNameCompletionHandler(@NotNull String roomName,
            @NotNull @ObjCBlock(name = "call_addRoomWithNameCompletionHandler") Block_addRoomWithNameCompletionHandler completion);

    /**
     * Adds a service group to the home.
     * 
     * @param serviceGroupName Name of the service group to add to the home.
     * 
     * @param completion       Block that is invoked once the request is processed.
     *                         The HMServiceGroup is the new service group added to the home.
     *                         The NSError provides more information on the status of the request, error
     *                         will be nil on success.
     */
    @Generated
    @Selector("addServiceGroupWithName:completionHandler:")
    public native void addServiceGroupWithNameCompletionHandler(@NotNull String serviceGroupName,
            @NotNull @ObjCBlock(name = "call_addServiceGroupWithNameCompletionHandler") Block_addServiceGroupWithNameCompletionHandler completion);

    /**
     * Adds a trigger to the home. Unless the trigger object is added to the home, it cannot be
     * activated. Throws error and will not be added to home if there is no Home Hub associated with the home
     * 
     * Triggers are specific to an iOS device and are not synced across multiple devices to
     * ensure that the action sets are executed only once.
     * 
     * @param trigger    Trigger to add to the home.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The HMTrigger parameter is the new trigger added to the home.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     *                   Errors when no Home Hub is associated with the home
     */
    @Generated
    @Selector("addTrigger:completionHandler:")
    public native void addTriggerCompletionHandler(@NotNull HMTrigger trigger,
            @NotNull @ObjCBlock(name = "call_addTriggerCompletionHandler") Block_addTriggerCompletionHandler completion);

    /**
     * Adds a user to the home.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The HMUser object provides a reference to the user that was added to the home.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success. The userInfo dictionary will contain the HMUserFailedAccessoriesKey
     *                   which provides
     *                   more details on the accessories that failed to add the user.
     * 
     *                   API-Since: 8.0
     *                   Deprecated-Since: 9.0
     */
    @Generated
    @Deprecated
    @Selector("addUserWithCompletionHandler:")
    public native void addUserWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_addUserWithCompletionHandler") Block_addUserWithCompletionHandler completion);

    /**
     * Adds a zone to the home.
     * 
     * @param zoneName   Name of the zone to add to the home.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The HMZone is the new zone added to the home.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("addZoneWithName:completionHandler:")
    public native void addZoneWithNameCompletionHandler(@NotNull String zoneName,
            @NotNull @ObjCBlock(name = "call_addZoneWithNameCompletionHandler") Block_addZoneWithNameCompletionHandler completion);

    /**
     * Assigns a new room for the accessory.
     * 
     * When an accessory is added to a home, it is automatically assigned the room corresponding to
     * + [HMHome roomForEntireHome]. This method is used to change the room assigned to an accessory.
     * 
     * @param accessory  Accessory whose rooms needs to modified
     * 
     * @param room       New room for the accessory.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("assignAccessory:toRoom:completionHandler:")
    public native void assignAccessoryToRoomCompletionHandler(@NotNull HMAccessory accessory, @NotNull HMRoom room,
            @NotNull @ObjCBlock(name = "call_assignAccessoryToRoomCompletionHandler") Block_assignAccessoryToRoomCompletionHandler completion);

    /**
     * Retrieve a built-in action set for the home.
     * 
     * @param actionSetType Type of the builtin action set. Supported action set types are HMActionSetTypeWakeUp,
     *                      HMActionSetTypeSleep, HMActionSetTypeHomeDeparture and HMActionSetTypeHomeArrival.
     * 
     * @return Reference to the built-in action set corresponding to type argument,
     *         nil if no matching action set is found.
     * 
     *         API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("builtinActionSetOfType:")
    public native HMActionSet builtinActionSetOfType(@NotNull String actionSetType);

    /**
     * HMUser object representing the current user of the home.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("currentUser")
    public native HMUser currentUser();

    /**
     * Delegate that receives updates on the state of the home.
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native HMHomeDelegate delegate();

    /**
     * Executes all the actions within an action set.
     * 
     * @param actionSet  Action set to execute.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("executeActionSet:completionHandler:")
    public native void executeActionSetCompletionHandler(@NotNull HMActionSet actionSet,
            @NotNull @ObjCBlock(name = "call_executeActionSetCompletionHandler") Block_executeActionSetCompletionHandler completion);

    /**
     * Retrieve the access level of the user associated with the home.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("homeAccessControlForUser:")
    public native HMHomeAccessControl homeAccessControlForUser(@NotNull HMUser user);

    @Generated
    @Selector("init")
    public native HMHome init();

    /**
     * Specifies whether this home is the primary home.
     */
    @Generated
    @Selector("isPrimary")
    public native boolean isPrimary();

    /**
     * Presents a view controller to manage users of the home.
     * 
     * This API is available only for users that have administrator access to the home.
     * 
     * @param completion Block that is invoked once user management is completed.
     *                   The completion block is fired to allow clients to know when the user has dismissed the view.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success. If the user does not have administrator privileges the error code will
     *                   be set to
     *                   HMErrorCodeInsufficientPrivileges.
     * 
     *                   API-Since: 9.0
     */
    @Generated
    @Selector("manageUsersWithCompletionHandler:")
    public native void manageUsersWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_manageUsersWithCompletionHandler") Block_manageUsersWithCompletionHandler completion);

    /**
     * The name of the home.
     */
    @NotNull
    @Generated
    @Selector("name")
    public native String name();

    /**
     * Removes an accessory from the home.
     * 
     * @param accessory  Accessory to remove from the home.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("removeAccessory:completionHandler:")
    public native void removeAccessoryCompletionHandler(@NotNull HMAccessory accessory,
            @NotNull @ObjCBlock(name = "call_removeAccessoryCompletionHandler") Block_removeAccessoryCompletionHandler completion);

    /**
     * Removes an existing action set from the home.
     * 
     * @param actionSet  Action set to remove from the home. A builtin action set cannot be removed.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("removeActionSet:completionHandler:")
    public native void removeActionSetCompletionHandler(@NotNull HMActionSet actionSet,
            @NotNull @ObjCBlock(name = "call_removeActionSetCompletionHandler") Block_removeActionSetCompletionHandler completion);

    /**
     * Removes a room from the home.
     * 
     * Any references to this room will be removed from all properties
     * of the home. For example, the room will be removed from the zone.
     * Any accessories associated contained by this room will be moved to
     * the room provided by - [HMHome roomForEntireHome].
     * 
     * @param room       Room to remove from the home.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("removeRoom:completionHandler:")
    public native void removeRoomCompletionHandler(@NotNull HMRoom room,
            @NotNull @ObjCBlock(name = "call_removeRoomCompletionHandler") Block_removeRoomCompletionHandler completion);

    /**
     * Removes a service group from the home.
     * 
     * @param group      Service group to remove from the home.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("removeServiceGroup:completionHandler:")
    public native void removeServiceGroupCompletionHandler(@NotNull HMServiceGroup group,
            @NotNull @ObjCBlock(name = "call_removeServiceGroupCompletionHandler") Block_removeServiceGroupCompletionHandler completion);

    /**
     * Removes a trigger from the home. If the trigger is active, they are automatically deactivated.
     * 
     * @param trigger    Trigger to remove from the home.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("removeTrigger:completionHandler:")
    public native void removeTriggerCompletionHandler(@NotNull HMTrigger trigger,
            @NotNull @ObjCBlock(name = "call_removeTriggerCompletionHandler") Block_removeTriggerCompletionHandler completion);

    /**
     * Removes a user from the home.
     * 
     * @param user       HMUser whose access is being revoked.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success. The userInfo dictionary will contain the HMUserFailedAccessoriesKey
     *                   which provides
     *                   more details on the accessories that failed to remove the user.
     * 
     *                   API-Since: 8.0
     *                   Deprecated-Since: 9.0
     */
    @Generated
    @Deprecated
    @Selector("removeUser:completionHandler:")
    public native void removeUserCompletionHandler(@NotNull HMUser user,
            @NotNull @ObjCBlock(name = "call_removeUserCompletionHandler") Block_removeUserCompletionHandler completion);

    /**
     * Removes a zone from the home.
     * 
     * @param zone       Zone to remove from the home.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("removeZone:completionHandler:")
    public native void removeZoneCompletionHandler(@NotNull HMZone zone,
            @NotNull @ObjCBlock(name = "call_removeZoneCompletionHandler") Block_removeZoneCompletionHandler completion);

    /**
     * This method returns a room that represents the entire home. This can be used to assign a room
     * to a service that is not necessarily located in one particular room.
     * 
     * @return HMRoom that represents the home.
     */
    @NotNull
    @Generated
    @Selector("roomForEntireHome")
    public native HMRoom roomForEntireHome();

    /**
     * Array of HMRoom objects that represents all rooms in the home.
     */
    @NotNull
    @Generated
    @Selector("rooms")
    public native NSArray<? extends HMRoom> rooms();

    /**
     * Array of HMServiceGroup objects that represents all service groups in the home.
     */
    @NotNull
    @Generated
    @Selector("serviceGroups")
    public native NSArray<? extends HMServiceGroup> serviceGroups();

    /**
     * Queries all services that match the specified types.
     * 
     * @param serviceTypes Array of NSString objects that specifies the service types to match.
     * 
     * @return Array of HMService objects that match the specified service types,
     *         nil if no matching services were found.
     */
    @Nullable
    @Generated
    @Selector("servicesWithTypes:")
    public native NSArray<? extends HMService> servicesWithTypes(@NotNull NSArray<String> serviceTypes);

    /**
     * Delegate that receives updates on the state of the home.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) HMHomeDelegate value);

    /**
     * Delegate that receives updates on the state of the home.
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) HMHomeDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Array of HMTrigger objects that represents all the triggers in the home.
     */
    @NotNull
    @Generated
    @Selector("triggers")
    public native NSArray<? extends HMTrigger> triggers();

    /**
     * unblock a blocked accessory.
     * 
     * A misbehaving accessory will automatically be blocked. After that all requests to
     * the accessory will fail. This API must be used to explicitly unblock the accessory
     * 
     * @param accessory  accessory to be unblocked
     * 
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("unblockAccessory:completionHandler:")
    public native void unblockAccessoryCompletionHandler(@NotNull HMAccessory accessory,
            @NotNull @ObjCBlock(name = "call_unblockAccessoryCompletionHandler") Block_unblockAccessoryCompletionHandler completion);

    /**
     * A unique identifier for the home.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("uniqueIdentifier")
    public native NSUUID uniqueIdentifier();

    /**
     * This method is used to change the name of the home.
     * 
     * @param name       New name for the home.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("updateName:completionHandler:")
    public native void updateNameCompletionHandler(@NotNull String name,
            @NotNull @ObjCBlock(name = "call_updateNameCompletionHandler") Block_updateNameCompletionHandler completion);

    /**
     * Array of HMUser objects that represent all users associated with the home.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: No longer supported.
     */
    @NotNull
    @Generated
    @Deprecated
    @Selector("users")
    public native NSArray<? extends HMUser> users();

    /**
     * Array of HMZone objects that represents all the zones in the home.
     */
    @NotNull
    @Generated
    @Selector("zones")
    public native NSArray<? extends HMZone> zones();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addAccessoryCompletionHandler {
        @Generated
        void call_addAccessoryCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addActionSetWithNameCompletionHandler {
        @Generated
        void call_addActionSetWithNameCompletionHandler(@Nullable HMActionSet actionSet, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addAndSetupAccessoriesWithCompletionHandler {
        @Generated
        void call_addAndSetupAccessoriesWithCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addRoomWithNameCompletionHandler {
        @Generated
        void call_addRoomWithNameCompletionHandler(@Nullable HMRoom room, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addServiceGroupWithNameCompletionHandler {
        @Generated
        void call_addServiceGroupWithNameCompletionHandler(@Nullable HMServiceGroup group, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addTriggerCompletionHandler {
        @Generated
        void call_addTriggerCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addUserWithCompletionHandler {
        @Generated
        void call_addUserWithCompletionHandler(@Nullable HMUser user, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addZoneWithNameCompletionHandler {
        @Generated
        void call_addZoneWithNameCompletionHandler(@Nullable HMZone zone, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_assignAccessoryToRoomCompletionHandler {
        @Generated
        void call_assignAccessoryToRoomCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_executeActionSetCompletionHandler {
        @Generated
        void call_executeActionSetCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_manageUsersWithCompletionHandler {
        @Generated
        void call_manageUsersWithCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeAccessoryCompletionHandler {
        @Generated
        void call_removeAccessoryCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeActionSetCompletionHandler {
        @Generated
        void call_removeActionSetCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeRoomCompletionHandler {
        @Generated
        void call_removeRoomCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeServiceGroupCompletionHandler {
        @Generated
        void call_removeServiceGroupCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeTriggerCompletionHandler {
        @Generated
        void call_removeTriggerCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeUserCompletionHandler {
        @Generated
        void call_removeUserCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeZoneCompletionHandler {
        @Generated
        void call_removeZoneCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_unblockAccessoryCompletionHandler {
        @Generated
        void call_unblockAccessoryCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateNameCompletionHandler {
        @Generated
        void call_updateNameCompletionHandler(@Nullable NSError error);
    }

    /**
     * Specifies the state of the home hub.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("homeHubState")
    @NUInt
    public native long homeHubState();

    /**
     * Add accessory with the given setup payload to the home.
     * [@note] This SPI requires entitlement: com.apple.developer.homekit.allow-setup-payload
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   Accessories provides the list of added accessories.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     * 
     *                   API-Since: 11.3
     *                   Deprecated-Since: 15.0
     *                   Deprecated-Message: Use -[HMAccessorySetupManager
     *                   performAccessorySetupUsingRequest:completionHandler:] instead
     */
    @Deprecated
    @Generated
    @Selector("addAndSetupAccessoriesWithPayload:completionHandler:")
    public native void addAndSetupAccessoriesWithPayloadCompletionHandler(@NotNull HMAccessorySetupPayload payload,
            @NotNull @ObjCBlock(name = "call_addAndSetupAccessoriesWithPayloadCompletionHandler") Block_addAndSetupAccessoriesWithPayloadCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addAndSetupAccessoriesWithPayloadCompletionHandler {
        @Generated
        void call_addAndSetupAccessoriesWithPayloadCompletionHandler(
                @Nullable NSArray<? extends HMAccessory> accessories, @Nullable NSError error);
    }

    /**
     * True if this home supports all of the requirements for adding a network router.
     * 
     * API-Since: 13.2
     */
    @Generated
    @Selector("supportsAddingNetworkRouter")
    public native boolean supportsAddingNetworkRouter();

    /**
     * Identifier of the Matter controller associated with this home.
     * This property can be passed as the first argument to +[MTRDeviceController
     * sharedControllerWithId:xpcConnectBlock:] method
     * to get a MTRDeviceController object.
     * 
     * API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("matterControllerID")
    public native String matterControllerID();

    /**
     * Block generating XPC connection on demand through which to access the Matter controller associated with this
     * home.
     * This property can be passed as the second argument to +[MTRDeviceController
     * sharedControllerWithId:xpcConnectBlock:] method
     * to get a MTRDeviceController object.
     * 
     * API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("matterControllerXPCConnectBlock")
    @ObjCBlock(name = "call_matterControllerXPCConnectBlock_ret")
    public native Block_matterControllerXPCConnectBlock_ret matterControllerXPCConnectBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_matterControllerXPCConnectBlock_ret {
        @NotNull
        @Generated
        NSXPCConnection call_matterControllerXPCConnectBlock_ret();
    }
}
