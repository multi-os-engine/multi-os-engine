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
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 8.0
 * Deprecated-Since: 10.0
 * Deprecated-Message: Use UserNotifications Framework's UNNotificationAction
 */
@Deprecated
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIMutableUserNotificationAction extends UIUserNotificationAction {
    static {
        NatJ.register();
    }

    @Generated
    protected UIMutableUserNotificationAction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIMutableUserNotificationAction alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIMutableUserNotificationAction allocWithZone(VoidPtr zone);

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
    public static native UIMutableUserNotificationAction new_objc();

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
     * How the application should be activated in response to the action.
     */
    @Generated
    @Selector("activationMode")
    @NUInt
    public native long activationMode();

    /**
     * The behavior of this action when the user activates it.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("behavior")
    @NUInt
    public native long behavior();

    /**
     * The unique identifier for this action.
     */
    @Nullable
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native UIMutableUserNotificationAction init();

    @Generated
    @Selector("initWithCoder:")
    public native UIMutableUserNotificationAction initWithCoder(@NotNull NSCoder coder);

    /**
     * Whether this action is secure and should require unlocking before being performed. If the activation mode is
     * UIUserNotificationActivationModeForeground, then the action is considered secure and this property is ignored.
     */
    @Generated
    @Selector("isAuthenticationRequired")
    public native boolean isAuthenticationRequired();

    /**
     * Whether this action is secure and should require unlocking before being performed. If the activation mode is
     * UIUserNotificationActivationModeForeground, then the action is considered secure and this property is ignored.
     */
    @Generated
    @Selector("setAuthenticationRequired:")
    public native void setAuthenticationRequired(boolean value);

    /**
     * Whether this action should be indicated as destructive when displayed.
     */
    @Generated
    @Selector("isDestructive")
    public native boolean isDestructive();

    /**
     * Whether this action should be indicated as destructive when displayed.
     */
    @Generated
    @Selector("setDestructive:")
    public native void setDestructive(boolean value);

    /**
     * Parameters that can be used by some types of actions.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("parameters")
    public native NSDictionary<?, ?> parameters();

    /**
     * How the application should be activated in response to the action.
     */
    @Generated
    @Selector("setActivationMode:")
    public native void setActivationMode(@NUInt long value);

    /**
     * The behavior of this action when the user activates it.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setBehavior:")
    public native void setBehavior(@NUInt long value);

    /**
     * The unique identifier for this action.
     */
    @Generated
    @Selector("setIdentifier:")
    public native void setIdentifier(@Nullable String value);

    /**
     * Parameters that can be used by some types of actions.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setParameters:")
    public native void setParameters(@NotNull NSDictionary<?, ?> value);

    /**
     * The localized title to display for this action.
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(@Nullable String value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * The localized title to display for this action.
     */
    @Nullable
    @Generated
    @Selector("title")
    public native String title();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
