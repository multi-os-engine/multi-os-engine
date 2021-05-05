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
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
 * HKWorkout
 * 
 * An HKObject subclass representing a workout or activity
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKWorkout extends HKSample {
    static {
        NatJ.register();
    }

    @Generated
    protected HKWorkout(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKWorkout alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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
     * workoutWithActivityType:startDate:endDate:
     * 
     * @param         workoutActivityType     The activity type of the workout
     * @param         startDate               The point in time that the workout was started
     * @param         endDate                 The point in time that the workout was ended
     */
    @Generated
    @Selector("workoutWithActivityType:startDate:endDate:")
    public static native HKWorkout workoutWithActivityTypeStartDateEndDate(@NUInt long workoutActivityType,
            NSDate startDate, NSDate endDate);

    /**
     * workoutWithActivityType:startDate:endDate:duration:totalEnergyBurned:totalDistance:device:metadata:
     * 
     * If the optional total parameters are specified, matching samples that add up to the calculated total quantities
     *                should be associated with this workout using addSamples:toWorkout:completion: in HKHealthStore.
     * 
     * @param         workoutActivityType     The activity type of the workout
     * @param         startDate               The point in time that the workout was started
     * @param         endDate                 The point in time that the workout was ended
     * @param         duration                The duration of the workout. If 0, the difference between startDate and endDate is used.
     * @param         totalEnergyBurned       The amount of energy that was burned during the workout. (Optional)
     * @param         totalDistance           The total distance that was traveled during the workout. (Optional)
     * @param         device                  The HKDevice associated with the workout. (Optional)
     * @param         metadata                Metadata for the workout. (Optional)
     */
    @Generated
    @Selector("workoutWithActivityType:startDate:endDate:duration:totalEnergyBurned:totalDistance:device:metadata:")
    public static native HKWorkout workoutWithActivityTypeStartDateEndDateDurationTotalEnergyBurnedTotalDistanceDeviceMetadata(
            @NUInt long workoutActivityType, NSDate startDate, NSDate endDate, double duration,
            HKQuantity totalEnergyBurned, HKQuantity totalDistance, HKDevice device, NSDictionary<String, ?> metadata);

    /**
     * workoutWithActivityType:startDate:endDate:duration:totalEnergyBurned:totalDistance:metadata:
     * 
     * If the optional total parameters are specified, matching samples that add up to the calculated total quantities
     *                should be associated with this workout using addSamples:toWorkout:completion: in HKHealthStore.
     * 
     * @param         workoutActivityType     The activity type of the workout
     * @param         startDate               The point in time that the workout was started
     * @param         endDate                 The point in time that the workout was ended
     * @param         duration                The duration of the workout. If 0, the difference between startDate and endDate is used.
     * @param         totalEnergyBurned       The amount of energy that was burned during the workout. (Optional)
     * @param         totalDistance           The total distance that was traveled during the workout. (Optional)
     * @param         metadata                Metadata for the workout. (Optional)
     */
    @Generated
    @Selector("workoutWithActivityType:startDate:endDate:duration:totalEnergyBurned:totalDistance:metadata:")
    public static native HKWorkout workoutWithActivityTypeStartDateEndDateDurationTotalEnergyBurnedTotalDistanceMetadata(
            @NUInt long workoutActivityType, NSDate startDate, NSDate endDate, double duration,
            HKQuantity totalEnergyBurned, HKQuantity totalDistance, NSDictionary<String, ?> metadata);

    /**
     * workoutWithActivityType:startDate:endDate:workoutEvents:totalEnergyBurned:totalDistance:metadata
     * 
     * If the optional total parameters are specified, matching samples that add up to the calculated total quantities
     *                should be associated with this workout using addSamples:toWorkout:completion: in HKHealthStore.
     * 
     * @param         workoutActivityType     The activity type of the workout
     * @param         startDate               The point in time that the workout was started
     * @param         endDate                 The point in time that the workout was ended
     * @param         workoutEvents           An array of HKWorkoutEvents. The workout's duration is derived from these events. (Optional)
     * @param         totalEnergyBurned       The amount of energy that was burned during the workout. (Optional)
     * @param         totalDistance           The total distance that was traveled during the workout. (Optional)
     * @param         device                  The HKDevice associated with the workout. (Optional)
     * @param         metadata                Metadata for the workout. (Optional)
     */
    @Generated
    @Selector("workoutWithActivityType:startDate:endDate:workoutEvents:totalEnergyBurned:totalDistance:device:metadata:")
    public static native HKWorkout workoutWithActivityTypeStartDateEndDateWorkoutEventsTotalEnergyBurnedTotalDistanceDeviceMetadata(
            @NUInt long workoutActivityType, NSDate startDate, NSDate endDate,
            NSArray<? extends HKWorkoutEvent> workoutEvents, HKQuantity totalEnergyBurned, HKQuantity totalDistance,
            HKDevice device, NSDictionary<String, ?> metadata);

    /**
     * workoutWithActivityType:startDate:endDate:workoutEvents:totalEnergyBurned:totalDistance:metadata
     * 
     * If the optional total parameters are specified, matching samples that add up to the calculated total quantities
     *                should be associated with this workout using addSamples:toWorkout:completion: in HKHealthStore.
     * 
     * @param         workoutActivityType     The activity type of the workout
     * @param         startDate               The point in time that the workout was started
     * @param         endDate                 The point in time that the workout was ended
     * @param         workoutEvents           An array of HKWorkoutEvents. The workout's duration is derived from these events. (Optional)
     * @param         totalEnergyBurned       The amount of energy that was burned during the workout. (Optional)
     * @param         totalDistance           The total distance that was traveled during the workout. (Optional)
     * @param         metadata                Metadata for the workout. (Optional)
     */
    @Generated
    @Selector("workoutWithActivityType:startDate:endDate:workoutEvents:totalEnergyBurned:totalDistance:metadata:")
    public static native HKWorkout workoutWithActivityTypeStartDateEndDateWorkoutEventsTotalEnergyBurnedTotalDistanceMetadata(
            @NUInt long workoutActivityType, NSDate startDate, NSDate endDate,
            NSArray<? extends HKWorkoutEvent> workoutEvents, HKQuantity totalEnergyBurned, HKQuantity totalDistance,
            NSDictionary<String, ?> metadata);

    /**
     * workoutWithActivityType:startDate:endDate:workoutEvents:totalEnergyBurned:totalDistance:totalSwimmingStrokeCount:device:metadata:
     * 
     * If the optional total parameters are specified, matching samples that add up to the calculated total quantities
     *                should be associated with this workout using addSamples:toWorkout:completion: in HKHealthStore.
     * 
     * @param         workoutActivityType         The activity type of the workout
     * @param         startDate                   The point in time that the workout was started
     * @param         endDate                     The point in time that the workout was ended
     * @param         workoutEvents               An array of HKWorkoutEvents. The workout's duration is derived from these events. (Optional)
     * @param         totalEnergyBurned           The amount of energy that was burned during the workout. (Optional)
     * @param         totalDistance               The total distance that was traveled during the workout. (Optional)
     * @param         totalSwimmingStrokeCount    The total count of swimming strokes that was accumulated during the workout. (Optional)
     * @param         device                      The HKDevice associated with the workout. (Optional)
     * @param         metadata                    Metadata for the workout. (Optional)
     */
    @Generated
    @Selector("workoutWithActivityType:startDate:endDate:workoutEvents:totalEnergyBurned:totalDistance:totalSwimmingStrokeCount:device:metadata:")
    public static native HKWorkout workoutWithActivityTypeStartDateEndDateWorkoutEventsTotalEnergyBurnedTotalDistanceTotalSwimmingStrokeCountDeviceMetadata(
            @NUInt long workoutActivityType, NSDate startDate, NSDate endDate,
            NSArray<? extends HKWorkoutEvent> workoutEvents, HKQuantity totalEnergyBurned, HKQuantity totalDistance,
            HKQuantity totalSwimmingStrokeCount, HKDevice device, NSDictionary<String, ?> metadata);

    /**
     * [@property]      duration
     * 
     * The length of time that a workout was recording
     * 
     * The duration is derived from the start and end dates of the workout and takes into account periods that the
     *                workout was paused. Periods that the workout was paused are based off of the workoutEvents property.
     */
    @Generated
    @Selector("duration")
    public native double duration();

    @Generated
    @Selector("init")
    public native HKWorkout init();

    @Generated
    @Selector("initWithCoder:")
    public native HKWorkout initWithCoder(NSCoder coder);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property]      totalDistance
     * 
     * The total distance that was traveled during a workout
     * 
     * This metric should represent the total distance traveled during the course of the workout. It should be a
     *                quantity with a unit representing length.
     */
    @Generated
    @Selector("totalDistance")
    public native HKQuantity totalDistance();

    /**
     * [@property]      totalEnergyBurned
     * 
     * The amount of energy that was burned during a workout
     * 
     * This metric should represent the total active energy burned during the course of the workout. It should be a
     *                quantity with a unit representing energy.
     */
    @Generated
    @Selector("totalEnergyBurned")
    public native HKQuantity totalEnergyBurned();

    /**
     * [@property]      totalSwimmingStrokeCount
     * 
     * The total count of swimming strokes that was accumulated during a workout
     * 
     * This metric should represent the total count of swimming strokes accumulated during the course of the
     *                workout. It should be a quantity with a unit representing count.
     */
    @Generated
    @Selector("totalSwimmingStrokeCount")
    public native HKQuantity totalSwimmingStrokeCount();

    /**
     * [@property]      workoutActivityType
     * 
     * Represents the activity that the user was performing during a workout
     */
    @Generated
    @Selector("workoutActivityType")
    @NUInt
    public native long workoutActivityType();

    /**
     * [@property]      workoutEvents
     * 
     * An array of HKWorkoutEvents that occurred during a workout.
     * 
     * These events will be ordered by date in ascending order. All events must take place
     *                between the start date and end date of the workout. The first workout event should never be a resume event
     *                because it is assumed that the workout begins in a running state.
     */
    @Generated
    @Selector("workoutEvents")
    public native NSArray<? extends HKWorkoutEvent> workoutEvents();

    /**
     * [@property]      totalFlightsClimbed
     * 
     * The total count of flights climbed during a workout
     * 
     * This metric should represent the total count of flights accumulated during the course of the
     * workout. It should be a quantity with a unit representing count.
     */
    @Generated
    @Selector("totalFlightsClimbed")
    public native HKQuantity totalFlightsClimbed();

    /**
     * workoutWithActivityType:startDate:endDate:workoutEvents:totalEnergyBurned:totalDistance:totalFlightsClimbed:device:metadata:
     * 
     * If the optional total parameters are specified, matching samples that add up to the calculated total
     *                quantities should be associated with this workout using addSamples:toWorkout:completion: in
     *                HKHealthStore.
     * 
     * @param         workoutActivityType         The activity type of the workout
     * @param         startDate                   The point in time that the workout was started
     * @param         endDate                     The point in time that the workout was ended
     * @param         workoutEvents               An array of HKWorkoutEvents. The workout's duration is derived from these events. (Optional)
     * @param         totalEnergyBurned           The amount of energy that was burned during the workout. (Optional)
     * @param         totalDistance               The total distance that was traveled during the workout. (Optional)
     * @param         totalFlightsClimbed         The total count of flights climbed that was accumulated during the workout. (Optional)
     * @param         device                      The HKDevice associated with the workout. (Optional)
     * @param         metadata                    Metadata for the workout. (Optional)
     */
    @Generated
    @Selector("workoutWithActivityType:startDate:endDate:workoutEvents:totalEnergyBurned:totalDistance:totalFlightsClimbed:device:metadata:")
    public static native HKWorkout workoutWithActivityTypeStartDateEndDateWorkoutEventsTotalEnergyBurnedTotalDistanceTotalFlightsClimbedDeviceMetadata(
            @NUInt long workoutActivityType, NSDate startDate, NSDate endDate,
            NSArray<? extends HKWorkoutEvent> workoutEvents, HKQuantity totalEnergyBurned, HKQuantity totalDistance,
            HKQuantity totalFlightsClimbed, HKDevice device, NSDictionary<String, ?> metadata);
}
