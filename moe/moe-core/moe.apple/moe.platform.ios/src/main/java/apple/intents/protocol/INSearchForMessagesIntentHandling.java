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
@ObjCProtocolName("INSearchForMessagesIntentHandling")
public interface INSearchForMessagesIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmSearchForMessages:completion:")
    default void confirmSearchForMessagesCompletion(INSearchForMessagesIntent intent,
            @ObjCBlock(name = "call_confirmSearchForMessagesCompletion") Block_confirmSearchForMessagesCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

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
        void call_confirmSearchForMessagesCompletion(INSearchForMessagesIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSearchForMessagesCompletion {
        @Generated
        void call_handleSearchForMessagesCompletion(INSearchForMessagesIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveAttributesForSearchForMessagesWithCompletion {
        @Generated
        void call_resolveAttributesForSearchForMessagesWithCompletion(INMessageAttributeOptionsResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveDateTimeRangeForSearchForMessagesWithCompletion {
        @Generated
        void call_resolveDateTimeRangeForSearchForMessagesWithCompletion(INDateComponentsRangeResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveGroupNamesForSearchForMessagesWithCompletion {
        @Generated
        void call_resolveGroupNamesForSearchForMessagesWithCompletion(NSArray<? extends INStringResolutionResult> arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveRecipientsForSearchForMessagesWithCompletion {
        @Generated
        void call_resolveRecipientsForSearchForMessagesWithCompletion(NSArray<? extends INPersonResolutionResult> arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveSendersForSearchForMessagesWithCompletion {
        @Generated
        void call_resolveSendersForSearchForMessagesWithCompletion(NSArray<? extends INPersonResolutionResult> arg0);
    }
}
