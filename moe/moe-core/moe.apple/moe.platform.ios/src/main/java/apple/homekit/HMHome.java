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

/**
 * @brief Represents a home.
 * 
 * @discussion This class represents a home and is the entry point to communicate and
 *             configure different accessories in the home. This is also used to manage
 *             all the rooms, zones, service groups, users, triggers, and action sets in
 *             the home.
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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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
     * @brief Array of HMAccessory objects that represents all accessories added to the home.
     */
    @Generated
    @Selector("accessories")
    public native NSArray<? extends HMAccessory> accessories();

    /**
     * @brief Array of HMActionSet objects that represents all the action sets in the home.
     */
    @Generated
    @Selector("actionSets")
    public native NSArray<? extends HMActionSet> actionSets();

    /**
     * @brief Adds a new accessory to the home.
     * 
     * @param accessory Accessory to add to the home.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("addAccessory:completionHandler:")
    public native void addAccessoryCompletionHandler(HMAccessory accessory,
            @ObjCBlock(name = "call_addAccessoryCompletionHandler") Block_addAccessoryCompletionHandler completion);

    /**
     * @brief Adds a new action set to the home.
     * 
     * @param actionSetName Name of the action set to add to the home.
     * 
     * @param completion Block that is invoked once the request is processed.
     * 	                 The HMActionSet parameter is the new action set added to the home.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("addActionSetWithName:completionHandler:")
    public native void addActionSetWithNameCompletionHandler(String actionSetName,
            @ObjCBlock(name = "call_addActionSetWithNameCompletionHandler") Block_addActionSetWithNameCompletionHandler completion);

    /**
     * @brief Find nearby accessories and add them to the home. During this process, each of the accessories added
     *        to the home is assigned to a room and its services are configured.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("addAndSetupAccessoriesWithCompletionHandler:")
    public native void addAndSetupAccessoriesWithCompletionHandler(
            @ObjCBlock(name = "call_addAndSetupAccessoriesWithCompletionHandler") Block_addAndSetupAccessoriesWithCompletionHandler completion);

    /**
     * @brief Adds a room to the home.
     * 
     * @param roomName Name of the room to add to the home.
     * 
     * @param completion Block that is invoked once the request is processed.
     * 	                 The HMRoom is the new room added to the home.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("addRoomWithName:completionHandler:")
    public native void addRoomWithNameCompletionHandler(String roomName,
            @ObjCBlock(name = "call_addRoomWithNameCompletionHandler") Block_addRoomWithNameCompletionHandler completion);

    /**
     * @brief Adds a service group to the home.
     * 
     * @param serviceGroupName Name of the service group to add to the home.
     * 
     * @param completion Block that is invoked once the request is processed.
     * 	                 The HMServiceGroup is the new service group added to the home.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("addServiceGroupWithName:completionHandler:")
    public native void addServiceGroupWithNameCompletionHandler(String serviceGroupName,
            @ObjCBlock(name = "call_addServiceGroupWithNameCompletionHandler") Block_addServiceGroupWithNameCompletionHandler completion);

    /**
     * @brief Adds a trigger to the home. Unless the trigger object is added to the home, it cannot be
     *        activated.
     * 
     * @discussion  Triggers are specific to an iOS device and are not synced across multiple devices to
     *              ensure that the action sets are executed only once.
     * 
     * @param trigger Trigger to add to the home.
     * 
     * @param completion Block that is invoked once the request is processed.
     * 	                 The HMTrigger parameter is the new trigger added to the home.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("addTrigger:completionHandler:")
    public native void addTriggerCompletionHandler(HMTrigger trigger,
            @ObjCBlock(name = "call_addTriggerCompletionHandler") Block_addTriggerCompletionHandler completion);

    /**
     * @brief Adds a user to the home.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The HMUser object provides a reference to the user that was added to the home.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success. The userInfo dictionary will contain the HMUserFailedAccessoriesKey which provides
     *                   more details on the accessories that failed to add the user.
     */
    @Generated
    @Deprecated
    @Selector("addUserWithCompletionHandler:")
    public native void addUserWithCompletionHandler(
            @ObjCBlock(name = "call_addUserWithCompletionHandler") Block_addUserWithCompletionHandler completion);

    /**
     * @brief Adds a zone to the home.
     * 
     * @param zoneName Name of the zone to add to the home.
     * 
     * @param completion Block that is invoked once the request is processed.
     * 	                 The HMZone is the new zone added to the home.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("addZoneWithName:completionHandler:")
    public native void addZoneWithNameCompletionHandler(String zoneName,
            @ObjCBlock(name = "call_addZoneWithNameCompletionHandler") Block_addZoneWithNameCompletionHandler completion);

    /**
     * @brief Assigns a new room for the accessory.
     * 
     * @discussion When an accessory is added to a home, it is automatically assigned the room corresponding to
     *             + [HMHome roomForEntireHome]. This method is used to change the room assigned to an accessory.
     * 
     * @param accessory Accessory whose rooms needs to modified
     * 
     * @param room New room for the accessory.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("assignAccessory:toRoom:completionHandler:")
    public native void assignAccessoryToRoomCompletionHandler(HMAccessory accessory, HMRoom room,
            @ObjCBlock(name = "call_assignAccessoryToRoomCompletionHandler") Block_assignAccessoryToRoomCompletionHandler completion);

    /**
     * @brief Retrieve a built-in action set for the home.
     * 
     * @param actionSetType Type of the builtin action set. Supported action set types are HMActionSetTypeWakeUp,
     *                      HMActionSetTypeSleep, HMActionSetTypeHomeDeparture and HMActionSetTypeHomeArrival.
     * 
     * @return Reference to the built-in action set corresponding to type argument,
     *         nil if no matching action set is found.
     */
    @Generated
    @Selector("builtinActionSetOfType:")
    public native HMActionSet builtinActionSetOfType(String actionSetType);

    /**
     * @brief HMUser object representing the current user of the home.
     */
    @Generated
    @Selector("currentUser")
    public native HMUser currentUser();

    /**
     * @brief Delegate that receives updates on the state of the home.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native HMHomeDelegate delegate();

    /**
     * @brief Executes all the actions within an action set.
     * 
     * @param actionSet Action set to execute.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("executeActionSet:completionHandler:")
    public native void executeActionSetCompletionHandler(HMActionSet actionSet,
            @ObjCBlock(name = "call_executeActionSetCompletionHandler") Block_executeActionSetCompletionHandler completion);

    /**
     * @brief Retrieve the access level of the user associated with the home.
     */
    @Generated
    @Selector("homeAccessControlForUser:")
    public native HMHomeAccessControl homeAccessControlForUser(HMUser user);

    @Generated
    @Selector("init")
    public native HMHome init();

    /**
     * @brief Specifies whether this home is the primary home.
     */
    @Generated
    @Selector("isPrimary")
    public native boolean isPrimary();

    /**
     * @brief Presents a view controller to manage users of the home.
     * 
     * @discussion This API is available only for users that have administrator access to the home.
     * 
     * @param completion Block that is invoked once user management is completed.
     *                   The completion block is fired to allow clients to know when the user has dismissed the view.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success. If the user does not have administrator privileges the error code will be set to
     *                   HMErrorCodeInsufficientPrivileges.
     */
    @Generated
    @Selector("manageUsersWithCompletionHandler:")
    public native void manageUsersWithCompletionHandler(
            @ObjCBlock(name = "call_manageUsersWithCompletionHandler") Block_manageUsersWithCompletionHandler completion);

    /**
     * @brief The name of the home.
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * @brief Removes an accessory from the home.
     * 
     * @param accessory Accessory to remove from the home.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("removeAccessory:completionHandler:")
    public native void removeAccessoryCompletionHandler(HMAccessory accessory,
            @ObjCBlock(name = "call_removeAccessoryCompletionHandler") Block_removeAccessoryCompletionHandler completion);

    /**
     * @brief Removes an existing action set from the home.
     * 
     * @param actionSet Action set to remove from the home. A builtin action set cannot be removed.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("removeActionSet:completionHandler:")
    public native void removeActionSetCompletionHandler(HMActionSet actionSet,
            @ObjCBlock(name = "call_removeActionSetCompletionHandler") Block_removeActionSetCompletionHandler completion);

    /**
     * @brief Removes a room from the home.
     * @discussion Any references to this room will be removed from all properties
     *             of the home. For example, the room will be removed from the zone.
     *             Any accessories associated contained by this room will be moved to
     *             the room provided by - [HMHome roomForEntireHome].
     * 
     * @param room Room to remove from the home.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("removeRoom:completionHandler:")
    public native void removeRoomCompletionHandler(HMRoom room,
            @ObjCBlock(name = "call_removeRoomCompletionHandler") Block_removeRoomCompletionHandler completion);

    /**
     * @brief Removes a service group from the home.
     * 
     * @param group Service group to remove from the home.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("removeServiceGroup:completionHandler:")
    public native void removeServiceGroupCompletionHandler(HMServiceGroup group,
            @ObjCBlock(name = "call_removeServiceGroupCompletionHandler") Block_removeServiceGroupCompletionHandler completion);

    /**
     * @brief Removes a trigger from the home. If the trigger is active, they are automatically deactivated.
     * 
     * @param trigger Trigger to remove from the home.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("removeTrigger:completionHandler:")
    public native void removeTriggerCompletionHandler(HMTrigger trigger,
            @ObjCBlock(name = "call_removeTriggerCompletionHandler") Block_removeTriggerCompletionHandler completion);

    /**
     * @brief Removes a user from the home.
     * 
     * @param user HMUser whose access is being revoked.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success. The userInfo dictionary will contain the HMUserFailedAccessoriesKey which provides
     *                   more details on the accessories that failed to remove the user.
     */
    @Generated
    @Deprecated
    @Selector("removeUser:completionHandler:")
    public native void removeUserCompletionHandler(HMUser user,
            @ObjCBlock(name = "call_removeUserCompletionHandler") Block_removeUserCompletionHandler completion);

    /**
     * @brief Removes a zone from the home.
     * 
     * @param zone Zone to remove from the home.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("removeZone:completionHandler:")
    public native void removeZoneCompletionHandler(HMZone zone,
            @ObjCBlock(name = "call_removeZoneCompletionHandler") Block_removeZoneCompletionHandler completion);

    /**
     * @brief This method returns a room that represents the entire home. This can be used to assign a room
     *        to a service that is not necessarily located in one particular room.
     * 
     * @return HMRoom that represents the home.
     */
    @Generated
    @Selector("roomForEntireHome")
    public native HMRoom roomForEntireHome();

    /**
     * @brief Array of HMRoom objects that represents all rooms in the home.
     */
    @Generated
    @Selector("rooms")
    public native NSArray<? extends HMRoom> rooms();

    /**
     * @brief Array of HMServiceGroup objects that represents all service groups in the home.
     */
    @Generated
    @Selector("serviceGroups")
    public native NSArray<? extends HMServiceGroup> serviceGroups();

    /**
     * @brief Queries all services that match the specified types.
     * 
     * @param serviceTypes Array of NSString objects that specifies the service types to match.
     * 
     * @return Array of HMService objects that match the specified service types,
     *         nil if no matching services were found.
     */
    @Generated
    @Selector("servicesWithTypes:")
    public native NSArray<? extends HMService> servicesWithTypes(NSArray<String> serviceTypes);

    /**
     * @brief Delegate that receives updates on the state of the home.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) HMHomeDelegate value);

    /**
     * @brief Delegate that receives updates on the state of the home.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) HMHomeDelegate value) {
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
     * @brief Array of HMTrigger objects that represents all the triggers in the home.
     */
    @Generated
    @Selector("triggers")
    public native NSArray<? extends HMTrigger> triggers();

    /**
     * @brief unblock a blocked accessory.
     * 
     * @discussion A misbehaving accessory will automatically be blocked.  After that all requests to
     *              the accessory will fail.  This API must be used to explicitly unblock the accessory
     * 
     * @param accessory accessory to be unblocked
     * 
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("unblockAccessory:completionHandler:")
    public native void unblockAccessoryCompletionHandler(HMAccessory accessory,
            @ObjCBlock(name = "call_unblockAccessoryCompletionHandler") Block_unblockAccessoryCompletionHandler completion);

    /**
     * @brief A unique identifier for the home.
     */
    @Generated
    @Selector("uniqueIdentifier")
    public native NSUUID uniqueIdentifier();

    /**
     * @brief This method is used to change the name of the home.
     * 
     * @param name New name for the home.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("updateName:completionHandler:")
    public native void updateNameCompletionHandler(String name,
            @ObjCBlock(name = "call_updateNameCompletionHandler") Block_updateNameCompletionHandler completion);

    /**
     * @brief Array of HMUser objects that represent all users associated with the home.
     */
    @Generated
    @Deprecated
    @Selector("users")
    public native NSArray<? extends HMUser> users();

    /**
     * @brief Array of HMZone objects that represents all the zones in the home.
     */
    @Generated
    @Selector("zones")
    public native NSArray<? extends HMZone> zones();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addAccessoryCompletionHandler {
        @Generated
        void call_addAccessoryCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addActionSetWithNameCompletionHandler {
        @Generated
        void call_addActionSetWithNameCompletionHandler(HMActionSet actionSet, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addAndSetupAccessoriesWithCompletionHandler {
        @Generated
        void call_addAndSetupAccessoriesWithCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addRoomWithNameCompletionHandler {
        @Generated
        void call_addRoomWithNameCompletionHandler(HMRoom room, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addServiceGroupWithNameCompletionHandler {
        @Generated
        void call_addServiceGroupWithNameCompletionHandler(HMServiceGroup group, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addTriggerCompletionHandler {
        @Generated
        void call_addTriggerCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addUserWithCompletionHandler {
        @Generated
        void call_addUserWithCompletionHandler(HMUser user, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addZoneWithNameCompletionHandler {
        @Generated
        void call_addZoneWithNameCompletionHandler(HMZone zone, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_assignAccessoryToRoomCompletionHandler {
        @Generated
        void call_assignAccessoryToRoomCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_executeActionSetCompletionHandler {
        @Generated
        void call_executeActionSetCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_manageUsersWithCompletionHandler {
        @Generated
        void call_manageUsersWithCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeAccessoryCompletionHandler {
        @Generated
        void call_removeAccessoryCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeActionSetCompletionHandler {
        @Generated
        void call_removeActionSetCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeRoomCompletionHandler {
        @Generated
        void call_removeRoomCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeServiceGroupCompletionHandler {
        @Generated
        void call_removeServiceGroupCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeTriggerCompletionHandler {
        @Generated
        void call_removeTriggerCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeUserCompletionHandler {
        @Generated
        void call_removeUserCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeZoneCompletionHandler {
        @Generated
        void call_removeZoneCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_unblockAccessoryCompletionHandler {
        @Generated
        void call_unblockAccessoryCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateNameCompletionHandler {
        @Generated
        void call_updateNameCompletionHandler(NSError error);
    }

    /**
     * @brief Specifies the state of the home hub.
     */
    @Generated
    @Selector("homeHubState")
    @NUInt
    public native long homeHubState();

    /**
     * @brief Add accessory with the given setup payload to the home.
     * @note  This SPI requires entitlement: com.apple.homekit.developer.allow-setup-payload
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   Accessories provides the list of added accessories.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("addAndSetupAccessoriesWithPayload:completionHandler:")
    public native void addAndSetupAccessoriesWithPayloadCompletionHandler(HMAccessorySetupPayload payload,
            @ObjCBlock(name = "call_addAndSetupAccessoriesWithPayloadCompletionHandler") Block_addAndSetupAccessoriesWithPayloadCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addAndSetupAccessoriesWithPayloadCompletionHandler {
        @Generated
        void call_addAndSetupAccessoriesWithPayloadCompletionHandler(NSArray<? extends HMAccessory> accessories,
                NSError error);
    }

    /**
     * @brief True if this home supports all of the requirements for adding a network router.
     */
    @Generated
    @Selector("supportsAddingNetworkRouter")
    public native boolean supportsAddingNetworkRouter();
}
