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

/**
 * HKQuantitySeriesSampleQuery
 * <p>
 * An HKQuantitySeriesSampleQuery is used to access series data associated with
 * HKQuantitySample(s).
 * <p>
 * Once instantiated, call -[HKHealthStore executeQuery:] to begin enumerating
 * the series data.
 * Call -[HKHealthStore stopQuery:] to discontinue further quantity data reporting.
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

    @Generated
    @Selector("allocWithZone:")
    public static native HKQuantitySeriesSampleQuery allocWithZone(VoidPtr zone);

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

    /**
     * [@property]      includeSample
     * <p>
     * Include owning HKQuantitySample in quantityHandler handler.
     * <p>
     * Default value is NO.
     * If includeSample is set then the quantitySample parameter of quantityHandler will
     * be non-nil anytime the quantity parameter is non-nil.
     * Specifying this option has a performance cost.
     * This property may not be modified once the query has been executed.
     */
    @Generated
    @Selector("includeSample")
    public native boolean includeSample();

    @Generated
    @Selector("init")
    public native HKQuantitySeriesSampleQuery init();

    /**
     * initWithSample:dataHandler:
     * <p>
     * Returns a query that will retrieve HKQuantity objects for samples of a specified
     * type that match the specified predicate.
     *
     * @param quantityType    The type of HKQuantitySample to retrieve.
     * @param predicate       The predicate which the query results should match.
     *                        To query for the quantities for a specific quantity sample
     *                        see: +[HKPredicates predicateForObjectWithUUID:]
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
     */
    @Generated
    @Selector("initWithQuantityType:predicate:quantityHandler:")
    public native HKQuantitySeriesSampleQuery initWithQuantityTypePredicateQuantityHandler(HKQuantityType quantityType,
            NSPredicate predicate,
            @ObjCBlock(name = "call_initWithQuantityTypePredicateQuantityHandler") Block_initWithQuantityTypePredicateQuantityHandler quantityHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithQuantityTypePredicateQuantityHandler {
        @Generated
        void call_initWithQuantityTypePredicateQuantityHandler(HKQuantitySeriesSampleQuery query, HKQuantity quantity,
                NSDateInterval dateInterval, HKQuantitySample quantitySample, boolean done, NSError error);
    }

    @Generated
    @Selector("initWithSample:quantityHandler:")
    public native HKQuantitySeriesSampleQuery initWithSampleQuantityHandler(HKQuantitySample quantitySample,
            @ObjCBlock(name = "call_initWithSampleQuantityHandler") Block_initWithSampleQuantityHandler quantityHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithSampleQuantityHandler {
        @Generated
        void call_initWithSampleQuantityHandler(HKQuantitySeriesSampleQuery query, HKQuantity quantity, NSDate date,
                boolean done, NSError error);
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
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native HKQuantitySeriesSampleQuery new_objc();

    /**
     * [@property]      orderByQuantitySampleStartDate
     * <p>
     * Order enumerated results first by quantitySample.startDate,
     * then by the quantity's dateInterval.startDate.
     * <p>
     * Default value is NO.
     * All quantities owned by a given quantitySample will be
     * enumerated before any quantities owned by any other quantity sample,
     * and the quantity samples will be enumerated in their startDate order.
     * Note that individual quantities may not be returned in their
     * dateInterval.startDate order if more than one quantitySample overlap in time.
     * This property may not be modified once the query has been executed.
     */
    @Generated
    @Selector("orderByQuantitySampleStartDate")
    public native boolean orderByQuantitySampleStartDate();

    @Generated
    @Selector("predicateForActivitySummariesBetweenStartDateComponents:endDateComponents:")
    public static native NSPredicate predicateForActivitySummariesBetweenStartDateComponentsEndDateComponents(
            NSDateComponents startDateComponents, NSDateComponents endDateComponents);

    @Generated
    @Selector("predicateForActivitySummaryWithDateComponents:")
    public static native NSPredicate predicateForActivitySummaryWithDateComponents(NSDateComponents dateComponents);

    @Generated
    @Selector("predicateForCategorySamplesWithOperatorType:value:")
    public static native NSPredicate predicateForCategorySamplesWithOperatorTypeValue(@NUInt long operatorType,
            @NInt long value);

    @Generated
    @Selector("predicateForClinicalRecordsFromSource:FHIRResourceType:identifier:")
    public static native NSPredicate predicateForClinicalRecordsFromSourceFHIRResourceTypeIdentifier(HKSource source,
            String resourceType, String identifier);

    @Generated
    @Selector("predicateForClinicalRecordsWithFHIRResourceType:")
    public static native NSPredicate predicateForClinicalRecordsWithFHIRResourceType(String resourceType);

    @Generated
    @Selector("predicateForObjectWithUUID:")
    public static native NSPredicate predicateForObjectWithUUID(NSUUID UUID);

    @Generated
    @Selector("predicateForObjectsFromDevices:")
    public static native NSPredicate predicateForObjectsFromDevices(NSSet<? extends HKDevice> devices);

    @Generated
    @Selector("predicateForObjectsFromSource:")
    public static native NSPredicate predicateForObjectsFromSource(HKSource source);

    @Generated
    @Selector("predicateForObjectsFromSourceRevisions:")
    public static native NSPredicate predicateForObjectsFromSourceRevisions(
            NSSet<? extends HKSourceRevision> sourceRevisions);

    @Generated
    @Selector("predicateForObjectsFromSources:")
    public static native NSPredicate predicateForObjectsFromSources(NSSet<? extends HKSource> sources);

    @Generated
    @Selector("predicateForObjectsFromWorkout:")
    public static native NSPredicate predicateForObjectsFromWorkout(HKWorkout workout);

    @Generated
    @Selector("predicateForObjectsWithDeviceProperty:allowedValues:")
    public static native NSPredicate predicateForObjectsWithDevicePropertyAllowedValues(String key,
            NSSet<String> allowedValues);

    @Generated
    @Selector("predicateForObjectsWithMetadataKey:")
    public static native NSPredicate predicateForObjectsWithMetadataKey(String key);

    @Generated
    @Selector("predicateForObjectsWithMetadataKey:allowedValues:")
    public static native NSPredicate predicateForObjectsWithMetadataKeyAllowedValues(String key,
            NSArray<?> allowedValues);

    @Generated
    @Selector("predicateForObjectsWithMetadataKey:operatorType:value:")
    public static native NSPredicate predicateForObjectsWithMetadataKeyOperatorTypeValue(String key,
            @NUInt long operatorType, @Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("predicateForObjectsWithNoCorrelation")
    public static native NSPredicate predicateForObjectsWithNoCorrelation();

    @Generated
    @Selector("predicateForObjectsWithUUIDs:")
    public static native NSPredicate predicateForObjectsWithUUIDs(NSSet<? extends NSUUID> UUIDs);

    @Generated
    @Selector("predicateForQuantitySamplesWithOperatorType:quantity:")
    public static native NSPredicate predicateForQuantitySamplesWithOperatorTypeQuantity(@NUInt long operatorType,
            HKQuantity quantity);

    @Generated
    @Selector("predicateForSamplesWithStartDate:endDate:options:")
    public static native NSPredicate predicateForSamplesWithStartDateEndDateOptions(NSDate startDate, NSDate endDate,
            @NUInt long options);

    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:duration:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeDuration(@NUInt long operatorType,
            double duration);

    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:totalDistance:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalDistance(@NUInt long operatorType,
            HKQuantity totalDistance);

    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:totalEnergyBurned:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalEnergyBurned(@NUInt long operatorType,
            HKQuantity totalEnergyBurned);

    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:totalFlightsClimbed:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalFlightsClimbed(@NUInt long operatorType,
            HKQuantity totalFlightsClimbed);

    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:totalSwimmingStrokeCount:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalSwimmingStrokeCount(
            @NUInt long operatorType, HKQuantity totalSwimmingStrokeCount);

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
     * [@property]      includeSample
     * <p>
     * Include owning HKQuantitySample in quantityHandler handler.
     * <p>
     * Default value is NO.
     * If includeSample is set then the quantitySample parameter of quantityHandler will
     * be non-nil anytime the quantity parameter is non-nil.
     * Specifying this option has a performance cost.
     * This property may not be modified once the query has been executed.
     */
    @Generated
    @Selector("setIncludeSample:")
    public native void setIncludeSample(boolean value);

    /**
     * [@property]      orderByQuantitySampleStartDate
     * <p>
     * Order enumerated results first by quantitySample.startDate,
     * then by the quantity's dateInterval.startDate.
     * <p>
     * Default value is NO.
     * All quantities owned by a given quantitySample will be
     * enumerated before any quantities owned by any other quantity sample,
     * and the quantity samples will be enumerated in their startDate order.
     * Note that individual quantities may not be returned in their
     * dateInterval.startDate order if more than one quantitySample overlap in time.
     * This property may not be modified once the query has been executed.
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

    @Generated
    @Selector("predicateForElectrocardiogramsWithClassification:")
    public static native NSPredicate predicateForElectrocardiogramsWithClassification(@NInt long classification);

    @Generated
    @Selector("predicateForElectrocardiogramsWithSymptomsStatus:")
    public static native NSPredicate predicateForElectrocardiogramsWithSymptomsStatus(@NInt long symptomsStatus);

    @Generated
    @Selector("predicateForObjectsAssociatedWithElectrocardiogram:")
    public static native NSPredicate predicateForObjectsAssociatedWithElectrocardiogram(
            HKElectrocardiogram electrocardiogram);

    @Generated
    @Selector("predicateForVerifiableClinicalRecordsWithRelevantDateWithinDateInterval:")
    public static native NSPredicate predicateForVerifiableClinicalRecordsWithRelevantDateWithinDateInterval(
            NSDateInterval dateInterval);
}
