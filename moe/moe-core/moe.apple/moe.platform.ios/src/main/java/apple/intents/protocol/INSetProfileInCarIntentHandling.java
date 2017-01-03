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
import apple.intents.INIntegerResolutionResult;
import apple.intents.INSetProfileInCarIntent;
import apple.intents.INSetProfileInCarIntentResponse;
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
@ObjCProtocolName("INSetProfileInCarIntentHandling")
public interface INSetProfileInCarIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmSetProfileInCar:completion:")
    default void confirmSetProfileInCarCompletion(INSetProfileInCarIntent intent,
            @ObjCBlock(name = "call_confirmSetProfileInCarCompletion") Block_confirmSetProfileInCarCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("handleSetProfileInCar:completion:")
    void handleSetProfileInCarCompletion(INSetProfileInCarIntent intent,
            @ObjCBlock(name = "call_handleSetProfileInCarCompletion") Block_handleSetProfileInCarCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveDefaultProfileForSetProfileInCar:withCompletion:")
    default void resolveDefaultProfileForSetProfileInCarWithCompletion(INSetProfileInCarIntent intent,
            @ObjCBlock(name = "call_resolveDefaultProfileForSetProfileInCarWithCompletion") Block_resolveDefaultProfileForSetProfileInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveProfileNameForSetProfileInCar:withCompletion:")
    default void resolveProfileNameForSetProfileInCarWithCompletion(INSetProfileInCarIntent intent,
            @ObjCBlock(name = "call_resolveProfileNameForSetProfileInCarWithCompletion") Block_resolveProfileNameForSetProfileInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveProfileNumberForSetProfileInCar:withCompletion:")
    default void resolveProfileNumberForSetProfileInCarWithCompletion(INSetProfileInCarIntent intent,
            @ObjCBlock(name = "call_resolveProfileNumberForSetProfileInCarWithCompletion") Block_resolveProfileNumberForSetProfileInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSetProfileInCarCompletion {
        @Generated
        void call_confirmSetProfileInCarCompletion(INSetProfileInCarIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSetProfileInCarCompletion {
        @Generated
        void call_handleSetProfileInCarCompletion(INSetProfileInCarIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveDefaultProfileForSetProfileInCarWithCompletion {
        @Generated
        void call_resolveDefaultProfileForSetProfileInCarWithCompletion(INBooleanResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveProfileNameForSetProfileInCarWithCompletion {
        @Generated
        void call_resolveProfileNameForSetProfileInCarWithCompletion(INStringResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveProfileNumberForSetProfileInCarWithCompletion {
        @Generated
        void call_resolveProfileNumberForSetProfileInCarWithCompletion(INIntegerResolutionResult arg0);
    }
}
