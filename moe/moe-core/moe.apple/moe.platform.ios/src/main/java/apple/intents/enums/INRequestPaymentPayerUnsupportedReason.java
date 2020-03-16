package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class INRequestPaymentPayerUnsupportedReason {
    @Generated
    private INRequestPaymentPayerUnsupportedReason() {
    }

    @Generated @NInt public static final long CredentialsUnverified = 0x0000000000000001L;
    @Generated @NInt public static final long NoAccount = 0x0000000000000002L;
    @Generated @NInt public static final long NoValidHandle = 0x0000000000000003L;
}