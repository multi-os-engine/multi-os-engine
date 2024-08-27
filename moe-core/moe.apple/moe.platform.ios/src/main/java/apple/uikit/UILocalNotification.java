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

package apple.uikit;

import apple.NSObject;
import apple.corelocation.CLRegion;
import apple.foundation.NSArray;
import apple.foundation.NSCalendar;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSTimeZone;
import apple.foundation.protocol.NSCoding;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * In iOS 8.0 and later, your application must register for user notifications using -[UIApplication
 * registerUserNotificationSettings:] before being able to schedule and present UILocalNotifications
 * 
 * API-Since: 4.0
 * Deprecated-Since: 10.0
 * Deprecated-Message: Use UserNotifications Framework's UNNotificationRequest
 */
@Deprecated
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UILocalNotification extends NSObject implements NSCopying, NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UILocalNotification(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UILocalNotification alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UILocalNotification allocWithZone(VoidPtr zone);

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
    public static native UILocalNotification new_objc();

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
     * used in UIAlert button or 'slide to unlock...' slider in place of unlock
     */
    @Nullable
    @Generated
    @Selector("alertAction")
    public native String alertAction();

    /**
     * defaults to nil. pass a string or localized string key to show an alert
     */
    @Nullable
    @Generated
    @Selector("alertBody")
    public native String alertBody();

    /**
     * used as the launch image (UILaunchImageFile) when launch button is tapped
     */
    @Nullable
    @Generated
    @Selector("alertLaunchImage")
    public native String alertLaunchImage();

    /**
     * defaults to nil. pass a string or localized string key
     * 
     * API-Since: 8.2
     */
    @Nullable
    @Generated
    @Selector("alertTitle")
    public native String alertTitle();

    /**
     * 0 means no change. defaults to 0
     */
    @Generated
    @Selector("applicationIconBadgeNumber")
    @NInt
    public native long applicationIconBadgeNumber();

    /**
     * category identifier of the local notification, as set on a UIUserNotificationCategory and passed to
     * +[UIUserNotificationSettings settingsForTypes:categories:]
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("category")
    public native String category();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * timer-based scheduling
     */
    @Nullable
    @Generated
    @Selector("fireDate")
    public native NSDate fireDate();

    /**
     * defaults to YES. pass NO to hide launching button/slider
     */
    @Generated
    @Selector("hasAction")
    public native boolean hasAction();

    @Generated
    @Selector("init")
    public native UILocalNotification init();

    @Generated
    @Selector("initWithCoder:")
    public native UILocalNotification initWithCoder(@NotNull NSCoder coder);

    /**
     * set a CLRegion object to trigger the notification when the user enters or leaves a geographic region, depending
     * upon the properties set on the CLRegion object itself. registering multiple UILocalNotifications with different
     * regions containing the same identifier will result in undefined behavior. the number of region-triggered
     * UILocalNotifications that may be registered at any one time is internally limited. in order to use
     * region-triggered notifications, applications must have "when-in-use" authorization through CoreLocation. see the
     * CoreLocation documentation for more information.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("region")
    public native CLRegion region();

    /**
     * when YES, the notification will only fire one time. when NO, the notification will fire every time the region is
     * entered or exited (depending upon the CLRegion object's configuration). default is YES.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("regionTriggersOnce")
    public native boolean regionTriggersOnce();

    @Nullable
    @Generated
    @Selector("repeatCalendar")
    public native NSCalendar repeatCalendar();

    /**
     * 0 means don't repeat
     */
    @Generated
    @Selector("repeatInterval")
    @NUInt
    public native long repeatInterval();

    /**
     * used in UIAlert button or 'slide to unlock...' slider in place of unlock
     */
    @Generated
    @Selector("setAlertAction:")
    public native void setAlertAction(@Nullable String value);

    /**
     * defaults to nil. pass a string or localized string key to show an alert
     */
    @Generated
    @Selector("setAlertBody:")
    public native void setAlertBody(@Nullable String value);

    /**
     * used as the launch image (UILaunchImageFile) when launch button is tapped
     */
    @Generated
    @Selector("setAlertLaunchImage:")
    public native void setAlertLaunchImage(@Nullable String value);

    /**
     * defaults to nil. pass a string or localized string key
     * 
     * API-Since: 8.2
     */
    @Generated
    @Selector("setAlertTitle:")
    public native void setAlertTitle(@Nullable String value);

    /**
     * 0 means no change. defaults to 0
     */
    @Generated
    @Selector("setApplicationIconBadgeNumber:")
    public native void setApplicationIconBadgeNumber(@NInt long value);

    /**
     * category identifier of the local notification, as set on a UIUserNotificationCategory and passed to
     * +[UIUserNotificationSettings settingsForTypes:categories:]
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setCategory:")
    public native void setCategory(@Nullable String value);

    /**
     * timer-based scheduling
     */
    @Generated
    @Selector("setFireDate:")
    public native void setFireDate(@Nullable NSDate value);

    /**
     * defaults to YES. pass NO to hide launching button/slider
     */
    @Generated
    @Selector("setHasAction:")
    public native void setHasAction(boolean value);

    /**
     * set a CLRegion object to trigger the notification when the user enters or leaves a geographic region, depending
     * upon the properties set on the CLRegion object itself. registering multiple UILocalNotifications with different
     * regions containing the same identifier will result in undefined behavior. the number of region-triggered
     * UILocalNotifications that may be registered at any one time is internally limited. in order to use
     * region-triggered notifications, applications must have "when-in-use" authorization through CoreLocation. see the
     * CoreLocation documentation for more information.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setRegion:")
    public native void setRegion(@Nullable CLRegion value);

    /**
     * when YES, the notification will only fire one time. when NO, the notification will fire every time the region is
     * entered or exited (depending upon the CLRegion object's configuration). default is YES.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setRegionTriggersOnce:")
    public native void setRegionTriggersOnce(boolean value);

    @Generated
    @Selector("setRepeatCalendar:")
    public native void setRepeatCalendar(@Nullable NSCalendar value);

    /**
     * 0 means don't repeat
     */
    @Generated
    @Selector("setRepeatInterval:")
    public native void setRepeatInterval(@NUInt long value);

    /**
     * name of resource in app's bundle to play or UILocalNotificationDefaultSoundName
     */
    @Generated
    @Selector("setSoundName:")
    public native void setSoundName(@Nullable String value);

    /**
     * the time zone to interpret fireDate in. pass nil if fireDate is an absolute GMT time (e.g. for an egg timer).
     * pass a time zone to interpret fireDate as a wall time to be adjusted automatically upon time zone changes (e.g.
     * for an alarm clock).
     */
    @Generated
    @Selector("setTimeZone:")
    public native void setTimeZone(@Nullable NSTimeZone value);

    /**
     * throws if contains non-property list types
     */
    @Generated
    @Selector("setUserInfo:")
    public native void setUserInfo(@Nullable NSDictionary<?, ?> value);

    /**
     * name of resource in app's bundle to play or UILocalNotificationDefaultSoundName
     */
    @Nullable
    @Generated
    @Selector("soundName")
    public native String soundName();

    /**
     * the time zone to interpret fireDate in. pass nil if fireDate is an absolute GMT time (e.g. for an egg timer).
     * pass a time zone to interpret fireDate as a wall time to be adjusted automatically upon time zone changes (e.g.
     * for an alarm clock).
     */
    @Nullable
    @Generated
    @Selector("timeZone")
    public native NSTimeZone timeZone();

    /**
     * throws if contains non-property list types
     */
    @Nullable
    @Generated
    @Selector("userInfo")
    public native NSDictionary<?, ?> userInfo();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
