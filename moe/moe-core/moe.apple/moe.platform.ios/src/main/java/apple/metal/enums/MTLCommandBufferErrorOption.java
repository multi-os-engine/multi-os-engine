package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Options for controlling the error reporting for Metal command buffer objects.
 * 
 * [@constant] MTLCommandBufferErrorOptionNone
 * No special error reporting.
 * 
 * [@constant] MTLCommandBufferErrorOptionEncoderExecutionStatus
 * Provide the execution status of the individual encoders within the command buffer. In the event of a command buffer
 * error, populate the `userInfo` dictionary of the command buffer's NSError parameter, see
 * MTLCommandBufferEncoderInfoErrorKey and MTLCommandBufferEncoderInfo. Note that enabling this error reporting option
 * may increase CPU, GPU, and/or memory overhead on some platforms; testing for impact is suggested.
 * 
 * API-Since: 14.0
 */
@Generated
public final class MTLCommandBufferErrorOption {
    @Generated
    private MTLCommandBufferErrorOption() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long EncoderExecutionStatus = 0x0000000000000001L;
}
