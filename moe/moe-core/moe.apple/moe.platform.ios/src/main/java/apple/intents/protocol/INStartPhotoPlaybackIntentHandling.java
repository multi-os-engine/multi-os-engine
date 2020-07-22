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

@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INStartPhotoPlaybackIntentHandling")
public interface INStartPhotoPlaybackIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmStartPhotoPlayback:completion:")
    default void confirmStartPhotoPlaybackCompletion(INStartPhotoPlaybackIntent intent,
            @ObjCBlock(name = "call_confirmStartPhotoPlaybackCompletion") Block_confirmStartPhotoPlaybackCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("handleStartPhotoPlayback:completion:")
    void handleStartPhotoPlaybackCompletion(INStartPhotoPlaybackIntent intent,
            @ObjCBlock(name = "call_handleStartPhotoPlaybackCompletion") Block_handleStartPhotoPlaybackCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveAlbumNameForStartPhotoPlayback:withCompletion:")
    default void resolveAlbumNameForStartPhotoPlaybackWithCompletion(INStartPhotoPlaybackIntent intent,
            @ObjCBlock(name = "call_resolveAlbumNameForStartPhotoPlaybackWithCompletion") Block_resolveAlbumNameForStartPhotoPlaybackWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveDateCreatedForStartPhotoPlayback:withCompletion:")
    default void resolveDateCreatedForStartPhotoPlaybackWithCompletion(INStartPhotoPlaybackIntent intent,
            @ObjCBlock(name = "call_resolveDateCreatedForStartPhotoPlaybackWithCompletion") Block_resolveDateCreatedForStartPhotoPlaybackWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveLocationCreatedForStartPhotoPlayback:withCompletion:")
    default void resolveLocationCreatedForStartPhotoPlaybackWithCompletion(INStartPhotoPlaybackIntent intent,
            @ObjCBlock(name = "call_resolveLocationCreatedForStartPhotoPlaybackWithCompletion") Block_resolveLocationCreatedForStartPhotoPlaybackWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolvePeopleInPhotoForStartPhotoPlayback:withCompletion:")
    default void resolvePeopleInPhotoForStartPhotoPlaybackWithCompletion(INStartPhotoPlaybackIntent intent,
            @ObjCBlock(name = "call_resolvePeopleInPhotoForStartPhotoPlaybackWithCompletion") Block_resolvePeopleInPhotoForStartPhotoPlaybackWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmStartPhotoPlaybackCompletion {
        @Generated
        void call_confirmStartPhotoPlaybackCompletion(INStartPhotoPlaybackIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleStartPhotoPlaybackCompletion {
        @Generated
        void call_handleStartPhotoPlaybackCompletion(INStartPhotoPlaybackIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveAlbumNameForStartPhotoPlaybackWithCompletion {
        @Generated
        void call_resolveAlbumNameForStartPhotoPlaybackWithCompletion(INStringResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveDateCreatedForStartPhotoPlaybackWithCompletion {
        @Generated
        void call_resolveDateCreatedForStartPhotoPlaybackWithCompletion(
                INDateComponentsRangeResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveLocationCreatedForStartPhotoPlaybackWithCompletion {
        @Generated
        void call_resolveLocationCreatedForStartPhotoPlaybackWithCompletion(
                INPlacemarkResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePeopleInPhotoForStartPhotoPlaybackWithCompletion {
        @Generated
        void call_resolvePeopleInPhotoForStartPhotoPlaybackWithCompletion(
                NSArray<? extends INPersonResolutionResult> resolutionResults);
    }
}
