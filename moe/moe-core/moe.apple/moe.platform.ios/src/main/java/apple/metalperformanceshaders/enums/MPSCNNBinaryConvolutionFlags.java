package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MPSCNNBinaryConvolutionFlags {
    @Generated
    private MPSCNNBinaryConvolutionFlags() {
    }

    /**
     * Use default in binary convolution options
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Scale the binary convolution operation using the beta-image option as detailed in MPSCNNBinaryConvolution
     */
    @Generated @NUInt public static final long UseBetaScaling = 0x0000000000000001L;
}