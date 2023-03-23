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

package apple.intents;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 10.0
 * Deprecated-Since: 15.0
 * Deprecated-Message: INSetSeatSettingsInCarIntent is deprecated. There is no replacement.
 */
@Deprecated
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INSetSeatSettingsInCarIntent extends INIntent {
    static {
        NatJ.register();
    }

    @Generated
    protected INSetSeatSettingsInCarIntent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INSetSeatSettingsInCarIntent alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INSetSeatSettingsInCarIntent allocWithZone(VoidPtr zone);

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
    public static native INSetSeatSettingsInCarIntent new_objc();

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

    @Generated
    @Selector("enableCooling")
    public native NSNumber enableCooling();

    @Generated
    @Selector("enableHeating")
    public native NSNumber enableHeating();

    @Generated
    @Selector("enableMassage")
    public native NSNumber enableMassage();

    @Generated
    @Selector("init")
    public native INSetSeatSettingsInCarIntent init();

    @Generated
    @Selector("initWithCoder:")
    public native INSetSeatSettingsInCarIntent initWithCoder(NSCoder coder);

    /**
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     */
    @Deprecated
    @Generated
    @Selector("initWithEnableHeating:enableCooling:enableMassage:seat:level:relativeLevelSetting:")
    public native INSetSeatSettingsInCarIntent initWithEnableHeatingEnableCoolingEnableMassageSeatLevelRelativeLevelSetting(
            NSNumber enableHeating, NSNumber enableCooling, NSNumber enableMassage, @NInt long seat, NSNumber level,
            @NInt long relativeLevelSetting);

    @Generated
    @Selector("level")
    public native NSNumber level();

    @Generated
    @Selector("relativeLevelSetting")
    @NInt
    public native long relativeLevelSetting();

    @Generated
    @Selector("seat")
    @NInt
    public native long seat();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("carName")
    public native INSpeakableString carName();

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("initWithEnableHeating:enableCooling:enableMassage:seat:level:relativeLevelSetting:carName:")
    public native INSetSeatSettingsInCarIntent initWithEnableHeatingEnableCoolingEnableMassageSeatLevelRelativeLevelSettingCarName(
            NSNumber enableHeating, NSNumber enableCooling, NSNumber enableMassage, @NInt long seat, NSNumber level,
            @NInt long relativeLevelSetting, INSpeakableString carName);
}
