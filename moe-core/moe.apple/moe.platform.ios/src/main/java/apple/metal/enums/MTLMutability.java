package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] MTLMutability
 * 
 * Specifies whether a buffer will be modified between the time it is bound and a compute
 * or render pipeline is executed in a draw or dispatch.
 * 
 * API-Since: 11.0
 */
@Generated
public final class MTLMutability {
    @Generated
    private MTLMutability() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Default = 0x0000000000000000L;
    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Mutable = 0x0000000000000001L;
    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Immutable = 0x0000000000000002L;
}
