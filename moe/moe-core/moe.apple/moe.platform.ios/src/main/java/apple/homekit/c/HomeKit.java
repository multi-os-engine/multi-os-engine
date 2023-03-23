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
     * 
     * The value associated with this key is an NSArray of NSDictionary objects. Each dictionary
     * contains the UUID of the accessory that failed to the added/removed and the value
     * corresponding to the dictionary key is an NSError that provides more details on the
     * underlying error for that accessory.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMUserFailedAccessoriesKey();

    /**
     * Service type for lightbulb.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeLightbulb();

    /**
     * Service type for switch.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeSwitch();

    /**
     * Service type for thermostat.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeThermostat();

    /**
     * Service type for garage door opener.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeGarageDoorOpener();

    /**
     * Service type for accessory information.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeAccessoryInformation();

    /**
     * Service type for fan.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeFan();

    /**
     * Service type for outlet.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeOutlet();

    /**
     * Service type for lock mechanism.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeLockMechanism();

    /**
     * Service type for lock management.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeLockManagement();

    /**
     * Service type for air quality sensor.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeAirQualitySensor();

    /**
     * Service type for battery.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeBattery();

    /**
     * Service type for carbon dioxide sensor.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeCarbonDioxideSensor();

    /**
     * Service type for carbon monoxide sensor.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeCarbonMonoxideSensor();

    /**
     * Service type for contact sensor.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeContactSensor();

    /**
     * Service type for door.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeDoor();

    /**
     * Service type for doorbell.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeDoorbell();

    /**
     * Service type for humidity sensor.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeHumiditySensor();

    /**
     * Service type for leak sensor.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeLeakSensor();

    /**
     * Service type for light sensor.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeLightSensor();

    /**
     * Service type for motion sensor.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeMotionSensor();

    /**
     * Service type for occupancy sensor.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeOccupancySensor();

    /**
     * Service type for security system.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeSecuritySystem();

    /**
     * Service type for stateful programmable switch.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeStatefulProgrammableSwitch();

    /**
     * Service type for stateless programmable switch.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeStatelessProgrammableSwitch();

    /**
     * Service type for smoke sensor.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeSmokeSensor();

    /**
     * Service type for temperature sensor.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeTemperatureSensor();

    /**
     * Service type for window.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeWindow();

    /**
     * Service type for window covering.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeWindowCovering();

    /**
     * Service type for stream management.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeCameraRTPStreamManagement();

    /**
     * Service type for camera control.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeCameraControl();

    /**
     * Service type for microphone.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeMicrophone();

    /**
     * Service type for speaker.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeSpeaker();

    /**
     * Service type for air purifier.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeAirPurifier();

    /**
     * Service type for ventilation fan.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeVentilationFan();

    /**
     * Service type for filter maintenance.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeFilterMaintenance();

    /**
     * Service type for heater/cooler.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeHeaterCooler();

    /**
     * Service type for humidifier-dehumidifier.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeHumidifierDehumidifier();

    /**
     * Service type for slats.
     * 
     * API-Since: 10.2
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
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicPropertySupportsEventNotification();

    /**
     * This constant specifies that the characteristic is readable.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicPropertyReadable();

    /**
     * This constant specifies that the characteristic is writable.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicPropertyWritable();

    /**
     * This constant specifies that the characteristic should be hidden from the user.
     * 
     * API-Since: 9.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicPropertyHidden();

    /**
     * Characteristic type for power state. The value of the characteristic is a boolean.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypePowerState();

    /**
     * Characteristic type for hue. The value of the characteristic is a float value in arc degrees.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeHue();

    /**
     * Characteristic type for saturation. The value of the characteristic is a float value in percent.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSaturation();

    /**
     * Characteristic type for brightness. The value of the characteristic is an int value in percent.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeBrightness();

    /**
     * Characteristic type for temperature units. The value of the characteristic is one of the values defined for
     * HMCharacteristicValueTemperatureUnit.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTemperatureUnits();

    /**
     * Characteristic type for current temperature. The value of the characteristic is a float value in Celsius.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentTemperature();

    /**
     * Characteristic type for target temperature. The value of the characteristic is a float value in Celsius.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetTemperature();

    /**
     * Characteristic type for current heating/cooling. The value of the characteristic is one of the values defined for
     * HMCharacteristicValueCurrentHeatingCooling.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentHeatingCooling();

    /**
     * Characteristic type for target heating/cooling. The value of the characteristic is one of the values defined for
     * HMCharacteristicValueHeatingCooling.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetHeatingCooling();

    /**
     * Characteristic type for cooling threshold. The value of the characteristic is a float value in Celsius.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCoolingThreshold();

    /**
     * Characteristic type for heating threshold. The value of the characteristic is a float value in Celsius.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeHeatingThreshold();

    /**
     * Characteristic type for current relative humidity. The value of the characteristic is a float value in percent.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentRelativeHumidity();

    /**
     * Characteristic type for target relative humidity. The value of the characteristic is a float value in percent.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetRelativeHumidity();

    /**
     * Characteristic type for current door state. The value of the characteristic is one of the values defined for
     * HMCharacteristicValueDoorState.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentDoorState();

    /**
     * Characteristic type for target door state. The value of the characteristic is one of the values defined for
     * HMCharacteristicValueTargetDoorState.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetDoorState();

    /**
     * Characteristic type for obstruction detected. The value of the characteristic is a boolean.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeObstructionDetected();

    /**
     * Characteristic type for name. The value of the characteristic is a string.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeName();

    /**
     * Characteristic type for manufacturer. The value of the characteristic is a string.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeManufacturer();

    /**
     * Characteristic type for model. The value of the characteristic is a string.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeModel();

    /**
     * Characteristic type for serial number. The value of the characteristic is a string.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: No longer supported
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSerialNumber();

    /**
     * Characteristic type for identify. The value of the characteristic is a boolean.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeIdentify();

    /**
     * Characteristic type for rotation direction. The value of the characteristic is one of the values defined for
     * HMCharacteristicValueRotationDirection.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeRotationDirection();

    /**
     * Characteristic type for rotation speed. The value of the characteristic is a float.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeRotationSpeed();

    /**
     * Characteristic type for outlet in use. The value of the characteristic is a boolean, which is true
     * if the outlet is in use.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeOutletInUse();

    /**
     * Characteristic type for version. The value of the characteristic is a string.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeVersion();

    /**
     * Characteristic type for logs. The value of the characteristic is TLV8 data wrapped in an NSData.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLogs();

    /**
     * Characteristic type for audio feedback. The value of the characteristic is a boolean.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeAudioFeedback();

    /**
     * Characteristic type for admin only access. The value of the characteristic is a boolean.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeAdminOnlyAccess();

    /**
     * Characteristic type for Security System Alarm Type. The value of the characteristic is a uint8.
     * indicating the type of alarm triggered by a security system service. This characteristic has a value
     * of 1 when the alarm type is not known and a value of 0 indicates that the alarm conditions are cleared.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSecuritySystemAlarmType();

    /**
     * Characteristic type for motion detected. The value of the characteristic is a boolean.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeMotionDetected();

    /**
     * Characteristic type for current lock mechanism state. The value of the characteristic is one of the values
     * defined for HMCharacteristicValueLockMechanismState.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentLockMechanismState();

    /**
     * Characteristic type for target lock mechanism state. The value of the characteristic is one of the values defined
     * for HMCharacteristicValueTargetLockMechanismState.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetLockMechanismState();

    /**
     * Characteristic type for the last known action for a lock mechanism. The value of the characteristic is one of the
     * values
     * defined for HMCharacteristicValueLockMechanismLastKnownAction.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLockMechanismLastKnownAction();

    /**
     * Characteristic type for the control point for lock management. The characteristic is write-only that takes TLV8
     * data wrapped in an NSData.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLockManagementControlPoint();

    /**
     * * @brief Characteristic type for the auto secure timeout for lock management. The value of the characteristic is
     * an unsigned
     * 32-bit integer representing the number of seconds.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLockManagementAutoSecureTimeout();

    /**
     * Characteristic type for density of air-particulate matter. The value of the characteristic is
     * in units of micrograms/m^3.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeAirParticulateDensity();

    /**
     * Characteristic type for size of air-particulate matter. The value of the characteristic is
     * one of the values defined for HMCharacteristicValueAirParticulateSize.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeAirParticulateSize();

    /**
     * Characteristic type for air quality. The value of the characteristic is
     * one of the values defined for HMCharacteristicValueAirQuality.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeAirQuality();

    /**
     * Characteristic type for battery level. The value of the characteristic is a uint8 value in percent.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeBatteryLevel();

    /**
     * Characteristic type for carbon dioxide detected. The value of the characteristic is a uint8 value.
     * A value of 0 indicates carbon dioxide levels are normal.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCarbonDioxideDetected();

    /**
     * Characteristic type for carbon dioxide level.
     * The value of the characteristic is a float value in units of ppm.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCarbonDioxideLevel();

    /**
     * Characteristic type for carbon dioxide peak level.
     * The value of the characteristic is a float value in units of ppm.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCarbonDioxidePeakLevel();

    /**
     * Characteristic type for carbon monoxide detected. The value of the characteristic is a uint8 value.
     * A value of 0 indicates carbon monoxide levels are normal.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCarbonMonoxideDetected();

    /**
     * Characteristic type for carbon monoxide level.
     * The value of the characteristic is a float value in units of ppm.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCarbonMonoxideLevel();

    /**
     * Characteristic type for carbon monoxide peak level.
     * The value of the characteristic is a float value in units of ppm.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCarbonMonoxidePeakLevel();

    /**
     * Characteristic type for charging state. The value of the characteristic is one of the values defined for
     * HMCharacteristicValueChargingState.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeChargingState();

    /**
     * Characteristic type for Contact sensor state. The value of the characteristic is a uint8 value.
     * A value of 0 indicates that contact is detected; a value of 1 indicates no contact is detected.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeContactState();

    /**
     * Characteristic type for current horizontal tilt angle. The value is a float representing the angle in arc
     * degrees.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentHorizontalTilt();

    /**
     * Characteristic type for current light level. The value of the characteristic is a float value in lux.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentLightLevel();

    /**
     * Characteristic type for current position of a door/window. The value of the characteristic is an
     * uint8 value in percent. A value of 0 indicates closed/most shade/least light allowed state and a
     * value of 100 indicates open/no shade/most light allowed state.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentPosition();

    /**
     * Characteristic type for current security system state. The value of the characteristic is one of
     * the values defined for HMCharacteristicValueCurrentSecuritySystemState.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentSecuritySystemState();

    /**
     * Characteristic type for current vertical tilt angle. The value is a float representing the angle in arc degrees.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentVerticalTilt();

    /**
     * Characteristic type for firmware version. The value of the characteristic is a string.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeFirmwareVersion();

    /**
     * Characteristic type for hardware version. The value of the characteristic is a string.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeHardwareVersion();

    /**
     * Characteristic type for Hold Position. The value of the characteristic is a boolean
     * indicating that the current position should be held/maintained.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeHoldPosition();

    /**
     * Characteristic type for input event. The value of the characteristic is one of the values defined for
     * HMCharacteristicValueInputEvent.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeInputEvent();

    /**
     * Characteristic type for leak detected. The value of the characteristic is a uint8 value.
     * A value of 0 indicates no leak is detected; a value of 1 indicates that a leak is detected.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLeakDetected();

    /**
     * Characteristic type for Occupancy Detected. The value of the characteristic is a uint8 value.
     * A value of 0 indicates no occupancy is detected; a value of 1 indicates that occupancy is detected.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeOccupancyDetected();

    /**
     * Characteristic type for programmable switch output state. This value is to be used for presentation
     * purposes. For a binary programmable switch, a value of 1 can be used to present a state of ON.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeOutputState();

    /**
     * Characteristic type for Position state. The value of the characteristic is one of the
     * one of the values defined for HMCharacteristicValuePositionState.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypePositionState();

    /**
     * Characteristic type for smoke detected. The value of the characteristic is one of the values defined for
     * HMCharacteristicValueSmokeDetectionStatus.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSmokeDetected();

    /**
     * Characteristic type for software version. The value of the characteristic is a string.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSoftwareVersion();

    /**
     * Characteristic type to indicate status of a service is active. The value of the characteristic is a boolean.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeStatusActive();

    /**
     * Characteristic type to indicate status of a service is fault. The value of the characteristic is a uint8 value.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeStatusFault();

    /**
     * Characteristic type to indicate status of a service is jammed. The value of the characteristic is a uint8 value.
     * A value of 0 indicates that the service is not jammed; a value of 1 indicates that the service is jammed.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeStatusJammed();

    /**
     * Characteristic type for status low battery. The value of the characteristic is one of the values defined for
     * HMCharacteristicValueBatteryStatus.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeStatusLowBattery();

    /**
     * Characteristic type to indicate status of a service is tampered. The value of the characteristic is a uint8
     * value.
     * A value of 0 indicates no tampering has been detected; a value of 1 indicates that a tampering has been detected.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeStatusTampered();

    /**
     * Characteristic type for target horizontal tilt angle. The value is a float representing the angle in arc degrees.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetHorizontalTilt();

    /**
     * Characteristic type for target security system state. The value of the characteristic is one of
     * the values defined for HMCharacteristicValueTargetSecuritySystemState.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetSecuritySystemState();

    /**
     * Characteristic type for target position of a door/window/window covering. The value of the
     * characteristic is an uint8 value in percent. A value of 0 indicates closed/most shade/least
     * light allowed state and a value of 100 indicates open/no shade/most light allowed state.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetPosition();

    /**
     * Characteristic type for target vertical tilt angle. The value is a float representing the angle in arc degrees.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetVerticalTilt();

    /**
     * Characteristic type for streaming status. The value is a tlv8 data.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeStreamingStatus();

    /**
     * Characteristic type for setup stream endpoint. The value is a tlv8 data.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSetupStreamEndpoint();

    /**
     * Characteristic type for supported video stream configuration. The value is a tlv8 data.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSupportedVideoStreamConfiguration();

    /**
     * Characteristic type for supported audio stream configuration. The value of the characteristic is TLV8 encoded
     * data.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSupportedAudioStreamConfiguration();

    /**
     * Characteristic type for supported RTP stream configuration. The value is a tlv8 data.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSupportedRTPConfiguration();

    /**
     * Characteristic type for selected stream configuration. The value is a tlv8 data.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSelectedStreamConfiguration();

    /**
     * Characteristic type for volume. The value of the characteristic is a uint8 value in percent.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeVolume();

    /**
     * Characteristic type for mute. The value of the characteristic is a boolean.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeMute();

    /**
     * Characteristic type for night vision. The value of the characteristic is a boolean.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeNightVision();

    /**
     * Characteristic type for camera optical zoom. The value is float.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeOpticalZoom();

    /**
     * Characteristic type for camera digital zoom. The value is float.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeDigitalZoom();

    /**
     * Characteristic type for camera image rotation. The value is float with valid values: 0, 90, 180 and 270
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeImageRotation();

    /**
     * Characteristic type for image mirroring. The value is boolean.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeImageMirroring();

    /**
     * Characteristic type for active. The value of the characteristic is one of the values defined for
     * HMCharacteristicValueActivationState.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeActive();

    /**
     * Characteristic type for air purifier current state. The value is
     * one of the value defined for HMCharacteristicValueCurrentAirPurifierState.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentAirPurifierState();

    /**
     * Characteristic type for air purifier target state. The value is
     * one of the value defined for HMCharacteristicValueTargetAirPurifierState.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetAirPurifierState();

    /**
     * Characteristic type for current fan state. The value of the characteristic is one of the values defined for
     * HMCharacteristicValueCurrentFanState.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentFanState();

    /**
     * Characteristic type for current heater-cooler state. The value of the characteristic is one of the values defined
     * for HMCharacteristicValueCurrentHeaterCoolerState.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentHeaterCoolerState();

    /**
     * Characteristic type for current humidifier-dehumidifier state. The value of the characteristic is one of the
     * values defined for HMCharacteristicValueCurrentHumidifierDehumidifierState.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentHumidifierDehumidifierState();

    /**
     * Characteristic type for current slat state. The value is
     * one of the values defined for HMCharacteristicValueCurrentSlatState.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentSlatState();

    /**
     * Characteristic type for water level. The value of the characteristic is a float value in percent.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeWaterLevel();

    /**
     * Characteristic type for filter change indication. The value is
     * one of the values defined for HMCharacteristicValueFilterChange.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeFilterChangeIndication();

    /**
     * Characteristic type for filter life level. The value is in percentage units.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeFilterLifeLevel();

    /**
     * Characteristic type for resetting filter change indication. The characteristic
     * is write-only that takes a boolean value of 1.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeFilterResetChangeIndication();

    /**
     * Characteristic type for lock physical controls. The value of the characteristic is one of the values defined for
     * HMCharacteristicValueLockPhysicalControlsState.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLockPhysicalControls();

    /**
     * Characteristic type for swing mode. The value of the characteristic is one of the values defined for
     * HMCharacteristicValueSwingMode.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSwingMode();

    /**
     * Characteristic type for target heater-cooler state. The value of the characteristic is one of the values defined
     * for HMCharacteristicValueTargetHeaterCoolerState.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetHeaterCoolerState();

    /**
     * Characteristic type for target humidifier-dehumidifier state. The value of the characteristic is one of the
     * values defined for HMCharacteristicValueTargetHumidifierDehumidifierState.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetHumidifierDehumidifierState();

    /**
     * Characteristic type for target fan state. The value of the characteristic is one of the values defined for
     * HMCharacteristicValueTargetFanState.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetFanState();

    /**
     * Characteristic type for slat type. The value is
     * one of the values defined for HMCharacteristicValueSlatType.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSlatType();

    /**
     * Characteristic type for current tilt angle. The value is a float representing the angle in arc degrees.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeCurrentTilt();

    /**
     * Characteristic type for target tilt angle. The value is a float representing the angle in arc degrees.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeTargetTilt();

    /**
     * Characteristic type for density of ozone. The value of the characteristic is
     * in units of micrograms/m^3.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeOzoneDensity();

    /**
     * Characteristic type for density of nitrogen dioxide. The value of the characteristic is
     * in units of micrograms/m^3.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeNitrogenDioxideDensity();

    /**
     * Characteristic type for density of sulphur dioxide. The value of the characteristic is
     * in units of micrograms/m^3.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSulphurDioxideDensity();

    /**
     * Characteristic type for density of air-particulate matter of size 2.5 micrograms. The
     * value of the characteristic is in units of micrograms/m^3.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypePM2_5Density();

    /**
     * Characteristic type for density of air-particulate matter of size 10 micrograms. The
     * value of the characteristic is in units of micrograms/m^3.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypePM10Density();

    /**
     * Characteristic type for density of volatile organic compounds. The value of the
     * characteristic is in units of micrograms/m^3.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeVolatileOrganicCompoundDensity();

    /**
     * Characteristic type for dehumidifier threshold. The value of the characteristic is a float value in percent.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeDehumidifierThreshold();

    /**
     * Characteristic type for humidifier threshold. The value of the characteristic is a float value in percent.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeHumidifierThreshold();

    /**
     * Describes that the value format is boolean.
     * 
     * The value is an NSNumber containing the boolean value.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatBool();

    /**
     * Describes that the value format is an integer.
     * 
     * The value is an NSNumber containing a signed 32-bit integer with a range [-2147483648, 2147483647].
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatInt();

    /**
     * Describes that the value format is a float.
     * 
     * The value is an NSNumber containing a 32-bit float.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatFloat();

    /**
     * Describes that the value format is a string.
     * 
     * The value is an NSString.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatString();

    /**
     * Describes that the value format is an array.
     * 
     * The value is an NSArray.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatArray();

    /**
     * Describes that the value format is a dictionary.
     * 
     * The value is an NSDictionary.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatDictionary();

    /**
     * Describes that the value format is an unsigned 8-bit integer.
     * 
     * The value is an NSNumber containing an unsigned 8-bit integer with a range [0, 255].
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatUInt8();

    /**
     * Describes that the value format is an unsigned 16-bit integer.
     * 
     * The value is an NSNumber containing an unsigned 16-bit integer with a range [0, 65535].
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatUInt16();

    /**
     * Describes that the value format is an unsigned 32-bit integer.
     * 
     * The value is an NSNumber containing an unsigned 32-bit integer with a range [0, 4294967295].
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatUInt32();

    /**
     * Describes that the value format is an unsigned 64-bit integer.
     * 
     * The value is an NSNumber containing an unsigned 64-bit integer with a range [0, 18446744073709551615].
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatUInt64();

    /**
     * Describes that the value format is a data blob.
     * 
     * The value is an NSData containing the bytes of data.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatData();

    /**
     * Describes that the value format is a TLV8.
     * 
     * The value is an NSData containing a set of one or more TLV8's, which are packed type-length-value items with an
     * 8-bit type, 8-bit length, and N-byte value.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataFormatTLV8();

    /**
     * Describes that the unit of the characteristic is in Celsius.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsCelsius();

    /**
     * Describes that the unit of the characteristic is in Fahrenheit.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsFahrenheit();

    /**
     * Describes that the unit of the characteristic is a percentage.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsPercentage();

    /**
     * Describes that the unit of the characteristic is arc degree.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsArcDegree();

    /**
     * Describes that the unit of the characteristic is seconds.
     * 
     * API-Since: 8.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsSeconds();

    /**
     * Describes that the unit of the characteristic is Lux (illuminance).
     * 
     * API-Since: 9.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsLux();

    /**
     * Describes that the unit of the characteristic is parts per million.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsPartsPerMillion();

    /**
     * Describes that the unit of the characteristic is micrograms per cubic meter.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicMetadataUnitsMicrogramsPerCubicMeter();

    /**
     * Builtin action set type for WakeUp.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMActionSetTypeWakeUp();

    /**
     * Type for builtin action set Sleep.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMActionSetTypeSleep();

    /**
     * Type for builtin action set HomeDeparture.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMActionSetTypeHomeDeparture();

    /**
     * Type for builtin action set HomeArrival.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMActionSetTypeHomeArrival();

    /**
     * Type for user-defined action sets.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMActionSetTypeUserDefined();

    /**
     * Type for trigger-owned action sets.
     * 
     * An action set of this type is owned by a trigger and is not listed
     * as part of the home. An action set of this type cannot be executed,
     * renamed, or associated with a different trigger.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMActionSetTypeTriggerOwned();

    /**
     * Category type for Other.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeOther();

    /**
     * Category type for Security System.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeSecuritySystem();

    /**
     * Category type for Bridge.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeBridge();

    /**
     * Category type for Door.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeDoor();

    /**
     * Category type for Door Lock.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeDoorLock();

    /**
     * Category type for Fan.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeFan();

    /**
     * Category type for Garage Door Opener.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeGarageDoorOpener();

    /**
     * Category type for IP Camera.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeIPCamera();

    /**
     * Category type for Lightbulb.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeLightbulb();

    /**
     * Category type for Outlet.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeOutlet();

    /**
     * Category type for Programmable Switch.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeProgrammableSwitch();

    /**
     * Category type for Range Extender
     * 
     * API-Since: 9.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeRangeExtender();

    /**
     * Category type for Sensor.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeSensor();

    /**
     * Category type for Switch.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeSwitch();

    /**
     * Category type for Thermostat.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeThermostat();

    /**
     * Category type for Video Doorbell.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeVideoDoorbell();

    /**
     * Category type for Window.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeWindow();

    /**
     * Category type for Window Covering.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeWindowCovering();

    /**
     * Category type for Air Purifier.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeAirPurifier();

    /**
     * Category type for Air Heater.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeAirHeater();

    /**
     * Category type for Air Conditioner.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeAirConditioner();

    /**
     * Category type for Air Humidifier.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeAirHumidifier();

    /**
     * Category type for Air Dehumidifier.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeAirDehumidifier();

    /**
     * Specifies the key path for a characteristic in a NSPredicate
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicKeyPath();

    /**
     * Specifies the key path for a characteristic value in a NSPredicate
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicValueKeyPath();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMErrorDomain();

    /**
     * Event corresponding to sunrise
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMSignificantEventSunrise();

    /**
     * Event corresponding to sunset
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMSignificantEventSunset();

    /**
     * Service type for label namespace when accessory supports multiple services of the same type.
     * 
     * API-Since: 10.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeLabel();

    /**
     * Characteristic type for label namespace used to label the services on an accessory with
     * multiple services of the same type. The value of the characteristic is one of the values
     * defined for HMCharacteristicValueLabelNamespace.
     * 
     * API-Since: 10.3
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
     * 
     * API-Since: 10.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeLabelIndex();

    /**
     * Characteristic type for color temperature. The value of the characteristic is an int.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeColorTemperature();

    /**
     * Specifies the key path for a presence event in a NSPredicate
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMPresenceKeyPath();

    /**
     * Service type for irrigation system.
     * 
     * API-Since: 11.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeIrrigationSystem();

    /**
     * Service type for valve.
     * 
     * API-Since: 11.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeValve();

    /**
     * Service type for faucet.
     * 
     * API-Since: 11.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMServiceTypeFaucet();

    /**
     * Characteristic type for program mode. The value of the characteristic is one of the values defined
     * for HMCharacteristicValueProgramMode.
     * 
     * API-Since: 11.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeProgramMode();

    /**
     * Characteristic type for in use. The value of the characteristic is one of the values
     * defined for HMCharacteristicValueUsageState.
     * 
     * API-Since: 11.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeInUse();

    /**
     * Characteristic type for set duration. The value of the characteristic is an int value in
     * seconds.
     * 
     * API-Since: 11.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeSetDuration();

    /**
     * Characteristic type for remaining duration. The value of the characteristic is an int value in
     * seconds.
     * 
     * API-Since: 11.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeRemainingDuration();

    /**
     * Characteristic type for valve type. The value of the characteristic is one of the values
     * defined for HMCharacteristicValueValveType.
     * 
     * API-Since: 11.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeValveType();

    /**
     * Characteristic type for is configured. The value of the characteristic is one of the values defined for
     * HMCharacteristicValueConfigurationState.
     * 
     * API-Since: 11.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMCharacteristicTypeIsConfigured();

    /**
     * Category type for Sprinkler.
     * 
     * API-Since: 11.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeSprinkler();

    /**
     * Category type for Faucet.
     * 
     * API-Since: 11.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeFaucet();

    /**
     * Category type for Shower Head.
     * 
     * API-Since: 11.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String HMAccessoryCategoryTypeShowerHead();
}
