package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Options for the MPSRayIntersector ray data type property
 */
@Generated
public final class MPSRayDataType {
    @Generated
    private MPSRayDataType() {
    }

    /**
     * Use the MPSRayOriginDirection struct type
     */
    @Generated @NUInt public static final long OriginDirection = 0x0000000000000000L;
    /**
     * Use the MPSRayOriginMinDistanceDirectionMaxDistance struct type
     */
    @Generated @NUInt public static final long OriginMinDistanceDirectionMaxDistance = 0x0000000000000001L;
    /**
     * Use the MPSRayOriginMaxDistanceDirectionMask struct type
     */
    @Generated @NUInt public static final long OriginMaskDirectionMaxDistance = 0x0000000000000002L;
    /**
     * Use the MPSPackedRayOriginDirection struct type
     */
    @Generated @NUInt public static final long PackedOriginDirection = 0x0000000000000003L;
}