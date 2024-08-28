package apple.healthkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSDateComponents;
import apple.foundation.NSDateInterval;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPredicate;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.foundation.NSNumber;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 13.0
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKHeartbeatSeriesQuery extends HKQuery {
    static {
        NatJ.register();
    }

    @Generated
    protected HKHeartbeatSeriesQuery(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKHeartbeatSeriesQuery alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native HKHeartbeatSeriesQuery allocWithZone(VoidPtr zone);

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
    @Selector("init")
    public native HKHeartbeatSeriesQuery init();

    /**
     * initWithHeartbeatSeries:dataHandler:
     * 
     * Returns a query that will retrieve heartbeat timestamps for the specified HKHeartbeatSeriesSample.
     * 
     * @param heartbeatSeries The HKHeartbeatSeriesSample for which the heartbeat data will be returned.
     * @param dataHandler     The block to invoke with results from the query. It is called repeatedly for each
     *                        heartbeat in the series. timeSinceSeriesStart is the time elapsed in seconds after the
     *                        series startDate that represents when the heartbeat occured. precededByGap indicates if
     *                        there was a gap in data collection before the current heartbeat, meaning that one or more
     *                        heartbeats may have occured since the previous heartbeat in the series. Once done is YES,
     *                        or stopQuery called, the query is complete and no more calls to the handler will be made.
     */
    @Generated
    @Selector("initWithHeartbeatSeries:dataHandler:")
    public native HKHeartbeatSeriesQuery initWithHeartbeatSeriesDataHandler(
            @NotNull HKHeartbeatSeriesSample heartbeatSeries,
            @NotNull @ObjCBlock(name = "call_initWithHeartbeatSeriesDataHandler") Block_initWithHeartbeatSeriesDataHandler dataHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithHeartbeatSeriesDataHandler {
        @Generated
        void call_initWithHeartbeatSeriesDataHandler(@NotNull HKHeartbeatSeriesQuery query, double timeSinceSeriesStart,
                boolean precededByGap, boolean done, @Nullable NSError error);
    }

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
    public static native HKHeartbeatSeriesQuery new_objc();

    @NotNull
    @Generated
    @Selector("predicateForActivitySummariesBetweenStartDateComponents:endDateComponents:")
    public static native NSPredicate predicateForActivitySummariesBetweenStartDateComponentsEndDateComponents(
            @NotNull NSDateComponents startDateComponents, @NotNull NSDateComponents endDateComponents);

    @NotNull
    @Generated
    @Selector("predicateForActivitySummaryWithDateComponents:")
    public static native NSPredicate predicateForActivitySummaryWithDateComponents(
            @NotNull NSDateComponents dateComponents);

    @NotNull
    @Generated
    @Selector("predicateForCategorySamplesWithOperatorType:value:")
    public static native NSPredicate predicateForCategorySamplesWithOperatorTypeValue(@NUInt long operatorType,
            @NInt long value);

    @NotNull
    @Generated
    @Selector("predicateForClinicalRecordsFromSource:FHIRResourceType:identifier:")
    public static native NSPredicate predicateForClinicalRecordsFromSourceFHIRResourceTypeIdentifier(
            @NotNull HKSource source, @NotNull String resourceType, @NotNull String identifier);

    @NotNull
    @Generated
    @Selector("predicateForClinicalRecordsWithFHIRResourceType:")
    public static native NSPredicate predicateForClinicalRecordsWithFHIRResourceType(@NotNull String resourceType);

    @NotNull
    @Generated
    @Selector("predicateForObjectWithUUID:")
    public static native NSPredicate predicateForObjectWithUUID(@NotNull NSUUID UUID);

    @NotNull
    @Generated
    @Selector("predicateForObjectsFromDevices:")
    public static native NSPredicate predicateForObjectsFromDevices(@NotNull NSSet<? extends HKDevice> devices);

    @NotNull
    @Generated
    @Selector("predicateForObjectsFromSource:")
    public static native NSPredicate predicateForObjectsFromSource(@NotNull HKSource source);

    @NotNull
    @Generated
    @Selector("predicateForObjectsFromSourceRevisions:")
    public static native NSPredicate predicateForObjectsFromSourceRevisions(
            @NotNull NSSet<? extends HKSourceRevision> sourceRevisions);

    @NotNull
    @Generated
    @Selector("predicateForObjectsFromSources:")
    public static native NSPredicate predicateForObjectsFromSources(@NotNull NSSet<? extends HKSource> sources);

    @NotNull
    @Generated
    @Selector("predicateForObjectsFromWorkout:")
    public static native NSPredicate predicateForObjectsFromWorkout(@NotNull HKWorkout workout);

    @NotNull
    @Generated
    @Selector("predicateForObjectsWithDeviceProperty:allowedValues:")
    public static native NSPredicate predicateForObjectsWithDevicePropertyAllowedValues(@NotNull String key,
            @NotNull NSSet<String> allowedValues);

    @NotNull
    @Generated
    @Selector("predicateForObjectsWithMetadataKey:")
    public static native NSPredicate predicateForObjectsWithMetadataKey(@NotNull String key);

    @NotNull
    @Generated
    @Selector("predicateForObjectsWithMetadataKey:allowedValues:")
    public static native NSPredicate predicateForObjectsWithMetadataKeyAllowedValues(@NotNull String key,
            @NotNull NSArray<?> allowedValues);

    @NotNull
    @Generated
    @Selector("predicateForObjectsWithMetadataKey:operatorType:value:")
    public static native NSPredicate predicateForObjectsWithMetadataKeyOperatorTypeValue(@NotNull String key,
            @NUInt long operatorType, @NotNull @Mapped(ObjCObjectMapper.class) Object value);

    @NotNull
    @Generated
    @Selector("predicateForObjectsWithNoCorrelation")
    public static native NSPredicate predicateForObjectsWithNoCorrelation();

    @NotNull
    @Generated
    @Selector("predicateForObjectsWithUUIDs:")
    public static native NSPredicate predicateForObjectsWithUUIDs(@NotNull NSSet<? extends NSUUID> UUIDs);

    @NotNull
    @Generated
    @Selector("predicateForQuantitySamplesWithOperatorType:quantity:")
    public static native NSPredicate predicateForQuantitySamplesWithOperatorTypeQuantity(@NUInt long operatorType,
            @NotNull HKQuantity quantity);

    @NotNull
    @Generated
    @Selector("predicateForSamplesWithStartDate:endDate:options:")
    public static native NSPredicate predicateForSamplesWithStartDateEndDateOptions(@Nullable NSDate startDate,
            @Nullable NSDate endDate, @NUInt long options);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:duration:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeDuration(@NUInt long operatorType,
            double duration);

    @NotNull
    @Deprecated
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:totalDistance:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalDistance(@NUInt long operatorType,
            @NotNull HKQuantity totalDistance);

    @NotNull
    @Deprecated
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:totalEnergyBurned:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalEnergyBurned(@NUInt long operatorType,
            @NotNull HKQuantity totalEnergyBurned);

    @NotNull
    @Deprecated
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:totalFlightsClimbed:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalFlightsClimbed(@NUInt long operatorType,
            @NotNull HKQuantity totalFlightsClimbed);

    @NotNull
    @Deprecated
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:totalSwimmingStrokeCount:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalSwimmingStrokeCount(
            @NUInt long operatorType, @NotNull HKQuantity totalSwimmingStrokeCount);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutsWithWorkoutActivityType:")
    public static native NSPredicate predicateForWorkoutsWithWorkoutActivityType(@NUInt long workoutActivityType);

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

    @NotNull
    @Generated
    @Selector("predicateForElectrocardiogramsWithClassification:")
    public static native NSPredicate predicateForElectrocardiogramsWithClassification(@NInt long classification);

    @NotNull
    @Generated
    @Selector("predicateForElectrocardiogramsWithSymptomsStatus:")
    public static native NSPredicate predicateForElectrocardiogramsWithSymptomsStatus(@NInt long symptomsStatus);

    @NotNull
    @Generated
    @Selector("predicateForObjectsAssociatedWithElectrocardiogram:")
    public static native NSPredicate predicateForObjectsAssociatedWithElectrocardiogram(
            @NotNull HKElectrocardiogram electrocardiogram);

    @NotNull
    @Generated
    @Selector("predicateForVerifiableClinicalRecordsWithRelevantDateWithinDateInterval:")
    public static native NSPredicate predicateForVerifiableClinicalRecordsWithRelevantDateWithinDateInterval(
            @NotNull NSDateInterval dateInterval);

    @NotNull
    @Generated
    @Selector("predicateForCategorySamplesEqualToValues:")
    public static native NSPredicate predicateForCategorySamplesEqualToValues(
            @NotNull NSSet<? extends NSNumber> values);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutActivitiesWithOperatorType:duration:")
    public static native NSPredicate predicateForWorkoutActivitiesWithOperatorTypeDuration(@NUInt long operatorType,
            double duration);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutActivitiesWithOperatorType:quantityType:averageQuantity:")
    public static native NSPredicate predicateForWorkoutActivitiesWithOperatorTypeQuantityTypeAverageQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity averageQuantity);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutActivitiesWithOperatorType:quantityType:maximumQuantity:")
    public static native NSPredicate predicateForWorkoutActivitiesWithOperatorTypeQuantityTypeMaximumQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity maximumQuantity);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutActivitiesWithOperatorType:quantityType:minimumQuantity:")
    public static native NSPredicate predicateForWorkoutActivitiesWithOperatorTypeQuantityTypeMinimumQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity minimumQuantity);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutActivitiesWithOperatorType:quantityType:sumQuantity:")
    public static native NSPredicate predicateForWorkoutActivitiesWithOperatorTypeQuantityTypeSumQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity sumQuantity);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutActivitiesWithStartDate:endDate:options:")
    public static native NSPredicate predicateForWorkoutActivitiesWithStartDateEndDateOptions(
            @Nullable NSDate startDate, @Nullable NSDate endDate, @NUInt long options);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutActivitiesWithWorkoutActivityType:")
    public static native NSPredicate predicateForWorkoutActivitiesWithWorkoutActivityType(
            @NUInt long workoutActivityType);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutsWithActivityPredicate:")
    public static native NSPredicate predicateForWorkoutsWithActivityPredicate(@NotNull NSPredicate activityPredicate);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:quantityType:averageQuantity:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeQuantityTypeAverageQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity averageQuantity);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:quantityType:maximumQuantity:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeQuantityTypeMaximumQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity maximumQuantity);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:quantityType:minimumQuantity:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeQuantityTypeMinimumQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity minimumQuantity);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:quantityType:sumQuantity:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeQuantityTypeSumQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity sumQuantity);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
