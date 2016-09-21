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

package apple.avkit.protocol;

import apple.avkit.AVPictureInPictureController;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("AVKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVPictureInPictureControllerDelegate")
public interface AVPictureInPictureControllerDelegate {
    @Generated
    @IsOptional
    @Selector("pictureInPictureController:failedToStartPictureInPictureWithError:")
    default void pictureInPictureControllerFailedToStartPictureInPictureWithError(
            AVPictureInPictureController pictureInPictureController, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("pictureInPictureController:restoreUserInterfaceForPictureInPictureStopWithCompletionHandler:")
    default void pictureInPictureControllerRestoreUserInterfaceForPictureInPictureStopWithCompletionHandler(
            AVPictureInPictureController pictureInPictureController,
            @ObjCBlock(name = "call_pictureInPictureControllerRestoreUserInterfaceForPictureInPictureStopWithCompletionHandler") Block_pictureInPictureControllerRestoreUserInterfaceForPictureInPictureStopWithCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("pictureInPictureControllerDidStartPictureInPicture:")
    default void pictureInPictureControllerDidStartPictureInPicture(
            AVPictureInPictureController pictureInPictureController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("pictureInPictureControllerDidStopPictureInPicture:")
    default void pictureInPictureControllerDidStopPictureInPicture(
            AVPictureInPictureController pictureInPictureController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("pictureInPictureControllerWillStartPictureInPicture:")
    default void pictureInPictureControllerWillStartPictureInPicture(
            AVPictureInPictureController pictureInPictureController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("pictureInPictureControllerWillStopPictureInPicture:")
    default void pictureInPictureControllerWillStopPictureInPicture(
            AVPictureInPictureController pictureInPictureController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pictureInPictureControllerRestoreUserInterfaceForPictureInPictureStopWithCompletionHandler {
        @Generated
        void call_pictureInPictureControllerRestoreUserInterfaceForPictureInPictureStopWithCompletionHandler(
                boolean arg0);
    }
}
