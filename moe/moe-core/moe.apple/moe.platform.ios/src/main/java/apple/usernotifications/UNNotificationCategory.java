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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 10.0
 */
@Generated
@Library("UserNotifications")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UNNotificationCategory extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UNNotificationCategory(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UNNotificationCategory alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UNNotificationCategory allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("categoryWithIdentifier:actions:intentIdentifiers:options:")
    public static native UNNotificationCategory categoryWithIdentifierActionsIntentIdentifiersOptions(
            @NotNull String identifier, @NotNull NSArray<? extends UNNotificationAction> actions,
            @NotNull NSArray<String> intentIdentifiers, @NUInt long options);

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
    public static native UNNotificationCategory new_objc();

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
     * The UNNotificationActions in the order they will be displayed.
     */
    @NotNull
    @Generated
    @Selector("actions")
    public native NSArray<? extends UNNotificationAction> actions();

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
     * The unique identifier for this category. The UNNotificationCategory's actions will be displayed on notifications
     * when the UNNotificationCategory's identifier matches the UNNotificationRequest's categoryIdentifier.
     */
    @NotNull
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native UNNotificationCategory init();

    @Generated
    @Selector("initWithCoder:")
    public native UNNotificationCategory initWithCoder(@NotNull NSCoder coder);

    /**
     * The intents supported support for notifications of this category. See <Intents/INIntentIdentifiers.h> for
     * possible values.
     */
    @NotNull
    @Generated
    @Selector("intentIdentifiers")
    public native NSArray<String> intentIdentifiers();

    @Generated
    @Selector("options")
    @NUInt
    public native long options();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("categoryWithIdentifier:actions:intentIdentifiers:hiddenPreviewsBodyPlaceholder:options:")
    public static native UNNotificationCategory categoryWithIdentifierActionsIntentIdentifiersHiddenPreviewsBodyPlaceholderOptions(
            @NotNull String identifier, @NotNull NSArray<? extends UNNotificationAction> actions,
            @NotNull NSArray<String> intentIdentifiers, @NotNull String hiddenPreviewsBodyPlaceholder,
            @NUInt long options);

    /**
     * The format string that will replace the notification body if previews are hidden.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("hiddenPreviewsBodyPlaceholder")
    public native String hiddenPreviewsBodyPlaceholder();

    /**
     * A format string for a summary description when notifications from this category are grouped together.
     * It should contain descriptive text and format arguments that will be replaced with the information
     * from the notifications that have been grouped together. The arguments are replaced with the number
     * of notifications and the list created by joining the argument in each grouped notification.
     * For example: "%u new messages from %@".
     * The arguments list is optional, "%u new messages" is also accepted.
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @Selector("categorySummaryFormat")
    public native String categorySummaryFormat();

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("categoryWithIdentifier:actions:intentIdentifiers:hiddenPreviewsBodyPlaceholder:categorySummaryFormat:options:")
    public static native UNNotificationCategory categoryWithIdentifierActionsIntentIdentifiersHiddenPreviewsBodyPlaceholderCategorySummaryFormatOptions(
            @NotNull String identifier, @NotNull NSArray<? extends UNNotificationAction> actions,
            @NotNull NSArray<String> intentIdentifiers, @Nullable String hiddenPreviewsBodyPlaceholder,
            @Nullable String categorySummaryFormat, @NUInt long options);
}
