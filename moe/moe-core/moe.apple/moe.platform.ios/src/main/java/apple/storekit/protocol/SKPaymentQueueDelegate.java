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
    @Generated
    @IsOptional
    @Selector("paymentQueue:shouldContinueTransaction:inStorefront:")
    default boolean paymentQueueShouldContinueTransactionInStorefront(SKPaymentQueue paymentQueue,
            SKPaymentTransaction transaction, SKStorefront newStorefront) {
        throw new java.lang.UnsupportedOperationException();
    }
}