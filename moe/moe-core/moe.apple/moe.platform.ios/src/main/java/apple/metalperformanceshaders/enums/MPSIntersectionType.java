package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * @brief Options for the MPSRayIntersector intersection type property
 */
@Generated
public final class MPSIntersectionType {
    @Generated
    private MPSIntersectionType() {
    }

    /**
     * @brief Find the closest intersection to the ray's origin along the ray direction. This is
     * potentially slower than MPSIntersectionTypeAny but is well suited to primary visibility
     * rays.
     */
    @Generated @NUInt public static final long Nearest = 0x0000000000000000L;
    /**
     * @brief Find any intersection along the ray direction. This is potentially faster than
     * MPSIntersectionTypeNearest and is well suited to shadow and occlusion rays.
     */
    @Generated @NUInt public static final long Any = 0x0000000000000001L;
}