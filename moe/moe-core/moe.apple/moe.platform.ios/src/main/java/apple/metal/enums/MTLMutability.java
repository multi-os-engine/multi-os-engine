package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * @enum MTLMutability
 * @abstract Specifies whether a buffer will be modified between the time it is bound and a compute
 * or render pipeline is executed in a draw or dispatch.
 */
@Generated
public final class MTLMutability {
    @Generated
    private MTLMutability() {
    }

    @Generated @NUInt public static final long Default = 0x0000000000000000L;
    @Generated @NUInt public static final long Mutable = 0x0000000000000001L;
    @Generated @NUInt public static final long Immutable = 0x0000000000000002L;
}