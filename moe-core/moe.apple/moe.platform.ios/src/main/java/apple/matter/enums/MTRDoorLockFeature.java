package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTRDoorLockFeature {
    @Generated
    private MTRDoorLockFeature() {
    }

    /**
     * API-Since: 16.4
     */
    @Generated public static final int PINCredential = 0x00000001;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRDoorLockFeaturePINCredential
     */
    @Generated @Deprecated public static final int PINCredentials = 0x00000001;
    /**
     * API-Since: 16.4
     */
    @Generated public static final int RFIDCredential = 0x00000002;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRDoorLockFeatureRFIDCredential
     */
    @Generated @Deprecated public static final int RFIDCredentials = 0x00000002;
    /**
     * API-Since: 16.1
     */
    @Generated public static final int FingerCredentials = 0x00000004;
    /**
     * API-Since: 16.1
     */
    @Generated public static final int Logging = 0x00000008;
    /**
     * API-Since: 16.4
     */
    @Generated public static final int WeekDayAccessSchedules = 0x00000010;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRDoorLockFeatureWeekDayAccessSchedules
     */
    @Generated @Deprecated public static final int WeekDaySchedules = 0x00000010;
    /**
     * API-Since: 16.1
     */
    @Generated public static final int DoorPositionSensor = 0x00000020;
    /**
     * API-Since: 16.1
     */
    @Generated public static final int FaceCredentials = 0x00000040;
    /**
     * API-Since: 16.4
     */
    @Generated public static final int CredentialsOverTheAirAccess = 0x00000080;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRDoorLockFeatureCredentialsOverTheAirAccess
     */
    @Generated @Deprecated public static final int CredentialsOTA = 0x00000080;
    /**
     * API-Since: 16.4
     */
    @Generated public static final int User = 0x00000100;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRDoorLockFeatureUser
     */
    @Generated @Deprecated public static final int UsersManagement = 0x00000100;
    /**
     * API-Since: 16.4
     */
    @Generated public static final int Notification = 0x00000200;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRDoorLockFeatureNotification
     */
    @Generated @Deprecated public static final int Notifications = 0x00000200;
    /**
     * API-Since: 16.4
     */
    @Generated public static final int YearDayAccessSchedules = 0x00000400;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRDoorLockFeatureYearDayAccessSchedules
     */
    @Generated @Deprecated public static final int YearDaySchedules = 0x00000400;
    /**
     * API-Since: 16.1
     */
    @Generated public static final int HolidaySchedules = 0x00000800;
}