package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * @brief Intersection data type options
 */
@Generated
public final class MPSIntersectionDataType {
    @Generated
    private MPSIntersectionDataType() {
    }

    /**
     * @brief Use the MPSIntersectionDistance struct type
     */
    @Generated @NUInt public static final long Distance = 0x0000000000000000L;
    /**
     * @brief Use the MPSIntersectionDistancePrimitiveIndex struct type
     */
    @Generated @NUInt public static final long DistancePrimitiveIndex = 0x0000000000000001L;
    /**
     * @brief Use the MPSIntersectionDistancePrimitiveIndexCoordinates struct type
     */
    @Generated @NUInt public static final long DistancePrimitiveIndexCoordinates = 0x0000000000000002L;
    /**
     * @brief Use the DistancePrimitiveIndexInstanceIndex struct type
     */
    @Generated @NUInt public static final long DistancePrimitiveIndexInstanceIndex = 0x0000000000000003L;
    /**
     * @brief Use the DistancePrimitiveIndexInstanceIndexCoordinates struct type
     */
    @Generated @NUInt public static final long DistancePrimitiveIndexInstanceIndexCoordinates = 0x0000000000000004L;
}