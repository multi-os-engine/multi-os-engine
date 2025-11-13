package apple.devicediscoveryextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * ===========================================================================================================================
 * 
 * Device Support
 */
@Generated
public final class DDDeviceSupports {
    @Generated
    private DDDeviceSupports() {
    }

    @Generated @NUInt public static final long PairingLE = 0x0000000000000002L;
    /**
     * Device supports Bluetooth Low Energy pairing.
     */
    @Generated @NUInt public static final long TransportBridging = 0x0000000000000004L;
    /**
     * Device supports bring up of classic transport profiles when low energy transport for peripheral is connected.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long HID = 0x0000000000000008L;
}