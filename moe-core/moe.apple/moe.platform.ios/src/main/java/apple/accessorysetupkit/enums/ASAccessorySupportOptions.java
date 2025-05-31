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
     * The accessory supports Bluetooth Low Energy pairing.
     */
    @Generated @NUInt public static final long PairingLE = 0x0000000000000002L;
    /**
     * The accessory supports bridging to Bluetooth classic transport.
     * 
     * This option indicates that when connecting with low energy transport, the accessory supports activating Bluetooth
     * classic transport profiles.
     */
    @Generated @NUInt public static final long TransportBridging = 0x0000000000000004L;
    /**
     * The accessory supports Bluetooth Low Energy HID service.
     * 
     * API-Since: 18.4
     */
    @Generated @NUInt public static final long HID = 0x0000000000000008L;
}