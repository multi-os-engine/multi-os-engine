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

import apple.intents.INCarAudioSourceResolutionResult;
import apple.intents.INRelativeReferenceResolutionResult;
import apple.intents.INSetAudioSourceInCarIntent;
import apple.intents.INSetAudioSourceInCarIntentResponse;
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
@ObjCProtocolName("INSetAudioSourceInCarIntentHandling")
public interface INSetAudioSourceInCarIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmSetAudioSourceInCar:completion:")
    default void confirmSetAudioSourceInCarCompletion(INSetAudioSourceInCarIntent intent,
            @ObjCBlock(name = "call_confirmSetAudioSourceInCarCompletion") Block_confirmSetAudioSourceInCarCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("handleSetAudioSourceInCar:completion:")
    void handleSetAudioSourceInCarCompletion(INSetAudioSourceInCarIntent intent,
            @ObjCBlock(name = "call_handleSetAudioSourceInCarCompletion") Block_handleSetAudioSourceInCarCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveAudioSourceForSetAudioSourceInCar:withCompletion:")
    default void resolveAudioSourceForSetAudioSourceInCarWithCompletion(INSetAudioSourceInCarIntent intent,
            @ObjCBlock(name = "call_resolveAudioSourceForSetAudioSourceInCarWithCompletion") Block_resolveAudioSourceForSetAudioSourceInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveRelativeAudioSourceReferenceForSetAudioSourceInCar:withCompletion:")
    default void resolveRelativeAudioSourceReferenceForSetAudioSourceInCarWithCompletion(
            INSetAudioSourceInCarIntent intent,
            @ObjCBlock(name = "call_resolveRelativeAudioSourceReferenceForSetAudioSourceInCarWithCompletion") Block_resolveRelativeAudioSourceReferenceForSetAudioSourceInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSetAudioSourceInCarCompletion {
        @Generated
        void call_confirmSetAudioSourceInCarCompletion(INSetAudioSourceInCarIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSetAudioSourceInCarCompletion {
        @Generated
        void call_handleSetAudioSourceInCarCompletion(INSetAudioSourceInCarIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveAudioSourceForSetAudioSourceInCarWithCompletion {
        @Generated
        void call_resolveAudioSourceForSetAudioSourceInCarWithCompletion(
                INCarAudioSourceResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveRelativeAudioSourceReferenceForSetAudioSourceInCarWithCompletion {
        @Generated
        void call_resolveRelativeAudioSourceReferenceForSetAudioSourceInCarWithCompletion(
                INRelativeReferenceResolutionResult resolutionResult);
    }
}
