package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The error codes that Metal can raise when you create a tensor.
 * 
 * API-Since: 26.0
 */
@Generated
public final class MTLTensorError {
    @Generated
    private MTLTensorError() {
    }

    /**
     * API-Since: 26.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 26.0
     */
    @Generated @NInt public static final long InternalError = 0x0000000000000001L;
    /**
     * API-Since: 26.0
     */
    @Generated @NInt public static final long InvalidDescriptor = 0x0000000000000002L;
}