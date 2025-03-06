package apple.carplay.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 17.4
 */
@Generated
public final class CPJunctionType {
    @Generated
    private CPJunctionType() {
    }

    /**
     * single intersection with roads coming to a common point
     * 
     * API-Since: 17.4
     */
    @Generated @NUInt public static final long Intersection = 0x0000000000000000L;
    /**
     * roundabout, junction elements represent roads exiting the roundabout
     * 
     * API-Since: 17.4
     */
    @Generated @NUInt public static final long Roundabout = 0x0000000000000001L;
}