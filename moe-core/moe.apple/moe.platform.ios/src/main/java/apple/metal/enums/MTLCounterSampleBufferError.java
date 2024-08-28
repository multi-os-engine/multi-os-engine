package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] MTLCounterSampleBufferError
 * [@constant] MTLCounterSampleBufferErrorOutOfMemory
 * There wasn't enough memory available to allocate the counter sample buffer.
 * 
 * [@constant] MTLCounterSampleBufferErrorInvalid
 * Invalid parameter passed while creating counter sample buffer.
 * 
 * [@constant] MTLCounterSampleBufferErrorInternal
 * There was some other error in allocating the counter sample buffer.
 * 
 * API-Since: 14.0
 */
@Generated
public final class MTLCounterSampleBufferError {
    @Generated
    private MTLCounterSampleBufferError() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long OutOfMemory = 0x0000000000000000L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Invalid = 0x0000000000000001L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Internal = 0x0000000000000002L;
}
