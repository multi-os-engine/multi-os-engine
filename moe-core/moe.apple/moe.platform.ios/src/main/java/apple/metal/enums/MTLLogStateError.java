package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum]
 * 
 * NSErrors raised when creating a logstate.
 * 
 * API-Since: 18.0
 */
@Generated
public final class MTLLogStateError {
    @Generated
    private MTLLogStateError() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long InvalidSize = 0x0000000000000001L;
    /**
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long Invalid = 0x0000000000000002L;
}