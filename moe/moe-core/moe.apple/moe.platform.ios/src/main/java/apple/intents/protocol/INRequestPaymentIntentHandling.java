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

@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INRequestPaymentIntentHandling")
public interface INRequestPaymentIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmRequestPayment:completion:")
    default void confirmRequestPaymentCompletion(INRequestPaymentIntent intent,
            @ObjCBlock(name = "call_confirmRequestPaymentCompletion") Block_confirmRequestPaymentCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("handleRequestPayment:completion:")
    void handleRequestPaymentCompletion(INRequestPaymentIntent intent,
            @ObjCBlock(name = "call_handleRequestPaymentCompletion") Block_handleRequestPaymentCompletion completion);

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
        void call_confirmRequestPaymentCompletion(INRequestPaymentIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleRequestPaymentCompletion {
        @Generated
        void call_handleRequestPaymentCompletion(INRequestPaymentIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveCurrencyAmountForRequestPaymentWithCompletion {
        @Generated
        void call_resolveCurrencyAmountForRequestPaymentWithCompletion(INCurrencyAmountResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveNoteForRequestPaymentWithCompletion {
        @Generated
        void call_resolveNoteForRequestPaymentWithCompletion(INStringResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePayerForRequestPaymentWithCompletion {
        @Generated
        void call_resolvePayerForRequestPaymentWithCompletion(INPersonResolutionResult arg0);
    }

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
        void call_resolveCurrencyAmountForRequestPaymentCompletion(INRequestPaymentCurrencyAmountResolutionResult arg0);
    }

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
        void call_resolvePayerForRequestPaymentCompletion(INRequestPaymentPayerResolutionResult arg0);
    }
}
