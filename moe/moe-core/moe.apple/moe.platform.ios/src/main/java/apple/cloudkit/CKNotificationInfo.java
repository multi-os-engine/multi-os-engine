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
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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

/**
 * CKNotificationInfo
 * 
 * The payload of a push notification delivered in the UIApplication @c application:didReceiveRemoteNotification:
 * delegate method contains information about the firing subscription.
 * 
 * Use @code +[CKNotification notificationFromRemoteNotificationDictionary:] @endcode to parse that payload.
 * On tvOS, alerts, badges, sounds, and categories are not handled in push notifications. However, CKSubscriptions
 * remain available to help you avoid polling the server.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKNotificationInfo extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected CKNotificationInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKNotificationInfo alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CKNotificationInfo allocWithZone(VoidPtr zone);

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
    public static native CKNotificationInfo new_objc();

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
     * A key for a localized string to be used as the alert action in a modal style notification.
     */
    @Generated
    @Selector("alertActionLocalizationKey")
    public native String alertActionLocalizationKey();

    /**
     * Optional alert string to display in a push notification.
     */
    @Generated
    @Selector("alertBody")
    public native String alertBody();

    /**
     * The name of an image in your app bundle to be used as the launch image when launching in response to the
     * notification.
     */
    @Generated
    @Selector("alertLaunchImage")
    public native String alertLaunchImage();

    /**
     * A list of field names to take from the matching record that is used as substitution variables in a formatted
     * alert string.
     */
    @Generated
    @Selector("alertLocalizationArgs")
    public native NSArray<String> alertLocalizationArgs();

    /**
     * Instead of a raw alert string, you may optionally specify a key for a localized string in your app's
     * Localizable.strings file.
     */
    @Generated
    @Selector("alertLocalizationKey")
    public native String alertLocalizationKey();

    /**
     * Optional property for the category to be sent with the push when this subscription fires.
     * 
     * Categories allow you to present custom actions to the user on your push notifications.
     * 
     * @see UIMutableUserNotificationCategory
     * 
     *      API-Since: 9.0
     */
    @Generated
    @Selector("category")
    public native String category();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * A list of keys from the matching record to include in the notification payload.
     * 
     * Only some keys are allowed. The value types associated with those keys on the server must be one of these
     * classes:
     * - CKReference
     * - CLLocation
     * - NSDate
     * - NSNumber
     * - NSString
     */
    @Generated
    @Selector("desiredKeys")
    public native NSArray<String> desiredKeys();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native CKNotificationInfo init();

    @Generated
    @Selector("initWithCoder:")
    public native CKNotificationInfo initWithCoder(NSCoder coder);

    /**
     * A key for a localized string to be used as the alert action in a modal style notification.
     */
    @Generated
    @Selector("setAlertActionLocalizationKey:")
    public native void setAlertActionLocalizationKey(String value);

    /**
     * Optional alert string to display in a push notification.
     */
    @Generated
    @Selector("setAlertBody:")
    public native void setAlertBody(String value);

    /**
     * The name of an image in your app bundle to be used as the launch image when launching in response to the
     * notification.
     */
    @Generated
    @Selector("setAlertLaunchImage:")
    public native void setAlertLaunchImage(String value);

    /**
     * A list of field names to take from the matching record that is used as substitution variables in a formatted
     * alert string.
     */
    @Generated
    @Selector("setAlertLocalizationArgs:")
    public native void setAlertLocalizationArgs(NSArray<String> value);

    /**
     * Instead of a raw alert string, you may optionally specify a key for a localized string in your app's
     * Localizable.strings file.
     */
    @Generated
    @Selector("setAlertLocalizationKey:")
    public native void setAlertLocalizationKey(String value);

    /**
     * Optional property for the category to be sent with the push when this subscription fires.
     * 
     * Categories allow you to present custom actions to the user on your push notifications.
     * 
     * @see UIMutableUserNotificationCategory
     * 
     *      API-Since: 9.0
     */
    @Generated
    @Selector("setCategory:")
    public native void setCategory(String value);

    /**
     * A list of keys from the matching record to include in the notification payload.
     * 
     * Only some keys are allowed. The value types associated with those keys on the server must be one of these
     * classes:
     * - CKReference
     * - CLLocation
     * - NSDate
     * - NSNumber
     * - NSString
     */
    @Generated
    @Selector("setDesiredKeys:")
    public native void setDesiredKeys(NSArray<String> value);

    /**
     * Indicates that the notification should increment the app's badge count. Default value is @c NO.
     */
    @Generated
    @Selector("setShouldBadge:")
    public native void setShouldBadge(boolean value);

    /**
     * Indicates that the notification should be sent with the "content-available" flag to allow for background
     * downloads in the application.
     * 
     * Default value is @c NO.
     */
    @Generated
    @Selector("setShouldSendContentAvailable:")
    public native void setShouldSendContentAvailable(boolean value);

    /**
     * The name of a sound file in your app bundle to play upon receiving the notification.
     */
    @Generated
    @Selector("setSoundName:")
    public native void setSoundName(String value);

    /**
     * Indicates that the notification should increment the app's badge count. Default value is @c NO.
     */
    @Generated
    @Selector("shouldBadge")
    public native boolean shouldBadge();

    /**
     * Indicates that the notification should be sent with the "content-available" flag to allow for background
     * downloads in the application.
     * 
     * Default value is @c NO.
     */
    @Generated
    @Selector("shouldSendContentAvailable")
    public native boolean shouldSendContentAvailable();

    /**
     * The name of a sound file in your app bundle to play upon receiving the notification.
     */
    @Generated
    @Selector("soundName")
    public native String soundName();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Optional property specifying a field name to take from the matching record whose value is used as the
     * apns-collapse-id header.
     * 
     * @see APNs Notification API documentation
     * 
     *      API-Since: 11.0
     */
    @Generated
    @Selector("collapseIDKey")
    public native String collapseIDKey();

    /**
     * Optional property specifying a field name to take from the matching record whose value is used as the
     * apns-collapse-id header.
     * 
     * @see APNs Notification API documentation
     * 
     *      API-Since: 11.0
     */
    @Generated
    @Selector("setCollapseIDKey:")
    public native void setCollapseIDKey(String value);

    /**
     * Indicates that the notification should be sent with the "mutable-content" flag to allow a Notification Service
     * app extension to modify or replace the push payload.
     * 
     * Default value is @c NO.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setShouldSendMutableContent:")
    public native void setShouldSendMutableContent(boolean value);

    /**
     * Optional subtitle of the alert to display in a push notification.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setSubtitle:")
    public native void setSubtitle(String value);

    /**
     * A list of field names to take from the matching record that is used as substitution variables in a formatted
     * subtitle string.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setSubtitleLocalizationArgs:")
    public native void setSubtitleLocalizationArgs(NSArray<String> value);

    /**
     * Instead of a raw subtitle string, you may optionally specify a key for a localized string in your app's
     * Localizable.strings file.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setSubtitleLocalizationKey:")
    public native void setSubtitleLocalizationKey(String value);

    /**
     * Optional title of the alert to display in a push notification.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    /**
     * A list of field names to take from the matching record that is used as substitution variables in a formatted
     * title string.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setTitleLocalizationArgs:")
    public native void setTitleLocalizationArgs(NSArray<String> value);

    /**
     * Instead of a raw title string, you may optionally specify a key for a localized string in your app's
     * Localizable.strings file.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setTitleLocalizationKey:")
    public native void setTitleLocalizationKey(String value);

    /**
     * Indicates that the notification should be sent with the "mutable-content" flag to allow a Notification Service
     * app extension to modify or replace the push payload.
     * 
     * Default value is @c NO.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("shouldSendMutableContent")
    public native boolean shouldSendMutableContent();

    /**
     * Optional subtitle of the alert to display in a push notification.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("subtitle")
    public native String subtitle();

    /**
     * A list of field names to take from the matching record that is used as substitution variables in a formatted
     * subtitle string.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("subtitleLocalizationArgs")
    public native NSArray<String> subtitleLocalizationArgs();

    /**
     * Instead of a raw subtitle string, you may optionally specify a key for a localized string in your app's
     * Localizable.strings file.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("subtitleLocalizationKey")
    public native String subtitleLocalizationKey();

    /**
     * Optional title of the alert to display in a push notification.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("title")
    public native String title();

    /**
     * A list of field names to take from the matching record that is used as substitution variables in a formatted
     * title string.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("titleLocalizationArgs")
    public native NSArray<String> titleLocalizationArgs();

    /**
     * Instead of a raw title string, you may optionally specify a key for a localized string in your app's
     * Localizable.strings file.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("titleLocalizationKey")
    public native String titleLocalizationKey();
}
