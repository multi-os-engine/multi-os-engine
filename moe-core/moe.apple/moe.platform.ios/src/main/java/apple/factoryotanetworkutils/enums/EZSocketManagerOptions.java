package apple.factoryotanetworkutils.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class EZSocketManagerOptions {
    @Generated
    private EZSocketManagerOptions() {
    }

    /**
     * If set, the listen: method will not detach a thread to receive messages, i.e. becomes blocking
     */
    @Generated @NUInt public static final long EZSocketManagerReceiveUndetached = 0x0000000000000001L;
}