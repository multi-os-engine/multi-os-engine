package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Configures how the sampler aggregates contributing samples to a final value.
 * 
 * API-Since: 26.0
 */
@Generated
public final class MTLSamplerReductionMode {
    @Generated
    private MTLSamplerReductionMode() {
    }

    /**
     * A reduction mode that adds together the product of each contributing sample value by its weight.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long WeightedAverage = 0x0000000000000000L;
    /**
     * A reduction mode that finds the minimum contributing sample value by separately evaluating each channel.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long Minimum = 0x0000000000000001L;
    /**
     * A reduction mode that finds the maximum contributing sample value by separately evaluating each channel.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long Maximum = 0x0000000000000002L;
}