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
import apple.intents.INCarDefrosterResolutionResult;
import apple.intents.INSetDefrosterSettingsInCarIntent;
import apple.intents.INSetDefrosterSettingsInCarIntentResponse;
import apple.intents.INSpeakableStringResolutionResult;
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
@ObjCProtocolName("INSetDefrosterSettingsInCarIntentHandling")
public interface INSetDefrosterSettingsInCarIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmSetDefrosterSettingsInCar:completion:")
    default void confirmSetDefrosterSettingsInCarCompletion(INSetDefrosterSettingsInCarIntent intent,
            @ObjCBlock(name = "call_confirmSetDefrosterSettingsInCarCompletion") Block_confirmSetDefrosterSettingsInCarCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("handleSetDefrosterSettingsInCar:completion:")
    void handleSetDefrosterSettingsInCarCompletion(INSetDefrosterSettingsInCarIntent intent,
            @ObjCBlock(name = "call_handleSetDefrosterSettingsInCarCompletion") Block_handleSetDefrosterSettingsInCarCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveDefrosterForSetDefrosterSettingsInCar:withCompletion:")
    default void resolveDefrosterForSetDefrosterSettingsInCarWithCompletion(INSetDefrosterSettingsInCarIntent intent,
            @ObjCBlock(name = "call_resolveDefrosterForSetDefrosterSettingsInCarWithCompletion") Block_resolveDefrosterForSetDefrosterSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveEnableForSetDefrosterSettingsInCar:withCompletion:")
    default void resolveEnableForSetDefrosterSettingsInCarWithCompletion(INSetDefrosterSettingsInCarIntent intent,
            @ObjCBlock(name = "call_resolveEnableForSetDefrosterSettingsInCarWithCompletion") Block_resolveEnableForSetDefrosterSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSetDefrosterSettingsInCarCompletion {
        @Generated
        void call_confirmSetDefrosterSettingsInCarCompletion(INSetDefrosterSettingsInCarIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSetDefrosterSettingsInCarCompletion {
        @Generated
        void call_handleSetDefrosterSettingsInCarCompletion(INSetDefrosterSettingsInCarIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveDefrosterForSetDefrosterSettingsInCarWithCompletion {
        @Generated
        void call_resolveDefrosterForSetDefrosterSettingsInCarWithCompletion(
                INCarDefrosterResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveEnableForSetDefrosterSettingsInCarWithCompletion {
        @Generated
        void call_resolveEnableForSetDefrosterSettingsInCarWithCompletion(INBooleanResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveCarNameForSetDefrosterSettingsInCar:withCompletion:")
    default void resolveCarNameForSetDefrosterSettingsInCarWithCompletion(INSetDefrosterSettingsInCarIntent intent,
            @ObjCBlock(name = "call_resolveCarNameForSetDefrosterSettingsInCarWithCompletion") Block_resolveCarNameForSetDefrosterSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveCarNameForSetDefrosterSettingsInCarWithCompletion {
        @Generated
        void call_resolveCarNameForSetDefrosterSettingsInCarWithCompletion(
                INSpeakableStringResolutionResult resolutionResult);
    }
}
