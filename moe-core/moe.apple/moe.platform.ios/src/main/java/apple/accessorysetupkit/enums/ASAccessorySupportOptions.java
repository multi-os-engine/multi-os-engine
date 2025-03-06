package apple.accessorysetupkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * ---------------------------------------------------------------------------------------------------------------------------
 * 
 * Accessory Support Options
 */
@Generated
public final class ASAccessorySupportOptions {
    @Generated
    private ASAccessorySupportOptions() {
    }

    /**
     * Accessory supports Bluetooth Low Energy pairing.
     */
    @Generated @NUInt public static final long PairingLE = 0x0000000000000002L;
    /**
     * Accessory supports bring up of classic transport profiles when low energy transport for peripheral is connected.
     */
    @Generated @NUInt public static final long TransportBridging = 0x0000000000000004L;
}