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
 * API-Since: 12.0
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKQuantitySeriesSampleQuery extends HKQuery {
    static {
        NatJ.register();
    }

    @Generated
    protected HKQuantitySeriesSampleQuery(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKQuantitySeriesSampleQuery alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native HKQuantitySeriesSampleQuery allocWithZone(VoidPtr zone);

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

    /**
     * [@property] includeSample
     * 
     * Include owning HKQuantitySample in quantityHandler handler.
     * 
     * Default value is NO.
     * If includeSample is set then the quantitySample parameter of quantityHandler will
     * be non-nil anytime the quantity parameter is non-nil.
     * Specifying this option has a performance cost.
     * This property may not be modified once the query has been executed.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("includeSample")
    public native boolean includeSample();

    @Generated
    @Selector("init")
    public native HKQuantitySeriesSampleQuery init();

    /**
     * initWithSample:dataHandler:
     * 
     * Returns a query that will retrieve HKQuantity objects for samples of a specified
     * type that match the specified predicate.
     * 
     * @param quantityType    The type of HKQuantitySample to retrieve.
     * @param predicate       The predicate which the query results should match.
     *                        To query for the quantities for a specific quantity sample
     *                        see: +[HKPredicates predicateForObjectWithUUID:]
     * 
     * @param quantityHandler The block to invoke with results from the query. It will be
     *                        called repeatedly with HKQuantity, and NSDateInterval objects in
     *                        ascending dateInterval.startDate order, until all quantities are
     *                        returned and the done parameter is YES
     *                        or -[HKHealthStore stopQuery:] is called.
     *                        The quantitySample parameter is nil unless includeSample is YES,
     *                        in which case it will be the quantitySample which owns the current
     *                        quantity anytime the quantity paramater is non-nil.
     *                        The stopQuery call can be made within the quantityHandler block.
     *                        Once done is YES, or stopQuery has been called, the query is
     *                        complete and no more calls to quantityHandler will be made.
     * 
     *                        API-Since: 13.0
     */
    @Generated
    @Selector("initWithQuantityType:predicate:quantityHandler:")
    public native HKQuantitySeriesSampleQuery initWithQuantityTypePredicateQuantityHandler(
            @NotNull HKQuantityType quantityType, @Nullable NSPredicate predicate,
            @NotNull @ObjCBlock(name = "call_initWithQuantityTypePredicateQuantityHandler") Block_initWithQuantityTypePredicateQuantityHandler quantityHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithQuantityTypePredicateQuantityHandler {
        @Generated
        void call_initWithQuantityTypePredicateQuantityHandler(@NotNull HKQuantitySeriesSampleQuery query,
                @Nullable HKQuantity quantity, @Nullable NSDateInterval dateInterval,
                @Nullable HKQuantitySample quantitySample, boolean done, @Nullable NSError error);
    }

    /**
     * API-Since: 12.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("initWithSample:quantityHandler:")
    public native HKQuantitySeriesSampleQuery initWithSampleQuantityHandler(@NotNull HKQuantitySample quantitySample,
            @NotNull @ObjCBlock(name = "call_initWithSampleQuantityHandler") Block_initWithSampleQuantityHandler quantityHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithSampleQuantityHandler {
        @Generated
        void call_initWithSampleQuantityHandler(@NotNull HKQuantitySeriesSampleQuery query,
                @Nullable HKQuantity quantity, @Nullable NSDate date, boolean done, @Nullable NSError error);
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
    public static native HKQuantitySeriesSampleQuery new_objc();

    /**
     * [@property] orderByQuantitySampleStartDate
     * 
     * Order enumerated results first by quantitySample.startDate,
     * then by the quantity's dateInterval.startDate.
     * 
     * Default value is NO.
     * All quantities owned by a given quantitySample will be
     * enumerated before any quantities owned by any other quantity sample,
     * and the quantity samples will be enumerated in their startDate order.
     * Note that individual quantities may not be returned in their
     * dateInterval.startDate order if more than one quantitySample overlap in time.
     * This property may not be modified once the query has been executed.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("orderByQuantitySampleStartDate")
    public native boolean orderByQuantitySampleStartDate();

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

    /**
     * [@property] includeSample
     * 
     * Include owning HKQuantitySample in quantityHandler handler.
     * 
     * Default value is NO.
     * If includeSample is set then the quantitySample parameter of quantityHandler will
     * be non-nil anytime the quantity parameter is non-nil.
     * Specifying this option has a performance cost.
     * This property may not be modified once the query has been executed.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setIncludeSample:")
    public native void setIncludeSample(boolean value);

    /**
     * [@property] orderByQuantitySampleStartDate
     * 
     * Order enumerated results first by quantitySample.startDate,
     * then by the quantity's dateInterval.startDate.
     * 
     * Default value is NO.
     * All quantities owned by a given quantitySample will be
     * enumerated before any quantities owned by any other quantity sample,
     * and the quantity samples will be enumerated in their startDate order.
     * Note that individual quantities may not be returned in their
     * dateInterval.startDate order if more than one quantitySample overlap in time.
     * This property may not be modified once the query has been executed.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setOrderByQuantitySampleStartDate:")
    public native void setOrderByQuantitySampleStartDate(boolean value);

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
