package apple.vision.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * The level of optical flow computational accuracy.
 * 
 * Computational accuracy settings are only available for VNGenerateOpticalFlowRequestRevision1.
 */
@Generated
public final class VNGenerateOpticalFlowRequestComputationAccuracy {
    @Generated
    private VNGenerateOpticalFlowRequestComputationAccuracy() {
    }

    @Generated @NUInt public static final long Low = 0x0000000000000000L;
    @Generated @NUInt public static final long Medium = 0x0000000000000001L;
    @Generated @NUInt public static final long High = 0x0000000000000002L;
    @Generated @NUInt public static final long VeryHigh = 0x0000000000000003L;
}