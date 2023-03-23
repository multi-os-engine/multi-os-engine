package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] MPSGraphScatterMode
 * 
 * Scatter mode
 * 
 * [@constant] MPSGraphScatterModeAdd Add
 * [@constant] MPSGraphScatterModeSub Sub
 * [@constant] MPSGraphScatterModeMul Multiply
 * [@constant] MPSGraphScatterModeDiv Divide
 * [@constant] MPSGraphScatterModeMin Minimum
 * [@constant] MPSGraphScatterModeMax Maximum
 * [@constant] MPSGraphScatterModeSet Set
 */
@Generated
public final class MPSGraphScatterMode {
    @Generated
    private MPSGraphScatterMode() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Add = 0x0000000000000000L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Sub = 0x0000000000000001L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Mul = 0x0000000000000002L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Div = 0x0000000000000003L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Min = 0x0000000000000004L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Max = 0x0000000000000005L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Set = 0x0000000000000006L;
}
