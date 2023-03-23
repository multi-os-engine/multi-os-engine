package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 12.0
 */
@Generated
public final class INPlayMediaIntentResponseCode {
    @Generated
    private INPlayMediaIntentResponseCode() {
    }

    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long Unspecified = 0x0000000000000000L;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long Ready = 0x0000000000000001L;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long ContinueInApp = 0x0000000000000002L;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long InProgress = 0x0000000000000003L;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long Success = 0x0000000000000004L;
    @Generated @NInt public static final long HandleInApp = 0x0000000000000005L;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long Failure = 0x0000000000000006L;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long FailureRequiringAppLaunch = 0x0000000000000007L;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long FailureUnknownMediaType = 0x0000000000000008L;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long FailureNoUnplayedContent = 0x0000000000000009L;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long FailureRestrictedContent = 0x000000000000000AL;
    /**
     * API-Since: 15.4
     */
    @Generated @NInt public static final long FailureMaxStreamLimitReached = 0x000000000000000BL;
}