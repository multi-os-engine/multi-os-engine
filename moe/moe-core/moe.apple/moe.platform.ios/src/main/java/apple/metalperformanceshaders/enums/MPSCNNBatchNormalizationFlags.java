package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MPSCNNBatchNormalizationFlags {
    @Generated
    private MPSCNNBatchNormalizationFlags() {
    }

    @Generated @NUInt public static final long Default = 0x0000000000000000L;
    @Generated @NUInt public static final long CalculateStatisticsAutomatic = 0x0000000000000000L;
    @Generated @NUInt public static final long CalculateStatisticsAlways = 0x0000000000000001L;
    @Generated @NUInt public static final long CalculateStatisticsNever = 0x0000000000000002L;
    @Generated @NUInt public static final long CalculateStatisticsMask = 0x0000000000000003L;
}