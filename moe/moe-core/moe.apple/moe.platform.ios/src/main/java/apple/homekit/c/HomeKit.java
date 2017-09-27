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

package apple.homekit.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("HomeKit")
@Runtime(CRuntime.class)
public final class HomeKit {
    static {
        NatJ.register();
    }

    @Generated
    private HomeKit() {
    }

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMUserFailedAccessoriesKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeLightbulb();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeSwitch();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeThermostat();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeGarageDoorOpener();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeAccessoryInformation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeFan();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeOutlet();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeLockMechanism();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeLockManagement();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeAirQualitySensor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeBattery();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeCarbonDioxideSensor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeCarbonMonoxideSensor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeContactSensor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeDoor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeDoorbell();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeHumiditySensor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeLeakSensor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeLightSensor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeMotionSensor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeOccupancySensor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeSecuritySystem();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeStatefulProgrammableSwitch();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeStatelessProgrammableSwitch();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeSmokeSensor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeTemperatureSensor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeWindow();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeWindowCovering();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeCameraRTPStreamManagement();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeCameraControl();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeMicrophone();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeSpeaker();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeAirPurifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeVentilationFan();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeFilterMaintenance();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeHeaterCooler();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeHumidifierDehumidifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeSlats();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicPropertySupportsEventNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicPropertyReadable();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicPropertyWritable();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicPropertyHidden();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypePowerState();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeHue();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSaturation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeBrightness();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTemperatureUnits();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentTemperature();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetTemperature();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentHeatingCooling();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetHeatingCooling();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCoolingThreshold();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeHeatingThreshold();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentRelativeHumidity();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetRelativeHumidity();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentDoorState();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetDoorState();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeObstructionDetected();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeManufacturer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeModel();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSerialNumber();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeIdentify();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeRotationDirection();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeRotationSpeed();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeOutletInUse();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeVersion();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLogs();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeAudioFeedback();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeAdminOnlyAccess();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSecuritySystemAlarmType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeMotionDetected();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentLockMechanismState();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetLockMechanismState();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLockMechanismLastKnownAction();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLockManagementControlPoint();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLockManagementAutoSecureTimeout();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeAirParticulateDensity();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeAirParticulateSize();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeAirQuality();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeBatteryLevel();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCarbonDioxideDetected();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCarbonDioxideLevel();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCarbonDioxidePeakLevel();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCarbonMonoxideDetected();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCarbonMonoxideLevel();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCarbonMonoxidePeakLevel();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeChargingState();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeContactState();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentHorizontalTilt();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentLightLevel();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentPosition();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentSecuritySystemState();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentVerticalTilt();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeFirmwareVersion();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeHardwareVersion();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeHoldPosition();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeInputEvent();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLeakDetected();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeOccupancyDetected();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeOutputState();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypePositionState();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSmokeDetected();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSoftwareVersion();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeStatusActive();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeStatusFault();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeStatusJammed();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeStatusLowBattery();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeStatusTampered();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetHorizontalTilt();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetSecuritySystemState();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetPosition();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetVerticalTilt();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeStreamingStatus();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSetupStreamEndpoint();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSupportedVideoStreamConfiguration();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSupportedAudioStreamConfiguration();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSupportedRTPConfiguration();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSelectedStreamConfiguration();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeVolume();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeMute();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeNightVision();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeOpticalZoom();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeDigitalZoom();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeImageRotation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeImageMirroring();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeActive();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentAirPurifierState();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetAirPurifierState();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentFanState();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentHeaterCoolerState();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentHumidifierDehumidifierState();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentSlatState();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeWaterLevel();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeFilterChangeIndication();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeFilterLifeLevel();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeFilterResetChangeIndication();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLockPhysicalControls();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSwingMode();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetHeaterCoolerState();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetHumidifierDehumidifierState();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetFanState();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSlatType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentTilt();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetTilt();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeOzoneDensity();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeNitrogenDioxideDensity();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSulphurDioxideDensity();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypePM2_5Density();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypePM10Density();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeVolatileOrganicCompoundDensity();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeDehumidifierThreshold();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeHumidifierThreshold();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatBool();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatInt();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatFloat();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatString();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatArray();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatDictionary();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatUInt8();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatUInt16();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatUInt32();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatUInt64();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatData();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatTLV8();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsCelsius();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsFahrenheit();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsPercentage();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsArcDegree();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsSeconds();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsLux();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsPartsPerMillion();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsMicrogramsPerCubicMeter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMActionSetTypeWakeUp();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMActionSetTypeSleep();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMActionSetTypeHomeDeparture();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMActionSetTypeHomeArrival();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMActionSetTypeUserDefined();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMActionSetTypeTriggerOwned();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeOther();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeSecuritySystem();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeBridge();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeDoor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeDoorLock();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeFan();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeGarageDoorOpener();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeIPCamera();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeLightbulb();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeOutlet();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeProgrammableSwitch();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeRangeExtender();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeSensor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeSwitch();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeThermostat();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeVideoDoorbell();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeWindow();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeWindowCovering();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeAirPurifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeAirHeater();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeAirConditioner();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeAirHumidifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeAirDehumidifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicKeyPath();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicValueKeyPath();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMSignificantEventSunrise();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMSignificantEventSunset();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeLabel();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLabelNamespace();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLabelIndex();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeColorTemperature();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMPresenceKeyPath();
}
