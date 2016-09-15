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
import org.moe.natj.general.ann.MappedReturn;
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
    @Owned
    @Selector("alloc")
    public static native HKQuery alloc();

    @Generated
    @Selector("init")
    public native HKQuery init();

    /**
     * predicate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKQuery_Class/index.html#//apple_ref/occ/instp/HKQuery/predicate">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicate")
    public native NSPredicate predicate();

    /**
     * predicateForCategorySamplesWithOperatorType:value:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKQuery_Class/index.html#//apple_ref/occ/clm/HKQuery/predicateForCategorySamplesWithOperatorType:value:">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicateForCategorySamplesWithOperatorType:value:")
    public static native NSPredicate predicateForCategorySamplesWithOperatorTypeValue(@NUInt long operatorType,
            @NInt long value);

    /**
     * predicateForObjectWithUUID:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKQuery_Class/index.html#//apple_ref/occ/clm/HKQuery/predicateForObjectWithUUID:">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicateForObjectWithUUID:")
    public static native NSPredicate predicateForObjectWithUUID(NSUUID UUID);

    /**
     * predicateForObjectsFromSource:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKQuery_Class/index.html#//apple_ref/occ/clm/HKQuery/predicateForObjectsFromSource:">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicateForObjectsFromSource:")
    public static native NSPredicate predicateForObjectsFromSource(HKSource source);

    /**
     * predicateForObjectsFromSources:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKQuery_Class/index.html#//apple_ref/occ/clm/HKQuery/predicateForObjectsFromSources:">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicateForObjectsFromSources:")
    public static native NSPredicate predicateForObjectsFromSources(NSSet<? extends HKSource> sources);

    /**
     * predicateForObjectsFromWorkout:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKQuery_Class/index.html#//apple_ref/occ/clm/HKQuery/predicateForObjectsFromWorkout:">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicateForObjectsFromWorkout:")
    public static native NSPredicate predicateForObjectsFromWorkout(HKWorkout workout);

    /**
     * predicateForObjectsWithMetadataKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKQuery_Class/index.html#//apple_ref/occ/clm/HKQuery/predicateForObjectsWithMetadataKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicateForObjectsWithMetadataKey:")
    public static native NSPredicate predicateForObjectsWithMetadataKey(String key);

    /**
     * predicateForObjectsWithMetadataKey:allowedValues:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKQuery_Class/index.html#//apple_ref/occ/clm/HKQuery/predicateForObjectsWithMetadataKey:allowedValues:">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicateForObjectsWithMetadataKey:allowedValues:")
    public static native NSPredicate predicateForObjectsWithMetadataKeyAllowedValues(String key,
            NSArray<?> allowedValues);

    /**
     * predicateForObjectsWithMetadataKey:operatorType:value:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKQuery_Class/index.html#//apple_ref/occ/clm/HKQuery/predicateForObjectsWithMetadataKey:operatorType:value:">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicateForObjectsWithMetadataKey:operatorType:value:")
    public static native NSPredicate predicateForObjectsWithMetadataKeyOperatorTypeValue(String key,
            @NUInt long operatorType, @Mapped(ObjCObjectMapper.class) Object value);

    /**
     * predicateForObjectsWithNoCorrelation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKQuery_Class/index.html#//apple_ref/occ/clm/HKQuery/predicateForObjectsWithNoCorrelation">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicateForObjectsWithNoCorrelation")
    public static native NSPredicate predicateForObjectsWithNoCorrelation();

    /**
     * predicateForObjectsWithUUIDs:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKQuery_Class/index.html#//apple_ref/occ/clm/HKQuery/predicateForObjectsWithUUIDs:">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicateForObjectsWithUUIDs:")
    public static native NSPredicate predicateForObjectsWithUUIDs(NSSet<? extends NSUUID> UUIDs);

    /**
     * predicateForQuantitySamplesWithOperatorType:quantity:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKQuery_Class/index.html#//apple_ref/occ/clm/HKQuery/predicateForQuantitySamplesWithOperatorType:quantity:">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicateForQuantitySamplesWithOperatorType:quantity:")
    public static native NSPredicate predicateForQuantitySamplesWithOperatorTypeQuantity(@NUInt long operatorType,
            HKQuantity quantity);

    /**
     * predicateForSamplesWithStartDate:endDate:options:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKQuery_Class/index.html#//apple_ref/occ/clm/HKQuery/predicateForSamplesWithStartDate:endDate:options:">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicateForSamplesWithStartDate:endDate:options:")
    public static native NSPredicate predicateForSamplesWithStartDateEndDateOptions(NSDate startDate, NSDate endDate,
            @NUInt long options);

    /**
     * predicateForWorkoutsWithOperatorType:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKQuery_Class/index.html#//apple_ref/occ/clm/HKQuery/predicateForWorkoutsWithOperatorType:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:duration:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeDuration(@NUInt long operatorType,
            double duration);

    /**
     * predicateForWorkoutsWithOperatorType:totalDistance:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKQuery_Class/index.html#//apple_ref/occ/clm/HKQuery/predicateForWorkoutsWithOperatorType:totalDistance:">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:totalDistance:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalDistance(@NUInt long operatorType,
            HKQuantity totalDistance);

    /**
     * predicateForWorkoutsWithOperatorType:totalEnergyBurned:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKQuery_Class/index.html#//apple_ref/occ/clm/HKQuery/predicateForWorkoutsWithOperatorType:totalEnergyBurned:">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:totalEnergyBurned:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalEnergyBurned(@NUInt long operatorType,
            HKQuantity totalEnergyBurned);

    /**
     * predicateForWorkoutsWithWorkoutActivityType:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKQuery_Class/index.html#//apple_ref/occ/clm/HKQuery/predicateForWorkoutsWithWorkoutActivityType:">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicateForWorkoutsWithWorkoutActivityType:")
    public static native NSPredicate predicateForWorkoutsWithWorkoutActivityType(@NUInt long workoutActivityType);

    /**
     * sampleType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKQuery_Class/index.html#//apple_ref/occ/instp/HKQuery/sampleType">iOS Dev Center</a>
     */
    @Generated
    @Selector("sampleType")
    public native HKSampleType sampleType();

    /**
     * predicateForObjectsFromDevices:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKQuery_Class/index.html#//apple_ref/occ/clm/HKQuery/predicateForObjectsFromDevices:">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicateForObjectsFromDevices:")
    public static native NSPredicate predicateForObjectsFromDevices(NSSet<? extends HKDevice> devices);

    /**
     * predicateForObjectsFromSourceRevisions:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKQuery_Class/index.html#//apple_ref/occ/clm/HKQuery/predicateForObjectsFromSourceRevisions:">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicateForObjectsFromSourceRevisions:")
    public static native NSPredicate predicateForObjectsFromSourceRevisions(
            NSSet<? extends HKSourceRevision> sourceRevisions);

    /**
     * predicateForObjectsWithDeviceProperty:allowedValues:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKQuery_Class/index.html#//apple_ref/occ/clm/HKQuery/predicateForObjectsWithDeviceProperty:allowedValues:">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicateForObjectsWithDeviceProperty:allowedValues:")
    public static native NSPredicate predicateForObjectsWithDevicePropertyAllowedValues(String key,
            NSSet<String> allowedValues);

    /**
     * objectType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKQuery_Class/index.html#//apple_ref/occ/instp/HKQuery/objectType">iOS Dev Center</a>
     */
    @Generated
    @Selector("objectType")
    public native HKObjectType objectType();

    /**
     * predicateForActivitySummariesBetweenStartDateComponents:endDateComponents:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKQuery_Class/index.html#//apple_ref/occ/clm/HKQuery/predicateForActivitySummariesBetweenStartDateComponents:endDateComponents:">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicateForActivitySummariesBetweenStartDateComponents:endDateComponents:")
    public static native NSPredicate predicateForActivitySummariesBetweenStartDateComponentsEndDateComponents(
            NSDateComponents startDateComponents, NSDateComponents endDateComponents);

    /**
     * predicateForActivitySummaryWithDateComponents:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKQuery_Class/index.html#//apple_ref/occ/clm/HKQuery/predicateForActivitySummaryWithDateComponents:">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicateForActivitySummaryWithDateComponents:")
    public static native NSPredicate predicateForActivitySummaryWithDateComponents(NSDateComponents dateComponents);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

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
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version();
}
