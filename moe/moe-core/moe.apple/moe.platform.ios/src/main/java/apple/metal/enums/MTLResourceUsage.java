package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Describes how a resource will be used by a shader through an argument buffer
 */
@Generated
public final class MTLResourceUsage {
    @Generated
    private MTLResourceUsage() {
    }

    @Generated @NUInt public static final long Read = 0x0000000000000001L;
    @Generated @NUInt public static final long Write = 0x0000000000000002L;
    @Generated @NUInt public static final long Sample = 0x0000000000000004L;
}