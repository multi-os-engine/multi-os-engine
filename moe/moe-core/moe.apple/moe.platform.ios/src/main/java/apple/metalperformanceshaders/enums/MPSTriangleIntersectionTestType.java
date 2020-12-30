package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * @brief Options for the MPSRayIntersector triangle intersection test type property
 */
@Generated
public final class MPSTriangleIntersectionTestType {
    @Generated
    private MPSTriangleIntersectionTestType() {
    }

    /**
     * @brief Use the default ray/triangle intersection test
     */
    @Generated @NUInt public static final long Default = 0x0000000000000000L;
    /**
     * @brief Use a watertight ray/triangle intersection test which avoids gaps along shared
     * triangle edges. Shared vertices may still have gaps. This intersection test may be slower
     * than MPSTriangleIntersectionTestTypeDefault.
     */
    @Generated @NUInt public static final long Watertight = 0x0000000000000001L;
}