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
import apple.intents.INCarAirCirculationModeResolutionResult;
import apple.intents.INCarSeatResolutionResult;
import apple.intents.INDoubleResolutionResult;
import apple.intents.INIntegerResolutionResult;
import apple.intents.INRelativeSettingResolutionResult;
import apple.intents.INSetClimateSettingsInCarIntent;
import apple.intents.INSetClimateSettingsInCarIntentResponse;
import apple.intents.INSpeakableStringResolutionResult;
import apple.intents.INTemperatureResolutionResult;
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
@ObjCProtocolName("INSetClimateSettingsInCarIntentHandling")
public interface INSetClimateSettingsInCarIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmSetClimateSettingsInCar:completion:")
    default void confirmSetClimateSettingsInCarCompletion(INSetClimateSettingsInCarIntent intent,
            @ObjCBlock(name = "call_confirmSetClimateSettingsInCarCompletion") Block_confirmSetClimateSettingsInCarCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("handleSetClimateSettingsInCar:completion:")
    void handleSetClimateSettingsInCarCompletion(INSetClimateSettingsInCarIntent intent,
            @ObjCBlock(name = "call_handleSetClimateSettingsInCarCompletion") Block_handleSetClimateSettingsInCarCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveAirCirculationModeForSetClimateSettingsInCar:withCompletion:")
    default void resolveAirCirculationModeForSetClimateSettingsInCarWithCompletion(
            INSetClimateSettingsInCarIntent intent,
            @ObjCBlock(name = "call_resolveAirCirculationModeForSetClimateSettingsInCarWithCompletion") Block_resolveAirCirculationModeForSetClimateSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveClimateZoneForSetClimateSettingsInCar:withCompletion:")
    default void resolveClimateZoneForSetClimateSettingsInCarWithCompletion(INSetClimateSettingsInCarIntent intent,
            @ObjCBlock(name = "call_resolveClimateZoneForSetClimateSettingsInCarWithCompletion") Block_resolveClimateZoneForSetClimateSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveEnableAirConditionerForSetClimateSettingsInCar:withCompletion:")
    default void resolveEnableAirConditionerForSetClimateSettingsInCarWithCompletion(
            INSetClimateSettingsInCarIntent intent,
            @ObjCBlock(name = "call_resolveEnableAirConditionerForSetClimateSettingsInCarWithCompletion") Block_resolveEnableAirConditionerForSetClimateSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveEnableAutoModeForSetClimateSettingsInCar:withCompletion:")
    default void resolveEnableAutoModeForSetClimateSettingsInCarWithCompletion(INSetClimateSettingsInCarIntent intent,
            @ObjCBlock(name = "call_resolveEnableAutoModeForSetClimateSettingsInCarWithCompletion") Block_resolveEnableAutoModeForSetClimateSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveEnableClimateControlForSetClimateSettingsInCar:withCompletion:")
    default void resolveEnableClimateControlForSetClimateSettingsInCarWithCompletion(
            INSetClimateSettingsInCarIntent intent,
            @ObjCBlock(name = "call_resolveEnableClimateControlForSetClimateSettingsInCarWithCompletion") Block_resolveEnableClimateControlForSetClimateSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveEnableFanForSetClimateSettingsInCar:withCompletion:")
    default void resolveEnableFanForSetClimateSettingsInCarWithCompletion(INSetClimateSettingsInCarIntent intent,
            @ObjCBlock(name = "call_resolveEnableFanForSetClimateSettingsInCarWithCompletion") Block_resolveEnableFanForSetClimateSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveFanSpeedIndexForSetClimateSettingsInCar:withCompletion:")
    default void resolveFanSpeedIndexForSetClimateSettingsInCarWithCompletion(INSetClimateSettingsInCarIntent intent,
            @ObjCBlock(name = "call_resolveFanSpeedIndexForSetClimateSettingsInCarWithCompletion") Block_resolveFanSpeedIndexForSetClimateSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveFanSpeedPercentageForSetClimateSettingsInCar:withCompletion:")
    default void resolveFanSpeedPercentageForSetClimateSettingsInCarWithCompletion(
            INSetClimateSettingsInCarIntent intent,
            @ObjCBlock(name = "call_resolveFanSpeedPercentageForSetClimateSettingsInCarWithCompletion") Block_resolveFanSpeedPercentageForSetClimateSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveRelativeFanSpeedSettingForSetClimateSettingsInCar:withCompletion:")
    default void resolveRelativeFanSpeedSettingForSetClimateSettingsInCarWithCompletion(
            INSetClimateSettingsInCarIntent intent,
            @ObjCBlock(name = "call_resolveRelativeFanSpeedSettingForSetClimateSettingsInCarWithCompletion") Block_resolveRelativeFanSpeedSettingForSetClimateSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveRelativeTemperatureSettingForSetClimateSettingsInCar:withCompletion:")
    default void resolveRelativeTemperatureSettingForSetClimateSettingsInCarWithCompletion(
            INSetClimateSettingsInCarIntent intent,
            @ObjCBlock(name = "call_resolveRelativeTemperatureSettingForSetClimateSettingsInCarWithCompletion") Block_resolveRelativeTemperatureSettingForSetClimateSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveTemperatureForSetClimateSettingsInCar:withCompletion:")
    default void resolveTemperatureForSetClimateSettingsInCarWithCompletion(INSetClimateSettingsInCarIntent intent,
            @ObjCBlock(name = "call_resolveTemperatureForSetClimateSettingsInCarWithCompletion") Block_resolveTemperatureForSetClimateSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSetClimateSettingsInCarCompletion {
        @Generated
        void call_confirmSetClimateSettingsInCarCompletion(INSetClimateSettingsInCarIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSetClimateSettingsInCarCompletion {
        @Generated
        void call_handleSetClimateSettingsInCarCompletion(INSetClimateSettingsInCarIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveAirCirculationModeForSetClimateSettingsInCarWithCompletion {
        @Generated
        void call_resolveAirCirculationModeForSetClimateSettingsInCarWithCompletion(
                INCarAirCirculationModeResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveClimateZoneForSetClimateSettingsInCarWithCompletion {
        @Generated
        void call_resolveClimateZoneForSetClimateSettingsInCarWithCompletion(INCarSeatResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveEnableAirConditionerForSetClimateSettingsInCarWithCompletion {
        @Generated
        void call_resolveEnableAirConditionerForSetClimateSettingsInCarWithCompletion(INBooleanResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveEnableAutoModeForSetClimateSettingsInCarWithCompletion {
        @Generated
        void call_resolveEnableAutoModeForSetClimateSettingsInCarWithCompletion(INBooleanResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveEnableClimateControlForSetClimateSettingsInCarWithCompletion {
        @Generated
        void call_resolveEnableClimateControlForSetClimateSettingsInCarWithCompletion(INBooleanResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveEnableFanForSetClimateSettingsInCarWithCompletion {
        @Generated
        void call_resolveEnableFanForSetClimateSettingsInCarWithCompletion(INBooleanResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveFanSpeedIndexForSetClimateSettingsInCarWithCompletion {
        @Generated
        void call_resolveFanSpeedIndexForSetClimateSettingsInCarWithCompletion(INIntegerResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveFanSpeedPercentageForSetClimateSettingsInCarWithCompletion {
        @Generated
        void call_resolveFanSpeedPercentageForSetClimateSettingsInCarWithCompletion(INDoubleResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveRelativeFanSpeedSettingForSetClimateSettingsInCarWithCompletion {
        @Generated
        void call_resolveRelativeFanSpeedSettingForSetClimateSettingsInCarWithCompletion(
                INRelativeSettingResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveRelativeTemperatureSettingForSetClimateSettingsInCarWithCompletion {
        @Generated
        void call_resolveRelativeTemperatureSettingForSetClimateSettingsInCarWithCompletion(
                INRelativeSettingResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTemperatureForSetClimateSettingsInCarWithCompletion {
        @Generated
        void call_resolveTemperatureForSetClimateSettingsInCarWithCompletion(INTemperatureResolutionResult arg0);
    }

    @Generated
    @IsOptional
    @Selector("resolveCarNameForSetClimateSettingsInCar:withCompletion:")
    default void resolveCarNameForSetClimateSettingsInCarWithCompletion(INSetClimateSettingsInCarIntent intent,
            @ObjCBlock(name = "call_resolveCarNameForSetClimateSettingsInCarWithCompletion") Block_resolveCarNameForSetClimateSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveCarNameForSetClimateSettingsInCarWithCompletion {
        @Generated
        void call_resolveCarNameForSetClimateSettingsInCarWithCompletion(INSpeakableStringResolutionResult arg0);
    }
}
