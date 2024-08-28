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
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKErrorDomain();

    /**
     * Predicate Key Paths
     * 
     * API-Since: 9.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathDateComponents();

    /**
     * Predicate Key Paths
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathUUID();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathSource();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathMetadata();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathCorrelation();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathWorkout();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathDevice();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathSourceRevision();

    /**
     * Sort Identifiers
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKSampleSortIdentifierStartDate();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKSampleSortIdentifierEndDate();

    /**
     * Predicate Key Paths
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathStartDate();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathEndDate();

    /**
     * Predicate Key Paths
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathWorkoutDuration();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathWorkoutTotalDistance();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathWorkoutTotalEnergyBurned();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathWorkoutType();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathWorkoutTotalSwimmingStrokeCount();

    /**
     * Sort Identifiers
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKWorkoutSortIdentifierDuration();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKWorkoutSortIdentifierTotalDistance();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKWorkoutSortIdentifierTotalEnergyBurned();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKWorkoutSortIdentifierTotalSwimmingStrokeCount();

    /**
     * [@constant] HKPredicateKeyPathCategoryValue
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathCategoryValue();

    /**
     * [@constant] HKPredicateKeyPathCDATitle
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathCDATitle();

    /**
     * [@constant] HKPredicateKeyPathCDAPatientName
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathCDAPatientName();

    /**
     * [@constant] HKPredicateKeyPathCDAAuthorName
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathCDAAuthorName();

    /**
     * [@constant] HKPredicateKeyPathCDACustodianName
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathCDACustodianName();

    /**
     * [@constant] HKDetailedCDAValidationErrorKey
     * 
     * This may be used with the validationError parameter of
     * CDADocumentSampleWithData:startDate:endDate:device:metadata:validationError: to obtain a detailed
     * description of the validation errors encountered when creating a CDA document.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDetailedCDAValidationErrorKey();

    /**
     * [@constant] HKDevicePropertyKeyName
     * 
     * Used with predicateForObjectsWithDeviceProperty to specify a device name.
     * 
     * The expected value type is an NSString.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDevicePropertyKeyName();

    /**
     * [@constant] HKDevicePropertyKeyManufacturer
     * 
     * Used with predicateForObjectsWithDeviceProperty to specify a device manufacturer.
     * 
     * The expected value type is an NSString.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDevicePropertyKeyManufacturer();

    /**
     * [@constant] HKDevicePropertyKeyModel
     * 
     * Used with predicateForObjectsWithDeviceProperty to specify a device model.
     * 
     * The expected value type is an NSString.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDevicePropertyKeyModel();

    /**
     * [@constant] HKDevicePropertyKeyHardwareVersion
     * 
     * Used with predicateForObjectsWithDeviceProperty to specify a hardware version.
     * 
     * The expected value type is an NSString.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDevicePropertyKeyHardwareVersion();

    /**
     * [@constant] HKDevicePropertyKeyFirmwareVersion
     * 
     * Used with predicateForObjectsWithDeviceProperty to specify a firmware version.
     * 
     * The expected value type is an NSString.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDevicePropertyKeyFirmwareVersion();

    /**
     * [@constant] HKDevicePropertyKeySoftwareVersion
     * 
     * Used with predicateForObjectsWithDeviceProperty to specify a software version.
     * 
     * The expected value type is an NSString.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDevicePropertyKeySoftwareVersion();

    /**
     * [@constant] HKDevicePropertyKeyLocalIdentifier
     * 
     * Used with predicateForObjectsWithDeviceProperty to specify a local identifier.
     * 
     * The expected value type is an NSString.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDevicePropertyKeyLocalIdentifier();

    /**
     * [@constant] HKDevicePropertyKeyUDIDeviceIdentifier
     * 
     * Used with predicateForObjectsWithDeviceProperty to specify a UDI device identifier.
     * 
     * The expected value type is an NSString.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDevicePropertyKeyUDIDeviceIdentifier();

    /**
     * [@constant] HKUserPreferencesDidChangeNotification
     * 
     * A notification posted every time the user updates their preferred units.
     * 
     * Each HKHealthStore posts a HKUserPreferencesDidChangeNotification notification when the preferred unit
     * for a HKQuantityType is changed by the user. To guarantee your listener will only receive a single
     * notification when this occurs, it is necessary to provide an HKHealthStore instance for the object
     * parameter of NSNotificationCenter's addObserver methods.
     * 
     * API-Since: 8.2
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKUserPreferencesDidChangeNotification();

    /**
     * [@constant] HKMetadataKeyUDIProductionIdentifier
     * 
     * Represents the serial number of the device that created the HKObject.
     * 
     * The expected value type is NSString.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyDeviceSerialNumber();

    /**
     * [@constant] HKMetadataKeyBodyTemperatureSensorLocation
     * 
     * Represents the location where a particular body temperature reading was taken.
     * 
     * The expected value type is an NSNumber containing a HKBodyTemperatureSensorLocation value.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyBodyTemperatureSensorLocation();

    /**
     * [@constant] HKMetadataKeyHeartRateSensorLocation
     * 
     * Represents the location where a particular heart rate reading was taken.
     * 
     * The expected value type is an NSNumber containing a HKHeartRateSensorLocation value.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyHeartRateSensorLocation();

    /**
     * [@constant] HKMetadataKeyFoodType
     * 
     * Represents the type of food that was consumed when creating an HKObject.
     * 
     * This should be a short string representing the type of food, such as 'Banana'. The expected value type
     * is NSString.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyFoodType();

    /**
     * [@constant] HKMetadataKeyUDIDeviceIdentifier
     * 
     * Represents the device identifier portion of a device's UDI (Unique Device Identifier).
     * 
     * The device identifier can be used to reference the GUDID (Globally Unique Device Identifier Database).
     * The expected value type is NSString.
     * 
     * ** Note that the use of this key is now discouraged in favor of the HKDevice class.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyUDIDeviceIdentifier();

    /**
     * [@constant] HKMetadataKeyUDIProductionIdentifier
     * 
     * Represents the production identifier portion of a device's UDI (Unique Device Identifier).
     * 
     * While part of a device's UDI, the production identifier is not saved in the FDA's GUDID
     * (Globally Unique Device Identifier Database) and its use in HealthKit is now discouraged for
     * user privacy reasons. Apps should consider handling this independently of HealthKit APIs if
     * needed.
     * The expected value type is NSString.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyUDIProductionIdentifier();

    /**
     * [@constant] HKMetadataKeyDigitalSignature
     * 
     * Represents a digital signature validating the origin of an HKObject's value.
     * 
     * Intended to provide data integrity for sample data produced by trusted (tamper resistant) measuring devices.
     * The digital signature format should be CMS (Cryptographic Message Syntax specified in IETF RFC 5652).
     * It should be a “Signed-data” type signature containing the data items to be signed (e.g., timestamp, value, etc.)
     * using ASN.1 encoding with DER (Distinguished Encoding Rules). The entire enveloping signature should be further
     * encoded using base64. Recommended digest is SHA256, and recommended cipher is FIPS PUB 186-4 Digital Signature
     * Standard Elliptic Curve P-256. See documentation for details.
     * 
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyDigitalSignature();

    /**
     * [@constant] HKMetadataKeyExternalUUID
     * 
     * Represents a unique identifier for an HKObject that is set by its source.
     * Uniqueness of objects with the same value of this key is not enforced by HealthKit.
     * 
     * The expected value type is NSString.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyExternalUUID();

    /**
     * [@constant] HKMetadataKeyTimeZone
     * 
     * Represents the time zone that the user was in when the HKObject was created.
     * 
     * The expected value type is an NSString compatible with NSTimeZone's +timeZoneWithName:.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyTimeZone();

    /**
     * [@constant] HKMetadataKeyDeviceName
     * 
     * Represents the name of the device that took the reading.
     * 
     * The expected value type is NSString.
     * 
     * ** Note that the use of this key is now discouraged in favor of the HKDevice class.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyDeviceName();

    /**
     * [@constant] HKMetadataKeyDeviceManufacturerName
     * 
     * Represents the name of the manufacturer of the device that took the reading.
     * 
     * The expected value type is NSString.
     * 
     * ** Note that the use of this key is now discouraged in favor of the HKDevice class.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyDeviceManufacturerName();

    /**
     * [@constant] HKMetadataKeyWasTakenInLab
     * 
     * Represents whether or not the reading was taken in a lab.
     * 
     * The expected value type is an NSNumber containing a BOOL value.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyWasTakenInLab();

    /**
     * [@constant] HKMetadataKeyReferenceRangeLowerLimit
     * 
     * Represents the lower limit of the reference range for a lab result.
     * 
     * The expected value type is an NSNumber.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyReferenceRangeLowerLimit();

    /**
     * [@constant] HKMetadataKeyReferenceRangeUpperLimit
     * 
     * Represents the upper limit of the reference range for a lab result.
     * 
     * The expected value type is an NSNumber.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyReferenceRangeUpperLimit();

    /**
     * [@constant] HKMetadataKeyWasUserEntered
     * 
     * Represents whether or not the reading was entered by the user.
     * 
     * The expected value type is an NSNumber containing a BOOL value.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyWasUserEntered();

    /**
     * [@constant] HKMetadataKeyWorkoutBrandName
     * 
     * Represents the brand name of a particular workout.
     * 
     * The expected value type is NSString.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyWorkoutBrandName();

    /**
     * [@constant] HKMetadataKeyGroupFitness
     * 
     * Represents whether or not a workout was performed as part of a group fitness class.
     * 
     * The expected value type is an NSNumber containing a BOOL value.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyGroupFitness();

    /**
     * [@constant] HKMetadataKeyIndoorWorkout
     * 
     * Represents whether or not a workout was performed indoors as opposed to outdoors.
     * 
     * The expected value type is an NSNumber containing a BOOL value.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyIndoorWorkout();

    /**
     * [@constant] HKMetadataKeyCoachedWorkout
     * 
     * Represents whether or not a workout was performed with a coach or personal trainer.
     * 
     * The expected value type is an NSNumber containing a BOOL value.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyCoachedWorkout();

    /**
     * [@constant] HKMetadataKeyWeatherCondition
     * 
     * Represents the weather condition during the sample.
     * 
     * The expected value type is an NSNumber containing an HKWeatherCondition value. This key may be set on an
     * HKWorkout object to represent the overall weather condition during the workout.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyWeatherCondition();

    /**
     * [@constant] HKMetadataKeyWeatherTemperature
     * 
     * Represents the weather temperature during the sample.
     * 
     * The expected value type is an HKQuantity expressed in a temperature unit. This key may be set on an
     * HKWorkout object to represent the overall temperature during the workout.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyWeatherTemperature();

    /**
     * [@constant] HKMetadataKeyWeatherHumidity
     * 
     * Represents the weather humidity during the sample.
     * 
     * The expected value type is an HKQuantity expressed in percent. This key may be set on an HKWorkout
     * object to represent the overall humidity during the workout.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyWeatherHumidity();

    /**
     * [@constant] HKMetadataKeySexualActivityProtectionUsed
     * 
     * Represents whether or not protection was used during sexual activity. This can be used to track either
     * protection from STIs or protection from pregnancy.
     * 
     * The expected value type is an NSNumber containing a BOOL value.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeySexualActivityProtectionUsed();

    /**
     * [@constant] HKMetadataKeyMenstrualCycleStart
     * 
     * Indicates whether or not the sample represents the start of a menstrual cycle. This is a required
     * metadata key for category samples of type HKCategoryTypeIdentifierMenstrualFlow.
     * 
     * The expected value type is an NSNumber containing a BOOL value.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyMenstrualCycleStart();

    /**
     * [@constant] HKMetadataKeyLapLength
     * 
     * Represents the length of a lap recorded during a workout.
     * 
     * The expected value type is an HKQuantity object compatible with a length unit. This key may be set on an
     * HKWorkout object to represent the length of a lap.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyLapLength();

    /**
     * [@constant] HKMetadataKeySwimmingLocationType
     * 
     * Represents the location type of a swimming workout.
     * 
     * The expected value type is an NSNumber containing an HKWorkoutSwimmingLocationType value. This key may
     * be set on an HKWorkout object to represent the swimming location type.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeySwimmingLocationType();

    /**
     * [@constant] HKMetadataKeySwimmingStrokeStyle
     * 
     * Represents the predominant stroke style during a lap of a swimming workout.
     * 
     * The expected value type is an NSNumber containing an HKSwimmingStrokeStyle value. This key may be set on
     * an HKWorkoutEvent object with the type HKWorkoutEventTypeLap to represent the predominant style used
     * during the lap.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeySwimmingStrokeStyle();

    /**
     * count, Discrete (Arithmetic)
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBodyMassIndex();

    /**
     * %, Discrete (Arithmetic)
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBodyFatPercentage();

    /**
     * m, Discrete (Arithmetic)
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierHeight();

    /**
     * kg, Discrete (Arithmetic)
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBodyMass();

    /**
     * kg, Discrete (Arithmetic)
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierLeanBodyMass();

    /**
     * count, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierStepCount();

    /**
     * m, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDistanceWalkingRunning();

    /**
     * m, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDistanceCycling();

    /**
     * m, Cumulative
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDistanceWheelchair();

    /**
     * kcal, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBasalEnergyBurned();

    /**
     * kcal, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierActiveEnergyBurned();

    /**
     * count, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierFlightsClimbed();

    /**
     * count, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierNikeFuel();

    /**
     * min, Cumulative
     * 
     * API-Since: 9.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierAppleExerciseTime();

    /**
     * count, Cumulative
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierPushCount();

    /**
     * m, Cumulative
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDistanceSwimming();

    /**
     * count, Cumulative
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierSwimmingStrokeCount();

    /**
     * count/s, Discrete (Temporally Weighted)
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierHeartRate();

    /**
     * degC, Discrete (Arithmetic)
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBodyTemperature();

    /**
     * degC, Discrete (Arithmetic)
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBasalBodyTemperature();

    /**
     * mmHg, Discrete (Arithmetic)
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBloodPressureSystolic();

    /**
     * mmHg, Discrete (Arithmetic)
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBloodPressureDiastolic();

    /**
     * count/s, Discrete (Arithmetic)
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierRespiratoryRate();

    /**
     * %, Discrete (Arithmetic)
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierOxygenSaturation();

    /**
     * %, Discrete (Arithmetic)
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierPeripheralPerfusionIndex();

    /**
     * mg/dL, Discrete (Arithmetic)
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBloodGlucose();

    /**
     * count, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierNumberOfTimesFallen();

    /**
     * S, Discrete (Arithmetic)
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierElectrodermalActivity();

    /**
     * count, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierInhalerUsage();

    /**
     * %, Discrete (Arithmetic)
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBloodAlcoholContent();

    /**
     * L, Discrete (Arithmetic)
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierForcedVitalCapacity();

    /**
     * L, Discrete (Arithmetic)
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierForcedExpiratoryVolume1();

    /**
     * L/min, Discrete (Arithmetic)
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierPeakExpiratoryFlowRate();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryFatTotal();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryFatPolyunsaturated();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryFatMonounsaturated();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryFatSaturated();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryCholesterol();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietarySodium();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryCarbohydrates();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryFiber();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietarySugar();

    /**
     * kcal, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryEnergyConsumed();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryProtein();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryVitaminA();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryVitaminB6();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryVitaminB12();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryVitaminC();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryVitaminD();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryVitaminE();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryVitaminK();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryCalcium();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryIron();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryThiamin();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryRiboflavin();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryNiacin();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryFolate();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryBiotin();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryPantothenicAcid();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryPhosphorus();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryIodine();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryMagnesium();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryZinc();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietarySelenium();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryCopper();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryManganese();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryChromium();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryMolybdenum();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryChloride();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryPotassium();

    /**
     * g, Cumulative
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryCaffeine();

    /**
     * mL, Cumulative
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryWater();

    /**
     * , Discrete (Arithmetic)
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierUVExposure();

    /**
     * HKCategoryValueSleepAnalysis
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierSleepAnalysis();

    /**
     * HKCategoryValueAppleStandHour
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierAppleStandHour();

    /**
     * HKCategoryValueCervicalMucusQuality
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierCervicalMucusQuality();

    /**
     * HKCategoryValueOvulationTestResult
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierOvulationTestResult();

    /**
     * HKCategoryValueMenstrualFlow
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierMenstrualFlow();

    /**
     * HKCategoryValue
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierIntermenstrualBleeding();

    /**
     * HKCategoryValue
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierSexualActivity();

    /**
     * HKCategoryValue
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierMindfulSession();

    /**
     * HKBiologicalSexObject
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCharacteristicTypeIdentifierBiologicalSex();

    /**
     * HKBloodTypeObject
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCharacteristicTypeIdentifierBloodType();

    /**
     * NSDateComponents
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCharacteristicTypeIdentifierDateOfBirth();

    /**
     * HKFitzpatrickSkinTypeObject
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCharacteristicTypeIdentifierFitzpatrickSkinType();

    /**
     * HKWheelchairUseObject
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCharacteristicTypeIdentifierWheelchairUse();

    /**
     * Heart
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCorrelationTypeIdentifierBloodPressure();

    /**
     * Other
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCorrelationTypeIdentifierFood();

    /**
     * Clinical Documents
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDocumentTypeIdentifierCDA();

    /**
     * Fitness
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKWorkoutTypeIdentifier();

    /**
     * Predicate Key Paths
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathQuantity();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathWorkoutTotalFlightsClimbed();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKWorkoutSortIdentifierTotalFlightsClimbed();

    /**
     * [@constant] HKMetadataKeyHeartRateMotionContext
     * 
     * Represents the context in which a particular heart rate reading was taken.
     * 
     * The expected value type is an NSNumber containing a HKHeartRateMotionContext value. The value is active
     * (HKHeartRateMotionContextActive) if the user is in motion or working out, sedentary if the user is
     * still (HKHeartRateMotionContextSedentary), or not set (HKHeartRateMotionContextNotSet) otherwise.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyHeartRateMotionContext();

    /**
     * [@constant] HKMetadataKeySyncIdentifier
     * 
     * Represents an identifier for an HKObject that is set by its source and is used by HealthKit to uniquely
     * identify an object.
     * 
     * Saving a HKObject with a HKMetadataKeySyncIdentifier will replace an existing HKObject with the
     * same HKMetadataKeySyncIdentifier value if the new HKObject has a greater HKMetadataKeySyncVersion.
     * The new sample will be added to all HKWorkouts or HKCorrelations containing the replaced sample.
     * HKMetadataKeySyncVersion must be provided if HKMetadataKeySyncIdentifier is provided.
     * The expected value type is NSString.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeySyncIdentifier();

    /**
     * [@constant] HKMetadataKeySyncVersion
     * 
     * Represents the version of the HKObject that is set by its source and is used by HealthKit to identify an
     * object's version.
     * 
     * HKMetadataKeySyncVersion may not be provided if HKMetadataKeySyncIdentifier is not provided.
     * The expected value type is NSNumber.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeySyncVersion();

    /**
     * [@constant] HKMetadataKeyInsulinDeliveryReason
     * 
     * Represents the medical reason for the delivery of an insulin dose. This is a required metadata key for
     * samples of type HKQuantityTypeIdentifierInsulinDelivery.
     * 
     * The expected value type is an NSNumber containing a HKInsulinDeliveryReason value.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyInsulinDeliveryReason();

    /**
     * [@constant] HKMetadataKeyBloodGlucoseMealTime
     * 
     * Indicates the relative timing of a blood glucose reading to a meal.
     * 
     * This timing, as well as other factors like meal composition, can be used by medical professionals to
     * determine the acceptable value range for a blood glucose reading. For use cases requiring the capture of
     * precise timing and composition information, developers should record additional dietary samples, such as
     * HKQuantityTypeIdentifierDietaryCarbohydrates. The expected value type is an NSNumber containing a
     * HKBloodGlucoseMealTime value.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyBloodGlucoseMealTime();

    /**
     * [@constant] HKMetadataKeyVO2MaxTestType
     * 
     * Represents the test used to create VO2 Max Sample
     * 
     * The expected value type is an NSNumber containing a HKVO2MaxTestType value.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyVO2MaxTestType();

    /**
     * m, Discrete (Arithmetic)
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierWaistCircumference();

    /**
     * ml/(kg*min), Discrete (Arithmetic)
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierVO2Max();

    /**
     * count/min, Discrete (Arithmetic)
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierRestingHeartRate();

    /**
     * count/min, Discrete (Arithmetic)
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierWalkingHeartRateAverage();

    /**
     * ms, Discrete (Arithmetic)
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierHeartRateVariabilitySDNN();

    /**
     * IU, Cumulative
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierInsulinDelivery();

    /**
     * Fitness
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKWorkoutRouteTypeIdentifier();

    /**
     * Constants to match on any value of that property when querying for samples from an HKSourceRevision
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKSourceRevisionAnyVersion();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKSourceRevisionAnyProductType();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native NSOperatingSystemVersion HKSourceRevisionAnyOperatingSystem();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKFHIRResourceTypeAllergyIntolerance();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKFHIRResourceTypeCondition();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKFHIRResourceTypeImmunization();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKFHIRResourceTypeMedicationDispense();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKFHIRResourceTypeMedicationOrder();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKFHIRResourceTypeMedicationStatement();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKFHIRResourceTypeObservation();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKFHIRResourceTypeProcedure();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathClinicalRecordFHIRResourceIdentifier();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathClinicalRecordFHIRResourceType();

    /**
     * m, Cumulative
     * 
     * API-Since: 11.2
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDistanceDownhillSnowSports();

    /**
     * min, Cumulative
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierAppleStandTime();

    /**
     * dBASPL, Discrete (Equivalent Continuous Level)
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierEnvironmentalAudioExposure();

    /**
     * dBASPL, Discrete (Equivalent Continuous Level)
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierHeadphoneAudioExposure();

    /**
     * HKCategoryValue
     * 
     * API-Since: 12.2
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierHighHeartRateEvent();

    /**
     * HKCategoryValue
     * 
     * API-Since: 12.2
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierLowHeartRateEvent();

    /**
     * HKCategoryValue
     * 
     * API-Since: 12.2
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierIrregularHeartRhythmEvent();

    /**
     * ----------------
     * Deprecated
     * ----------------
     * 
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierAudioExposureEvent();

    /**
     * HKCategoryValue
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierToothbrushingEvent();

    /**
     * Heart
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDataTypeIdentifierHeartbeatSeries();

    /**
     * A type identifier for records of allergies or intolerances.
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKClinicalTypeIdentifierAllergyRecord();

    /**
     * A type identifier for records of a condition, problem, or diagnosis.
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKClinicalTypeIdentifierConditionRecord();

    /**
     * A type identifier for records of vaccine administration.
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKClinicalTypeIdentifierImmunizationRecord();

    /**
     * A type identifier for records of lab results.
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKClinicalTypeIdentifierLabResultRecord();

    /**
     * A type identifier for records of medication prescription, intake, or administration.
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKClinicalTypeIdentifierMedicationRecord();

    /**
     * A type identifier for records of clinical procedures.
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKClinicalTypeIdentifierProcedureRecord();

    /**
     * A type identifier for records of vital signs.
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKClinicalTypeIdentifierVitalSignRecord();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathCount();

    /**
     * Predicate Key Paths
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathSum();

    /**
     * Predicate Key Paths
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathMin();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathAverage();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathMax();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathMostRecent();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathMostRecentStartDate();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathMostRecentEndDate();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathMostRecentDuration();

    /**
     * [@constant] HKMetadataKeyAverageSpeed
     * 
     * Represents the average speed for a workout segment or distance sample.
     * 
     * This represents the average speed when moving so it may not match the value of distance/time for a
     * distance sample.
     * 
     * The expected value type is an HKQuantity object compatible with a speed unit (e.g. m/s). This key may be
     * set on quantity samples of type HKQuantityTypeIdentifierDistanceDownhillSnowSports or a workout segment
     * representing a skiing run.
     * 
     * API-Since: 11.2
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyAverageSpeed();

    /**
     * [@constant] HKMetadataKeyMaximumSpeed
     * 
     * Represents the maximum speed for a workout segment or distance sample.
     * 
     * The expected value type is an HKQuantity object compatible with a speed unit (e.g. m/s). This key may be
     * set on quantity samples of type HKQuantityTypeIdentifierDistanceDownhillSnowSports or a workout segment
     * representing a skiing run.
     * 
     * API-Since: 11.2
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyMaximumSpeed();

    /**
     * [@constant] HKMetadataKeyAlpineSlopeGrade
     * 
     * Represents the grade of a ski run.
     * 
     * Alpine slope grade is measured in percent where 100% grade is a 45 degree slope.
     * 
     * The expected value type is an HKQuantity object compatible with percent unit. This key may be set on
     * quantity samples of type HKQuantityTypeIdentifierDistanceDownhillSnowSports or a workout segment
     * representing a skiing run.
     * 
     * API-Since: 11.2
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyAlpineSlopeGrade();

    /**
     * [@constant] HKMetadataKeyElevationAscended
     * 
     * Represents the cumulative elevation ascent during a workout.
     * 
     * The expected value type is an HKQuantity object compatible with length unit. This key may be set on a
     * workout, workout segments or distance samples.
     * 
     * API-Since: 11.2
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyElevationAscended();

    /**
     * [@constant] HKMetadataKeyElevationDescended
     * 
     * Represents the cumulative elevation descent during a workout.
     * 
     * The expected value type is an HKQuantity object compatible with length unit. This key may be set on a
     * workout, workout segments or distance samples.
     * 
     * API-Since: 11.2
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyElevationDescended();

    /**
     * [@constant] HKMetadataKeyFitnessMachineDuration
     * 
     * Represents the workout duration as displayed by a GymKit connected fitness machine.
     * 
     * The expected value type is an HKQuantity object compatible with a time unit. This key may be set on an
     * HKWorkout object to represent the duration of the workout as displayed by a GymKit connected fitness
     * machine.
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyFitnessMachineDuration();

    /**
     * [@constant] HKMetadataKeyIndoorBikeDistance
     * 
     * Represents the distance covered during an indoor bike workout.
     * 
     * The expected value type is an HKQuantity object compatible with a length unit. This key may be set on an
     * HKWorkout object to represent the distance covered during an indoor bike workout.
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyIndoorBikeDistance();

    /**
     * [@constant] HKMetadataKeyCrossTrainerDistance
     * 
     * Represents the distance covered during a cross trainer workout.
     * 
     * The expected value type is an HKQuantity object compatible with a length unit. This key may be set on an
     * HKWorkout object to represent the distance covered during a cross trainer workout.
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyCrossTrainerDistance();

    /**
     * [@constant] HKMetadataKeyHeartRateEventThreshold
     * 
     * Represents the threshold heart rate that triggered a heart rate event.
     * 
     * The expected value is an HKQuantity object with a compatible unit (e.g. count/min).
     * This key will be set on heart rate event samples of type HKCategoryTypeIdentifierHighHeartRateEvent and
     * HKCategoryTypeIdentifierLowHeartRateEvent.
     * 
     * API-Since: 12.2
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyHeartRateEventThreshold();

    /**
     * [@constant] HKMetadataKeyAverageMETs
     * 
     * Represents the average METs, or Metabolic Equivalent of Task during a workout.
     * 
     * The expected value type is an HKQuantity expressed in a METs (kcal/(kg*hr)) unit. This key may be set on an
     * HKWorkout object to represent the average workout intensity represented as METs over the entire workout duration.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyAverageMETs();

    /**
     * [@constant] HKMetadataKeyAudioExposureLevel
     * 
     * Represents the audio level associated with an audio event.
     * 
     * The expected value is an HKQuantity whose value is the audio level
     * associated with the event measured in dBASPL units.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyAudioExposureLevel();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierAbdominalCramps();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierAcne();

    /**
     * HKCategoryValueAppetiteChanges
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierAppetiteChanges();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierGeneralizedBodyAche();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierBloating();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierBreastPain();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierChestTightnessOrPain();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierChills();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierConstipation();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierCoughing();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierDiarrhea();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierDizziness();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierFainting();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierFatigue();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierFever();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierHeadache();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierHeartburn();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierHotFlashes();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierLowerBackPain();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierLossOfSmell();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierLossOfTaste();

    /**
     * HKCategoryValuePresence
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierMoodChanges();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierNausea();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierPelvicPain();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierRapidPoundingOrFlutteringHeartbeat();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierRunnyNose();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierShortnessOfBreath();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierSinusCongestion();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierSkippedHeartbeat();

    /**
     * HKCategoryValuePresence
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierSleepChanges();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierSoreThroat();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierVomiting();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 13.6
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierWheezing();

    /**
     * Predicate Key Paths
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathAverageHeartRate();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathECGClassification();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathECGSymptomsStatus();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKFHIRResourceTypeCoverage();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKFHIRResourceTypeMedicationRequest();

    /**
     * m/s, Discrete (Arithmetic)
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierWalkingSpeed();

    /**
     * %, Discrete (Arithmetic)
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierWalkingDoubleSupportPercentage();

    /**
     * %, Discrete (Arithmetic)
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierWalkingAsymmetryPercentage();

    /**
     * m, Discrete (Arithmetic)
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierWalkingStepLength();

    /**
     * m, Discrete (Arithmetic)
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierSixMinuteWalkTestDistance();

    /**
     * m/s, Discrete (Arithmetic)
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierStairAscentSpeed();

    /**
     * m/s, Discrete (Arithmetic)
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierStairDescentSpeed();

    /**
     * HKCategoryValueEnvironmentalAudioExposureEvent
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierEnvironmentalAudioExposureEvent();

    /**
     * HKCategoryValue
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierHandwashingEvent();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierBladderIncontinence();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierDrySkin();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierHairLoss();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierMemoryLapse();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierNightSweats();

    /**
     * HKCategoryValueSeverity
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierVaginalDryness();

    /**
     * HKActivityMoveModeObject
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCharacteristicTypeIdentifierActivityMoveMode();

    /**
     * A type identifier for records containing information about the user’s insurance coverage.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKClinicalTypeIdentifierCoverageRecord();

    /**
     * The "DSTU2" release: http://hl7.org/fhir/DSTU2/
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKFHIRReleaseDSTU2();

    /**
     * The "R4" release: http://hl7.org/fhir/R4/
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKFHIRReleaseR4();

    /**
     * An unknown release
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKFHIRReleaseUnknown();

    /**
     * [@constant] HKMetadataKeyAppleECGAlgorithmVersion
     * 
     * Represents the ECG algorithm version that was used to generate a particular HKElectrocardiogram.
     * 
     * The expected value type is an an NSNumber containing a HKAppleECGAlgorithmVersion value.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyAppleECGAlgorithmVersion();

    /**
     * [@constant] HKMetadataKeyDevicePlacementSide
     * 
     * Represents the detected placement of the device during the bout of walking
     * 
     * The expected value type is an NSNumber containing a HKDevicePlacementSide value. This key is expected to
     * be written for Walking Aymmetry Percentage.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyDevicePlacementSide();

    /**
     * [@constant] HKMetadataKeyBarometricPressure
     * 
     * Represents the barometric pressure recorded at the time of a sample.
     * 
     * The expected value type is an HKQuantity representing a value in units of pressure (atmospheres, pascals,
     * millimeters of Mercury).
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyBarometricPressure();

    /**
     * [@constant] HKMetadataKeyAppleDeviceCalibrated
     * 
     * Represents the calibration status of the devices used to generate this sample.
     * 
     * The expected value is a boolean NSNumber indicating whether the sample value was estimated using a sufficient set
     * of device calibration data. The calibration status of a device may vary per data type. This key is read-only.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyAppleDeviceCalibrated();

    /**
     * HKCategoryValueHeadphoneAudioExposureEvent
     * 
     * API-Since: 14.2
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierHeadphoneAudioExposureEvent();

    /**
     * [@constant] HKMetadataKeyAudioExposureDuration
     * 
     * Represents the duration of time that is covered by audio samples.
     * 
     * The expected value type is an HKQuantity object compatible with a time unit.
     * This key may be set on headphone audio exposure event samples to indicate
     * the duration of time that the user was actually exposed to audio through their headphones.
     * 
     * API-Since: 14.2
     */
    @NotNull
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
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native boolean HKAppleWalkingSteadinessClassificationForQuantity(@NotNull HKQuantity value,
            @NotNull NIntPtr classificationOut, @Nullable Ptr<NSError> errorOut);

    /**
     * Retrieves the minimum quantity in percent unit for an Apple Walking Steadiness classification.
     * 
     * @param classification Apple Walking Steadiness classification for desired minimum value.
     * 
     *                       API-Since: 15.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native HKQuantity HKAppleWalkingSteadinessMinimumQuantityForClassification(@NInt long classification);

    /**
     * Retrieves the maximum quantity in percent unit for an Apple Walking Steadiness classification.
     * 
     * @param classification Apple Walking Steadiness classification for desired maximum value.
     * 
     *                       API-Since: 15.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native HKQuantity HKAppleWalkingSteadinessMaximumQuantityForClassification(@NInt long classification);

    /**
     * min, Cumulative
     * 
     * API-Since: 14.5
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierAppleMoveTime();

    /**
     * %, Discrete (Arithmetic)
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierAppleWalkingSteadiness();

    /**
     * count, Cumulative
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierNumberOfAlcoholicBeverages();

    /**
     * HKCategoryValuePregnancyTestResult
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierPregnancyTestResult();

    /**
     * HKCategoryValueProgesteroneTestResult
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierProgesteroneTestResult();

    /**
     * HKCategoryValue
     * 
     * API-Since: 14.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierPregnancy();

    /**
     * HKCategoryValue
     * 
     * API-Since: 14.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierLactation();

    /**
     * HKCategoryValueContraceptive
     * 
     * API-Since: 14.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierContraceptive();

    /**
     * HKCategoryValueLowCardioFitnessEvent
     * 
     * API-Since: 14.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierLowCardioFitnessEvent();

    /**
     * HKCategoryValueAppleWalkingSteadinessEvent
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierAppleWalkingSteadinessEvent();

    /**
     * [@constant] HKMetadataKeyVO2MaxValue
     * 
     * Represents a VO2Max value that can be associated with, for example, Cardio Fitness Events
     * 
     * This key should be used to store an HKQuantity with a unit of `ml/kg·min`
     * 
     * API-Since: 14.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyVO2MaxValue();

    /**
     * [@constant] HKMetadataKeyLowCardioFitnessEventThreshold
     * 
     * Can be used to store a snapshot of the threshold used to classify VO2Max values as "low"
     * 
     * This key should be used to store an HKQuantity, with a unit of `ml/kg·min`, representing the low fitness
     * threshold.
     * 
     * API-Since: 14.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyLowCardioFitnessEventThreshold();

    /**
     * [@constant] HKMetadataKeyDateOfEarliestDataUsedForEstimate
     * 
     * Represents how far back an estimation algorithm incorporated data from.
     * 
     * The expected value is an NSDate indicating the earliest date of data used to produce an estimated value for an
     * HKSample.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyDateOfEarliestDataUsedForEstimate();

    /**
     * [@constant] HKMetadataKeyAlgorithmVersion
     * 
     * The version of the algorithm used to generate the sample.
     * 
     * The key for an NSNumber containing an NSInteger indicating the version of the algorithm used to generate the
     * sample.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyAlgorithmVersion();

    /**
     * Returns the set of `HKCategoryValueSleepAnalysis` values that are considered to be asleep.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSSet<? extends NSNumber> HKCategoryValueSleepAnalysisAsleepValues();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathWorkoutSumQuantity();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathWorkoutMinimumQuantity();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathWorkoutMaximumQuantity();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathWorkoutAverageQuantity();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathWorkoutActivity();

    /**
     * degC, Discrete (Arithmetic)
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierAppleSleepingWristTemperature();

    /**
     * m, Discrete (Arithmetic)
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierRunningStrideLength();

    /**
     * cm, Discrete (Arithmetic)
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierRunningVerticalOscillation();

    /**
     * ms, Discrete (Arithmetic)
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierRunningGroundContactTime();

    /**
     * W, Discrete (Arithmetic)
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierRunningPower();

    /**
     * m/s, Discrete (Arithmetic)
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierRunningSpeed();

    /**
     * count/min, Discrete (Arithmetic)
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierHeartRateRecoveryOneMinute();

    /**
     * %, Discrete (Temporally Weighted)
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierAtrialFibrillationBurden();

    /**
     * m, Discrete (Arithmetic)
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierUnderwaterDepth();

    /**
     * degC, Discrete (Arithmetic)
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierWaterTemperature();

    /**
     * HKCategoryValue
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierPersistentIntermenstrualBleeding();

    /**
     * HKCategoryValue
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierProlongedMenstrualPeriods();

    /**
     * HKCategoryValue
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierIrregularMenstrualCycles();

    /**
     * HKCategoryValue
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierInfrequentMenstrualCycles();

    /**
     * Body Measurements
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKVisionPrescriptionTypeIdentifier();

    /**
     * [@constant] HKMetadataKeyUserMotionContext
     * 
     * Represents the user's motion when a particular sample was taken.
     * 
     * The expected value type is an NSNumber containing a HKUserMotionContext value. The value is active
     * (HKUserMotionContextActive) if the user is in motion or working out, stationary if the user is
     * still (HKUserMotionContextStationary), or not set (HKUserMotionContextNotSet) otherwise.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyUserMotionContext();

    /**
     * [@constant] HKMetadataKeySessionEstimate
     * 
     * Represents a per-session estimate prior to longitudinal smoothing applied to the value stored in the associated
     * HKQuantitySample.
     * 
     * The expected value type is an HKQuantity object with a unit compatible with the associated HKQuantitySample.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeySessionEstimate();

    /**
     * [@constant] HKMetadataKeyHeartRateRecoveryTestType
     * 
     * Represents the test used to determine a Heart Rate Recovery value
     * 
     * The expected value type is an NSNumber containing a HKHeartRateRecoveryTestType value.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyHeartRateRecoveryTestType();

    /**
     * [@constant] HKMetadataKeyHeartRateRecoveryActivityType
     * 
     * Represents the activity which preceded a Heart Rate Recovery value
     * 
     * The expected value type is an NSNumber containing a HKWorkoutActivityType value.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyHeartRateRecoveryActivityType();

    /**
     * [@constant] HKMetadataKeyHeartRateRecoveryActivityDuration
     * 
     * Represents the duration of activity which preceded a Heart Rate Recovery value
     * 
     * The expected value type is an HKQuantity object compatible with a time unit.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyHeartRateRecoveryActivityDuration();

    /**
     * [@constant] HKMetadataKeyHeartRateRecoveryMaxObservedRecoveryHeartRate
     * 
     * Represents the maximum heart rate observed during the corresponding Heart Rate Recovery sample interval
     * 
     * The expected value type is an HKQuantity object compatible with "count/min" unit (eg "BPM").
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyHeartRateRecoveryMaxObservedRecoveryHeartRate();

    /**
     * [@constant] HKMetadataKeySWOLFScore
     * 
     * Represents sum of strokes per length and time for the length. Calculated for each lap event and segment event
     * during swimming workout.
     * 
     * The expected value type is an NSNumber containing a score. This key may be set on an HKWorkout object to
     * represent the SWOLF Score during the whole workout.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeySWOLFScore();

    /**
     * [@constant] HKMetadataKeyQuantityClampedToLowerBound
     * 
     * Indicates the quantity was clamped to a lower bound.
     * 
     * Value is a BOOL indicating whether or not the quantity value in the sample has been clamped to some lower bound
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyQuantityClampedToLowerBound();

    /**
     * [@constant] HKMetadataKeyQuantityClampedToUpperBound
     * 
     * Indicates the quantity was clamped to an upper bound.
     * 
     * Value is a BOOL indicating whether or not the quantity value in the sample has been clamped to some upper bound
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyQuantityClampedToUpperBound();

    /**
     * [@constant] HKMetadataKeyGlassesPrescriptionDescription
     * 
     * Represents the description that may be associated with a HKGlassesPrescription.
     * 
     * Glasses are often customized for different purposes like reading or distance. Prescriptions received by an eye
     * care professional can provide different ocular functions.
     * Users may also customize their glasses for different scenarios. The value of the metadata is a NSString that
     * describes the purpose of a HKGlassesPrescription.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyGlassesPrescriptionDescription();

    /**
     * [@constant] HKVerifiableClinicalRecordSourceTypeSMARTHealthCard
     * 
     * Represents a SMART Health Card source type for a verifiable record.
     * 
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKVerifiableClinicalRecordSourceTypeSMARTHealthCard();

    /**
     * [@constant] HKVerifiableClinicalRecordSourceTypeEUDigitalCOVIDCertificate
     * 
     * Represents a EU Digital COVID Certificate source type for a verifiable record.
     * 
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKVerifiableClinicalRecordSourceTypeEUDigitalCOVIDCertificate();

    /**
     * [@constant] HKVerifiableClinicalRecordCredentialTypeCOVID19
     * 
     * Represents the COVID-19 credential type for a verifiable record.
     * 
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKVerifiableClinicalRecordCredentialTypeCOVID19();

    /**
     * [@constant] HKVerifiableClinicalRecordCredentialTypeImmunization
     * 
     * Represents the immunization credential type for a verifiable record.
     * 
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKVerifiableClinicalRecordCredentialTypeImmunization();

    /**
     * [@constant] HKVerifiableClinicalRecordCredentialTypeLaboratory
     * 
     * Represents the laboratory credential type for a verifiable record.
     * 
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKVerifiableClinicalRecordCredentialTypeLaboratory();

    /**
     * [@constant] HKVerifiableClinicalRecordCredentialTypeRecovery
     * 
     * Represents the recovery credential type for a verifiable record.
     * 
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKVerifiableClinicalRecordCredentialTypeRecovery();

    /**
     * Predicate Key Paths
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathWorkoutActivityType();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathWorkoutActivityDuration();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathWorkoutActivityStartDate();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathWorkoutActivityEndDate();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathWorkoutActivitySumQuantity();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathWorkoutActivityMinimumQuantity();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathWorkoutActivityMaximumQuantity();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathWorkoutActivityAverageQuantity();

    /**
     * API-Since: 16.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String HKFHIRResourceTypeDiagnosticReport();

    /**
     * API-Since: 16.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String HKFHIRResourceTypeDocumentReference();

    /**
     * count/min, Discrete (Arithmetic)
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String HKQuantityTypeIdentifierCyclingCadence();

    /**
     * W, Discrete (Arithmetic)
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String HKQuantityTypeIdentifierCyclingFunctionalThresholdPower();

    /**
     * W, Discrete (Arithmetic)
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String HKQuantityTypeIdentifierCyclingPower();

    /**
     * m/s, Discrete (Arithmetic)
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String HKQuantityTypeIdentifierCyclingSpeed();

    /**
     * kcal/(kg*hr), Discrete (Arithmetic)
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String HKQuantityTypeIdentifierPhysicalEffort();

    /**
     * dBASPL, Discrete (Equivalent Continuous Level)
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String HKQuantityTypeIdentifierEnvironmentalSoundReduction();

    /**
     * min, Cumulative
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String HKQuantityTypeIdentifierTimeInDaylight();

    /**
     * A type identifier for records that represent clinical notes.
     * 
     * API-Since: 16.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String HKClinicalTypeIdentifierClinicalNoteRecord();

    /**
     * [@constant] HKMetadataKeyAppleFitnessPlusSession
     * 
     * Represents whether or not a workout is a Fitness+ workout.
     * 
     * The expected value type is an NSNumber containing a BOOL value.
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String HKMetadataKeyAppleFitnessPlusSession();

    /**
     * [@constant] HKMetadataKeyWaterSalinity
     * 
     * Represents the water salinity for an underwater depth or water temperature sample.
     * 
     * The expected value type is an NSNumber containing a HKWaterSalinity value.
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String HKMetadataKeyWaterSalinity();

    /**
     * [@constant] HKMetadataKeyHeadphoneGain
     * 
     * Represents the headphone gain associated with a Headphone audio exposure event.
     * 
     * The expected value is an HKQuantity whose value is the gain
     * associated with the event measured in decibels in A-weighted Sound Pressure Level units.
     * 
     * API-Since: 16.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String HKMetadataKeyHeadphoneGain();

    /**
     * [@constant] HKMetadataKeyCyclingFunctionalThresholdPowerTestType
     * 
     * Represents the test used to determine a Cycling Functional Threshold Power value.
     * 
     * The expected value type is an NSNumber containing a HKCyclingFunctionalThresholdPowerTestType value.
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String HKMetadataKeyCyclingFunctionalThresholdPowerTestType();

    /**
     * [@constant] HKMetadataKeyActivityType
     * 
     * Represents the activity type related to the sample
     * 
     * The expected value type is an NSNumber containing a HKWorkoutActivityType value.
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String HKMetadataKeyActivityType();

    /**
     * [@constant] HKMetadataKeyPhysicalEffortEstimationType
     * 
     * Represents the estimation type used to create the Physical Effort Sample
     * 
     * The expected value type is an NSNumber containing a HKPhysicalEffortEstimationType value.
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String HKMetadataKeyPhysicalEffortEstimationType();

    /**
     * [@constant] HKMetadataKeyMaximumLightIntensity
     * 
     * Represents maximum intensity of light for an outdoor time sample.
     * 
     * The expected value type is an HKQuantity expressed in HKUnit Lux.
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String HKMetadataKeyMaximumLightIntensity();
}
