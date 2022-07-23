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
    public static native HKQuery new_objc();

    /**
     * predicateForActivitySummariesBetweenStartDateComponents:endDateComponents:
     * <p>
     * Creates a predicate for use with HKActivitySummaryQuery
     * <p>
     * Creates a query predicate that matches HKActivitySummaries that fall between the given date components.
     *
     * @param startDateComponents The date components that define the beginning of the range. These date components
     *                            should contain
     *                            era, year, month, and day components in the gregorian calendar.
     * @param endDateComponents   The date components that define the end of the range. These date components should
     *                            contain era,
     *                            year, month, and day components in the gregorian calendar.
     */
    @Generated
    @Selector("predicateForActivitySummariesBetweenStartDateComponents:endDateComponents:")
    public static native NSPredicate predicateForActivitySummariesBetweenStartDateComponentsEndDateComponents(
            NSDateComponents startDateComponents, NSDateComponents endDateComponents);

    /**
     * predicateForActivitySummaryWithDateComponents:
     * <p>
     * Creates a predicate for use with HKActivitySummaryQuery
     * <p>
     * Creates a query predicate that matches HKActivitySummaries with the given date components.
     *
     * @param dateComponents The date components of the activity summary. These date components should contain era,
     *                       year, month,
     *                       and day components in the gregorian calendar.
     */
    @Generated
    @Selector("predicateForActivitySummaryWithDateComponents:")
    public static native NSPredicate predicateForActivitySummaryWithDateComponents(NSDateComponents dateComponents);

    /**
     * predicateForCategorySamplesWithOperatorType:value:
     * <p>
     * Creates a predicate for use with HKQuery subclasses.
     * <p>
     * Creates a query predicate that matches category samples with values that match the expression formed by
     * the given operator and value.
     *
     * @param operatorType The operator type for the expression.
     * @param value        The value that the sample's value is being compared to. It is the right hand side of the
     *                     expression.
     */
    @Generated
    @Selector("predicateForCategorySamplesWithOperatorType:value:")
    public static native NSPredicate predicateForCategorySamplesWithOperatorTypeValue(@NUInt long operatorType,
            @NInt long value);

    /**
     * predicateForObjectWithUUID:
     * <p>
     * Creates a predicate for use with HKQuery subclasses.
     * <p>
     * Creates a query predicate that matches the object saved with a particular UUID.
     *
     * @param UUID The UUID of the object.
     */
    @Generated
    @Selector("predicateForObjectWithUUID:")
    public static native NSPredicate predicateForObjectWithUUID(NSUUID UUID);

    /**
     * predicateForObjectsFromDevices:
     * <p>
     * Creates a predicate for use with HKQuery subclasses.
     * <p>
     * Creates a query predicate that matches objects associated with any of the given devices. All properties
     * of each HKDevice are considered in the query and must match exactly, including nil values. To perform
     * searches based on specific device properties, use predicateForObjectsWithDeviceProperty:allowedValues:.
     *
     * @param devices The set of devices that generated data.
     */
    @Generated
    @Selector("predicateForObjectsFromDevices:")
    public static native NSPredicate predicateForObjectsFromDevices(NSSet<? extends HKDevice> devices);

    /**
     * predicateForObjectsFromSource:
     * <p>
     * Creates a predicate for use with HKQuery subclasses.
     * <p>
     * Creates a query predicate that matches objects saved by a given source.
     *
     * @param source The source.
     */
    @Generated
    @Selector("predicateForObjectsFromSource:")
    public static native NSPredicate predicateForObjectsFromSource(HKSource source);

    /**
     * predicateForObjectsFromSourceRevisions:
     * <p>
     * Creates a predicate for use with HKQuery subclasses.
     * <p>
     * Creates a query predicate that matches objects saved by any of the specified HKSourceRevisions.
     *
     * @param sourceRevisions The list of source revisions.
     */
    @Generated
    @Selector("predicateForObjectsFromSourceRevisions:")
    public static native NSPredicate predicateForObjectsFromSourceRevisions(
            NSSet<? extends HKSourceRevision> sourceRevisions);

    /**
     * predicateForObjectsFromSources:
     * <p>
     * Creates a predicate for use with HKQuery subclasses.
     * <p>
     * Creates a query predicate that matches objects saved by any of the given sources.
     *
     * @param sources The list of sources.
     */
    @Generated
    @Selector("predicateForObjectsFromSources:")
    public static native NSPredicate predicateForObjectsFromSources(NSSet<? extends HKSource> sources);

    /**
     * predicateForObjectsFromWorkout:
     * <p>
     * Creates a predicate for use with HKQuery subclasses.
     * <p>
     * Creates a query predicate that matches the objects that have been added to the given workout.
     *
     * @param workout The HKWorkout that the object was added to.
     */
    @Generated
    @Selector("predicateForObjectsFromWorkout:")
    public static native NSPredicate predicateForObjectsFromWorkout(HKWorkout workout);

    /**
     * predicateForObjectsWithDeviceProperty:allowedValues:
     * <p>
     * Creates a predicate for use with HKQuery subclasses.
     * <p>
     * Creates a query predicate that matches objects associated with an HKDevice with the specified device
     * property matching any value included in allowedValues. To query for samples with devices that match all
     * the properties of an HKDevice, use predicateForObjectsFromDevices.
     *
     * @param key           The device property key. (See HKDevice.h)
     * @param allowedValues The set of values for which the device property can match. An empty set will match all
     *                      devices whose property value is nil.
     */
    @Generated
    @Selector("predicateForObjectsWithDeviceProperty:allowedValues:")
    public static native NSPredicate predicateForObjectsWithDevicePropertyAllowedValues(String key,
            NSSet<String> allowedValues);

    /**
     * predicateForObjectsWithMetadataKey:
     * <p>
     * Creates a predicate for use with HKQuery subclasses.
     * <p>
     * Creates a query predicate that matches objects with metadata that contains a given key.
     *
     * @param key The metadata key.
     */
    @Generated
    @Selector("predicateForObjectsWithMetadataKey:")
    public static native NSPredicate predicateForObjectsWithMetadataKey(String key);

    /**
     * predicateForObjectsWithMetadataKey:allowedValues:
     * <p>
     * Creates a predicate for use with HKQuery subclasses
     * <p>
     * Creates a query predicate that matches objects with metadata containing a value the matches one of the
     * given values for the given key.
     *
     * @param key           The metadata key.
     * @param allowedValues The list of values that the metadata value can be equal to.
     */
    @Generated
    @Selector("predicateForObjectsWithMetadataKey:allowedValues:")
    public static native NSPredicate predicateForObjectsWithMetadataKeyAllowedValues(String key,
            NSArray<?> allowedValues);

    /**
     * predicateForObjectsWithMetadataKey:operatorType:value:
     * <p>
     * Creates a predicate for use with HKQuery subclasses
     * <p>
     * Creates a query predicate that matches objects with a value for a given metadata key matches the given
     * operator type and value.
     *
     * @param key          The metadata key.
     * @param operatorType The comparison operator type for the expression.
     * @param value        The value to be compared against.
     */
    @Generated
    @Selector("predicateForObjectsWithMetadataKey:operatorType:value:")
    public static native NSPredicate predicateForObjectsWithMetadataKeyOperatorTypeValue(String key,
            @NUInt long operatorType, @Mapped(ObjCObjectMapper.class) Object value);

    /**
     * predicateForObjectsNoCorrelation
     * <p>
     * Creates a predicate for use with HKQuery subclasses.
     * <p>
     * Creates a query predicate that matches the objects that are not associated with an HKCorrelation.
     */
    @Generated
    @Selector("predicateForObjectsWithNoCorrelation")
    public static native NSPredicate predicateForObjectsWithNoCorrelation();

    /**
     * predicateForObjectsWithUUIDs:
     * <p>
     * Creates a predicate for use with HKQuery subclasses.
     * <p>
     * Creates a query predicate that matches the objects saved with one of the given UUIDs.
     *
     * @param UUIDs The set of NSUUIDs.
     */
    @Generated
    @Selector("predicateForObjectsWithUUIDs:")
    public static native NSPredicate predicateForObjectsWithUUIDs(NSSet<? extends NSUUID> UUIDs);

    /**
     * predicateForQuantitySamplesWithOperatorType:quantity:
     * <p>
     * Creates a predicate for use with HKQuery subclasses.
     * <p>
     * Creates a query predicate that matches quantity samples with values that match the expression formed by
     * the given operator and quantity.
     *
     * @param operatorType The operator type for the expression.
     * @param quantity     The quantity that the sample's quantity is being compared to. It is the right hand side
     *                     of the expression.
     */
    @Generated
    @Selector("predicateForQuantitySamplesWithOperatorType:quantity:")
    public static native NSPredicate predicateForQuantitySamplesWithOperatorTypeQuantity(@NUInt long operatorType,
            HKQuantity quantity);

    /**
     * predicateForSamplesWithStartDate:endDate:options:
     * <p>
     * Creates a predicate for use with HKQuery subclasses.
     * <p>
     * Creates a query predicate that matches samples with a startDate and an endDate that lie inside of a
     * given time interval.
     *
     * @param startDate The start date of the predicate's time interval.
     * @param endDate   The end date of the predicate's time interval.
     * @param options   The rules for how a sample's time interval overlaps with the predicate's time interval.
     */
    @Generated
    @Selector("predicateForSamplesWithStartDate:endDate:options:")
    public static native NSPredicate predicateForSamplesWithStartDateEndDateOptions(NSDate startDate, NSDate endDate,
            @NUInt long options);

    /**
     * predicateForWorkoutsWithOperatorType:duration:
     * <p>
     * Creates a predicate for use with HKQuery subclasses.
     * <p>
     * Creates a query predicate that matches HKWorkouts by the given operator type and duration
     *
     * @param operatorType The operator type for the expression.
     * @param duration     The value that the workout's duration is being compared to. It is the right hand side of the
     *                     expression.
     */
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:duration:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeDuration(@NUInt long operatorType,
            double duration);

    /**
     * predicateForWorkoutsWithOperatorType:totalDistance:
     * <p>
     * Creates a predicate for use with HKQuery subclasses.
     * <p>
     * Creates a query predicate that matches HKWorkouts by the given operator type and totalEnergyBurned
     *
     * @param operatorType  The operator type for the expression.
     * @param totalDistance The value that the workout's totalEnergyBurned is being compared to. It is the right hand
     *                      side of the
     *                      expression. The unit for this value should be of type Distance.
     */
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:totalDistance:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalDistance(@NUInt long operatorType,
            HKQuantity totalDistance);

    /**
     * predicateForWorkoutsWithOperatorType:totalEnergyBurned:
     * <p>
     * Creates a predicate for use with HKQuery subclasses.
     * <p>
     * Creates a query predicate that matches HKWorkouts by the given operator type and totalEnergyBurned
     *
     * @param operatorType      The operator type for the expression.
     * @param totalEnergyBurned The value that the workout's totalEnergyBurned is being compared to. It is the right
     *                          hand side of the
     *                          expression. The unit for this value should be of type Energy.
     */
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:totalEnergyBurned:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalEnergyBurned(@NUInt long operatorType,
            HKQuantity totalEnergyBurned);

    /**
     * predicateForWorkoutsWithOperatorType:totalSwimmingStrokeCount:
     * <p>
     * Creates a predicate for use with HKQuery subclasses.
     * <p>
     * Creates a query predicate that matches HKWorkouts by the given operator type and totalSwimmingStrokeCount
     *
     * @param operatorType             The operator type for the expression.
     * @param totalSwimmingStrokeCount The value that the workout's totalSwimmingStrokeCount is being compared to.
     *                                 It is the right hand side of the expression. The unit for this value should
     *                                 be of type Count.
     */
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:totalSwimmingStrokeCount:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalSwimmingStrokeCount(
            @NUInt long operatorType, HKQuantity totalSwimmingStrokeCount);

    /**
     * predicateForWorkoutsWithWorkoutActivityType:
     * <p>
     * Creates a predicate for use with HKQuery subclasses.
     * <p>
     * Creates a query predicate that matches HKWorkouts with the given HKWorkoutActivityType.
     *
     * @param workoutActivityType The HKWorkoutActivity type of the workout
     */
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

    @Generated
    @Selector("objectType")
    public native HKObjectType objectType();

    @Generated
    @Selector("predicate")
    public native NSPredicate predicate();

    @Generated
    @Selector("sampleType")
    public native HKSampleType sampleType();

    /**
     * predicateForWorkoutsWithOperatorType:totalFlightsClimbed:
     * <p>
     * Creates a predicate for use with HKQuery subclasses.
     * <p>
     * Creates a query predicate that matches HKWorkouts by the given operator type and totalFlightsClimbed
     *
     * @param operatorType        The operator type for the expression.
     * @param totalFlightsClimbed The value that the workout's totalFlightsClimbed is being compared to.
     *                            It is the right hand side of the expression. The unit for this value should
     *                            be of type Count.
     */
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:totalFlightsClimbed:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalFlightsClimbed(@NUInt long operatorType,
            HKQuantity totalFlightsClimbed);

    /**
     * predicateForClinicalRecordsFromSource:withFHIRResourceType:identifier:
     * <p>
     * Creates a predicate for use with HKQuery subclasses.
     * <p>
     * Creates a query predicate that matches HKClinicalRecords for a given source, FHIR resource type, and FHIR
     * identifier.
     *
     * @param source       The source.
     * @param resourceType The FHIR resource type.
     * @param identifier   The FHIR identifier.
     */
    @Generated
    @Selector("predicateForClinicalRecordsFromSource:FHIRResourceType:identifier:")
    public static native NSPredicate predicateForClinicalRecordsFromSourceFHIRResourceTypeIdentifier(HKSource source,
            String resourceType, String identifier);

    /**
     * predicateForClinicalRecordsWithFHIRResourceType:
     * <p>
     * Creates a predicate for use with HKQuery subclasses.
     * <p>
     * Creates a query predicate that matches HKClinicalRecords with a specific FHIR resource type.
     *
     * @param resourceType The FHIR resource type.
     */
    @Generated
    @Selector("predicateForClinicalRecordsWithFHIRResourceType:")
    public static native NSPredicate predicateForClinicalRecordsWithFHIRResourceType(String resourceType);

    /**
     * predicateForElectrocardiogramsWithClassification:
     * <p>
     * Creates a predicate for use with HKQuery subclasses.
     * <p>
     * Creates a query predicate that matches HKElectrocardiograms with a specific classification.
     *
     * @param classification The classification for the electrocardiogram.
     */
    @Generated
    @Selector("predicateForElectrocardiogramsWithClassification:")
    public static native NSPredicate predicateForElectrocardiogramsWithClassification(@NInt long classification);

    /**
     * predicateForElectrocardiogramsWithSymptomsStatus:
     * <p>
     * Creates a predicate for use with HKQuery subclasses.
     * <p>
     * Creates a query predicate that matches HKElectrocardiograms with a specificied symptoms status.
     *
     * @param symptomsStatus The symptoms status for the electrocardiogram.
     */
    @Generated
    @Selector("predicateForElectrocardiogramsWithSymptomsStatus:")
    public static native NSPredicate predicateForElectrocardiogramsWithSymptomsStatus(@NInt long symptomsStatus);

    /**
     * predicateForObjectsAssociatedWithElectrocardiogram:
     * <p>
     * Creates a predicate for use with HKQuery subclasses.
     * <p>
     * Creates a query predicate that matches the objects that have been added to the given electrocardiogram
     *
     * @param electrocardiogram The HKElectrocardiogram that the object was added to.
     */
    @Generated
    @Selector("predicateForObjectsAssociatedWithElectrocardiogram:")
    public static native NSPredicate predicateForObjectsAssociatedWithElectrocardiogram(
            HKElectrocardiogram electrocardiogram);

    /**
     * predicateForVerifiableClinicalRecordsWithRelevantDateWithinDateInterval:
     * <p>
     * Creates a predicate for use with HKQuery subclasses.
     * <p>
     * Creates a predicate that matches HKVerifiableClinicalRecords with a relevant date within a date interval.
     *
     * @param dateInterval The date interval that the record's relevant date is in.
     */
    @Generated
    @Selector("predicateForVerifiableClinicalRecordsWithRelevantDateWithinDateInterval:")
    public static native NSPredicate predicateForVerifiableClinicalRecordsWithRelevantDateWithinDateInterval(
            NSDateInterval dateInterval);
}
