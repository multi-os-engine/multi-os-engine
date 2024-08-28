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

import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.gamekit.GKMatch;
import apple.gamekit.GKPlayer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKMatchDelegate")
public interface GKMatchDelegate {
    /**
     * The match was unable to be established with any players due to an error.
     * 
     * API-Since: 4.1
     */
    @Generated
    @IsOptional
    @Selector("match:didFailWithError:")
    default void matchDidFailWithError(@NotNull GKMatch match, @Nullable NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 9.0
     */
    @Generated
    @IsOptional
    @Selector("match:didReceiveData:forRecipient:fromRemotePlayer:")
    default void matchDidReceiveDataForRecipientFromRemotePlayer(@NotNull GKMatch match, @NotNull NSData data,
            @NotNull GKPlayer recipient, @NotNull GKPlayer player) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * These protocol methods are obsoleted. They will never be invoked and their implementation does nothing**
     * 
     * API-Since: 4.1
     * Deprecated-Since: 8.0
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("match:didReceiveData:fromPlayer:")
    default void matchDidReceiveDataFromPlayer(@NotNull GKMatch match, @NotNull NSData data, @NotNull String playerID) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The match received data sent from the player.
     * 
     * API-Since: 8.0
     */
    @Generated
    @IsOptional
    @Selector("match:didReceiveData:fromRemotePlayer:")
    default void matchDidReceiveDataFromRemotePlayer(@NotNull GKMatch match, @NotNull NSData data,
            @NotNull GKPlayer player) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The player state changed (eg. connected or disconnected)
     * 
     * API-Since: 4.1
     */
    @Generated
    @IsOptional
    @Selector("match:player:didChangeConnectionState:")
    default void matchPlayerDidChangeConnectionState(@NotNull GKMatch match, @NotNull GKPlayer player,
            @NInt long state) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 4.1
     * Deprecated-Since: 8.0
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("match:player:didChangeState:")
    default void matchPlayerDidChangeState(@NotNull GKMatch match, @NotNull String playerID, @NInt long state) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This method is called when the match is interrupted; if it returns YES, a new invite will be sent to attempt
     * reconnection. This is supported only for 1v1 games
     * 
     * API-Since: 8.0
     */
    @Generated
    @IsOptional
    @Selector("match:shouldReinviteDisconnectedPlayer:")
    default boolean matchShouldReinviteDisconnectedPlayer(@NotNull GKMatch match, @NotNull GKPlayer player) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 5.0
     * Deprecated-Since: 8.0
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("match:shouldReinvitePlayer:")
    default boolean matchShouldReinvitePlayer(@NotNull GKMatch match, @NotNull String playerID) {
        throw new java.lang.UnsupportedOperationException();
    }
}
