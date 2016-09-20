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
    @Owned
    @Selector("alloc")
    public static native HMHome alloc();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

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
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * accessories</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instp/HMHome/accessories">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessories")
    public native NSArray<? extends HMAccessory> accessories();

    /**
     * actionSets</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instp/HMHome/actionSets">iOS Dev Center</a>
     */
    @Generated
    @Selector("actionSets")
    public native NSArray<? extends HMActionSet> actionSets();

    /**
     * addAccessory:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instm/HMHome/addAccessory:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addAccessory:completionHandler:")
    public native void addAccessoryCompletionHandler(HMAccessory accessory,
            @ObjCBlock(name = "call_addAccessoryCompletionHandler") Block_addAccessoryCompletionHandler completion);

    /**
     * addActionSetWithName:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instm/HMHome/addActionSetWithName:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addActionSetWithName:completionHandler:")
    public native void addActionSetWithNameCompletionHandler(String actionSetName,
            @ObjCBlock(name = "call_addActionSetWithNameCompletionHandler") Block_addActionSetWithNameCompletionHandler completion);

    /**
     * addRoomWithName:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instm/HMHome/addRoomWithName:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addRoomWithName:completionHandler:")
    public native void addRoomWithNameCompletionHandler(String roomName,
            @ObjCBlock(name = "call_addRoomWithNameCompletionHandler") Block_addRoomWithNameCompletionHandler completion);

    /**
     * addServiceGroupWithName:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instm/HMHome/addServiceGroupWithName:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addServiceGroupWithName:completionHandler:")
    public native void addServiceGroupWithNameCompletionHandler(String serviceGroupName,
            @ObjCBlock(name = "call_addServiceGroupWithNameCompletionHandler") Block_addServiceGroupWithNameCompletionHandler completion);

    /**
     * addTrigger:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instm/HMHome/addTrigger:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addTrigger:completionHandler:")
    public native void addTriggerCompletionHandler(HMTrigger trigger,
            @ObjCBlock(name = "call_addTriggerCompletionHandler") Block_addTriggerCompletionHandler completion);

    /**
     * addUserWithCompletionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instm/HMHome/addUserWithCompletionHandler:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("addUserWithCompletionHandler:")
    public native void addUserWithCompletionHandler(
            @ObjCBlock(name = "call_addUserWithCompletionHandler") Block_addUserWithCompletionHandler completion);

    /**
     * addZoneWithName:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instm/HMHome/addZoneWithName:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addZoneWithName:completionHandler:")
    public native void addZoneWithNameCompletionHandler(String zoneName,
            @ObjCBlock(name = "call_addZoneWithNameCompletionHandler") Block_addZoneWithNameCompletionHandler completion);

    /**
     * assignAccessory:toRoom:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instm/HMHome/assignAccessory:toRoom:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("assignAccessory:toRoom:completionHandler:")
    public native void assignAccessoryToRoomCompletionHandler(HMAccessory accessory, HMRoom room,
            @ObjCBlock(name = "call_assignAccessoryToRoomCompletionHandler") Block_assignAccessoryToRoomCompletionHandler completion);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instp/HMHome/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native HMHomeDelegate delegate();

    /**
     * executeActionSet:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instm/HMHome/executeActionSet:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("executeActionSet:completionHandler:")
    public native void executeActionSetCompletionHandler(HMActionSet actionSet,
            @ObjCBlock(name = "call_executeActionSetCompletionHandler") Block_executeActionSetCompletionHandler completion);

    @Generated
    @Selector("init")
    public native HMHome init();

    /**
     * primary</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instp/HMHome/primary">iOS Dev Center</a>
     */
    @Generated
    @Selector("isPrimary")
    public native boolean isPrimary();

    /**
     * name</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instp/HMHome/name">iOS Dev Center</a>
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * removeAccessory:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instm/HMHome/removeAccessory:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeAccessory:completionHandler:")
    public native void removeAccessoryCompletionHandler(HMAccessory accessory,
            @ObjCBlock(name = "call_removeAccessoryCompletionHandler") Block_removeAccessoryCompletionHandler completion);

    /**
     * removeActionSet:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instm/HMHome/removeActionSet:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeActionSet:completionHandler:")
    public native void removeActionSetCompletionHandler(HMActionSet actionSet,
            @ObjCBlock(name = "call_removeActionSetCompletionHandler") Block_removeActionSetCompletionHandler completion);

    /**
     * removeRoom:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instm/HMHome/removeRoom:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeRoom:completionHandler:")
    public native void removeRoomCompletionHandler(HMRoom room,
            @ObjCBlock(name = "call_removeRoomCompletionHandler") Block_removeRoomCompletionHandler completion);

    /**
     * removeServiceGroup:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instm/HMHome/removeServiceGroup:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeServiceGroup:completionHandler:")
    public native void removeServiceGroupCompletionHandler(HMServiceGroup group,
            @ObjCBlock(name = "call_removeServiceGroupCompletionHandler") Block_removeServiceGroupCompletionHandler completion);

    /**
     * removeTrigger:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instm/HMHome/removeTrigger:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeTrigger:completionHandler:")
    public native void removeTriggerCompletionHandler(HMTrigger trigger,
            @ObjCBlock(name = "call_removeTriggerCompletionHandler") Block_removeTriggerCompletionHandler completion);

    /**
     * removeUser:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instm/HMHome/removeUser:completionHandler:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("removeUser:completionHandler:")
    public native void removeUserCompletionHandler(HMUser user,
            @ObjCBlock(name = "call_removeUserCompletionHandler") Block_removeUserCompletionHandler completion);

    /**
     * removeZone:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instm/HMHome/removeZone:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeZone:completionHandler:")
    public native void removeZoneCompletionHandler(HMZone zone,
            @ObjCBlock(name = "call_removeZoneCompletionHandler") Block_removeZoneCompletionHandler completion);

    /**
     * roomForEntireHome</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instm/HMHome/roomForEntireHome">iOS Dev Center</a>
     */
    @Generated
    @Selector("roomForEntireHome")
    public native HMRoom roomForEntireHome();

    /**
     * rooms</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instp/HMHome/rooms">iOS Dev Center</a>
     */
    @Generated
    @Selector("rooms")
    public native NSArray<? extends HMRoom> rooms();

    /**
     * serviceGroups</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instp/HMHome/serviceGroups">iOS Dev Center</a>
     */
    @Generated
    @Selector("serviceGroups")
    public native NSArray<? extends HMServiceGroup> serviceGroups();

    /**
     * servicesWithTypes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instm/HMHome/servicesWithTypes:">iOS Dev Center</a>
     */
    @Generated
    @Selector("servicesWithTypes:")
    public native NSArray<? extends HMService> servicesWithTypes(NSArray<String> serviceTypes);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instp/HMHome/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) HMHomeDelegate value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instp/HMHome/delegate">iOS Dev Center</a>
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
     * triggers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instp/HMHome/triggers">iOS Dev Center</a>
     */
    @Generated
    @Selector("triggers")
    public native NSArray<? extends HMTrigger> triggers();

    /**
     * unblockAccessory:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instm/HMHome/unblockAccessory:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("unblockAccessory:completionHandler:")
    public native void unblockAccessoryCompletionHandler(HMAccessory accessory,
            @ObjCBlock(name = "call_unblockAccessoryCompletionHandler") Block_unblockAccessoryCompletionHandler completion);

    /**
     * updateName:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instm/HMHome/updateName:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("updateName:completionHandler:")
    public native void updateNameCompletionHandler(String name,
            @ObjCBlock(name = "call_updateNameCompletionHandler") Block_updateNameCompletionHandler completion);

    /**
     * users</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instp/HMHome/users">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("users")
    public native NSArray<? extends HMUser> users();

    /**
     * zones</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHome_Class/index.html#//apple_ref/occ/instp/HMHome/zones">iOS Dev Center</a>
     */
    @Generated
    @Selector("zones")
    public native NSArray<? extends HMZone> zones();

    @Generated
    @Selector("builtinActionSetOfType:")
    public native HMActionSet builtinActionSetOfType(String actionSetType);

    @Generated
    @Selector("currentUser")
    public native HMUser currentUser();

    @Generated
    @Selector("homeAccessControlForUser:")
    public native HMHomeAccessControl homeAccessControlForUser(HMUser user);

    @Generated
    @Selector("manageUsersWithCompletionHandler:")
    public native void manageUsersWithCompletionHandler(
            @ObjCBlock(name = "call_manageUsersWithCompletionHandler") Block_manageUsersWithCompletionHandler completion);

    @Generated
    @Selector("uniqueIdentifier")
    public native NSUUID uniqueIdentifier();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addAccessoryCompletionHandler {
        @Generated
        void call_addAccessoryCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addActionSetWithNameCompletionHandler {
        @Generated
        void call_addActionSetWithNameCompletionHandler(HMActionSet arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addRoomWithNameCompletionHandler {
        @Generated
        void call_addRoomWithNameCompletionHandler(HMRoom arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addServiceGroupWithNameCompletionHandler {
        @Generated
        void call_addServiceGroupWithNameCompletionHandler(HMServiceGroup arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addTriggerCompletionHandler {
        @Generated
        void call_addTriggerCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addUserWithCompletionHandler {
        @Generated
        void call_addUserWithCompletionHandler(HMUser arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addZoneWithNameCompletionHandler {
        @Generated
        void call_addZoneWithNameCompletionHandler(HMZone arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_assignAccessoryToRoomCompletionHandler {
        @Generated
        void call_assignAccessoryToRoomCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_executeActionSetCompletionHandler {
        @Generated
        void call_executeActionSetCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeAccessoryCompletionHandler {
        @Generated
        void call_removeAccessoryCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeActionSetCompletionHandler {
        @Generated
        void call_removeActionSetCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeRoomCompletionHandler {
        @Generated
        void call_removeRoomCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeServiceGroupCompletionHandler {
        @Generated
        void call_removeServiceGroupCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeTriggerCompletionHandler {
        @Generated
        void call_removeTriggerCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeUserCompletionHandler {
        @Generated
        void call_removeUserCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeZoneCompletionHandler {
        @Generated
        void call_removeZoneCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_unblockAccessoryCompletionHandler {
        @Generated
        void call_unblockAccessoryCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateNameCompletionHandler {
        @Generated
        void call_updateNameCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_manageUsersWithCompletionHandler {
        @Generated
        void call_manageUsersWithCompletionHandler(NSError arg0);
    }
}
