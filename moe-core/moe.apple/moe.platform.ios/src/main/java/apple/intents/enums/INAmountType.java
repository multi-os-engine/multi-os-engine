package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 10.3
 */
@Generated
public final class INAmountType {
    @Generated
    private INAmountType() {
    }

    /**
     * API-Since: 10.3
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * API-Since: 10.3
     */
    @Generated @NInt public static final long MinimumDue = 0x0000000000000001L;
    /**
     * API-Since: 10.3
     */
    @Generated @NInt public static final long AmountDue = 0x0000000000000002L;
    /**
     * API-Since: 10.3
     */
    @Generated @NInt public static final long CurrentBalance = 0x0000000000000003L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long MaximumTransferAmount = 0x0000000000000004L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long MinimumTransferAmount = 0x0000000000000005L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long StatementBalance = 0x0000000000000006L;
}