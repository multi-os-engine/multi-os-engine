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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUUID;
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
 * API-Since: 2.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIDevice extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIDevice(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIDevice alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIDevice allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Selector("currentDevice")
    public static native UIDevice currentDevice();

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
    public static native UIDevice new_objc();

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
     * 0 .. 1.0. -1.0 if UIDeviceBatteryStateUnknown
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("batteryLevel")
    public native float batteryLevel();

    /**
     * UIDeviceBatteryStateUnknown if monitoring disabled
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("batteryState")
    @NInt
    public native long batteryState();

    /**
     * nestable
     */
    @Generated
    @Selector("beginGeneratingDeviceOrientationNotifications")
    public native void beginGeneratingDeviceOrientationNotifications();

    @Generated
    @Selector("endGeneratingDeviceOrientationNotifications")
    public native void endGeneratingDeviceOrientationNotifications();

    /**
     * a UUID that may be used to uniquely identify the device, same across apps from a single vendor.
     * 
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("identifierForVendor")
    public native NSUUID identifierForVendor();

    @Generated
    @Selector("init")
    public native UIDevice init();

    /**
     * default is NO
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("isBatteryMonitoringEnabled")
    public native boolean isBatteryMonitoringEnabled();

    /**
     * default is NO
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("setBatteryMonitoringEnabled:")
    public native void setBatteryMonitoringEnabled(boolean value);

    @Generated
    @Selector("isGeneratingDeviceOrientationNotifications")
    public native boolean isGeneratingDeviceOrientationNotifications();

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("isMultitaskingSupported")
    public native boolean isMultitaskingSupported();

    /**
     * default is NO
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("isProximityMonitoringEnabled")
    public native boolean isProximityMonitoringEnabled();

    /**
     * default is NO
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("setProximityMonitoringEnabled:")
    public native void setProximityMonitoringEnabled(boolean value);

    /**
     * localized version of model
     */
    @NotNull
    @Generated
    @Selector("localizedModel")
    public native String localizedModel();

    /**
     * e.g. @"iPhone", @"iPod touch"
     */
    @NotNull
    @Generated
    @Selector("model")
    public native String model();

    /**
     * Synonym for model. Prior to iOS 16, user-assigned device name (e.g. @"My iPhone").
     */
    @NotNull
    @Generated
    @Selector("name")
    public native String name();

    /**
     * return current device orientation. this will return UIDeviceOrientationUnknown unless device orientation
     * notifications are being generated.
     */
    @Generated
    @Selector("orientation")
    @NInt
    public native long orientation();

    /**
     * Plays a click only if an enabling input view is on-screen and user has enabled input clicks.
     * 
     * API-Since: 4.2
     */
    @Generated
    @Selector("playInputClick")
    public native void playInputClick();

    /**
     * always returns NO if no proximity detector
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("proximityState")
    public native boolean proximityState();

    /**
     * e.g. @"iOS"
     */
    @NotNull
    @Generated
    @Selector("systemName")
    public native String systemName();

    /**
     * e.g. @"4.0"
     */
    @NotNull
    @Generated
    @Selector("systemVersion")
    public native String systemVersion();

    /**
     * API-Since: 3.2
     */
    @Generated
    @Selector("userInterfaceIdiom")
    @NInt
    public native long userInterfaceIdiom();
}
