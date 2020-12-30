package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The primitive that defines how vertices are connected.
 */
@Generated
public final class ARGeometryPrimitiveType {
    @Generated
    private ARGeometryPrimitiveType() {
    }

    /**
     * The geometry element is a sequence of line segments, where each line segment is described by two new vertices.
     */
    @Generated @NInt public static final long Line = 0x0000000000000000L;
    /**
     * The geometry element is a sequence of triangles, where each triangle is described by three new vertices.
     */
    @Generated @NInt public static final long Triangle = 0x0000000000000001L;
}