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
import apple.passkit.PKPaymentAuthorizationResult;
import apple.passkit.PKPaymentAuthorizationViewController;
import apple.passkit.PKPaymentMethod;
import apple.passkit.PKPaymentRequestCouponCodeUpdate;
import apple.passkit.PKPaymentRequestMerchantSessionUpdate;
import apple.passkit.PKPaymentRequestPaymentMethodUpdate;
import apple.passkit.PKPaymentRequestShippingContactUpdate;
import apple.passkit.PKPaymentRequestShippingMethodUpdate;
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
import org.jetbrains.annotations.NotNull;

@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PKPaymentAuthorizationViewControllerDelegate")
public interface PKPaymentAuthorizationViewControllerDelegate {
    /**
     * Deprecated delegate methods
     * These methods are deprecated. Please migrate away from them to their replacements.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use paymentAuthorizationViewController:didAuthorizePayment:handler: instead to provide more
     * granular errors
     */
    @Deprecated
    @IsOptional
    @Generated
    @Selector("paymentAuthorizationViewController:didAuthorizePayment:completion:")
    default void paymentAuthorizationViewControllerDidAuthorizePaymentCompletion(
            @NotNull PKPaymentAuthorizationViewController controller, @NotNull PKPayment payment,
            @NotNull @ObjCBlock(name = "call_paymentAuthorizationViewControllerDidAuthorizePaymentCompletion") Block_paymentAuthorizationViewControllerDidAuthorizePaymentCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 9.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use paymentAuthorizationViewController:didSelectPaymentMethod:handler: instead to provide
     * more granular errors
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("paymentAuthorizationViewController:didSelectPaymentMethod:completion:")
    default void paymentAuthorizationViewControllerDidSelectPaymentMethodCompletion(
            @NotNull PKPaymentAuthorizationViewController controller, @NotNull PKPaymentMethod paymentMethod,
            @NotNull @ObjCBlock(name = "call_paymentAuthorizationViewControllerDidSelectPaymentMethodCompletion") Block_paymentAuthorizationViewControllerDidSelectPaymentMethodCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 8.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: ABRecordRef has been deprecated. Please migrate away from this delegate callback as soon as
     * possible.
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("paymentAuthorizationViewController:didSelectShippingAddress:completion:")
    default void paymentAuthorizationViewControllerDidSelectShippingAddressCompletion(
            @NotNull PKPaymentAuthorizationViewController controller, @NotNull ConstVoidPtr address,
            @NotNull @ObjCBlock(name = "call_paymentAuthorizationViewControllerDidSelectShippingAddressCompletion") Block_paymentAuthorizationViewControllerDidSelectShippingAddressCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 9.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use paymentAuthorizationViewController:didSelectShippingContact:handler: instead to provide
     * more granular errors
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("paymentAuthorizationViewController:didSelectShippingContact:completion:")
    default void paymentAuthorizationViewControllerDidSelectShippingContactCompletion(
            @NotNull PKPaymentAuthorizationViewController controller, @NotNull PKContact contact,
            @NotNull @ObjCBlock(name = "call_paymentAuthorizationViewControllerDidSelectShippingContactCompletion") Block_paymentAuthorizationViewControllerDidSelectShippingContactCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use paymentAuthorizationViewController:didSelectShippingMethod:handler: instead to provide
     * more granular errors
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("paymentAuthorizationViewController:didSelectShippingMethod:completion:")
    default void paymentAuthorizationViewControllerDidSelectShippingMethodCompletion(
            @NotNull PKPaymentAuthorizationViewController controller, @NotNull PKShippingMethod shippingMethod,
            @NotNull @ObjCBlock(name = "call_paymentAuthorizationViewControllerDidSelectShippingMethodCompletion") Block_paymentAuthorizationViewControllerDidSelectShippingMethodCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent to the delegate when payment authorization is finished. This may occur when
     * the user cancels the request, or after the PKPaymentAuthorizationStatus parameter of the
     * paymentAuthorizationViewController:didAuthorizePayment:completion: has been shown to the user.
     * 
     * The delegate is responsible for dismissing the view controller in this method.
     */
    @Generated
    @Selector("paymentAuthorizationViewControllerDidFinish:")
    void paymentAuthorizationViewControllerDidFinish(@NotNull PKPaymentAuthorizationViewController controller);

    /**
     * Sent to the delegate before the payment is authorized, but after the user has authenticated using
     * passcode or Touch ID. Optional.
     * 
     * API-Since: 8.3
     */
    @Generated
    @IsOptional
    @Selector("paymentAuthorizationViewControllerWillAuthorizePayment:")
    default void paymentAuthorizationViewControllerWillAuthorizePayment(
            @NotNull PKPaymentAuthorizationViewController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationViewControllerDidAuthorizePaymentCompletion {
        @Generated
        void call_paymentAuthorizationViewControllerDidAuthorizePaymentCompletion(@NInt long status);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationViewControllerDidSelectPaymentMethodCompletion {
        @Generated
        void call_paymentAuthorizationViewControllerDidSelectPaymentMethodCompletion(
                @NotNull NSArray<? extends PKPaymentSummaryItem> summaryItems);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationViewControllerDidSelectShippingAddressCompletion {
        @Generated
        void call_paymentAuthorizationViewControllerDidSelectShippingAddressCompletion(@NInt long status,
                @NotNull NSArray<? extends PKShippingMethod> shippingMethods,
                @NotNull NSArray<? extends PKPaymentSummaryItem> summaryItems);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationViewControllerDidSelectShippingContactCompletion {
        @Generated
        void call_paymentAuthorizationViewControllerDidSelectShippingContactCompletion(@NInt long status,
                @NotNull NSArray<? extends PKShippingMethod> shippingMethods,
                @NotNull NSArray<? extends PKPaymentSummaryItem> summaryItems);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationViewControllerDidSelectShippingMethodCompletion {
        @Generated
        void call_paymentAuthorizationViewControllerDidSelectShippingMethodCompletion(@NInt long status,
                @NotNull NSArray<? extends PKPaymentSummaryItem> summaryItems);
    }

    /**
     * Sent to the delegate after the user has acted on the payment request. The application
     * should inspect the payment to determine whether the payment request was authorized.
     * 
     * If the application requested a shipping address then the full addresses is now part of the payment.
     * 
     * The delegate must call completion with an appropriate authorization status, as may be determined
     * by submitting the payment credential to a processing gateway for payment authorization.
     * 
     * API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("paymentAuthorizationViewController:didAuthorizePayment:handler:")
    default void paymentAuthorizationViewControllerDidAuthorizePaymentHandler(
            @NotNull PKPaymentAuthorizationViewController controller, @NotNull PKPayment payment,
            @NotNull @ObjCBlock(name = "call_paymentAuthorizationViewControllerDidAuthorizePaymentHandler") Block_paymentAuthorizationViewControllerDidAuthorizePaymentHandler completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationViewControllerDidAuthorizePaymentHandler {
        @Generated
        void call_paymentAuthorizationViewControllerDidAuthorizePaymentHandler(
                @NotNull PKPaymentAuthorizationResult result);
    }

    /**
     * Sent when the user has selected a new payment card. Use this delegate callback if you need to
     * update the summary items in response to the card type changing (for example, applying credit card surcharges)
     * 
     * The delegate will receive no further callbacks except paymentAuthorizationViewControllerDidFinish:
     * until it has invoked the completion block.
     * 
     * API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("paymentAuthorizationViewController:didSelectPaymentMethod:handler:")
    default void paymentAuthorizationViewControllerDidSelectPaymentMethodHandler(
            @NotNull PKPaymentAuthorizationViewController controller, @NotNull PKPaymentMethod paymentMethod,
            @NotNull @ObjCBlock(name = "call_paymentAuthorizationViewControllerDidSelectPaymentMethodHandler") Block_paymentAuthorizationViewControllerDidSelectPaymentMethodHandler completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationViewControllerDidSelectPaymentMethodHandler {
        @Generated
        void call_paymentAuthorizationViewControllerDidSelectPaymentMethodHandler(
                @NotNull PKPaymentRequestPaymentMethodUpdate update);
    }

    /**
     * Sent when the user has selected a new shipping address. The delegate should inspect the
     * address and must invoke the completion block with an updated array of PKPaymentSummaryItem objects.
     * 
     * The delegate will receive no further callbacks except paymentAuthorizationViewControllerDidFinish:
     * until it has invoked the completion block.
     * 
     * API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("paymentAuthorizationViewController:didSelectShippingContact:handler:")
    default void paymentAuthorizationViewControllerDidSelectShippingContactHandler(
            @NotNull PKPaymentAuthorizationViewController controller, @NotNull PKContact contact,
            @NotNull @ObjCBlock(name = "call_paymentAuthorizationViewControllerDidSelectShippingContactHandler") Block_paymentAuthorizationViewControllerDidSelectShippingContactHandler completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationViewControllerDidSelectShippingContactHandler {
        @Generated
        void call_paymentAuthorizationViewControllerDidSelectShippingContactHandler(
                @NotNull PKPaymentRequestShippingContactUpdate update);
    }

    /**
     * Sent when the user has selected a new shipping method. The delegate should determine
     * shipping costs based on the shipping method and either the shipping address supplied in the original
     * PKPaymentRequest or the address fragment provided by the last call to paymentAuthorizationViewController:
     * didSelectShippingAddress:completion:.
     * 
     * The delegate must invoke the completion block with an updated array of PKPaymentSummaryItem objects.
     * 
     * The delegate will receive no further callbacks except paymentAuthorizationViewControllerDidFinish:
     * until it has invoked the completion block.
     * 
     * API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("paymentAuthorizationViewController:didSelectShippingMethod:handler:")
    default void paymentAuthorizationViewControllerDidSelectShippingMethodHandler(
            @NotNull PKPaymentAuthorizationViewController controller, @NotNull PKShippingMethod shippingMethod,
            @NotNull @ObjCBlock(name = "call_paymentAuthorizationViewControllerDidSelectShippingMethodHandler") Block_paymentAuthorizationViewControllerDidSelectShippingMethodHandler completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationViewControllerDidSelectShippingMethodHandler {
        @Generated
        void call_paymentAuthorizationViewControllerDidSelectShippingMethodHandler(
                @NotNull PKPaymentRequestShippingMethodUpdate update);
    }

    /**
     * API-Since: 14.0
     */
    @Generated
    @IsOptional
    @Selector("paymentAuthorizationViewController:didRequestMerchantSessionUpdate:")
    default void paymentAuthorizationViewControllerDidRequestMerchantSessionUpdate(
            @NotNull PKPaymentAuthorizationViewController controller,
            @NotNull @ObjCBlock(name = "call_paymentAuthorizationViewControllerDidRequestMerchantSessionUpdate") Block_paymentAuthorizationViewControllerDidRequestMerchantSessionUpdate handler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationViewControllerDidRequestMerchantSessionUpdate {
        @Generated
        void call_paymentAuthorizationViewControllerDidRequestMerchantSessionUpdate(
                @NotNull PKPaymentRequestMerchantSessionUpdate update);
    }

    /**
     * API-Since: 15.0
     */
    @Generated
    @IsOptional
    @Selector("paymentAuthorizationViewController:didChangeCouponCode:handler:")
    default void paymentAuthorizationViewControllerDidChangeCouponCodeHandler(
            @NotNull PKPaymentAuthorizationViewController controller, @NotNull String couponCode,
            @NotNull @ObjCBlock(name = "call_paymentAuthorizationViewControllerDidChangeCouponCodeHandler") Block_paymentAuthorizationViewControllerDidChangeCouponCodeHandler completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationViewControllerDidChangeCouponCodeHandler {
        @Generated
        void call_paymentAuthorizationViewControllerDidChangeCouponCodeHandler(
                @NotNull PKPaymentRequestCouponCodeUpdate update);
    }
}
