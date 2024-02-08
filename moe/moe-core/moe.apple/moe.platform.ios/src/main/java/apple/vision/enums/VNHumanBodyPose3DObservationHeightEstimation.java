package apple.vision.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Height estimation technique used in observation based on available metadata
 * VNHumanBodyPose3DObservationHeightEstimationReference is the default if no LiDAR depth is present
 * 
 * reference - Since no depth was present, a reference height of 1.8 meters is used
 * measured - LiDAR depth was used to measure a more accurate `bodyHeight` in meters
 */
@Generated
public final class VNHumanBodyPose3DObservationHeightEstimation {
    @Generated
    private VNHumanBodyPose3DObservationHeightEstimation() {
    }

    @Generated @NInt public static final long Reference = 0x0000000000000000L;
    @Generated @NInt public static final long Measured = 0x0000000000000001L;
}