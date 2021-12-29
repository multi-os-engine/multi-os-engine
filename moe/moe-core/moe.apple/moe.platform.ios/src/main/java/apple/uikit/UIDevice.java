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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

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
     */
    @Generated
    @Selector("batteryLevel")
    public native float batteryLevel();

    /**
     * UIDeviceBatteryStateUnknown if monitoring disabled
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
     */
    @Generated
    @Selector("identifierForVendor")
    public native NSUUID identifierForVendor();

    @Generated
    @Selector("init")
    public native UIDevice init();

    /**
     * default is NO
     */
    @Generated
    @Selector("isBatteryMonitoringEnabled")
    public native boolean isBatteryMonitoringEnabled();

    /**
     * default is NO
     */
    @Generated
    @Selector("setBatteryMonitoringEnabled:")
    public native void setBatteryMonitoringEnabled(boolean value);

    @Generated
    @Selector("isGeneratingDeviceOrientationNotifications")
    public native boolean isGeneratingDeviceOrientationNotifications();

    @Generated
    @Selector("isMultitaskingSupported")
    public native boolean isMultitaskingSupported();

    /**
     * default is NO
     */
    @Generated
    @Selector("isProximityMonitoringEnabled")
    public native boolean isProximityMonitoringEnabled();

    /**
     * default is NO
     */
    @Generated
    @Selector("setProximityMonitoringEnabled:")
    public native void setProximityMonitoringEnabled(boolean value);

    /**
     * localized version of model
     */
    @Generated
    @Selector("localizedModel")
    public native String localizedModel();

    /**
     * e.g. @"iPhone", @"iPod touch"
     */
    @Generated
    @Selector("model")
    public native String model();

    /**
     * e.g. "My iPhone"
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * return current device orientation.  this will return UIDeviceOrientationUnknown unless device orientation notifications are being generated.
     */
    @Generated
    @Selector("orientation")
    @NInt
    public native long orientation();

    /**
     * Plays a click only if an enabling input view is on-screen and user has enabled input clicks.
     */
    @Generated
    @Selector("playInputClick")
    public native void playInputClick();

    /**
     * always returns NO if no proximity detector
     */
    @Generated
    @Selector("proximityState")
    public native boolean proximityState();

    /**
     * e.g. @"iOS"
     */
    @Generated
    @Selector("systemName")
    public native String systemName();

    /**
     * e.g. @"4.0"
     */
    @Generated
    @Selector("systemVersion")
    public native String systemVersion();

    @Generated
    @Selector("userInterfaceIdiom")
    @NInt
    public native long userInterfaceIdiom();
}
