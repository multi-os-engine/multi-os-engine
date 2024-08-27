package apple.phase.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] PHASESoundEventStartHandlerReason
 * 
 * Sound event start handler reason
 */
@Generated
public final class PHASESoundEventStartHandlerReason {
    @Generated
    private PHASESoundEventStartHandlerReason() {
    }

    @Generated @NInt public static final long Failure = 0x0000000000000000L;
    @Generated @NInt public static final long FinishedPlaying = 0x0000000000000001L;
    @Generated @NInt public static final long Terminated = 0x0000000000000002L;
}
