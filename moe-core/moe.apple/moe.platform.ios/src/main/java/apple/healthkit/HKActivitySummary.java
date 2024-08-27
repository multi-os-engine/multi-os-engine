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
import apple.foundation.NSCalendar;
import apple.foundation.NSCoder;
import apple.foundation.NSDateComponents;
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
 * HKActivitySummary
 * 
 * An object that represents a summary of a user's activity for a given day.
 * 
 * API-Since: 9.3
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKActivitySummary extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected HKActivitySummary(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKActivitySummary alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native HKActivitySummary allocWithZone(VoidPtr zone);

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
    public static native HKActivitySummary new_objc();

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
     * [@property] activeEnergyBurned
     * 
     * The amount of active energy that the user burned.
     * 
     * This quantity is compatible with energy units.
     */
    @NotNull
    @Generated
    @Selector("activeEnergyBurned")
    public native HKQuantity activeEnergyBurned();

    /**
     * [@property] activeEnergyBurnedGoal
     * 
     * The user's active energy goal for the day.
     * 
     * This quantity is compatible with energy units.
     */
    @NotNull
    @Generated
    @Selector("activeEnergyBurnedGoal")
    public native HKQuantity activeEnergyBurnedGoal();

    /**
     * [@property] appleExerciseTime
     * 
     * The amount of exercise time that the user performed.
     * 
     * This quantity is compatible with time units. The measurement criteria of
     * exercise time is defined by Apple.
     */
    @NotNull
    @Generated
    @Selector("appleExerciseTime")
    public native HKQuantity appleExerciseTime();

    /**
     * [@property] appleExerciseTimeGoal
     * 
     * The user's exercise time goal for the day.
     * 
     * This quantity is compatible with time units.
     * 
     * API-Since: 9.3
     * Deprecated-Since: 100000.0
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("appleExerciseTimeGoal")
    public native HKQuantity appleExerciseTimeGoal();

    /**
     * [@property] appleStandHours
     * 
     * The number of stand hours that the user earned.
     * 
     * This quantity is compatible with the count unit. The measurement criteria of
     * stand hours is defined by Apple.
     */
    @NotNull
    @Generated
    @Selector("appleStandHours")
    public native HKQuantity appleStandHours();

    /**
     * [@property] appleStandHoursGoal
     * 
     * The user's active stand hours goal for the day.
     * 
     * This quantity is compatible with the count unit.
     * 
     * API-Since: 9.3
     * Deprecated-Since: 100000.0
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("appleStandHoursGoal")
    public native HKQuantity appleStandHoursGoal();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * dateComponentsForCalendar:
     * 
     * The date components representing the day for this particular HKActivitySummary.
     * 
     * These date components will contain era, year, month, and day components in the provided calendar.
     */
    @NotNull
    @Generated
    @Selector("dateComponentsForCalendar:")
    public native NSDateComponents dateComponentsForCalendar(@NotNull NSCalendar calendar);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native HKActivitySummary init();

    @Generated
    @Selector("initWithCoder:")
    public native HKActivitySummary initWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] activeEnergyBurned
     * 
     * The amount of active energy that the user burned.
     * 
     * This quantity is compatible with energy units.
     */
    @Generated
    @Selector("setActiveEnergyBurned:")
    public native void setActiveEnergyBurned(@NotNull HKQuantity value);

    /**
     * [@property] activeEnergyBurnedGoal
     * 
     * The user's active energy goal for the day.
     * 
     * This quantity is compatible with energy units.
     */
    @Generated
    @Selector("setActiveEnergyBurnedGoal:")
    public native void setActiveEnergyBurnedGoal(@NotNull HKQuantity value);

    /**
     * [@property] appleExerciseTime
     * 
     * The amount of exercise time that the user performed.
     * 
     * This quantity is compatible with time units. The measurement criteria of
     * exercise time is defined by Apple.
     */
    @Generated
    @Selector("setAppleExerciseTime:")
    public native void setAppleExerciseTime(@NotNull HKQuantity value);

    /**
     * [@property] appleExerciseTimeGoal
     * 
     * The user's exercise time goal for the day.
     * 
     * This quantity is compatible with time units.
     * 
     * API-Since: 9.3
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("setAppleExerciseTimeGoal:")
    public native void setAppleExerciseTimeGoal(@NotNull HKQuantity value);

    /**
     * [@property] appleStandHours
     * 
     * The number of stand hours that the user earned.
     * 
     * This quantity is compatible with the count unit. The measurement criteria of
     * stand hours is defined by Apple.
     */
    @Generated
    @Selector("setAppleStandHours:")
    public native void setAppleStandHours(@NotNull HKQuantity value);

    /**
     * [@property] appleStandHoursGoal
     * 
     * The user's active stand hours goal for the day.
     * 
     * This quantity is compatible with the count unit.
     * 
     * API-Since: 9.3
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("setAppleStandHoursGoal:")
    public native void setAppleStandHoursGoal(@NotNull HKQuantity value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] activityMoveMode
     * 
     * The move mode of this activity summary
     * 
     * The move mode of an activity summary determines if activeEnergyBurned or appleMoveTime are used for the move
     * ring.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("activityMoveMode")
    @NInt
    public native long activityMoveMode();

    /**
     * [@property] appleMoveTime
     * 
     * The amount of move time that the user performed.
     * 
     * This quantity is compatible with time units. The measurement criteria of
     * move time time is defined by Apple.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("appleMoveTime")
    public native HKQuantity appleMoveTime();

    /**
     * [@property] appleMoveTimeGoal
     * 
     * The user's move time goal for the day.
     * 
     * This quantity is compatible with time units.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("appleMoveTimeGoal")
    public native HKQuantity appleMoveTimeGoal();

    /**
     * [@property] activityMoveMode
     * 
     * The move mode of this activity summary
     * 
     * The move mode of an activity summary determines if activeEnergyBurned or appleMoveTime are used for the move
     * ring.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setActivityMoveMode:")
    public native void setActivityMoveMode(@NInt long value);

    /**
     * [@property] appleMoveTime
     * 
     * The amount of move time that the user performed.
     * 
     * This quantity is compatible with time units. The measurement criteria of
     * move time time is defined by Apple.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAppleMoveTime:")
    public native void setAppleMoveTime(@NotNull HKQuantity value);

    /**
     * [@property] appleMoveTimeGoal
     * 
     * The user's move time goal for the day.
     * 
     * This quantity is compatible with time units.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAppleMoveTimeGoal:")
    public native void setAppleMoveTimeGoal(@NotNull HKQuantity value);

    /**
     * [@property] exerciseTimeGoal
     * 
     * The user's exercise time goal for the day.
     * 
     * This quantity is compatible with time units.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("exerciseTimeGoal")
    public native HKQuantity exerciseTimeGoal();

    /**
     * [@property] exerciseTimeGoal
     * 
     * The user's exercise time goal for the day.
     * 
     * This quantity is compatible with time units.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setExerciseTimeGoal:")
    public native void setExerciseTimeGoal(@Nullable HKQuantity value);

    /**
     * [@property] standHoursGoal
     * 
     * The user's active stand hours goal for the day.
     * 
     * This quantity is compatible with the count unit.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setStandHoursGoal:")
    public native void setStandHoursGoal(@Nullable HKQuantity value);

    /**
     * [@property] standHoursGoal
     * 
     * The user's active stand hours goal for the day.
     * 
     * This quantity is compatible with the count unit.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("standHoursGoal")
    public native HKQuantity standHoursGoal();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
