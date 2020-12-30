package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MPSPolygonType {
    @Generated
    private MPSPolygonType() {
    }

    /**
     * @brief Triangles with three vertices
     */
    @Generated @NUInt public static final long Triangle = 0x0000000000000000L;
    /**
     * @brief Quadrilaterals with four vertices
     */
    @Generated @NUInt public static final long Quadrilateral = 0x0000000000000001L;
}