package apple.storekit.protocol;

import apple.storekit.SKPaymentQueue;
import apple.storekit.SKPaymentTransaction;
import apple.storekit.SKStorefront;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("StoreKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SKPaymentQueueDelegate")
public interface SKPaymentQueueDelegate {
    /**
     * Sent when the storefront changes while a payment is processing.
     */
    @Generated
    @IsOptional
    @Selector("paymentQueue:shouldContinueTransaction:inStorefront:")
    default boolean paymentQueueShouldContinueTransactionInStorefront(SKPaymentQueue paymentQueue,
            SKPaymentTransaction transaction, SKStorefront newStorefront) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent if there is a pending price consent confirmation from the App Store for the current user. Return YES to
     * immediately show the price consent UI. Return NO if you intend to show it at a later time. Defaults to YES.
     * This may be called at any time that you have transaction observers on the payment queue, so make sure to set the
     * delegate before adding any transaction observers if you intend to implement this method.
     */
    @Generated
    @IsOptional
    @Selector("paymentQueueShouldShowPriceConsent:")
    default boolean paymentQueueShouldShowPriceConsent(SKPaymentQueue paymentQueue) {
        throw new java.lang.UnsupportedOperationException();
    }
}