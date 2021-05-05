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

package apple.passkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class PKPaymentAuthorizationStatus {
    /**
     * Merchant auth'd (or expects to auth) the transaction successfully.
     */
    @Generated @NInt public static final long Success = 0x0000000000000000L;
    /**
     * Merchant failed to auth the transaction.
     */
    @Generated @NInt public static final long Failure = 0x0000000000000001L;
    /**
     * Supplied billing address is insufficient or otherwise invalid
     */
    @Generated @NInt public static final long InvalidBillingPostalAddress = 0x0000000000000002L;
    /**
     * Supplied postal address is insufficient or otherwise invalid
     */
    @Generated @NInt public static final long InvalidShippingPostalAddress = 0x0000000000000003L;
    /**
     * Supplied contact information is insufficient or otherwise invalid
     */
    @Generated @NInt public static final long InvalidShippingContact = 0x0000000000000004L;
    /**
     * Transaction requires PIN entry.
     */
    @Generated @NInt public static final long PINRequired = 0x0000000000000005L;
    /**
     * PIN was not entered correctly, retry.
     */
    @Generated @NInt public static final long PINIncorrect = 0x0000000000000006L;
    /**
     * PIN retry limit exceeded.
     */
    @Generated @NInt public static final long PINLockout = 0x0000000000000007L;

    @Generated
    private PKPaymentAuthorizationStatus() {
    }
}
