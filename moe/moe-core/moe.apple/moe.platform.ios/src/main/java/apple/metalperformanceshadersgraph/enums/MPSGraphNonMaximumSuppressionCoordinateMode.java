package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@typedef] MPSGraphNonMaximumSuppressionCoordinateMode
 * 
 * The coordinate mode to use. At initialization defaults to
 * MPSGraphNonMaximumSuppressionCoordinateModeCornersHeightFirst.
 * This mode specifies the representation used for the 4 box coordinate values.
 * 
 * Center coordinate modes define a centered box and the box dimensions
 * [@code]
 * CornersHeightFirst:
 * [h_start, w_start, h_end, w_end]
 * CornersWidthFirst:
 * [w_start, h_start, w_end, h_end]
 * CentersHeightFirst:
 * [h_center, w_center, box_height, box_width]
 * CentersWidthFirst:
 * [w_center, w_center, box_height, box_width]
 * [@endcode]
 */
@Generated
public final class MPSGraphNonMaximumSuppressionCoordinateMode {
    @Generated
    private MPSGraphNonMaximumSuppressionCoordinateMode() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long CornersHeightFirst = 0x0000000000000000L;
    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long CornersWidthFirst = 0x0000000000000001L;
    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long CentersHeightFirst = 0x0000000000000002L;
    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long CentersWidthFirst = 0x0000000000000003L;
}