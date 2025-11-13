package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Options for configuring the creation of binary functions.
 * 
 * API-Since: 26.0
 */
@Generated
public final class MTL4BinaryFunctionOptions {
    @Generated
    private MTL4BinaryFunctionOptions() {
    }

    /**
     * Represents the default value: no options.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Compiles the function to have its function handles return a constant MTLResourceID across
     * all pipeline states. The function needs to be linked to the pipeline that will use this function.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long PipelineIndependent = 0x0000000000000002L;
}