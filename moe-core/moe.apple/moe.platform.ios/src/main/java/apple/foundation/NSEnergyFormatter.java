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

package apple.foundation;

import apple.NSObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 8.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSEnergyFormatter extends NSFormatter {
    static {
        NatJ.register();
    }

    @Generated
    protected NSEnergyFormatter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSEnergyFormatter alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSEnergyFormatter allocWithZone(VoidPtr zone);

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
    public static native NSEnergyFormatter new_objc();

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
     * No parsing is supported. This method will return NO.
     */
    @Generated
    @Selector("getObjectValue:forString:errorDescription:")
    public native boolean getObjectValueForStringErrorDescription(
            @Nullable @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> obj, @NotNull String string,
            @Nullable @ReferenceInfo(type = NSString.class) Ptr<NSString> error);

    @Generated
    @Selector("init")
    public native NSEnergyFormatter init();

    @Generated
    @Selector("initWithCoder:")
    public native NSEnergyFormatter initWithCoder(@NotNull NSCoder coder);

    /**
     * default is NO; if it is set to YES, NSEnergyFormatterUnitKilocalorie may be “C” instead of “kcal"
     */
    @Generated
    @Selector("isForFoodEnergyUse")
    public native boolean isForFoodEnergyUse();

    /**
     * default is NO; if it is set to YES, NSEnergyFormatterUnitKilocalorie may be “C” instead of “kcal"
     */
    @Generated
    @Selector("setForFoodEnergyUse:")
    public native void setForFoodEnergyUse(boolean value);

    /**
     * default is NSNumberFormatter with NSNumberFormatterDecimalStyle
     */
    @Generated
    @Selector("numberFormatter")
    public native NSNumberFormatter numberFormatter();

    /**
     * default is NSNumberFormatter with NSNumberFormatterDecimalStyle
     */
    @Generated
    @Selector("setNumberFormatter:")
    public native void setNumberFormatter(NSNumberFormatter value);

    /**
     * default is NSFormattingUnitStyleMedium
     */
    @Generated
    @Selector("setUnitStyle:")
    public native void setUnitStyle(@NInt long value);

    /**
     * Format a number in joules to a localized string with the locale-appropriate unit and an appropriate scale (e.g.
     * 10.3J = 2.46cal in the US locale).
     */
    @NotNull
    @Generated
    @Selector("stringFromJoules:")
    public native String stringFromJoules(double numberInJoules);

    /**
     * Format a combination of a number and an unit to a localized string.
     */
    @NotNull
    @Generated
    @Selector("stringFromValue:unit:")
    public native String stringFromValueUnit(double value, @NInt long unit);

    /**
     * Return the locale-appropriate unit, the same unit used by -stringFromJoules:.
     */
    @NotNull
    @Generated
    @Selector("unitStringFromJoules:usedUnit:")
    public native String unitStringFromJoulesUsedUnit(double numberInJoules, @Nullable NIntPtr unitp);

    /**
     * Return a localized string of the given unit, and if the unit is singular or plural is based on the given number.
     */
    @NotNull
    @Generated
    @Selector("unitStringFromValue:unit:")
    public native String unitStringFromValueUnit(double value, @NInt long unit);

    /**
     * default is NSFormattingUnitStyleMedium
     */
    @Generated
    @Selector("unitStyle")
    @NInt
    public native long unitStyle();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
