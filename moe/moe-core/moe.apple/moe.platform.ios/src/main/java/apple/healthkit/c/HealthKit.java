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

import apple.foundation.struct.NSOperatingSystemVersion;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("HealthKit")
@Runtime(CRuntime.class)
public final class HealthKit {
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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathDateComponents();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKSampleSortIdentifierStartDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKSampleSortIdentifierEndDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathStartDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathEndDate();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathCategoryValue();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathCDATitle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathCDAPatientName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathCDAAuthorName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathCDACustodianName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDetailedCDAValidationErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDevicePropertyKeyName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDevicePropertyKeyManufacturer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDevicePropertyKeyModel();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDevicePropertyKeyHardwareVersion();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDevicePropertyKeyFirmwareVersion();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDevicePropertyKeySoftwareVersion();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDevicePropertyKeyLocalIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKDevicePropertyKeyUDIDeviceIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKUserPreferencesDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyDeviceSerialNumber();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyBodyTemperatureSensorLocation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyHeartRateSensorLocation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyFoodType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyUDIDeviceIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyUDIProductionIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyDigitalSignature();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyExternalUUID();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyTimeZone();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyDeviceName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyDeviceManufacturerName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyWasTakenInLab();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyReferenceRangeLowerLimit();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyReferenceRangeUpperLimit();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyWasUserEntered();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyWorkoutBrandName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyGroupFitness();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyIndoorWorkout();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyCoachedWorkout();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyWeatherCondition();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyWeatherTemperature();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyWeatherHumidity();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeySexualActivityProtectionUsed();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyMenstrualCycleStart();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyLapLength();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeySwimmingLocationType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeySwimmingStrokeStyle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBodyMassIndex();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBodyFatPercentage();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierHeight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBodyMass();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierLeanBodyMass();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierStepCount();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDistanceWalkingRunning();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDistanceCycling();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDistanceWheelchair();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBasalEnergyBurned();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierActiveEnergyBurned();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierFlightsClimbed();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierNikeFuel();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierAppleExerciseTime();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierPushCount();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDistanceSwimming();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierSwimmingStrokeCount();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierHeartRate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBodyTemperature();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBasalBodyTemperature();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBloodPressureSystolic();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBloodPressureDiastolic();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierRespiratoryRate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierOxygenSaturation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierPeripheralPerfusionIndex();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBloodGlucose();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierNumberOfTimesFallen();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierElectrodermalActivity();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierInhalerUsage();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBloodAlcoholContent();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierForcedVitalCapacity();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierForcedExpiratoryVolume1();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierPeakExpiratoryFlowRate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryFatTotal();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryFatPolyunsaturated();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryFatMonounsaturated();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryFatSaturated();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryCholesterol();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietarySodium();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryCarbohydrates();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryFiber();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietarySugar();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryEnergyConsumed();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryProtein();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryVitaminA();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryVitaminB6();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryVitaminB12();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryVitaminC();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryVitaminD();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryVitaminE();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryVitaminK();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryCalcium();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryIron();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryThiamin();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryRiboflavin();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryNiacin();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryFolate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryBiotin();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryPantothenicAcid();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryPhosphorus();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryIodine();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryMagnesium();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryZinc();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietarySelenium();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryCopper();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryManganese();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryChromium();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryMolybdenum();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryChloride();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryPotassium();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryCaffeine();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDietaryWater();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierUVExposure();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierSleepAnalysis();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierAppleStandHour();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierCervicalMucusQuality();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierOvulationTestResult();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierMenstrualFlow();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierIntermenstrualBleeding();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierSexualActivity();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierMindfulSession();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCharacteristicTypeIdentifierBiologicalSex();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCharacteristicTypeIdentifierBloodType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCharacteristicTypeIdentifierDateOfBirth();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCharacteristicTypeIdentifierFitzpatrickSkinType();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKWorkoutTypeIdentifier();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyHeartRateMotionContext();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeySyncIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeySyncVersion();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyInsulinDeliveryReason();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyBloodGlucoseMealTime();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyVO2MaxTestType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierWaistCircumference();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierVO2Max();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierRestingHeartRate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierWalkingHeartRateAverage();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierHeartRateVariabilitySDNN();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierInsulinDelivery();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKWorkoutRouteTypeIdentifier();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierDistanceDownhillSnowSports();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierAppleStandTime();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierEnvironmentalAudioExposure();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierHeadphoneAudioExposure();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierHighHeartRateEvent();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierLowHeartRateEvent();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierIrregularHeartRhythmEvent();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCategoryTypeIdentifierAudioExposureEvent();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathSum();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyAverageSpeed();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyMaximumSpeed();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyAlpineSlopeGrade();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyElevationAscended();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyElevationDescended();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyFitnessMachineDuration();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyIndoorBikeDistance();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyCrossTrainerDistance();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyHeartRateEventThreshold();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyAverageMETs();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyAudioExposureLevel();
}
