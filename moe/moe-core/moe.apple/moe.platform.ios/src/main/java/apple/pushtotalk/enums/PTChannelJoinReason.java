package apple.pushtotalk.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 16.0
 */
@Generated
public final class PTChannelJoinReason {
    @Generated
    private PTChannelJoinReason() {
    }

    /**
     * The app joined via a programmatic call to requestJoinChannelWithUUID:descriptor: while in the foreground
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long DeveloperRequest = 0x0000000000000000L;
    /**
     * Rejoined via channel restoration
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long ChannelRestoration = 0x0000000000000001L;
}