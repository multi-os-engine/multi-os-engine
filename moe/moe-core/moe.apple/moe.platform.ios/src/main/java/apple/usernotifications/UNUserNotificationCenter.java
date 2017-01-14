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

    @Generated
    @Selector("addNotificationRequest:withCompletionHandler:")
    public native void addNotificationRequestWithCompletionHandler(UNNotificationRequest request,
            @ObjCBlock(name = "call_addNotificationRequestWithCompletionHandler") Block_addNotificationRequestWithCompletionHandler completionHandler);

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UNUserNotificationCenterDelegate delegate();

    @Generated
    @Selector("getDeliveredNotificationsWithCompletionHandler:")
    public native void getDeliveredNotificationsWithCompletionHandler(
            @ObjCBlock(name = "call_getDeliveredNotificationsWithCompletionHandler") Block_getDeliveredNotificationsWithCompletionHandler completionHandler);

    @Generated
    @Selector("getNotificationCategoriesWithCompletionHandler:")
    public native void getNotificationCategoriesWithCompletionHandler(
            @ObjCBlock(name = "call_getNotificationCategoriesWithCompletionHandler") Block_getNotificationCategoriesWithCompletionHandler completionHandler);

    @Generated
    @Selector("getNotificationSettingsWithCompletionHandler:")
    public native void getNotificationSettingsWithCompletionHandler(
            @ObjCBlock(name = "call_getNotificationSettingsWithCompletionHandler") Block_getNotificationSettingsWithCompletionHandler completionHandler);

    @Generated
    @Selector("getPendingNotificationRequestsWithCompletionHandler:")
    public native void getPendingNotificationRequestsWithCompletionHandler(
            @ObjCBlock(name = "call_getPendingNotificationRequestsWithCompletionHandler") Block_getPendingNotificationRequestsWithCompletionHandler completionHandler);

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
    public native void removeDeliveredNotificationsWithIdentifiers(NSArray<String> identifiers);

    @Generated
    @Selector("removePendingNotificationRequestsWithIdentifiers:")
    public native void removePendingNotificationRequestsWithIdentifiers(NSArray<String> identifiers);

    @Generated
    @Selector("requestAuthorizationWithOptions:completionHandler:")
    public native void requestAuthorizationWithOptionsCompletionHandler(@NUInt long options,
            @ObjCBlock(name = "call_requestAuthorizationWithOptionsCompletionHandler") Block_requestAuthorizationWithOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) UNUserNotificationCenterDelegate value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) UNUserNotificationCenterDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setNotificationCategories:")
    public native void setNotificationCategories(NSSet<? extends UNNotificationCategory> categories);

    @Generated
    @Selector("supportsContentExtensions")
    public native boolean supportsContentExtensions();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addNotificationRequestWithCompletionHandler {
        @Generated
        void call_addNotificationRequestWithCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getDeliveredNotificationsWithCompletionHandler {
        @Generated
        void call_getDeliveredNotificationsWithCompletionHandler(NSArray<? extends UNNotification> arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getNotificationCategoriesWithCompletionHandler {
        @Generated
        void call_getNotificationCategoriesWithCompletionHandler(NSSet<? extends UNNotificationCategory> arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getNotificationSettingsWithCompletionHandler {
        @Generated
        void call_getNotificationSettingsWithCompletionHandler(UNNotificationSettings arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getPendingNotificationRequestsWithCompletionHandler {
        @Generated
        void call_getPendingNotificationRequestsWithCompletionHandler(NSArray<? extends UNNotificationRequest> arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAuthorizationWithOptionsCompletionHandler {
        @Generated
        void call_requestAuthorizationWithOptionsCompletionHandler(boolean arg0, NSError arg1);
    }
}
