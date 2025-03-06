package apple.accessorysetupkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * ---------------------------------------------------------------------------------------------------------------------------
 * 
 * Authorized Accessory State
 */
@Generated
public final class ASAccessoryState {
    @Generated
    private ASAccessoryState() {
    }

    /**
     * Invalid or Unauthorized Accessory.
     */
    @Generated @NInt public static final long Unauthorized = 0x0000000000000000L;
    /**
     * Selected by user but pending for full authorization.
     */
    @Generated @NInt public static final long AwaitingAuthorization = 0x000000000000000AL;
    /**
     * Authorized and available Accessory.
     */
    @Generated @NInt public static final long Authorized = 0x0000000000000014L;
}