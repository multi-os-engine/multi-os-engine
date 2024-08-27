package apple.phase.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] PHASESoundEventPrepareHandlerReason
 * 
 * Sound event prepare handler reason
 */
@Generated
public final class PHASESoundEventPrepareHandlerReason {
    @Generated
    private PHASESoundEventPrepareHandlerReason() {
    }

    @Generated @NInt public static final long Failure = 0x0000000000000000L;
    @Generated @NInt public static final long Prepared = 0x0000000000000001L;
    @Generated @NInt public static final long Terminated = 0x0000000000000002L;
}
