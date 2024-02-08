package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * The scaling modes for Fourier transform operations.
 */
@Generated
public final class MPSGraphFFTScalingMode {
    @Generated
    private MPSGraphFFTScalingMode() {
    }

    /**
     * Computes the FFT result with no scaling.
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Scales the FFT result with reciprocal of the total FFT size over all transformed dimensions.
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long Size = 0x0000000000000001L;
    /**
     * Scales the FFT result with reciprocal square root of the total FFT size over all transformed dimensions,
     * resulting in signal strength conserving transformation.
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long Unitary = 0x0000000000000002L;
}