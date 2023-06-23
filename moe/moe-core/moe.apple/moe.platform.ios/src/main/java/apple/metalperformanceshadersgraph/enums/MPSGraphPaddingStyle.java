package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@typedef] MPSGraphPaddingStyle
 * 
 * Tensor Layout
 * 
 * [@constant] MPSGraphPaddingStyleExplicit Explicit
 * [@constant] MPSGraphPaddingStyleONNX_SAME_LOWER ONNX_SAME_LOWER
 * [@constant] MPSGraphPaddingStyleTF_SAME TF_SAME
 * [@constant] MPSGraphPaddingStyleTF_VALID TF_VALID
 * [@constant] MPSGraphPaddingStyleExplicitOffset Explicit offsets
 */
@Generated
public final class MPSGraphPaddingStyle {
    @Generated
    private MPSGraphPaddingStyle() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long Explicit = 0x0000000000000000L;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long TF_VALID = 0x0000000000000001L;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long TF_SAME = 0x0000000000000002L;
    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long ExplicitOffset = 0x0000000000000003L;
    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long ONNX_SAME_LOWER = 0x0000000000000004L;
}
