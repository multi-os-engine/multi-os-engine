package apple.cryptotokenkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Enumerates all possible PIN encoding types.
 */
@Generated
public final class TKSmartCardPINEncoding {
    @Generated
    private TKSmartCardPINEncoding() {
    }

    /**
     * Characters are encoded in Binary format (1234 => 01h 02h 03h 04h).
     */
    @Generated @NInt public static final long Binary = 0x0000000000000000L;
    /**
     * Characters are encoded in ASCII format (1234 => 31h 32h 33h 34h).
     */
    @Generated @NInt public static final long ASCII = 0x0000000000000001L;
    /**
     * Characters (only digits) are encoded in BCD format (1234 => 12h 34h).
     */
    @Generated @NInt public static final long BCD = 0x0000000000000002L;
}