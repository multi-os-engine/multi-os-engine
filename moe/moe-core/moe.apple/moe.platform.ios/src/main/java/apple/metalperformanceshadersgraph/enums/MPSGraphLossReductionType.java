package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;

/**
 * The type of the reduction MPSGraph applies in the loss operations.
 */
@Generated
public final class MPSGraphLossReductionType {
    @Generated
    private MPSGraphLossReductionType() {
    }

    /**
     * Computes the loss without reduction.
     * 
     * API-Since: 14.0
     */
    @Generated public static final long Axis = 0x0000000000000000L;
    /**
     * Reduces the loss down to a scalar with a sum operation.
     * 
     * API-Since: 14.0
     */
    @Generated public static final long Sum = 0x0000000000000001L;
    /**
     * Reduces the loss down to a scalar with a mean operation.
     * 
     * API-Since: 15.0
     */
    @Generated public static final long Mean = 0x0000000000000002L;
    /**
     * Computes the loss without reduction.
     * 
     * API-Since: 17.0
     */
    @Generated public static final long None = 0x0000000000000000L;
}
