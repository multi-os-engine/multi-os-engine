package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class INSendPaymentCurrencyAmountUnsupportedReason {
    @Generated
    private INSendPaymentCurrencyAmountUnsupportedReason() {
    }

    @Generated @NInt public static final long AmountBelowMinimum = 0x0000000000000001L;
    @Generated @NInt public static final long AmountAboveMaximum = 0x0000000000000002L;
    @Generated @NInt public static final long CurrencyUnsupported = 0x0000000000000003L;
}