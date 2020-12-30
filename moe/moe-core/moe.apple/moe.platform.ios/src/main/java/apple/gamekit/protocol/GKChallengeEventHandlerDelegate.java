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

package apple.gamekit.protocol;

import apple.gamekit.GKChallenge;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * GKChallengeEventHandler's delegate must implement the following protocol to be notified of challenge-related events. All of these methods are called on the main thread.
 */
@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKChallengeEventHandlerDelegate")
public interface GKChallengeEventHandlerDelegate {
    /**
     * Called when the local player has completed one of their challenges, triggered by a push notification from the server. Received only while the game is running.
     */
    @Generated
    @IsOptional
    @Selector("localPlayerDidCompleteChallenge:")
    default void localPlayerDidCompleteChallenge(GKChallenge challenge) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the local player has received a challenge, triggered by a push notification from the server. Received only while the game is running.
     */
    @Generated
    @IsOptional
    @Selector("localPlayerDidReceiveChallenge:")
    default void localPlayerDidReceiveChallenge(GKChallenge challenge) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the user taps a challenge notification banner or the "Play Now" button for a challenge inside Game Center, causing the game to launch. Also called when the user taps a challenge banner inside the game.
     */
    @Generated
    @IsOptional
    @Selector("localPlayerDidSelectChallenge:")
    default void localPlayerDidSelectChallenge(GKChallenge challenge) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a non-local player has completed a challenge issued by the local player. Triggered by a push notification from the server. Received when a challenge notification banner is tapped, or while the game is running.
     */
    @Generated
    @IsOptional
    @Selector("remotePlayerDidCompleteChallenge:")
    default void remotePlayerDidCompleteChallenge(GKChallenge challenge) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * If the method returns YES, a challenge banner (like an achievement or welcome banner -- not a notification center banner) is displayed. If NO, then no banner is displayed. Default behavior for non-implementing apps is YES.
     */
    @Generated
    @IsOptional
    @Selector("shouldShowBannerForLocallyCompletedChallenge:")
    default boolean shouldShowBannerForLocallyCompletedChallenge(GKChallenge challenge) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * If the method returns YES, a challenge banner (like an achievement or welcome banner -- not a notification center banner) is displayed when a challenge is received in-game for the local player. If NO, then no banner is displayed, and localPlayerDidSelectChallenge: will not be called for that challenge. Default behavior for non-implementing apps is YES.
     */
    @Generated
    @IsOptional
    @Selector("shouldShowBannerForLocallyReceivedChallenge:")
    default boolean shouldShowBannerForLocallyReceivedChallenge(GKChallenge challenge) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * If the method returns YES, a challenge banner (like an achievement or welcome banner -- not a notification center banner) is displayed. If NO, then no banner is displayed. Default behavior for non-implementing apps is YES.
     */
    @Generated
    @IsOptional
    @Selector("shouldShowBannerForRemotelyCompletedChallenge:")
    default boolean shouldShowBannerForRemotelyCompletedChallenge(GKChallenge challenge) {
        throw new java.lang.UnsupportedOperationException();
    }
}
