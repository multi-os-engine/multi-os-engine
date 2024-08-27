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

package apple.cloudkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This class should not be subclassed. If it is, Sendable may no longer apply.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKNotification extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CKNotification(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKNotification alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CKNotification allocWithZone(VoidPtr zone);

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
    public static native CKNotification new_objc();

    @Generated
    @Selector("notificationFromRemoteNotificationDictionary:")
    public static native CKNotification notificationFromRemoteNotificationDictionary(
            @NotNull NSDictionary<?, ?> notificationDictionary);

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
     * API-Since: 8.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: Interact with UI elements of a CloudKit-server-generated push message via
     * UserNotifications.framework
     */
    @Deprecated
    @Nullable
    @Generated
    @Selector("alertActionLocalizationKey")
    public native String alertActionLocalizationKey();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: Interact with UI elements of a CloudKit-server-generated push message via
     * UserNotifications.framework
     */
    @Deprecated
    @Nullable
    @Generated
    @Selector("alertBody")
    public native String alertBody();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: Interact with UI elements of a CloudKit-server-generated push message via
     * UserNotifications.framework
     */
    @Deprecated
    @Nullable
    @Generated
    @Selector("alertLaunchImage")
    public native String alertLaunchImage();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: Interact with UI elements of a CloudKit-server-generated push message via
     * UserNotifications.framework
     */
    @Deprecated
    @Nullable
    @Generated
    @Selector("alertLocalizationArgs")
    public native NSArray<String> alertLocalizationArgs();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: Interact with UI elements of a CloudKit-server-generated push message via
     * UserNotifications.framework
     */
    @Deprecated
    @Nullable
    @Generated
    @Selector("alertLocalizationKey")
    public native String alertLocalizationKey();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: Interact with UI elements of a CloudKit-server-generated push message via
     * UserNotifications.framework
     */
    @Deprecated
    @Nullable
    @Generated
    @Selector("badge")
    public native NSNumber badge();

    /**
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("category")
    public native String category();

    @Nullable
    @Generated
    @Selector("containerIdentifier")
    public native String containerIdentifier();

    @Generated
    @Selector("init")
    public native CKNotification init();

    /**
     * Whether or not the notification fully represents what the server wanted to send.
     * 
     * Push notifications have a limited size. In some cases, CloudKit servers may not be able to send you a full
     * `CKNotification`'s worth of info in one push.
     * In those cases, `isPruned` returns `true`.
     * The order in which properties are dropped from a push notification is defined in each `CKNotification` subclass
     * below.
     */
    @Generated
    @Selector("isPruned")
    public native boolean isPruned();

    @Nullable
    @Generated
    @Selector("notificationID")
    public native CKNotificationID notificationID();

    /**
     * When you instantiate a `CKNotification` from a remote notification dictionary, you will get back a concrete
     * subclass defined below. Use `notificationType` to avoid `as?` or `-isKindOfClass:` checks.
     */
    @Generated
    @Selector("notificationType")
    @NInt
    public native long notificationType();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: Interact with UI elements of a CloudKit-server-generated push message via
     * UserNotifications.framework
     */
    @Deprecated
    @Nullable
    @Generated
    @Selector("soundName")
    public native String soundName();

    /**
     * The ID of the subscription that caused this notification to fire.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("subscriptionID")
    public native String subscriptionID();

    /**
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("subtitle")
    public native String subtitle();

    /**
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("subtitleLocalizationArgs")
    public native NSArray<String> subtitleLocalizationArgs();

    /**
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("subtitleLocalizationKey")
    public native String subtitleLocalizationKey();

    /**
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("title")
    public native String title();

    /**
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("titleLocalizationArgs")
    public native NSArray<String> titleLocalizationArgs();

    /**
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("titleLocalizationKey")
    public native String titleLocalizationKey();

    /**
     * The user `recordID` of the owner of the subscription for which this notification was generated
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("subscriptionOwnerUserRecordID")
    public native CKRecordID subscriptionOwnerUserRecordID();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
