package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MTLAccelerationStructureUsage {
    @Generated
    private MTLAccelerationStructureUsage() {
    }

    /**
     * @brief Default usage
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * @brief Enable refitting for this acceleration structure. Note that this may reduce
     * acceleration structure quality.
     */
    @Generated @NUInt public static final long Refit = 0x0000000000000001L;
    /**
     * @brief Prefer building this acceleration structure quickly at the cost of reduced ray
     * tracing performance.
     */
    @Generated @NUInt public static final long PreferFastBuild = 0x0000000000000002L;
}