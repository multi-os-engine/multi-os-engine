package apple.sensorkit.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("SensorKit")
@Runtime(CRuntime.class)
public final class SensorKit {
    static {
        NatJ.register();
    }

    @Generated
    private SensorKit() {
    }

    /**
     * Get the current SRAbsoluteTime for this device.
     * 
     * This timestamp ticks across sleeps and reboots.
     * 
     * API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native double SRAbsoluteTimeGetCurrent();

    /**
     * Convert a mach_continuous_time to an SRAbsoluteTime.
     * 
     * Because mach_continuous_time is volatile and hardware specific, the
     * mach_continuous_time must originate from the same device and boot session
     * that SRAbsoluteTimeFromContinuousTime() is called from.
     * The return value for mach_continuous_times spanning boot sessions or devices
     * is undefined.
     * 
     * API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native double SRAbsoluteTimeFromContinuousTime(long cont);

    /**
     * Convert a SRAbsoluteTime to a CFAbsoluteTime.
     * 
     * The CFAbsoluteTime returned is based on calculations relative to the current
     * wall clock. This means that if the system time is 5 seconds fast against UTC,
     * the result will be 5 seconds fast to when the event happened relative to UTC.
     * 
     * API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native double SRAbsoluteTimeToCFAbsoluteTime(double sr);

    /**
     * Convert a CFAbsoluteTime to an SRAbsoluteTime.
     * 
     * The SRAbsoluteTime returned is based on calculations relative to the current
     * wall clock. This means that if the system time is 5 seconds fast against UTC,
     * the result will be 5 seconds fast to when the event happened relative to UTC.
     * 
     * API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native double SRAbsoluteTimeFromCFAbsoluteTime(double cf);

    /**
     * [@const] SRSensorAmbientLightSensor
     * 
     * Sensor stream for Environmental Brightness and Color.
     * 
     * This data stream stores ambient light sensor data from devices when the screen is on.
     * Fetches from this stream return objects of type SRAmbientLightSample.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRSensorAmbientLightSensor();

    /**
     * [@const] SRSensorAccelerometer
     * 
     * Accelerometer sensor stream for Motion.
     * 
     * This data stream stores acceleration measured by the device's accelerometer.
     * Fetches from this stream return objects of type NSArray<CMRecordedAccelerometerData *> * as defined in the
     * CoreMotion framework.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRSensorAccelerometer();

    /**
     * [@const] SRSensorRotationRate
     * 
     * Rotation rate sensor stream for Motion.
     * 
     * This data stream stores rotation rate measured by the device's gyroscope.
     * Fetches from this stream return objects of type NSArray<CMRecordedRotationRateData *> * as defined in the
     * CoreMotion framework.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRSensorRotationRate();

    /**
     * [@const] SRSensorVisits
     * 
     * Sensor stream for Frequently Visited Locations.
     * 
     * This data stream stores visit information from frequently visited locations including:
     * 
     * @textblock
     *            - arrival and departure times
     *            - distance from your home
     *            - an anonymous location identifier but no specific location information
     * @/textblock
     * 
     *             Fetches from this stream return objects of type SRVisit.
     * 
     *             API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRSensorVisits();

    /**
     * [@const] SRSensorPedometerData
     * 
     * Sensor stream for Pedometer.
     * 
     * This stream stores information about your step count.
     * Fetches from this stream return objects of type CMPedometerData as defined in the CoreMotion framework.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRSensorPedometerData();

    /**
     * [@const] SRSensorDeviceUsageReport
     * 
     * Sensor stream for Device Usage.
     * 
     * This stream stores information about device usage including:
     * 
     * @textblock
     *            - Types of apps used
     *            - Types of notifications received
     *            - Types of websites visited
     *            - Number of device unlocks and unlock duration
     *            - Number of times the screen is on and the duration
     * @/textblock
     * 
     *             Fetches from this stream return objects of type SRDeviceUsageReport.
     * 
     *             API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRSensorDeviceUsageReport();

    /**
     * [@const] SRSensorMessagesUsageReport
     * 
     * Sensor stream for Messages Usage.
     * 
     * This streams stores information about messages usage including:
     * 
     * @textblock
     *            - The number of incoming and outgoing messages
     *            - The number of individuals contacted but none of their personal information
     * @/textblock
     * 
     *             Fetches from this stream return objects of type SRMessagesUsageReport.
     * 
     *             API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRSensorMessagesUsageReport();

    /**
     * [@const] SRSensorPhoneUsageReport
     * 
     * Sensor stream for Phone Usage
     * 
     * This streams stores information about phone usage including:
     * 
     * @textblock
     *            - The number of incoming and outgoing calls
     *            - The number of individuals contacted but none of their personal information
     * @/textblock
     * 
     *             Fetches from this stream return objects of type SRPhoneUsageReport.
     * 
     *             API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRSensorPhoneUsageReport();

    /**
     * [@const] SRSensorOnWristState
     * 
     * Sensor stream for Watch on Wrist
     * 
     * This streams stores information about Apple Watch wear including:
     * 
     * @textblock
     *            - When the watch is worn
     *            - Digital crown and orientation settings
     * @/textblock
     * 
     *             Fetches from this stream return objects of type SRWristDetection.
     * 
     *             API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRSensorOnWristState();

    /**
     * [@const] SRSensorKeyboardMetrics
     * 
     * Sensor stream for Keyboard Usage
     * 
     * This stream stores information about keyboard usage from all apps where a keyboard is used including:
     * 
     * @textblock
     *            - Metrics about typing speed and accuracy
     *            - Metrics about the length of typed or swiped words
     *            - Metrics about the typing errors made
     *            - The number of words and emojis that convey emotion
     * @/textblock
     * 
     *             Fetches from this stream return objects of type SRKeyboardMetrics.
     * 
     *             API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRSensorKeyboardMetrics();

    /**
     * [@const] SRSensorSiriSpeechMetrics
     * 
     * Siri sensor stream for Speech Metrics
     * 
     * This stream stores information data about your voice during Siri sessions including:
     * 
     * @textblock
     *            - Tenor, pitch, and cadence
     *            - Metrics such as average words per minute and average pause length
     * @/textblock
     *             This steam does not store any raw audio nor any audio or data from other parties.
     * 
     *             Fetches from this stream return objects of type \c SRSpeechMetrics
     * 
     *             API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRSensorSiriSpeechMetrics();

    /**
     * [@const] SRSensorTelephonySpeechMetrics
     * 
     * Telephony sensor stream for Speech Metrics
     * 
     * This stream stores information data about your voice during phone calls including:
     * 
     * @textblock
     *            - Tenor, pitch, and cadence
     *            - Metrics such as average words per minute and average pause length
     * @/textblock
     * 
     *             This steam does not store any raw audio nor any audio or data from other parties.
     * 
     *             Fetches from this stream return objects of type \c SRSpeechMetrics
     * 
     *             API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRSensorTelephonySpeechMetrics();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRErrorDomain();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryGames();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryBusiness();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryWeather();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryUtilities();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryTravel();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategorySports();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategorySocialNetworking();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryReference();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryProductivity();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryPhotoAndVideo();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryNews();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryNavigation();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryMusic();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryLifestyle();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryHealthAndFitness();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryFinance();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryEntertainment();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryEducation();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryBooks();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryMedical();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryNewsstand();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryCatalogs();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryKids();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryMiscellaneous();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryFoodAndDrink();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryDeveloperTools();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryGraphicsAndDesign();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryShopping();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryStickers();

    /**
     * [@const] SRSensorAmbientPressure
     * 
     * Ambient pressure sensor stream
     * 
     * This stream stores simple pressure and temperature measurements including:
     * 
     * @textblock
     *            - Pressure and temperature
     *            - Date when metric was collected
     * @/textblock
     * 
     *             Fetches from this stream return objects of type NSArray<CMRecordedPressureData *> * as defined in the
     *             CoreMotion framework.
     * 
     *             API-Since: 15.4
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRSensorAmbientPressure();

    /**
     * [@const] SRSensorMediaEvents
     * 
     * Media events sensor stream
     * 
     * This stream stores data about user interaction with photo and video content in messaging apps including:
     * 
     * @textblock
     *            - Event type
     *            - Media identifier
     * @/textblock
     *             Fetches from this stream return objects of type SRMediaEvent.
     * 
     *             API-Since: 16.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String SRSensorMediaEvents();

    /**
     * [@const] SRSensorWristTemperature
     * 
     * Sensor stream for Apple Watch temperatures on wrist while sleeping
     * 
     * This stream stores Apple Watch on wrist temperature measurements including:
     * 
     * @textblock
     *            - StartTime
     *            - Duration of collected temperature measurements
     *            - version of algorithm
     *            - Temperature samples
     * @/textblock
     * 
     *             Fetches from this stream return objects of type SRWristTemperatureSession.
     * 
     *             API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String SRSensorWristTemperature();

    /**
     * [@const] SRSensorHeartRate
     * 
     * Estimated heart rate
     * 
     * Fetches from this stream return objects of type \c CMHighFrequencyHeartRateData
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String SRSensorHeartRate();

    /**
     * [@const] SRSensorFaceMetrics
     * 
     * Sensor stream for face metrics collection
     * 
     * This stream stores face metrics including:
     * 
     * @textblock
     *            - algorithm version
     *            - face description and face expressions
     *            - data collection session identifier
     * @/textblock
     * 
     *             Fetches from this stream return objects of type SRFaceMetrics.
     * 
     *             API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String SRSensorFaceMetrics();

    /**
     * [@const] SRSensorOdometer
     * 
     * Odometer sensor stream
     * 
     * This stream stores measurements of your distance and speed
     * Fetches from this stream return objects of type \c CMOdometerData as defined in the CoreMotion framework.
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String SRSensorOdometer();

    @Generated public static final double SR_ARKIT_SUPPORTED = 1.0;
}
