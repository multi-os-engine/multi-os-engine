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

/**
 * [@protocol]	AVPlayerViewControllerDelegate
 * <p>
 * A protocol for delegates of AVPlayerViewController.
 */
@Generated
@Library("AVKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVPlayerViewControllerDelegate")
public interface AVPlayerViewControllerDelegate {
    /**
     * playerViewController:failedToStartPictureInPictureWithError:
     * <p>
     * Delegate can implement this method to be notified when Picture in Picture failed to start.
     *
     * @param        playerViewController The player view controller.
     * @param        error An error describing why it failed.
     */
    @Generated
    @IsOptional
    @Selector("playerViewController:failedToStartPictureInPictureWithError:")
    default void playerViewControllerFailedToStartPictureInPictureWithError(AVPlayerViewController playerViewController,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * playerViewController:restoreUserInterfaceForPictureInPictureStopWithCompletionHandler:
     * <p>
     * Delegate can implement this method to restore the user interface before Picture in Picture stops.
     *
     * @param        playerViewController The player view controller.
     * @param        completionHandler The completion handler the delegate needs to call after restore.
     */
    @Generated
    @IsOptional
    @Selector("playerViewController:restoreUserInterfaceForPictureInPictureStopWithCompletionHandler:")
    default void playerViewControllerRestoreUserInterfaceForPictureInPictureStopWithCompletionHandler(
            AVPlayerViewController playerViewController,
            @ObjCBlock(name = "call_playerViewControllerRestoreUserInterfaceForPictureInPictureStopWithCompletionHandler") Block_playerViewControllerRestoreUserInterfaceForPictureInPictureStopWithCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * playerViewControllerDidStartPictureInPicture:
     * <p>
     * Delegate can implement this method to be notified when Picture in Picture did start.
     *
     * @param        playerViewController The player view controller.
     */
    @Generated
    @IsOptional
    @Selector("playerViewControllerDidStartPictureInPicture:")
    default void playerViewControllerDidStartPictureInPicture(AVPlayerViewController playerViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * playerViewControllerDidStopPictureInPicture:
     * <p>
     * Delegate can implement this method to be notified when Picture in Picture did stop.
     *
     * @param        playerViewController The player view controller.
     */
    @Generated
    @IsOptional
    @Selector("playerViewControllerDidStopPictureInPicture:")
    default void playerViewControllerDidStopPictureInPicture(AVPlayerViewController playerViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * playerViewControllerShouldAutomaticallyDismissAtPictureInPictureStart:
     * <p>
     * Delegate can implement this method and return NO to prevent player view controller from automatically being dismissed when Picture in Picture starts.
     *
     * @param        playerViewController The player view controller.
     */
    @Generated
    @IsOptional
    @Selector("playerViewControllerShouldAutomaticallyDismissAtPictureInPictureStart:")
    default boolean playerViewControllerShouldAutomaticallyDismissAtPictureInPictureStart(
            AVPlayerViewController playerViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * playerViewControllerWillStartPictureInPicture:
     * <p>
     * Delegate can implement this method to be notified when Picture in Picture will start.
     *
     * @param        playerViewController The player view controller.
     */
    @Generated
    @IsOptional
    @Selector("playerViewControllerWillStartPictureInPicture:")
    default void playerViewControllerWillStartPictureInPicture(AVPlayerViewController playerViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * playerViewControllerWillStopPictureInPicture:
     * <p>
     * Delegate can implement this method to be notified when Picture in Picture will stop.
     *
     * @param        playerViewController The player view controller.
     */
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

    /**
     * playerViewController:willBeginFullScreenPresentationWithAnimationCoordinator:
     * <p>
     * Informs the delegate that AVPlayerViewController is about to start displaying its contents full screen.
     * <p>
     * This method will not be called if a playerViewController is embedded inside a view controller that is being presented. If the receiver is embedded in a parent view controller, its content will be presented in a new full screen view controller and perhaps in a new window. Use the coordinator to determine whether the playerViewController or its full screen counterpart is being transitioned. Transitions can be interrupted -- use a completion block of one of the coordinator's animation methods to determine whether it has completed.
     *
     * @param        playerViewController The player view controller.
     * @param        coordinator An object conforming to UIViewControllerTransitionCoordinator.
     */
    @Generated
    @IsOptional
    @Selector("playerViewController:willBeginFullScreenPresentationWithAnimationCoordinator:")
    default void playerViewControllerWillBeginFullScreenPresentationWithAnimationCoordinator(
            AVPlayerViewController playerViewController,
            @Mapped(ObjCObjectMapper.class) UIViewControllerTransitionCoordinator coordinator) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * playerViewController:willEndFullScreenPresentationWithAnimationCoordinator:
     * <p>
     * Informs the delegate that AVPlayerViewController is about to stop displaying its contents full screen.
     * <p>
     * See the discussion of -[AVPlayerViewControllerDelegatePrivate playerViewController:willBeginFullScreenPresentationWithAnimationCoordinator:].
     *
     * @param        playerViewController The player view controller.
     * @param        coordinator An object conforming to UIViewControllerTransitionCoordinator.
     */
    @Generated
    @IsOptional
    @Selector("playerViewController:willEndFullScreenPresentationWithAnimationCoordinator:")
    default void playerViewControllerWillEndFullScreenPresentationWithAnimationCoordinator(
            AVPlayerViewController playerViewController,
            @Mapped(ObjCObjectMapper.class) UIViewControllerTransitionCoordinator coordinator) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * playerViewController:restoreUserInterfaceForFullScreenExitWithCompletionHandler:
     * <p>
     * The delegate can implement this method to restore the user interface before exiting fullscreen.
     *
     * @param            playerViewController The player view controller.
     * @param            completionHandler The completion handler the delegate must call after restoring the interface for an exit full screen transition.
     */
    @Generated
    @IsOptional
    @Selector("playerViewController:restoreUserInterfaceForFullScreenExitWithCompletionHandler:")
    default void playerViewControllerRestoreUserInterfaceForFullScreenExitWithCompletionHandler(
            AVPlayerViewController playerViewController,
            @ObjCBlock(name = "call_playerViewControllerRestoreUserInterfaceForFullScreenExitWithCompletionHandler") Block_playerViewControllerRestoreUserInterfaceForFullScreenExitWithCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_playerViewControllerRestoreUserInterfaceForFullScreenExitWithCompletionHandler {
        @Generated
        void call_playerViewControllerRestoreUserInterfaceForFullScreenExitWithCompletionHandler(boolean restored);
    }
}
