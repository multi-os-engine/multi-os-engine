package apple.vision.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Constellation type defines how many landmark points are used to map a face. Revisions 1, 2, and 3 support 65 points, where Rev3 also supports 76 points.
 */
@Generated
public final class VNRequestFaceLandmarksConstellation {
    @Generated
    private VNRequestFaceLandmarksConstellation() {
    }

    @Generated @NUInt public static final long ConstellationNotDefined = 0x0000000000000000L;
    @Generated @NUInt public static final long Constellation65Points = 0x0000000000000001L;
    @Generated @NUInt public static final long Constellation76Points = 0x0000000000000002L;
}