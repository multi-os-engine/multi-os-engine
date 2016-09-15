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

package apple.passkit.protocol;

import apple.foundation.NSArray;
import apple.passkit.PKContact;
import apple.passkit.PKPayment;
import apple.passkit.PKPaymentAuthorizationViewController;
import apple.passkit.PKPaymentMethod;
import apple.passkit.PKPaymentSummaryItem;
import apple.passkit.PKShippingMethod;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PKPaymentAuthorizationViewControllerDelegate")
public interface PKPaymentAuthorizationViewControllerDelegate {
    /**
     * paymentAuthorizationViewController:didAuthorizePayment:completion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentAuthorizationViewControllerDelegate_Ref/index.html#//apple_ref/occ/intfm/PKPaymentAuthorizationViewControllerDelegate/paymentAuthorizationViewController:didAuthorizePayment:completion:">iOS Dev Center</a>
     */
    @Generated
    @Selector("paymentAuthorizationViewController:didAuthorizePayment:completion:")
    void paymentAuthorizationViewControllerDidAuthorizePaymentCompletion(
            PKPaymentAuthorizationViewController controller, PKPayment payment,
            @ObjCBlock(name = "call_paymentAuthorizationViewControllerDidAuthorizePaymentCompletion") Block_paymentAuthorizationViewControllerDidAuthorizePaymentCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationViewControllerDidAuthorizePaymentCompletion {
        @Generated
        void call_paymentAuthorizationViewControllerDidAuthorizePaymentCompletion(@NInt long arg0);
    }

    /**
     * paymentAuthorizationViewController:didSelectShippingAddress:completion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentAuthorizationViewControllerDelegate_Ref/index.html#//apple_ref/occ/intfm/PKPaymentAuthorizationViewControllerDelegate/paymentAuthorizationViewController:didSelectShippingAddress:completion:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("paymentAuthorizationViewController:didSelectShippingAddress:completion:")
    default void paymentAuthorizationViewControllerDidSelectShippingAddressCompletion(
            PKPaymentAuthorizationViewController controller, ConstVoidPtr address,
            @ObjCBlock(name = "call_paymentAuthorizationViewControllerDidSelectShippingAddressCompletion") Block_paymentAuthorizationViewControllerDidSelectShippingAddressCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationViewControllerDidSelectShippingAddressCompletion {
        @Generated
        void call_paymentAuthorizationViewControllerDidSelectShippingAddressCompletion(@NInt long arg0,
                NSArray<? extends PKShippingMethod> arg1, NSArray<? extends PKPaymentSummaryItem> arg2);
    }

    /**
     * paymentAuthorizationViewController:didSelectShippingMethod:completion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentAuthorizationViewControllerDelegate_Ref/index.html#//apple_ref/occ/intfm/PKPaymentAuthorizationViewControllerDelegate/paymentAuthorizationViewController:didSelectShippingMethod:completion:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("paymentAuthorizationViewController:didSelectShippingMethod:completion:")
    default void paymentAuthorizationViewControllerDidSelectShippingMethodCompletion(
            PKPaymentAuthorizationViewController controller, PKShippingMethod shippingMethod,
            @ObjCBlock(name = "call_paymentAuthorizationViewControllerDidSelectShippingMethodCompletion") Block_paymentAuthorizationViewControllerDidSelectShippingMethodCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationViewControllerDidSelectShippingMethodCompletion {
        @Generated
        void call_paymentAuthorizationViewControllerDidSelectShippingMethodCompletion(@NInt long arg0,
                NSArray<? extends PKPaymentSummaryItem> arg1);
    }

    /**
     * paymentAuthorizationViewControllerDidFinish:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentAuthorizationViewControllerDelegate_Ref/index.html#//apple_ref/occ/intfm/PKPaymentAuthorizationViewControllerDelegate/paymentAuthorizationViewControllerDidFinish:">iOS Dev Center</a>
     */
    @Generated
    @Selector("paymentAuthorizationViewControllerDidFinish:")
    void paymentAuthorizationViewControllerDidFinish(PKPaymentAuthorizationViewController controller);

    /**
     * paymentAuthorizationViewControllerWillAuthorizePayment:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentAuthorizationViewControllerDelegate_Ref/index.html#//apple_ref/occ/intfm/PKPaymentAuthorizationViewControllerDelegate/paymentAuthorizationViewControllerWillAuthorizePayment:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("paymentAuthorizationViewControllerWillAuthorizePayment:")
    default void paymentAuthorizationViewControllerWillAuthorizePayment(
            PKPaymentAuthorizationViewController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * paymentAuthorizationViewController:didSelectPaymentMethod:completion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentAuthorizationViewControllerDelegate_Ref/index.html#//apple_ref/occ/intfm/PKPaymentAuthorizationViewControllerDelegate/paymentAuthorizationViewController:didSelectPaymentMethod:completion:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("paymentAuthorizationViewController:didSelectPaymentMethod:completion:")
    default void paymentAuthorizationViewControllerDidSelectPaymentMethodCompletion(
            PKPaymentAuthorizationViewController controller, PKPaymentMethod paymentMethod,
            @ObjCBlock(name = "call_paymentAuthorizationViewControllerDidSelectPaymentMethodCompletion") Block_paymentAuthorizationViewControllerDidSelectPaymentMethodCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationViewControllerDidSelectPaymentMethodCompletion {
        @Generated
        void call_paymentAuthorizationViewControllerDidSelectPaymentMethodCompletion(
                NSArray<? extends PKPaymentSummaryItem> arg0);
    }

    /**
     * paymentAuthorizationViewController:didSelectShippingContact:completion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentAuthorizationViewControllerDelegate_Ref/index.html#//apple_ref/occ/intfm/PKPaymentAuthorizationViewControllerDelegate/paymentAuthorizationViewController:didSelectShippingContact:completion:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("paymentAuthorizationViewController:didSelectShippingContact:completion:")
    default void paymentAuthorizationViewControllerDidSelectShippingContactCompletion(
            PKPaymentAuthorizationViewController controller, PKContact contact,
            @ObjCBlock(name = "call_paymentAuthorizationViewControllerDidSelectShippingContactCompletion") Block_paymentAuthorizationViewControllerDidSelectShippingContactCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationViewControllerDidSelectShippingContactCompletion {
        @Generated
        void call_paymentAuthorizationViewControllerDidSelectShippingContactCompletion(@NInt long arg0,
                NSArray<? extends PKShippingMethod> arg1, NSArray<? extends PKPaymentSummaryItem> arg2);
    }
}
