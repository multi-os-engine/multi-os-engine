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
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPredicate;
import apple.foundation.NSSet;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
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
public class HKHealthStore extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected HKHealthStore(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKHealthStore alloc();

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
    @Selector("isHealthDataAvailable")
    public static native boolean isHealthDataAvailable();

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
    @Selector("addSamples:toWorkout:completion:")
    public native void addSamplesToWorkoutCompletion(NSArray<? extends HKSample> samples, HKWorkout workout,
            @ObjCBlock(name = "call_addSamplesToWorkoutCompletion") Block_addSamplesToWorkoutCompletion completion);

    @Generated
    @Selector("authorizationStatusForType:")
    @NInt
    public native long authorizationStatusForType(HKObjectType type);

    @Generated
    @Selector("biologicalSexWithError:")
    public native HKBiologicalSexObject biologicalSexWithError(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("bloodTypeWithError:")
    public native HKBloodTypeObject bloodTypeWithError(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("dateOfBirthComponentsWithError:")
    public native NSDateComponents dateOfBirthComponentsWithError(
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("dateOfBirthWithError:")
    public native NSDate dateOfBirthWithError(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("deleteObject:withCompletion:")
    public native void deleteObjectWithCompletion(HKObject object,
            @ObjCBlock(name = "call_deleteObjectWithCompletion") Block_deleteObjectWithCompletion completion);

    @Generated
    @Selector("deleteObjects:withCompletion:")
    public native void deleteObjectsWithCompletion(NSArray<? extends HKObject> objects,
            @ObjCBlock(name = "call_deleteObjectsWithCompletion") Block_deleteObjectsWithCompletion completion);

    @Generated
    @Selector("deleteObjectsOfType:predicate:withCompletion:")
    public native void deleteObjectsOfTypePredicateWithCompletion(HKObjectType objectType, NSPredicate predicate,
            @ObjCBlock(name = "call_deleteObjectsOfTypePredicateWithCompletion") Block_deleteObjectsOfTypePredicateWithCompletion completion);

    @Generated
    @Selector("disableAllBackgroundDeliveryWithCompletion:")
    public native void disableAllBackgroundDeliveryWithCompletion(
            @ObjCBlock(name = "call_disableAllBackgroundDeliveryWithCompletion") Block_disableAllBackgroundDeliveryWithCompletion completion);

    @Generated
    @Selector("disableBackgroundDeliveryForType:withCompletion:")
    public native void disableBackgroundDeliveryForTypeWithCompletion(HKObjectType type,
            @ObjCBlock(name = "call_disableBackgroundDeliveryForTypeWithCompletion") Block_disableBackgroundDeliveryForTypeWithCompletion completion);

    @Generated
    @Selector("earliestPermittedSampleDate")
    public native NSDate earliestPermittedSampleDate();

    @Generated
    @Selector("enableBackgroundDeliveryForType:frequency:withCompletion:")
    public native void enableBackgroundDeliveryForTypeFrequencyWithCompletion(HKObjectType type, @NInt long frequency,
            @ObjCBlock(name = "call_enableBackgroundDeliveryForTypeFrequencyWithCompletion") Block_enableBackgroundDeliveryForTypeFrequencyWithCompletion completion);

    @Generated
    @Selector("executeQuery:")
    public native void executeQuery(HKQuery query);

    @Generated
    @Selector("fitzpatrickSkinTypeWithError:")
    public native HKFitzpatrickSkinTypeObject fitzpatrickSkinTypeWithError(
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("handleAuthorizationForExtensionWithCompletion:")
    public native void handleAuthorizationForExtensionWithCompletion(
            @ObjCBlock(name = "call_handleAuthorizationForExtensionWithCompletion") Block_handleAuthorizationForExtensionWithCompletion completion);

    @Generated
    @Selector("init")
    public native HKHealthStore init();

    @Generated
    @Selector("preferredUnitsForQuantityTypes:completion:")
    public native void preferredUnitsForQuantityTypesCompletion(NSSet<? extends HKQuantityType> quantityTypes,
            @ObjCBlock(name = "call_preferredUnitsForQuantityTypesCompletion") Block_preferredUnitsForQuantityTypesCompletion completion);

    @Generated
    @Selector("requestAuthorizationToShareTypes:readTypes:completion:")
    public native void requestAuthorizationToShareTypesReadTypesCompletion(NSSet<? extends HKSampleType> typesToShare,
            NSSet<? extends HKObjectType> typesToRead,
            @ObjCBlock(name = "call_requestAuthorizationToShareTypesReadTypesCompletion") Block_requestAuthorizationToShareTypesReadTypesCompletion completion);

    @Generated
    @Selector("saveObject:withCompletion:")
    public native void saveObjectWithCompletion(HKObject object,
            @ObjCBlock(name = "call_saveObjectWithCompletion") Block_saveObjectWithCompletion completion);

    @Generated
    @Selector("saveObjects:withCompletion:")
    public native void saveObjectsWithCompletion(NSArray<? extends HKObject> objects,
            @ObjCBlock(name = "call_saveObjectsWithCompletion") Block_saveObjectsWithCompletion completion);

    @Generated
    @Selector("splitTotalEnergy:startDate:endDate:resultsHandler:")
    public native void splitTotalEnergyStartDateEndDateResultsHandler(HKQuantity totalEnergy, NSDate startDate,
            NSDate endDate,
            @ObjCBlock(name = "call_splitTotalEnergyStartDateEndDateResultsHandler") Block_splitTotalEnergyStartDateEndDateResultsHandler resultsHandler);

    @Generated
    @Selector("startWatchAppWithWorkoutConfiguration:completion:")
    public native void startWatchAppWithWorkoutConfigurationCompletion(HKWorkoutConfiguration workoutConfiguration,
            @ObjCBlock(name = "call_startWatchAppWithWorkoutConfigurationCompletion") Block_startWatchAppWithWorkoutConfigurationCompletion completion);

    @Generated
    @Selector("stopQuery:")
    public native void stopQuery(HKQuery query);

    @Generated
    @Selector("wheelchairUseWithError:")
    public native HKWheelchairUseObject wheelchairUseWithError(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addSamplesToWorkoutCompletion {
        @Generated
        void call_addSamplesToWorkoutCompletion(boolean success, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteObjectWithCompletion {
        @Generated
        void call_deleteObjectWithCompletion(boolean success, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteObjectsWithCompletion {
        @Generated
        void call_deleteObjectsWithCompletion(boolean success, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteObjectsOfTypePredicateWithCompletion {
        @Generated
        void call_deleteObjectsOfTypePredicateWithCompletion(boolean success, @NUInt long deletedObjectCount,
                NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_disableAllBackgroundDeliveryWithCompletion {
        @Generated
        void call_disableAllBackgroundDeliveryWithCompletion(boolean success, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_disableBackgroundDeliveryForTypeWithCompletion {
        @Generated
        void call_disableBackgroundDeliveryForTypeWithCompletion(boolean success, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enableBackgroundDeliveryForTypeFrequencyWithCompletion {
        @Generated
        void call_enableBackgroundDeliveryForTypeFrequencyWithCompletion(boolean success, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleAuthorizationForExtensionWithCompletion {
        @Generated
        void call_handleAuthorizationForExtensionWithCompletion(boolean success, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_preferredUnitsForQuantityTypesCompletion {
        @Generated
        void call_preferredUnitsForQuantityTypesCompletion(
                NSDictionary<? extends HKQuantityType, ? extends HKUnit> preferredUnits, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAuthorizationToShareTypesReadTypesCompletion {
        @Generated
        void call_requestAuthorizationToShareTypesReadTypesCompletion(boolean success, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveObjectWithCompletion {
        @Generated
        void call_saveObjectWithCompletion(boolean success, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveObjectsWithCompletion {
        @Generated
        void call_saveObjectsWithCompletion(boolean success, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_splitTotalEnergyStartDateEndDateResultsHandler {
        @Generated
        void call_splitTotalEnergyStartDateEndDateResultsHandler(HKQuantity restingEnergy, HKQuantity activeEnergy,
                NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startWatchAppWithWorkoutConfigurationCompletion {
        @Generated
        void call_startWatchAppWithWorkoutConfigurationCompletion(boolean success, NSError error);
    }

    @Generated
    @Selector("getRequestStatusForAuthorizationToShareTypes:readTypes:completion:")
    public native void getRequestStatusForAuthorizationToShareTypesReadTypesCompletion(
            NSSet<? extends HKSampleType> typesToShare, NSSet<? extends HKObjectType> typesToRead,
            @ObjCBlock(name = "call_getRequestStatusForAuthorizationToShareTypesReadTypesCompletion") Block_getRequestStatusForAuthorizationToShareTypesReadTypesCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getRequestStatusForAuthorizationToShareTypesReadTypesCompletion {
        @Generated
        void call_getRequestStatusForAuthorizationToShareTypesReadTypesCompletion(@NInt long requestStatus,
                NSError error);
    }

    @Generated
    @Selector("supportsHealthRecords")
    public native boolean supportsHealthRecords();

    @Generated
    @Selector("activityMoveModeWithError:")
    public native HKActivityMoveModeObject activityMoveModeWithError(
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}
