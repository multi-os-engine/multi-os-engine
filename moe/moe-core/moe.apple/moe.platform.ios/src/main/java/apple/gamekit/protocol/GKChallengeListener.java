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
import apple.gamekit.GKPlayer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKChallengeListener")
public interface GKChallengeListener {
    /**
     * Called when a player has completed a challenge, triggered while the game is running, or when the user has tapped
     * a challenge notification banner while outside of the game.
     * player: The player who completed the challenge
     * challenge: The challenge which the player completed
     * friendPlayer: The friend who sent the challenge originally
     * 
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("player:didCompleteChallenge:issuedByFriend:")
    default void playerDidCompleteChallengeIssuedByFriend(@NotNull GKPlayer player, @NotNull GKChallenge challenge,
            @NotNull GKPlayer friendPlayer) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a player has received a challenge, triggered by a push notification from the server. Received only
     * while the game is running.
     * player: The player who received the challenge
     * challenge: The challenge which was received
     * 
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("player:didReceiveChallenge:")
    default void playerDidReceiveChallenge(@NotNull GKPlayer player, @NotNull GKChallenge challenge) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a player's friend has completed a challenge which the player sent to that friend. Triggered while the
     * game is running, or when the user has tapped a challenge notification banner while outside of the game.
     * player: The player who sent the challenge originally
     * challenge: The challenge which the player created and sent
     * friendPlayer: The friend who completed the challenge
     * 
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("player:issuedChallengeWasCompleted:byFriend:")
    default void playerIssuedChallengeWasCompletedByFriend(@NotNull GKPlayer player, @NotNull GKChallenge challenge,
            @NotNull GKPlayer friendPlayer) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a player starts the game with the intent of playing a challenge, or intends to play a challenge after
     * selecting it within the in-game Game Center UI.
     * player: The player who selected the challenge
     * challenge: The challenge which was selected
     * 
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("player:wantsToPlayChallenge:")
    default void playerWantsToPlayChallenge(@NotNull GKPlayer player, @NotNull GKChallenge challenge) {
        throw new java.lang.UnsupportedOperationException();
    }
}
