package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MTLFunctionOptions {
    @Generated
    private MTLFunctionOptions() {
    }

    /**
     * Default usage
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Compiles the found function. This enables dynamic linking of this `MTLFunction`.
     * Only supported for `visible` functions.
     */
    @Generated @NUInt public static final long CompileToBinary = 0x0000000000000001L;
}