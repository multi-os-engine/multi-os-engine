package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] MPSGraphPaddingMode
 * 
 * Tensor Padding mode
 * 
 * [@constant] MPSGraphPaddingModeConstant Constant
 * [@constant] MPSGraphPaddingModeReflect Reflect
 * [@constant] MPSGraphPaddingModeSymmetric Symmetric
 * [@constant] MPSGraphPaddingModeClampToEdge ClampToEdge (PyTorch ReplicationPad)
 * [@constant] MPSGraphPaddingModeZero Zero
 * [@constant] MPSGraphPaddingModePeriodic Periodic
 * [@constant] MPSGraphPaddingModeAntiPeriodic Anti Periodic
 */
@Generated
public final class MPSGraphPaddingMode {
    @Generated
    private MPSGraphPaddingMode() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Constant = 0x0000000000000000L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Reflect = 0x0000000000000001L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Symmetric = 0x0000000000000002L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long ClampToEdge = 0x0000000000000003L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Zero = 0x0000000000000004L;
    /**
     * x[-2] -> x[L-3], where L is size of x.
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Periodic = 0x0000000000000005L;
    /**
     * x[-2] -> -x[L-3]
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long AntiPeriodic = 0x0000000000000006L;
}
