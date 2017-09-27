package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class HMHomeHubState {
    @Generated
    private HMHomeHubState() {
    }

    @Generated @NUInt public static final long NotAvailable = 0x0000000000000000L;
    @Generated @NUInt public static final long Connected = 0x0000000000000001L;
    @Generated @NUInt public static final long Disconnected = 0x0000000000000002L;
}