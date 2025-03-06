package apple.accelerate.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class BNNSFilterType {
    @Generated
    private BNNSFilterType() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated public static final int Convolution = 0x00000000;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int FullyConnected = 0x00000001;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int BatchNorm = 0x00000002;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int InstanceNorm = 0x00000003;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int LayerNorm = 0x00000004;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int GroupNorm = 0x00000005;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int TransposedConvolution = 0x00000006;
    /**
     * API-Since: 15.0
     */
    @Generated public static final int Quantization = 0x00000007;
    /**
     * API-Since: 15.0
     */
    @Generated public static final int Arithmetic = 0x00000008;
}
