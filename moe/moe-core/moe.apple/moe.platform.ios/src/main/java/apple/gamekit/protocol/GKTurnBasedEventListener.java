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
    @Generated
    @IsOptional
    @Selector("player:didRequestMatchWithOtherPlayers:")
    default void playerDidRequestMatchWithOtherPlayers(GKPlayer player, NSArray<? extends GKPlayer> playersToInvite) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Deprecated
    @Selector("player:didRequestMatchWithPlayers:")
    default void playerDidRequestMatchWithPlayers(GKPlayer player, NSArray<String> playerIDsToInvite) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("player:matchEnded:")
    default void playerMatchEnded(GKPlayer player, GKTurnBasedMatch match) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("player:receivedExchangeCancellation:forMatch:")
    default void playerReceivedExchangeCancellationForMatch(GKPlayer player, GKTurnBasedExchange exchange,
            GKTurnBasedMatch match) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("player:receivedExchangeReplies:forCompletedExchange:forMatch:")
    default void playerReceivedExchangeRepliesForCompletedExchangeForMatch(GKPlayer player,
            NSArray<? extends GKTurnBasedExchangeReply> replies, GKTurnBasedExchange exchange, GKTurnBasedMatch match) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("player:receivedExchangeRequest:forMatch:")
    default void playerReceivedExchangeRequestForMatch(GKPlayer player, GKTurnBasedExchange exchange,
            GKTurnBasedMatch match) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("player:receivedTurnEventForMatch:didBecomeActive:")
    default void playerReceivedTurnEventForMatchDidBecomeActive(GKPlayer player, GKTurnBasedMatch match,
            boolean didBecomeActive) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("player:wantsToQuitMatch:")
    default void playerWantsToQuitMatch(GKPlayer player, GKTurnBasedMatch match) {
        throw new java.lang.UnsupportedOperationException();
    }
}
