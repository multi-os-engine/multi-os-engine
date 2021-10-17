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

    /**
     * Key that provides more details on the accessories that failed during an
     * addUser:completionHandler: or removeUser:completionHandler: call.
     * <p>
     * The value associated with this key is an NSArray of NSDictionary objects. Each dictionary
     * contains the UUID of the accessory that failed to the added/removed and the value
     * corresponding to the dictionary key is an NSError that provides more details on the
     * underlying error for that accessory.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMUserFailedAccessoriesKey();

    /**
     * Service type for lightbulb.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeLightbulb();

    /**
     * Service type for switch.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeSwitch();

    /**
     * Service type for thermostat.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeThermostat();

    /**
     * Service type for garage door opener.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeGarageDoorOpener();

    /**
     * Service type for accessory information.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeAccessoryInformation();

    /**
     * Service type for fan.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeFan();

    /**
     * Service type for outlet.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeOutlet();

    /**
     * Service type for lock mechanism.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeLockMechanism();

    /**
     * Service type for lock management.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeLockManagement();

    /**
     * Service type for air quality sensor.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeAirQualitySensor();

    /**
     * Service type for battery.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeBattery();

    /**
     * Service type for carbon dioxide sensor.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeCarbonDioxideSensor();

    /**
     * Service type for carbon monoxide sensor.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeCarbonMonoxideSensor();

    /**
     * Service type for contact sensor.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeContactSensor();

    /**
     * Service type for door.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeDoor();

    /**
     * Service type for doorbell.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeDoorbell();

    /**
     * Service type for humidity sensor.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeHumiditySensor();

    /**
     * Service type for leak sensor.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeLeakSensor();

    /**
     * Service type for light sensor.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeLightSensor();

    /**
     * Service type for motion sensor.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeMotionSensor();

    /**
     * Service type for occupancy sensor.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeOccupancySensor();

    /**
     * Service type for security system.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeSecuritySystem();

    /**
     * Service type for stateful programmable switch.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeStatefulProgrammableSwitch();

    /**
     * Service type for stateless programmable switch.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeStatelessProgrammableSwitch();

    /**
     * Service type for smoke sensor.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeSmokeSensor();

    /**
     * Service type for temperature sensor.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeTemperatureSensor();

    /**
     * Service type for window.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeWindow();

    /**
     * Service type for window covering.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeWindowCovering();

    /**
     * Service type for stream management.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeCameraRTPStreamManagement();

    /**
     * Service type for camera control.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeCameraControl();

    /**
     * Service type for microphone.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeMicrophone();

    /**
     * Service type for speaker.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeSpeaker();

    /**
     * Service type for air purifier.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeAirPurifier();

    /**
     * Service type for ventilation fan.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeVentilationFan();

    /**
     * Service type for filter maintenance.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeFilterMaintenance();

    /**
     * Service type for heater/cooler.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeHeaterCooler();

    /**
     * Service type for humidifier-dehumidifier.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeHumidifierDehumidifier();

    /**
     * Service type for slats.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeSlats();

    /**
     * This constant specifies that the characteristic supports notifications
     * using the event connection established by the controller. The
     * event connection provides unidirectional communication from the
     * accessory to the controller.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicPropertySupportsEventNotification();

    /**
     * This constant specifies that the characteristic is readable.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicPropertyReadable();

    /**
     * This constant specifies that the characteristic is writable.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicPropertyWritable();

    /**
     * This constant specifies that the characteristic should be hidden from the user.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicPropertyHidden();

    /**
     * Characteristic type for power state. The value of the characteristic is a boolean.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypePowerState();

    /**
     * Characteristic type for hue. The value of the characteristic is a float value in arc degrees.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeHue();

    /**
     * Characteristic type for saturation. The value of the characteristic is a float value in percent.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSaturation();

    /**
     * Characteristic type for brightness. The value of the characteristic is an int value in percent.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeBrightness();

    /**
     * Characteristic type for temperature units. The value of the characteristic is one of the values defined for HMCharacteristicValueTemperatureUnit.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTemperatureUnits();

    /**
     * Characteristic type for current temperature. The value of the characteristic is a float value in Celsius.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentTemperature();

    /**
     * Characteristic type for target temperature. The value of the characteristic is a float value in Celsius.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetTemperature();

    /**
     * Characteristic type for current heating/cooling. The value of the characteristic is one of the values defined for HMCharacteristicValueCurrentHeatingCooling.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentHeatingCooling();

    /**
     * Characteristic type for target heating/cooling. The value of the characteristic is one of the values defined for HMCharacteristicValueHeatingCooling.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetHeatingCooling();

    /**
     * Characteristic type for cooling threshold. The value of the characteristic is a float value in Celsius.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCoolingThreshold();

    /**
     * Characteristic type for heating threshold. The value of the characteristic is a float value in Celsius.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeHeatingThreshold();

    /**
     * Characteristic type for current relative humidity. The value of the characteristic is a float value in percent.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentRelativeHumidity();

    /**
     * Characteristic type for target relative humidity. The value of the characteristic is a float value in percent.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetRelativeHumidity();

    /**
     * Characteristic type for current door state. The value of the characteristic is one of the values defined for HMCharacteristicValueDoorState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentDoorState();

    /**
     * Characteristic type for target door state. The value of the characteristic is one of the values defined for HMCharacteristicValueTargetDoorState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetDoorState();

    /**
     * Characteristic type for obstruction detected. The value of the characteristic is a boolean.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeObstructionDetected();

    /**
     * Characteristic type for name. The value of the characteristic is a string.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeName();

    /**
     * Characteristic type for manufacturer. The value of the characteristic is a string.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeManufacturer();

    /**
     * Characteristic type for model. The value of the characteristic is a string.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeModel();

    /**
     * Characteristic type for serial number. The value of the characteristic is a string.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSerialNumber();

    /**
     * Characteristic type for identify. The value of the characteristic is a boolean.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeIdentify();

    /**
     * Characteristic type for rotation direction. The value of the characteristic is one of the values defined for HMCharacteristicValueRotationDirection.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeRotationDirection();

    /**
     * Characteristic type for rotation speed. The value of the characteristic is a float.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeRotationSpeed();

    /**
     * Characteristic type for outlet in use. The value of the characteristic is a boolean, which is true
     * if the outlet is in use.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeOutletInUse();

    /**
     * Characteristic type for version. The value of the characteristic is a string.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeVersion();

    /**
     * Characteristic type for logs. The value of the characteristic is TLV8 data wrapped in an NSData.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLogs();

    /**
     * Characteristic type for audio feedback. The value of the characteristic is a boolean.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeAudioFeedback();

    /**
     * Characteristic type for admin only access. The value of the characteristic is a boolean.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeAdminOnlyAccess();

    /**
     * Characteristic type for Security System Alarm Type. The value of the characteristic is a uint8.
     * indicating the type of alarm triggered by a security system service. This characteristic has a value
     * of 1 when the alarm type is not known and a value of 0 indicates that the alarm conditions are cleared.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSecuritySystemAlarmType();

    /**
     * Characteristic type for motion detected. The value of the characteristic is a boolean.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeMotionDetected();

    /**
     * Characteristic type for current lock mechanism state. The value of the characteristic is one of the values defined for HMCharacteristicValueLockMechanismState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentLockMechanismState();

    /**
     * Characteristic type for target lock mechanism state. The value of the characteristic is one of the values defined for HMCharacteristicValueTargetLockMechanismState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetLockMechanismState();

    /**
     * Characteristic type for the last known action for a lock mechanism. The value of the characteristic is one of the values
     * defined for HMCharacteristicValueLockMechanismLastKnownAction.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLockMechanismLastKnownAction();

    /**
     * Characteristic type for the control point for lock management. The characteristic is write-only that takes TLV8 data wrapped in an NSData.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLockManagementControlPoint();

    /**
     * * @brief Characteristic type for the auto secure timeout for lock management. The value of the characteristic is an unsigned
     * 32-bit integer representing the number of seconds.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLockManagementAutoSecureTimeout();

    /**
     * Characteristic type for density of air-particulate matter. The value of the characteristic is
     * in units of micrograms/m^3.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeAirParticulateDensity();

    /**
     * Characteristic type for size of air-particulate matter. The value of the characteristic is
     * one of the values defined for HMCharacteristicValueAirParticulateSize.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeAirParticulateSize();

    /**
     * Characteristic type for air quality. The value of the characteristic is
     * one of the values defined for HMCharacteristicValueAirQuality.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeAirQuality();

    /**
     * Characteristic type for battery level. The value of the characteristic is a uint8 value in percent.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeBatteryLevel();

    /**
     * Characteristic type for carbon dioxide detected. The value of the characteristic is a uint8 value.
     * A value of 0 indicates carbon dioxide levels are normal.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCarbonDioxideDetected();

    /**
     * Characteristic type for carbon dioxide level.
     * The value of the characteristic is a float value in units of ppm.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCarbonDioxideLevel();

    /**
     * Characteristic type for carbon dioxide peak level.
     * The value of the characteristic is a float value in units of ppm.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCarbonDioxidePeakLevel();

    /**
     * Characteristic type for carbon monoxide detected. The value of the characteristic is a uint8 value.
     * A value of 0 indicates carbon monoxide levels are normal.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCarbonMonoxideDetected();

    /**
     * Characteristic type for carbon monoxide level.
     * The value of the characteristic is a float value in units of ppm.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCarbonMonoxideLevel();

    /**
     * Characteristic type for carbon monoxide peak level.
     * The value of the characteristic is a float value in units of ppm.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCarbonMonoxidePeakLevel();

    /**
     * Characteristic type for charging state. The value of the characteristic is one of the values defined for HMCharacteristicValueChargingState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeChargingState();

    /**
     * Characteristic type for Contact sensor state. The value of the characteristic is a uint8 value.
     * A value of 0 indicates that contact is detected; a value of 1 indicates no contact is detected.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeContactState();

    /**
     * Characteristic type for current horizontal tilt angle. The value is a float representing the angle in arc degrees.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentHorizontalTilt();

    /**
     * Characteristic type for current light level. The value of the characteristic is a float value in lux.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentLightLevel();

    /**
     * Characteristic type for current position of a door/window. The value of the characteristic is an
     * uint8 value in percent. A value of 0 indicates closed/most shade/least light allowed state and a
     * value of 100 indicates open/no shade/most light allowed state.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentPosition();

    /**
     * Characteristic type for current security system state. The value of the characteristic is one of
     * the values defined for HMCharacteristicValueCurrentSecuritySystemState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentSecuritySystemState();

    /**
     * Characteristic type for current vertical tilt angle. The value is a float representing the angle in arc degrees.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentVerticalTilt();

    /**
     * Characteristic type for firmware version. The value of the characteristic is a string.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeFirmwareVersion();

    /**
     * Characteristic type for hardware version. The value of the characteristic is a string.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeHardwareVersion();

    /**
     * Characteristic type for Hold Position. The value of the characteristic is a boolean
     * indicating that the current position should be held/maintained.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeHoldPosition();

    /**
     * Characteristic type for input event. The value of the characteristic is one of the values defined for HMCharacteristicValueInputEvent.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeInputEvent();

    /**
     * Characteristic type for leak detected. The value of the characteristic is a uint8 value.
     * A value of 0 indicates no leak is detected; a value of 1 indicates that a leak is detected.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLeakDetected();

    /**
     * Characteristic type for Occupancy Detected. The value of the characteristic is a uint8 value.
     * A value of 0 indicates no occupancy is detected; a value of 1 indicates that occupancy is detected.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeOccupancyDetected();

    /**
     * Characteristic type for programmable switch output state. This value is to be used for presentation
     * purposes. For a binary programmable switch, a value of 1 can be used to present a state of ON.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeOutputState();

    /**
     * Characteristic type for Position state. The value of the characteristic is one of the
     * one of the values defined for HMCharacteristicValuePositionState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypePositionState();

    /**
     * Characteristic type for smoke detected. The value of the characteristic is one of the values defined for HMCharacteristicValueSmokeDetectionStatus.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSmokeDetected();

    /**
     * Characteristic type for software version. The value of the characteristic is a string.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSoftwareVersion();

    /**
     * Characteristic type to indicate status of a service is active. The value of the characteristic is a boolean.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeStatusActive();

    /**
     * Characteristic type to indicate status of a service is fault. The value of the characteristic is a uint8 value.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeStatusFault();

    /**
     * Characteristic type to indicate status of a service is jammed. The value of the characteristic is a uint8 value.
     * A value of 0 indicates that the service is not jammed; a value of 1 indicates that the service is jammed.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeStatusJammed();

    /**
     * Characteristic type for status low battery. The value of the characteristic is one of the values defined for HMCharacteristicValueBatteryStatus.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeStatusLowBattery();

    /**
     * Characteristic type to indicate status of a service is tampered. The value of the characteristic is a uint8 value.
     * A value of 0 indicates no tampering has been detected; a value of 1 indicates that a tampering has been detected.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeStatusTampered();

    /**
     * Characteristic type for target horizontal tilt angle. The value is a float representing the angle in arc degrees.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetHorizontalTilt();

    /**
     * Characteristic type for target security system state. The value of the characteristic is one of
     * the values defined for HMCharacteristicValueTargetSecuritySystemState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetSecuritySystemState();

    /**
     * Characteristic type for target position of a door/window/window covering. The value of the
     * characteristic is an uint8 value in percent. A value of 0 indicates closed/most shade/least
     * light allowed state and a value of 100 indicates open/no shade/most light allowed state.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetPosition();

    /**
     * Characteristic type for target vertical tilt angle. The value is a float representing the angle in arc degrees.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetVerticalTilt();

    /**
     * Characteristic type for streaming status. The value is a tlv8 data.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeStreamingStatus();

    /**
     * Characteristic type for setup stream endpoint. The value is a tlv8 data.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSetupStreamEndpoint();

    /**
     * Characteristic type for supported video stream configuration. The value is a tlv8 data.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSupportedVideoStreamConfiguration();

    /**
     * Characteristic type for supported audio stream configuration. The value of the characteristic is TLV8 encoded data.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSupportedAudioStreamConfiguration();

    /**
     * Characteristic type for supported RTP stream configuration. The value is a tlv8 data.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSupportedRTPConfiguration();

    /**
     * Characteristic type for selected stream configuration. The value is a tlv8 data.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSelectedStreamConfiguration();

    /**
     * Characteristic type for volume. The value of the characteristic is a uint8 value in percent.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeVolume();

    /**
     * Characteristic type for mute. The value of the characteristic is a boolean.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeMute();

    /**
     * Characteristic type for night vision. The value of the characteristic is a boolean.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeNightVision();

    /**
     * Characteristic type for camera optical zoom. The value is float.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeOpticalZoom();

    /**
     * Characteristic type for camera digital zoom. The value is float.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeDigitalZoom();

    /**
     * Characteristic type for camera image rotation. The value is float with valid values: 0, 90, 180 and 270
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeImageRotation();

    /**
     * Characteristic type for image mirroring. The value is boolean.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeImageMirroring();

    /**
     * Characteristic type for active. The value of the characteristic is one of the values defined for HMCharacteristicValueActivationState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeActive();

    /**
     * Characteristic type for air purifier current state. The value is
     * one of the value defined for HMCharacteristicValueCurrentAirPurifierState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentAirPurifierState();

    /**
     * Characteristic type for air purifier target state. The value is
     * one of the value defined for HMCharacteristicValueTargetAirPurifierState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetAirPurifierState();

    /**
     * Characteristic type for current fan state. The value of the characteristic is one of the values defined for HMCharacteristicValueCurrentFanState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentFanState();

    /**
     * Characteristic type for current heater-cooler state. The value of the characteristic is one of the values defined for HMCharacteristicValueCurrentHeaterCoolerState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentHeaterCoolerState();

    /**
     * Characteristic type for current humidifier-dehumidifier state. The value of the characteristic is one of the values defined for HMCharacteristicValueCurrentHumidifierDehumidifierState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentHumidifierDehumidifierState();

    /**
     * Characteristic type for current slat state. The value is
     * one of the values defined for HMCharacteristicValueCurrentSlatState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentSlatState();

    /**
     * Characteristic type for water level. The value of the characteristic is a float value in percent.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeWaterLevel();

    /**
     * Characteristic type for filter change indication. The value is
     * one of the values defined for HMCharacteristicValueFilterChange.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeFilterChangeIndication();

    /**
     * Characteristic type for filter life level. The value is in percentage units.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeFilterLifeLevel();

    /**
     * Characteristic type for resetting filter change indication. The characteristic
     * is write-only that takes a boolean value of 1.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeFilterResetChangeIndication();

    /**
     * Characteristic type for lock physical controls. The value of the characteristic is one of the values defined for HMCharacteristicValueLockPhysicalControlsState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLockPhysicalControls();

    /**
     * Characteristic type for swing mode. The value of the characteristic is one of the values defined for HMCharacteristicValueSwingMode.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSwingMode();

    /**
     * Characteristic type for target heater-cooler state. The value of the characteristic is one of the values defined for HMCharacteristicValueTargetHeaterCoolerState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetHeaterCoolerState();

    /**
     * Characteristic type for target humidifier-dehumidifier state. The value of the characteristic is one of the values defined for HMCharacteristicValueTargetHumidifierDehumidifierState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetHumidifierDehumidifierState();

    /**
     * Characteristic type for target fan state. The value of the characteristic is one of the values defined for HMCharacteristicValueTargetFanState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetFanState();

    /**
     * Characteristic type for slat type. The value is
     * one of the values defined for HMCharacteristicValueSlatType.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSlatType();

    /**
     * Characteristic type for current tilt angle. The value is a float representing the angle in arc degrees.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentTilt();

    /**
     * Characteristic type for target tilt angle. The value is a float representing the angle in arc degrees.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetTilt();

    /**
     * Characteristic type for density of ozone. The value of the characteristic is
     * in units of micrograms/m^3.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeOzoneDensity();

    /**
     * Characteristic type for density of nitrogen dioxide. The value of the characteristic is
     * in units of micrograms/m^3.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeNitrogenDioxideDensity();

    /**
     * Characteristic type for density of sulphur dioxide. The value of the characteristic is
     * in units of micrograms/m^3.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSulphurDioxideDensity();

    /**
     * Characteristic type for density of air-particulate matter of size 2.5 micrograms. The
     * value of the characteristic is in units of micrograms/m^3.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypePM2_5Density();

    /**
     * Characteristic type for density of air-particulate matter of size 10 micrograms. The
     * value of the characteristic is in units of micrograms/m^3.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypePM10Density();

    /**
     * Characteristic type for density of volatile organic compounds. The value of the
     * characteristic is in units of micrograms/m^3.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeVolatileOrganicCompoundDensity();

    /**
     * Characteristic type for dehumidifier threshold. The value of the characteristic is a float value in percent.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeDehumidifierThreshold();

    /**
     * Characteristic type for humidifier threshold. The value of the characteristic is a float value in percent.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeHumidifierThreshold();

    /**
     * Describes that the value format is boolean.
     * <p>
     * The value is an NSNumber containing the boolean value.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatBool();

    /**
     * Describes that the value format is an integer.
     * <p>
     * The value is an NSNumber containing a signed 32-bit integer with a range [-2147483648, 2147483647].
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatInt();

    /**
     * Describes that the value format is a float.
     * <p>
     * The value is an NSNumber containing a 32-bit float.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatFloat();

    /**
     * Describes that the value format is a string.
     * <p>
     * The value is an NSString.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatString();

    /**
     * Describes that the value format is an array.
     * <p>
     * The value is an NSArray.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatArray();

    /**
     * Describes that the value format is a dictionary.
     * <p>
     * The value is an NSDictionary.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatDictionary();

    /**
     * Describes that the value format is an unsigned 8-bit integer.
     * <p>
     * The value is an NSNumber containing an unsigned 8-bit integer with a range [0, 255].
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatUInt8();

    /**
     * Describes that the value format is an unsigned 16-bit integer.
     * <p>
     * The value is an NSNumber containing an unsigned 16-bit integer with a range [0, 65535].
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatUInt16();

    /**
     * Describes that the value format is an unsigned 32-bit integer.
     * <p>
     * The value is an NSNumber containing an unsigned 32-bit integer with a range [0, 4294967295].
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatUInt32();

    /**
     * Describes that the value format is an unsigned 64-bit integer.
     * <p>
     * The value is an NSNumber containing an unsigned 64-bit integer with a range [0, 18446744073709551615].
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatUInt64();

    /**
     * Describes that the value format is a data blob.
     * <p>
     * The value is an NSData containing the bytes of data.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatData();

    /**
     * Describes that the value format is a TLV8.
     * <p>
     * The value is an NSData containing a set of one or more TLV8's, which are packed type-length-value items with an 8-bit type, 8-bit length, and N-byte value.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatTLV8();

    /**
     * Describes that the unit of the characteristic is in Celsius.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsCelsius();

    /**
     * Describes that the unit of the characteristic is in Fahrenheit.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsFahrenheit();

    /**
     * Describes that the unit of the characteristic is a percentage.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsPercentage();

    /**
     * Describes that the unit of the characteristic is arc degree.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsArcDegree();

    /**
     * Describes that the unit of the characteristic is seconds.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsSeconds();

    /**
     * Describes that the unit of the characteristic is Lux (illuminance).
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsLux();

    /**
     * Describes that the unit of the characteristic is parts per million.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsPartsPerMillion();

    /**
     * Describes that the unit of the characteristic is micrograms per cubic meter.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsMicrogramsPerCubicMeter();

    /**
     * Builtin action set type for WakeUp.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMActionSetTypeWakeUp();

    /**
     * Type for builtin action set Sleep.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMActionSetTypeSleep();

    /**
     * Type for builtin action set HomeDeparture.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMActionSetTypeHomeDeparture();

    /**
     * Type for builtin action set HomeArrival.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMActionSetTypeHomeArrival();

    /**
     * Type for user-defined action sets.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMActionSetTypeUserDefined();

    /**
     * Type for trigger-owned action sets.
     * <p>
     * An action set of this type is owned by a trigger and is not listed
     * as part of the home. An action set of this type cannot be executed,
     * renamed, or associated with a different trigger.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMActionSetTypeTriggerOwned();

    /**
     * Category type for Other.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeOther();

    /**
     * Category type for Security System.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeSecuritySystem();

    /**
     * Category type for Bridge.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeBridge();

    /**
     * Category type for Door.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeDoor();

    /**
     * Category type for Door Lock.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeDoorLock();

    /**
     * Category type for Fan.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeFan();

    /**
     * Category type for Garage Door Opener.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeGarageDoorOpener();

    /**
     * Category type for IP Camera.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeIPCamera();

    /**
     * Category type for Lightbulb.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeLightbulb();

    /**
     * Category type for Outlet.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeOutlet();

    /**
     * Category type for Programmable Switch.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeProgrammableSwitch();

    /**
     * Category type for Range Extender
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeRangeExtender();

    /**
     * Category type for Sensor.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeSensor();

    /**
     * Category type for Switch.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeSwitch();

    /**
     * Category type for Thermostat.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeThermostat();

    /**
     * Category type for Video Doorbell.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeVideoDoorbell();

    /**
     * Category type for Window.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeWindow();

    /**
     * Category type for Window Covering.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeWindowCovering();

    /**
     * Category type for Air Purifier.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeAirPurifier();

    /**
     * Category type for Air Heater.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeAirHeater();

    /**
     * Category type for Air Conditioner.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeAirConditioner();

    /**
     * Category type for Air Humidifier.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeAirHumidifier();

    /**
     * Category type for Air Dehumidifier.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeAirDehumidifier();

    /**
     * Specifies the key path for a characteristic in a NSPredicate
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicKeyPath();

    /**
     * Specifies the key path for a characteristic value in a NSPredicate
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicValueKeyPath();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMErrorDomain();

    /**
     * Event corresponding to sunrise
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMSignificantEventSunrise();

    /**
     * Event corresponding to sunset
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMSignificantEventSunset();

    /**
     * Service type for label namespace when accessory supports multiple services of the same type.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeLabel();

    /**
     * Characteristic type for label namespace used to label the services on an accessory with
     * multiple services of the same type. The value of the characteristic is one of the values
     * defined for HMCharacteristicValueLabelNamespace.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLabelNamespace();

    /**
     * Characteristic type describing the index of the label for the service on accessory with multiple
     * instances of the same service. The value is an integer and starts from 1.
     * For a label namespace of HMCharacteristicValueLabelNamespaceDot, label index indicates the
     * number of dots - ., .., ..., and so on.
     * For a label namespace of HMCharacteristicValueLabelNamespaceNumeral, label index indicates the arabic
     * numeral - 1, 2, 3, and so on.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLabelIndex();

    /**
     * Characteristic type for color temperature. The value of the characteristic is an int.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeColorTemperature();

    /**
     * Specifies the key path for a presence event in a NSPredicate
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMPresenceKeyPath();

    /**
     * Service type for irrigation system.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeIrrigationSystem();

    /**
     * Service type for valve.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeValve();

    /**
     * Service type for faucet.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeFaucet();

    /**
     * Characteristic type for program mode. The value of the characteristic is one of the values defined
     * for HMCharacteristicValueProgramMode.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeProgramMode();

    /**
     * Characteristic type for in use. The value of the characteristic is one of the values
     * defined for HMCharacteristicValueUsageState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeInUse();

    /**
     * Characteristic type for set duration. The value of the characteristic is an int value in
     * seconds.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSetDuration();

    /**
     * Characteristic type for remaining duration. The value of the characteristic is an int value in
     * seconds.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeRemainingDuration();

    /**
     * Characteristic type for valve type. The value of the characteristic is one of the values
     * defined for HMCharacteristicValueValveType.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeValveType();

    /**
     * Characteristic type for is configured. The value of the characteristic is one of the values defined for HMCharacteristicValueConfigurationState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeIsConfigured();

    /**
     * Category type for Sprinkler.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeSprinkler();

    /**
     * Category type for Faucet.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeFaucet();

    /**
     * Category type for Shower Head.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeShowerHead();
}
