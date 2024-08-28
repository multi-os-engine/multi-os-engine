package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 13.0
 */
@Generated
public final class INPlayMediaPlaybackSpeedUnsupportedReason {
    @Generated
    private INPlayMediaPlaybackSpeedUnsupportedReason() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long BelowMinimum = 0x0000000000000001L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long AboveMaximum = 0x0000000000000002L;
}