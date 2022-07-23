package apple.passkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class PKPaymentErrorCode {
    @Generated
    private PKPaymentErrorCode() {
    }

    /**
     * there was an unknown error processing the payment. The user should try again.
     */
    @Generated @NInt public static final long UnknownError = 0xFFFFFFFFFFFFFFFFL;
    /**
     * the user's contact information has an error. Use the PKPaymentErrorKeys in the userInfo to detail the problem.
     */
    @Generated @NInt public static final long ShippingContactInvalidError = 0x0000000000000001L;
    /**
     * the user's billing contact information has an error. Use the PKPaymentErrorKeys in the userInfo to detail the
     * problem.
     */
    @Generated @NInt public static final long BillingContactInvalidError = 0x0000000000000002L;
    /**
     * the user's shipping address is otherwise valid but not serviceable. For example, the address is in Canada and you
     * only ship to the United States, or you don't deliver to PO Boxes.
     */
    @Generated @NInt public static final long ShippingAddressUnserviceableError = 0x0000000000000003L;
    /**
     * The coupon code entered by the user is invalid.
     */
    @Generated @NInt public static final long CouponCodeInvalidError = 0x0000000000000004L;
    /**
     * The coupon code entered by the user has expired.
     */
    @Generated @NInt public static final long CouponCodeExpiredError = 0x0000000000000005L;
}
