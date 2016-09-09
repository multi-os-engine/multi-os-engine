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

package ios.healthkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSDate;
import ios.foundation.NSDictionary;
import ios.foundation.NSError;
import ios.foundation.NSPredicate;
import ios.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSMethodSignature;

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

	/**
	 * addSamples:toWorkout:completion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKHealthStore_Class/index.html#//apple_ref/occ/instm/HKHealthStore/addSamples:toWorkout:completion:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addSamples:toWorkout:completion:")
	public native void addSamplesToWorkoutCompletion(
			NSArray<? extends HKSample> samples,
			HKWorkout workout,
			@ObjCBlock(name = "call_addSamplesToWorkoutCompletion") Block_addSamplesToWorkoutCompletion completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_addSamplesToWorkoutCompletion {
		@Generated
		void call_addSamplesToWorkoutCompletion(boolean arg0,
				NSError arg1);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native HKHealthStore alloc();

	/**
	 * authorizationStatusForType:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKHealthStore_Class/index.html#//apple_ref/occ/instm/HKHealthStore/authorizationStatusForType:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("authorizationStatusForType:")
	@NInt
	public native long authorizationStatusForType(HKObjectType type);

	/**
	 * biologicalSexWithError:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKHealthStore_Class/index.html#//apple_ref/occ/instm/HKHealthStore/biologicalSexWithError:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("biologicalSexWithError:")
	public native HKBiologicalSexObject biologicalSexWithError(
			Ptr<NSError> error);

	/**
	 * bloodTypeWithError:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKHealthStore_Class/index.html#//apple_ref/occ/instm/HKHealthStore/bloodTypeWithError:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("bloodTypeWithError:")
	public native HKBloodTypeObject bloodTypeWithError(Ptr<NSError> error);

	/**
	 * dateOfBirthWithError:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKHealthStore_Class/index.html#//apple_ref/occ/instm/HKHealthStore/dateOfBirthWithError:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dateOfBirthWithError:")
	public native NSDate dateOfBirthWithError(Ptr<NSError> error);

	/**
	 * deleteObject:withCompletion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKHealthStore_Class/index.html#//apple_ref/occ/instm/HKHealthStore/deleteObject:withCompletion:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("deleteObject:withCompletion:")
	public native void deleteObjectWithCompletion(
			HKObject object,
			@ObjCBlock(name = "call_deleteObjectWithCompletion") Block_deleteObjectWithCompletion completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_deleteObjectWithCompletion {
		@Generated
		void call_deleteObjectWithCompletion(boolean arg0, NSError arg1);
	}

	/**
	 * disableAllBackgroundDeliveryWithCompletion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKHealthStore_Class/index.html#//apple_ref/occ/instm/HKHealthStore/disableAllBackgroundDeliveryWithCompletion:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("disableAllBackgroundDeliveryWithCompletion:")
	public native void disableAllBackgroundDeliveryWithCompletion(
			@ObjCBlock(name = "call_disableAllBackgroundDeliveryWithCompletion") Block_disableAllBackgroundDeliveryWithCompletion completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_disableAllBackgroundDeliveryWithCompletion {
		@Generated
		void call_disableAllBackgroundDeliveryWithCompletion(
				boolean arg0, NSError arg1);
	}

	/**
	 * disableBackgroundDeliveryForType:withCompletion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKHealthStore_Class/index.html#//apple_ref/occ/instm/HKHealthStore/disableBackgroundDeliveryForType:withCompletion:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("disableBackgroundDeliveryForType:withCompletion:")
	public native void disableBackgroundDeliveryForTypeWithCompletion(
			HKObjectType type,
			@ObjCBlock(name = "call_disableBackgroundDeliveryForTypeWithCompletion") Block_disableBackgroundDeliveryForTypeWithCompletion completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_disableBackgroundDeliveryForTypeWithCompletion {
		@Generated
		void call_disableBackgroundDeliveryForTypeWithCompletion(
				boolean arg0, NSError arg1);
	}

	/**
	 * enableBackgroundDeliveryForType:frequency:withCompletion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKHealthStore_Class/index.html#//apple_ref/occ/instm/HKHealthStore/enableBackgroundDeliveryForType:frequency:withCompletion:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("enableBackgroundDeliveryForType:frequency:withCompletion:")
	public native void enableBackgroundDeliveryForTypeFrequencyWithCompletion(
			HKObjectType type,
			@NInt long frequency,
			@ObjCBlock(name = "call_enableBackgroundDeliveryForTypeFrequencyWithCompletion") Block_enableBackgroundDeliveryForTypeFrequencyWithCompletion completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_enableBackgroundDeliveryForTypeFrequencyWithCompletion {
		@Generated
		void call_enableBackgroundDeliveryForTypeFrequencyWithCompletion(
				boolean arg0, NSError arg1);
	}

	/**
	 * executeQuery:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKHealthStore_Class/index.html#//apple_ref/occ/instm/HKHealthStore/executeQuery:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("executeQuery:")
	public native void executeQuery(HKQuery query);

	@Generated
	@Selector("init")
	public native HKHealthStore init();

	/**
	 * isHealthDataAvailable</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKHealthStore_Class/index.html#//apple_ref/occ/clm/HKHealthStore/isHealthDataAvailable">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isHealthDataAvailable")
	public static native boolean isHealthDataAvailable();

	/**
	 * preferredUnitsForQuantityTypes:completion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKHealthStore_Class/index.html#//apple_ref/occ/instm/HKHealthStore/preferredUnitsForQuantityTypes:completion:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("preferredUnitsForQuantityTypes:completion:")
	public native void preferredUnitsForQuantityTypesCompletion(
			NSSet<? extends HKQuantityType> quantityTypes,
			@ObjCBlock(name = "call_preferredUnitsForQuantityTypesCompletion") Block_preferredUnitsForQuantityTypesCompletion completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_preferredUnitsForQuantityTypesCompletion {
		@Generated
		void call_preferredUnitsForQuantityTypesCompletion(
				NSDictionary<? extends HKQuantityType, ? extends HKUnit> arg0, NSError arg1);
	}

	/**
	 * requestAuthorizationToShareTypes:readTypes:completion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKHealthStore_Class/index.html#//apple_ref/occ/instm/HKHealthStore/requestAuthorizationToShareTypes:readTypes:completion:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("requestAuthorizationToShareTypes:readTypes:completion:")
	public native void requestAuthorizationToShareTypesReadTypesCompletion(
			NSSet<? extends HKSampleType> typesToShare,
			NSSet<? extends HKObjectType> typesToRead,
			@ObjCBlock(name = "call_requestAuthorizationToShareTypesReadTypesCompletion") Block_requestAuthorizationToShareTypesReadTypesCompletion completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_requestAuthorizationToShareTypesReadTypesCompletion {
		@Generated
		void call_requestAuthorizationToShareTypesReadTypesCompletion(
				boolean arg0, NSError arg1);
	}

	/**
	 * saveObject:withCompletion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKHealthStore_Class/index.html#//apple_ref/occ/instm/HKHealthStore/saveObject:withCompletion:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("saveObject:withCompletion:")
	public native void saveObjectWithCompletion(
			HKObject object,
			@ObjCBlock(name = "call_saveObjectWithCompletion") Block_saveObjectWithCompletion completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_saveObjectWithCompletion {
		@Generated
		void call_saveObjectWithCompletion(boolean arg0, NSError arg1);
	}

	/**
	 * saveObjects:withCompletion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKHealthStore_Class/index.html#//apple_ref/occ/instm/HKHealthStore/saveObjects:withCompletion:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("saveObjects:withCompletion:")
	public native void saveObjectsWithCompletion(
			NSArray<? extends HKObject> objects,
			@ObjCBlock(name = "call_saveObjectsWithCompletion") Block_saveObjectsWithCompletion completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_saveObjectsWithCompletion {
		@Generated
		void call_saveObjectsWithCompletion(boolean arg0, NSError arg1);
	}

	/**
	 * stopQuery:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKHealthStore_Class/index.html#//apple_ref/occ/instm/HKHealthStore/stopQuery:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stopQuery:")
	public native void stopQuery(HKQuery query);

	/**
	 * deleteObjects:withCompletion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKHealthStore_Class/index.html#//apple_ref/occ/instm/HKHealthStore/deleteObjects:withCompletion:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("deleteObjects:withCompletion:")
	public native void deleteObjectsWithCompletion(NSArray<? extends HKObject> objects,
			@ObjCBlock(name = "call_deleteObjectsWithCompletion") Block_deleteObjectsWithCompletion completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_deleteObjectsWithCompletion {
		@Generated
		void call_deleteObjectsWithCompletion(boolean arg0, NSError arg1);
	}

	/**
	 * deleteObjectsOfType:predicate:withCompletion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKHealthStore_Class/index.html#//apple_ref/occ/instm/HKHealthStore/deleteObjectsOfType:predicate:withCompletion:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("deleteObjectsOfType:predicate:withCompletion:")
	public native void deleteObjectsOfTypePredicateWithCompletion(HKObjectType objectType, NSPredicate predicate,
			@ObjCBlock(name = "call_deleteObjectsOfTypePredicateWithCompletion") Block_deleteObjectsOfTypePredicateWithCompletion completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_deleteObjectsOfTypePredicateWithCompletion {
		@Generated
		void call_deleteObjectsOfTypePredicateWithCompletion(boolean arg0, @NUInt long arg1, NSError arg2);
	}

	/**
	 * earliestPermittedSampleDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKHealthStore_Class/index.html#//apple_ref/occ/instm/HKHealthStore/earliestPermittedSampleDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("earliestPermittedSampleDate")
	public native NSDate earliestPermittedSampleDate();

	/**
	 * fitzpatrickSkinTypeWithError:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKHealthStore_Class/index.html#//apple_ref/occ/instm/HKHealthStore/fitzpatrickSkinTypeWithError:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fitzpatrickSkinTypeWithError:")
	public native HKFitzpatrickSkinTypeObject fitzpatrickSkinTypeWithError(Ptr<NSError> error);

	/**
	 * handleAuthorizationForExtensionWithCompletion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKHealthStore_Class/index.html#//apple_ref/occ/instm/HKHealthStore/handleAuthorizationForExtensionWithCompletion:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("handleAuthorizationForExtensionWithCompletion:")
	public native void handleAuthorizationForExtensionWithCompletion(
			@ObjCBlock(name = "call_handleAuthorizationForExtensionWithCompletion") Block_handleAuthorizationForExtensionWithCompletion completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_handleAuthorizationForExtensionWithCompletion {
		@Generated
		void call_handleAuthorizationForExtensionWithCompletion(boolean arg0, NSError arg1);
	}

	/**
	 * splitTotalEnergy:startDate:endDate:resultsHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKHealthStore_Class/index.html#//apple_ref/occ/instm/HKHealthStore/splitTotalEnergy:startDate:endDate:resultsHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("splitTotalEnergy:startDate:endDate:resultsHandler:")
	public native void splitTotalEnergyStartDateEndDateResultsHandler(HKQuantity totalEnergy, NSDate startDate,
			NSDate endDate,
			@ObjCBlock(name = "call_splitTotalEnergyStartDateEndDateResultsHandler") Block_splitTotalEnergyStartDateEndDateResultsHandler resultsHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_splitTotalEnergyStartDateEndDateResultsHandler {
		@Generated
		void call_splitTotalEnergyStartDateEndDateResultsHandler(HKQuantity arg0, HKQuantity arg1, NSError arg2);
	}

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
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("load")
	public static native void load_objc();

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
