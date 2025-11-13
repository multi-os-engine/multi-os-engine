package apple.avkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * An enumeration that describes the phase of a capture event.
 * 
 * API-Since: 17.2
 */
@Generated
public final class AVCaptureEventPhase {
    @Generated
    private AVCaptureEventPhase() {
    }

    /**
     * A phase that indicates the beginning of a capture event.
     * 
     * API-Since: 17.2
     */
    @Generated @NUInt public static final long Began = 0x0000000000000000L;
    /**
     * A phase that indicates the end of a capture event.
     * 
     * API-Since: 17.2
     */
    @Generated @NUInt public static final long Ended = 0x0000000000000001L;
    /**
     * A phase that indicates the cancellation of a capture event.
     * 
     * API-Since: 17.2
     */
    @Generated @NUInt public static final long Cancelled = 0x0000000000000002L;
}