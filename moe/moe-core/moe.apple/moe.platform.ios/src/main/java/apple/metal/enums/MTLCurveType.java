package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Curve types
 * 
 * API-Since: 17.0
 */
@Generated
public final class MTLCurveType {
    @Generated
    private MTLCurveType() {
    }

    /**
     * Curve with a circular cross-section. These curves have the
     * advantage of having a real 3D shape consistent across different ray
     * directions, well-defined surface normals, etc. However, they may be
     * slower to intersect. These curves are ideal for viewing close-up.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Round = 0x0000000000000000L;
    /**
     * Curve with a flat cross-section aligned with the ray direction.
     * These curves may be faster to intersect but do not have a consistent
     * 3D structure across different rays. These curves are ideal for viewing
     * at a distance or curves with a small radius such as hair and fur.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Flat = 0x0000000000000001L;
}