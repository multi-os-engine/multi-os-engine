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
import apple.gamekit.GKInvite;
import apple.gamekit.GKPlayer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * GKInviteEventListener uses the GKLocalPlayerListener mechanism on GKLocalPlayer to listen to the two kinds of invite
 * events that a game must respond to
 */
@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKInviteEventListener")
public interface GKInviteEventListener {
    /**
     * player:didAcceptInvite: gets called when another player accepts the invite from the local player
     */
    @Generated
    @IsOptional
    @Selector("player:didAcceptInvite:")
    default void playerDidAcceptInvite(GKPlayer player, GKInvite invite) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This method is obsolete. It will never be invoked and its implementation does nothing**
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("player:didRequestMatchWithPlayers:")
    default void playerDidRequestMatchWithPlayers(GKPlayer player, NSArray<String> playerIDsToInvite) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * didRequestMatchWithRecipients: gets called when the player chooses to play with another player from Game Center
     * and it launches the game to start matchmaking
     */
    @Generated
    @IsOptional
    @Selector("player:didRequestMatchWithRecipients:")
    default void playerDidRequestMatchWithRecipients(GKPlayer player, NSArray<? extends GKPlayer> recipientPlayers) {
        throw new java.lang.UnsupportedOperationException();
    }
}
