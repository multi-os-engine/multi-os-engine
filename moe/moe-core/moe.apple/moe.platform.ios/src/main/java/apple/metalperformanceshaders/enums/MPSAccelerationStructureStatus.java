package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * @brief Possible values of the acceleration structure status property
 */
@Generated
public final class MPSAccelerationStructureStatus {
    @Generated
    private MPSAccelerationStructureStatus() {
    }

    /**
     * @brief The acceleration structure has not been built yet
     */
    @Generated @NUInt public static final long Unbuilt = 0x0000000000000000L;
    /**
     * @brief The acceleration structure has finished building
     */
    @Generated @NUInt public static final long Built = 0x0000000000000001L;
}