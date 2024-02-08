package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Tensor Padding mode
 */
@Generated
public final class MPSGraphPaddingMode {
    @Generated
    private MPSGraphPaddingMode() {
    }

    /**
     * Constant
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Constant = 0x0000000000000000L;
    /**
     * Reflect
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Reflect = 0x0000000000000001L;
    /**
     * Symmetric
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Symmetric = 0x0000000000000002L;
    /**
     * ClampToEdge (PyTorch ReplicationPad)
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long ClampToEdge = 0x0000000000000003L;
    /**
     * Zero
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Zero = 0x0000000000000004L;
    /**
     * Periodic `x[-2] -> x[L-3], where L is size of x.`
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Periodic = 0x0000000000000005L;
    /**
     * Anti Periodic `x[-2] -> -x[L-3]`
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long AntiPeriodic = 0x0000000000000006L;
}
