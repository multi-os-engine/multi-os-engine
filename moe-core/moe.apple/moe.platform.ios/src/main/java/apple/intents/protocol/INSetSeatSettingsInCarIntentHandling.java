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
import apple.intents.INSpeakableStringResolutionResult;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * Protocol to declare support for handling an INSetSeatSettingsInCarIntent. By implementing this protocol, a class can
 * provide logic for resolving, confirming and handling the intent.
 * 
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 * 
 * API-Since: 10.0
 * Deprecated-Since: 15.0
 * Deprecated-Message: INSetSeatSettingsInCarIntentHandling is deprecated. There is no replacement.
 */
@Deprecated
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INSetSeatSettingsInCarIntentHandling")
public interface INSetSeatSettingsInCarIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     * 
     * @param intent     The input intent
     * @param completion The response block contains an INSetSeatSettingsInCarIntentResponse containing additional
     *                   details about the intent that may be relevant for the system to show the user prior to
     *                   handling.
     * 
     * @see INSetSeatSettingsInCarIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmSetSeatSettingsInCar:completion:")
    default void confirmSetSeatSettingsInCarCompletion(@NotNull INSetSeatSettingsInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_confirmSetSeatSettingsInCarCompletion") Block_confirmSetSeatSettingsInCarCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Handling method - Execute the task represented by the INSetSeatSettingsInCarIntent that's passed in
     * 
     * Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param intent     The input intent
     * @param completion The response handling block takes a INSetSeatSettingsInCarIntentResponse containing the details
     *                   of the result of having executed the intent
     * 
     * @see INSetSeatSettingsInCarIntentResponse
     */
    @Generated
    @Selector("handleSetSeatSettingsInCar:completion:")
    void handleSetSeatSettingsInCarCompletion(@NotNull INSetSeatSettingsInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_handleSetSeatSettingsInCarCompletion") Block_handleSetSeatSettingsInCarCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveEnableCoolingForSetSeatSettingsInCar:withCompletion:")
    default void resolveEnableCoolingForSetSeatSettingsInCarWithCompletion(@NotNull INSetSeatSettingsInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveEnableCoolingForSetSeatSettingsInCarWithCompletion") Block_resolveEnableCoolingForSetSeatSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Resolution methods - Determine if this intent is ready for the next step (confirmation)
     * 
     * Called to make sure the app extension is capable of handling this intent in its current form. This method is for
     * validating if the intent needs any further fleshing out.
     * 
     * @param intent     The input intent
     * @param completion The response block contains an INIntentResolutionResult for the parameter being resolved
     * 
     * @see INIntentResolutionResult
     */
    @Generated
    @IsOptional
    @Selector("resolveEnableHeatingForSetSeatSettingsInCar:withCompletion:")
    default void resolveEnableHeatingForSetSeatSettingsInCarWithCompletion(@NotNull INSetSeatSettingsInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveEnableHeatingForSetSeatSettingsInCarWithCompletion") Block_resolveEnableHeatingForSetSeatSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveEnableMassageForSetSeatSettingsInCar:withCompletion:")
    default void resolveEnableMassageForSetSeatSettingsInCarWithCompletion(@NotNull INSetSeatSettingsInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveEnableMassageForSetSeatSettingsInCarWithCompletion") Block_resolveEnableMassageForSetSeatSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveLevelForSetSeatSettingsInCar:withCompletion:")
    default void resolveLevelForSetSeatSettingsInCarWithCompletion(@NotNull INSetSeatSettingsInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveLevelForSetSeatSettingsInCarWithCompletion") Block_resolveLevelForSetSeatSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveRelativeLevelSettingForSetSeatSettingsInCar:withCompletion:")
    default void resolveRelativeLevelSettingForSetSeatSettingsInCarWithCompletion(
            @NotNull INSetSeatSettingsInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveRelativeLevelSettingForSetSeatSettingsInCarWithCompletion") Block_resolveRelativeLevelSettingForSetSeatSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveSeatForSetSeatSettingsInCar:withCompletion:")
    default void resolveSeatForSetSeatSettingsInCarWithCompletion(@NotNull INSetSeatSettingsInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveSeatForSetSeatSettingsInCarWithCompletion") Block_resolveSeatForSetSeatSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSetSeatSettingsInCarCompletion {
        @Generated
        void call_confirmSetSeatSettingsInCarCompletion(@NotNull INSetSeatSettingsInCarIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSetSeatSettingsInCarCompletion {
        @Generated
        void call_handleSetSeatSettingsInCarCompletion(@NotNull INSetSeatSettingsInCarIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveEnableCoolingForSetSeatSettingsInCarWithCompletion {
        @Generated
        void call_resolveEnableCoolingForSetSeatSettingsInCarWithCompletion(
                @NotNull INBooleanResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveEnableHeatingForSetSeatSettingsInCarWithCompletion {
        @Generated
        void call_resolveEnableHeatingForSetSeatSettingsInCarWithCompletion(
                @NotNull INBooleanResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveEnableMassageForSetSeatSettingsInCarWithCompletion {
        @Generated
        void call_resolveEnableMassageForSetSeatSettingsInCarWithCompletion(
                @NotNull INBooleanResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveLevelForSetSeatSettingsInCarWithCompletion {
        @Generated
        void call_resolveLevelForSetSeatSettingsInCarWithCompletion(
                @NotNull INIntegerResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveRelativeLevelSettingForSetSeatSettingsInCarWithCompletion {
        @Generated
        void call_resolveRelativeLevelSettingForSetSeatSettingsInCarWithCompletion(
                @NotNull INRelativeSettingResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveSeatForSetSeatSettingsInCarWithCompletion {
        @Generated
        void call_resolveSeatForSetSeatSettingsInCarWithCompletion(@NotNull INCarSeatResolutionResult resolutionResult);
    }

    /**
     * API-Since: 12.0
     */
    @Generated
    @IsOptional
    @Selector("resolveCarNameForSetSeatSettingsInCar:withCompletion:")
    default void resolveCarNameForSetSeatSettingsInCarWithCompletion(@NotNull INSetSeatSettingsInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveCarNameForSetSeatSettingsInCarWithCompletion") Block_resolveCarNameForSetSeatSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveCarNameForSetSeatSettingsInCarWithCompletion {
        @Generated
        void call_resolveCarNameForSetSeatSettingsInCarWithCompletion(
                @NotNull INSpeakableStringResolutionResult resolutionResult);
    }
}
