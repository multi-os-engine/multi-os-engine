package apple.healthkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * HKWorkoutBuilder
 * <p>
 * An HKWorkoutBuilder is used to incrementally create new workouts in the HealthKit database. Samples,
 * events, and metadata may be added to a builder either during a live workout session or to create a
 * workout that occurred in the past. Calling finishWorkoutWithCompletion: will create a new workout
 * with samples, events, and metadata that have been provided.
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKWorkoutBuilder extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected HKWorkoutBuilder(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * addMetadata:completion:
     * <p>
     * Adds new metadata to the builder instance. This method can be called more than once; each time the newly
     * provided metadata will be merged with previously added metadata in the same manner as
     * -[NSMutableDictionary addEntriesFromDictionary:]. This operation is performed asynchronously and the
     * completion will be executed on an arbitrary background queue.
     *
     * @param metadata   The metadata to add to the workout.
     * @param completion Block to be called when the addition of metadata to the builder is complete. If success is
     *                   YES, the metadata has been added to the builder successfully. If success is NO, error will
     *                   be non-null and will contain the error encountered during the insertion operation. When an
     *                   error occurs, the builder's metadata property will remain unchanged.
     */
    @Generated
    @Selector("addMetadata:completion:")
    public native void addMetadataCompletion(NSDictionary<String, ?> metadata,
            @ObjCBlock(name = "call_addMetadataCompletion") Block_addMetadataCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addMetadataCompletion {
        @Generated
        void call_addMetadataCompletion(boolean success, NSError error);
    }

    /**
     * addSamples:completion:
     * <p>
     * Adds new samples to the builder instance. This method can be called multiple times to add samples
     * incrementally to the builder. The samples will be saved to the database if they have not already been
     * saved. The constraints of -[HKHealthStore saveObject:withCompletion:] apply to this method as well.
     * The start date of the samples must be later than the start date of the receiver. It is an error to call
     * this method after finishWorkoutWithCompletion: has been called. This operation is performed
     * asynchronously and the completion will be executed on an arbitrary background queue.
     *
     * @param samples    The samples to add to the workout.
     * @param completion Block to be called when the insertion is complete. If success is YES, the samples were added
     *                   to the builder successfully. If success is NO, error will be non-nil and contain the error
     *                   encountered while adding the new samples.
     */
    @Generated
    @Selector("addSamples:completion:")
    public native void addSamplesCompletion(NSArray<? extends HKSample> samples,
            @ObjCBlock(name = "call_addSamplesCompletion") Block_addSamplesCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addSamplesCompletion {
        @Generated
        void call_addSamplesCompletion(boolean success, NSError error);
    }

    /**
     * addWorkoutEvents:completion:
     * <p>
     * Adds new workout events to the builder instance. This method can be called many times to add workout
     * events incrementally to the builder. It is an error to call this method after
     * finishWorkoutWithCompletion: has been called. This operation is performed asynchronously and the
     * completion will be executed on an arbitrary background queue.
     *
     * @param workoutEvents The events to add to the builder.
     * @param completion    Block to be called when the addition of events to the builder is complete. If success is
     *                      YES, the events were added to the builder successfully. If success is NO, error will be
     *                      non-null and will contain the error encountered during the insertion operation.
     */
    @Generated
    @Selector("addWorkoutEvents:completion:")
    public native void addWorkoutEventsCompletion(NSArray<? extends HKWorkoutEvent> workoutEvents,
            @ObjCBlock(name = "call_addWorkoutEventsCompletion") Block_addWorkoutEventsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addWorkoutEventsCompletion {
        @Generated
        void call_addWorkoutEventsCompletion(boolean success, NSError error);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKWorkoutBuilder alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native HKWorkoutBuilder allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * beginCollectionWithStartDate:error:
     * <p>
     * Sets the workout start date and activates the workout builder.
     * <p>
     * Calling this method is required before any samples, events or metadata can be added to the builder.
     *
     * @param startDate  The start date of the workout.
     * @param completion Called once data collection has started or has failed to start.
     */
    @Generated
    @Selector("beginCollectionWithStartDate:completion:")
    public native void beginCollectionWithStartDateCompletion(NSDate startDate,
            @ObjCBlock(name = "call_beginCollectionWithStartDateCompletion") Block_beginCollectionWithStartDateCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_beginCollectionWithStartDateCompletion {
        @Generated
        void call_beginCollectionWithStartDateCompletion(boolean success, NSError error);
    }

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
     * [@property] device
     * <p>
     * The HKDevice to be associated with the workout.
     */
    @Generated
    @Selector("device")
    public native HKDevice device();

    /**
     * discardWorkout
     * <p>
     * Finishes building the workout and discards the result instead of saving it. Samples that were added to
     * the workout will not be deleted. Adding samples, events, and metadata to the receiver after
     * discardWorkout has been called is an error.
     */
    @Generated
    @Selector("discardWorkout")
    public native void discardWorkout();

    /**
     * elapsedTimeAtDate:
     * <p>
     * The elapsed duration of the workout evaluated at the specified date. The duration does not include
     * periods when the workout was paused, which are the intervals between pause and resume events.
     */
    @Generated
    @Selector("elapsedTimeAtDate:")
    public native double elapsedTimeAtDate(NSDate date);

    /**
     * endCollectionWithEndDate:error:
     * <p>
     * Sets the workout end date and deactivates the workout builer.
     * <p>
     * Calling this method is required before you finish a workout builder.
     *
     * @param endDate    The end date of the workout.
     * @param completion Called once data collection has stopped or has failed to stop.
     */
    @Generated
    @Selector("endCollectionWithEndDate:completion:")
    public native void endCollectionWithEndDateCompletion(NSDate endDate,
            @ObjCBlock(name = "call_endCollectionWithEndDateCompletion") Block_endCollectionWithEndDateCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_endCollectionWithEndDateCompletion {
        @Generated
        void call_endCollectionWithEndDateCompletion(boolean success, NSError error);
    }

    /**
     * [@property] endDate
     * <p>
     * The end date for the workout, as provided by endCollectionWithEndDate:completion:
     */
    @Generated
    @Selector("endDate")
    public native NSDate endDate();

    /**
     * finishWorkoutWithCompletion:
     * <p>
     * Creates and saves an HKWorkout using samples and events that have been added to workout previously.
     *
     * @param completion Block to be called after the HKWorkout object has been created and saved. If the returned
     *                   workout is nil, an error may have occurred in which case error will be non-nil. If both
     *                   workout and error are nil then finishing the workout succeeded but the workout sample
     *                   is not available because the device is locked.
     */
    @Generated
    @Selector("finishWorkoutWithCompletion:")
    public native void finishWorkoutWithCompletion(
            @ObjCBlock(name = "call_finishWorkoutWithCompletion") Block_finishWorkoutWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_finishWorkoutWithCompletion {
        @Generated
        void call_finishWorkoutWithCompletion(HKWorkout workout, NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native HKWorkoutBuilder init();

    /**
     * initWithHealthStore:configuration:device:
     * <p>
     * The designated initializer to create an HKWorkoutBuilder.
     * <p>
     * Creates a new HKWorkoutBuilder unconnected to any HKWorkoutSession or any sources of data.
     *
     * @param healthStore   Specifies the HKHealthStore object to use for building the workout. The store is retained
     *                      until the builder is finished and a workout has been saved or discarded.
     * @param configuration The workout configuration to be used.
     * @param device        The HKDevice to attach to the resulting HKWorkout.
     */
    @Generated
    @Selector("initWithHealthStore:configuration:device:")
    public native HKWorkoutBuilder initWithHealthStoreConfigurationDevice(HKHealthStore healthStore,
            HKWorkoutConfiguration configuration, HKDevice device);

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
     * <p>
     * The metadata that will be used when the workout is finished.
     */
    @Generated
    @Selector("metadata")
    public native NSDictionary<String, ?> metadata();

    @Generated
    @Owned
    @Selector("new")
    public static native HKWorkoutBuilder new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * seriesBuilderForType:
     * <p>
     * Retrieves the associated series builder for the specified type.
     * <p>
     * Retrieves, and creates if it does not already exist, the series builder for the specified type. The
     * series constructed with the returned builder will be associated with the workout when it is finished.
     *
     * @param seriesType The series type for which the builder should be retrieved.
     */
    @Generated
    @Selector("seriesBuilderForType:")
    public native HKSeriesBuilder seriesBuilderForType(HKSeriesType seriesType);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] startDate
     * <p>
     * The start date for the workout, as provided by beginCollectionWithStartDate:completion:
     */
    @Generated
    @Selector("startDate")
    public native NSDate startDate();

    /**
     * statisticsForType:
     * <p>
     * Returns an HKStatistics object containing the statistics for all the samples of the given type that
     * have been added to the receiver. If there are no samples of the given type then nil is returned.
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
     * <p>
     * The configuration for the workout being built.
     */
    @Generated
    @Selector("workoutConfiguration")
    public native HKWorkoutConfiguration workoutConfiguration();

    /**
     * [@property] workoutEvents
     * <p>
     * Workout events that have been added to the builder.
     * <p>
     * New events that are added using addWorkoutEvents:completion: will be appended to this array once the
     * completion is called.
     */
    @Generated
    @Selector("workoutEvents")
    public native NSArray<? extends HKWorkoutEvent> workoutEvents();
}
