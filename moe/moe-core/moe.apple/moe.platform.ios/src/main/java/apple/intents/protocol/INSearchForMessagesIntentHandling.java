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
import apple.intents.INDateComponentsRangeResolutionResult;
import apple.intents.INMessageAttributeOptionsResolutionResult;
import apple.intents.INPersonResolutionResult;
import apple.intents.INSearchForMessagesIntent;
import apple.intents.INSearchForMessagesIntentResponse;
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
 * Protocol to declare support for handling an INSearchForMessagesIntent. By implementing this protocol, a class can provide logic for resolving, confirming and handling the intent.
 * 
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and confirmation methods are optional. The handling method is always called last, after resolving and confirming the intent.
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INSearchForMessagesIntentHandling")
public interface INSearchForMessagesIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * Called prior to asking the app to handle the intent. The app should return a response object that contains additional information about the intent, which may be relevant for the system to show the user prior to handling. If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no additional information relevant to this intent.
     * 
     * @param  intent The input intent
     * @param  completion The response block contains an INSearchForMessagesIntentResponse containing additional details about the intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INSearchForMessagesIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmSearchForMessages:completion:")
    default void confirmSearchForMessagesCompletion(INSearchForMessagesIntent intent,
            @ObjCBlock(name = "call_confirmSearchForMessagesCompletion") Block_confirmSearchForMessagesCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Handling method - Execute the task represented by the INSearchForMessagesIntent that's passed in
     * 
     * Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param  intent The input intent
     * @param  completion The response handling block takes a INSearchForMessagesIntentResponse containing the details of the result of having executed the intent
     * 
     * @see  INSearchForMessagesIntentResponse
     */
    @Generated
    @Selector("handleSearchForMessages:completion:")
    void handleSearchForMessagesCompletion(INSearchForMessagesIntent intent,
            @ObjCBlock(name = "call_handleSearchForMessagesCompletion") Block_handleSearchForMessagesCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveAttributesForSearchForMessages:withCompletion:")
    default void resolveAttributesForSearchForMessagesWithCompletion(INSearchForMessagesIntent intent,
            @ObjCBlock(name = "call_resolveAttributesForSearchForMessagesWithCompletion") Block_resolveAttributesForSearchForMessagesWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveDateTimeRangeForSearchForMessages:withCompletion:")
    default void resolveDateTimeRangeForSearchForMessagesWithCompletion(INSearchForMessagesIntent intent,
            @ObjCBlock(name = "call_resolveDateTimeRangeForSearchForMessagesWithCompletion") Block_resolveDateTimeRangeForSearchForMessagesWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveGroupNamesForSearchForMessages:withCompletion:")
    default void resolveGroupNamesForSearchForMessagesWithCompletion(INSearchForMessagesIntent intent,
            @ObjCBlock(name = "call_resolveGroupNamesForSearchForMessagesWithCompletion") Block_resolveGroupNamesForSearchForMessagesWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Resolution methods - Determine if this intent is ready for the next step (confirmation)
     * 
     * Called to make sure the app extension is capable of handling this intent in its current form. This method is for validating if the intent needs any further fleshing out.
     * 
     * @param  intent The input intent
     * @param  completion The response block contains an INIntentResolutionResult for the parameter being resolved
     * 
     * @see INIntentResolutionResult
     */
    @Generated
    @IsOptional
    @Selector("resolveRecipientsForSearchForMessages:withCompletion:")
    default void resolveRecipientsForSearchForMessagesWithCompletion(INSearchForMessagesIntent intent,
            @ObjCBlock(name = "call_resolveRecipientsForSearchForMessagesWithCompletion") Block_resolveRecipientsForSearchForMessagesWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveSendersForSearchForMessages:withCompletion:")
    default void resolveSendersForSearchForMessagesWithCompletion(INSearchForMessagesIntent intent,
            @ObjCBlock(name = "call_resolveSendersForSearchForMessagesWithCompletion") Block_resolveSendersForSearchForMessagesWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSearchForMessagesCompletion {
        @Generated
        void call_confirmSearchForMessagesCompletion(INSearchForMessagesIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSearchForMessagesCompletion {
        @Generated
        void call_handleSearchForMessagesCompletion(INSearchForMessagesIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveAttributesForSearchForMessagesWithCompletion {
        @Generated
        void call_resolveAttributesForSearchForMessagesWithCompletion(
                INMessageAttributeOptionsResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveDateTimeRangeForSearchForMessagesWithCompletion {
        @Generated
        void call_resolveDateTimeRangeForSearchForMessagesWithCompletion(
                INDateComponentsRangeResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveGroupNamesForSearchForMessagesWithCompletion {
        @Generated
        void call_resolveGroupNamesForSearchForMessagesWithCompletion(
                NSArray<? extends INStringResolutionResult> resolutionResults);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveRecipientsForSearchForMessagesWithCompletion {
        @Generated
        void call_resolveRecipientsForSearchForMessagesWithCompletion(
                NSArray<? extends INPersonResolutionResult> resolutionResults);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveSendersForSearchForMessagesWithCompletion {
        @Generated
        void call_resolveSendersForSearchForMessagesWithCompletion(
                NSArray<? extends INPersonResolutionResult> resolutionResults);
    }

    @Generated
    @IsOptional
    @Selector("resolveSpeakableGroupNamesForSearchForMessages:withCompletion:")
    default void resolveSpeakableGroupNamesForSearchForMessagesWithCompletion(INSearchForMessagesIntent intent,
            @ObjCBlock(name = "call_resolveSpeakableGroupNamesForSearchForMessagesWithCompletion") Block_resolveSpeakableGroupNamesForSearchForMessagesWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveSpeakableGroupNamesForSearchForMessagesWithCompletion {
        @Generated
        void call_resolveSpeakableGroupNamesForSearchForMessagesWithCompletion(
                NSArray<? extends INSpeakableStringResolutionResult> resolutionResults);
    }
}
