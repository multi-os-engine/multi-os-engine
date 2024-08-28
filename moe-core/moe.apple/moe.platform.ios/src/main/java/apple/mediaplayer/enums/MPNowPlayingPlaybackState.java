package apple.mediaplayer.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 11.0
 */
@Generated
public final class MPNowPlayingPlaybackState {
    @Generated
    private MPNowPlayingPlaybackState() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Unknown = 0x0000000000000000L;
    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Playing = 0x0000000000000001L;
    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Paused = 0x0000000000000002L;
    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Stopped = 0x0000000000000003L;
    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Interrupted = 0x0000000000000004L;
}