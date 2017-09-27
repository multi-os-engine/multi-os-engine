package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class HMPresenceEventUserType {
    @Generated
    private HMPresenceEventUserType() {
    }

    @Generated @NUInt public static final long CurrentUser = 0x0000000000000001L;
    @Generated @NUInt public static final long HomeUsers = 0x0000000000000002L;
    @Generated @NUInt public static final long CustomUsers = 0x0000000000000003L;
}