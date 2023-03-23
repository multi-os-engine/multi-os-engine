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

package apple.intents.protocol;

import apple.intents.INCurrencyAmountResolutionResult;
import apple.intents.INPersonResolutionResult;
import apple.intents.INRequestPaymentCurrencyAmountResolutionResult;
import apple.intents.INRequestPaymentIntent;
import apple.intents.INRequestPaymentIntentResponse;
import apple.intents.INRequestPaymentPayerResolutionResult;
import apple.intents.INStringResolutionResult;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Protocol to declare support for handling an INRequestPaymentIntent. By implementing this protocol, a class can
 * provide logic for resolving, confirming and handling the intent.
 * 
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INRequestPaymentIntentHandling")
public interface INRequestPaymentIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     * 
     * @param intent     The input intent
     * @param completion The response block contains an INRequestPaymentIntentResponse containing additional details
     *                   about the intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INRequestPaymentIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmRequestPayment:completion:")
    default void confirmRequestPaymentCompletion(INRequestPaymentIntent intent,
            @ObjCBlock(name = "call_confirmRequestPaymentCompletion") Block_confirmRequestPaymentCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Handling method - Execute the task represented by the INRequestPaymentIntent that's passed in
     * 
     * Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param intent     The input intent
     * @param completion The response handling block takes a INRequestPaymentIntentResponse containing the details of
     *                   the result of having executed the intent
     * 
     * @see INRequestPaymentIntentResponse
     */
    @Generated
    @Selector("handleRequestPayment:completion:")
    void handleRequestPaymentCompletion(INRequestPaymentIntent intent,
            @ObjCBlock(name = "call_handleRequestPaymentCompletion") Block_handleRequestPaymentCompletion completion);

    /**
     * API-Since: 10.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: resolveCurrencyAmountForRequestPayment:withCompletion: is deprecated. Use
     * resolveCurrencyAmountForRequestPayment:completion: instead
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("resolveCurrencyAmountForRequestPayment:withCompletion:")
    default void resolveCurrencyAmountForRequestPaymentWithCompletion(INRequestPaymentIntent intent,
            @ObjCBlock(name = "call_resolveCurrencyAmountForRequestPaymentWithCompletion") Block_resolveCurrencyAmountForRequestPaymentWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveNoteForRequestPayment:withCompletion:")
    default void resolveNoteForRequestPaymentWithCompletion(INRequestPaymentIntent intent,
            @ObjCBlock(name = "call_resolveNoteForRequestPaymentWithCompletion") Block_resolveNoteForRequestPaymentWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Resolution methods - Determine if this intent is ready for the next step (confirmation)
     * 
     * Called to make sure the app extension is capable of handling this intent in its current form. This method is for
     * validating if the intent needs any further fleshing out.
     * 
     * @param intent     The input intent
     * @param completion The response block contains an INIntentResolutionResult for the parameter being resolved
     * 
     * @see INIntentResolutionResult
     * 
     *      API-Since: 10.0
     *      Deprecated-Since: 11.0
     *      Deprecated-Message: resolvePayerForRequestPayment:withCompletion: is deprecated. Use
     *      resolvePayerForRequestPayment:completion: instead
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("resolvePayerForRequestPayment:withCompletion:")
    default void resolvePayerForRequestPaymentWithCompletion(INRequestPaymentIntent intent,
            @ObjCBlock(name = "call_resolvePayerForRequestPaymentWithCompletion") Block_resolvePayerForRequestPaymentWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmRequestPaymentCompletion {
        @Generated
        void call_confirmRequestPaymentCompletion(INRequestPaymentIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleRequestPaymentCompletion {
        @Generated
        void call_handleRequestPaymentCompletion(INRequestPaymentIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveCurrencyAmountForRequestPaymentWithCompletion {
        @Generated
        void call_resolveCurrencyAmountForRequestPaymentWithCompletion(
                INCurrencyAmountResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveNoteForRequestPaymentWithCompletion {
        @Generated
        void call_resolveNoteForRequestPaymentWithCompletion(INStringResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePayerForRequestPaymentWithCompletion {
        @Generated
        void call_resolvePayerForRequestPaymentWithCompletion(INPersonResolutionResult resolutionResult);
    }

    /**
     * API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("resolveCurrencyAmountForRequestPayment:completion:")
    default void resolveCurrencyAmountForRequestPaymentCompletion(INRequestPaymentIntent intent,
            @ObjCBlock(name = "call_resolveCurrencyAmountForRequestPaymentCompletion") Block_resolveCurrencyAmountForRequestPaymentCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveCurrencyAmountForRequestPaymentCompletion {
        @Generated
        void call_resolveCurrencyAmountForRequestPaymentCompletion(
                INRequestPaymentCurrencyAmountResolutionResult resolutionResult);
    }

    /**
     * API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("resolvePayerForRequestPayment:completion:")
    default void resolvePayerForRequestPaymentCompletion(INRequestPaymentIntent intent,
            @ObjCBlock(name = "call_resolvePayerForRequestPaymentCompletion") Block_resolvePayerForRequestPaymentCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePayerForRequestPaymentCompletion {
        @Generated
        void call_resolvePayerForRequestPaymentCompletion(INRequestPaymentPayerResolutionResult resolutionResult);
    }
}
