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
import apple.intents.INCallDestinationTypeResolutionResult;
import apple.intents.INPersonResolutionResult;
import apple.intents.INStartAudioCallIntent;
import apple.intents.INStartAudioCallIntentResponse;
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
@ObjCProtocolName("INStartAudioCallIntentHandling")
public interface INStartAudioCallIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmStartAudioCall:completion:")
    default void confirmStartAudioCallCompletion(INStartAudioCallIntent intent,
            @ObjCBlock(name = "call_confirmStartAudioCallCompletion") Block_confirmStartAudioCallCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("handleStartAudioCall:completion:")
    void handleStartAudioCallCompletion(INStartAudioCallIntent intent,
            @ObjCBlock(name = "call_handleStartAudioCallCompletion") Block_handleStartAudioCallCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveContactsForStartAudioCall:withCompletion:")
    default void resolveContactsForStartAudioCallWithCompletion(INStartAudioCallIntent intent,
            @ObjCBlock(name = "call_resolveContactsForStartAudioCallWithCompletion") Block_resolveContactsForStartAudioCallWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmStartAudioCallCompletion {
        @Generated
        void call_confirmStartAudioCallCompletion(INStartAudioCallIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleStartAudioCallCompletion {
        @Generated
        void call_handleStartAudioCallCompletion(INStartAudioCallIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveContactsForStartAudioCallWithCompletion {
        @Generated
        void call_resolveContactsForStartAudioCallWithCompletion(
                NSArray<? extends INPersonResolutionResult> resolutionResults);
    }

    @Generated
    @IsOptional
    @Selector("resolveDestinationTypeForStartAudioCall:withCompletion:")
    default void resolveDestinationTypeForStartAudioCallWithCompletion(INStartAudioCallIntent intent,
            @ObjCBlock(name = "call_resolveDestinationTypeForStartAudioCallWithCompletion") Block_resolveDestinationTypeForStartAudioCallWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveDestinationTypeForStartAudioCallWithCompletion {
        @Generated
        void call_resolveDestinationTypeForStartAudioCallWithCompletion(
                INCallDestinationTypeResolutionResult resolutionResult);
    }
}
