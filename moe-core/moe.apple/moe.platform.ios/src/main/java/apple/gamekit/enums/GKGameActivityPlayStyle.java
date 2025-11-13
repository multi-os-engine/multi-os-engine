package apple.gamekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Play Style of the game activity. It can be either Asynchronous or Synchronous.
 * 
 * API-Since: 26.0
 */
@Generated
public final class GKGameActivityPlayStyle {
    @Generated
    private GKGameActivityPlayStyle() {
    }

    /**
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Unspecified = 0x0000000000000000L;
    /**
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Synchronous = 0x0000000000000001L;
    /**
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Asynchronous = 0x0000000000000002L;
}