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
     * @brief Key that provides more details on the accessories that failed during an
     *        addUser:completionHandler: or removeUser:completionHandler: call.
     * 
     * @discussion The value associated with this key is an NSArray of NSDictionary objects. Each dictionary
     *             contains the UUID of the accessory that failed to the added/removed and the value
     *             corresponding to the dictionary key is an NSError that provides more details on the
     *             underlying error for that accessory.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMUserFailedAccessoriesKey();

    /**
     * @brief Service type for lightbulb.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeLightbulb();

    /**
     * @brief Service type for switch.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeSwitch();

    /**
     * @brief Service type for thermostat.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeThermostat();

    /**
     * @brief Service type for garage door opener.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeGarageDoorOpener();

    /**
     * @brief Service type for accessory information.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeAccessoryInformation();

    /**
     * @brief Service type for fan.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeFan();

    /**
     * @brief Service type for outlet.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeOutlet();

    /**
     * @brief Service type for lock mechanism.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeLockMechanism();

    /**
     * @brief Service type for lock management.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeLockManagement();

    /**
     * @brief Service type for air quality sensor.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeAirQualitySensor();

    /**
     * @brief Service type for battery.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeBattery();

    /**
     * @brief Service type for carbon dioxide sensor.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeCarbonDioxideSensor();

    /**
     * @brief Service type for carbon monoxide sensor.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeCarbonMonoxideSensor();

    /**
     * @brief Service type for contact sensor.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeContactSensor();

    /**
     * @brief Service type for door.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeDoor();

    /**
     * @brief Service type for doorbell.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeDoorbell();

    /**
     * @brief Service type for humidity sensor.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeHumiditySensor();

    /**
     * @brief Service type for leak sensor.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeLeakSensor();

    /**
     * @brief Service type for light sensor.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeLightSensor();

    /**
     * @brief Service type for motion sensor.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeMotionSensor();

    /**
     * @brief Service type for occupancy sensor.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeOccupancySensor();

    /**
     * @brief Service type for security system.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeSecuritySystem();

    /**
     * @brief Service type for stateful programmable switch.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeStatefulProgrammableSwitch();

    /**
     * @brief Service type for stateless programmable switch.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeStatelessProgrammableSwitch();

    /**
     * @brief Service type for smoke sensor.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeSmokeSensor();

    /**
     * @brief Service type for temperature sensor.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeTemperatureSensor();

    /**
     * @brief Service type for window.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeWindow();

    /**
     * @brief Service type for window covering.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeWindowCovering();

    /**
     * @brief Service type for stream management.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeCameraRTPStreamManagement();

    /**
     * @brief Service type for camera control.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeCameraControl();

    /**
     * @brief Service type for microphone.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeMicrophone();

    /**
     * @brief Service type for speaker.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeSpeaker();

    /**
     * @brief Service type for air purifier.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeAirPurifier();

    /**
     * @brief Service type for ventilation fan.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeVentilationFan();

    /**
     * @brief Service type for filter maintenance.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeFilterMaintenance();

    /**
     * @brief Service type for heater/cooler.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeHeaterCooler();

    /**
     * @brief Service type for humidifier-dehumidifier.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeHumidifierDehumidifier();

    /**
     * @brief Service type for slats.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeSlats();

    /**
     * @brief This constant specifies that the characteristic supports notifications
     *        using the event connection established by the controller. The
     *        event connection provides unidirectional communication from the
     *        accessory to the controller.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicPropertySupportsEventNotification();

    /**
     * @brief This constant specifies that the characteristic is readable.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicPropertyReadable();

    /**
     * @brief This constant specifies that the characteristic is writable.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicPropertyWritable();

    /**
     * @brief This constant specifies that the characteristic should be hidden from the user.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicPropertyHidden();

    /**
     * @brief Characteristic type for power state. The value of the characteristic is a boolean.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypePowerState();

    /**
     * @brief Characteristic type for hue. The value of the characteristic is a float value in arc degrees.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeHue();

    /**
     * @brief Characteristic type for saturation. The value of the characteristic is a float value in percent.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSaturation();

    /**
     * @brief Characteristic type for brightness. The value of the characteristic is an int value in percent.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeBrightness();

    /**
     * @brief Characteristic type for temperature units. The value of the characteristic is one of the values defined for HMCharacteristicValueTemperatureUnit.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTemperatureUnits();

    /**
     * @brief Characteristic type for current temperature. The value of the characteristic is a float value in Celsius.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentTemperature();

    /**
     * @brief Characteristic type for target temperature. The value of the characteristic is a float value in Celsius.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetTemperature();

    /**
     * @brief Characteristic type for current heating/cooling. The value of the characteristic is one of the values defined for HMCharacteristicValueCurrentHeatingCooling.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentHeatingCooling();

    /**
     * @brief Characteristic type for target heating/cooling. The value of the characteristic is one of the values defined for HMCharacteristicValueHeatingCooling.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetHeatingCooling();

    /**
     * @brief Characteristic type for cooling threshold. The value of the characteristic is a float value in Celsius.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCoolingThreshold();

    /**
     * @brief Characteristic type for heating threshold. The value of the characteristic is a float value in Celsius.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeHeatingThreshold();

    /**
     * @brief Characteristic type for current relative humidity. The value of the characteristic is a float value in percent.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentRelativeHumidity();

    /**
     * @brief Characteristic type for target relative humidity. The value of the characteristic is a float value in percent.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetRelativeHumidity();

    /**
     * @brief Characteristic type for current door state. The value of the characteristic is one of the values defined for HMCharacteristicValueDoorState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentDoorState();

    /**
     * @brief Characteristic type for target door state. The value of the characteristic is one of the values defined for HMCharacteristicValueTargetDoorState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetDoorState();

    /**
     * @brief Characteristic type for obstruction detected. The value of the characteristic is a boolean.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeObstructionDetected();

    /**
     * @brief Characteristic type for name. The value of the characteristic is a string.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeName();

    /**
     * @brief Characteristic type for manufacturer. The value of the characteristic is a string.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeManufacturer();

    /**
     * @brief Characteristic type for model. The value of the characteristic is a string.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeModel();

    /**
     * @brief Characteristic type for serial number. The value of the characteristic is a string.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSerialNumber();

    /**
     * @brief Characteristic type for identify. The characteristic is write-only that takes a boolean.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeIdentify();

    /**
     * @brief Characteristic type for rotation direction. The value of the characteristic is one of the values defined for HMCharacteristicValueRotationDirection.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeRotationDirection();

    /**
     * @brief Characteristic type for rotation speed. The value of the characteristic is a float.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeRotationSpeed();

    /**
     * @brief Characteristic type for outlet in use. The value of the characteristic is a boolean, which is true
     *        if the outlet is in use.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeOutletInUse();

    /**
     * @brief Characteristic type for version. The value of the characteristic is a string.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeVersion();

    /**
     * @brief Characteristic type for logs. The value of the characteristic is TLV8 data wrapped in an NSData.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLogs();

    /**
     * @brief Characteristic type for audio feedback. The value of the characteristic is a boolean.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeAudioFeedback();

    /**
     * @brief Characteristic type for admin only access. The value of the characteristic is a boolean.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeAdminOnlyAccess();

    /**
     * @brief Characteristic type for Security System Alarm Type. The value of the characteristic is a uint8.
     *        indicating the type of alarm triggered by a security system service. This characteristic has a value
     *        of 1 when the alarm type is not known and a value of 0 indicates that the alarm conditions are cleared.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSecuritySystemAlarmType();

    /**
     * @brief Characteristic type for motion detected. The value of the characteristic is a boolean.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeMotionDetected();

    /**
     * @brief Characteristic type for current lock mechanism state. The value of the characteristic is one of the values defined for HMCharacteristicValueLockMechanismState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentLockMechanismState();

    /**
     * @brief Characteristic type for target lock mechanism state. The value of the characteristic is one of the values defined for HMCharacteristicValueTargetLockMechanismState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetLockMechanismState();

    /**
     * @brief Characteristic type for the last known action for a lock mechanism. The value of the characteristic is one of the values
     *        defined for HMCharacteristicValueLockMechanismLastKnownAction.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLockMechanismLastKnownAction();

    /**
     * @brief Characteristic type for the control point for lock management. The characteristic is write-only that takes TLV8 data wrapped in an NSData.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLockManagementControlPoint();

    /**
     * * @brief Characteristic type for the auto secure timeout for lock management. The value of the characteristic is an unsigned
     *          32-bit integer representing the number of seconds.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLockManagementAutoSecureTimeout();

    /**
     * @brief Characteristic type for density of air-particulate matter. The value of the characteristic is
     *        in units of micrograms/m^3.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeAirParticulateDensity();

    /**
     * @brief Characteristic type for size of air-particulate matter. The value of the characteristic is
     *        one of the values defined for HMCharacteristicValueAirParticulateSize.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeAirParticulateSize();

    /**
     * @brief Characteristic type for air quality. The value of the characteristic is
     *        one of the values defined for HMCharacteristicValueAirQuality.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeAirQuality();

    /**
     * @brief Characteristic type for battery level. The value of the characteristic is a uint8 value in percent.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeBatteryLevel();

    /**
     * @brief Characteristic type for carbon dioxide detected. The value of the characteristic is a uint8 value.
     *        A value of 0 indicates carbon dioxide levels are normal.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCarbonDioxideDetected();

    /**
     * @brief Characteristic type for carbon dioxide level.
     *        The value of the characteristic is a float value in units of ppm.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCarbonDioxideLevel();

    /**
     * @brief Characteristic type for carbon dioxide peak level.
     *        The value of the characteristic is a float value in units of ppm.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCarbonDioxidePeakLevel();

    /**
     * @brief Characteristic type for carbon monoxide detected. The value of the characteristic is a uint8 value.
     *        A value of 0 indicates carbon monoxide levels are normal.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCarbonMonoxideDetected();

    /**
     * @brief Characteristic type for carbon monoxide level.
     *        The value of the characteristic is a float value in units of ppm.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCarbonMonoxideLevel();

    /**
     * @brief Characteristic type for carbon monoxide peak level.
     *        The value of the characteristic is a float value in units of ppm.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCarbonMonoxidePeakLevel();

    /**
     * @brief Characteristic type for charging state. The value of the characteristic is one of the values defined for HMCharacteristicValueChargingState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeChargingState();

    /**
     * @brief Characteristic type for Contact sensor state. The value of the characteristic is a uint8 value.
     *        A value of 0 indicates that contact is detected; a value of 1 indicates no contact is detected.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeContactState();

    /**
     * @brief Characteristic type for current horizontal tilt angle. The value is a float representing the angle in arc degrees.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentHorizontalTilt();

    /**
     * @brief Characteristic type for current light level. The value of the characteristic is a float value in lux.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentLightLevel();

    /**
     * @brief Characteristic type for current position of a door/window. The value of the characteristic is an
     *        uint8 value in percent. A value of 0 indicates closed/most shade/least light allowed state and a
     *        value of 100 indicates open/no shade/most light allowed state.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentPosition();

    /**
     * @brief Characteristic type for current security system state. The value of the characteristic is one of
     *        the values defined for HMCharacteristicValueCurrentSecuritySystemState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentSecuritySystemState();

    /**
     * @brief Characteristic type for current vertical tilt angle. The value is a float representing the angle in arc degrees.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentVerticalTilt();

    /**
     * @brief Characteristic type for firmware version. The value of the characteristic is a string value
     *        describing the firmware version of the accessory.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeFirmwareVersion();

    /**
     * @brief Characteristic type for hardware version. The value of the characteristic is a string value
     *        describing the hardware version of the accessory.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeHardwareVersion();

    /**
     * @brief Characteristic type for Hold Position. The value of the characteristic is a boolean
     *        indicating that the current position should be held/maintained.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeHoldPosition();

    /**
     * @brief Characteristic type for input event. The value of the characteristic is one of the values defined for HMCharacteristicValueInputEvent.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeInputEvent();

    /**
     * @brief Characteristic type for leak detected. The value of the characteristic is a uint8 value.
     *        A value of 0 indicates no leak is detected; a value of 1 indicates that a leak is detected.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLeakDetected();

    /**
     * @brief Characteristic type for Occupancy Detected. The value of the characteristic is a uint8 value.
     *        A value of 0 indicates no occupancy is detected; a value of 1 indicates that occupancy is detected.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeOccupancyDetected();

    /**
     * @brief Characteristic type for programmable switch output state. This value is to be used for presentation
     *        purposes. For a binary programmable switch, a value of 1 can be used to present a state of ON.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeOutputState();

    /**
     * @brief Characteristic type for Position state. The value of the characteristic is one of the
     *        one of the values defined for HMCharacteristicValuePositionState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypePositionState();

    /**
     * @brief Characteristic type for smoke detected. The value of the characteristic is one of the values defined for HMCharacteristicValueSmokeDetectionStatus.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSmokeDetected();

    /**
     * @brief Characteristic type for software version. The value of the characteristic is a string value
     *        describing the software version of the accessory.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSoftwareVersion();

    /**
     * @brief Characteristic type to indicate status of a service is active. The value of the characteristic is a boolean.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeStatusActive();

    /**
     * @brief Characteristic type to indicate status of a service is fault. The value of the characteristic is a uint8 value.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeStatusFault();

    /**
     * @brief Characteristic type to indicate status of a service is jammed. The value of the characteristic is a uint8 value.
     *        A value of 0 indicates that the service is not jammed; a value of 1 indicates that the service is jammed.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeStatusJammed();

    /**
     * @brief Characteristic type for status low battery. The value of the characteristic is one of the values defined for HMCharacteristicValueBatteryStatus.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeStatusLowBattery();

    /**
     * @brief Characteristic type to indicate status of a service is tampered. The value of the characteristic is a uint8 value.
     *        A value of 0 indicates no tampering has been detected; a value of 1 indicates that a tampering has been detected.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeStatusTampered();

    /**
     * @brief Characteristic type for target horizontal tilt angle. The value is a float representing the angle in arc degrees.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetHorizontalTilt();

    /**
     * @brief Characteristic type for target security system state. The value of the characteristic is one of
     *        the values defined for HMCharacteristicValueTargetSecuritySystemState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetSecuritySystemState();

    /**
     * @brief Characteristic type for target position of a door/window/window covering. The value of the
     *        characteristic is an uint8 value in percent. A value of 0 indicates closed/most shade/least
     *        light allowed state and a value of 100 indicates open/no shade/most light allowed state.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetPosition();

    /**
     * @brief Characteristic type for target vertical tilt angle. The value is a float representing the angle in arc degrees.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetVerticalTilt();

    /**
     * @brief Characteristic type for streaming status. The value is a tlv8 data.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeStreamingStatus();

    /**
     * @brief Characteristic type for setup stream endpoint. The value is a tlv8 data.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSetupStreamEndpoint();

    /**
     * @brief Characteristic type for supported video stream configuration. The value is a tlv8 data.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSupportedVideoStreamConfiguration();

    /**
     * @brief Characteristic type for supported audio stream configuration. The value of the characteristic is TLV8 encoded data.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSupportedAudioStreamConfiguration();

    /**
     * @brief Characteristic type for supported RTP stream configuration. The value is a tlv8 data.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSupportedRTPConfiguration();

    /**
     * @brief Characteristic type for selected stream configuration. The value is a tlv8 data.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSelectedStreamConfiguration();

    /**
     * @brief Characteristic type for volume. The value of the characteristic is a uint8 value in percent.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeVolume();

    /**
     * @brief Characteristic type for mute. The value of the characteristic is a boolean.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeMute();

    /**
     * @brief Characteristic type for night vision. The value of the characteristic is a boolean.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeNightVision();

    /**
     * @brief Characteristic type for camera optical zoom. The value is float.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeOpticalZoom();

    /**
     * @brief Characteristic type for camera digital zoom. The value is float.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeDigitalZoom();

    /**
     * @brief Characteristic type for camera image rotation. The value is float with valid values: 0, 90, 180 and 270
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeImageRotation();

    /**
     * @brief Characteristic type for image mirroring. The value is boolean.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeImageMirroring();

    /**
     * @brief Characteristic type for active. The value of the characteristic is one of the values defined for HMCharacteristicValueActivationState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeActive();

    /**
     * @brief Characteristic type for air purifier current state. The value is
     *        one of the value defined for HMCharacteristicValueCurrentAirPurifierState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentAirPurifierState();

    /**
     * @brief Characteristic type for air purifier target state. The value is
     *        one of the value defined for HMCharacteristicValueTargetAirPurifierState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetAirPurifierState();

    /**
     * @brief Characteristic type for current fan state. The value of the characteristic is one of the values defined for HMCharacteristicValueCurrentFanState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentFanState();

    /**
     * @brief Characteristic type for current heater-cooler state. The value of the characteristic is one of the values defined for HMCharacteristicValueCurrentHeaterCoolerState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentHeaterCoolerState();

    /**
     * @brief Characteristic type for current humidifier-dehumidifier state. The value of the characteristic is one of the values defined for HMCharacteristicValueCurrentHumidifierDehumidifierState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentHumidifierDehumidifierState();

    /**
     * @brief Characteristic type for current slat state. The value is
     *        one of the values defined for HMCharacteristicValueCurrentSlatState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentSlatState();

    /**
     * @brief Characteristic type for water level. The value of the characteristic is a float value in percent.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeWaterLevel();

    /**
     * @brief Characteristic type for filter change indication. The value is
     *        one of the values defined for HMCharacteristicValueFilterChange.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeFilterChangeIndication();

    /**
     * @brief Characteristic type for filter life level. The value is in percentage units.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeFilterLifeLevel();

    /**
     * @brief Characteristic type for resetting filter change indication. The characteristic
     *        is write-only that takes a boolean value of 1.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeFilterResetChangeIndication();

    /**
     * @brief Characteristic type for lock physical controls. The value of the characteristic is one of the values defined for HMCharacteristicValueLockPhysicalControlsState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLockPhysicalControls();

    /**
     * @brief Characteristic type for swing mode. The value of the characteristic is one of the values defined for HMCharacteristicValueSwingMode.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSwingMode();

    /**
     * @brief Characteristic type for target heater-cooler state. The value of the characteristic is one of the values defined for HMCharacteristicValueTargetHeaterCoolerState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetHeaterCoolerState();

    /**
     * @brief Characteristic type for target humidifier-dehumidifier state. The value of the characteristic is one of the values defined for HMCharacteristicValueTargetHumidifierDehumidifierState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetHumidifierDehumidifierState();

    /**
     * @brief Characteristic type for target fan state. The value of the characteristic is one of the values defined for HMCharacteristicValueTargetFanState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetFanState();

    /**
     * @brief Characteristic type for slat type. The value is
     *        one of the values defined for HMCharacteristicValueSlatType.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSlatType();

    /**
     * @brief Characteristic type for current tilt angle. The value is a float representing the angle in arc degrees.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentTilt();

    /**
     * @brief Characteristic type for target tilt angle. The value is a float representing the angle in arc degrees.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetTilt();

    /**
     * @brief Characteristic type for density of ozone. The value of the characteristic is
     *        in units of micrograms/m^3.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeOzoneDensity();

    /**
     * @brief Characteristic type for density of nitrogen dioxide. The value of the characteristic is
     *        in units of micrograms/m^3.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeNitrogenDioxideDensity();

    /**
     * @brief Characteristic type for density of sulphur dioxide. The value of the characteristic is
     *        in units of micrograms/m^3.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSulphurDioxideDensity();

    /**
     * @brief Characteristic type for density of air-particulate matter of size 2.5 micrograms. The
     *        value of the characteristic is in units of micrograms/m^3.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypePM2_5Density();

    /**
     * @brief Characteristic type for density of air-particulate matter of size 10 micrograms. The
     *        value of the characteristic is in units of micrograms/m^3.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypePM10Density();

    /**
     * @brief Characteristic type for density of volatile organic compounds. The value of the
     *        characteristic is in units of micrograms/m^3.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeVolatileOrganicCompoundDensity();

    /**
     * @brief Characteristic type for dehumidifier threshold. The value of the characteristic is a float value in percent.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeDehumidifierThreshold();

    /**
     * @brief Characteristic type for humidifier threshold. The value of the characteristic is a float value in percent.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeHumidifierThreshold();

    /**
     * @brief Describes that the value format is boolean.
     * 
     * @discussion The value is an NSNumber containing the boolean value.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatBool();

    /**
     * @brief Describes that the value format is an integer.
     * 
     * @discussion The value is an NSNumber containing a signed 32-bit integer with a range [-2147483648, 2147483647].
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatInt();

    /**
     * @brief Describes that the value format is a float.
     * 
     * @discussion The value is an NSNumber containing a 32-bit float.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatFloat();

    /**
     * @brief Describes that the value format is a string.
     * 
     * @discussion The value is an NSString.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatString();

    /**
     * @brief Describes that the value format is an array.
     * 
     * @discussion The value is an NSArray.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatArray();

    /**
     * @brief Describes that the value format is a dictionary.
     * 
     * @discussion The value is an NSDictionary.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatDictionary();

    /**
     * @brief Describes that the value format is an unsigned 8-bit integer.
     * 
     * @discussion The value is an NSNumber containing an unsigned 8-bit integer with a range [0, 255].
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatUInt8();

    /**
     * @brief Describes that the value format is an unsigned 16-bit integer.
     * 
     * @discussion The value is an NSNumber containing an unsigned 16-bit integer with a range [0, 65535].
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatUInt16();

    /**
     * @brief Describes that the value format is an unsigned 32-bit integer.
     * 
     * @discussion The value is an NSNumber containing an unsigned 32-bit integer with a range [0, 4294967295].
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatUInt32();

    /**
     * @brief Describes that the value format is an unsigned 64-bit integer.
     * 
     * @discussion The value is an NSNumber containing an unsigned 64-bit integer with a range [0, 18446744073709551615].
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatUInt64();

    /**
     * @brief Describes that the value format is a data blob.
     * 
     * @discussion The value is an NSData containing the bytes of data.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatData();

    /**
     * @brief Describes that the value format is a TLV8.
     * 
     * @discussion The value is an NSData containing a set of one or more TLV8's, which are packed type-length-value items with an 8-bit type, 8-bit length, and N-byte value.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatTLV8();

    /**
     * @brief Describes that the unit of the characteristic is in Celsius.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsCelsius();

    /**
     * @brief Describes that the unit of the characteristic is in Fahrenheit.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsFahrenheit();

    /**
     * @brief Describes that the unit of the characteristic is a percentage.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsPercentage();

    /**
     * @brief Describes that the unit of the characteristic is arc degree.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsArcDegree();

    /**
     * @brief Describes that the unit of the characteristic is seconds.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsSeconds();

    /**
     * @brief Describes that the unit of the characteristic is Lux (illuminance).
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsLux();

    /**
     * @brief Describes that the unit of the characteristic is parts per million.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsPartsPerMillion();

    /**
     * @brief Describes that the unit of the characteristic is micrograms per cubic meter.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsMicrogramsPerCubicMeter();

    /**
     * @brief Builtin action set type for WakeUp.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMActionSetTypeWakeUp();

    /**
     * @brief Type for builtin action set Sleep.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMActionSetTypeSleep();

    /**
     * @brief Type for builtin action set HomeDeparture.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMActionSetTypeHomeDeparture();

    /**
     * @brief Type for builtin action set HomeArrival.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMActionSetTypeHomeArrival();

    /**
     * @brief Type for user-defined action sets.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMActionSetTypeUserDefined();

    /**
     * @brief Type for trigger-owned action sets.
     * 
     * @discussion An action set of this type is owned by a trigger and is not listed
     *             as part of the home. An action set of this type cannot be executed,
     *             renamed, or associated with a different trigger.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMActionSetTypeTriggerOwned();

    /**
     * @brief Category type for Other.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeOther();

    /**
     * @brief Category type for Security System.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeSecuritySystem();

    /**
     * @brief Category type for Bridge.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeBridge();

    /**
     * @brief Category type for Door.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeDoor();

    /**
     * @brief Category type for Door Lock.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeDoorLock();

    /**
     * @brief Category type for Fan.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeFan();

    /**
     * @brief Category type for Garage Door Opener.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeGarageDoorOpener();

    /**
     * @brief Category type for IP Camera.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeIPCamera();

    /**
     * @brief Category type for Lightbulb.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeLightbulb();

    /**
     * @brief Category type for Outlet.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeOutlet();

    /**
     * @brief Category type for Programmable Switch.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeProgrammableSwitch();

    /**
     * @brief Category type for Range Extender
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeRangeExtender();

    /**
     * @brief Category type for Sensor.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeSensor();

    /**
     * @brief Category type for Switch.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeSwitch();

    /**
     * @brief Category type for Thermostat.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeThermostat();

    /**
     * @brief Category type for Video Doorbell.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeVideoDoorbell();

    /**
     * @brief Category type for Window.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeWindow();

    /**
     * @brief Category type for Window Covering.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeWindowCovering();

    /**
     * @brief Category type for Air Purifier.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeAirPurifier();

    /**
     * @brief Category type for Air Heater.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeAirHeater();

    /**
     * @brief Category type for Air Conditioner.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeAirConditioner();

    /**
     * @brief Category type for Air Humidifier.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeAirHumidifier();

    /**
     * @brief Category type for Air Dehumidifier.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeAirDehumidifier();

    /**
     * @brief Specifies the key path for a characteristic in a NSPredicate
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicKeyPath();

    /**
     * @brief Specifies the key path for a characteristic value in a NSPredicate
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
     * @brief Event corresponding to sunrise
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMSignificantEventSunrise();

    /**
     * @brief Event corresponding to sunset
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMSignificantEventSunset();

    /**
     * @brief Service type for label namespace when accessory supports multiple services of the same type.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeLabel();

    /**
     * @brief Characteristic type for label namespace used to label the services on an accessory with
     *        multiple services of the same type. The value of the characteristic is one of the values
     *        defined for HMCharacteristicValueLabelNamespace.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLabelNamespace();

    /**
     * @brief Characteristic type describing the index of the label for the service on accessory with multiple
     *        instances of the same service. The value is an integer and starts from 1.
     *        For a label namespace of HMCharacteristicValueLabelNamespaceDot, label index indicates the
     *        number of dots - ., .., ..., and so on.
     *        For a label namespace of HMCharacteristicValueLabelNamespaceNumeral, label index indicates the arabic
     *        numeral - 1, 2, 3, and so on.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLabelIndex();

    /**
     * @brief Characteristic type for color temperature. The value of the characteristic is an int.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeColorTemperature();

    /**
     * @brief Specifies the key path for a presence event in a NSPredicate
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMPresenceKeyPath();

    /**
     * @brief Service type for irrigation system.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeIrrigationSystem();

    /**
     * @brief Service type for valve.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeValve();

    /**
     * @brief Service type for faucet.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeFaucet();

    /**
     * @brief Characteristic type for program mode. The value of the characteristic is one of the values defined
     *        for HMCharacteristicValueProgramMode.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeProgramMode();

    /**
     * @brief Characteristic type for in use. The value of the characteristic is one of the values
     *        defined for HMCharacteristicValueUsageState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeInUse();

    /**
     * @brief Characteristic type for set duration. The value of the characteristic is an int value in
     *        seconds.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSetDuration();

    /**
     * @brief Characteristic type for remaining duration. The value of the characteristic is an int value in
     *        seconds.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeRemainingDuration();

    /**
     * @brief Characteristic type for valve type. The value of the characteristic is one of the values
     *        defined for HMCharacteristicValueValveType.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeValveType();

    /**
     * @brief Characteristic type for is configured. The value of the characteristic is one of the values defined for HMCharacteristicValueConfigurationState.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeIsConfigured();

    /**
     * @brief Category type for Sprinkler.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeSprinkler();

    /**
     * @brief Category type for Faucet.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeFaucet();

    /**
     * @brief Category type for Shower Head.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeShowerHead();
}
