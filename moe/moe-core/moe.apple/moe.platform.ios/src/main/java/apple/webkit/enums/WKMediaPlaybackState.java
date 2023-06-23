package apple.webkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 14.5
 */
@Generated
public final class WKMediaPlaybackState {
    @Generated
    private WKMediaPlaybackState() {
    }

    /**
     * API-Since: 14.5
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 14.5
     */
    @Generated @NInt public static final long Playing = 0x0000000000000001L;
    /**
     * API-Since: 14.5
     */
    @Generated @NInt public static final long Paused = 0x0000000000000002L;
    /**
     * API-Since: 14.5
     */
    @Generated @NInt public static final long Suspended = 0x0000000000000003L;
}
