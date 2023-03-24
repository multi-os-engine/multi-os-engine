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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * HKHealthStore
 * 
 * The HKHealthStore class provides an interface for accessing and storing the user's health data.
 * 
 * API-Since: 8.0
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native HKHealthStore allocWithZone(VoidPtr zone);

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

    /**
     * isHealthDataAvailable
     * 
     * Returns YES if HealthKit is supported on the device.
     * 
     * HealthKit is not supported on all iOS devices. Using HKHealthStore APIs on devices which are not
     * supported will result in errors with the HKErrorHealthDataUnavailable code. Call isHealthDataAvailable
     * before attempting to use other parts of the framework.
     */
    @Generated
    @Selector("isHealthDataAvailable")
    public static native boolean isHealthDataAvailable();

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
     * 
     * Associates samples with a given workout.
     * 
     * This will associate the given samples with the given workout. These samples will then be returned by a
     * query that contains this workout as a predicate. If a sample is added that is not saved yet, then it will
     * be saved for you. Note that the sample will be saved without an HKDevice.
     * 
     * The workout provided must be one that has already been saved to HealthKit.
     */
    @Generated
    @Selector("addSamples:toWorkout:completion:")
    public native void addSamplesToWorkoutCompletion(@NotNull NSArray<? extends HKSample> samples,
            @NotNull HKWorkout workout,
            @NotNull @ObjCBlock(name = "call_addSamplesToWorkoutCompletion") Block_addSamplesToWorkoutCompletion completion);

    /**
     * authorizationStatusForType:
     * 
     * Returns the application's authorization status for the given object type.
     */
    @Generated
    @Selector("authorizationStatusForType:")
    @NInt
    public native long authorizationStatusForType(@NotNull HKObjectType type);

    /**
     * biologicalSexWithError:
     * 
     * Returns an object encapsulating the user's biological sex.
     * 
     * Before calling this method, the application should request authorization to access objects with the
     * HKCharacteristicType identified by HKCharacteristicTypeIdentifierBiologicalSex.
     */
    @Nullable
    @Generated
    @Selector("biologicalSexWithError:")
    public native HKBiologicalSexObject biologicalSexWithError(
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * bloodTypeWithError:
     * 
     * Returns an object encapsulating the user's blood type.
     * 
     * Before calling this method, the application should request authorization to access objects with the
     * HKCharacteristicType identified by HKCharacteristicTypeIdentifierBloodType.
     */
    @Nullable
    @Generated
    @Selector("bloodTypeWithError:")
    public native HKBloodTypeObject bloodTypeWithError(
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * dateOfBirthComponentsWithError:
     * 
     * Returns the user's date of birth in the Gregorian calendar.
     * 
     * Before calling this method, the application should request authorization to access objects with the
     * HKCharacteristicType identified by HKCharacteristicTypeIdentifierDateOfBirth.
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("dateOfBirthComponentsWithError:")
    public native NSDateComponents dateOfBirthComponentsWithError(
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 8.0
     * Deprecated-Since: 10.0
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("dateOfBirthWithError:")
    public native NSDate dateOfBirthWithError(@Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * deleteObject:withCompletion:
     * 
     * Deletes a single HKObject from the HealthKit database.
     * 
     * See deleteObjects:withCompletion:.
     */
    @Generated
    @Selector("deleteObject:withCompletion:")
    public native void deleteObjectWithCompletion(@NotNull HKObject object,
            @NotNull @ObjCBlock(name = "call_deleteObjectWithCompletion") Block_deleteObjectWithCompletion completion);

    /**
     * deleteObjects:withCompletion:
     * 
     * Deletes multiple HKObjects from the HealthKit database.
     * 
     * An application may only delete objects that it previously saved. This operation is performed
     * asynchronously and the completion will be executed on an arbitrary background queue.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("deleteObjects:withCompletion:")
    public native void deleteObjectsWithCompletion(@NotNull NSArray<? extends HKObject> objects,
            @NotNull @ObjCBlock(name = "call_deleteObjectsWithCompletion") Block_deleteObjectsWithCompletion completion);

    /**
     * deleteObjectsOfType:predicate:withCompletion:
     * 
     * Deletes all objects matching the given predicate from the HealthKit database.
     * 
     * An application may only delete objects that it previously saved. This operation is performed
     * asynchronously and the completion will be executed on an arbitrary background queue.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("deleteObjectsOfType:predicate:withCompletion:")
    public native void deleteObjectsOfTypePredicateWithCompletion(@NotNull HKObjectType objectType,
            @NotNull NSPredicate predicate,
            @NotNull @ObjCBlock(name = "call_deleteObjectsOfTypePredicateWithCompletion") Block_deleteObjectsOfTypePredicateWithCompletion completion);

    @Generated
    @Selector("disableAllBackgroundDeliveryWithCompletion:")
    public native void disableAllBackgroundDeliveryWithCompletion(
            @NotNull @ObjCBlock(name = "call_disableAllBackgroundDeliveryWithCompletion") Block_disableAllBackgroundDeliveryWithCompletion completion);

    @Generated
    @Selector("disableBackgroundDeliveryForType:withCompletion:")
    public native void disableBackgroundDeliveryForTypeWithCompletion(@NotNull HKObjectType type,
            @NotNull @ObjCBlock(name = "call_disableBackgroundDeliveryForTypeWithCompletion") Block_disableBackgroundDeliveryForTypeWithCompletion completion);

    /**
     * earliestPermittedSampleDate
     * 
     * Samples prior to the earliestPermittedSampleDate cannot be saved or queried.
     * 
     * On some platforms, only samples with end dates newer than the value returned by earliestPermittedSampleDate
     * may be saved or retrieved.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("earliestPermittedSampleDate")
    public native NSDate earliestPermittedSampleDate();

    /**
     * enableBackgroundDeliveryForType:frequency:withCompletion:
     * 
     * This method enables activation of your app when data of the type is recorded at the cadence specified.
     * 
     * When an app has subscribed to a certain data type it will get activated at the cadence that is specified
     * with the frequency parameter. The app is still responsible for creating an HKObserverQuery to know which
     * data types have been updated and the corresponding fetch queries. Note that certain data types (such as
     * HKQuantityTypeIdentifierStepCount) have a minimum frequency of HKUpdateFrequencyHourly. This is enforced
     * transparently to the caller.
     */
    @Generated
    @Selector("enableBackgroundDeliveryForType:frequency:withCompletion:")
    public native void enableBackgroundDeliveryForTypeFrequencyWithCompletion(@NotNull HKObjectType type,
            @NInt long frequency,
            @NotNull @ObjCBlock(name = "call_enableBackgroundDeliveryForTypeFrequencyWithCompletion") Block_enableBackgroundDeliveryForTypeFrequencyWithCompletion completion);

    /**
     * executeQuery:
     * 
     * Begins executing the given query.
     * 
     * After executing a query, the completion, update, and/or results handlers of that query will be invoked
     * asynchronously on an arbitrary background queue as results become available. Errors that prevent a
     * query from executing will be delivered to one of the query's handlers. Which handler the error will be
     * delivered to is defined by the HKQuery subclass.
     * 
     * Each HKQuery instance may only be executed once and calling this method with a currently executing query
     * or one that was previously executed will result in an exception.
     * 
     * If a query would retrieve objects with an HKObjectType property, then the application must request
     * authorization to access objects of that type before executing the query.
     */
    @Generated
    @Selector("executeQuery:")
    public native void executeQuery(@NotNull HKQuery query);

    /**
     * fitzpatrickSkinTypeWithError:
     * 
     * Returns an object encapsulating the user's Fitzpatrick skin type.
     * 
     * Before calling this method, the application should request authorization to access objects with the
     * HKCharacteristicType identified by HKCharacteristicTypeIdentifierFitzpatrickSkinType.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("fitzpatrickSkinTypeWithError:")
    public native HKFitzpatrickSkinTypeObject fitzpatrickSkinTypeWithError(
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * handleAuthorizationForExtensionWithCompletion:
     * 
     * Prompts the user to authorize the application for reading and saving objects.
     * 
     * When an app extension calls requestAuthorizationToShareTypes:readTypes:completion:, the parent application
     * is responsible for calling this method to prompt the user to authorize the app and its extensions for the
     * types that the extension requested access to.
     * 
     * The request is performed asynchronously and its completion will be executed on an arbitrary background
     * queue after the user has responded. The success parameter of the completion indicates whether prompting
     * the user, if necessary, completed successfully and was not cancelled by the user. It does NOT indicate
     * whether the application was granted authorization.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("handleAuthorizationForExtensionWithCompletion:")
    public native void handleAuthorizationForExtensionWithCompletion(
            @NotNull @ObjCBlock(name = "call_handleAuthorizationForExtensionWithCompletion") Block_handleAuthorizationForExtensionWithCompletion completion);

    @Generated
    @Selector("init")
    public native HKHealthStore init();

    /**
     * preferredUnitsForQuantityTypes:completion:
     * 
     * Calls the completion with the preferred HKUnits for a given set of HKQuantityTypes.
     * 
     * A preferred unit is either the unit that the user has chosen in Health for displaying samples of the
     * given quantity type or the default unit for that type in the current locale of the device. To access the
     * user's preferences it is necessary to request read or share authorization for the set of HKQuantityTypes
     * provided. If neither read nor share authorization has been granted to the app, then the default unit for
     * the locale is provided.
     * 
     * An error will be returned when preferred units are inaccessible because protected health data is
     * unavailable or authorization status is not determined for one or more of the provided types.
     * 
     * The returned dictionary will map HKQuantityType to HKUnit.
     * 
     * API-Since: 8.2
     */
    @Generated
    @Selector("preferredUnitsForQuantityTypes:completion:")
    public native void preferredUnitsForQuantityTypesCompletion(@NotNull NSSet<? extends HKQuantityType> quantityTypes,
            @NotNull @ObjCBlock(name = "call_preferredUnitsForQuantityTypesCompletion") Block_preferredUnitsForQuantityTypesCompletion completion);

    /**
     * requestAuthorizationToShareTypes:readTypes:completion:
     * 
     * Prompts the user to authorize the application for reading and saving objects of the given types.
     * 
     * Before attempting to execute queries or save objects, the application should first request authorization
     * from the user to read and share every type of object for which the application may require access.
     * 
     * The request is performed asynchronously and its completion will be executed on an arbitrary background
     * queue after the user has responded. If the user has already chosen whether to grant the application
     * access to all of the types provided, then the completion will be called without prompting the user.
     * The success parameter of the completion indicates whether prompting the user, if necessary, completed
     * successfully and was not cancelled by the user. It does NOT indicate whether the application was
     * granted authorization.
     * 
     * To customize the messages displayed on the authorization sheet, set the following keys in your app's
     * Info.plist file. Set the NSHealthShareUsageDescription key to customize the message for reading data.
     * Set the NSHealthUpdateUsageDescription key to customize the message for writing data.
     */
    @Generated
    @Selector("requestAuthorizationToShareTypes:readTypes:completion:")
    public native void requestAuthorizationToShareTypesReadTypesCompletion(
            @Nullable NSSet<? extends HKSampleType> typesToShare, @Nullable NSSet<? extends HKObjectType> typesToRead,
            @NotNull @ObjCBlock(name = "call_requestAuthorizationToShareTypesReadTypesCompletion") Block_requestAuthorizationToShareTypesReadTypesCompletion completion);

    /**
     * saveObject:withCompletion:
     * 
     * Saves an HKObject.
     * 
     * After an object is saved, on subsequent retrievals the sourceRevision property of the object will be set
     * to the HKSourceRevision representing the version of the application that saved it.
     * 
     * If the object has an HKObjectType property, then in order to save an object successfully the application
     * must first request authorization to share objects with that type. Saving an object with the same unique
     * identifier as another object that has already been saved will fail. When the application attempts to
     * save multiple objects, if any single object cannot be saved then none of the objects will be saved.
     * The operation will fail if the objects array contains samples with endDates that are older than the date
     * returned by earliestPermittedSampleDate.
     * 
     * This operation is performed asynchronously and the completion will be executed on an arbitrary
     * background queue.
     */
    @Generated
    @Selector("saveObject:withCompletion:")
    public native void saveObjectWithCompletion(@NotNull HKObject object,
            @NotNull @ObjCBlock(name = "call_saveObjectWithCompletion") Block_saveObjectWithCompletion completion);

    /**
     * saveObjects:withCompletion:
     * 
     * Saves an array of HKObjects.
     * 
     * See discussion of saveObject:withCompletion:.
     */
    @Generated
    @Selector("saveObjects:withCompletion:")
    public native void saveObjectsWithCompletion(@NotNull NSArray<? extends HKObject> objects,
            @NotNull @ObjCBlock(name = "call_saveObjectsWithCompletion") Block_saveObjectsWithCompletion completion);

    /**
     * splitTotalEnergy:startDate:endDate:resultsHandler:
     * 
     * For the time period specified, this method calculates the resting and active energy parts of the total
     * energy provided.
     * 
     * This method uses the user's metrics like age, biological sex, body mass and height to determine
     * their basal metabolic rate. If the application does not have authorization to access these characteristics
     * or if the user has not entered their data then this method uses builtin default values.
     * 
     * API-Since: 9.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: No longer supported
     */
    @Deprecated
    @Generated
    @Selector("splitTotalEnergy:startDate:endDate:resultsHandler:")
    public native void splitTotalEnergyStartDateEndDateResultsHandler(@NotNull HKQuantity totalEnergy,
            @NotNull NSDate startDate, @NotNull NSDate endDate,
            @NotNull @ObjCBlock(name = "call_splitTotalEnergyStartDateEndDateResultsHandler") Block_splitTotalEnergyStartDateEndDateResultsHandler resultsHandler);

    /**
     * startWatchAppWithWorkoutConfiguration:completion:
     * 
     * Launches or wakes up the WatchKit app on the watch
     * 
     * This method will launch the WatchKit app corresponding to the calling iOS application on the currently
     * active Apple Watch. After launching, the handleWorkoutConfiguration: method on the WKExtensionDelegate
     * protocol will be called with the HKWorkoutConfiguration as a parameter. The receiving Watch app can use
     * this configuration object to create an HKWorkoutSession and start it with -startWorkoutSession:.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("startWatchAppWithWorkoutConfiguration:completion:")
    public native void startWatchAppWithWorkoutConfigurationCompletion(
            @NotNull HKWorkoutConfiguration workoutConfiguration,
            @NotNull @ObjCBlock(name = "call_startWatchAppWithWorkoutConfigurationCompletion") Block_startWatchAppWithWorkoutConfigurationCompletion completion);

    /**
     * stopQuery:
     * 
     * Stops a query that is executing from continuing to run.
     * 
     * Calling this method will prevent the handlers of the query from being invoked in the future. If the
     * query is already stopped, this method does nothing.
     */
    @Generated
    @Selector("stopQuery:")
    public native void stopQuery(@NotNull HKQuery query);

    /**
     * wheelchairUseWithError:
     * 
     * Returns an object encapsulating the user's wheelchair use.
     * 
     * Before calling this method, the application should request authorization to access objects with the
     * HKCharacteristicType identified by HKCharacteristicTypeIdentifierWheelchairUse.
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("wheelchairUseWithError:")
    public native HKWheelchairUseObject wheelchairUseWithError(
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addSamplesToWorkoutCompletion {
        @Generated
        void call_addSamplesToWorkoutCompletion(boolean success, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteObjectWithCompletion {
        @Generated
        void call_deleteObjectWithCompletion(boolean success, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteObjectsWithCompletion {
        @Generated
        void call_deleteObjectsWithCompletion(boolean success, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteObjectsOfTypePredicateWithCompletion {
        @Generated
        void call_deleteObjectsOfTypePredicateWithCompletion(boolean success, @NUInt long deletedObjectCount,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_disableAllBackgroundDeliveryWithCompletion {
        @Generated
        void call_disableAllBackgroundDeliveryWithCompletion(boolean success, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_disableBackgroundDeliveryForTypeWithCompletion {
        @Generated
        void call_disableBackgroundDeliveryForTypeWithCompletion(boolean success, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enableBackgroundDeliveryForTypeFrequencyWithCompletion {
        @Generated
        void call_enableBackgroundDeliveryForTypeFrequencyWithCompletion(boolean success, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleAuthorizationForExtensionWithCompletion {
        @Generated
        void call_handleAuthorizationForExtensionWithCompletion(boolean success, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_preferredUnitsForQuantityTypesCompletion {
        @Generated
        void call_preferredUnitsForQuantityTypesCompletion(
                @NotNull NSDictionary<? extends HKQuantityType, ? extends HKUnit> preferredUnits,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAuthorizationToShareTypesReadTypesCompletion {
        @Generated
        void call_requestAuthorizationToShareTypesReadTypesCompletion(boolean success, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveObjectWithCompletion {
        @Generated
        void call_saveObjectWithCompletion(boolean success, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveObjectsWithCompletion {
        @Generated
        void call_saveObjectsWithCompletion(boolean success, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_splitTotalEnergyStartDateEndDateResultsHandler {
        @Generated
        void call_splitTotalEnergyStartDateEndDateResultsHandler(@Nullable HKQuantity restingEnergy,
                @Nullable HKQuantity activeEnergy, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startWatchAppWithWorkoutConfigurationCompletion {
        @Generated
        void call_startWatchAppWithWorkoutConfigurationCompletion(boolean success, @Nullable NSError error);
    }

    /**
     * getRequestStatusForAuthorizationToShareTypes:readTypes:completion:
     * 
     * Determines whether requesting authorization for the given types is necessary.
     * 
     * Applications may call this method to determine whether the user would be prompted for authorization if
     * the same collections of types are passed to requestAuthorizationToShareTypes:readTypes:completion:.
     * This determination is performed asynchronously and its completion will be executed on an arbitrary
     * background queue.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("getRequestStatusForAuthorizationToShareTypes:readTypes:completion:")
    public native void getRequestStatusForAuthorizationToShareTypesReadTypesCompletion(
            @NotNull NSSet<? extends HKSampleType> typesToShare, @NotNull NSSet<? extends HKObjectType> typesToRead,
            @NotNull @ObjCBlock(name = "call_getRequestStatusForAuthorizationToShareTypesReadTypesCompletion") Block_getRequestStatusForAuthorizationToShareTypesReadTypesCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getRequestStatusForAuthorizationToShareTypesReadTypesCompletion {
        @Generated
        void call_getRequestStatusForAuthorizationToShareTypesReadTypesCompletion(@NInt long requestStatus,
                @Nullable NSError error);
    }

    /**
     * supportsHealthRecords
     * 
     * Returns YES if the Health Records feature is available.
     * 
     * The Health Records feature is not available in all regions but may be present in unsupported regions
     * if accounts have already been configured. This can change as accounts are modified during device
     * restore or synchronization.
     * Call supportsHealthRecords before attempting to request authorization for any clinical types.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("supportsHealthRecords")
    public native boolean supportsHealthRecords();

    /**
     * activityMoveModeWithError:
     * 
     * Returns an object encapsulating the user's activity move mode
     * 
     * Before calling this method, the application should request authorization to access objects with the
     * HKCharacteristicType identified by HKCharacteristicTypeIdentifierActivityMoveMode.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("activityMoveModeWithError:")
    public native HKActivityMoveModeObject activityMoveModeWithError(
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * recalibrateEstimatesForSampleType:atDate:completion:
     * 
     * Recalibrates the prediction algorithm used for this sample type.
     * 
     * Check -[HKSampleType allowsRecalibrationForEstimates] to see if a given sample type is supported. Calling this
     * method results in first-party
     * estimation algorithms to recalibrate what data is used when generating values for HKSamples of this sampleType.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("recalibrateEstimatesForSampleType:atDate:completion:")
    public native void recalibrateEstimatesForSampleTypeAtDateCompletion(@NotNull HKSampleType sampleType,
            @NotNull NSDate date,
            @NotNull @ObjCBlock(name = "call_recalibrateEstimatesForSampleTypeAtDateCompletion") Block_recalibrateEstimatesForSampleTypeAtDateCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_recalibrateEstimatesForSampleTypeAtDateCompletion {
        @Generated
        void call_recalibrateEstimatesForSampleTypeAtDateCompletion(boolean success, @Nullable NSError error);
    }

    /**
     * requestPerObjectReadAuthorizationForType:predicate:completion:
     * 
     * For types that support per object authorization (like vision prescriptions), prompts the user to select
     * the objects for which they want to grant your app access.
     * 
     * Before attempting to execute queries, the application should first request authorization from the user
     * to read objects for which the application may require access.
     * 
     * The request is performed asynchronously, and its completion will be executed on an arbitrary background
     * queue after the user has responded. The user will always be prompted to provide access to objects
     * regardless of whether access had been previously provided. The user can choose to toggle each object's
     * access with each prompt. The success parameter of the completion indicates whether prompting the user
     * completed successfully and was not cancelled. It does NOT indicate whether the application was granted
     * authorization.
     */
    @Generated
    @Selector("requestPerObjectReadAuthorizationForType:predicate:completion:")
    public native void requestPerObjectReadAuthorizationForTypePredicateCompletion(@NotNull HKObjectType objectType,
            @Nullable NSPredicate predicate,
            @NotNull @ObjCBlock(name = "call_requestPerObjectReadAuthorizationForTypePredicateCompletion") Block_requestPerObjectReadAuthorizationForTypePredicateCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestPerObjectReadAuthorizationForTypePredicateCompletion {
        @Generated
        void call_requestPerObjectReadAuthorizationForTypePredicateCompletion(boolean success, @Nullable NSError error);
    }
}
