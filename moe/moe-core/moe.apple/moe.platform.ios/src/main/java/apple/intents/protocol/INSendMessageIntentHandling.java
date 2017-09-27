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

import apple.foundation.NSArray;
import apple.intents.INPersonResolutionResult;
import apple.intents.INSendMessageIntent;
import apple.intents.INSendMessageIntentResponse;
import apple.intents.INSendMessageRecipientResolutionResult;
import apple.intents.INSpeakableStringResolutionResult;
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
@ObjCProtocolName("INSendMessageIntentHandling")
public interface INSendMessageIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmSendMessage:completion:")
    default void confirmSendMessageCompletion(INSendMessageIntent intent,
            @ObjCBlock(name = "call_confirmSendMessageCompletion") Block_confirmSendMessageCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("handleSendMessage:completion:")
    void handleSendMessageCompletion(INSendMessageIntent intent,
            @ObjCBlock(name = "call_handleSendMessageCompletion") Block_handleSendMessageCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveContentForSendMessage:withCompletion:")
    default void resolveContentForSendMessageWithCompletion(INSendMessageIntent intent,
            @ObjCBlock(name = "call_resolveContentForSendMessageWithCompletion") Block_resolveContentForSendMessageWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveGroupNameForSendMessage:withCompletion:")
    default void resolveGroupNameForSendMessageWithCompletion(INSendMessageIntent intent,
            @ObjCBlock(name = "call_resolveGroupNameForSendMessageWithCompletion") Block_resolveGroupNameForSendMessageWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveRecipientsForSendMessage:withCompletion:")
    default void resolveRecipientsForSendMessageWithCompletion(INSendMessageIntent intent,
            @ObjCBlock(name = "call_resolveRecipientsForSendMessageWithCompletion") Block_resolveRecipientsForSendMessageWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSendMessageCompletion {
        @Generated
        void call_confirmSendMessageCompletion(INSendMessageIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSendMessageCompletion {
        @Generated
        void call_handleSendMessageCompletion(INSendMessageIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveContentForSendMessageWithCompletion {
        @Generated
        void call_resolveContentForSendMessageWithCompletion(INStringResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveGroupNameForSendMessageWithCompletion {
        @Generated
        void call_resolveGroupNameForSendMessageWithCompletion(INStringResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveRecipientsForSendMessageWithCompletion {
        @Generated
        void call_resolveRecipientsForSendMessageWithCompletion(NSArray<? extends INPersonResolutionResult> arg0);
    }

    @Generated
    @IsOptional
    @Selector("resolveRecipientsForSendMessage:completion:")
    default void resolveRecipientsForSendMessageCompletion(INSendMessageIntent intent,
            @ObjCBlock(name = "call_resolveRecipientsForSendMessageCompletion") Block_resolveRecipientsForSendMessageCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveRecipientsForSendMessageCompletion {
        @Generated
        void call_resolveRecipientsForSendMessageCompletion(
                NSArray<? extends INSendMessageRecipientResolutionResult> arg0);
    }

    @Generated
    @IsOptional
    @Selector("resolveSpeakableGroupNameForSendMessage:withCompletion:")
    default void resolveSpeakableGroupNameForSendMessageWithCompletion(INSendMessageIntent intent,
            @ObjCBlock(name = "call_resolveSpeakableGroupNameForSendMessageWithCompletion") Block_resolveSpeakableGroupNameForSendMessageWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveSpeakableGroupNameForSendMessageWithCompletion {
        @Generated
        void call_resolveSpeakableGroupNameForSendMessageWithCompletion(INSpeakableStringResolutionResult arg0);
    }
}
