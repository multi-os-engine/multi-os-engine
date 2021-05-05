package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MPSCNNBinaryConvolutionType {
    @Generated
    private MPSCNNBinaryConvolutionType() {
    }

    /**
     * Otherwise a normal convolution operation, except that the weights are binary values
     */
    @Generated @NUInt public static final long BinaryWeights = 0x0000000000000000L;
    /**
     * Use input image binarization and the XNOR-operation to perform the actual convolution - See MPSCNNBinaryConvolution for details
     */
    @Generated @NUInt public static final long XNOR = 0x0000000000000001L;
    /**
     * Use input image binarization and the AND-operation to perform the actual convolution - See MPSCNNBinaryConvolution for details
     */
    @Generated @NUInt public static final long AND = 0x0000000000000002L;
}