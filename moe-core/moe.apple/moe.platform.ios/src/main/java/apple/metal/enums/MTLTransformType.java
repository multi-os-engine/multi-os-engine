package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 18.0
 */
@Generated
public final class MTLTransformType {
    @Generated
    private MTLTransformType() {
    }

    /**
     * A tightly packed matrix with 4 columns and 3 rows. The full transform is assumed
     * to be a 4x4 matrix with the last row being (0, 0, 0, 1).
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long PackedFloat4x3 = 0x0000000000000000L;
    /**
     * A transformation represented by individual components such as translation and
     * rotation. The rotation is represented by a quaternion, allowing for correct motion
     * interpolation.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Component = 0x0000000000000001L;
}