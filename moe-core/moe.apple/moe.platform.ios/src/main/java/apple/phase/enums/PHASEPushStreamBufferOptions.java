package apple.phase.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] PHASEPushStreamBufferOptions
 * 
 * Options controlling buffer scheduling.
 * [@constant] PHASEPushStreamBufferDefault
 * The buffer plays following any previously scheduled buffer(s).
 * [@constant] PHASEPushStreamBufferLoops
 * The buffer loops indefinitely.
 * [@constant] PHASEPushStreamBufferInterrupts
 * The buffer interrupts any buffer already playing.
 * [@constant] PHASEPushStreamBufferInterruptsAtLoop
 * The buffer interrupts any buffer already playing, at its loop point.
 */
@Generated
public final class PHASEPushStreamBufferOptions {
    @Generated
    private PHASEPushStreamBufferOptions() {
    }

    /**
     * 0x01
     */
    @Generated @NUInt public static final long Default = 0x0000000000000001L;
    /**
     * 0x02
     */
    @Generated @NUInt public static final long Loops = 0x0000000000000002L;
    /**
     * 0x04
     */
    @Generated @NUInt public static final long Interrupts = 0x0000000000000004L;
    /**
     * 0x08
     */
    @Generated @NUInt public static final long InterruptsAtLoop = 0x0000000000000008L;
}
