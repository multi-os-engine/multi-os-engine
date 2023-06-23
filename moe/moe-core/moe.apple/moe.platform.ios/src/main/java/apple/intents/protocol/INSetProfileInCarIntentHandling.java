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
import apple.intents.INSpeakableStringResolutionResult;
import apple.intents.INStringResolutionResult;
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
 * Protocol to declare support for handling an INSetProfileInCarIntent. By implementing this protocol, a class can
 * provide logic for resolving, confirming and handling the intent.
 * 
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 * 
 * API-Since: 10.0
 * Deprecated-Since: 15.0
 * Deprecated-Message: INSetProfileInCarIntentHandling is deprecated. There is no replacement.
 */
@Deprecated
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INSetProfileInCarIntentHandling")
public interface INSetProfileInCarIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     * 
     * @param intent     The input intent
     * @param completion The response block contains an INSetProfileInCarIntentResponse containing additional details
     *                   about the intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INSetProfileInCarIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmSetProfileInCar:completion:")
    default void confirmSetProfileInCarCompletion(@NotNull INSetProfileInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_confirmSetProfileInCarCompletion") Block_confirmSetProfileInCarCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Handling method - Execute the task represented by the INSetProfileInCarIntent that's passed in
     * 
     * Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param intent     The input intent
     * @param completion The response handling block takes a INSetProfileInCarIntentResponse containing the details of
     *                   the result of having executed the intent
     * 
     * @see INSetProfileInCarIntentResponse
     */
    @Generated
    @Selector("handleSetProfileInCar:completion:")
    void handleSetProfileInCarCompletion(@NotNull INSetProfileInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_handleSetProfileInCarCompletion") Block_handleSetProfileInCarCompletion completion);

    /**
     * API-Since: 10.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: The property doesn't need to be resolved
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("resolveDefaultProfileForSetProfileInCar:withCompletion:")
    default void resolveDefaultProfileForSetProfileInCarWithCompletion(@NotNull INSetProfileInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveDefaultProfileForSetProfileInCarWithCompletion") Block_resolveDefaultProfileForSetProfileInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 10.2
     */
    @Generated
    @IsOptional
    @Selector("resolveProfileNameForSetProfileInCar:withCompletion:")
    default void resolveProfileNameForSetProfileInCarWithCompletion(@NotNull INSetProfileInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveProfileNameForSetProfileInCarWithCompletion") Block_resolveProfileNameForSetProfileInCarWithCompletion completion) {
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
    @Selector("resolveProfileNumberForSetProfileInCar:withCompletion:")
    default void resolveProfileNumberForSetProfileInCarWithCompletion(@NotNull INSetProfileInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveProfileNumberForSetProfileInCarWithCompletion") Block_resolveProfileNumberForSetProfileInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSetProfileInCarCompletion {
        @Generated
        void call_confirmSetProfileInCarCompletion(@NotNull INSetProfileInCarIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSetProfileInCarCompletion {
        @Generated
        void call_handleSetProfileInCarCompletion(@NotNull INSetProfileInCarIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveDefaultProfileForSetProfileInCarWithCompletion {
        @Generated
        void call_resolveDefaultProfileForSetProfileInCarWithCompletion(
                @NotNull INBooleanResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveProfileNameForSetProfileInCarWithCompletion {
        @Generated
        void call_resolveProfileNameForSetProfileInCarWithCompletion(
                @NotNull INStringResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveProfileNumberForSetProfileInCarWithCompletion {
        @Generated
        void call_resolveProfileNumberForSetProfileInCarWithCompletion(
                @NotNull INIntegerResolutionResult resolutionResult);
    }

    /**
     * API-Since: 12.0
     */
    @Generated
    @IsOptional
    @Selector("resolveCarNameForSetProfileInCar:withCompletion:")
    default void resolveCarNameForSetProfileInCarWithCompletion(@NotNull INSetProfileInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveCarNameForSetProfileInCarWithCompletion") Block_resolveCarNameForSetProfileInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveCarNameForSetProfileInCarWithCompletion {
        @Generated
        void call_resolveCarNameForSetProfileInCarWithCompletion(
                @NotNull INSpeakableStringResolutionResult resolutionResult);
    }
}
