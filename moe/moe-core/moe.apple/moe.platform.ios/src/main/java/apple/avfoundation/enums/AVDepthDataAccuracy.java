package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVDepthDataAccuracy
 * 
 *    Constants indicating the accuracy of the units expressed by depth data map values.
 * 
 * [@constant] AVDepthDataAccuracyRelative
 *    Values within the depth data map are usable for foreground / background separation, but are not absolutely accurate in the physical world.
 * [@constant] AVDepthDataAccuracyAbsolute
 *    Values within the depth map are absolutely accurate within the physical world.
 * 
 *    The accuracy of a depth data map is highly dependent on the camera calibration data used to generate it. If the camera's focal length cannot be precisely determined at the time of capture, scaling error in the z (depth) plane will be introduced. If the camera's optical center can't be precisely determined at capture time, principal point error will be introduced, leading to an offset error in the disparity estimate. AVDepthDataAccuracy constants report the accuracy of a map's values with respect to its reported units. If the accuracy is reported to be AVDepthDataAccuracyRelative, the values within the map are usable relative to one another (that is, larger depth values are farther away than smaller depth values), but do not accurately convey real world distance. Disparity maps with relative accuracy may still be used to reliably determine the difference in disparity between two points in the same map.
 */
@Generated
public final class AVDepthDataAccuracy {
    @Generated
    private AVDepthDataAccuracy() {
    }

    @Generated @NInt public static final long Relative = 0x0000000000000000L;
    @Generated @NInt public static final long Absolute = 0x0000000000000001L;
}