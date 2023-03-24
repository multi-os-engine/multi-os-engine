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
import apple.intents.INSearchForPhotosIntent;
import apple.intents.INSearchForPhotosIntentResponse;
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
 * Protocol to declare support for handling an INSearchForPhotosIntent. By implementing this protocol, a class can
 * provide logic for resolving, confirming and handling the intent.
 * 
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 * 
 * API-Since: 10.0
 * Deprecated-Since: 15.0
 * Deprecated-Message: INSearchForPhotosIntentHandling is deprecated. There is no replacement.
 */
@Deprecated
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INSearchForPhotosIntentHandling")
public interface INSearchForPhotosIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     * 
     * @param intent     The input intent
     * @param completion The response block contains an INSearchForPhotosIntentResponse containing additional details
     *                   about the intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INSearchForPhotosIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmSearchForPhotos:completion:")
    default void confirmSearchForPhotosCompletion(@NotNull INSearchForPhotosIntent intent,
            @NotNull @ObjCBlock(name = "call_confirmSearchForPhotosCompletion") Block_confirmSearchForPhotosCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Handling method - Execute the task represented by the INSearchForPhotosIntent that's passed in
     * 
     * Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param intent     The input intent
     * @param completion The response handling block takes a INSearchForPhotosIntentResponse containing the details of
     *                   the result of having executed the intent
     * 
     * @see INSearchForPhotosIntentResponse
     */
    @Generated
    @Selector("handleSearchForPhotos:completion:")
    void handleSearchForPhotosCompletion(@NotNull INSearchForPhotosIntent intent,
            @NotNull @ObjCBlock(name = "call_handleSearchForPhotosCompletion") Block_handleSearchForPhotosCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveAlbumNameForSearchForPhotos:withCompletion:")
    default void resolveAlbumNameForSearchForPhotosWithCompletion(@NotNull INSearchForPhotosIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveAlbumNameForSearchForPhotosWithCompletion") Block_resolveAlbumNameForSearchForPhotosWithCompletion completion) {
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
    @Selector("resolveDateCreatedForSearchForPhotos:withCompletion:")
    default void resolveDateCreatedForSearchForPhotosWithCompletion(@NotNull INSearchForPhotosIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveDateCreatedForSearchForPhotosWithCompletion") Block_resolveDateCreatedForSearchForPhotosWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveLocationCreatedForSearchForPhotos:withCompletion:")
    default void resolveLocationCreatedForSearchForPhotosWithCompletion(@NotNull INSearchForPhotosIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveLocationCreatedForSearchForPhotosWithCompletion") Block_resolveLocationCreatedForSearchForPhotosWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolvePeopleInPhotoForSearchForPhotos:withCompletion:")
    default void resolvePeopleInPhotoForSearchForPhotosWithCompletion(@NotNull INSearchForPhotosIntent intent,
            @NotNull @ObjCBlock(name = "call_resolvePeopleInPhotoForSearchForPhotosWithCompletion") Block_resolvePeopleInPhotoForSearchForPhotosWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSearchForPhotosCompletion {
        @Generated
        void call_confirmSearchForPhotosCompletion(@NotNull INSearchForPhotosIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSearchForPhotosCompletion {
        @Generated
        void call_handleSearchForPhotosCompletion(@NotNull INSearchForPhotosIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveAlbumNameForSearchForPhotosWithCompletion {
        @Generated
        void call_resolveAlbumNameForSearchForPhotosWithCompletion(@NotNull INStringResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveDateCreatedForSearchForPhotosWithCompletion {
        @Generated
        void call_resolveDateCreatedForSearchForPhotosWithCompletion(
                @NotNull INDateComponentsRangeResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveLocationCreatedForSearchForPhotosWithCompletion {
        @Generated
        void call_resolveLocationCreatedForSearchForPhotosWithCompletion(
                @NotNull INPlacemarkResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePeopleInPhotoForSearchForPhotosWithCompletion {
        @Generated
        void call_resolvePeopleInPhotoForSearchForPhotosWithCompletion(
                @NotNull NSArray<? extends INPersonResolutionResult> resolutionResults);
    }

    /**
     * API-Since: 11.0
     * Deprecated-Since: 15.0
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("resolveSearchTermsForSearchForPhotos:withCompletion:")
    default void resolveSearchTermsForSearchForPhotosWithCompletion(@NotNull INSearchForPhotosIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveSearchTermsForSearchForPhotosWithCompletion") Block_resolveSearchTermsForSearchForPhotosWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveSearchTermsForSearchForPhotosWithCompletion {
        @Generated
        void call_resolveSearchTermsForSearchForPhotosWithCompletion(
                @NotNull NSArray<? extends INStringResolutionResult> resolutionResults);
    }
}
