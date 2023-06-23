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
import apple.passkit.PKPaymentRequestCouponCodeUpdate;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PKPaymentAuthorizationControllerDelegate")
public interface PKPaymentAuthorizationControllerDelegate {
    /**
     * API-Since: 10.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use paymentAuthorizationController:didAuthorizePayment:handler: instead to provide more
     * granular errors
     */
    @Deprecated
    @IsOptional
    @Generated
    @Selector("paymentAuthorizationController:didAuthorizePayment:completion:")
    default void paymentAuthorizationControllerDidAuthorizePaymentCompletion(
            @NotNull PKPaymentAuthorizationController controller, @NotNull PKPayment payment,
            @NotNull @ObjCBlock(name = "call_paymentAuthorizationControllerDidAuthorizePaymentCompletion") Block_paymentAuthorizationControllerDidAuthorizePaymentCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 10.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use paymentAuthorizationController:didSelectPaymentMethod:handler: instead to provide more
     * granular errors
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("paymentAuthorizationController:didSelectPaymentMethod:completion:")
    default void paymentAuthorizationControllerDidSelectPaymentMethodCompletion(
            @NotNull PKPaymentAuthorizationController controller, @NotNull PKPaymentMethod paymentMethod,
            @NotNull @ObjCBlock(name = "call_paymentAuthorizationControllerDidSelectPaymentMethodCompletion") Block_paymentAuthorizationControllerDidSelectPaymentMethodCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 10.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use paymentAuthorizationController:didSelectShippingContact:handler: instead to provide more
     * granular errors
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("paymentAuthorizationController:didSelectShippingContact:completion:")
    default void paymentAuthorizationControllerDidSelectShippingContactCompletion(
            @NotNull PKPaymentAuthorizationController controller, @NotNull PKContact contact,
            @NotNull @ObjCBlock(name = "call_paymentAuthorizationControllerDidSelectShippingContactCompletion") Block_paymentAuthorizationControllerDidSelectShippingContactCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * These delegate methods are deprecated and have been replaced with new callbacks that allow more granular
     * and comprehensive errors to be surfaced to users
     * 
     * API-Since: 10.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use paymentAuthorizationController:didSelectShippingMethod:handler: instead to provide more
     * granular errors
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("paymentAuthorizationController:didSelectShippingMethod:completion:")
    default void paymentAuthorizationControllerDidSelectShippingMethodCompletion(
            @NotNull PKPaymentAuthorizationController controller, @NotNull PKShippingMethod shippingMethod,
            @NotNull @ObjCBlock(name = "call_paymentAuthorizationControllerDidSelectShippingMethodCompletion") Block_paymentAuthorizationControllerDidSelectShippingMethodCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent to the delegate when payment authorization is finished. This may occur when
     * the user cancels the request, or after the PKPaymentAuthorizationStatus parameter of the
     * paymentAuthorizationController:didAuthorizePayment:completion: has been shown to the user.
     * 
     * The delegate is responsible for dismissing and releasing the controller in this method.
     */
    @Generated
    @Selector("paymentAuthorizationControllerDidFinish:")
    void paymentAuthorizationControllerDidFinish(@NotNull PKPaymentAuthorizationController controller);

    /**
     * Sent to the delegate before the payment is authorized, but after the user has authenticated using
     * the side button. Optional.
     */
    @Generated
    @IsOptional
    @Selector("paymentAuthorizationControllerWillAuthorizePayment:")
    default void paymentAuthorizationControllerWillAuthorizePayment(
            @NotNull PKPaymentAuthorizationController controller) {
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
                @NotNull NSArray<? extends PKPaymentSummaryItem> summaryItems);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationControllerDidSelectShippingContactCompletion {
        @Generated
        void call_paymentAuthorizationControllerDidSelectShippingContactCompletion(@NInt long status,
                @NotNull NSArray<? extends PKShippingMethod> shippingMethods,
                @NotNull NSArray<? extends PKPaymentSummaryItem> summaryItems);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationControllerDidSelectShippingMethodCompletion {
        @Generated
        void call_paymentAuthorizationControllerDidSelectShippingMethodCompletion(@NInt long status,
                @NotNull NSArray<? extends PKPaymentSummaryItem> summaryItems);
    }

    /**
     * Sent to the delegate after the user has acted on the payment request. The application
     * should inspect the payment to determine whether the payment request was authorized.
     * 
     * If the application requested a shipping contact then the full contact is now part of the payment.
     * 
     * The delegate must call completion with an appropriate authorization status, as may be determined
     * by submitting the payment credential to a processing gateway for payment authorization.
     * 
     * API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("paymentAuthorizationController:didAuthorizePayment:handler:")
    default void paymentAuthorizationControllerDidAuthorizePaymentHandler(
            @NotNull PKPaymentAuthorizationController controller, @NotNull PKPayment payment,
            @NotNull @ObjCBlock(name = "call_paymentAuthorizationControllerDidAuthorizePaymentHandler") Block_paymentAuthorizationControllerDidAuthorizePaymentHandler completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationControllerDidAuthorizePaymentHandler {
        @Generated
        void call_paymentAuthorizationControllerDidAuthorizePaymentHandler(
                @NotNull PKPaymentAuthorizationResult result);
    }

    /**
     * Sent when the user has selected a new payment card. Use this delegate callback if you need to
     * update the summary items in response to the card type changing (for example, applying credit card surcharges)
     * 
     * The delegate will receive no further callbacks except paymentAuthorizationControllerDidFinish:
     * until it has invoked the completion block.
     * 
     * API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("paymentAuthorizationController:didSelectPaymentMethod:handler:")
    default void paymentAuthorizationControllerDidSelectPaymentMethodHandler(
            @NotNull PKPaymentAuthorizationController controller, @NotNull PKPaymentMethod paymentMethod,
            @NotNull @ObjCBlock(name = "call_paymentAuthorizationControllerDidSelectPaymentMethodHandler") Block_paymentAuthorizationControllerDidSelectPaymentMethodHandler completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationControllerDidSelectPaymentMethodHandler {
        @Generated
        void call_paymentAuthorizationControllerDidSelectPaymentMethodHandler(
                @NotNull PKPaymentRequestPaymentMethodUpdate requestUpdate);
    }

    /**
     * API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("paymentAuthorizationController:didSelectShippingContact:handler:")
    default void paymentAuthorizationControllerDidSelectShippingContactHandler(
            @NotNull PKPaymentAuthorizationController controller, @NotNull PKContact contact,
            @NotNull @ObjCBlock(name = "call_paymentAuthorizationControllerDidSelectShippingContactHandler") Block_paymentAuthorizationControllerDidSelectShippingContactHandler completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationControllerDidSelectShippingContactHandler {
        @Generated
        void call_paymentAuthorizationControllerDidSelectShippingContactHandler(
                @NotNull PKPaymentRequestShippingContactUpdate requestUpdate);
    }

    /**
     * Sent when the user has selected a new shipping method. The delegate should determine
     * shipping costs based on the shipping method and either the shipping address contact in the original
     * PKPaymentRequest or the contact provided by the last call to paymentAuthorizationController:
     * didSelectShippingContact:completion:.
     * 
     * The delegate must invoke the completion block with an updated array of PKPaymentSummaryItem objects.
     * 
     * The delegate will receive no further callbacks except paymentAuthorizationControllerDidFinish:
     * until it has invoked the completion block.
     * 
     * API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("paymentAuthorizationController:didSelectShippingMethod:handler:")
    default void paymentAuthorizationControllerDidSelectShippingMethodHandler(
            @NotNull PKPaymentAuthorizationController controller, @NotNull PKShippingMethod shippingMethod,
            @NotNull @ObjCBlock(name = "call_paymentAuthorizationControllerDidSelectShippingMethodHandler") Block_paymentAuthorizationControllerDidSelectShippingMethodHandler completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationControllerDidSelectShippingMethodHandler {
        @Generated
        void call_paymentAuthorizationControllerDidSelectShippingMethodHandler(
                @NotNull PKPaymentRequestShippingMethodUpdate requestUpdate);
    }

    /**
     * API-Since: 14.0
     */
    @Generated
    @IsOptional
    @Selector("paymentAuthorizationController:didRequestMerchantSessionUpdate:")
    default void paymentAuthorizationControllerDidRequestMerchantSessionUpdate(
            @NotNull PKPaymentAuthorizationController controller,
            @NotNull @ObjCBlock(name = "call_paymentAuthorizationControllerDidRequestMerchantSessionUpdate") Block_paymentAuthorizationControllerDidRequestMerchantSessionUpdate handler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationControllerDidRequestMerchantSessionUpdate {
        @Generated
        void call_paymentAuthorizationControllerDidRequestMerchantSessionUpdate(
                @NotNull PKPaymentRequestMerchantSessionUpdate update);
    }

    /**
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("presentationWindowForPaymentAuthorizationController:")
    default UIWindow presentationWindowForPaymentAuthorizationController(
            @NotNull PKPaymentAuthorizationController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 15.0
     */
    @Generated
    @IsOptional
    @Selector("paymentAuthorizationController:didChangeCouponCode:handler:")
    default void paymentAuthorizationControllerDidChangeCouponCodeHandler(
            @NotNull PKPaymentAuthorizationController controller, @NotNull String couponCode,
            @NotNull @ObjCBlock(name = "call_paymentAuthorizationControllerDidChangeCouponCodeHandler") Block_paymentAuthorizationControllerDidChangeCouponCodeHandler completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_paymentAuthorizationControllerDidChangeCouponCodeHandler {
        @Generated
        void call_paymentAuthorizationControllerDidChangeCouponCodeHandler(
                @NotNull PKPaymentRequestCouponCodeUpdate update);
    }
}
