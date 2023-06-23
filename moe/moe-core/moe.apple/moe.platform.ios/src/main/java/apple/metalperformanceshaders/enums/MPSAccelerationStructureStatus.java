package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Possible values of the acceleration structure status property
 * 
 * API-Since: 12.0
 */
@Generated
public final class MPSAccelerationStructureStatus {
    @Generated
    private MPSAccelerationStructureStatus() {
    }

    /**
     * The acceleration structure has not been built yet
     * 
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long Unbuilt = 0x0000000000000000L;
    /**
     * The acceleration structure has finished building
     * 
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long Built = 0x0000000000000001L;
}