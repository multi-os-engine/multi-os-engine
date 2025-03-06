package apple.quartzcore.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Bit definitions for `maskedCorners' property.
 * 
 * API-Since: 11.0
 */
@Generated
public final class CACornerMask {
    @Generated
    private CACornerMask() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long MinXMinYCorner = 0x0000000000000001L;
    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long MaxXMinYCorner = 0x0000000000000002L;
    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long MinXMaxYCorner = 0x0000000000000004L;
    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long MaxXMaxYCorner = 0x0000000000000008L;
}