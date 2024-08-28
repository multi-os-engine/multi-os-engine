package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 14.0
 */
@Generated
public final class MTLAccelerationStructureUsage {
    @Generated
    private MTLAccelerationStructureUsage() {
    }

    /**
     * Default usage
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Enable refitting for this acceleration structure. Note that this may reduce
     * acceleration structure quality.
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long Refit = 0x0000000000000001L;
    /**
     * Prefer building this acceleration structure quickly at the cost of reduced ray
     * tracing performance.
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long PreferFastBuild = 0x0000000000000002L;
    /**
     * Enable extended limits for this acceleration structure, possibly at the cost of
     * reduced ray tracing performance.
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long ExtendedLimits = 0x0000000000000004L;
}
