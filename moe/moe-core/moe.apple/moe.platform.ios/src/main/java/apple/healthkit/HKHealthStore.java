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

/**
 * HKHealthStore
 * <p>
 * The HKHealthStore class provides an interface for accessing and storing the user's health data.
 */
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
    public static native HKHealthStore allocWithZone(VoidPtr zone);

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

    /**
     * isHealthDataAvailable
     * <p>
     * Returns YES if HealthKit is supported on the device.
     * <p>
     * HealthKit is not supported on all iOS devices.  Using HKHealthStore APIs on devices which are not
     * supported will result in errors with the HKErrorHealthDataUnavailable code.  Call isHealthDataAvailable
     * before attempting to use other parts of the framework.
     */
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
    public static native HKHealthStore new_objc();

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
     * addSamples:toWorkout:completion:
     * <p>
     * Associates samples with a given workout.
     * <p>
     * This will associate the given samples with the given workout. These samples will then be returned by a
     * query that contains this workout as a predicate. If a sample is added that is not saved yet, then it will
     * be saved for you. Note that the sample will be saved without an HKDevice.
     * <p>
     * The workout provided must be one that has already been saved to HealthKit.
     */
    @Generated
    @Selector("addSamples:toWorkout:completion:")
    public native void addSamplesToWorkoutCompletion(NSArray<? extends HKSample> samples, HKWorkout workout,
            @ObjCBlock(name = "call_addSamplesToWorkoutCompletion") Block_addSamplesToWorkoutCompletion completion);

    /**
     * authorizationStatusForType:
     * <p>
     * Returns the application's authorization status for the given object type.
     */
    @Generated
    @Selector("authorizationStatusForType:")
    @NInt
    public native long authorizationStatusForType(HKObjectType type);

    /**
     * biologicalSexWithError:
     * <p>
     * Returns an object encapsulating the user's biological sex.
     * <p>
     * Before calling this method, the application should request authorization to access objects with the
     * HKCharacteristicType identified by HKCharacteristicTypeIdentifierBiologicalSex.
     */
    @Generated
    @Selector("biologicalSexWithError:")
    public native HKBiologicalSexObject biologicalSexWithError(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * bloodTypeWithError:
     * <p>
     * Returns an object encapsulating the user's blood type.
     * <p>
     * Before calling this method, the application should request authorization to access objects with the
     * HKCharacteristicType identified by HKCharacteristicTypeIdentifierBloodType.
     */
    @Generated
    @Selector("bloodTypeWithError:")
    public native HKBloodTypeObject bloodTypeWithError(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * dateOfBirthComponentsWithError:
     * <p>
     * Returns the user's date of birth in the Gregorian calendar.
     * <p>
     * Before calling this method, the application should request authorization to access objects with the
     * HKCharacteristicType identified by HKCharacteristicTypeIdentifierDateOfBirth.
     */
    @Generated
    @Selector("dateOfBirthComponentsWithError:")
    public native NSDateComponents dateOfBirthComponentsWithError(
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("dateOfBirthWithError:")
    public native NSDate dateOfBirthWithError(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * deleteObject:withCompletion:
     * <p>
     * Deletes a single HKObject from the HealthKit database.
     * <p>
     * See deleteObjects:withCompletion:.
     */
    @Generated
    @Selector("deleteObject:withCompletion:")
    public native void deleteObjectWithCompletion(HKObject object,
            @ObjCBlock(name = "call_deleteObjectWithCompletion") Block_deleteObjectWithCompletion completion);

    /**
     * deleteObjects:withCompletion:
     * <p>
     * Deletes multiple HKObjects from the HealthKit database.
     * <p>
     * An application may only delete objects that it previously saved.  This operation is performed
     * asynchronously and the completion will be executed on an arbitrary background queue.
     */
    @Generated
    @Selector("deleteObjects:withCompletion:")
    public native void deleteObjectsWithCompletion(NSArray<? extends HKObject> objects,
            @ObjCBlock(name = "call_deleteObjectsWithCompletion") Block_deleteObjectsWithCompletion completion);

    /**
     * deleteObjectsOfType:predicate:withCompletion:
     * <p>
     * Deletes all objects matching the given predicate from the HealthKit database.
     * <p>
     * An application may only delete objects that it previously saved.  This operation is performed
     * asynchronously and the completion will be executed on an arbitrary background queue.
     */
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

    /**
     * earliestPermittedSampleDate
     * <p>
     * Samples prior to the earliestPermittedSampleDate cannot be saved or queried.
     * <p>
     * On some platforms, only samples with end dates newer than the value returned by earliestPermittedSampleDate
     * may be saved or retrieved.
     */
    @Generated
    @Selector("earliestPermittedSampleDate")
    public native NSDate earliestPermittedSampleDate();

    /**
     * enableBackgroundDeliveryForType:frequency:withCompletion:
     * <p>
     * This method enables activation of your app when data of the type is recorded at the cadence specified.
     * <p>
     * When an app has subscribed to a certain data type it will get activated at the cadence that is specified
     * with the frequency parameter. The app is still responsible for creating an HKObserverQuery to know which
     * data types have been updated and the corresponding fetch queries. Note that certain data types (such as
     * HKQuantityTypeIdentifierStepCount) have a minimum frequency of HKUpdateFrequencyHourly. This is enforced
     * transparently to the caller.
     */
    @Generated
    @Selector("enableBackgroundDeliveryForType:frequency:withCompletion:")
    public native void enableBackgroundDeliveryForTypeFrequencyWithCompletion(HKObjectType type, @NInt long frequency,
            @ObjCBlock(name = "call_enableBackgroundDeliveryForTypeFrequencyWithCompletion") Block_enableBackgroundDeliveryForTypeFrequencyWithCompletion completion);

    /**
     * executeQuery:
     * <p>
     * Begins executing the given query.
     * <p>
     * After executing a query, the completion, update, and/or results handlers of that query will be invoked
     * asynchronously on an arbitrary background queue as results become available.  Errors that prevent a
     * query from executing will be delivered to one of the query's handlers.  Which handler the error will be
     * delivered to is defined by the HKQuery subclass.
     * <p>
     * Each HKQuery instance may only be executed once and calling this method with a currently executing query
     * or one that was previously executed will result in an exception.
     * <p>
     * If a query would retrieve objects with an HKObjectType property, then the application must request
     * authorization to access objects of that type before executing the query.
     */
    @Generated
    @Selector("executeQuery:")
    public native void executeQuery(HKQuery query);

    /**
     * fitzpatrickSkinTypeWithError:
     * <p>
     * Returns an object encapsulating the user's Fitzpatrick skin type.
     * <p>
     * Before calling this method, the application should request authorization to access objects with the
     * HKCharacteristicType identified by HKCharacteristicTypeIdentifierFitzpatrickSkinType.
     */
    @Generated
    @Selector("fitzpatrickSkinTypeWithError:")
    public native HKFitzpatrickSkinTypeObject fitzpatrickSkinTypeWithError(
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * handleAuthorizationForExtensionWithCompletion:
     * <p>
     * Prompts the user to authorize the application for reading and saving objects.
     * <p>
     * When an app extension calls requestAuthorizationToShareTypes:readTypes:completion:, the parent application
     * is responsible for calling this method to prompt the user to authorize the app and its extensions for the
     * types that the extension requested access to.
     * <p>
     * The request is performed asynchronously and its completion will be executed on an arbitrary background
     * queue after the user has responded.  The success parameter of the completion indicates whether prompting
     * the user, if necessary, completed successfully and was not cancelled by the user.  It does NOT indicate
     * whether the application was granted authorization.
     */
    @Generated
    @Selector("handleAuthorizationForExtensionWithCompletion:")
    public native void handleAuthorizationForExtensionWithCompletion(
            @ObjCBlock(name = "call_handleAuthorizationForExtensionWithCompletion") Block_handleAuthorizationForExtensionWithCompletion completion);

    @Generated
    @Selector("init")
    public native HKHealthStore init();

    /**
     * preferredUnitsForQuantityTypes:completion:
     * <p>
     * Calls the completion with the preferred HKUnits for a given set of HKQuantityTypes.
     * <p>
     * A preferred unit is either the unit that the user has chosen in Health for displaying samples of the
     * given quantity type or the default unit for that type in the current locale of the device. To access the
     * user's preferences it is necessary to request read or share authorization for the set of HKQuantityTypes
     * provided. If neither read nor share authorization has been granted to the app, then the default unit for
     * the locale is provided.
     * <p>
     * An error will be returned when preferred units are inaccessible because protected health data is
     * unavailable or authorization status is not determined for one or more of the provided types.
     * <p>
     * The returned dictionary will map HKQuantityType to HKUnit.
     */
    @Generated
    @Selector("preferredUnitsForQuantityTypes:completion:")
    public native void preferredUnitsForQuantityTypesCompletion(NSSet<? extends HKQuantityType> quantityTypes,
            @ObjCBlock(name = "call_preferredUnitsForQuantityTypesCompletion") Block_preferredUnitsForQuantityTypesCompletion completion);

    /**
     * requestAuthorizationToShareTypes:readTypes:completion:
     * <p>
     * Prompts the user to authorize the application for reading and saving objects of the given types.
     * <p>
     * Before attempting to execute queries or save objects, the application should first request authorization
     * from the user to read and share every type of object for which the application may require access.
     * <p>
     * The request is performed asynchronously and its completion will be executed on an arbitrary background
     * queue after the user has responded.  If the user has already chosen whether to grant the application
     * access to all of the types provided, then the completion will be called without prompting the user.
     * The success parameter of the completion indicates whether prompting the user, if necessary, completed
     * successfully and was not cancelled by the user.  It does NOT indicate whether the application was
     * granted authorization.
     * <p>
     * To customize the messages displayed on the authorization sheet, set the following keys in your app's
     * Info.plist file. Set the NSHealthShareUsageDescription key to customize the message for reading data.
     * Set the NSHealthUpdateUsageDescription key to customize the message for writing data.
     */
    @Generated
    @Selector("requestAuthorizationToShareTypes:readTypes:completion:")
    public native void requestAuthorizationToShareTypesReadTypesCompletion(NSSet<? extends HKSampleType> typesToShare,
            NSSet<? extends HKObjectType> typesToRead,
            @ObjCBlock(name = "call_requestAuthorizationToShareTypesReadTypesCompletion") Block_requestAuthorizationToShareTypesReadTypesCompletion completion);

    /**
     * saveObject:withCompletion:
     * <p>
     * Saves an HKObject.
     * <p>
     * After an object is saved, on subsequent retrievals the sourceRevision property of the object will be set
     * to the HKSourceRevision representing the version of the application that saved it.
     * <p>
     * If the object has an HKObjectType property, then in order to save an object successfully the application
     * must first request authorization to share objects with that type.  Saving an object with the same unique
     * identifier as another object that has already been saved will fail.  When the application attempts to
     * save multiple objects, if any single object cannot be saved then none of the objects will be saved.
     * The operation will fail if the objects array contains samples with endDates that are older than the date
     * returned by earliestPermittedSampleDate.
     * <p>
     * This operation is performed asynchronously and the completion will be executed on an arbitrary
     * background queue.
     */
    @Generated
    @Selector("saveObject:withCompletion:")
    public native void saveObjectWithCompletion(HKObject object,
            @ObjCBlock(name = "call_saveObjectWithCompletion") Block_saveObjectWithCompletion completion);

    /**
     * saveObjects:withCompletion:
     * <p>
     * Saves an array of HKObjects.
     * <p>
     * See discussion of saveObject:withCompletion:.
     */
    @Generated
    @Selector("saveObjects:withCompletion:")
    public native void saveObjectsWithCompletion(NSArray<? extends HKObject> objects,
            @ObjCBlock(name = "call_saveObjectsWithCompletion") Block_saveObjectsWithCompletion completion);

    /**
     * splitTotalEnergy:startDate:endDate:resultsHandler:
     * <p>
     * For the time period specified, this method calculates the resting and active energy parts of the total
     * energy provided.
     * <p>
     * This method uses the user's metrics like age, biological sex, body mass and height to determine
     * their basal metabolic rate. If the application does not have authorization to access these characteristics
     * or if the user has not entered their data then this method uses builtin default values.
     */
    @Generated
    @Selector("splitTotalEnergy:startDate:endDate:resultsHandler:")
    public native void splitTotalEnergyStartDateEndDateResultsHandler(HKQuantity totalEnergy, NSDate startDate,
            NSDate endDate,
            @ObjCBlock(name = "call_splitTotalEnergyStartDateEndDateResultsHandler") Block_splitTotalEnergyStartDateEndDateResultsHandler resultsHandler);

    /**
     * startWatchAppWithWorkoutConfiguration:completion:
     * <p>
     * Launches or wakes up the WatchKit app on the watch
     * <p>
     * This method will launch the WatchKit app corresponding to the calling iOS application on the currently
     * active Apple Watch. After launching, the handleWorkoutConfiguration: method on the WKExtensionDelegate
     * protocol will be called with the HKWorkoutConfiguration as a parameter. The receiving Watch app can use
     * this configuration object to create an HKWorkoutSession and start it with -startWorkoutSession:.
     */
    @Generated
    @Selector("startWatchAppWithWorkoutConfiguration:completion:")
    public native void startWatchAppWithWorkoutConfigurationCompletion(HKWorkoutConfiguration workoutConfiguration,
            @ObjCBlock(name = "call_startWatchAppWithWorkoutConfigurationCompletion") Block_startWatchAppWithWorkoutConfigurationCompletion completion);

    /**
     * stopQuery:
     * <p>
     * Stops a query that is executing from continuing to run.
     * <p>
     * Calling this method will prevent the handlers of the query from being invoked in the future.  If the
     * query is already stopped, this method does nothing.
     */
    @Generated
    @Selector("stopQuery:")
    public native void stopQuery(HKQuery query);

    /**
     * wheelchairUseWithError:
     * <p>
     * Returns an object encapsulating the user's wheelchair use.
     * <p>
     * Before calling this method, the application should request authorization to access objects with the
     * HKCharacteristicType identified by HKCharacteristicTypeIdentifierWheelchairUse.
     */
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

    /**
     * getRequestStatusForAuthorizationToShareTypes:readTypes:completion:
     * <p>
     * Determines whether requesting authorization for the given types is necessary.
     * <p>
     * Applications may call this method to determine whether the user would be prompted for authorization if
     * the same collections of types are passed to requestAuthorizationToShareTypes:readTypes:completion:.
     * This determination is performed asynchronously and its completion will be executed on an arbitrary
     * background queue.
     */
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

    /**
     * supportsHealthRecords
     * <p>
     * Returns YES if the Health Records feature is available.
     * <p>
     * The Health Records feature is not available in all regions but may be present in unsupported regions
     * if accounts have already been configured. This can change as accounts are modified during device
     * restore or synchronization.
     * Call supportsHealthRecords before attempting to request authorization for any clinical types.
     */
    @Generated
    @Selector("supportsHealthRecords")
    public native boolean supportsHealthRecords();

    /**
     * activityMoveModeWithError:
     * <p>
     * Returns an object encapsulating the user's activity move mode
     * <p>
     * Before calling this method, the application should request authorization to access objects with the
     * HKCharacteristicType identified by HKCharacteristicTypeIdentifierActivityMoveMode.
     */
    @Generated
    @Selector("activityMoveModeWithError:")
    public native HKActivityMoveModeObject activityMoveModeWithError(
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * recalibrateEstimatesForSampleType:atDate:completion:
     * <p>
     * Recalibrates the prediction algorithm used for this sample type.
     * <p>
     * Check -[HKSampleType allowsRecalibrationForEstimates] to see if a given sample type is supported. Calling this method results in first-party
     * estimation algorithms to recalibrate what data is used when generating values for HKSamples of this sampleType.
     */
    @Generated
    @Selector("recalibrateEstimatesForSampleType:atDate:completion:")
    public native void recalibrateEstimatesForSampleTypeAtDateCompletion(HKSampleType sampleType, NSDate date,
            @ObjCBlock(name = "call_recalibrateEstimatesForSampleTypeAtDateCompletion") Block_recalibrateEstimatesForSampleTypeAtDateCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_recalibrateEstimatesForSampleTypeAtDateCompletion {
        @Generated
        void call_recalibrateEstimatesForSampleTypeAtDateCompletion(boolean success, NSError error);
    }
}
