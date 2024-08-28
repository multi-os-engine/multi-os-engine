package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The error states for a Metal command encoder after command buffer execution.
 * 
 * [@constant] MTLCommandEncoderErrorStateUnknown
 * The state of the commands associated with the encoder is unknown (the error information was likely not requested).
 * 
 * [@constant] MTLCommandEncoderErrorStateCompleted
 * The commands associated with the encoder were completed.
 * 
 * [@constant] MTLCommandEncoderErrorStateAffected
 * The commands associated with the encoder were affected by an error, which may or may not have been caused by the
 * commands themselves, and failed to execute in full.
 * 
 * [@constant] MTLCommandEncoderErrorStatePending
 * The commands associated with the encoder never started execution.
 * 
 * [@constant] MTLCommandEncoderErrorStateFaulted
 * The commands associated with the encoder caused an error.
 * 
 * API-Since: 14.0
 */
@Generated
public final class MTLCommandEncoderErrorState {
    @Generated
    private MTLCommandEncoderErrorState() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Completed = 0x0000000000000001L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Affected = 0x0000000000000002L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Pending = 0x0000000000000003L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Faulted = 0x0000000000000004L;
}
