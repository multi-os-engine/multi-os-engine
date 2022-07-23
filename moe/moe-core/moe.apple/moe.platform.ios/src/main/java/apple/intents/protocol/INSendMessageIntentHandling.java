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
import apple.intents.INOutgoingMessageTypeResolutionResult;
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

/**
 * Protocol to declare support for handling an INSendMessageIntent. By implementing this protocol, a class can provide
 * logic for resolving, confirming and handling the intent.
 * <p>
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INSendMessageIntentHandling")
public interface INSendMessageIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * <p>
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     *
     * @param intent     The input intent
     * @param completion The response block contains an INSendMessageIntentResponse containing additional details about
     *                   the intent that may be relevant for the system to show the user prior to handling.
     * @see INSendMessageIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmSendMessage:completion:")
    default void confirmSendMessageCompletion(INSendMessageIntent intent,
            @ObjCBlock(name = "call_confirmSendMessageCompletion") Block_confirmSendMessageCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Handling method - Execute the task represented by the INSendMessageIntent that's passed in
     * <p>
     * Called to actually execute the intent. The app must return a response for this intent.
     *
     * @param intent     The input intent
     * @param completion The response handling block takes a INSendMessageIntentResponse containing the details of the
     *                   result of having executed the intent
     * @see INSendMessageIntentResponse
     */
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

    /**
     * Resolution methods - Determine if this intent is ready for the next step (confirmation)
     * <p>
     * Called to make sure the app extension is capable of handling this intent in its current form. This method is for
     * validating if the intent needs any further fleshing out.
     *
     * @param intent     The input intent
     * @param completion The response block contains an INIntentResolutionResult for the parameter being resolved
     * @see INIntentResolutionResult
     */
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
        void call_confirmSendMessageCompletion(INSendMessageIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSendMessageCompletion {
        @Generated
        void call_handleSendMessageCompletion(INSendMessageIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveContentForSendMessageWithCompletion {
        @Generated
        void call_resolveContentForSendMessageWithCompletion(INStringResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveGroupNameForSendMessageWithCompletion {
        @Generated
        void call_resolveGroupNameForSendMessageWithCompletion(INStringResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveRecipientsForSendMessageWithCompletion {
        @Generated
        void call_resolveRecipientsForSendMessageWithCompletion(
                NSArray<? extends INPersonResolutionResult> resolutionResults);
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
                NSArray<? extends INSendMessageRecipientResolutionResult> resolutionResults);
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
        void call_resolveSpeakableGroupNameForSendMessageWithCompletion(
                INSpeakableStringResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveOutgoingMessageTypeForSendMessage:withCompletion:")
    default void resolveOutgoingMessageTypeForSendMessageWithCompletion(INSendMessageIntent intent,
            @ObjCBlock(name = "call_resolveOutgoingMessageTypeForSendMessageWithCompletion") Block_resolveOutgoingMessageTypeForSendMessageWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveOutgoingMessageTypeForSendMessageWithCompletion {
        @Generated
        void call_resolveOutgoingMessageTypeForSendMessageWithCompletion(
                INOutgoingMessageTypeResolutionResult resolutionResult);
    }
}
