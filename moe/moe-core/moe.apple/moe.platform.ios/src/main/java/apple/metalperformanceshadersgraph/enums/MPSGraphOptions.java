package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;

/**
 * The options available to a graph.
 */
@Generated
public final class MPSGraphOptions {
    @Generated
    private MPSGraphOptions() {
    }

    /**
     * No Options.
     * 
     * API-Since: 14.0
     */
    @Generated public static final long None = 0x0000000000000000L;
    /**
     * The graph synchronizes results to the CPU using a blit encoder if on a discrete GPU at the end of execution.
     * 
     * API-Since: 14.0
     */
    @Generated public static final long SynchronizeResults = 0x0000000000000001L;
    /**
     * The framework prints more logging info.
     * 
     * API-Since: 14.0
     */
    @Generated public static final long Verbose = 0x0000000000000002L;
    /**
     * The framework uses these options as default if not overriden.
     * 
     * API-Since: 14.0
     */
    @Generated public static final long Default = 0x0000000000000001L;
}
