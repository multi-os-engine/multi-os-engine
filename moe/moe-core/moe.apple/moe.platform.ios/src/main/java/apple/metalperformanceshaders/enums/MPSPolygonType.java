package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 13.0
 */
@Generated
public final class MPSPolygonType {
    @Generated
    private MPSPolygonType() {
    }

    /**
     * Triangles with three vertices
     * 
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long Triangle = 0x0000000000000000L;
    /**
     * Quadrilaterals with four vertices
     * 
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long Quadrilateral = 0x0000000000000001L;
}