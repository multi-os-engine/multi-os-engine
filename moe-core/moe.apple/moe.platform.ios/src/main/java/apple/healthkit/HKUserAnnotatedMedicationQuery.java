package apple.healthkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSDateComponents;
import apple.foundation.NSDateInterval;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSPredicate;
import apple.foundation.NSSet;
import apple.foundation.NSUUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * API-Since: 26.0
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKUserAnnotatedMedicationQuery extends HKQuery {
    static {
        NatJ.register();
    }

    @Generated
    protected HKUserAnnotatedMedicationQuery(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKUserAnnotatedMedicationQuery alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native HKUserAnnotatedMedicationQuery allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
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
    public native HKUserAnnotatedMedicationQuery init();

    /**
     * initWithPredicate:limit:resultsHandler:
     * 
     * Returns a query that will retrieve HKUserAnnotatedMedications matching the given predicate and limit.
     * 
     * @param predicate      The predicate which user annotated medications should match.
     * @param limit          The maximum number of user annotated medications to return. Pass HKObjectQueryNoLimit for
     *                       no limit.
     * @param resultsHandler The block to invoke with results to deliver to the client. The results handler will be
     *                       called with done = YES when there are no more user annotated medications to enumerate.
     * 
     *                       API-Since: 26.0
     */
    @Generated
    @Selector("initWithPredicate:limit:resultsHandler:")
    public native HKUserAnnotatedMedicationQuery initWithPredicateLimitResultsHandler(@Nullable NSPredicate predicate,
            @NUInt long limit,
            @ObjCBlock(name = "call_initWithPredicateLimitResultsHandler") @NotNull Block_initWithPredicateLimitResultsHandler resultsHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithPredicateLimitResultsHandler {
        @Generated
        void call_initWithPredicateLimitResultsHandler(@NotNull HKUserAnnotatedMedicationQuery query,
                @Nullable HKUserAnnotatedMedication userAnnotatedMedication, boolean done, @Nullable NSError error);
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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native HKUserAnnotatedMedicationQuery new_objc();

    @Generated
    @Selector("predicateForActivitySummariesBetweenStartDateComponents:endDateComponents:")
    @NotNull
    public static native NSPredicate predicateForActivitySummariesBetweenStartDateComponentsEndDateComponents(
            @NotNull NSDateComponents startDateComponents, @NotNull NSDateComponents endDateComponents);

    @Generated
    @Selector("predicateForActivitySummaryWithDateComponents:")
    @NotNull
    public static native NSPredicate predicateForActivitySummaryWithDateComponents(
            @NotNull NSDateComponents dateComponents);

    @Generated
    @Selector("predicateForCategorySamplesEqualToValues:")
    @NotNull
    public static native NSPredicate predicateForCategorySamplesEqualToValues(
            @NotNull NSSet<? extends NSNumber> values);

    @Generated
    @Selector("predicateForCategorySamplesWithOperatorType:value:")
    @NotNull
    public static native NSPredicate predicateForCategorySamplesWithOperatorTypeValue(@NUInt long operatorType,
            @NInt long value);

    @Generated
    @Selector("predicateForClinicalRecordsFromSource:FHIRResourceType:identifier:")
    @NotNull
    public static native NSPredicate predicateForClinicalRecordsFromSourceFHIRResourceTypeIdentifier(
            @NotNull HKSource source, @NotNull String resourceType, @NotNull String identifier);

    @Generated
    @Selector("predicateForClinicalRecordsWithFHIRResourceType:")
    @NotNull
    public static native NSPredicate predicateForClinicalRecordsWithFHIRResourceType(@NotNull String resourceType);

    @Generated
    @Selector("predicateForElectrocardiogramsWithClassification:")
    @NotNull
    public static native NSPredicate predicateForElectrocardiogramsWithClassification(@NInt long classification);

    @Generated
    @Selector("predicateForElectrocardiogramsWithSymptomsStatus:")
    @NotNull
    public static native NSPredicate predicateForElectrocardiogramsWithSymptomsStatus(@NInt long symptomsStatus);

    @Generated
    @Selector("predicateForMedicationDoseEventWithMedicationConceptIdentifier:")
    @NotNull
    public static native NSPredicate predicateForMedicationDoseEventWithMedicationConceptIdentifier(
            @NotNull HKHealthConceptIdentifier medicationConceptIdentifier);

    @Generated
    @Selector("predicateForMedicationDoseEventWithMedicationConceptIdentifiers:")
    @NotNull
    public static native NSPredicate predicateForMedicationDoseEventWithMedicationConceptIdentifiers(
            @NotNull NSSet<? extends HKHealthConceptIdentifier> medicationConceptIdentifiers);

    @Generated
    @Selector("predicateForMedicationDoseEventWithScheduledDate:")
    @NotNull
    public static native NSPredicate predicateForMedicationDoseEventWithScheduledDate(@NotNull NSDate scheduledDate);

    @Generated
    @Selector("predicateForMedicationDoseEventWithScheduledDates:")
    @NotNull
    public static native NSPredicate predicateForMedicationDoseEventWithScheduledDates(
            @NotNull NSSet<? extends NSDate> scheduledDates);

    @Generated
    @Selector("predicateForMedicationDoseEventWithScheduledStartDate:endDate:")
    @NotNull
    public static native NSPredicate predicateForMedicationDoseEventWithScheduledStartDateEndDate(
            @Nullable NSDate startDate, @Nullable NSDate endDate);

    @Generated
    @Selector("predicateForMedicationDoseEventWithStatus:")
    @NotNull
    public static native NSPredicate predicateForMedicationDoseEventWithStatus(@NInt long status);

    @Generated
    @Selector("predicateForMedicationDoseEventWithStatuses:")
    @NotNull
    public static native NSPredicate predicateForMedicationDoseEventWithStatuses(
            @NotNull NSSet<? extends NSNumber> statuses);

    @Generated
    @Selector("predicateForObjectWithUUID:")
    @NotNull
    public static native NSPredicate predicateForObjectWithUUID(@NotNull NSUUID UUID);

    @Generated
    @Selector("predicateForObjectsAssociatedWithElectrocardiogram:")
    @NotNull
    public static native NSPredicate predicateForObjectsAssociatedWithElectrocardiogram(
            @NotNull HKElectrocardiogram electrocardiogram);

    @Generated
    @Selector("predicateForObjectsFromDevices:")
    @NotNull
    public static native NSPredicate predicateForObjectsFromDevices(@NotNull NSSet<? extends HKDevice> devices);

    @Generated
    @Selector("predicateForObjectsFromSource:")
    @NotNull
    public static native NSPredicate predicateForObjectsFromSource(@NotNull HKSource source);

    @Generated
    @Selector("predicateForObjectsFromSourceRevisions:")
    @NotNull
    public static native NSPredicate predicateForObjectsFromSourceRevisions(
            @NotNull NSSet<? extends HKSourceRevision> sourceRevisions);

    @Generated
    @Selector("predicateForObjectsFromSources:")
    @NotNull
    public static native NSPredicate predicateForObjectsFromSources(@NotNull NSSet<? extends HKSource> sources);

    @Generated
    @Selector("predicateForObjectsFromWorkout:")
    @NotNull
    public static native NSPredicate predicateForObjectsFromWorkout(@NotNull HKWorkout workout);

    @Generated
    @Selector("predicateForObjectsWithDeviceProperty:allowedValues:")
    @NotNull
    public static native NSPredicate predicateForObjectsWithDevicePropertyAllowedValues(@NotNull String key,
            @NotNull NSSet<String> allowedValues);

    @Generated
    @Selector("predicateForObjectsWithMetadataKey:")
    @NotNull
    public static native NSPredicate predicateForObjectsWithMetadataKey(@NotNull String key);

    @Generated
    @Selector("predicateForObjectsWithMetadataKey:allowedValues:")
    @NotNull
    public static native NSPredicate predicateForObjectsWithMetadataKeyAllowedValues(@NotNull String key,
            @NotNull NSArray<?> allowedValues);

    @Generated
    @Selector("predicateForObjectsWithMetadataKey:operatorType:value:")
    @NotNull
    public static native NSPredicate predicateForObjectsWithMetadataKeyOperatorTypeValue(@NotNull String key,
            @NUInt long operatorType, @Mapped(ObjCObjectMapper.class) @NotNull Object value);

    @Generated
    @Selector("predicateForObjectsWithNoCorrelation")
    @NotNull
    public static native NSPredicate predicateForObjectsWithNoCorrelation();

    @Generated
    @Selector("predicateForObjectsWithUUIDs:")
    @NotNull
    public static native NSPredicate predicateForObjectsWithUUIDs(@NotNull NSSet<? extends NSUUID> UUIDs);

    @Generated
    @Selector("predicateForQuantitySamplesWithOperatorType:quantity:")
    @NotNull
    public static native NSPredicate predicateForQuantitySamplesWithOperatorTypeQuantity(@NUInt long operatorType,
            @NotNull HKQuantity quantity);

    @Generated
    @Selector("predicateForSamplesWithStartDate:endDate:options:")
    @NotNull
    public static native NSPredicate predicateForSamplesWithStartDateEndDateOptions(@Nullable NSDate startDate,
            @Nullable NSDate endDate, @NUInt long options);

    @Generated
    @Selector("predicateForStatesOfMindWithAssociation:")
    @NotNull
    public static native NSPredicate predicateForStatesOfMindWithAssociation(@NInt long association);

    @Generated
    @Selector("predicateForStatesOfMindWithKind:")
    @NotNull
    public static native NSPredicate predicateForStatesOfMindWithKind(@NInt long kind);

    @Generated
    @Selector("predicateForStatesOfMindWithLabel:")
    @NotNull
    public static native NSPredicate predicateForStatesOfMindWithLabel(@NInt long label);

    @Generated
    @Selector("predicateForStatesOfMindWithValence:operatorType:")
    @NotNull
    public static native NSPredicate predicateForStatesOfMindWithValenceOperatorType(double valence,
            @NUInt long operatorType);

    @Generated
    @Selector("predicateForUserAnnotatedMedicationsWithHasSchedule:")
    @NotNull
    public static native NSPredicate predicateForUserAnnotatedMedicationsWithHasSchedule(boolean hasSchedule);

    @Generated
    @Selector("predicateForUserAnnotatedMedicationsWithIsArchived:")
    @NotNull
    public static native NSPredicate predicateForUserAnnotatedMedicationsWithIsArchived(boolean isArchived);

    @Generated
    @Selector("predicateForVerifiableClinicalRecordsWithRelevantDateWithinDateInterval:")
    @NotNull
    public static native NSPredicate predicateForVerifiableClinicalRecordsWithRelevantDateWithinDateInterval(
            @NotNull NSDateInterval dateInterval);

    @Generated
    @Selector("predicateForWorkoutActivitiesWithOperatorType:duration:")
    @NotNull
    public static native NSPredicate predicateForWorkoutActivitiesWithOperatorTypeDuration(@NUInt long operatorType,
            double duration);

    @Generated
    @Selector("predicateForWorkoutActivitiesWithOperatorType:quantityType:averageQuantity:")
    @NotNull
    public static native NSPredicate predicateForWorkoutActivitiesWithOperatorTypeQuantityTypeAverageQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity averageQuantity);

    @Generated
    @Selector("predicateForWorkoutActivitiesWithOperatorType:quantityType:maximumQuantity:")
    @NotNull
    public static native NSPredicate predicateForWorkoutActivitiesWithOperatorTypeQuantityTypeMaximumQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity maximumQuantity);

    @Generated
    @Selector("predicateForWorkoutActivitiesWithOperatorType:quantityType:minimumQuantity:")
    @NotNull
    public static native NSPredicate predicateForWorkoutActivitiesWithOperatorTypeQuantityTypeMinimumQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity minimumQuantity);

    @Generated
    @Selector("predicateForWorkoutActivitiesWithOperatorType:quantityType:sumQuantity:")
    @NotNull
    public static native NSPredicate predicateForWorkoutActivitiesWithOperatorTypeQuantityTypeSumQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity sumQuantity);

    @Generated
    @Selector("predicateForWorkoutActivitiesWithStartDate:endDate:options:")
    @NotNull
    public static native NSPredicate predicateForWorkoutActivitiesWithStartDateEndDateOptions(
            @Nullable NSDate startDate, @Nullable NSDate endDate, @NUInt long options);

    @Generated
    @Selector("predicateForWorkoutActivitiesWithWorkoutActivityType:")
    @NotNull
    public static native NSPredicate predicateForWorkoutActivitiesWithWorkoutActivityType(
            @NUInt long workoutActivityType);

    @Generated
    @Selector("predicateForWorkoutEffortSamplesRelatedToWorkout:activity:")
    @NotNull
    public static native NSPredicate predicateForWorkoutEffortSamplesRelatedToWorkoutActivity(
            @NotNull HKWorkout workout, @Nullable HKWorkoutActivity activity);

    @Generated
    @Selector("predicateForWorkoutsWithActivityPredicate:")
    @NotNull
    public static native NSPredicate predicateForWorkoutsWithActivityPredicate(@NotNull NSPredicate activityPredicate);

    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:duration:")
    @NotNull
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeDuration(@NUInt long operatorType,
            double duration);

    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:quantityType:averageQuantity:")
    @NotNull
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeQuantityTypeAverageQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity averageQuantity);

    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:quantityType:maximumQuantity:")
    @NotNull
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeQuantityTypeMaximumQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity maximumQuantity);

    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:quantityType:minimumQuantity:")
    @NotNull
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeQuantityTypeMinimumQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity minimumQuantity);

    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:quantityType:sumQuantity:")
    @NotNull
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeQuantityTypeSumQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity sumQuantity);

    @Generated
    @Deprecated
    @Selector("predicateForWorkoutsWithOperatorType:totalDistance:")
    @NotNull
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalDistance(@NUInt long operatorType,
            @NotNull HKQuantity totalDistance);

    @Generated
    @Deprecated
    @Selector("predicateForWorkoutsWithOperatorType:totalEnergyBurned:")
    @NotNull
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalEnergyBurned(@NUInt long operatorType,
            @NotNull HKQuantity totalEnergyBurned);

    @Generated
    @Deprecated
    @Selector("predicateForWorkoutsWithOperatorType:totalFlightsClimbed:")
    @NotNull
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalFlightsClimbed(@NUInt long operatorType,
            @NotNull HKQuantity totalFlightsClimbed);

    @Generated
    @Deprecated
    @Selector("predicateForWorkoutsWithOperatorType:totalSwimmingStrokeCount:")
    @NotNull
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalSwimmingStrokeCount(
            @NUInt long operatorType, @NotNull HKQuantity totalSwimmingStrokeCount);

    @Generated
    @Selector("predicateForWorkoutsWithWorkoutActivityType:")
    @NotNull
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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}