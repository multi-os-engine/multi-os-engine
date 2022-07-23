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

/**
 * HKActivitySummary
 * <p>
 * An object that represents a summary of a user's activity for a given day.
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
     * <p>
     * The amount of active energy that the user burned.
     * <p>
     * This quantity is compatible with energy units.
     */
    @Generated
    @Selector("activeEnergyBurned")
    public native HKQuantity activeEnergyBurned();

    /**
     * [@property] activeEnergyBurnedGoal
     * <p>
     * The user's active energy goal for the day.
     * <p>
     * This quantity is compatible with energy units.
     */
    @Generated
    @Selector("activeEnergyBurnedGoal")
    public native HKQuantity activeEnergyBurnedGoal();

    /**
     * [@property] appleExerciseTime
     * <p>
     * The amount of exercise time that the user performed.
     * <p>
     * This quantity is compatible with time units. The measurement criteria of
     * exercise time is defined by Apple.
     */
    @Generated
    @Selector("appleExerciseTime")
    public native HKQuantity appleExerciseTime();

    /**
     * [@property] appleExerciseTimeGoal
     * <p>
     * The user's exercise time goal for the day.
     * <p>
     * This quantity is compatible with time units.
     */
    @Generated
    @Selector("appleExerciseTimeGoal")
    public native HKQuantity appleExerciseTimeGoal();

    /**
     * [@property] appleStandHours
     * <p>
     * The number of stand hours that the user earned.
     * <p>
     * This quantity is compatible with the count unit. The measurement criteria of
     * stand hours is defined by Apple.
     */
    @Generated
    @Selector("appleStandHours")
    public native HKQuantity appleStandHours();

    /**
     * [@property] appleStandHoursGoal
     * <p>
     * The user's active stand hours goal for the day.
     * <p>
     * This quantity is compatible with the count unit.
     */
    @Generated
    @Selector("appleStandHoursGoal")
    public native HKQuantity appleStandHoursGoal();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * dateComponentsForCalendar:
     * <p>
     * The date components representing the day for this particular HKActivitySummary.
     * <p>
     * These date components will contain era, year, month, and day components in the provided calendar.
     */
    @Generated
    @Selector("dateComponentsForCalendar:")
    public native NSDateComponents dateComponentsForCalendar(NSCalendar calendar);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native HKActivitySummary init();

    @Generated
    @Selector("initWithCoder:")
    public native HKActivitySummary initWithCoder(NSCoder coder);

    /**
     * [@property] activeEnergyBurned
     * <p>
     * The amount of active energy that the user burned.
     * <p>
     * This quantity is compatible with energy units.
     */
    @Generated
    @Selector("setActiveEnergyBurned:")
    public native void setActiveEnergyBurned(HKQuantity value);

    /**
     * [@property] activeEnergyBurnedGoal
     * <p>
     * The user's active energy goal for the day.
     * <p>
     * This quantity is compatible with energy units.
     */
    @Generated
    @Selector("setActiveEnergyBurnedGoal:")
    public native void setActiveEnergyBurnedGoal(HKQuantity value);

    /**
     * [@property] appleExerciseTime
     * <p>
     * The amount of exercise time that the user performed.
     * <p>
     * This quantity is compatible with time units. The measurement criteria of
     * exercise time is defined by Apple.
     */
    @Generated
    @Selector("setAppleExerciseTime:")
    public native void setAppleExerciseTime(HKQuantity value);

    /**
     * [@property] appleExerciseTimeGoal
     * <p>
     * The user's exercise time goal for the day.
     * <p>
     * This quantity is compatible with time units.
     */
    @Generated
    @Selector("setAppleExerciseTimeGoal:")
    public native void setAppleExerciseTimeGoal(HKQuantity value);

    /**
     * [@property] appleStandHours
     * <p>
     * The number of stand hours that the user earned.
     * <p>
     * This quantity is compatible with the count unit. The measurement criteria of
     * stand hours is defined by Apple.
     */
    @Generated
    @Selector("setAppleStandHours:")
    public native void setAppleStandHours(HKQuantity value);

    /**
     * [@property] appleStandHoursGoal
     * <p>
     * The user's active stand hours goal for the day.
     * <p>
     * This quantity is compatible with the count unit.
     */
    @Generated
    @Selector("setAppleStandHoursGoal:")
    public native void setAppleStandHoursGoal(HKQuantity value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] activityMoveMode
     * <p>
     * The move mode of this activity summary
     * <p>
     * The move mode of an activity summary determines if activeEnergyBurned or appleMoveTime are used for the move
     * ring.
     */
    @Generated
    @Selector("activityMoveMode")
    @NInt
    public native long activityMoveMode();

    /**
     * [@property] appleMoveTime
     * <p>
     * The amount of move time that the user performed.
     * <p>
     * This quantity is compatible with time units. The measurement criteria of
     * move time time is defined by Apple.
     */
    @Generated
    @Selector("appleMoveTime")
    public native HKQuantity appleMoveTime();

    /**
     * [@property] appleMoveTimeGoal
     * <p>
     * The user's move time goal for the day.
     * <p>
     * This quantity is compatible with time units.
     */
    @Generated
    @Selector("appleMoveTimeGoal")
    public native HKQuantity appleMoveTimeGoal();

    /**
     * [@property] activityMoveMode
     * <p>
     * The move mode of this activity summary
     * <p>
     * The move mode of an activity summary determines if activeEnergyBurned or appleMoveTime are used for the move
     * ring.
     */
    @Generated
    @Selector("setActivityMoveMode:")
    public native void setActivityMoveMode(@NInt long value);

    /**
     * [@property] appleMoveTime
     * <p>
     * The amount of move time that the user performed.
     * <p>
     * This quantity is compatible with time units. The measurement criteria of
     * move time time is defined by Apple.
     */
    @Generated
    @Selector("setAppleMoveTime:")
    public native void setAppleMoveTime(HKQuantity value);

    /**
     * [@property] appleMoveTimeGoal
     * <p>
     * The user's move time goal for the day.
     * <p>
     * This quantity is compatible with time units.
     */
    @Generated
    @Selector("setAppleMoveTimeGoal:")
    public native void setAppleMoveTimeGoal(HKQuantity value);
}
