package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 17.0
 */
@Generated
public final class INUnsendMessagesIntentResponseCode {
    @Generated
    private INUnsendMessagesIntentResponseCode() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Unspecified = 0x0000000000000000L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Ready = 0x0000000000000001L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long InProgress = 0x0000000000000002L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Success = 0x0000000000000003L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Failure = 0x0000000000000004L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long FailureRequiringAppLaunch = 0x0000000000000005L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long FailureMessageNotFound = 0x0000000000000006L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long FailurePastUnsendTimeLimit = 0x0000000000000007L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long FailureMessageTypeUnsupported = 0x0000000000000008L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long FailureUnsupportedOnService = 0x0000000000000009L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long FailureMessageServiceNotAvailable = 0x000000000000000AL;
    @Generated @NInt public static final long FailureRequiringInAppAuthentication = 0x000000000000000BL;
}