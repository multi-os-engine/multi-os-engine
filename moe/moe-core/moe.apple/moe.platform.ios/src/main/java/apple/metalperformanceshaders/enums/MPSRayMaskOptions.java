package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Options for the MPSRayIntersector ray mask options property
 * 
 * API-Since: 12.0
 */
@Generated
public final class MPSRayMaskOptions {
    @Generated
    private MPSRayMaskOptions() {
    }

    /**
     * Disable primitive and instance masks
     * 
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Enable primitive masks
     * 
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long Primitive = 0x0000000000000001L;
    /**
     * Enable instance masks
     * 
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long Instance = 0x0000000000000002L;
}