package apple.vision.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Person segmentation level options to favor speed over recognition accuracy.
 * VNGeneratePersonSegmentationRequestQualityLevelAccurate is the default option.
 * 
 * fast - generates a low accuracy segmentation mask that can be used in streaming scenarios on devices that have a
 * neural engine
 * balanced - generates a high accuracy segmentation mask
 * accurate - generates a mask based on the balanced output that includes matting refinement
 * The request may hold on to previous masks to improve temporal stability.
 */
@Generated
public final class VNGeneratePersonSegmentationRequestQualityLevel {
    @Generated
    private VNGeneratePersonSegmentationRequestQualityLevel() {
    }

    @Generated @NUInt public static final long Accurate = 0x0000000000000000L;
    @Generated @NUInt public static final long Balanced = 0x0000000000000001L;
    @Generated @NUInt public static final long Fast = 0x0000000000000002L;
}
