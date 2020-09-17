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
import apple.passkit.PKPaymentAuthorizationController;
import apple.passkit.PKPaymentAuthorizationResult;
import apple.passkit.PKPaymentMethod;
import apple.passkit.PKPaymentRequestMerchantSessionUpdate;
import apple.passkit.PKPaymentRequestPaymentMethodUpdate;
import apple.passkit.PKPaymentRequestShippingContactUpdate;
import apple.passkit.PKPaymentRequestShippingMethodUpdate;
import apple.passkit.PKPaymentSummaryItem;
import apple.passkit.PKShippingMethod;
import apple.uikit.UIWindow;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PKPaymentAuthorizationControllerDelegate")
public interface PKPaymentAuthorizationControllerDelegate {
    @IsOptional
    @Generated
    @Selector("paymentAuthorizationController:didAuthorizePayment:completion:")
    default void paymentAuthorizationControllerDidAuthorizePaymentCompletion(
            PKPaymentAuthorizationController controller, PKPayment payment,
            @ObjCBlock(name = "call_paymentAuthorizationControllerDidAuthorizePaymentCompletion") Block_paymentAuthorizationControllerDidAuthorizePaymentCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("paymentAuthorizationController:didSelectPaymentMethod:completion:")
    default void paymentAuthorizationControllerDidSelectPaymentMethodCompletion(
            PKPaymentAuthorizationController controller, PKPaymentMethod paymentMethod,
            @ObjCBlock(name = "call_paymentAuthorizationControllerDidSelectPaymentMethodCompletion") Block_paymentAuthorizationControllerDidSelectPaymentMethodCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("paymentAuthorizationController:didSelectShippingContact:completion:")
    default void paymentAuthorizationControllerDidSelectShippingContactCompletion(
            PKPaymentAuthorizationController controller, PKContact contact,
            @ObjCBlock(name = "call_paymentAuthorizationControllerDidSelectShippingContactCompletion") Block_paymentAuthorizationControllerDidSelectShippingContactCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("paymentAuthorizationController:didSelectShippingMethod:completion:")
    default void paymentAuthorizationControllerDidSelectShippingMethodCompletion(
            PKPaymentAuthorizationController controller, PKShippingMethod shippingMethod,
            @ObjCBlock(name = "call_paymentAuthorizationControllerDidSelectShippingMethodCompletion") Block_paymentAuthorizationControllerDidSelectShippingMethodCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("paymentAuthorizationControllerDidFinish:")
    void paymentAuthorizationControllerDidFinish(PKPaymentAuthorizationController controller);

    @Generated
    @IsOptional
    @Selector("paymentAuthorizationControllerWillAuthorizePayment:")
    default void paymentAuthorizationControllerWillAuthorizePayment(PKPaymentAuthorizationController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationControllerDidAuthorizePaymentCompletion {
        @Generated
        void call_paymentAuthorizationControllerDidAuthorizePaymentCompletion(@NInt long status);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationControllerDidSelectPaymentMethodCompletion {
        @Generated
        void call_paymentAuthorizationControllerDidSelectPaymentMethodCompletion(
                NSArray<? extends PKPaymentSummaryItem> summaryItems);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationControllerDidSelectShippingContactCompletion {
        @Generated
        void call_paymentAuthorizationControllerDidSelectShippingContactCompletion(@NInt long status,
                NSArray<? extends PKShippingMethod> shippingMethods,
                NSArray<? extends PKPaymentSummaryItem> summaryItems);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationControllerDidSelectShippingMethodCompletion {
        @Generated
        void call_paymentAuthorizationControllerDidSelectShippingMethodCompletion(@NInt long status,
                NSArray<? extends PKPaymentSummaryItem> summaryItems);
    }

    @Generated
    @IsOptional
    @Selector("paymentAuthorizationController:didAuthorizePayment:handler:")
    default void paymentAuthorizationControllerDidAuthorizePaymentHandler(PKPaymentAuthorizationController controller,
            PKPayment payment,
            @ObjCBlock(name = "call_paymentAuthorizationControllerDidAuthorizePaymentHandler") Block_paymentAuthorizationControllerDidAuthorizePaymentHandler completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationControllerDidAuthorizePaymentHandler {
        @Generated
        void call_paymentAuthorizationControllerDidAuthorizePaymentHandler(PKPaymentAuthorizationResult result);
    }

    @Generated
    @IsOptional
    @Selector("paymentAuthorizationController:didSelectPaymentMethod:handler:")
    default void paymentAuthorizationControllerDidSelectPaymentMethodHandler(
            PKPaymentAuthorizationController controller, PKPaymentMethod paymentMethod,
            @ObjCBlock(name = "call_paymentAuthorizationControllerDidSelectPaymentMethodHandler") Block_paymentAuthorizationControllerDidSelectPaymentMethodHandler completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationControllerDidSelectPaymentMethodHandler {
        @Generated
        void call_paymentAuthorizationControllerDidSelectPaymentMethodHandler(
                PKPaymentRequestPaymentMethodUpdate requestUpdate);
    }

    @Generated
    @IsOptional
    @Selector("paymentAuthorizationController:didSelectShippingContact:handler:")
    default void paymentAuthorizationControllerDidSelectShippingContactHandler(
            PKPaymentAuthorizationController controller, PKContact contact,
            @ObjCBlock(name = "call_paymentAuthorizationControllerDidSelectShippingContactHandler") Block_paymentAuthorizationControllerDidSelectShippingContactHandler completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationControllerDidSelectShippingContactHandler {
        @Generated
        void call_paymentAuthorizationControllerDidSelectShippingContactHandler(
                PKPaymentRequestShippingContactUpdate requestUpdate);
    }

    @Generated
    @IsOptional
    @Selector("paymentAuthorizationController:didSelectShippingMethod:handler:")
    default void paymentAuthorizationControllerDidSelectShippingMethodHandler(
            PKPaymentAuthorizationController controller, PKShippingMethod shippingMethod,
            @ObjCBlock(name = "call_paymentAuthorizationControllerDidSelectShippingMethodHandler") Block_paymentAuthorizationControllerDidSelectShippingMethodHandler completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationControllerDidSelectShippingMethodHandler {
        @Generated
        void call_paymentAuthorizationControllerDidSelectShippingMethodHandler(
                PKPaymentRequestShippingMethodUpdate requestUpdate);
    }

    @Generated
    @IsOptional
    @Selector("paymentAuthorizationController:didRequestMerchantSessionUpdate:")
    default void paymentAuthorizationControllerDidRequestMerchantSessionUpdate(
            PKPaymentAuthorizationController controller,
            @ObjCBlock(name = "call_paymentAuthorizationControllerDidRequestMerchantSessionUpdate") Block_paymentAuthorizationControllerDidRequestMerchantSessionUpdate handler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationControllerDidRequestMerchantSessionUpdate {
        @Generated
        void call_paymentAuthorizationControllerDidRequestMerchantSessionUpdate(
                PKPaymentRequestMerchantSessionUpdate update);
    }

    @Generated
    @IsOptional
    @Selector("presentationWindowForPaymentAuthorizationController:")
    default UIWindow presentationWindowForPaymentAuthorizationController(PKPaymentAuthorizationController controller) {
        throw new java.lang.UnsupportedOperationException();
    }
}
