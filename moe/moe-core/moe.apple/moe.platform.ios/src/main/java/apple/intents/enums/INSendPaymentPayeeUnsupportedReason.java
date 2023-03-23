package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 11.0
 */
@Generated
public final class INSendPaymentPayeeUnsupportedReason {
    @Generated
    private INSendPaymentPayeeUnsupportedReason() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long CredentialsUnverified = 0x0000000000000001L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long InsufficientFunds = 0x0000000000000002L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long NoAccount = 0x0000000000000003L;
    /**
     * API-Since: 11.1
     */
    @Generated @NInt public static final long NoValidHandle = 0x0000000000000004L;
}