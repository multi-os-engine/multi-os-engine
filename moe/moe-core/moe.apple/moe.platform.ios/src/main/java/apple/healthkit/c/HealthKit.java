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

package apple.healthkit.c;

import apple.foundation.NSError;
import apple.foundation.struct.NSOperatingSystemVersion;
import apple.healthkit.HKQuantity;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("HealthKit")
@Runtime(CRuntime.class)
public final class HealthKit {
    /**
     * The query returns all samples that match the given sampleType and predicate.
     */
    @Generated @NUInt public static final long HKObjectQueryNoLimit = 0x0000000000000000L;

    static {
        NatJ.register();
    }

    @Generated
    private HealthKit() {
    }

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKErrorDomain();

    /**
     * Predicate Key Paths
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathDateComponents();

    /**
     * Predicate Key Paths
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathUUID();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathSource();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathMetadata();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathCorrelation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathWorkout();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathDevice();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathSourceRevision();

    /**
     * Sort Identifiers
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKSampleSortIdentifierStartDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKSampleSortIdentifierEndDate();

    /**
     * Predicate Key Paths
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathStartDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathEndDate();

    /**
     * Predicate Key Paths
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathWorkoutDuration();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathWorkoutTotalDistance();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathWorkoutTotalEnergyBurned();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathWorkoutType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathWorkoutTotalSwimmingStrokeCount();

    /**
     * Sort Identifiers
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKWorkoutSortIdentifierDuration();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKWorkoutSortIdentifierTotalDistance();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKWorkoutSortIdentifierTotalEnergyBurned();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKWorkoutSortIdentifierTotalSwimmingStrokeCount();

    /**
     * [@constant] HKPredicateKeyPathCategoryValue
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathCategoryValue();

    /**
     * [@constant] HKPredicateKeyPathCDATitle
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathCDATitle();

    /**
     * [@constant] HKPredicateKeyPathCDAPatientName
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathCDAPatientName();

    /**
     * [@constant] HKPredicateKeyPathCDAAuthorName
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathCDAAuthorName();

    /**
     * [@constant] HKPredicateKeyPathCDACustodianName
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathCDACustodianName();

    /**
     * [@constant] HKDetailedCDAValidationErrorKey
     * <p>
     * This may be used with the validationError parameter of
     * CDADocumentSampleWithData:startDate:endDate:device:metadata:validationError: to obtain a detailed
     * description of the validation errors encountered when creating a CDA document.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDetailedCDAValidationErrorKey();

    /**
     * [@constant] HKDevicePropertyKeyName
     * <p>
     * Used with predicateForObjectsWithDeviceProperty to specify a device name.
     * <p>
     * The expected value type is an NSString.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDevicePropertyKeyName();

    /**
     * [@constant] HKDevicePropertyKeyManufacturer
     * <p>
     * Used with predicateForObjectsWithDeviceProperty to specify a device manufacturer.
     * <p>
     * The expected value type is an NSString.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDevicePropertyKeyManufacturer();

    /**
     * [@constant] HKDevicePropertyKeyModel
     * <p>
     * Used with predicateForObjectsWithDeviceProperty to specify a device model.
     * <p>
     * The expected value type is an NSString.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDevicePropertyKeyModel();

    /**
     * [@constant] HKDevicePropertyKeyHardwareVersion
     * <p>
     * Used with predicateForObjectsWithDeviceProperty to specify a hardware version.
     * <p>
     * The expected value type is an NSString.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDevicePropertyKeyHardwareVersion();

    /**
     * [@constant] HKDevicePropertyKeyFirmwareVersion
     * <p>
     * Used with predicateForObjectsWithDeviceProperty to specify a firmware version.
     * <p>
     * The expected value type is an NSString.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDevicePropertyKeyFirmwareVersion();

    /**
     * [@constant] HKDevicePropertyKeySoftwareVersion
     * <p>
     * Used with predicateForObjectsWithDeviceProperty to specify a software version.
     * <p>
     * The expected value type is an NSString.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDevicePropertyKeySoftwareVersion();

    /**
     * [@constant] HKDevicePropertyKeyLocalIdentifier
     * <p>
     * Used with predicateForObjectsWithDeviceProperty to specify a local identifier.
     * <p>
     * The expected value type is an NSString.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDevicePropertyKeyLocalIdentifier();

    /**
     * [@constant] HKDevicePropertyKeyUDIDeviceIdentifier
     * <p>
     * Used with predicateForObjectsWithDeviceProperty to specify a UDI device identifier.
     * <p>
     * The expected value type is an NSString.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDevicePropertyKeyUDIDeviceIdentifier();

    /**
     * [@constant] HKUserPreferencesDidChangeNotification
     * <p>
     * A notification posted every time the user updates their preferred units.
     * <p>
     * Each HKHealthStore posts a HKUserPreferencesDidChangeNotification notification when the preferred unit
     * for a HKQuantityType is changed by the user. To guarantee your listener will only receive a single
     * notification when this occurs, it is necessary to provide an HKHealthStore instance for the object
     * parameter of NSNotificationCenter's addObserver methods.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKUserPreferencesDidChangeNotification();

    /**
     * [@constant] HKMetadataKeyUDIProductionIdentifier
     * <p>
     * Represents the serial number of the device that created the HKObject.
     * <p>
     * The expected value type is NSString.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyDeviceSerialNumber();

    /**
     * [@constant] HKMetadataKeyBodyTemperatureSensorLocation
     * <p>
     * Represents the location where a particular body temperature reading was taken.
     * <p>
     * The expected value type is an NSNumber containing a HKBodyTemperatureSensorLocation value.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyBodyTemperatureSensorLocation();

    /**
     * [@constant] HKMetadataKeyHeartRateSensorLocation
     * <p>
     * Represents the location where a particular heart rate reading was taken.
     * <p>
     * The expected value type is an NSNumber containing a HKHeartRateSensorLocation value.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyHeartRateSensorLocation();

    /**
     * [@constant] HKMetadataKeyFoodType
     * <p>
     * Represents the type of food that was consumed when creating an HKObject.
     * <p>
     * This should be a short string representing the type of food, such as 'Banana'. The expected value type
     * is NSString.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyFoodType();

    /**
     * [@constant] HKMetadataKeyUDIDeviceIdentifier
     * <p>
     * Represents the device identifier portion of a device's UDI (Unique Device Identifier).
     * <p>
     * The device identifier can be used to reference the GUDID (Globally Unique Device Identifier Database).
     * The expected value type is NSString.
     * <p>
     * ** Note that the use of this key is now discouraged in favor of the HKDevice class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyUDIDeviceIdentifier();

    /**
     * [@constant] HKMetadataKeyUDIProductionIdentifier
     * <p>
     * Represents the production identifier portion of a device's UDI (Unique Device Identifier).
     * <p>
     * While part of a device's UDI, the production identifier is not saved in the FDA's GUDID
     * (Globally Unique Device Identifier Database) and its use in HealthKit is now discouraged for
     * user privacy reasons. Apps should consider handling this independently of HealthKit APIs if
     * needed.
     * The expected value type is NSString.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyUDIProductionIdentifier();

    /**
     * [@constant] HKMetadataKeyDigitalSignature
     * <p>
     * Represents a digital signature validating the origin of an HKObject's value.
     * <p>
     * Intended to provide data integrity for sample data produced by trusted (tamper resistant) measuring devices.
     * The digital signature format should be CMS (Cryptographic Message Syntax specified in IETF RFC 5652).
     * It should be a “Signed-data” type signature containing the data items to be signed (e.g., timestamp, value, etc.)
     * using ASN.1 encoding with DER (Distinguished Encoding Rules). The entire enveloping signature should be further
     * encoded using base64. Recommended digest is SHA256, and recommended cipher is FIPS PUB 186-4 Digital Signature
     * Standard Elliptic Curve P-256. See documentation for details.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyDigitalSignature();

    /**
     * [@constant] HKMetadataKeyExternalUUID
     * <p>
     * Represents a unique identifier for an HKObject that is set by its source.
     * Uniqueness of objects with the same value of this key is not enforced by HealthKit.
     * <p>
     * The expected value type is NSString.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyExternalUUID();

    /**
     * [@constant] HKMetadataKeyTimeZone
     * <p>
     * Represents the time zone that the user was in when the HKObject was created.
     * <p>
     * The expected value type is an NSString compatible with NSTimeZone's +timeZoneWithName:.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyTimeZone();

    /**
     * [@constant] HKMetadataKeyDeviceName
     * <p>
     * Represents the name of the device that took the reading.
     * <p>
     * The expected value type is NSString.
     * <p>
     * ** Note that the use of this key is now discouraged in favor of the HKDevice class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyDeviceName();

    /**
     * [@constant] HKMetadataKeyDeviceManufacturerName
     * <p>
     * Represents the name of the manufacturer of the device that took the reading.
     * <p>
     * The expected value type is NSString.
     * <p>
     * ** Note that the use of this key is now discouraged in favor of the HKDevice class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyDeviceManufacturerName();

    /**
     * [@constant] HKMetadataKeyWasTakenInLab
     * <p>
     * Represents whether or not the reading was taken in a lab.
     * <p>
     * The expected value type is an NSNumber containing a BOOL value.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyWasTakenInLab();

    /**
     * [@constant] HKMetadataKeyReferenceRangeLowerLimit
     * <p>
     * Represents the lower limit of the reference range for a lab result.
     * <p>
     * The expected value type is an NSNumber.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyReferenceRangeLowerLimit();

    /**
     * [@constant] HKMetadataKeyReferenceRangeUpperLimit
     * <p>
     * Represents the upper limit of the reference range for a lab result.
     * <p>
     * The expected value type is an NSNumber.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyReferenceRangeUpperLimit();

    /**
     * [@constant] HKMetadataKeyWasUserEntered
     * <p>
     * Represents whether or not the reading was entered by the user.
     * <p>
     * The expected value type is an NSNumber containing a BOOL value.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyWasUserEntered();

    /**
     * [@constant] HKMetadataKeyWorkoutBrandName
     * <p>
     * Represents the brand name of a particular workout.
     * <p>
     * The expected value type is NSString.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyWorkoutBrandName();

    /**
     * [@constant] HKMetadataKeyGroupFitness
     * <p>
     * Represents whether or not a workout was performed as part of a group fitness class.
     * <p>
     * The expected value type is an NSNumber containing a BOOL value.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyGroupFitness();

    /**
     * [@constant] HKMetadataKeyIndoorWorkout
     * <p>
     * Represents whether or not a workout was performed indoors as opposed to outdoors.
     * <p>
     * The expected value type is an NSNumber containing a BOOL value.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyIndoorWorkout();

    /**
     * [@constant] HKMetadataKeyCoachedWorkout
     * <p>
     * Represents whether or not a workout was performed with a coach or personal trainer.
     * <p>
     * The expected value type is an NSNumber containing a BOOL value.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyCoachedWorkout();

    /**
     * [@constant] HKMetadataKeyWeatherCondition
     * <p>
     * Represents the weather condition during the sample.
     * <p>
     * The expected value type is an NSNumber containing an HKWeatherCondition value. This key may be set on an
     * HKWorkout object to represent the overall weather condition during the workout.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyWeatherCondition();

    /**
     * [@constant] HKMetadataKeyWeatherTemperature
     * <p>
     * Represents the weather temperature during the sample.
     * <p>
     * The expected value type is an HKQuantity expressed in a temperature unit. This key may be set on an
     * HKWorkout object to represent the overall temperature during the workout.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyWeatherTemperature();

    /**
     * [@constant] HKMetadataKeyHumidity
     * <p>
     * Represents the weather humidity during the sample.
     * <p>
     * The expected value type is an HKQuantity expressed in percent. This key may be set on an HKWorkout
     * object to represent the overall humidity during the workout.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyWeatherHumidity();

    /**
     * [@constant] HKMetadataKeySexualActivityProtectionUsed
     * <p>
     * Represents whether or not protection was used during sexual activity. This can be used to track either
     * protection from STIs or protection from pregnancy.
     * <p>
     * The expected value type is an NSNumber containing a BOOL value.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeySexualActivityProtectionUsed();

    /**
     * [@constant] HKMetadataKeyMenstrualCycleStart
     * <p>
     * Indicates whether or not the sample represents the start of a menstrual cycle. This is a required
     * metadata key for category samples of type HKCategoryTypeIdentifierMenstrualFlow.
     * <p>
     * The expected value type is an NSNumber containing a BOOL value.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyMenstrualCycleStart();

    /**
     * [@constant] HKMetadataKeyLapLength
     * <p>
     * Represents the length of a lap recorded during a workout.
     * <p>
     * The expected value type is an HKQuantity object compatible with a length unit. This key may be set on an
     * HKWorkout object to represent the length of a lap.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyLapLength();

    /**
     * [@constant] HKMetadataKeySwimmingLocationType
     * <p>
     * Represents the location type of a swimming workout.
     * <p>
     * The expected value type is an NSNumber containing an HKWorkoutSwimmingLocationType value. This key may
     * be set on an HKWorkout object to represent the swimming location type.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeySwimmingLocationType();

    /**
     * [@constant] HKMetadataKeySwimmingStrokeStyle
     * <p>
     * Represents the predominant stroke style during a lap of a swimming workout.
     * <p>
     * The expected value type is an NSNumber containing an HKSwimmingStrokeStyle value. This key may be set on
     * an HKWorkoutEvent object with the type HKWorkoutEventTypeLap to represent the predominant style used
     * during the lap.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeySwimmingStrokeStyle();

    /**
     * Scalar(Count), Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBodyMassIndex();

    /**
     * Scalar(Percent, 0.0 - 1.0), Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBodyFatPercentage();

    /**
     * Length, Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierHeight();

    /**
     * Mass, Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBodyMass();

    /**
     * Mass, Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierLeanBodyMass();

    /**
     * Scalar(Count), Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierStepCount();

    /**
     * Length, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDistanceWalkingRunning();

    /**
     * Length, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDistanceCycling();

    /**
     * Length, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDistanceWheelchair();

    /**
     * Energy, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBasalEnergyBurned();

    /**
     * Energy, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierActiveEnergyBurned();

    /**
     * Scalar(Count), Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierFlightsClimbed();

    /**
     * Scalar(Count), Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierNikeFuel();

    /**
     * Time Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierAppleExerciseTime();

    /**
     * Scalar(Count), Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierPushCount();

    /**
     * Length, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDistanceSwimming();

    /**
     * Scalar(Count), Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierSwimmingStrokeCount();

    /**
     * Scalar(Count)/Time, Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierHeartRate();

    /**
     * Temperature, Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBodyTemperature();

    /**
     * Basal Body Temperature, Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBasalBodyTemperature();

    /**
     * Pressure, Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBloodPressureSystolic();

    /**
     * Pressure, Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBloodPressureDiastolic();

    /**
     * Scalar(Count)/Time, Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierRespiratoryRate();

    /**
     * Scalar(Percent, 0.0 - 1.0), Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierOxygenSaturation();

    /**
     * Scalar(Percent, 0.0 - 1.0), Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierPeripheralPerfusionIndex();

    /**
     * Mass/Volume, Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBloodGlucose();

    /**
     * Scalar(Count), Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierNumberOfTimesFallen();

    /**
     * Conductance, Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierElectrodermalActivity();

    /**
     * Scalar(Count), Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierInhalerUsage();

    /**
     * Scalar(Percent, 0.0 - 1.0), Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBloodAlcoholContent();

    /**
     * Volume, Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierForcedVitalCapacity();

    /**
     * Volume, Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierForcedExpiratoryVolume1();

    /**
     * Volume/Time, Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierPeakExpiratoryFlowRate();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryFatTotal();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryFatPolyunsaturated();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryFatMonounsaturated();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryFatSaturated();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryCholesterol();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietarySodium();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryCarbohydrates();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryFiber();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietarySugar();

    /**
     * Energy, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryEnergyConsumed();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryProtein();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryVitaminA();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryVitaminB6();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryVitaminB12();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryVitaminC();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryVitaminD();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryVitaminE();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryVitaminK();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryCalcium();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryIron();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryThiamin();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryRiboflavin();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryNiacin();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryFolate();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryBiotin();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryPantothenicAcid();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryPhosphorus();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryIodine();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryMagnesium();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryZinc();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietarySelenium();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryCopper();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryManganese();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryChromium();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryMolybdenum();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryChloride();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryPotassium();

    /**
     * Mass, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryCaffeine();

    /**
     * Volume, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryWater();

    /**
     * Scalar(Count), Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierUVExposure();

    /**
     * HKCategoryValueSleepAnalysis
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierSleepAnalysis();

    /**
     * HKCategoryValueAppleStandHour
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierAppleStandHour();

    /**
     * HKCategoryValueCervicalMucusQuality
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierCervicalMucusQuality();

    /**
     * HKCategoryValueOvulationTestResult
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierOvulationTestResult();

    /**
     * HKCategoryValueMenstrualFlow
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierMenstrualFlow();

    /**
     * (Spotting) HKCategoryValue
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierIntermenstrualBleeding();

    /**
     * HKCategoryValue
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierSexualActivity();

    /**
     * HKCategoryValue
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierMindfulSession();

    /**
     * HKBiologicalSexObject
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCharacteristicTypeIdentifierBiologicalSex();

    /**
     * HKBloodTypeObject
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCharacteristicTypeIdentifierBloodType();

    /**
     * NSDateComponents
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCharacteristicTypeIdentifierDateOfBirth();

    /**
     * HKFitzpatrickSkinTypeObject
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCharacteristicTypeIdentifierFitzpatrickSkinType();

    /**
     * HKWheelchairUseObject
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCharacteristicTypeIdentifierWheelchairUse();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCorrelationTypeIdentifierBloodPressure();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCorrelationTypeIdentifierFood();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDocumentTypeIdentifierCDA();

    /**
     * ------------------------------
     * HKWorkoutType Identifier
     * ------------------------------
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKWorkoutTypeIdentifier();

    /**
     * Predicate Key Paths
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathQuantity();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathWorkoutTotalFlightsClimbed();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKWorkoutSortIdentifierTotalFlightsClimbed();

    /**
     * [@constant] HKMetadataKeyHeartRateMotionContext
     * <p>
     * Represents the context in which a particular heart rate reading was taken.
     * <p>
     * The expected value type is an NSNumber containing a HKHeartRateMotionContext value. The value is active
     * (HKHeartRateMotionContextActive) if the user is in motion or working out, sedentary if the user is
     * still (HKHeartRateMotionContextSedentary), or not set (HKHeartRateMotionContextNotSet) otherwise.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyHeartRateMotionContext();

    /**
     * [@constant] HKMetadataKeySyncIdentifier
     * <p>
     * Represents an identifier for an HKObject that is set by its source and is used by HealthKit to uniquely
     * identify an object.
     * <p>
     * Saving a HKObject with a HKMetadataKeySyncIdentifier will replace an existing HKObject with the
     * same HKMetadataKeySyncIdentifier value if the new HKObject has a greater HKMetadataKeySyncVersion.
     * The new sample will be added to all HKWorkouts or HKCorrelations containing the replaced sample.
     * HKMetadataKeySyncVersion must be provided if HKMetadataKeySyncIdentifier is provided.
     * The expected value type is NSString.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeySyncIdentifier();

    /**
     * [@constant] HKMetadataKeySyncVersion
     * <p>
     * Represents the version of the HKObject that is set by its source and is used by HealthKit to identify an
     * object's version.
     * <p>
     * HKMetadataKeySyncVersion may not be provided if HKMetadataKeySyncIdentifier is not provided.
     * The expected value type is NSNumber.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeySyncVersion();

    /**
     * [@constant] HKMetadataKeyInsulinDeliveryReason
     * <p>
     * Represents the medical reason for the delivery of an insulin dose. This is a required metadata key for
     * samples of type HKQuantityTypeIdentifierInsulinDelivery.
     * <p>
     * The expected value type is an NSNumber containing a HKInsulinDeliveryReason value.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyInsulinDeliveryReason();

    /**
     * [@constant] HKMetadataKeyBloodGlucoseMealTime
     * <p>
     * Indicates the relative timing of a blood glucose reading to a meal.
     * <p>
     * This timing, as well as other factors like meal composition, can be used by medical professionals to
     * determine the acceptable value range for a blood glucose reading. For use cases requiring the capture of
     * precise timing and composition information, developers should record additional dietary samples, such as
     * HKQuantityTypeIdentifierDietaryCarbohydrates. The expected value type is an NSNumber containing a
     * HKBloodGlucoseMealTime value.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyBloodGlucoseMealTime();

    /**
     * [@constant] HKMetadataKeyVO2MaxTestType
     * <p>
     * Represents the test used to create VO2 Max Sample
     * <p>
     * The expected value type is an NSNumber containing a HKVO2MaxTestType value.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyVO2MaxTestType();

    /**
     * Length, Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierWaistCircumference();

    /**
     * ml/(kg*min) Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierVO2Max();

    /**
     * Scalar(Count)/Time, Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierRestingHeartRate();

    /**
     * Scalar(Count)/Time, Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierWalkingHeartRateAverage();

    /**
     * Time (ms), Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierHeartRateVariabilitySDNN();

    /**
     * Pharmacology (IU) Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierInsulinDelivery();

    /**
     * --------------------------------
     * HKSeriesSample Identifiers
     * --------------------------------
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKWorkoutRouteTypeIdentifier();

    /**
     * Constants to match on any value of that property when querying for samples from an HKSourceRevision
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKSourceRevisionAnyVersion();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKSourceRevisionAnyProductType();

    @Generated
    @CVariable()
    @ByValue
    public static native NSOperatingSystemVersion HKSourceRevisionAnyOperatingSystem();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKFHIRResourceTypeAllergyIntolerance();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKFHIRResourceTypeCondition();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKFHIRResourceTypeImmunization();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKFHIRResourceTypeMedicationDispense();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKFHIRResourceTypeMedicationOrder();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKFHIRResourceTypeMedicationStatement();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKFHIRResourceTypeObservation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKFHIRResourceTypeProcedure();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathClinicalRecordFHIRResourceIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathClinicalRecordFHIRResourceType();

    /**
     * Length, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDistanceDownhillSnowSports();

    /**
     * Time, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierAppleStandTime();

    /**
     * Pressure, DiscreteEquivalentContinuousLevel
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierEnvironmentalAudioExposure();

    /**
     * Pressure, DiscreteEquivalentContinuousLevel
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierHeadphoneAudioExposure();

    /**
     * HKCategoryValue
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierHighHeartRateEvent();

    /**
     * HKCategoryValue
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierLowHeartRateEvent();

    /**
     * HKCategoryValue
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierIrregularHeartRhythmEvent();

    /**
     * HKCategoryValueAudioExposureEvent
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierAudioExposureEvent();

    /**
     * HKCategoryValue
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierToothbrushingEvent();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDataTypeIdentifierHeartbeatSeries();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKClinicalTypeIdentifierAllergyRecord();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKClinicalTypeIdentifierConditionRecord();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKClinicalTypeIdentifierImmunizationRecord();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKClinicalTypeIdentifierLabResultRecord();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKClinicalTypeIdentifierMedicationRecord();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKClinicalTypeIdentifierProcedureRecord();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKClinicalTypeIdentifierVitalSignRecord();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathCount();

    /**
     * Predicate Key Paths
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathSum();

    /**
     * Predicate Key Paths
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathMin();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathAverage();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathMax();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathMostRecent();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathMostRecentStartDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathMostRecentEndDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathMostRecentDuration();

    /**
     * [@constant] HKMetadataKeyAverageSpeed
     * <p>
     * Represents the average speed for a workout segment or distance sample.
     * <p>
     * This represents the average speed when moving so it may not match the value of distance/time for a
     * distance sample.
     * <p>
     * The expected value type is an HKQuantity object compatible with a speed unit (e.g. m/s). This key may be
     * set on quantity samples of type HKQuantityTypeIdentifierDistanceDownhillSnowSports or a workout segment
     * representing a skiing run.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyAverageSpeed();

    /**
     * [@constant] HKMetadataKeyMaximumSpeed
     * <p>
     * Represents the maximum speed for a workout segment or distance sample.
     * <p>
     * The expected value type is an HKQuantity object compatible with a speed unit (e.g. m/s). This key may be
     * set on quantity samples of type HKQuantityTypeIdentifierDistanceDownhillSnowSports or a workout segment
     * representing a skiing run.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyMaximumSpeed();

    /**
     * [@constant] HKMetadataKeyAlpineSlopeGrade
     * <p>
     * Represents the grade of a ski run.
     * <p>
     * Alpine slope grade is measured in percent where 100% grade is a 45 degree slope.
     * <p>
     * The expected value type is an HKQuantity object compatible with percent unit. This key may be set on
     * quantity samples of type HKQuantityTypeIdentifierDistanceDownhillSnowSports or a workout segment
     * representing a skiing run.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyAlpineSlopeGrade();

    /**
     * [@constant] HKMetadataKeyElevationAscended
     * <p>
     * Represents the cumulative elevation ascent during a workout.
     * <p>
     * The expected value type is an HKQuantity object compatible with length unit. This key may be set on a
     * workout, workout segments or distance samples.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyElevationAscended();

    /**
     * [@constant] HKMetadataKeyElevationDescended
     * <p>
     * Represents the cumulative elevation descent during a workout.
     * <p>
     * The expected value type is an HKQuantity object compatible with length unit. This key may be set on a
     * workout, workout segments or distance samples.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyElevationDescended();

    /**
     * [@constant] HKMetadataKeyFitnessMachineDuration
     * <p>
     * Represents the workout duration as displayed by a GymKit connected fitness machine.
     * <p>
     * The expected value type is an HKQuantity object compatible with a time unit. This key may be set on an
     * HKWorkout object to represent the duration of the workout as displayed by a GymKit connected fitness
     * machine.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyFitnessMachineDuration();

    /**
     * [@constant] HKMetadataKeyIndoorBikeDistance
     * <p>
     * Represents the distance covered during an indoor bike workout.
     * <p>
     * The expected value type is an HKQuantity object compatible with a length unit. This key may be set on an
     * HKWorkout object to represent the distance covered during an indoor bike workout.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyIndoorBikeDistance();

    /**
     * [@constant] HKMetadataKeyCrossTrainerDistance
     * <p>
     * Represents the distance covered during a cross trainer workout.
     * <p>
     * The expected value type is an HKQuantity object compatible with a length unit. This key may be set on an
     * HKWorkout object to represent the distance covered during a cross trainer workout.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyCrossTrainerDistance();

    /**
     * [@constant] HKMetadataKeyHeartRateEventThreshold
     * <p>
     * Represents the threshold heart rate that triggered a heart rate event.
     * <p>
     * The expected value is an HKQuantity object with a compatible unit (e.g. count/min).
     * This key will be set on heart rate event samples of type HKCategoryTypeIdentifierHighHeartRateEvent and
     * HKCategoryTypeIdentifierLowHeartRateEvent.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyHeartRateEventThreshold();

    /**
     * [@constant] HKMetadataKeyAverageMETs
     * <p>
     * Represents the average METs, or Metabolic Equivalent of Task during a workout.
     * <p>
     * The expected value type is an HKQuantity expressed in a METs (kcal/(kg*hr)) unit. This key may be set on an
     * HKWorkout object to represent the average workout intensity represented as METs over the entire workout duration.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyAverageMETs();

    /**
     * [@constant] HKMetadataKeyAudioExposureLevel
     * <p>
     * Represents the audio level associated with an audio event.
     * <p>
     * The expected value is an HKQuantity whose value is the audio level
     * associated with the event measured in dBASPL units.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyAudioExposureLevel();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierAbdominalCramps();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierAcne();

    /**
     * HKCategoryValueAppetiteChanges
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierAppetiteChanges();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierGeneralizedBodyAche();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierBloating();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierBreastPain();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierChestTightnessOrPain();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierChills();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierConstipation();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierCoughing();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierDiarrhea();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierDizziness();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierFainting();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierFatigue();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierFever();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierHeadache();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierHeartburn();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierHotFlashes();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierLowerBackPain();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierLossOfSmell();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierLossOfTaste();

    /**
     * HKCategoryValuePresence
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierMoodChanges();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierNausea();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierPelvicPain();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierRapidPoundingOrFlutteringHeartbeat();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierRunnyNose();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierShortnessOfBreath();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierSinusCongestion();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierSkippedHeartbeat();

    /**
     * HKCategoryValuePresence
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierSleepChanges();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierSoreThroat();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierVomiting();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierWheezing();

    /**
     * Predicate Key Paths
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathAverageHeartRate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathECGClassification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathECGSymptomsStatus();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKFHIRResourceTypeCoverage();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKFHIRResourceTypeMedicationRequest();

    /**
     * m/s, Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierWalkingSpeed();

    /**
     * Scalar(Percent, 0.0 - 1.0), Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierWalkingDoubleSupportPercentage();

    /**
     * Scalar(Percent, 0.0 - 1.0), Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierWalkingAsymmetryPercentage();

    /**
     * Length, Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierWalkingStepLength();

    /**
     * Length, Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierSixMinuteWalkTestDistance();

    /**
     * m/s, Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierStairAscentSpeed();

    /**
     * m/s), Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierStairDescentSpeed();

    /**
     * HKCategoryValueEnvironmentalAudioExposureEvent
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierEnvironmentalAudioExposureEvent();

    /**
     * HKCategoryValue
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierHandwashingEvent();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierBladderIncontinence();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierDrySkin();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierHairLoss();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierMemoryLapse();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierNightSweats();

    /**
     * HKCategoryValueSeverity
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierVaginalDryness();

    /**
     * HKActivityMoveModeObject
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCharacteristicTypeIdentifierActivityMoveMode();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKClinicalTypeIdentifierCoverageRecord();

    /**
     * The "DSTU2" release: http://hl7.org/fhir/DSTU2/
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKFHIRReleaseDSTU2();

    /**
     * The "R4" release: http://hl7.org/fhir/R4/
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKFHIRReleaseR4();

    /**
     * An unknown release
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKFHIRReleaseUnknown();

    /**
     * [@constant] HKMetadataKeyAppleECGAlgorithmVersion
     * <p>
     * Represents the ECG algorithm version that was used to generate a particular HKElectrocardiogram.
     * <p>
     * The expected value type is an an NSNumber containing a HKAppleECGAlgorithmVersion value.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyAppleECGAlgorithmVersion();

    /**
     * [@constant] HKMetadataKeyDevicePlacementSide
     * <p>
     * Represents the detected placement of the device during the bout of walking
     * <p>
     * The expected value type is an NSNumber containing a HKDevicePlacementSide value. This key is expected to
     * be written for Walking Aymmetry Percentage.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyDevicePlacementSide();

    /**
     * [@constant] HKMetadataKeyBarometricPressure
     * <p>
     * Represents the barometric pressure recorded at the time of a sample.
     * <p>
     * The expected value type is an HKQuantity representing a value in units of pressure (atmospheres, pascals,
     * millimeters of Mercury).
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyBarometricPressure();

    /**
     * [@constant] HKMetadataKeyAppleDeviceCalibrated
     * <p>
     * Represents the calibration status of the devices used to generate this sample.
     * <p>
     * The expected value is a boolean NSNumber indicating whether the sample value was estimated using a sufficient set
     * of device calibration data. The calibration status of a device may vary per data type. This key is read-only.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyAppleDeviceCalibrated();

    /**
     * HKCategoryValueHeadphoneAudioExposureEvent
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierHeadphoneAudioExposureEvent();

    /**
     * [@constant] HKMetadataKeyAudioExposureDuration
     * <p>
     * Represents the duration of time that is covered by audio samples.
     * <p>
     * The expected value type is an HKQuantity object compatible with a time unit.
     * This key may be set on headphone audio exposure event samples to indicate
     * the duration of time that the user was actually exposed to audio through their headphones.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyAudioExposureDuration();

    /**
     * Determines the Apple Walking Steadiness classification for the provided Apple Walking Steadiness value.
     *
     * @param value             Apple Walking Steadiness quantity with expected value between 0% and 100%.
     * @param classificationOut A pointer to the classification determined for the provided value.
     * @param errorOut          A pointer to an error describing why an unknown classification was returned.
     * @return YES if the classification was successful. NO otherwise, meaning the provided value could not be
     *         classified.
     */
    @Generated
    @CFunction
    public static native boolean HKAppleWalkingSteadinessClassificationForQuantity(HKQuantity value,
            NIntPtr classificationOut, Ptr<NSError> errorOut);

    /**
     * Retrieves the minimum quantity in percent unit for an Apple Walking Steadiness classification.
     *
     * @param classification Apple Walking Steadiness classification for desired minimum value.
     */
    @Generated
    @CFunction
    public static native HKQuantity HKAppleWalkingSteadinessMinimumQuantityForClassification(@NInt long classification);

    /**
     * Retrieves the maximum quantity in percent unit for an Apple Walking Steadiness classification.
     *
     * @param classification Apple Walking Steadiness classification for desired maximum value.
     */
    @Generated
    @CFunction
    public static native HKQuantity HKAppleWalkingSteadinessMaximumQuantityForClassification(@NInt long classification);

    /**
     * Time, Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierAppleMoveTime();

    /**
     * Scalar(Percent, 0.0 - 1.0), Discrete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierAppleWalkingSteadiness();

    /**
     * Scalar(Count), Cumulative
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierNumberOfAlcoholicBeverages();

    /**
     * HKCategoryValuePregnancyTestResult
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierPregnancyTestResult();

    /**
     * HKCategoryValueProgesteroneTestResult
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierProgesteroneTestResult();

    /**
     * HKCategoryValue
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierPregnancy();

    /**
     * HKCategoryValue
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierLactation();

    /**
     * HKCategoryValueContraceptive
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierContraceptive();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierLowCardioFitnessEvent();

    /**
     * HKCategoryValueAppleWalkingSteadinessEvent
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierAppleWalkingSteadinessEvent();

    /**
     * [@constant] HKMetadataKeyVO2MaxValue
     * <p>
     * Represents a VO2Max value that can be associated with, for example, Cardio Fitness Events
     * <p>
     * This key should be used to store an HKQuantity with a unit of `ml/kg·min`
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyVO2MaxValue();

    /**
     * [@constant] HKMetadataKeyLowCardioFitnessEventThreshold
     * <p>
     * Can be used to store a snapshot of the threshold used to classify VO2Max values as "low"
     * <p>
     * This key should be used to store an HKQuantity, with a unit of `ml/kg·min`, representing the low fitness
     * threshold.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyLowCardioFitnessEventThreshold();

    /**
     * [@constant] HKMetadataKeyDateOfEarliestDataUsedForEstimate
     * <p>
     * Represents how far back an estimation algorithm incorporated data from.
     * <p>
     * The expected value is an NSDate indicating the earliest date of data used to produce an estimated value for an
     * HKSample.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyDateOfEarliestDataUsedForEstimate();

    /**
     * [@constant] HKMetadataKeyAlgorithmVersion
     * <p>
     * The version of the algorithm used to generate the sample.
     * <p>
     * The key for an NSNumber containing an NSInteger indicating the version of the algorithm used to generate the
     * sample.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyAlgorithmVersion();
}
