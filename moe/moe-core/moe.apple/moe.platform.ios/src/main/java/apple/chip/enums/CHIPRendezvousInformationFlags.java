package apple.chip.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class CHIPRendezvousInformationFlags {
    @Generated
    private CHIPRendezvousInformationFlags() {
    }

    /**
     * Device does not support any method for rendezvous
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Device supports WiFi softAP
     */
    @Generated @NUInt public static final long SoftAP = 0x0000000000000001L;
    /**
     * Device supports BLE
     */
    @Generated @NUInt public static final long BLE = 0x0000000000000002L;
    /**
     * Device supports On Network setup
     */
    @Generated @NUInt public static final long OnNetwork = 0x0000000000000004L;
    @Generated @NUInt public static final long AllMask = 0x0000000000000007L;
}
