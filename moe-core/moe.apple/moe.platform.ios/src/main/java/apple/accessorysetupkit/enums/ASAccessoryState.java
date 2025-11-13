package apple.accessorysetupkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * ---------------------------------------------------------------------------------------------------------------------------
 * A type that defines values for the state of an accessory.
 */
@Generated
public final class ASAccessoryState {
    @Generated
    private ASAccessoryState() {
    }

    /**
     * The accessory is invalid or unauthorized.
     */
    @Generated @NInt public static final long Unauthorized = 0x0000000000000000L;
    /**
     * The accessory is selected, but full authorization is still pending.
     */
    @Generated @NInt public static final long AwaitingAuthorization = 0x000000000000000AL;
    /**
     * The accessory is authorized and available.
     */
    @Generated @NInt public static final long Authorized = 0x0000000000000014L;
}