package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 15.0
 */
@Generated
public final class INShareFocusStatusIntentResponseCode {
    @Generated
    private INShareFocusStatusIntentResponseCode() {
    }

    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Unspecified = 0x0000000000000000L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Ready = 0x0000000000000001L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long InProgress = 0x0000000000000002L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Success = 0x0000000000000003L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Failure = 0x0000000000000004L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long FailureRequiringAppLaunch = 0x0000000000000005L;
}
