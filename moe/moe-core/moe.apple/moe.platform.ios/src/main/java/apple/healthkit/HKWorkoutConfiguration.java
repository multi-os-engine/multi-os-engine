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

package apple.healthkit;

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
 * HKWorkoutConfiguration
 * 
 * An HKWorkoutConfiguration is an object that can be used to describe the workout activity.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKWorkoutConfiguration extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected HKWorkoutConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKWorkoutConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native HKWorkoutConfiguration allocWithZone(VoidPtr zone);

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
    public static native HKWorkoutConfiguration new_objc();

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
     * [@property] activityType
     * 
     * Indicates the type of workout for the configuration.
     */
    @Generated
    @Selector("activityType")
    @NUInt
    public native long activityType();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native HKWorkoutConfiguration init();

    @Generated
    @Selector("initWithCoder:")
    public native HKWorkoutConfiguration initWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] lapLength
     * 
     * Indicates the length of the pool, when the workout location type is pool.
     * 
     * This metric represents the length of the pool where the workout takes place. It should be a quantity with
     * a unit representing length.
     */
    @Nullable
    @Generated
    @Selector("lapLength")
    public native HKQuantity lapLength();

    /**
     * [@property] locationType
     * 
     * Indicates the type of location (indoors vs. outdoors) for the configuration.
     */
    @Generated
    @Selector("locationType")
    @NInt
    public native long locationType();

    /**
     * [@property] activityType
     * 
     * Indicates the type of workout for the configuration.
     */
    @Generated
    @Selector("setActivityType:")
    public native void setActivityType(@NUInt long value);

    /**
     * [@property] lapLength
     * 
     * Indicates the length of the pool, when the workout location type is pool.
     * 
     * This metric represents the length of the pool where the workout takes place. It should be a quantity with
     * a unit representing length.
     */
    @Generated
    @Selector("setLapLength:")
    public native void setLapLength(@Nullable HKQuantity value);

    /**
     * [@property] locationType
     * 
     * Indicates the type of location (indoors vs. outdoors) for the configuration.
     */
    @Generated
    @Selector("setLocationType:")
    public native void setLocationType(@NInt long value);

    /**
     * [@property] swimmingLocationType
     * 
     * Indicates the type of swimming location (pool vs. open water) where the workout will take place.
     */
    @Generated
    @Selector("setSwimmingLocationType:")
    public native void setSwimmingLocationType(@NInt long value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] swimmingLocationType
     * 
     * Indicates the type of swimming location (pool vs. open water) where the workout will take place.
     */
    @Generated
    @Selector("swimmingLocationType")
    @NInt
    public native long swimmingLocationType();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
