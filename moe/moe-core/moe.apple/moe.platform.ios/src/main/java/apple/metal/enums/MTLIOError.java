package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Used by MTLIOFileHandle creation functions to indicate an error.
 * 
 * API-Since: 16.0
 */
@Generated
public final class MTLIOError {
    @Generated
    private MTLIOError() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long URLInvalid = 0x0000000000000001L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Internal = 0x0000000000000002L;
}