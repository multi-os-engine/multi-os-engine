package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] MPSGraphLossReductionType
 * <p>
 * Options to be utilized by the graph
 * <p>
 * [@constant] MPSGraphLossReductionTypeAxis No Reductions
 * [@constant] MPSGraphLossReductionTypeSum ReduceSum down to a scalar
 * [@constant] MPSGraphLossReductionTypeMean ReduceMean down to a scalar
 */
@Generated
public final class MPSGraphLossReductionType {
    @Generated
    private MPSGraphLossReductionType() {
    }

    @Generated public static final long Axis = 0x0000000000000000L;
    @Generated public static final long Sum = 0x0000000000000001L;
    @Generated public static final long Mean = 0x0000000000000002L;
}
