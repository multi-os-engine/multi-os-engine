package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Intersection data type options
 */
@Generated
public final class MPSIntersectionDataType {
    @Generated
    private MPSIntersectionDataType() {
    }

    /**
     * Use the MPSIntersectionDistance struct type
     */
    @Generated @NUInt public static final long Distance = 0x0000000000000000L;
    /**
     * Use the MPSIntersectionDistancePrimitiveIndex struct type
     */
    @Generated @NUInt public static final long DistancePrimitiveIndex = 0x0000000000000001L;
    /**
     * Use the MPSIntersectionDistancePrimitiveIndexCoordinates struct type
     */
    @Generated @NUInt public static final long DistancePrimitiveIndexCoordinates = 0x0000000000000002L;
    /**
     * Use the DistancePrimitiveIndexInstanceIndex struct type
     */
    @Generated @NUInt public static final long DistancePrimitiveIndexInstanceIndex = 0x0000000000000003L;
    /**
     * Use the DistancePrimitiveIndexInstanceIndexCoordinates struct type
     */
    @Generated @NUInt public static final long DistancePrimitiveIndexInstanceIndexCoordinates = 0x0000000000000004L;
    /**
     * Use the MPSIntersectionDistancePrimitiveIndexBufferIndex struct type
     */
    @Generated @NUInt public static final long DistancePrimitiveIndexBufferIndex = 0x0000000000000005L;
    /**
     * Use the MPSIntersectionDistancePrimitiveIndexBufferIndexCoordinates struct type
     */
    @Generated @NUInt public static final long DistancePrimitiveIndexBufferIndexCoordinates = 0x0000000000000006L;
    /**
     * Use the DistancePrimitiveIndexBufferIndexInstanceIndex struct type
     */
    @Generated @NUInt public static final long DistancePrimitiveIndexBufferIndexInstanceIndex = 0x0000000000000007L;
    /**
     * Use the DistancePrimitiveIndexBufferIndexInstanceIndexCoordinates struct type
     */
    @Generated @NUInt public static final long DistancePrimitiveIndexBufferIndexInstanceIndexCoordinates = 0x0000000000000008L;
}
