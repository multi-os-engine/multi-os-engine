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
import org.jetbrains.annotations.NotNull;

/**
 * [@protocol] AVPictureInPictureControllerDelegate
 * 
 * A protocol for delegates of AVPictureInPictureController.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("AVKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVPictureInPictureControllerDelegate")
public interface AVPictureInPictureControllerDelegate {
    /**
     * pictureInPictureController:failedToStartPictureInPictureWithError:
     * 
     * Delegate can implement this method to be notified when Picture in Picture failed to start.
     * 
     * @param pictureInPictureController
     *                                   The Picture in Picture controller.
     * @param error
     *                                   An error describing why it failed.
     */
    @Generated
    @IsOptional
    @Selector("pictureInPictureController:failedToStartPictureInPictureWithError:")
    default void pictureInPictureControllerFailedToStartPictureInPictureWithError(
            @NotNull AVPictureInPictureController pictureInPictureController, @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * pictureInPictureController:restoreUserInterfaceForPictureInPictureStopWithCompletionHandler:
     * 
     * Delegate can implement this method to restore the user interface before Picture in Picture stops.
     * 
     * @param pictureInPictureController
     *                                   The Picture in Picture controller.
     * @param completionHandler
     *                                   The completion handler the delegate needs to call after restore.
     */
    @Generated
    @IsOptional
    @Selector("pictureInPictureController:restoreUserInterfaceForPictureInPictureStopWithCompletionHandler:")
    default void pictureInPictureControllerRestoreUserInterfaceForPictureInPictureStopWithCompletionHandler(
            @NotNull AVPictureInPictureController pictureInPictureController,
            @NotNull @ObjCBlock(name = "call_pictureInPictureControllerRestoreUserInterfaceForPictureInPictureStopWithCompletionHandler") Block_pictureInPictureControllerRestoreUserInterfaceForPictureInPictureStopWithCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * pictureInPictureControllerDidStartPictureInPicture:
     * 
     * Delegate can implement this method to be notified when Picture in Picture did start.
     * 
     * @param pictureInPictureController
     *                                   The Picture in Picture controller.
     */
    @Generated
    @IsOptional
    @Selector("pictureInPictureControllerDidStartPictureInPicture:")
    default void pictureInPictureControllerDidStartPictureInPicture(
            @NotNull AVPictureInPictureController pictureInPictureController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * pictureInPictureControllerDidStopPictureInPicture:
     * 
     * Delegate can implement this method to be notified when Picture in Picture did stop.
     * 
     * @param pictureInPictureController
     *                                   The Picture in Picture controller.
     */
    @Generated
    @IsOptional
    @Selector("pictureInPictureControllerDidStopPictureInPicture:")
    default void pictureInPictureControllerDidStopPictureInPicture(
            @NotNull AVPictureInPictureController pictureInPictureController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * pictureInPictureControllerWillStartPictureInPicture:
     * 
     * Delegate can implement this method to be notified when Picture in Picture will start.
     * 
     * @param pictureInPictureController
     *                                   The Picture in Picture controller.
     */
    @Generated
    @IsOptional
    @Selector("pictureInPictureControllerWillStartPictureInPicture:")
    default void pictureInPictureControllerWillStartPictureInPicture(
            @NotNull AVPictureInPictureController pictureInPictureController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * pictureInPictureControllerWillStopPictureInPicture:
     * 
     * Delegate can implement this method to be notified when Picture in Picture will stop.
     * 
     * @param pictureInPictureController
     *                                   The Picture in Picture controller.
     */
    @Generated
    @IsOptional
    @Selector("pictureInPictureControllerWillStopPictureInPicture:")
    default void pictureInPictureControllerWillStopPictureInPicture(
            @NotNull AVPictureInPictureController pictureInPictureController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pictureInPictureControllerRestoreUserInterfaceForPictureInPictureStopWithCompletionHandler {
        @Generated
        void call_pictureInPictureControllerRestoreUserInterfaceForPictureInPictureStopWithCompletionHandler(
                boolean restored);
    }
}
