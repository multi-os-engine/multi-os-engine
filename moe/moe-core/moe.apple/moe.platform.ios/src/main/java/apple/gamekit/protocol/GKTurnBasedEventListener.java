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
import apple.gamekit.GKPlayer;
import apple.gamekit.GKTurnBasedExchange;
import apple.gamekit.GKTurnBasedExchangeReply;
import apple.gamekit.GKTurnBasedMatch;
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
@ObjCProtocolName("GKTurnBasedEventListener")
public interface GKTurnBasedEventListener {
    /**
     * If Game Center initiates a match the developer should create a GKTurnBasedMatch from playersToInvite and present
     * a GKTurnbasedMatchmakerViewController.
     * 
     * API-Since: 8.0
     */
    @Generated
    @IsOptional
    @Selector("player:didRequestMatchWithOtherPlayers:")
    default void playerDidRequestMatchWithOtherPlayers(GKPlayer player, NSArray<? extends GKPlayer> playersToInvite) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Deprecated
     * 
     * API-Since: 7.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: use didRequestMatchWithOtherPlayers
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("player:didRequestMatchWithPlayers:")
    default void playerDidRequestMatchWithPlayers(GKPlayer player, NSArray<String> playerIDsToInvite) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * called when the match has ended.
     */
    @Generated
    @IsOptional
    @Selector("player:matchEnded:")
    default void playerMatchEnded(GKPlayer player, GKTurnBasedMatch match) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * this is called when an exchange is canceled by the sender.
     * 
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("player:receivedExchangeCancellation:forMatch:")
    default void playerReceivedExchangeCancellationForMatch(GKPlayer player, GKTurnBasedExchange exchange,
            GKTurnBasedMatch match) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * called when all players either respond or timeout responding to this request. This is sent to both the turn
     * holder and the initiator of the exchange
     * 
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("player:receivedExchangeReplies:forCompletedExchange:forMatch:")
    default void playerReceivedExchangeRepliesForCompletedExchangeForMatch(GKPlayer player,
            NSArray<? extends GKTurnBasedExchangeReply> replies, GKTurnBasedExchange exchange, GKTurnBasedMatch match) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * this is called when a player receives an exchange request from another player.
     * 
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("player:receivedExchangeRequest:forMatch:")
    default void playerReceivedExchangeRequestForMatch(GKPlayer player, GKTurnBasedExchange exchange,
            GKTurnBasedMatch match) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * called when it becomes this player's turn. It also gets called under the following conditions:
     * the player's turn has a timeout and it is about to expire.
     * the player accepts an invite from another player.
     * when the game is running it will additionally recieve turn events for the following:
     * turn was passed to another player
     * another player saved the match data
     * Because of this the app needs to be prepared to handle this even while the player is taking a turn in an existing
     * match. The boolean indicates whether this event launched or brought to forground the app.
     * 
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("player:receivedTurnEventForMatch:didBecomeActive:")
    default void playerReceivedTurnEventForMatchDidBecomeActive(GKPlayer player, GKTurnBasedMatch match,
            boolean didBecomeActive) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a player chooses to quit a match and that player has the current turn. The developer should call
     * participantQuitInTurnWithOutcome:nextParticipants:turnTimeout:matchData:completionHandler: on the match passing
     * in appropriate values. They can also update matchOutcome for other players as appropriate.
     * 
     * API-Since: 9.0
     */
    @Generated
    @IsOptional
    @Selector("player:wantsToQuitMatch:")
    default void playerWantsToQuitMatch(GKPlayer player, GKTurnBasedMatch match) {
        throw new java.lang.UnsupportedOperationException();
    }
}
