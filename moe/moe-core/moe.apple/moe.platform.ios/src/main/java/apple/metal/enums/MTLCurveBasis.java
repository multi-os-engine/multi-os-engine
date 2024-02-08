package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Basis function to use to interpolate curve control points
 * 
 * API-Since: 17.0
 */
@Generated
public final class MTLCurveBasis {
    @Generated
    private MTLCurveBasis() {
    }

    /**
     * B-Spline basis. Each curve segment must have 3 or 4 control
     * points. Curve segments join with C^(N - 2) continuity, where N is
     * the number of control points. The curve does not necessarily pass
     * through the control points without additional control points at the
     * beginning and end of the curve. Each curve segment can overlap
     * N-1 control points.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long BSpline = 0x0000000000000000L;
    /**
     * Catmull-Rom basis. Curves represented in this basis can also be
     * easily converted to and from the Bézier basis. Each curve segment must
     * have 4 control points. Each index in the control point index buffer
     * points to the first of 4 consecutive control points in the control point
     * buffer.
     * 
     * The tangent at each control point is given by
     * (P_(i+1) - P_(i-1)) / 2. Therefore, the curve does not pass through the
     * first and last control point of each connected sequence of curve
     * segments. Instead, the first and last control point are used to control
     * the tangent vector at the beginning and end of the curve.
     * 
     * Curve segments join with C^1 continuity and the
     * curve passes through the control points. Each curve segment can overlap
     * 3 control points.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long CatmullRom = 0x0000000000000001L;
    /**
     * Linear basis. The curve is made of a sequence of connected line
     * segments each with 2 control points.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Linear = 0x0000000000000002L;
    /**
     * Bezier basis
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Bezier = 0x0000000000000003L;
}