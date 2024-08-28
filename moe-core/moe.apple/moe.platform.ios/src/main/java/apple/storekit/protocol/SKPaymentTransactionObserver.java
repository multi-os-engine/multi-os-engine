/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.storekit.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.storekit.SKDownload;
import apple.storekit.SKPayment;
import apple.storekit.SKPaymentQueue;
import apple.storekit.SKPaymentTransaction;
import apple.storekit.SKProduct;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("StoreKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SKPaymentTransactionObserver")
public interface SKPaymentTransactionObserver {
    /**
     * Sent when transactions are removed from the queue (via finishTransaction:).
     * 
     * API-Since: 3.0
     */
    @Generated
    @IsOptional
    @Selector("paymentQueue:removedTransactions:")
    default void paymentQueueRemovedTransactions(@NotNull SKPaymentQueue queue,
            @NotNull NSArray<? extends SKPaymentTransaction> transactions) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent when an error is encountered while adding transactions from the user's purchase history back to the queue.
     * 
     * API-Since: 3.0
     */
    @Generated
    @IsOptional
    @Selector("paymentQueue:restoreCompletedTransactionsFailedWithError:")
    default void paymentQueueRestoreCompletedTransactionsFailedWithError(@NotNull SKPaymentQueue queue,
            @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent when the download state has changed.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Hosted content is no longer supported
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("paymentQueue:updatedDownloads:")
    default void paymentQueueUpdatedDownloads(@NotNull SKPaymentQueue queue,
            @NotNull NSArray<? extends SKDownload> downloads) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent when the transaction array has changed (additions or state changes). Client should check state of
     * transactions and finish as appropriate.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("paymentQueue:updatedTransactions:")
    void paymentQueueUpdatedTransactions(@NotNull SKPaymentQueue queue,
            @NotNull NSArray<? extends SKPaymentTransaction> transactions);

    /**
     * Sent when all transactions from the user's purchase history have successfully been added back to the queue.
     * 
     * API-Since: 3.0
     */
    @Generated
    @IsOptional
    @Selector("paymentQueueRestoreCompletedTransactionsFinished:")
    default void paymentQueueRestoreCompletedTransactionsFinished(@NotNull SKPaymentQueue queue) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent when a user initiates an IAP buy from the App Store
     * 
     * API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("paymentQueue:shouldAddStorePayment:forProduct:")
    default boolean paymentQueueShouldAddStorePaymentForProduct(@NotNull SKPaymentQueue queue,
            @NotNull SKPayment payment, @NotNull SKProduct product) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("paymentQueueDidChangeStorefront:")
    default void paymentQueueDidChangeStorefront(@NotNull SKPaymentQueue queue) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent when entitlements for a user have changed and access to the specified IAPs has been revoked.
     * 
     * API-Since: 14.0
     */
    @Generated
    @IsOptional
    @Selector("paymentQueue:didRevokeEntitlementsForProductIdentifiers:")
    default void paymentQueueDidRevokeEntitlementsForProductIdentifiers(@NotNull SKPaymentQueue queue,
            @NotNull NSArray<String> productIdentifiers) {
        throw new java.lang.UnsupportedOperationException();
    }
}
