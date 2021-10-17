package apple.phase.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] PHASESoundEventSeekHandlerReason
 * <p>
 * Sound event seek handler reason
 */
@Generated
public final class PHASESoundEventSeekHandlerReason {
    @Generated
    private PHASESoundEventSeekHandlerReason() {
    }

    @Generated @NInt public static final long Failure = 0x0000000000000000L;
    @Generated @NInt public static final long FailureSeekAlreadyInProgress = 0x0000000000000001L;
    @Generated @NInt public static final long SeekSuccessful = 0x0000000000000002L;
}
