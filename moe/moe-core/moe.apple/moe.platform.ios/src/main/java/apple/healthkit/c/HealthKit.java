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

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
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
    public static native String HKPredicateKeyPathCategoryValue();

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
    public static native String HKQuantityTypeIdentifierHeartRate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBodyTemperature();

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
    public static native String HKCategoryTypeIdentifierSleepAnalysis();

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
    public static native String HKCorrelationTypeIdentifierBloodPressure();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKCorrelationTypeIdentifierFood();

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
    public static native String HKPredicateKeyPathDevice();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathSourceRevision();

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
    public static native String HKMetadataKeySexualActivityProtectionUsed();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKMetadataKeyMenstrualCycleStart();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierBasalBodyTemperature();

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
    public static native String HKCharacteristicTypeIdentifierFitzpatrickSkinType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKPredicateKeyPathDateComponents();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HKQuantityTypeIdentifierAppleExerciseTime();
}
