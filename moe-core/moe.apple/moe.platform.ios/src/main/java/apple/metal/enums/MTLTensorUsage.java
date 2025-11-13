package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * The type that represents the different contexts for a tensor.
 * 
 * API-Since: 26.0
 */
@Generated
public final class MTLTensorUsage {
    @Generated
    private MTLTensorUsage() {
    }

    /**
     * A tensor context that applies to compute encoders.
     * 
     * You can use tensors with this context in ``MTL4ComputeCommandEncoder`` or ``MTLComputeCommandEncoder`` instances.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long Compute = 0x0000000000000001L;
    /**
     * A tensor context that applies to render encoders.
     * 
     * You can use tensors with this context in ``MTL4RenderCommandEncoder`` or ``MTLRenderCommandEncoder`` instances.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long Render = 0x0000000000000002L;
    /**
     * A tensor context that applies to machine learning encoders.
     * 
     * You can use tensors with this context in ``MTL4MachineLearningCommandEncoder`` instances.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long MachineLearning = 0x0000000000000004L;
}