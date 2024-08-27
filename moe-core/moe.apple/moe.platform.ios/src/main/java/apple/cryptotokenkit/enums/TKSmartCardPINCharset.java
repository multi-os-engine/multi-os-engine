package apple.cryptotokenkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Enumerates all possible PIN character sets.
 */
@Generated
public final class TKSmartCardPINCharset {
    @Generated
    private TKSmartCardPINCharset() {
    }

    /**
     * PIN is only composed of digits.
     */
    @Generated @NInt public static final long Numeric = 0x0000000000000000L;
    /**
     * PIN can be composed of digits and letters.
     */
    @Generated @NInt public static final long Alphanumeric = 0x0000000000000001L;
    /**
     * PIN can be composed of digits and uppercase letters.
     */
    @Generated @NInt public static final long UpperAlphanumeric = 0x0000000000000002L;
}