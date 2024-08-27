package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MPSNNConvolutionAccumulatorPrecisionOption {
    @Generated
    private MPSNNConvolutionAccumulatorPrecisionOption() {
    }

    /**
     * Set accumulator type to half precision float.
     * 
     * API-Since: 11.3
     */
    @Generated @NUInt public static final long Half = 0x0000000000000000L;
    /**
     * Set accumulator type to single precision float.
     * 
     * API-Since: 11.3
     */
    @Generated @NUInt public static final long Float = 0x0000000000000001L;
}