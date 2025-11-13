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
     * stores and tracks this function in a Metal Pipelines Script
     * This flag is optional and only supported in the context of binary archives.
     * 
     * This flag is required for inspecting and consuming binary archives with specialized MTLFunctions via the
     * metal-source tool. It is not required for recompilation, nor for storing functions in binary archives. Set this
     * flag only if you intend to use metal-source on a serialized binary archive.
     * 
     * API-Since: 17.0
     * Deprecated-Since: 18.0
     */
    @Deprecated @Generated @NUInt public static final long StoreFunctionInMetalScript = 0x0000000000000002L;
    /**
     * stores and tracks this function in a Metal Pipelines Script
     * This flag is optional and only supported in the context of binary archives.
     * 
     * This flag is required for inspecting and consuming binary archives with specialized MTLFunctions via the
     * metal-source tool. It is not required for recompilation, nor for storing functions in binary archives. Set this
     * flag only if you intend to use metal-source on a serialized binary archive.
     * 
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long StoreFunctionInMetalPipelinesScript = 0x0000000000000002L;
    /**
     * Function creation fails (i.e nil is returned) if:
     * - A lookup binary archive has been specified
     * - The function has not been found in the archive
     * 
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long FailOnBinaryArchiveMiss = 0x0000000000000004L;
    /**
     * Compiles the function to have its function handles return a constant MTLResourceID across
     * all pipeline states. The function needs to be linked to the pipeline that will use this function.
     * This function option can only be used for functions that are compiled with `MTLFunctionOptionCompileToBinary`.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long PipelineIndependent = 0x0000000000000008L;
}