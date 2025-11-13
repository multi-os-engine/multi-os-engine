package apple.videotoolbox.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Flags to control processing of a frame you pass to the motion-estimation session.
 */
@Generated
public final class VTMotionEstimationFrameFlags {
    @Generated
    private VTMotionEstimationFrameFlags() {
    }

    /**
     * A hint to the motion-estimation session that you are going to reuse the `currentBuffer` as `referenceBuffer` in
     * the next call to ``VTMotionEstimationSessionEstimateMotionVectors``. Using this flag allows the motion-estimation
     * processor to deliver better performance.
     */
    @Generated public static final int kVTMotionEstimationFrameFlags_CurrentBufferWillBeNextReferenceBuffer = 0x00000001;
}