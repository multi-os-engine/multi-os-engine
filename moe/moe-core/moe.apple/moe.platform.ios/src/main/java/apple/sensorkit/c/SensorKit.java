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
     * <p>
     * This timestamp ticks across sleeps and reboots.
     */
    @Generated
    @CFunction
    public static native double SRAbsoluteTimeGetCurrent();

    /**
     * Convert a mach_continuous_time to an SRAbsoluteTime.
     * <p>
     * Because mach_continuous_time is volatile and hardware specific, the
     * mach_continuous_time must originate from the same device and boot session
     * that SRAbsoluteTimeFromContinuousTime() is called from.
     * The return value for mach_continuous_times spanning boot sessions or devices
     * is undefined.
     */
    @Generated
    @CFunction
    public static native double SRAbsoluteTimeFromContinuousTime(long cont);

    /**
     * Convert a SRAbsoluteTime to a CFAbsoluteTime.
     * <p>
     * The CFAbsoluteTime returned is based on calculations relative to the current
     * wall clock. This means that if the system time is 5 seconds fast against UTC,
     * the result will be 5 seconds fast to when the event happened relative to UTC.
     */
    @Generated
    @CFunction
    public static native double SRAbsoluteTimeToCFAbsoluteTime(double sr);

    /**
     * Convert a CFAbsoluteTime to an SRAbsoluteTime.
     * <p>
     * The SRAbsoluteTime returned is based on calculations relative to the current
     * wall clock. This means that if the system time is 5 seconds fast against UTC,
     * the result will be 5 seconds fast to when the event happened relative to UTC.
     */
    @Generated
    @CFunction
    public static native double SRAbsoluteTimeFromCFAbsoluteTime(double cf);

    /**
     * [@const] SRSensorAmbientLightSensor
     * <p>
     * Sensor stream for Environmental Brightness and Color.
     * <p>
     * This data stream stores ambient light sensor data from devices when the screen is on.
     * Fetches from this stream return objects of type SRAmbientLightSample.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRSensorAmbientLightSensor();

    /**
     * [@const] SRSensorAccelerometer
     * <p>
     * Accelerometer sensor stream for Motion.
     * <p>
     * This data stream stores acceleration measured by the device's accelerometer.
     * Fetches from this stream return objects of type NSArray<CMRecordedAccelerometerData *> * as defined in the CoreMotion framework.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRSensorAccelerometer();

    /**
     * [@const] SRSensorRotationRate
     * <p>
     * Rotation rate sensor stream for Motion.
     * <p>
     * This data stream stores rotation rate measured by the device's gyroscope.
     * Fetches from this stream return objects of type NSArray<CMRecordedRotationRateData *> * as defined in the CoreMotion framework.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRSensorRotationRate();

    /**
     * [@const] SRSensorVisits
     * <p>
     * Sensor stream for Frequently Visited Locations.
     * <p>
     * This data stream stores visit information from frequently visited locations including:
     *
     * @textblock - arrival and departure times
     * - distance from your home
     * - an anonymous location identifier but no specific location information
     * @/textblock Fetches from this stream return objects of type SRVisit.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRSensorVisits();

    /**
     * [@const] SRSensorPedometerData
     * <p>
     * Sensor stream for Pedometer.
     * <p>
     * This stream stores information about your step count.
     * Fetches from this stream return objects of type CMPedometerData as defined in the CoreMotion framework.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRSensorPedometerData();

    /**
     * [@const] SRSensorDeviceUsageReport
     * <p>
     * Sensor stream for Device Usage.
     * <p>
     * This stream stores information about device usage including:
     *
     * @textblock - Types of apps used
     * - Types of notifications received
     * - Types of websites visited
     * - Number of device unlocks and unlock duration
     * - Number of times the screen is on and the duration
     * @/textblock Fetches from this stream return objects of type SRDeviceUsageReport.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRSensorDeviceUsageReport();

    /**
     * [@const] SRSensorMessagesUsageReport
     * <p>
     * Sensor stream for Messages Usage.
     * <p>
     * This streams stores information about messages usage including:
     *
     * @textblock - The number of incoming and outgoing messages
     * - The number of individuals contacted but none of their personal information
     * @/textblock Fetches from this stream return objects of type SRMessagesUsageReport.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRSensorMessagesUsageReport();

    /**
     * [@const] SRSensorPhoneUsageReport
     * <p>
     * Sensor stream for Phone Usage
     * <p>
     * This streams stores information about phone usage including:
     *
     * @textblock - The number of incoming and outgoing calls
     * - The number of individuals contacted but none of their personal information
     * @/textblock Fetches from this stream return objects of type SRPhoneUsageReport.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRSensorPhoneUsageReport();

    /**
     * [@const] SRSensorOnWristState
     * <p>
     * Sensor stream for Watch on Wrist
     * <p>
     * This streams stores information about Apple Watch wear including:
     *
     * @textblock - When the watch is worn
     * - Digital crown and orientation settings
     * @/textblock Fetches from this stream return objects of type SRWristDetection.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRSensorOnWristState();

    /**
     * [@const] SRSensorKeyboardMetrics
     * <p>
     * Sensor stream for Keyboard Usage
     * <p>
     * This stream stores information about keyboard usage from all apps where a keyboard is used including:
     *
     * @textblock - Metrics about typing speed and accuracy
     * - Metrics about the length of typed or swiped words
     * - Metrics about the typing errors made
     * - The number of words and emojis that convey emotion
     * @/textblock Fetches from this stream return objects of type SRKeyboardMetrics.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRSensorKeyboardMetrics();

    /**
     * [@const] SRSensorSiriSpeechMetrics
     * <p>
     * Siri sensor stream for Speech Metrics
     * <p>
     * This stream stores information data about your voice during Siri sessions including:
     *
     * @textblock - Tenor, pitch, and cadence
     * - Metrics such as average words per minute and average pause length
     * @/textblock This steam does not store any raw audio nor any audio or data from other parties.
     * <p>
     * Fetches from this stream return objects of type SFSpeechRecognitionResult as defined in the Speech framework.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRSensorSiriSpeechMetrics();

    /**
     * [@const] SRSensorTelephonySpeechMetrics
     * <p>
     * Telephony sensor stream for Speech Metrics
     * <p>
     * This stream stores information data about your voice during phone calls including:
     *
     * @textblock - Tenor, pitch, and cadence
     * - Metrics such as average words per minute and average pause length
     * @/textblock This steam does not store any raw audio nor any audio or data from other parties.
     * <p>
     * Fetches from this stream return objects of type SFSpeechRecognitionResult as defined in the Speech framework.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRSensorTelephonySpeechMetrics();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryGames();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryBusiness();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryWeather();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryUtilities();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryTravel();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategorySports();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategorySocialNetworking();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryReference();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryProductivity();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryPhotoAndVideo();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryNews();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryNavigation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryMusic();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryLifestyle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryHealthAndFitness();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryFinance();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryEntertainment();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryEducation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryBooks();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryMedical();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryNewsstand();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryCatalogs();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryKids();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryMiscellaneous();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryFoodAndDrink();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryDeveloperTools();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryGraphicsAndDesign();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryShopping();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SRDeviceUsageCategoryStickers();
}
