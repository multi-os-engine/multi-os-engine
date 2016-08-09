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

package ios.homekit.c;


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
	public static native String HMErrorDomain();

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
	public static native String HMCharacteristicTypeSecuritySystemAlarmType();

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
	public static native String HMAccessoryCategoryTypeWindow();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String HMAccessoryCategoryTypeWindowCovering();

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
	public static native String HMCharacteristicKeyPath();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String HMCharacteristicValueKeyPath();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String HMCharacteristicPropertyHidden();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String HMCharacteristicMetadataUnitsLux();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String HMAccessoryCategoryTypeRangeExtender();
}
