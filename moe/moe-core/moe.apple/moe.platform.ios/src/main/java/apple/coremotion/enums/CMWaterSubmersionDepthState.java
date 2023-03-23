package apple.coremotion.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class CMWaterSubmersionDepthState {
    @Generated
    private CMWaterSubmersionDepthState() {
    }

    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    @Generated @NInt public static final long NotSubmerged = 0x0000000000000064L;
    @Generated @NInt public static final long SubmergedShallow = 0x00000000000000C8L;
    @Generated @NInt public static final long SubmergedDeep = 0x000000000000012CL;
    @Generated @NInt public static final long ApproachingMaxDepth = 0x0000000000000190L;
    @Generated @NInt public static final long PastMaxDepth = 0x00000000000001F4L;
    @Generated @NInt public static final long SensorDepthError = 0x0000000000000258L;
}