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
import apple.intents.INSendPaymentCurrencyAmountResolutionResult;
import apple.intents.INSendPaymentIntent;
import apple.intents.INSendPaymentIntentResponse;
import apple.intents.INSendPaymentPayeeResolutionResult;
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
@ObjCProtocolName("INSendPaymentIntentHandling")
public interface INSendPaymentIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmSendPayment:completion:")
    default void confirmSendPaymentCompletion(INSendPaymentIntent intent,
            @ObjCBlock(name = "call_confirmSendPaymentCompletion") Block_confirmSendPaymentCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("handleSendPayment:completion:")
    void handleSendPaymentCompletion(INSendPaymentIntent intent,
            @ObjCBlock(name = "call_handleSendPaymentCompletion") Block_handleSendPaymentCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveCurrencyAmountForSendPayment:withCompletion:")
    default void resolveCurrencyAmountForSendPaymentWithCompletion(INSendPaymentIntent intent,
            @ObjCBlock(name = "call_resolveCurrencyAmountForSendPaymentWithCompletion") Block_resolveCurrencyAmountForSendPaymentWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveNoteForSendPayment:withCompletion:")
    default void resolveNoteForSendPaymentWithCompletion(INSendPaymentIntent intent,
            @ObjCBlock(name = "call_resolveNoteForSendPaymentWithCompletion") Block_resolveNoteForSendPaymentWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolvePayeeForSendPayment:withCompletion:")
    default void resolvePayeeForSendPaymentWithCompletion(INSendPaymentIntent intent,
            @ObjCBlock(name = "call_resolvePayeeForSendPaymentWithCompletion") Block_resolvePayeeForSendPaymentWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSendPaymentCompletion {
        @Generated
        void call_confirmSendPaymentCompletion(INSendPaymentIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSendPaymentCompletion {
        @Generated
        void call_handleSendPaymentCompletion(INSendPaymentIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveCurrencyAmountForSendPaymentWithCompletion {
        @Generated
        void call_resolveCurrencyAmountForSendPaymentWithCompletion(INCurrencyAmountResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveNoteForSendPaymentWithCompletion {
        @Generated
        void call_resolveNoteForSendPaymentWithCompletion(INStringResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePayeeForSendPaymentWithCompletion {
        @Generated
        void call_resolvePayeeForSendPaymentWithCompletion(INPersonResolutionResult arg0);
    }

    @Generated
    @IsOptional
    @Selector("resolveCurrencyAmountForSendPayment:completion:")
    default void resolveCurrencyAmountForSendPaymentCompletion(INSendPaymentIntent intent,
            @ObjCBlock(name = "call_resolveCurrencyAmountForSendPaymentCompletion") Block_resolveCurrencyAmountForSendPaymentCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveCurrencyAmountForSendPaymentCompletion {
        @Generated
        void call_resolveCurrencyAmountForSendPaymentCompletion(INSendPaymentCurrencyAmountResolutionResult arg0);
    }

    @Generated
    @IsOptional
    @Selector("resolvePayeeForSendPayment:completion:")
    default void resolvePayeeForSendPaymentCompletion(INSendPaymentIntent intent,
            @ObjCBlock(name = "call_resolvePayeeForSendPaymentCompletion") Block_resolvePayeeForSendPaymentCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePayeeForSendPaymentCompletion {
        @Generated
        void call_resolvePayeeForSendPaymentCompletion(INSendPaymentPayeeResolutionResult arg0);
    }
}
