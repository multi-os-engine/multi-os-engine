package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Options for the MPSRayIntersector intersection type property
 * 
 * API-Since: 12.0
 */
@Generated
public final class MPSIntersectionType {
    @Generated
    private MPSIntersectionType() {
    }

    /**
     * Find the closest intersection to the ray's origin along the ray direction. This is
     * potentially slower than MPSIntersectionTypeAny but is well suited to primary visibility
     * rays.
     * 
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long Nearest = 0x0000000000000000L;
    /**
     * Find any intersection along the ray direction. This is potentially faster than
     * MPSIntersectionTypeNearest and is well suited to shadow and occlusion rays.
     * 
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long Any = 0x0000000000000001L;
}