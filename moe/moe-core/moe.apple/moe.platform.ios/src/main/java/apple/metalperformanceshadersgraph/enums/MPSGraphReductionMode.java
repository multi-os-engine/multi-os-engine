package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Reduction Mode
 */
@Generated
public final class MPSGraphReductionMode {
    @Generated
    private MPSGraphReductionMode() {
    }

    /**
     * Min
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long Min = 0x0000000000000000L;
    /**
     * Max
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long Max = 0x0000000000000001L;
    /**
     * Sum
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long Sum = 0x0000000000000002L;
    /**
     * Product
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long Product = 0x0000000000000003L;
    /**
     * Argument Min
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long ArgumentMin = 0x0000000000000004L;
    /**
     * Argument Max
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long ArgumentMax = 0x0000000000000005L;
}
