package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Constants indicating the current camera lens smudge detection status.
 * 
 * API-Since: 26.0
 */
@Generated
public final class AVCaptureCameraLensSmudgeDetectionStatus {
    @Generated
    private AVCaptureCameraLensSmudgeDetectionStatus() {
    }

    /**
     * Indicates that the detection is not enabled.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Disabled = 0x0000000000000000L;
    /**
     * Indicates that the most recent detection found no smudge on the camera lens.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long SmudgeNotDetected = 0x0000000000000001L;
    /**
     * Indicates that the most recent detection found the camera lens to be smudged.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Smudged = 0x0000000000000002L;
    /**
     * Indicates that the detection result has not settled, commonly caused by excessive camera movement or the content
     * of the scene.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000003L;
}