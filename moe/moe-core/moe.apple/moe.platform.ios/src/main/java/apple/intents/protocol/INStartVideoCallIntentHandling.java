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
import apple.intents.INStartVideoCallIntent;
import apple.intents.INStartVideoCallIntentResponse;
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
@ObjCProtocolName("INStartVideoCallIntentHandling")
public interface INStartVideoCallIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmStartVideoCall:completion:")
    default void confirmStartVideoCallCompletion(INStartVideoCallIntent intent,
            @ObjCBlock(name = "call_confirmStartVideoCallCompletion") Block_confirmStartVideoCallCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("handleStartVideoCall:completion:")
    void handleStartVideoCallCompletion(INStartVideoCallIntent intent,
            @ObjCBlock(name = "call_handleStartVideoCallCompletion") Block_handleStartVideoCallCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveContactsForStartVideoCall:withCompletion:")
    default void resolveContactsForStartVideoCallWithCompletion(INStartVideoCallIntent intent,
            @ObjCBlock(name = "call_resolveContactsForStartVideoCallWithCompletion") Block_resolveContactsForStartVideoCallWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmStartVideoCallCompletion {
        @Generated
        void call_confirmStartVideoCallCompletion(INStartVideoCallIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleStartVideoCallCompletion {
        @Generated
        void call_handleStartVideoCallCompletion(INStartVideoCallIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveContactsForStartVideoCallWithCompletion {
        @Generated
        void call_resolveContactsForStartVideoCallWithCompletion(
                NSArray<? extends INPersonResolutionResult> resolutionResults);
    }
}
