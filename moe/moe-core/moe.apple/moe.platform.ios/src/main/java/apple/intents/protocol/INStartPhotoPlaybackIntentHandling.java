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
import apple.intents.INDateComponentsRangeResolutionResult;
import apple.intents.INPersonResolutionResult;
import apple.intents.INPlacemarkResolutionResult;
import apple.intents.INStartPhotoPlaybackIntent;
import apple.intents.INStartPhotoPlaybackIntentResponse;
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
 * Protocol to declare support for handling an INStartPhotoPlaybackIntent. By implementing this protocol, a class can
 * provide logic for resolving, confirming and handling the intent.
 * 
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 * 
 * API-Since: 10.0
 * Deprecated-Since: 15.0
 * Deprecated-Message: INStartPhotoPlaybackIntentHandling is deprecated. There is no replacement.
 */
@Deprecated
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INStartPhotoPlaybackIntentHandling")
public interface INStartPhotoPlaybackIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     * 
     * @param intent     The input intent
     * @param completion The response block contains an INStartPhotoPlaybackIntentResponse containing additional details
     *                   about the intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INStartPhotoPlaybackIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmStartPhotoPlayback:completion:")
    default void confirmStartPhotoPlaybackCompletion(@NotNull INStartPhotoPlaybackIntent intent,
            @NotNull @ObjCBlock(name = "call_confirmStartPhotoPlaybackCompletion") Block_confirmStartPhotoPlaybackCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Handling method - Execute the task represented by the INStartPhotoPlaybackIntent that's passed in
     * 
     * Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param intent     The input intent
     * @param completion The response handling block takes a INStartPhotoPlaybackIntentResponse containing the details
     *                   of the result of having executed the intent
     * 
     * @see INStartPhotoPlaybackIntentResponse
     */
    @Generated
    @Selector("handleStartPhotoPlayback:completion:")
    void handleStartPhotoPlaybackCompletion(@NotNull INStartPhotoPlaybackIntent intent,
            @NotNull @ObjCBlock(name = "call_handleStartPhotoPlaybackCompletion") Block_handleStartPhotoPlaybackCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveAlbumNameForStartPhotoPlayback:withCompletion:")
    default void resolveAlbumNameForStartPhotoPlaybackWithCompletion(@NotNull INStartPhotoPlaybackIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveAlbumNameForStartPhotoPlaybackWithCompletion") Block_resolveAlbumNameForStartPhotoPlaybackWithCompletion completion) {
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
    @Selector("resolveDateCreatedForStartPhotoPlayback:withCompletion:")
    default void resolveDateCreatedForStartPhotoPlaybackWithCompletion(@NotNull INStartPhotoPlaybackIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveDateCreatedForStartPhotoPlaybackWithCompletion") Block_resolveDateCreatedForStartPhotoPlaybackWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveLocationCreatedForStartPhotoPlayback:withCompletion:")
    default void resolveLocationCreatedForStartPhotoPlaybackWithCompletion(@NotNull INStartPhotoPlaybackIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveLocationCreatedForStartPhotoPlaybackWithCompletion") Block_resolveLocationCreatedForStartPhotoPlaybackWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolvePeopleInPhotoForStartPhotoPlayback:withCompletion:")
    default void resolvePeopleInPhotoForStartPhotoPlaybackWithCompletion(@NotNull INStartPhotoPlaybackIntent intent,
            @NotNull @ObjCBlock(name = "call_resolvePeopleInPhotoForStartPhotoPlaybackWithCompletion") Block_resolvePeopleInPhotoForStartPhotoPlaybackWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmStartPhotoPlaybackCompletion {
        @Generated
        void call_confirmStartPhotoPlaybackCompletion(@NotNull INStartPhotoPlaybackIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleStartPhotoPlaybackCompletion {
        @Generated
        void call_handleStartPhotoPlaybackCompletion(@NotNull INStartPhotoPlaybackIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveAlbumNameForStartPhotoPlaybackWithCompletion {
        @Generated
        void call_resolveAlbumNameForStartPhotoPlaybackWithCompletion(
                @NotNull INStringResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveDateCreatedForStartPhotoPlaybackWithCompletion {
        @Generated
        void call_resolveDateCreatedForStartPhotoPlaybackWithCompletion(
                @NotNull INDateComponentsRangeResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveLocationCreatedForStartPhotoPlaybackWithCompletion {
        @Generated
        void call_resolveLocationCreatedForStartPhotoPlaybackWithCompletion(
                @NotNull INPlacemarkResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePeopleInPhotoForStartPhotoPlaybackWithCompletion {
        @Generated
        void call_resolvePeopleInPhotoForStartPhotoPlaybackWithCompletion(
                @NotNull NSArray<? extends INPersonResolutionResult> resolutionResults);
    }
}
