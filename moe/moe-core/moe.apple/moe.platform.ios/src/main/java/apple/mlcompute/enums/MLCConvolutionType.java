package apple.mlcompute.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum]       MLCConvolutionType
 * <p>
 * A convolution type that you specify for a convolution descriptor.
 */
@Generated
public final class MLCConvolutionType {
    @Generated
    private MLCConvolutionType() {
    }

    /**
     * The standard convolution type.
     */
    @Generated public static final int Standard = 0x00000000;
    /**
     * The transposed convolution type.
     */
    @Generated public static final int Transposed = 0x00000001;
    /**
     * The depthwise convolution type.
     */
    @Generated public static final int Depthwise = 0x00000002;
}
