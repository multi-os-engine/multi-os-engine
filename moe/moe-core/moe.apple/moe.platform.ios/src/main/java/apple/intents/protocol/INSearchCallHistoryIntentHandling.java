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

import apple.intents.INBooleanResolutionResult;
import apple.intents.INCallRecordTypeOptionsResolutionResult;
import apple.intents.INCallRecordTypeResolutionResult;
import apple.intents.INDateComponentsRangeResolutionResult;
import apple.intents.INPersonResolutionResult;
import apple.intents.INSearchCallHistoryIntent;
import apple.intents.INSearchCallHistoryIntentResponse;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * @abstract Protocol to declare support for handling an INSearchCallHistoryIntent. By implementing this protocol, a class can provide logic for resolving, confirming and handling the intent.
 * @discussion The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and confirmation methods are optional. The handling method is always called last, after resolving and confirming the intent.
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INSearchCallHistoryIntentHandling")
public interface INSearchCallHistoryIntentHandling {
    /**
     * @abstract Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * @discussion Called prior to asking the app to handle the intent. The app should return a response object that contains additional information about the intent, which may be relevant for the system to show the user prior to handling. If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no additional information relevant to this intent.
     * 
     * @param  intent The input intent
     * @param  completion The response block contains an INSearchCallHistoryIntentResponse containing additional details about the intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INSearchCallHistoryIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmSearchCallHistory:completion:")
    default void confirmSearchCallHistoryCompletion(INSearchCallHistoryIntent intent,
            @ObjCBlock(name = "call_confirmSearchCallHistoryCompletion") Block_confirmSearchCallHistoryCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @abstract Handling method - Execute the task represented by the INSearchCallHistoryIntent that's passed in
     * @discussion Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param  intent The input intent
     * @param  completion The response handling block takes a INSearchCallHistoryIntentResponse containing the details of the result of having executed the intent
     * 
     * @see  INSearchCallHistoryIntentResponse
     */
    @Generated
    @Selector("handleSearchCallHistory:completion:")
    void handleSearchCallHistoryCompletion(INSearchCallHistoryIntent intent,
            @ObjCBlock(name = "call_handleSearchCallHistoryCompletion") Block_handleSearchCallHistoryCompletion completion);

    /**
     * @abstract Resolution methods - Determine if this intent is ready for the next step (confirmation)
     * @discussion Called to make sure the app extension is capable of handling this intent in its current form. This method is for validating if the intent needs any further fleshing out.
     * 
     * @param  intent The input intent
     * @param  completion The response block contains an INIntentResolutionResult for the parameter being resolved
     * 
     * @see INIntentResolutionResult
     */
    @Generated
    @IsOptional
    @Selector("resolveCallTypeForSearchCallHistory:withCompletion:")
    default void resolveCallTypeForSearchCallHistoryWithCompletion(INSearchCallHistoryIntent intent,
            @ObjCBlock(name = "call_resolveCallTypeForSearchCallHistoryWithCompletion") Block_resolveCallTypeForSearchCallHistoryWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveDateCreatedForSearchCallHistory:withCompletion:")
    default void resolveDateCreatedForSearchCallHistoryWithCompletion(INSearchCallHistoryIntent intent,
            @ObjCBlock(name = "call_resolveDateCreatedForSearchCallHistoryWithCompletion") Block_resolveDateCreatedForSearchCallHistoryWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveRecipientForSearchCallHistory:withCompletion:")
    default void resolveRecipientForSearchCallHistoryWithCompletion(INSearchCallHistoryIntent intent,
            @ObjCBlock(name = "call_resolveRecipientForSearchCallHistoryWithCompletion") Block_resolveRecipientForSearchCallHistoryWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSearchCallHistoryCompletion {
        @Generated
        void call_confirmSearchCallHistoryCompletion(INSearchCallHistoryIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSearchCallHistoryCompletion {
        @Generated
        void call_handleSearchCallHistoryCompletion(INSearchCallHistoryIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveCallTypeForSearchCallHistoryWithCompletion {
        @Generated
        void call_resolveCallTypeForSearchCallHistoryWithCompletion(INCallRecordTypeResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveDateCreatedForSearchCallHistoryWithCompletion {
        @Generated
        void call_resolveDateCreatedForSearchCallHistoryWithCompletion(
                INDateComponentsRangeResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveRecipientForSearchCallHistoryWithCompletion {
        @Generated
        void call_resolveRecipientForSearchCallHistoryWithCompletion(INPersonResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveCallTypesForSearchCallHistory:withCompletion:")
    default void resolveCallTypesForSearchCallHistoryWithCompletion(INSearchCallHistoryIntent intent,
            @ObjCBlock(name = "call_resolveCallTypesForSearchCallHistoryWithCompletion") Block_resolveCallTypesForSearchCallHistoryWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveCallTypesForSearchCallHistoryWithCompletion {
        @Generated
        void call_resolveCallTypesForSearchCallHistoryWithCompletion(
                INCallRecordTypeOptionsResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveUnseenForSearchCallHistory:withCompletion:")
    default void resolveUnseenForSearchCallHistoryWithCompletion(INSearchCallHistoryIntent intent,
            @ObjCBlock(name = "call_resolveUnseenForSearchCallHistoryWithCompletion") Block_resolveUnseenForSearchCallHistoryWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveUnseenForSearchCallHistoryWithCompletion {
        @Generated
        void call_resolveUnseenForSearchCallHistoryWithCompletion(INBooleanResolutionResult resolutionResult);
    }
}
