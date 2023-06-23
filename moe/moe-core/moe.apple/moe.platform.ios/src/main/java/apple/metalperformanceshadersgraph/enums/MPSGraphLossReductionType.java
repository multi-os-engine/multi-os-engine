package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] MPSGraphLossReductionType
 * 
 * Options to be utilized by the graph
 * 
 * [@constant] MPSGraphLossReductionTypeAxis No Reductions
 * [@constant] MPSGraphLossReductionTypeSum ReduceSum down to a scalar
 * [@constant] MPSGraphLossReductionTypeMean ReduceMean down to a scalar
 */
@Generated
public final class MPSGraphLossReductionType {
    @Generated
    private MPSGraphLossReductionType() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated public static final long Axis = 0x0000000000000000L;
    /**
     * API-Since: 14.0
     */
    @Generated public static final long Sum = 0x0000000000000001L;
    /**
     * API-Since: 15.0
     */
    @Generated public static final long Mean = 0x0000000000000002L;
}
