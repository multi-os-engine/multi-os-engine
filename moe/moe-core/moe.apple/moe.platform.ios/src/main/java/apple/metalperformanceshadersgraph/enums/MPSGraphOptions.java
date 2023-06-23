package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] MPSGraphOptions
 * 
 * Options to be utilized by the graph
 * 
 * [@constant] MPSGraphOptionsNone No Options
 * [@constant] MPSGraphOptionsSynchronizeResults Synchronize results using a blit encoder if on a GPU
 * [@constant] MPSGraphOptionsVerbose Prints more logging info
 */
@Generated
public final class MPSGraphOptions {
    @Generated
    private MPSGraphOptions() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 14.0
     */
    @Generated public static final long SynchronizeResults = 0x0000000000000001L;
    /**
     * API-Since: 14.0
     */
    @Generated public static final long Verbose = 0x0000000000000002L;
    /**
     * API-Since: 14.0
     */
    @Generated public static final long Default = 0x0000000000000001L;
}
