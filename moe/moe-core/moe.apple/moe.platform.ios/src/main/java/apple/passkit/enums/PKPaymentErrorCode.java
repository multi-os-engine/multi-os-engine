package apple.passkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class PKPaymentErrorCode {
    @Generated
    private PKPaymentErrorCode() {
    }

    @Generated @NInt public static final long UnknownError = 0xFFFFFFFFFFFFFFFFL;
    @Generated @NInt public static final long ShippingContactInvalidError = 0x0000000000000001L;
    @Generated @NInt public static final long BillingContactInvalidError = 0x0000000000000002L;
    @Generated @NInt public static final long ShippingAddressUnserviceableError = 0x0000000000000003L;
}