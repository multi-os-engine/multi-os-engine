package apple.videotoolbox.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Indicates the order of input frames.
 * 
 * When submitting ``VTSuperResolutionScalerParameters`` to the processor, you need to provide one of these values based
 * on
 * how the input frames are related to each other.
 * 
 * Use ``VTSuperResolutionScalerParametersSubmissionModeSequential`` to indicate that the current submission follows
 * presentation time order without jumps or skips, when compared to previous submissions. This value provides better
 * processor performance than other values.
 * 
 * Use ``VTSuperResolutionScalerParametersSubmissionModeRandom`` to indicate that the current submission has no relation
 * to the previous submission. Typically, this indicates a jump or skip in the frame sequence. The processor clears
 * internal caches when it receives this value in ``VTFrameProcessor/processWithParameters`` function call.
 */
@Generated
public final class VTSuperResolutionScalerParametersSubmissionMode {
    @Generated
    private VTSuperResolutionScalerParametersSubmissionMode() {
    }

    /**
     * You are submitting frames in non-sequential order.
     */
    @Generated @NInt public static final long Random = 0x0000000000000001L;
    /**
     * You are submitting frames sequentially following presentation time order.
     */
    @Generated @NInt public static final long Sequential = 0x0000000000000002L;
}