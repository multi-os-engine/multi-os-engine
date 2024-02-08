package apple.avkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] AVCaptureEventPhase
 * 
 * An enum describing the phase of a capture event.
 * [@constant] AVCaptureEventPhaseBegan
 * A phase sent at the beginning of a capture event.
 * [@constant] AVCaptureEventPhaseEnded
 * A phase sent at the end of a capture event.
 * [@constant] AVCaptureEventPhaseCancelled
 * A phase sent when a capture event is cancelled.
 * 
 * API-Since: 17.2
 */
@Generated
public final class AVCaptureEventPhase {
    @Generated
    private AVCaptureEventPhase() {
    }

    /**
     * API-Since: 17.2
     */
    @Generated @NUInt public static final long Began = 0x0000000000000000L;
    /**
     * API-Since: 17.2
     */
    @Generated @NUInt public static final long Ended = 0x0000000000000001L;
    /**
     * API-Since: 17.2
     */
    @Generated @NUInt public static final long Cancelled = 0x0000000000000002L;
}