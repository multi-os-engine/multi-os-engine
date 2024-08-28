package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 13.0
 */
@Generated
public final class INStartCallIntentResponseCode {
    @Generated
    private INStartCallIntentResponseCode() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Unspecified = 0x0000000000000000L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Ready = 0x0000000000000001L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long ContinueInApp = 0x0000000000000002L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long UserConfirmationRequired = 0x0000000000000003L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Failure = 0x0000000000000004L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long FailureRequiringAppLaunch = 0x0000000000000005L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long FailureCallingServiceNotAvailable = 0x0000000000000006L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long FailureContactNotSupportedByApp = 0x0000000000000007L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long FailureAirplaneModeEnabled = 0x0000000000000008L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long FailureUnableToHandOff = 0x0000000000000009L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long FailureAppConfigurationRequired = 0x000000000000000AL;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long FailureCallInProgress = 0x000000000000000BL;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long FailureRequiringInAppAuthentication = 0x000000000000000DL;
}