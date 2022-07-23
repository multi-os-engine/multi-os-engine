package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] MPSGraphOptions
 * <p>
 * Options to be utilized by the graph
 * <p>
 * [@constant] MPSGraphOptionsNone No Options
 * [@constant] MPSGraphOptionsSynchronizeResults Synchronize results using a blit encoder if on a GPU
 * [@constant] MPSGraphOptionsVerbose Prints more logging info
 */
@Generated
public final class MPSGraphOptions {
    @Generated
    private MPSGraphOptions() {
    }

    @Generated public static final long None = 0x0000000000000000L;
    @Generated public static final long SynchronizeResults = 0x0000000000000001L;
    @Generated public static final long Verbose = 0x0000000000000002L;
    @Generated public static final long Default = 0x0000000000000001L;
}
