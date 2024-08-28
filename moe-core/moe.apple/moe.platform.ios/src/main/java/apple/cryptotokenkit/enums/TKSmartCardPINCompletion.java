package apple.cryptotokenkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Bitmask specifying condition(s) under which PIN entry should be considered complete.
 */
@Generated
public final class TKSmartCardPINCompletion {
    @Generated
    private TKSmartCardPINCompletion() {
    }

    /**
     * Completion by reaching the maximum PIN length.
     */
    @Generated @NUInt public static final long MaxLength = 0x0000000000000001L;
    /**
     * Completion by pressing the validation key.
     */
    @Generated @NUInt public static final long Key = 0x0000000000000002L;
    /**
     * Completion by timeout expiration.
     */
    @Generated @NUInt public static final long Timeout = 0x0000000000000004L;
}