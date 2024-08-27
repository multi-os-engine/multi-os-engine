package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 14.0
 */
@Generated
public final class MTLFunctionOptions {
    @Generated
    private MTLFunctionOptions() {
    }

    /**
     * Default usage
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Compiles the found function. This enables dynamic linking of this `MTLFunction`.
     * Only supported for `visible` functions.
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long CompileToBinary = 0x0000000000000001L;
    /**
     * stores and tracks this function in a MetalScript
     * This flag is optional and only supported in the context of binary archives.
     * 
     * This flag is required for inspecting and consuming binary archives with specialized MTLFunctions via the
     * metal-source tool. It is not required for recompilation, nor for storing functions in binary archives. Set this
     * flag only if you intend to use metal-source on a serialized binary archive.
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long StoreFunctionInMetalScript = 0x0000000000000002L;
}