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

import apple.avkit.AVPlayerViewController;
import apple.foundation.NSError;
import apple.uikit.protocol.UIViewControllerTransitionCoordinator;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("AVKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVPlayerViewControllerDelegate")
public interface AVPlayerViewControllerDelegate {
    @Generated
    @IsOptional
    @Selector("playerViewController:failedToStartPictureInPictureWithError:")
    default void playerViewControllerFailedToStartPictureInPictureWithError(AVPlayerViewController playerViewController,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("playerViewController:restoreUserInterfaceForPictureInPictureStopWithCompletionHandler:")
    default void playerViewControllerRestoreUserInterfaceForPictureInPictureStopWithCompletionHandler(
            AVPlayerViewController playerViewController,
            @ObjCBlock(name = "call_playerViewControllerRestoreUserInterfaceForPictureInPictureStopWithCompletionHandler") Block_playerViewControllerRestoreUserInterfaceForPictureInPictureStopWithCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("playerViewControllerDidStartPictureInPicture:")
    default void playerViewControllerDidStartPictureInPicture(AVPlayerViewController playerViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("playerViewControllerDidStopPictureInPicture:")
    default void playerViewControllerDidStopPictureInPicture(AVPlayerViewController playerViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("playerViewControllerShouldAutomaticallyDismissAtPictureInPictureStart:")
    default boolean playerViewControllerShouldAutomaticallyDismissAtPictureInPictureStart(
            AVPlayerViewController playerViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("playerViewControllerWillStartPictureInPicture:")
    default void playerViewControllerWillStartPictureInPicture(AVPlayerViewController playerViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("playerViewControllerWillStopPictureInPicture:")
    default void playerViewControllerWillStopPictureInPicture(AVPlayerViewController playerViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_playerViewControllerRestoreUserInterfaceForPictureInPictureStopWithCompletionHandler {
        @Generated
        void call_playerViewControllerRestoreUserInterfaceForPictureInPictureStopWithCompletionHandler(
                boolean restored);
    }

    @Generated
    @IsOptional
    @Selector("playerViewController:willBeginFullScreenPresentationWithAnimationCoordinator:")
    default void playerViewControllerWillBeginFullScreenPresentationWithAnimationCoordinator(
            AVPlayerViewController playerViewController,
            @Mapped(ObjCObjectMapper.class) UIViewControllerTransitionCoordinator coordinator) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("playerViewController:willEndFullScreenPresentationWithAnimationCoordinator:")
    default void playerViewControllerWillEndFullScreenPresentationWithAnimationCoordinator(
            AVPlayerViewController playerViewController,
            @Mapped(ObjCObjectMapper.class) UIViewControllerTransitionCoordinator coordinator) {
        throw new java.lang.UnsupportedOperationException();
    }
}
