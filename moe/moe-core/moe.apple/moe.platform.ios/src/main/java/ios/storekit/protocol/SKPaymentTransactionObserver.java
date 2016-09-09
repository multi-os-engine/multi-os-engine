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

package ios.storekit.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSArray;
import ios.foundation.NSError;
import ios.storekit.SKDownload;
import ios.storekit.SKPaymentQueue;
import ios.storekit.SKPaymentTransaction;

@Generated
@Library("StoreKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SKPaymentTransactionObserver")
public interface SKPaymentTransactionObserver {
	/**
	 * paymentQueue:removedTransactions:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/SKPaymentTransactionObserver_Protocol/index.html#//apple_ref/occ/intfm/SKPaymentTransactionObserver/paymentQueue:removedTransactions:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("paymentQueue:removedTransactions:")
	default void paymentQueueRemovedTransactions(SKPaymentQueue queue,
			NSArray<? extends SKPaymentTransaction> transactions) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * paymentQueue:restoreCompletedTransactionsFailedWithError:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/SKPaymentTransactionObserver_Protocol/index.html#//apple_ref/occ/intfm/SKPaymentTransactionObserver/paymentQueue:restoreCompletedTransactionsFailedWithError:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("paymentQueue:restoreCompletedTransactionsFailedWithError:")
	default void paymentQueueRestoreCompletedTransactionsFailedWithError(
			SKPaymentQueue queue, NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * paymentQueue:updatedDownloads:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/SKPaymentTransactionObserver_Protocol/index.html#//apple_ref/occ/intfm/SKPaymentTransactionObserver/paymentQueue:updatedDownloads:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("paymentQueue:updatedDownloads:")
	default void paymentQueueUpdatedDownloads(SKPaymentQueue queue,
			NSArray<? extends SKDownload> downloads) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * paymentQueue:updatedTransactions:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/SKPaymentTransactionObserver_Protocol/index.html#//apple_ref/occ/intfm/SKPaymentTransactionObserver/paymentQueue:updatedTransactions:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("paymentQueue:updatedTransactions:")
	void paymentQueueUpdatedTransactions(SKPaymentQueue queue,
			NSArray<? extends SKPaymentTransaction> transactions);

	/**
	 * paymentQueueRestoreCompletedTransactionsFinished:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/SKPaymentTransactionObserver_Protocol/index.html#//apple_ref/occ/intfm/SKPaymentTransactionObserver/paymentQueueRestoreCompletedTransactionsFinished:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("paymentQueueRestoreCompletedTransactionsFinished:")
	default void paymentQueueRestoreCompletedTransactionsFinished(
			SKPaymentQueue queue) {
		throw new java.lang.UnsupportedOperationException();
	}
}
