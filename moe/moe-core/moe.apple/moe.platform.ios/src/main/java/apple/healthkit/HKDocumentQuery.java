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
import org.moe.natj.general.ann.MappedReturn;
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
 * HKDocumentQuery
 * 
 * A concrete subclass of HKQuery that provides an interface to retrieve documents from the Health store.
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKDocumentQuery extends HKQuery {
    static {
        NatJ.register();
    }

    @Generated
    protected HKDocumentQuery(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKDocumentQuery alloc();

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

    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:totalDistance:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalDistance(@NUInt long operatorType,
            HKQuantity totalDistance);

    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:totalEnergyBurned:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalEnergyBurned(@NUInt long operatorType,
            HKQuantity totalEnergyBurned);

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

    /**
     * [@property]      includeDocumentData
     * 
     * The XML content for documents may be large.  This property can be used to control whether the query
     *                returns the XML content for each record.
     */
    @Generated
    @Selector("includeDocumentData")
    public native boolean includeDocumentData();

    @Generated
    @Selector("init")
    public native HKDocumentQuery init();

    /**
     * initWithDocumentType:predicate:limit:sortDescriptors:includeDocumentData:resultsHandler:
     * 
     * Returns a query that will retrieve HKDocumentSamples matching the given predicate.
     * 
     * Health documents may contain sensitive data that a user may want to control explicitly. HKDocumentSample
     *                objects returned by HKSampleQuery and HKAnchoredObjectQuery do not include this data (i.e., the document
     *                property is nil).  This query can be used to retrieve fully populated HKDocumentSample instances.  The 
     *                query will prompt the user to authorize your app to read individual documents.  The query will then
     *                return the documents that your app is authorized to read. The user will only be asked to authorize your
     *                app to read documents that are new since the last time an HKDocumentQuery was executed.
     * 
     * @param         documentType        The type of document to retreive.
     * @param         predicate           The predicate which documents should match.
     * @param         limit               The maximum number of documents to return.  Pass HKObjectQueryNoLimit for no limit.
     * @param         sortDescriptors     The sort descriptors to use to order the resulting documents.
     * @param         includeDocumentData If true, the document content will be returned with the HKDocumentSample instance.
     *                                    This option can be used to limit the size of the content returned since the content
     *                                    may be large.
     * @param         resultsHandler      The block that will receive query results.  Results will be returned incrementally
     *                                    through several calls to this block.  When there are no more results, the done 
     *                                    parameter will be YES and the results array will be empty.  If results is nil, then
     *                                    an error has occurred and the error parameter will be set.  Delivery of results can
     *                                    be stopped by calling HKHealthStore's stopQuery: method.
     */
    @Generated
    @Selector("initWithDocumentType:predicate:limit:sortDescriptors:includeDocumentData:resultsHandler:")
    public native HKDocumentQuery initWithDocumentTypePredicateLimitSortDescriptorsIncludeDocumentDataResultsHandler(
            HKDocumentType documentType, NSPredicate predicate, @NUInt long limit,
            NSArray<? extends NSSortDescriptor> sortDescriptors, boolean includeDocumentData,
            @ObjCBlock(name = "call_initWithDocumentTypePredicateLimitSortDescriptorsIncludeDocumentDataResultsHandler") Block_initWithDocumentTypePredicateLimitSortDescriptorsIncludeDocumentDataResultsHandler resultsHandler);

    /**
     * [@property]      limit
     * 
     * The maximum number of documents the receiver will return upon completion.
     */
    @Generated
    @Selector("limit")
    @NUInt
    public native long limit();

    /**
     * [@property]      sortDescriptors
     * 
     * An array of NSSortDescriptors.
     */
    @Generated
    @Selector("sortDescriptors")
    public native NSArray<? extends NSSortDescriptor> sortDescriptors();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithDocumentTypePredicateLimitSortDescriptorsIncludeDocumentDataResultsHandler {
        @Generated
        void call_initWithDocumentTypePredicateLimitSortDescriptorsIncludeDocumentDataResultsHandler(
                HKDocumentQuery query, NSArray<? extends HKDocumentSample> results, boolean done, NSError error);
    }

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
}
