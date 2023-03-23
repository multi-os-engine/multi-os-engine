package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVCapturePhotoQualityPrioritization
 * 
 * Constants indicating how photo quality should be prioritized against speed.
 * 
 * [@constant] AVCapturePhotoQualityPrioritizationSpeed
 * Indicates that speed of photo delivery is most important, even at the expense of quality.
 * [@constant] AVCapturePhotoQualityPrioritizationBalanced
 * Indicates that photo quality and speed of delivery are balanced in priority.
 * [@constant] AVCapturePhotoQualityPrioritizationQuality
 * Indicates that photo quality is paramount, even at the expense of shot-to-shot time.
 * 
 * API-Since: 13.0
 */
@Generated
public final class AVCapturePhotoQualityPrioritization {
    @Generated
    private AVCapturePhotoQualityPrioritization() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Speed = 0x0000000000000001L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Balanced = 0x0000000000000002L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Quality = 0x0000000000000003L;
}
