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

@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INSearchForPhotosIntentHandling")
public interface INSearchForPhotosIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmSearchForPhotos:completion:")
    default void confirmSearchForPhotosCompletion(INSearchForPhotosIntent intent,
            @ObjCBlock(name = "call_confirmSearchForPhotosCompletion") Block_confirmSearchForPhotosCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("handleSearchForPhotos:completion:")
    void handleSearchForPhotosCompletion(INSearchForPhotosIntent intent,
            @ObjCBlock(name = "call_handleSearchForPhotosCompletion") Block_handleSearchForPhotosCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveAlbumNameForSearchForPhotos:withCompletion:")
    default void resolveAlbumNameForSearchForPhotosWithCompletion(INSearchForPhotosIntent intent,
            @ObjCBlock(name = "call_resolveAlbumNameForSearchForPhotosWithCompletion") Block_resolveAlbumNameForSearchForPhotosWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveDateCreatedForSearchForPhotos:withCompletion:")
    default void resolveDateCreatedForSearchForPhotosWithCompletion(INSearchForPhotosIntent intent,
            @ObjCBlock(name = "call_resolveDateCreatedForSearchForPhotosWithCompletion") Block_resolveDateCreatedForSearchForPhotosWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveLocationCreatedForSearchForPhotos:withCompletion:")
    default void resolveLocationCreatedForSearchForPhotosWithCompletion(INSearchForPhotosIntent intent,
            @ObjCBlock(name = "call_resolveLocationCreatedForSearchForPhotosWithCompletion") Block_resolveLocationCreatedForSearchForPhotosWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolvePeopleInPhotoForSearchForPhotos:withCompletion:")
    default void resolvePeopleInPhotoForSearchForPhotosWithCompletion(INSearchForPhotosIntent intent,
            @ObjCBlock(name = "call_resolvePeopleInPhotoForSearchForPhotosWithCompletion") Block_resolvePeopleInPhotoForSearchForPhotosWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSearchForPhotosCompletion {
        @Generated
        void call_confirmSearchForPhotosCompletion(INSearchForPhotosIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSearchForPhotosCompletion {
        @Generated
        void call_handleSearchForPhotosCompletion(INSearchForPhotosIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveAlbumNameForSearchForPhotosWithCompletion {
        @Generated
        void call_resolveAlbumNameForSearchForPhotosWithCompletion(INStringResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveDateCreatedForSearchForPhotosWithCompletion {
        @Generated
        void call_resolveDateCreatedForSearchForPhotosWithCompletion(INDateComponentsRangeResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveLocationCreatedForSearchForPhotosWithCompletion {
        @Generated
        void call_resolveLocationCreatedForSearchForPhotosWithCompletion(INPlacemarkResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePeopleInPhotoForSearchForPhotosWithCompletion {
        @Generated
        void call_resolvePeopleInPhotoForSearchForPhotosWithCompletion(
                NSArray<? extends INPersonResolutionResult> arg0);
    }
}
