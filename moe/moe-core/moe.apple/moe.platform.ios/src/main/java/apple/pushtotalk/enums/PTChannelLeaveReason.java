package apple.pushtotalk.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 16.0
 */
@Generated
public final class PTChannelLeaveReason {
    @Generated
    private PTChannelLeaveReason() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * User pressed the leave button in the system UI
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long UserRequest = 0x0000000000000001L;
    /**
     * The app made a call to leaveChannelWithUUID:
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long DeveloperRequest = 0x0000000000000002L;
    /**
     * For example, a new managed device restriction has come into effect
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long SystemPolicy = 0x0000000000000003L;
}