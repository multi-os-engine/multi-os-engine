package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class HMPresenceEventType {
    @Generated
    private HMPresenceEventType() {
    }

    @Generated @NUInt public static final long EveryEntry = 0x0000000000000001L;
    @Generated @NUInt public static final long EveryExit = 0x0000000000000002L;
    @Generated @NUInt public static final long FirstEntry = 0x0000000000000003L;
    @Generated @NUInt public static final long LastExit = 0x0000000000000004L;
    @Generated @NUInt public static final long AtHome = 0x0000000000000003L;
    @Generated @NUInt public static final long NotAtHome = 0x0000000000000004L;
}