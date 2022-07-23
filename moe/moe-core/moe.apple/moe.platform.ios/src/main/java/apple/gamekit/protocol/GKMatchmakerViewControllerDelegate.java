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

import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.gamekit.GKMatch;
import apple.gamekit.GKMatchmakerViewController;
import apple.gamekit.GKPlayer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKMatchmakerViewControllerDelegate")
public interface GKMatchmakerViewControllerDelegate {
    /**
     * Matchmaking has failed with an error
     */
    @Generated
    @Selector("matchmakerViewController:didFailWithError:")
    void matchmakerViewControllerDidFailWithError(GKMatchmakerViewController viewController, NSError error);

    /**
     * Players have been found for a server-hosted game, the game should start
     */
    @Generated
    @IsOptional
    @Selector("matchmakerViewController:didFindHostedPlayers:")
    default void matchmakerViewControllerDidFindHostedPlayers(GKMatchmakerViewController viewController,
            NSArray<? extends GKPlayer> players) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * A peer-to-peer match has been found, the game should start
     */
    @Generated
    @IsOptional
    @Selector("matchmakerViewController:didFindMatch:")
    default void matchmakerViewControllerDidFindMatch(GKMatchmakerViewController viewController, GKMatch match) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * These protocol methods are obsoleted. They will never be invoked and their implementation does nothing**
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("matchmakerViewController:didFindPlayers:")
    default void matchmakerViewControllerDidFindPlayers(GKMatchmakerViewController viewController,
            NSArray<String> playerIDs) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Deprecated
    @Selector("matchmakerViewController:didReceiveAcceptFromHostedPlayer:")
    default void matchmakerViewControllerDidReceiveAcceptFromHostedPlayer(GKMatchmakerViewController viewController,
            String playerID) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * An invited player has accepted a hosted invite. Apps should connect through the hosting server and then update
     * the player's connected state (using setConnected:forHostedPlayer:)
     */
    @Generated
    @IsOptional
    @Selector("matchmakerViewController:hostedPlayerDidAccept:")
    default void matchmakerViewControllerHostedPlayerDidAccept(GKMatchmakerViewController viewController,
            GKPlayer player) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The user has cancelled matchmaking
     */
    @Generated
    @Selector("matchmakerViewControllerWasCancelled:")
    void matchmakerViewControllerWasCancelled(GKMatchmakerViewController viewController);
}
