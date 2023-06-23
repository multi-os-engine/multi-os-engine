package apple.pushtotalk.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 16.0
 */
@Generated
public final class PTTransmissionMode {
    @Generated
    private PTTransmissionMode() {
    }

    /**
     * Users can transmit and receive simultaneously.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long FullDuplex = 0x0000000000000000L;
    /**
     * Users can transmit and receive but not simultaneously. This is the default value.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long HalfDuplex = 0x0000000000000001L;
    /**
     * User is able to receive only, transmit is not permitted.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long ListenOnly = 0x0000000000000002L;
}