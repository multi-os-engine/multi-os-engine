package apple.webkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 16.0
 */
@Generated
public final class WKFullscreenState {
    @Generated
    private WKFullscreenState() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long NotInFullscreen = 0x0000000000000000L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long EnteringFullscreen = 0x0000000000000001L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long InFullscreen = 0x0000000000000002L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long ExitingFullscreen = 0x0000000000000003L;
}