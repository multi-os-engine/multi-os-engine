package apple.cryptotokenkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Enumerates all posible PIN justification types.
 */
@Generated
public final class TKSmartCardPINJustification {
    @Generated
    private TKSmartCardPINJustification() {
    }

    /**
     * Justify to the left.
     */
    @Generated @NInt public static final long Left = 0x0000000000000000L;
    /**
     * Justify to the right.
     */
    @Generated @NInt public static final long Right = 0x0000000000000001L;
}