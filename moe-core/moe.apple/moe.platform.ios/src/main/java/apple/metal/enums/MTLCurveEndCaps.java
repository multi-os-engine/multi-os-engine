package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Type of end cap to insert at the beginning and end of each connected
 * sequence of curve segments.
 * 
 * API-Since: 17.0
 */
@Generated
public final class MTLCurveEndCaps {
    @Generated
    private MTLCurveEndCaps() {
    }

    /**
     * No end caps
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * Disk end caps
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Disk = 0x0000000000000001L;
    /**
     * Spherical end caps
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Sphere = 0x0000000000000002L;
}