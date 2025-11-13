package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Defines possible sources for generating timecode in using a timecode generator.
 * 
 * API-Since: 26.0
 */
@Generated
public final class AVCaptureTimecodeSourceType {
    @Generated
    private AVCaptureTimecodeSourceType() {
    }

    /**
     * No internal or external source is adopted. Timecodes are zero-based, sequentially generated frame counts.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long FrameCount = 0x0000000000000000L;
    /**
     * Synchronizes timecode to the system clock for real-time applications. Useful for live events or scenarios
     * requiring alignment with the actual time of day.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long RealTimeClock = 0x0000000000000001L;
    /**
     * Synchronizes timecode to an external timecode data stream. Ideal for professional audio and video synchronization
     * with external quarter-frame MIDI or HID timecode hardware.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long External = 0x0000000000000002L;
}