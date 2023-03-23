package apple.healthkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
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

/**
 * HKWorkoutActivity
 * 
 * An HKWorkoutActivity is an object describing the properties of an activity within an HKWorkout.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKWorkoutActivity extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected HKWorkoutActivity(Pointer peer) {
        super(peer);
    }

    /**
     * [@property] UUID
     * 
     * A unique identifier of the activity in the HealthKit database.
     */
    @Generated
    @Selector("UUID")
    public native NSUUID UUID();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * [@property] allStatistics
     * 
     * A dictionary of statistics per quantity type during the activity
     * 
     * This dictionary will contain HKStatistics objects containing the statistics by quantity
     * sample type for all of the samples that have been added to the workout within the date
     * interval of this activity.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("allStatistics")
    public native NSDictionary<? extends HKQuantityType, ? extends HKStatistics> allStatistics();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKWorkoutActivity alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native HKWorkoutActivity allocWithZone(VoidPtr zone);

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

    /**
     * [@property] duration
     * 
     * The length of time that the workout activity was recording
     * 
     * The duration is derived from the start and end dates of the activity and takes
     * into account periods that the activity was paused. Periods that the activity was
     * paused are based off of the workoutEvents property of the parent workout object.
     */
    @Generated
    @Selector("duration")
    public native double duration();

    /**
     * [@property] endDate
     * 
     * The point in time when the workout activity was ended.
     * 
     * This value is nil when a workout activity is in progress.
     */
    @Generated
    @Selector("endDate")
    public native NSDate endDate();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native HKWorkoutActivity init();

    /**
     * initWithWorkoutConfiguration:startDate:endDate:metadata:
     * 
     * Initialize a new HKWorkoutActivity with the specified values.
     * 
     * @param workoutConfiguration The configuration object describing the workout activity.
     * @param startDate            The point in time when the workout activity was started.
     * @param endDate              The point in time when the workout activity was ended.
     * @param metadata             Metadata for the workout activity. (Optional)
     */
    @Generated
    @Selector("initWithWorkoutConfiguration:startDate:endDate:metadata:")
    public native HKWorkoutActivity initWithWorkoutConfigurationStartDateEndDateMetadata(
            HKWorkoutConfiguration workoutConfiguration, NSDate startDate, NSDate endDate,
            NSDictionary<String, ?> metadata);

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

    /**
     * [@property] metadata
     * 
     * Extra information describing properties of the workout activity.
     * 
     * Keys must be NSString and values must be either NSString, NSNumber, NSDate, or
     * HKQuantity. See HKMetadata.h for potential metadata keys and values.
     */
    @Generated
    @Selector("metadata")
    public native NSDictionary<String, ?> metadata();

    @Generated
    @Owned
    @Selector("new")
    public static native HKWorkoutActivity new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] startDate
     * 
     * The point in time when the workout activity was started.
     */
    @Generated
    @Selector("startDate")
    public native NSDate startDate();

    /**
     * statisticsForType:
     * 
     * Returns an HKStatistics object containing the statistics for all the samples of the given type that
     * have been added to the workout within the date interval of this activity. If there are no samples of
     * the given type then nil is returned.
     * 
     * @param quantityType The quantity type to gather statistics about.
     */
    @Generated
    @Selector("statisticsForType:")
    public native HKStatistics statisticsForType(HKQuantityType quantityType);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] workoutConfiguration
     * 
     * The configuration object describing the workout activity.
     */
    @Generated
    @Selector("workoutConfiguration")
    public native HKWorkoutConfiguration workoutConfiguration();

    /**
     * [@property] workoutEvents
     * 
     * An array of HKWorkoutEvents that occurred during the workout activity.
     * 
     * These events will be ordered by date in ascending order. These events are a subset
     * of the workout events that take place between the start date and end date of the
     * activity. This includes any event that overlaps the activity, even partially.
     * Consequently, some events may be included in more than one activity.
     */
    @Generated
    @Selector("workoutEvents")
    public native NSArray<? extends HKWorkoutEvent> workoutEvents();
}