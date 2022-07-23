package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MPSCNNBatchNormalizationFlags {
    @Generated
    private MPSCNNBatchNormalizationFlags() {
    }

    /**
     * Default Settings
     */
    @Generated @NUInt public static final long Default = 0x0000000000000000L;
    /**
     * Statistics are calculated if another node consumes the gradient node (training). The data source is used
     * otherwise.
     */
    @Generated @NUInt public static final long CalculateStatisticsAutomatic = 0x0000000000000000L;
    /**
     * Statistics are calculated always
     */
    @Generated @NUInt public static final long CalculateStatisticsAlways = 0x0000000000000001L;
    /**
     * Statistics are never calculated. Predefined values from the data source are used instead
     */
    @Generated @NUInt public static final long CalculateStatisticsNever = 0x0000000000000002L;
    /**
     * Bits used for MPSCNNBatchNormalizationFlagsCalculateStatistics
     */
    @Generated @NUInt public static final long CalculateStatisticsMask = 0x0000000000000003L;
}