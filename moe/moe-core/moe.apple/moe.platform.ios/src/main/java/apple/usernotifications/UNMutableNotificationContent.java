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
import apple.foundation.NSCoder;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UserNotifications")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UNMutableNotificationContent extends UNNotificationContent {
    static {
        NatJ.register();
    }

    @Generated
    protected UNMutableNotificationContent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UNMutableNotificationContent alloc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Optional array of attachments.
     */
    @Generated
    @Selector("attachments")
    public native NSArray<? extends UNNotificationAttachment> attachments();

    /**
     * The application badge number. nil means no change. 0 to hide.
     */
    @Generated
    @Selector("badge")
    public native NSNumber badge();

    /**
     * The body of the notification. Use -[NSString localizedUserNotificationStringForKey:arguments:] to provide a string that will be localized at the time that the notification is presented.
     */
    @Generated
    @Selector("body")
    public native String body();

    /**
     * The identifier for a registered UNNotificationCategory that will be used to determine the appropriate actions to display for the notification.
     */
    @Generated
    @Selector("categoryIdentifier")
    public native String categoryIdentifier();

    @Generated
    @Selector("init")
    public native UNMutableNotificationContent init();

    @Generated
    @Selector("initWithCoder:")
    public native UNMutableNotificationContent initWithCoder(NSCoder coder);

    /**
     * The launch image that will be used when the app is opened from the notification.
     */
    @Generated
    @Selector("launchImageName")
    public native String launchImageName();

    /**
     * Optional array of attachments.
     */
    @Generated
    @Selector("setAttachments:")
    public native void setAttachments(NSArray<? extends UNNotificationAttachment> value);

    /**
     * The application badge number. nil means no change. 0 to hide.
     */
    @Generated
    @Selector("setBadge:")
    public native void setBadge(NSNumber value);

    /**
     * The body of the notification. Use -[NSString localizedUserNotificationStringForKey:arguments:] to provide a string that will be localized at the time that the notification is presented.
     */
    @Generated
    @Selector("setBody:")
    public native void setBody(String value);

    /**
     * The identifier for a registered UNNotificationCategory that will be used to determine the appropriate actions to display for the notification.
     */
    @Generated
    @Selector("setCategoryIdentifier:")
    public native void setCategoryIdentifier(String value);

    /**
     * The launch image that will be used when the app is opened from the notification.
     */
    @Generated
    @Selector("setLaunchImageName:")
    public native void setLaunchImageName(String value);

    /**
     * The sound that will be played for the notification.
     */
    @Generated
    @Selector("setSound:")
    public native void setSound(UNNotificationSound value);

    /**
     * The subtitle of the notification. Use -[NSString localizedUserNotificationStringForKey:arguments:] to provide a string that will be localized at the time that the notification is presented.
     */
    @Generated
    @Selector("setSubtitle:")
    public native void setSubtitle(String value);

    /**
     * The unique identifier for the thread or conversation related to this notification request. It will be used to visually group notifications together.
     */
    @Generated
    @Selector("setThreadIdentifier:")
    public native void setThreadIdentifier(String value);

    /**
     * The title of the notification. Use -[NSString localizedUserNotificationStringForKey:arguments:] to provide a string that will be localized at the time that the notification is presented.
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    /**
     * Apps can set the userInfo for locally scheduled notification requests. The contents of the push payload will be set as the userInfo for remote notifications.
     */
    @Generated
    @Selector("setUserInfo:")
    public native void setUserInfo(NSDictionary<?, ?> value);

    /**
     * The sound that will be played for the notification.
     */
    @Generated
    @Selector("sound")
    public native UNNotificationSound sound();

    /**
     * The subtitle of the notification. Use -[NSString localizedUserNotificationStringForKey:arguments:] to provide a string that will be localized at the time that the notification is presented.
     */
    @Generated
    @Selector("subtitle")
    public native String subtitle();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * The unique identifier for the thread or conversation related to this notification request. It will be used to visually group notifications together.
     */
    @Generated
    @Selector("threadIdentifier")
    public native String threadIdentifier();

    /**
     * The title of the notification. Use -[NSString localizedUserNotificationStringForKey:arguments:] to provide a string that will be localized at the time that the notification is presented.
     */
    @Generated
    @Selector("title")
    public native String title();

    /**
     * Apps can set the userInfo for locally scheduled notification requests. The contents of the push payload will be set as the userInfo for remote notifications.
     */
    @Generated
    @Selector("userInfo")
    public native NSDictionary<?, ?> userInfo();

    /**
     * The argument to be inserted in the summary for this notification.
     */
    @Generated
    @Selector("setSummaryArgument:")
    public native void setSummaryArgument(String value);

    /**
     * A number that indicates how many items in the summary are represented in the summary.
     * For example if a podcast app sends one notification for 3 new episodes in a show,
     * the argument should be the name of the show and the count should be 3.
     * Default is 1 and cannot be 0.
     */
    @Generated
    @Selector("setSummaryArgumentCount:")
    public native void setSummaryArgumentCount(@NUInt long value);

    /**
     * default nil
     */
    @Generated
    @Selector("setTargetContentIdentifier:")
    public native void setTargetContentIdentifier(String value);

    /**
     * The argument to be inserted in the summary for this notification.
     */
    @Generated
    @Selector("summaryArgument")
    public native String summaryArgument();

    /**
     * A number that indicates how many items in the summary are represented in the summary.
     * For example if a podcast app sends one notification for 3 new episodes in a show,
     * the argument should be the name of the show and the count should be 3.
     * Default is 1 and cannot be 0.
     */
    @Generated
    @Selector("summaryArgumentCount")
    @NUInt
    public native long summaryArgumentCount();

    /**
     * default nil
     */
    @Generated
    @Selector("targetContentIdentifier")
    public native String targetContentIdentifier();
}
