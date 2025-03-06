package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * A bitfield of options to create a stitched library
 * 
 * API-Since: 18.0
 */
@Generated
public final class MTLStitchedLibraryOptions {
    @Generated
    private MTLStitchedLibraryOptions() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Library creation fails (i.e nil is returned) if:
     * - A lookup binary archive has been specified
     * - The library has not been found in the archive
     * 
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long FailOnBinaryArchiveMiss = 0x0000000000000001L;
    /**
     * stores and tracks this library in a Metal Pipelines Script
     * This flag is optional and only supported in the context of binary archives.
     * 
     * This flag is required for inspecting and consuming binary archives with stitched libraries via the metal-source
     * tool. It is not required for recompilation, nor for storing stitched libraries in binary archives. Set this flag
     * only if you intend to use metal-source on a serialized binary archive.
     * 
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long StoreLibraryInMetalPipelinesScript = 0x0000000000000002L;
}