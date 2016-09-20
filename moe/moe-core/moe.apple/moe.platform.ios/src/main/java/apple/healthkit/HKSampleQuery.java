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
    @Owned
    @Selector("alloc")
    public static native HKSampleQuery alloc();

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
     * initWithSampleType:predicate:limit:sortDescriptors:resultsHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKSampleQuery_Class/index.html#//apple_ref/occ/instm/HKSampleQuery/initWithSampleType:predicate:limit:sortDescriptors:resultsHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithSampleType:predicate:limit:sortDescriptors:resultsHandler:")
    public native HKSampleQuery initWithSampleTypePredicateLimitSortDescriptorsResultsHandler(HKSampleType sampleType,
            NSPredicate predicate, @NUInt long limit, NSArray<? extends NSSortDescriptor> sortDescriptors,
            @ObjCBlock(name = "call_initWithSampleTypePredicateLimitSortDescriptorsResultsHandler") Block_initWithSampleTypePredicateLimitSortDescriptorsResultsHandler resultsHandler);

    /**
     * limit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKSampleQuery_Class/index.html#//apple_ref/occ/instp/HKSampleQuery/limit">iOS Dev Center</a>
     */
    @Generated
    @Selector("limit")
    @NUInt
    public native long limit();

    /**
     * sortDescriptors</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKSampleQuery_Class/index.html#//apple_ref/occ/instp/HKSampleQuery/sortDescriptors">iOS Dev Center</a>
     */
    @Generated
    @Selector("sortDescriptors")
    public native NSArray<? extends NSSortDescriptor> sortDescriptors();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithSampleTypePredicateLimitSortDescriptorsResultsHandler {
        @Generated
        void call_initWithSampleTypePredicateLimitSortDescriptorsResultsHandler(HKSampleQuery arg0,
                NSArray<? extends HKSample> arg1, NSError arg2);
    }
}
