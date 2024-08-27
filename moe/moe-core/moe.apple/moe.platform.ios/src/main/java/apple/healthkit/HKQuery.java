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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.foundation.NSNumber;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 8.0
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKQuery extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected HKQuery(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKQuery alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native HKQuery allocWithZone(VoidPtr zone);

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
    public static native HKQuery new_objc();

    /**
     * predicateForActivitySummariesBetweenStartDateComponents:endDateComponents:
     * 
     * Creates a predicate for use with HKActivitySummaryQuery
     * 
     * Creates a query predicate that matches HKActivitySummaries that fall between the given date components.
     * 
     * @param startDateComponents The date components that define the beginning of the range. These date components
     *                            should contain
     *                            era, year, month, and day components in the gregorian calendar.
     * 
     * @param endDateComponents   The date components that define the end of the range. These date components should
     *                            contain era,
     *                            year, month, and day components in the gregorian calendar.
     * 
     *                            API-Since: 9.3
     */
    @NotNull
    @Generated
    @Selector("predicateForActivitySummariesBetweenStartDateComponents:endDateComponents:")
    public static native NSPredicate predicateForActivitySummariesBetweenStartDateComponentsEndDateComponents(
            @NotNull NSDateComponents startDateComponents, @NotNull NSDateComponents endDateComponents);

    /**
     * predicateForActivitySummaryWithDateComponents:
     * 
     * Creates a predicate for use with HKActivitySummaryQuery
     * 
     * Creates a query predicate that matches HKActivitySummaries with the given date components.
     * 
     * @param dateComponents The date components of the activity summary. These date components should contain era,
     *                       year, month,
     *                       and day components in the gregorian calendar.
     * 
     *                       API-Since: 9.3
     */
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

    /**
     * predicateForObjectWithUUID:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches the object saved with a particular UUID.
     * 
     * @param UUID The UUID of the object.
     */
    @NotNull
    @Generated
    @Selector("predicateForObjectWithUUID:")
    public static native NSPredicate predicateForObjectWithUUID(@NotNull NSUUID UUID);

    /**
     * predicateForObjectsFromDevices:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches objects associated with any of the given devices. All properties
     * of each HKDevice are considered in the query and must match exactly, including nil values. To perform
     * searches based on specific device properties, use predicateForObjectsWithDeviceProperty:allowedValues:.
     * 
     * @param devices The set of devices that generated data.
     * 
     *                API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("predicateForObjectsFromDevices:")
    public static native NSPredicate predicateForObjectsFromDevices(@NotNull NSSet<? extends HKDevice> devices);

    /**
     * predicateForObjectsFromSource:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches objects saved by a given source.
     * 
     * @param source The source.
     */
    @NotNull
    @Generated
    @Selector("predicateForObjectsFromSource:")
    public static native NSPredicate predicateForObjectsFromSource(@NotNull HKSource source);

    /**
     * predicateForObjectsFromSourceRevisions:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches objects saved by any of the specified HKSourceRevisions.
     * 
     * @param sourceRevisions The list of source revisions.
     * 
     *                        API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("predicateForObjectsFromSourceRevisions:")
    public static native NSPredicate predicateForObjectsFromSourceRevisions(
            @NotNull NSSet<? extends HKSourceRevision> sourceRevisions);

    /**
     * predicateForObjectsFromSources:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches objects saved by any of the given sources.
     * 
     * @param sources The list of sources.
     */
    @NotNull
    @Generated
    @Selector("predicateForObjectsFromSources:")
    public static native NSPredicate predicateForObjectsFromSources(@NotNull NSSet<? extends HKSource> sources);

    /**
     * predicateForObjectsFromWorkout:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches the objects that have been added to the given workout.
     * 
     * @param workout The HKWorkout that the object was added to.
     */
    @NotNull
    @Generated
    @Selector("predicateForObjectsFromWorkout:")
    public static native NSPredicate predicateForObjectsFromWorkout(@NotNull HKWorkout workout);

    /**
     * predicateForObjectsWithDeviceProperty:allowedValues:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches objects associated with an HKDevice with the specified device
     * property matching any value included in allowedValues. To query for samples with devices that match all
     * the properties of an HKDevice, use predicateForObjectsFromDevices.
     * 
     * @param key           The device property key. (See HKDevice.h)
     * @param allowedValues The set of values for which the device property can match. An empty set will match all
     *                      devices whose property value is nil.
     * 
     *                      API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("predicateForObjectsWithDeviceProperty:allowedValues:")
    public static native NSPredicate predicateForObjectsWithDevicePropertyAllowedValues(@NotNull String key,
            @NotNull NSSet<String> allowedValues);

    /**
     * predicateForObjectsWithMetadataKey:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches objects with metadata that contains a given key.
     * 
     * @param key The metadata key.
     */
    @NotNull
    @Generated
    @Selector("predicateForObjectsWithMetadataKey:")
    public static native NSPredicate predicateForObjectsWithMetadataKey(@NotNull String key);

    /**
     * predicateForObjectsWithMetadataKey:allowedValues:
     * 
     * Creates a predicate for use with HKQuery subclasses
     * 
     * Creates a query predicate that matches objects with metadata containing a value the matches one of the
     * given values for the given key.
     * 
     * @param key           The metadata key.
     * @param allowedValues The list of values that the metadata value can be equal to.
     */
    @NotNull
    @Generated
    @Selector("predicateForObjectsWithMetadataKey:allowedValues:")
    public static native NSPredicate predicateForObjectsWithMetadataKeyAllowedValues(@NotNull String key,
            @NotNull NSArray<?> allowedValues);

    /**
     * predicateForObjectsWithMetadataKey:operatorType:value:
     * 
     * Creates a predicate for use with HKQuery subclasses
     * 
     * Creates a query predicate that matches objects with a value for a given metadata key matches the given
     * operator type and value.
     * 
     * @param key          The metadata key.
     * @param operatorType The comparison operator type for the expression.
     * @param value        The value to be compared against.
     */
    @NotNull
    @Generated
    @Selector("predicateForObjectsWithMetadataKey:operatorType:value:")
    public static native NSPredicate predicateForObjectsWithMetadataKeyOperatorTypeValue(@NotNull String key,
            @NUInt long operatorType, @NotNull @Mapped(ObjCObjectMapper.class) Object value);

    /**
     * predicateForObjectsNoCorrelation
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches the objects that are not associated with an HKCorrelation.
     */
    @NotNull
    @Generated
    @Selector("predicateForObjectsWithNoCorrelation")
    public static native NSPredicate predicateForObjectsWithNoCorrelation();

    /**
     * predicateForObjectsWithUUIDs:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches the objects saved with one of the given UUIDs.
     * 
     * @param UUIDs The set of NSUUIDs.
     */
    @NotNull
    @Generated
    @Selector("predicateForObjectsWithUUIDs:")
    public static native NSPredicate predicateForObjectsWithUUIDs(@NotNull NSSet<? extends NSUUID> UUIDs);

    /**
     * predicateForQuantitySamplesWithOperatorType:quantity:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches quantity samples with values that match the expression formed by
     * the given operator and quantity.
     * 
     * @param operatorType The operator type for the expression.
     * @param quantity     The quantity that the sample's quantity is being compared to. It is the right hand side
     *                     of the expression.
     */
    @NotNull
    @Generated
    @Selector("predicateForQuantitySamplesWithOperatorType:quantity:")
    public static native NSPredicate predicateForQuantitySamplesWithOperatorTypeQuantity(@NUInt long operatorType,
            @NotNull HKQuantity quantity);

    /**
     * predicateForSamplesWithStartDate:endDate:options:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches samples with a startDate and an endDate that lie inside of a
     * given time interval.
     * 
     * @param startDate The start date of the predicate's time interval.
     * @param endDate   The end date of the predicate's time interval.
     * @param options   The rules for how a sample's time interval overlaps with the predicate's time interval.
     */
    @NotNull
    @Generated
    @Selector("predicateForSamplesWithStartDate:endDate:options:")
    public static native NSPredicate predicateForSamplesWithStartDateEndDateOptions(@Nullable NSDate startDate,
            @Nullable NSDate endDate, @NUInt long options);

    /**
     * predicateForWorkoutsWithOperatorType:duration:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches HKWorkouts by the given operator type and duration
     * 
     * @param operatorType The operator type for the expression.
     * @param duration     The value that the workout's duration is being compared to. It is the right hand side of the
     *                     expression.
     */
    @NotNull
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:duration:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeDuration(@NUInt long operatorType,
            double duration);

    /**
     * predicateForWorkoutsWithOperatorType:totalDistance:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches HKWorkouts by the given operator type and totalEnergyBurned
     * 
     * @param operatorType  The operator type for the expression.
     * @param totalDistance The value that the workout's totalEnergyBurned is being compared to. It is the right hand
     *                      side of the
     *                      expression. The unit for this value should be of type Distance.
     * 
     *                      API-Since: 8.0
     *                      Deprecated-Since: 100000.0
     *                      Deprecated-Message: Use
     *                      predicateForWorkoutActivitiesWithOperatorType:quantityType:sumQuantity: passing the
     *                      HKQuantityType for the desired distance type
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:totalDistance:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalDistance(@NUInt long operatorType,
            @NotNull HKQuantity totalDistance);

    /**
     * predicateForWorkoutsWithOperatorType:totalEnergyBurned:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches HKWorkouts by the given operator type and totalEnergyBurned
     * 
     * @param operatorType      The operator type for the expression.
     * @param totalEnergyBurned The value that the workout's totalEnergyBurned is being compared to. It is the right
     *                          hand side of the
     *                          expression. The unit for this value should be of type Energy.
     * 
     *                          API-Since: 8.0
     *                          Deprecated-Since: 100000.0
     *                          Deprecated-Message: Use
     *                          predicateForWorkoutActivitiesWithOperatorType:quantityType:sumQuantity: passing the
     *                          HKQuantityType for HKQuantityTypeIdentifierActiveEnergyBurned
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:totalEnergyBurned:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalEnergyBurned(@NUInt long operatorType,
            @NotNull HKQuantity totalEnergyBurned);

    /**
     * predicateForWorkoutsWithOperatorType:totalSwimmingStrokeCount:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches HKWorkouts by the given operator type and totalSwimmingStrokeCount
     * 
     * @param operatorType             The operator type for the expression.
     * @param totalSwimmingStrokeCount The value that the workout's totalSwimmingStrokeCount is being compared to.
     *                                 It is the right hand side of the expression. The unit for this value should
     *                                 be of type Count.
     * 
     *                                 API-Since: 10.0
     *                                 Deprecated-Since: 100000.0
     *                                 Deprecated-Message: Use
     *                                 predicateForWorkoutActivitiesWithOperatorType:quantityType:sumQuantity:
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:totalSwimmingStrokeCount:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalSwimmingStrokeCount(
            @NUInt long operatorType, @NotNull HKQuantity totalSwimmingStrokeCount);

    /**
     * predicateForWorkoutsWithWorkoutActivityType:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches HKWorkouts with the given HKWorkoutActivityType.
     * 
     * @param workoutActivityType The HKWorkoutActivity type of the workout
     */
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

    @Generated
    @Selector("init")
    public native HKQuery init();

    /**
     * API-Since: 9.3
     */
    @Nullable
    @Generated
    @Selector("objectType")
    public native HKObjectType objectType();

    @Nullable
    @Generated
    @Selector("predicate")
    public native NSPredicate predicate();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 9.3
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("sampleType")
    public native HKSampleType sampleType();

    /**
     * predicateForWorkoutsWithOperatorType:totalFlightsClimbed:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches HKWorkouts by the given operator type and totalFlightsClimbed
     * 
     * @param operatorType        The operator type for the expression.
     * @param totalFlightsClimbed The value that the workout's totalFlightsClimbed is being compared to.
     *                            It is the right hand side of the expression. The unit for this value should
     *                            be of type Count.
     * 
     *                            API-Since: 11.0
     *                            Deprecated-Since: 100000.0
     *                            Deprecated-Message: Use
     *                            predicateForWorkoutActivitiesWithOperatorType:quantityType:sumQuantity: passing the
     *                            HKQuantityType for HKQuantityTypeIdentifierSwimmingStrokeCount
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:totalFlightsClimbed:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalFlightsClimbed(@NUInt long operatorType,
            @NotNull HKQuantity totalFlightsClimbed);

    /**
     * predicateForClinicalRecordsFromSource:withFHIRResourceType:identifier:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches HKClinicalRecords for a given source, FHIR resource type, and FHIR
     * identifier.
     * 
     * @param source       The source.
     * @param resourceType The FHIR resource type.
     * @param identifier   The FHIR identifier.
     * 
     *                     API-Since: 12.0
     */
    @NotNull
    @Generated
    @Selector("predicateForClinicalRecordsFromSource:FHIRResourceType:identifier:")
    public static native NSPredicate predicateForClinicalRecordsFromSourceFHIRResourceTypeIdentifier(
            @NotNull HKSource source, @NotNull String resourceType, @NotNull String identifier);

    /**
     * predicateForClinicalRecordsWithFHIRResourceType:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches HKClinicalRecords with a specific FHIR resource type.
     * 
     * @param resourceType The FHIR resource type.
     * 
     *                     API-Since: 12.0
     */
    @NotNull
    @Generated
    @Selector("predicateForClinicalRecordsWithFHIRResourceType:")
    public static native NSPredicate predicateForClinicalRecordsWithFHIRResourceType(@NotNull String resourceType);

    /**
     * predicateForElectrocardiogramsWithClassification:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches HKElectrocardiograms with a specific classification.
     * 
     * @param classification The classification for the electrocardiogram.
     * 
     *                       API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("predicateForElectrocardiogramsWithClassification:")
    public static native NSPredicate predicateForElectrocardiogramsWithClassification(@NInt long classification);

    /**
     * predicateForElectrocardiogramsWithSymptomsStatus:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches HKElectrocardiograms with a specificied symptoms status.
     * 
     * @param symptomsStatus The symptoms status for the electrocardiogram.
     * 
     *                       API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("predicateForElectrocardiogramsWithSymptomsStatus:")
    public static native NSPredicate predicateForElectrocardiogramsWithSymptomsStatus(@NInt long symptomsStatus);

    /**
     * predicateForObjectsAssociatedWithElectrocardiogram:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches the objects that have been added to the given electrocardiogram
     * 
     * @param electrocardiogram The HKElectrocardiogram that the object was added to.
     * 
     *                          API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("predicateForObjectsAssociatedWithElectrocardiogram:")
    public static native NSPredicate predicateForObjectsAssociatedWithElectrocardiogram(
            @NotNull HKElectrocardiogram electrocardiogram);

    /**
     * predicateForVerifiableClinicalRecordsWithRelevantDateWithinDateInterval:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a predicate that matches HKVerifiableClinicalRecords with a relevant date within a date interval.
     * 
     * @param dateInterval The date interval that the record's relevant date is in.
     * 
     *                     API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("predicateForVerifiableClinicalRecordsWithRelevantDateWithinDateInterval:")
    public static native NSPredicate predicateForVerifiableClinicalRecordsWithRelevantDateWithinDateInterval(
            @NotNull NSDateInterval dateInterval);

    /**
     * predicateForCategorySamplesEqualToValues:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches all specified category values.
     */
    @NotNull
    @Generated
    @Selector("predicateForCategorySamplesEqualToValues:")
    public static native NSPredicate predicateForCategorySamplesEqualToValues(
            @NotNull NSSet<? extends NSNumber> values);

    /**
     * predicateForWorkoutActivitiesWithOperatorType:duration:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches HKWorkoutActivity objects by the given operator type and duration.
     * The resulting predicate should be wrapped using predicateForWorkoutsWithActivityPredicate: before being used in a
     * query.
     * 
     * @param operatorType The operator type for the expression.
     * @param duration     The value that the workout's duration is being compared to. It is the right hand side of the
     *                     expression.
     * 
     *                     API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("predicateForWorkoutActivitiesWithOperatorType:duration:")
    public static native NSPredicate predicateForWorkoutActivitiesWithOperatorTypeDuration(@NUInt long operatorType,
            double duration);

    /**
     * predicateForWorkoutActivitiesWithOperatorType:quantityType:averageQuantity:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches HKWorkoutActivity objetcs by the given operator type and averageQuantity
     * in the
     * statistics for the specified type. The resulting predicate should be wrapped using
     * predicateForWorkoutsWithActivityPredicate:
     * before being used in a query.
     * 
     * @param operatorType    The operator type for the expression.
     * @param quantityType    The quantity type to compare statistics for. Should be a discrete quantity type.
     * @param averageQuantity The average value that the activity statistics are being compared to. The unit for this
     *                        value should
     *                        match the allowed values for the quantityType.
     * 
     *                        API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("predicateForWorkoutActivitiesWithOperatorType:quantityType:averageQuantity:")
    public static native NSPredicate predicateForWorkoutActivitiesWithOperatorTypeQuantityTypeAverageQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity averageQuantity);

    /**
     * predicateForWorkoutActivitiesWithOperatorType:quantityType:maximumQuantity:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches HKWorkoutActivity objetcs by the given operator type and maximumQuantity
     * in the
     * statistics for the specified type. The resulting predicate should be wrapped using
     * predicateForWorkoutsWithActivityPredicate:
     * before being used in a query.
     * 
     * @param operatorType    The operator type for the expression.
     * @param quantityType    The quantity type to compare statistics for. Should be a discrete quantity type.
     * @param maximumQuantity The maximum value that the activity statistics are being compared to. The unit for this
     *                        value should
     *                        match the allowed values for the quantityType.
     * 
     *                        API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("predicateForWorkoutActivitiesWithOperatorType:quantityType:maximumQuantity:")
    public static native NSPredicate predicateForWorkoutActivitiesWithOperatorTypeQuantityTypeMaximumQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity maximumQuantity);

    /**
     * predicateForWorkoutActivitiesWithOperatorType:quantityType:minimumQuantity:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches HKWorkoutActivity objetcs by the given operator type and minimumQuantity
     * in the
     * statistics for the specified type. The resulting predicate should be wrapped using
     * predicateForWorkoutsWithActivityPredicate:
     * before being used in a query.
     * 
     * @param operatorType    The operator type for the expression.
     * @param quantityType    The quantity type to compare statistics for. Should be a discrete quantity type.
     * @param minimumQuantity The minumum value that the activty statistics are being compared to. The unit for this
     *                        value should
     *                        match the allowed values for the quantityType.
     * 
     *                        API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("predicateForWorkoutActivitiesWithOperatorType:quantityType:minimumQuantity:")
    public static native NSPredicate predicateForWorkoutActivitiesWithOperatorTypeQuantityTypeMinimumQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity minimumQuantity);

    /**
     * predicateForWorkoutActivitiesWithOperatorType:quantityType:sumQuantity:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches HKWorkoutActivity objetcs by the given operator type and sumQuantity in
     * the
     * statistics for the specified type. The resulting predicate should be wrapped using
     * predicateForWorkoutsWithActivityPredicate:
     * before being used in a query.
     * 
     * @param operatorType The operator type for the expression.
     * @param quantityType The quantity type to compare statistics for. Should be a cumulative quantity type.
     * @param sumQuantity  The sum value that the activity statistics are being compared to. The unit for this value
     *                     should
     *                     match the allowed values for the quantityType.
     * 
     *                     API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("predicateForWorkoutActivitiesWithOperatorType:quantityType:sumQuantity:")
    public static native NSPredicate predicateForWorkoutActivitiesWithOperatorTypeQuantityTypeSumQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity sumQuantity);

    /**
     * predicateForWorkoutActivitiesWithStartDate:endDate:options:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches HKWorkoutActivity objects with a startDate and an endDate that lie inside
     * of a
     * given time interval. The resulting predicate should be wrapped using predicateForWorkoutsWithActivityPredicate:
     * before being used in a query.
     * 
     * @param startDate The start date of the predicate's time interval.
     * @param endDate   The end date of the predicate's time interval.
     * @param options   The rules for how a activity's time interval overlaps with the predicate's time interval.
     * 
     *                  API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("predicateForWorkoutActivitiesWithStartDate:endDate:options:")
    public static native NSPredicate predicateForWorkoutActivitiesWithStartDateEndDateOptions(
            @Nullable NSDate startDate, @Nullable NSDate endDate, @NUInt long options);

    /**
     * predicateForWorkoutActivitiesWithWorkoutActivityType:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches HKWorkoutActivity objects with the given HKWorkoutActivityType.
     * The resulting predicate should be wrapped using predicateForWorkoutsWithActivityPredicate: before being used in a
     * query.
     * 
     * @param workoutActivityType The HKWorkoutActivity type of the workout
     * 
     *                            API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("predicateForWorkoutActivitiesWithWorkoutActivityType:")
    public static native NSPredicate predicateForWorkoutActivitiesWithWorkoutActivityType(
            @NUInt long workoutActivityType);

    /**
     * predicateForWorkoutsWithActivityPredicate:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches workouts containing an activity matching the passed predicate.
     * 
     * @param activityPredicate The predicate on the activities of the workout
     * 
     *                          API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("predicateForWorkoutsWithActivityPredicate:")
    public static native NSPredicate predicateForWorkoutsWithActivityPredicate(@NotNull NSPredicate activityPredicate);

    /**
     * predicateForWorkoutsWithOperatorType:quantityType:averageQuantity:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches HKWorkouts by the given operator type and averageQuantity in the
     * statistics
     * for the specified type.
     * 
     * @param operatorType    The operator type for the expression.
     * @param quantityType    The quantity type to compare statistics for. Should be a discrete quantity type.
     * @param averageQuantity The average value that the workout statistics are being compared to. The unit for this
     *                        value should
     *                        match the allowed values for the quantityType.
     * 
     *                        API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:quantityType:averageQuantity:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeQuantityTypeAverageQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity averageQuantity);

    /**
     * predicateForWorkoutsWithOperatorType:quantityType:maximumQuantity:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches HKWorkouts by the given operator type and maximumQuantity in the
     * statistics
     * for the specified type.
     * 
     * @param operatorType    The operator type for the expression.
     * @param quantityType    The quantity type to compare statistics for. Should be a discrete quantity type.
     * @param maximumQuantity The maximum value that the workout statistics are being compared to. The unit for this
     *                        value should
     *                        match the allowed values for the quantityType.
     * 
     *                        API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:quantityType:maximumQuantity:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeQuantityTypeMaximumQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity maximumQuantity);

    /**
     * predicateForWorkoutsWithOperatorType:quantityType:minimumQuantity:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches HKWorkouts by the given operator type and minimumQuantity in the
     * statistics
     * for the specified type.
     * 
     * @param operatorType    The operator type for the expression.
     * @param quantityType    The quantity type to compare statistics for. Should be a discrete quantity type.
     * @param minimumQuantity The minumum value that the workout statistics are being compared to. The unit for this
     *                        value should
     *                        match the allowed values for the quantityType.
     * 
     *                        API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:quantityType:minimumQuantity:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeQuantityTypeMinimumQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity minimumQuantity);

    /**
     * predicateForWorkoutsWithOperatorType:quantityType:sumQuantity:
     * 
     * Creates a predicate for use with HKQuery subclasses.
     * 
     * Creates a query predicate that matches HKWorkouts by the given operator type and sumQuantity in the statistics
     * for
     * the specified type.
     * 
     * @param operatorType The operator type for the expression.
     * @param quantityType The quantity type to compare statistics for. Should be a cumulative quantity type.
     * @param sumQuantity  The sum value that the workout statistics are being compared to. The unit for this value
     *                     should
     *                     match the allowed values for the quantityType.
     * 
     *                     API-Since: 16.0
     */
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
