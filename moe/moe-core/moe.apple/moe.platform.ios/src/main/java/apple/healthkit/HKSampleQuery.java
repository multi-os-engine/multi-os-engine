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
import apple.foundation.NSDate;
import apple.foundation.NSDateComponents;
import apple.foundation.NSDateInterval;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPredicate;
import apple.foundation.NSSet;
import apple.foundation.NSSortDescriptor;
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

/**
 * API-Since: 8.0
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKSampleQuery extends HKQuery {
    static {
        NatJ.register();
    }

    @Generated
    protected HKSampleQuery(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKSampleQuery alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native HKSampleQuery allocWithZone(VoidPtr zone);

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
    public static native HKSampleQuery new_objc();

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

    @Deprecated
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:totalDistance:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalDistance(@NUInt long operatorType,
            HKQuantity totalDistance);

    @Deprecated
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:totalEnergyBurned:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalEnergyBurned(@NUInt long operatorType,
            HKQuantity totalEnergyBurned);

    @Deprecated
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
    @Selector("init")
    public native HKSampleQuery init();

    /**
     * initWithSampleType:predicate:limit:sortDescriptors:resultsHandler:
     * 
     * Returns a query that will retrieve HKSamples matching the given predicate.
     * 
     * @param sampleType      The type of sample to retrieve.
     * @param predicate       The predicate which samples should match.
     * @param limit           The maximum number of samples to return. Pass HKObjectQueryNoLimit for no limit.
     * @param sortDescriptors The sort descriptors to use to order the resulting samples.
     * @param resultsHandler  The block to invoke with results when the query has finished executing.
     */
    @Generated
    @Selector("initWithSampleType:predicate:limit:sortDescriptors:resultsHandler:")
    public native HKSampleQuery initWithSampleTypePredicateLimitSortDescriptorsResultsHandler(HKSampleType sampleType,
            NSPredicate predicate, @NUInt long limit, NSArray<? extends NSSortDescriptor> sortDescriptors,
            @ObjCBlock(name = "call_initWithSampleTypePredicateLimitSortDescriptorsResultsHandler") Block_initWithSampleTypePredicateLimitSortDescriptorsResultsHandler resultsHandler);

    /**
     * [@property] limit
     * 
     * The maximum number of results the receiver will return upon completion.
     */
    @Generated
    @Selector("limit")
    @NUInt
    public native long limit();

    /**
     * [@property] sortDescriptors
     * 
     * An array of NSSortDescriptors.
     */
    @Generated
    @Selector("sortDescriptors")
    public native NSArray<? extends NSSortDescriptor> sortDescriptors();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithSampleTypePredicateLimitSortDescriptorsResultsHandler {
        @Generated
        void call_initWithSampleTypePredicateLimitSortDescriptorsResultsHandler(HKSampleQuery query,
                NSArray<? extends HKSample> results, NSError error);
    }

    @Deprecated
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:totalFlightsClimbed:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalFlightsClimbed(@NUInt long operatorType,
            HKQuantity totalFlightsClimbed);

    @Generated
    @Selector("predicateForClinicalRecordsFromSource:FHIRResourceType:identifier:")
    public static native NSPredicate predicateForClinicalRecordsFromSourceFHIRResourceTypeIdentifier(HKSource source,
            String resourceType, String identifier);

    @Generated
    @Selector("predicateForClinicalRecordsWithFHIRResourceType:")
    public static native NSPredicate predicateForClinicalRecordsWithFHIRResourceType(String resourceType);

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

    /**
     * initWithQueryDescriptors:limit:resultsHandler:
     * 
     * Returns a query that will retrieve HKSamples matching any of the given queryDescriptors.
     * 
     * @param queryDescriptors An array of query descriptors that describes the sample types and predicates
     *                         used for querying.
     * @param limit            The maximum number of samples to return. Pass HKObjectQueryNoLimit
     *                         for no limit.
     * @param resultsHandler   The block to invoke with results when the query has finished executing. This
     *                         block is invoked once with results, an array of HKSamples matching the
     *                         queryDescriptors passed in, or nil if an error occurred.
     * 
     *                         API-Since: 15.0
     */
    @Generated
    @Selector("initWithQueryDescriptors:limit:resultsHandler:")
    public native HKSampleQuery initWithQueryDescriptorsLimitResultsHandler(
            NSArray<? extends HKQueryDescriptor> queryDescriptors, @NInt long limit,
            @ObjCBlock(name = "call_initWithQueryDescriptorsLimitResultsHandler") Block_initWithQueryDescriptorsLimitResultsHandler resultsHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithQueryDescriptorsLimitResultsHandler {
        @Generated
        void call_initWithQueryDescriptorsLimitResultsHandler(HKSampleQuery query, NSArray<? extends HKSample> results,
                NSError error);
    }

    /**
     * initWithQueryDescriptors:limit:sortDescriptors:resultsHandler:
     * 
     * Returns a query that will retrieve HKSamples matching any of the given queryDescriptors.
     * 
     * @param queryDescriptors An array of query descriptors that describes the sample types and predicates
     *                         used for querying.
     * @param limit            The maximum number of samples to return. Pass HKObjectQueryNoLimit
     *                         for no limit.
     * @param sortDescriptors  The sort descriptors to use to order the resulting samples.
     * @param resultsHandler   The block to invoke with results when the query has finished executing. This
     *                         block is invoked once with results, an array of HKSamples matching the
     *                         queryDescriptors passed in, or nil if an error occurred. The HKSamples in the
     *                         array are sorted by the specified sortDescriptors.
     * 
     *                         API-Since: 15.0
     */
    @Generated
    @Selector("initWithQueryDescriptors:limit:sortDescriptors:resultsHandler:")
    public native HKSampleQuery initWithQueryDescriptorsLimitSortDescriptorsResultsHandler(
            NSArray<? extends HKQueryDescriptor> queryDescriptors, @NInt long limit,
            NSArray<? extends NSSortDescriptor> sortDescriptors,
            @ObjCBlock(name = "call_initWithQueryDescriptorsLimitSortDescriptorsResultsHandler") Block_initWithQueryDescriptorsLimitSortDescriptorsResultsHandler resultsHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithQueryDescriptorsLimitSortDescriptorsResultsHandler {
        @Generated
        void call_initWithQueryDescriptorsLimitSortDescriptorsResultsHandler(HKSampleQuery query,
                NSArray<? extends HKSample> results, NSError error);
    }

    @Generated
    @Selector("predicateForVerifiableClinicalRecordsWithRelevantDateWithinDateInterval:")
    public static native NSPredicate predicateForVerifiableClinicalRecordsWithRelevantDateWithinDateInterval(
            NSDateInterval dateInterval);

    @Generated
    @Selector("predicateForCategorySamplesEqualToValues:")
    public static native NSPredicate predicateForCategorySamplesEqualToValues(NSSet<? extends NSNumber> values);

    @Generated
    @Selector("predicateForWorkoutActivitiesWithOperatorType:duration:")
    public static native NSPredicate predicateForWorkoutActivitiesWithOperatorTypeDuration(@NUInt long operatorType,
            double duration);

    @Generated
    @Selector("predicateForWorkoutActivitiesWithOperatorType:quantityType:averageQuantity:")
    public static native NSPredicate predicateForWorkoutActivitiesWithOperatorTypeQuantityTypeAverageQuantity(
            @NUInt long operatorType, HKQuantityType quantityType, HKQuantity averageQuantity);

    @Generated
    @Selector("predicateForWorkoutActivitiesWithOperatorType:quantityType:maximumQuantity:")
    public static native NSPredicate predicateForWorkoutActivitiesWithOperatorTypeQuantityTypeMaximumQuantity(
            @NUInt long operatorType, HKQuantityType quantityType, HKQuantity maximumQuantity);

    @Generated
    @Selector("predicateForWorkoutActivitiesWithOperatorType:quantityType:minimumQuantity:")
    public static native NSPredicate predicateForWorkoutActivitiesWithOperatorTypeQuantityTypeMinimumQuantity(
            @NUInt long operatorType, HKQuantityType quantityType, HKQuantity minimumQuantity);

    @Generated
    @Selector("predicateForWorkoutActivitiesWithOperatorType:quantityType:sumQuantity:")
    public static native NSPredicate predicateForWorkoutActivitiesWithOperatorTypeQuantityTypeSumQuantity(
            @NUInt long operatorType, HKQuantityType quantityType, HKQuantity sumQuantity);

    @Generated
    @Selector("predicateForWorkoutActivitiesWithStartDate:endDate:options:")
    public static native NSPredicate predicateForWorkoutActivitiesWithStartDateEndDateOptions(NSDate startDate,
            NSDate endDate, @NUInt long options);

    @Generated
    @Selector("predicateForWorkoutActivitiesWithWorkoutActivityType:")
    public static native NSPredicate predicateForWorkoutActivitiesWithWorkoutActivityType(
            @NUInt long workoutActivityType);

    @Generated
    @Selector("predicateForWorkoutsWithActivityPredicate:")
    public static native NSPredicate predicateForWorkoutsWithActivityPredicate(NSPredicate activityPredicate);

    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:quantityType:averageQuantity:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeQuantityTypeAverageQuantity(
            @NUInt long operatorType, HKQuantityType quantityType, HKQuantity averageQuantity);

    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:quantityType:maximumQuantity:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeQuantityTypeMaximumQuantity(
            @NUInt long operatorType, HKQuantityType quantityType, HKQuantity maximumQuantity);

    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:quantityType:minimumQuantity:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeQuantityTypeMinimumQuantity(
            @NUInt long operatorType, HKQuantityType quantityType, HKQuantity minimumQuantity);

    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:quantityType:sumQuantity:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeQuantityTypeSumQuantity(
            @NUInt long operatorType, HKQuantityType quantityType, HKQuantity sumQuantity);
}
