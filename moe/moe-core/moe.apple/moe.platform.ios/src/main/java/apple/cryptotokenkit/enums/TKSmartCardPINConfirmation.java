package apple.cryptotokenkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Bitmask specifying whether PIN confirmation should be requested.
 */
@Generated
public final class TKSmartCardPINConfirmation {
    @Generated
    private TKSmartCardPINConfirmation() {
    }

    /**
     * No confirmation requested.
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Confirmation (entry) of the new PIN requested.
     */
    @Generated @NUInt public static final long New = 0x0000000000000001L;
    /**
     * Confirmation (entry) of the current PIN requested.
     */
    @Generated @NUInt public static final long Current = 0x0000000000000002L;
}