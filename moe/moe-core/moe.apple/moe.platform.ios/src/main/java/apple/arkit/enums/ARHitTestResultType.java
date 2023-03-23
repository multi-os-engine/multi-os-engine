package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Option set of hit-test result types.
 */
@Generated
public final class ARHitTestResultType {
    @Generated
    private ARHitTestResultType() {
    }

    /**
     * Result type from intersecting the nearest feature point.
     */
    @Generated @NUInt public static final long FeaturePoint = 0x0000000000000001L;
    /**
     * Result type from intersecting a horizontal plane estimate, determined for the current frame.
     */
    @Generated @NUInt public static final long EstimatedHorizontalPlane = 0x0000000000000002L;
    /**
     * Result type from intersecting with an existing plane anchor.
     */
    @Generated @NUInt public static final long ExistingPlane = 0x0000000000000008L;
    /**
     * Result type from intersecting with an existing plane anchor, taking into account the plane’s extent.
     */
    @Generated @NUInt public static final long ExistingPlaneUsingExtent = 0x0000000000000010L;
    /**
     * Result type from intersecting a vertical plane estimate, determined for the current frame.
     * 
     * API-Since: 11.3
     */
    @Generated @NUInt public static final long EstimatedVerticalPlane = 0x0000000000000004L;
    /**
     * Result type from intersecting with an existing plane anchor, taking into account the plane’s geometry.
     * 
     * API-Since: 11.3
     */
    @Generated @NUInt public static final long ExistingPlaneUsingGeometry = 0x0000000000000020L;
}