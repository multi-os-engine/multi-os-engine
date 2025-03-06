package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * The resize mode to use for resizing.
 */
@Generated
public final class MPSGraphResizeMode {
    @Generated
    private MPSGraphResizeMode() {
    }

    /**
     * Samples the nearest neighbor to the pixel coordinate.
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long Nearest = 0x0000000000000000L;
    /**
     * Samples the 4 neighbors to the pixel coordinate and uses bilinear interpolation.
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long Bilinear = 0x0000000000000001L;
}
