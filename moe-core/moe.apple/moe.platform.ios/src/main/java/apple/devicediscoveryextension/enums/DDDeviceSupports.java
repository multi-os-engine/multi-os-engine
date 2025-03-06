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
}