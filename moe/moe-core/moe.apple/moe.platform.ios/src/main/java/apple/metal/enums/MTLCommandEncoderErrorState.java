package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The error states for a Metal command encoder after command buffer execution.
 * <p>
 * [@constant] MTLCommandEncoderErrorStateUnknown
 * The state of the commands associated with the encoder is unknown (the error information was likely not requested).
 * <p>
 * [@constant] MTLCommandEncoderErrorStateCompleted
 * The commands associated with the encoder were completed.
 * <p>
 * [@constant] MTLCommandEncoderErrorStateAffected
 * The commands associated with the encoder were affected by an error, which may or may not have been caused by the
 * commands themselves, and failed to execute in full.
 * <p>
 * [@constant] MTLCommandEncoderErrorStatePending
 * The commands associated with the encoder never started execution.
 * <p>
 * [@constant] MTLCommandEncoderErrorStateFaulted
 * The commands associated with the encoder caused an error.
 */
@Generated
public final class MTLCommandEncoderErrorState {
    @Generated
    private MTLCommandEncoderErrorState() {
    }

    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    @Generated @NInt public static final long Completed = 0x0000000000000001L;
    @Generated @NInt public static final long Affected = 0x0000000000000002L;
    @Generated @NInt public static final long Pending = 0x0000000000000003L;
    @Generated @NInt public static final long Faulted = 0x0000000000000004L;
}
