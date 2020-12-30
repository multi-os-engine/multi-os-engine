package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * @brief Options for the MPSRayIntersector ray mask options property
 */
@Generated
public final class MPSRayMaskOptions {
    @Generated
    private MPSRayMaskOptions() {
    }

    /**
     * @brief Disable primitive and instance masks
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * @brief Enable primitive masks
     */
    @Generated @NUInt public static final long Primitive = 0x0000000000000001L;
    /**
     * @brief Enable instance masks
     */
    @Generated @NUInt public static final long Instance = 0x0000000000000002L;
}