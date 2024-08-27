package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Tensor Layout
 */
@Generated
public final class MPSGraphPaddingStyle {
    @Generated
    private MPSGraphPaddingStyle() {
    }

    /**
     * Explicit
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long Explicit = 0x0000000000000000L;
    /**
     * ONNX_SAME_LOWER
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long TF_VALID = 0x0000000000000001L;
    /**
     * TF_SAME
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long TF_SAME = 0x0000000000000002L;
    /**
     * TF_VALID
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long ExplicitOffset = 0x0000000000000003L;
    /**
     * Explicit offsets
     * 
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long ONNX_SAME_LOWER = 0x0000000000000004L;
}
