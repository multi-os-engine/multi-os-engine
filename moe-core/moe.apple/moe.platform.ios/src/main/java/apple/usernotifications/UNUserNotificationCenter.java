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

package apple.usernotifications;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.usernotifications.protocol.UNUserNotificationCenterDelegate;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * UNNotificationRequests can be scheduled using UNUserNotificationCenter. They can also be sent to the device from a
 * server using Apple Push Notification Service. If the application is authorized then the UNNotificationRequest will be
 * used to create a UNNotification and it will be used to notify the user. If the user acts on the UNNotification then a
 * UNNotificationResponse will be sent to the application.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("UserNotifications")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UNUserNotificationCenter extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UNUserNotificationCenter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UNUserNotificationCenter alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UNUserNotificationCenter allocWithZone(VoidPtr zone);

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

    /**
     * The UNUserNotificationCenter for the current application
     */
    @NotNull
    @Generated
    @Selector("currentNotificationCenter")
    public static native UNUserNotificationCenter currentNotificationCenter();

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
    public static native UNUserNotificationCenter new_objc();

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
     * Notification requests can be scheduled to notify the user via time and location. See UNNotificationTrigger for
     * more information. Calling -addNotificationRequest: will replace an existing notification request with the same
     * identifier. A notification request with the identifier as an existing delivered notifications will alert for the
     * new notification request and replace the existing delivered notification when it is triggered. The number of
     * pending notification requests that may be scheduled by an application at any one time is limited by the system.
     */
    @Generated
    @Selector("addNotificationRequest:withCompletionHandler:")
    public native void addNotificationRequestWithCompletionHandler(@NotNull UNNotificationRequest request,
            @Nullable @ObjCBlock(name = "call_addNotificationRequestWithCompletionHandler") Block_addNotificationRequestWithCompletionHandler completionHandler);

    /**
     * The delegate can only be set from an application
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UNUserNotificationCenterDelegate delegate();

    /**
     * Notifications that have been delivered and remain in Notification Center. Notifications triggered by location
     * cannot be retrieved, but can be removed.
     */
    @Generated
    @Selector("getDeliveredNotificationsWithCompletionHandler:")
    public native void getDeliveredNotificationsWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_getDeliveredNotificationsWithCompletionHandler") Block_getDeliveredNotificationsWithCompletionHandler completionHandler);

    @Generated
    @Selector("getNotificationCategoriesWithCompletionHandler:")
    public native void getNotificationCategoriesWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_getNotificationCategoriesWithCompletionHandler") Block_getNotificationCategoriesWithCompletionHandler completionHandler);

    /**
     * The application's user notification settings
     */
    @Generated
    @Selector("getNotificationSettingsWithCompletionHandler:")
    public native void getNotificationSettingsWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_getNotificationSettingsWithCompletionHandler") Block_getNotificationSettingsWithCompletionHandler completionHandler);

    /**
     * Notification requests that have been scheduled for a future time or location and are waiting for their trigger to
     * fire
     */
    @Generated
    @Selector("getPendingNotificationRequestsWithCompletionHandler:")
    public native void getPendingNotificationRequestsWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_getPendingNotificationRequestsWithCompletionHandler") Block_getPendingNotificationRequestsWithCompletionHandler completionHandler);

    @Generated
    @Selector("init")
    public native UNUserNotificationCenter init();

    @Generated
    @Selector("removeAllDeliveredNotifications")
    public native void removeAllDeliveredNotifications();

    @Generated
    @Selector("removeAllPendingNotificationRequests")
    public native void removeAllPendingNotificationRequests();

    @Generated
    @Selector("removeDeliveredNotificationsWithIdentifiers:")
    public native void removeDeliveredNotificationsWithIdentifiers(@NotNull NSArray<String> identifiers);

    /**
     * Removes notifications that have been scheduled for a future time or location and are waiting for their trigger to
     * fire. There is no reason to call these methods to remove push notifications or notification requests with no
     * trigger.
     */
    @Generated
    @Selector("removePendingNotificationRequestsWithIdentifiers:")
    public native void removePendingNotificationRequestsWithIdentifiers(@NotNull NSArray<String> identifiers);

    /**
     * User authorization is required for applications to notify the user using UNUserNotificationCenter via both local
     * and remote notifications.
     */
    @Generated
    @Selector("requestAuthorizationWithOptions:completionHandler:")
    public native void requestAuthorizationWithOptionsCompletionHandler(@NUInt long options,
            @NotNull @ObjCBlock(name = "call_requestAuthorizationWithOptionsCompletionHandler") Block_requestAuthorizationWithOptionsCompletionHandler completionHandler);

    /**
     * The delegate can only be set from an application
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) UNUserNotificationCenterDelegate value);

    /**
     * The delegate can only be set from an application
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) UNUserNotificationCenterDelegate value) {
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
     * Notification categories can be used to choose which actions will be displayed on which notifications.
     */
    @Generated
    @Selector("setNotificationCategories:")
    public native void setNotificationCategories(@NotNull NSSet<? extends UNNotificationCategory> categories);

    /**
     * Returns YES if the current device supports content extensions
     */
    @Generated
    @Selector("supportsContentExtensions")
    public native boolean supportsContentExtensions();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addNotificationRequestWithCompletionHandler {
        @Generated
        void call_addNotificationRequestWithCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getDeliveredNotificationsWithCompletionHandler {
        @Generated
        void call_getDeliveredNotificationsWithCompletionHandler(
                @NotNull NSArray<? extends UNNotification> notifications);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getNotificationCategoriesWithCompletionHandler {
        @Generated
        void call_getNotificationCategoriesWithCompletionHandler(
                @NotNull NSSet<? extends UNNotificationCategory> categories);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getNotificationSettingsWithCompletionHandler {
        @Generated
        void call_getNotificationSettingsWithCompletionHandler(@NotNull UNNotificationSettings settings);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getPendingNotificationRequestsWithCompletionHandler {
        @Generated
        void call_getPendingNotificationRequestsWithCompletionHandler(
                @NotNull NSArray<? extends UNNotificationRequest> requests);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAuthorizationWithOptionsCompletionHandler {
        @Generated
        void call_requestAuthorizationWithOptionsCompletionHandler(boolean granted, @Nullable NSError error);
    }

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setBadgeCount:withCompletionHandler:")
    public native void setBadgeCountWithCompletionHandler(@NInt long newBadgeCount,
            @Nullable @ObjCBlock(name = "call_setBadgeCountWithCompletionHandler") Block_setBadgeCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setBadgeCountWithCompletionHandler {
        @Generated
        void call_setBadgeCountWithCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
