package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * MPSGraph could use these reduced precision paths to deliver faster math, but it is not guaranteed.
 * 
 * API-Since: 26.0
 */
@Generated
public final class MPSGraphReducedPrecisionFastMath {
    @Generated
    private MPSGraphReducedPrecisionFastMath() {
    }

    /**
     * Full precision math with maximum accuracy.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Execute winograd transform intermediate as FP16.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long AllowFP16Conv2DWinogradTransformIntermediate = 0x0000000000000002L;
    /**
     * Curated list allowing intermediates for multi-pass GPU kernels to be FP16.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long AllowFP16Intermediates = 0x0000000000000002L;
    /**
     * Default selection.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long Default = 0x0000000000000000L;
}