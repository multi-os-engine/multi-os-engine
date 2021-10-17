package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Signature defining what data is provided to an intersection function. The signature
 * must match across the shading language declaration of the intersection function table,
 * intersection functions in the table, and the intersector using the table.
 */
@Generated
public final class MTLIntersectionFunctionSignature {
    @Generated
    private MTLIntersectionFunctionSignature() {
    }

    /**
     * No signature
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * The intersection functions are entitled to read the built-in instance_id as described in
     * the Metal Shading Language Guide.
     */
    @Generated @NUInt public static final long Instancing = 0x0000000000000001L;
    /**
     * The triangle intersection functions are entitled to to read the built-in barycentric_coord
     * and front_facing as described in the Metal Shading Language Guide.
     */
    @Generated @NUInt public static final long TriangleData = 0x0000000000000002L;
    /**
     * The intersection functions are entitled to query world_space_origin and
     * world_space_direction as described in the Metal Shading Language Guide.
     */
    @Generated @NUInt public static final long WorldSpaceData = 0x0000000000000004L;
    /**
     * The intersection functions may be called from intersectors using the
     * instance_motion intersection tag as described in the Metal Shading Language Guide.
     */
    @Generated @NUInt public static final long InstanceMotion = 0x0000000000000008L;
    /**
     * The intersection functions are entitled to query time, motion_start_time,
     * motion_end_time and key_frame_count as described in the Metal Shading Language Guide.
     */
    @Generated @NUInt public static final long PrimitiveMotion = 0x0000000000000010L;
    /**
     * The intersection functions may be called from intersectors using the
     * extended_limits intersection tag as described in the Metal Shading Language Guide.
     */
    @Generated @NUInt public static final long ExtendedLimits = 0x0000000000000020L;
}
