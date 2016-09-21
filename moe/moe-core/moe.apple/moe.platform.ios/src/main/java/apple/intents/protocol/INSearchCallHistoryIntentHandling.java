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

@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INSearchCallHistoryIntentHandling")
public interface INSearchCallHistoryIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmSearchCallHistory:completion:")
    default void confirmSearchCallHistoryCompletion(INSearchCallHistoryIntent intent,
            @ObjCBlock(name = "call_confirmSearchCallHistoryCompletion") Block_confirmSearchCallHistoryCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("handleSearchCallHistory:completion:")
    void handleSearchCallHistoryCompletion(INSearchCallHistoryIntent intent,
            @ObjCBlock(name = "call_handleSearchCallHistoryCompletion") Block_handleSearchCallHistoryCompletion completion);

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
        void call_confirmSearchCallHistoryCompletion(INSearchCallHistoryIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSearchCallHistoryCompletion {
        @Generated
        void call_handleSearchCallHistoryCompletion(INSearchCallHistoryIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveCallTypeForSearchCallHistoryWithCompletion {
        @Generated
        void call_resolveCallTypeForSearchCallHistoryWithCompletion(INCallRecordTypeResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveDateCreatedForSearchCallHistoryWithCompletion {
        @Generated
        void call_resolveDateCreatedForSearchCallHistoryWithCompletion(INDateComponentsRangeResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveRecipientForSearchCallHistoryWithCompletion {
        @Generated
        void call_resolveRecipientForSearchCallHistoryWithCompletion(INPersonResolutionResult arg0);
    }
}
