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
import apple.intents.INCarSeatResolutionResult;
import apple.intents.INIntegerResolutionResult;
import apple.intents.INRelativeSettingResolutionResult;
import apple.intents.INSetSeatSettingsInCarIntent;
import apple.intents.INSetSeatSettingsInCarIntentResponse;
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
@ObjCProtocolName("INSetSeatSettingsInCarIntentHandling")
public interface INSetSeatSettingsInCarIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmSetSeatSettingsInCar:completion:")
    default void confirmSetSeatSettingsInCarCompletion(INSetSeatSettingsInCarIntent intent,
            @ObjCBlock(name = "call_confirmSetSeatSettingsInCarCompletion") Block_confirmSetSeatSettingsInCarCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("handleSetSeatSettingsInCar:completion:")
    void handleSetSeatSettingsInCarCompletion(INSetSeatSettingsInCarIntent intent,
            @ObjCBlock(name = "call_handleSetSeatSettingsInCarCompletion") Block_handleSetSeatSettingsInCarCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveEnableCoolingForSetSeatSettingsInCar:withCompletion:")
    default void resolveEnableCoolingForSetSeatSettingsInCarWithCompletion(INSetSeatSettingsInCarIntent intent,
            @ObjCBlock(name = "call_resolveEnableCoolingForSetSeatSettingsInCarWithCompletion") Block_resolveEnableCoolingForSetSeatSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveEnableHeatingForSetSeatSettingsInCar:withCompletion:")
    default void resolveEnableHeatingForSetSeatSettingsInCarWithCompletion(INSetSeatSettingsInCarIntent intent,
            @ObjCBlock(name = "call_resolveEnableHeatingForSetSeatSettingsInCarWithCompletion") Block_resolveEnableHeatingForSetSeatSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveEnableMassageForSetSeatSettingsInCar:withCompletion:")
    default void resolveEnableMassageForSetSeatSettingsInCarWithCompletion(INSetSeatSettingsInCarIntent intent,
            @ObjCBlock(name = "call_resolveEnableMassageForSetSeatSettingsInCarWithCompletion") Block_resolveEnableMassageForSetSeatSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveLevelForSetSeatSettingsInCar:withCompletion:")
    default void resolveLevelForSetSeatSettingsInCarWithCompletion(INSetSeatSettingsInCarIntent intent,
            @ObjCBlock(name = "call_resolveLevelForSetSeatSettingsInCarWithCompletion") Block_resolveLevelForSetSeatSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveRelativeLevelSettingForSetSeatSettingsInCar:withCompletion:")
    default void resolveRelativeLevelSettingForSetSeatSettingsInCarWithCompletion(INSetSeatSettingsInCarIntent intent,
            @ObjCBlock(name = "call_resolveRelativeLevelSettingForSetSeatSettingsInCarWithCompletion") Block_resolveRelativeLevelSettingForSetSeatSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveSeatForSetSeatSettingsInCar:withCompletion:")
    default void resolveSeatForSetSeatSettingsInCarWithCompletion(INSetSeatSettingsInCarIntent intent,
            @ObjCBlock(name = "call_resolveSeatForSetSeatSettingsInCarWithCompletion") Block_resolveSeatForSetSeatSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSetSeatSettingsInCarCompletion {
        @Generated
        void call_confirmSetSeatSettingsInCarCompletion(INSetSeatSettingsInCarIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSetSeatSettingsInCarCompletion {
        @Generated
        void call_handleSetSeatSettingsInCarCompletion(INSetSeatSettingsInCarIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveEnableCoolingForSetSeatSettingsInCarWithCompletion {
        @Generated
        void call_resolveEnableCoolingForSetSeatSettingsInCarWithCompletion(INBooleanResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveEnableHeatingForSetSeatSettingsInCarWithCompletion {
        @Generated
        void call_resolveEnableHeatingForSetSeatSettingsInCarWithCompletion(INBooleanResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveEnableMassageForSetSeatSettingsInCarWithCompletion {
        @Generated
        void call_resolveEnableMassageForSetSeatSettingsInCarWithCompletion(INBooleanResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveLevelForSetSeatSettingsInCarWithCompletion {
        @Generated
        void call_resolveLevelForSetSeatSettingsInCarWithCompletion(INIntegerResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveRelativeLevelSettingForSetSeatSettingsInCarWithCompletion {
        @Generated
        void call_resolveRelativeLevelSettingForSetSeatSettingsInCarWithCompletion(
                INRelativeSettingResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveSeatForSetSeatSettingsInCarWithCompletion {
        @Generated
        void call_resolveSeatForSetSeatSettingsInCarWithCompletion(INCarSeatResolutionResult arg0);
    }
}
