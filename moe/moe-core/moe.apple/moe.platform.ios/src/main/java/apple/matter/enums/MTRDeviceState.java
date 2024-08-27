package apple.matter.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MTRDeviceState {
    @Generated
    private MTRDeviceState() {
    }

    @Generated @NUInt public static final long Unknown = 0x0000000000000000L;
    @Generated @NUInt public static final long Reachable = 0x0000000000000001L;
    @Generated @NUInt public static final long Unreachable = 0x0000000000000002L;
}