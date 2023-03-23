package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@typedef] MPSGraphStencilReductionMode
 * 
 * Reduction Mode
 * 
 * [@constant] MPSGraphReductionModeMin Min
 * [@constant] MPSGraphReductionModeMax Max
 * [@constant] MPSGraphReductionModeSum Sum
 * [@constant] MPSGraphReductionModeProduct Product
 * [@constant] MPSGraphReductionModeArgumentMin Argument Min
 * [@constant] MPSGraphReductionModeArgumentMax Argument Max
 */
@Generated
public final class MPSGraphReductionMode {
    @Generated
    private MPSGraphReductionMode() {
    }

    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long Min = 0x0000000000000000L;
    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long Max = 0x0000000000000001L;
    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long Sum = 0x0000000000000002L;
    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long Product = 0x0000000000000003L;
    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long ArgumentMin = 0x0000000000000004L;
    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long ArgumentMax = 0x0000000000000005L;
}
