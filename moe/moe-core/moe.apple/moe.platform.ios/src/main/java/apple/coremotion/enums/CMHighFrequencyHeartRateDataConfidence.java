package apple.coremotion.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * CMHighFrequencyHeartRateDataConfidence
 * Confidence categories for heart rate values.
 * 
 * API-Since: 17.0
 */
@Generated
public final class CMHighFrequencyHeartRateDataConfidence {
    @Generated
    private CMHighFrequencyHeartRateDataConfidence() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Low = 0x0000000000000000L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Medium = 0x0000000000000001L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long High = 0x0000000000000002L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Highest = 0x0000000000000003L;
}