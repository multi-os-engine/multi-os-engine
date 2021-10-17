package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] AVAudioPlayerNodeBufferOptions
 * <p>
 * Options controlling buffer scheduling.
 * <p>
 * [@constant]	AVAudioPlayerNodeBufferLoops
 * The buffer loops indefinitely.
 * [@constant]	AVAudioPlayerNodeBufferInterrupts
 * The buffer interrupts any buffer already playing.
 * [@constant]	AVAudioPlayerNodeBufferInterruptsAtLoop
 * The buffer interrupts any buffer already playing, at its loop point.
 * <p>
 * API_AVAILABLE(macos(10.10), ios(8.0), watchos(2.0), tvos(9.0))
 */
@Generated
public final class AVAudioPlayerNodeBufferOptions {
    @Generated
    private AVAudioPlayerNodeBufferOptions() {
    }

    /**
     * 0x01
     */
    @Generated @NUInt public static final long Loops = 0x0000000000000001L;
    /**
     * 0x02
     */
    @Generated @NUInt public static final long Interrupts = 0x0000000000000002L;
    /**
     * 0x04
     */
    @Generated @NUInt public static final long InterruptsAtLoop = 0x0000000000000004L;
}
