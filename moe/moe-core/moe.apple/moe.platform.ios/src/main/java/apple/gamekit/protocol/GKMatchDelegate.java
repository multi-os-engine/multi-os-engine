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

@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKMatchDelegate")
public interface GKMatchDelegate {
    /**
     * match:didFailWithError:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchDelegate_Ref/index.html#//apple_ref/occ/intfm/GKMatchDelegate/match:didFailWithError:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("match:didFailWithError:")
    default void matchDidFailWithError(GKMatch match, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * match:didReceiveData:fromPlayer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchDelegate_Ref/index.html#//apple_ref/occ/intfm/GKMatchDelegate/match:didReceiveData:fromPlayer:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("match:didReceiveData:fromPlayer:")
    default void matchDidReceiveDataFromPlayer(GKMatch match, NSData data, String playerID) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * match:didReceiveData:fromRemotePlayer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchDelegate_Ref/index.html#//apple_ref/occ/intfm/GKMatchDelegate/match:didReceiveData:fromRemotePlayer:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("match:didReceiveData:fromRemotePlayer:")
    default void matchDidReceiveDataFromRemotePlayer(GKMatch match, NSData data, GKPlayer player) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * match:player:didChangeConnectionState:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchDelegate_Ref/index.html#//apple_ref/occ/intfm/GKMatchDelegate/match:player:didChangeConnectionState:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("match:player:didChangeConnectionState:")
    default void matchPlayerDidChangeConnectionState(GKMatch match, GKPlayer player, @NInt long state) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * match:player:didChangeState:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchDelegate_Ref/index.html#//apple_ref/occ/intfm/GKMatchDelegate/match:player:didChangeState:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("match:player:didChangeState:")
    default void matchPlayerDidChangeState(GKMatch match, String playerID, @NInt long state) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * match:shouldReinviteDisconnectedPlayer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchDelegate_Ref/index.html#//apple_ref/occ/intfm/GKMatchDelegate/match:shouldReinviteDisconnectedPlayer:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("match:shouldReinviteDisconnectedPlayer:")
    default boolean matchShouldReinviteDisconnectedPlayer(GKMatch match, GKPlayer player) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * match:shouldReinvitePlayer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchDelegate_Ref/index.html#//apple_ref/occ/intfm/GKMatchDelegate/match:shouldReinvitePlayer:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("match:shouldReinvitePlayer:")
    default boolean matchShouldReinvitePlayer(GKMatch match, String playerID) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * match:didReceiveData:forRecipient:fromRemotePlayer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchDelegate_Ref/index.html#//apple_ref/occ/intfm/GKMatchDelegate/match:didReceiveData:forRecipient:fromRemotePlayer:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("match:didReceiveData:forRecipient:fromRemotePlayer:")
    default void matchDidReceiveDataForRecipientFromRemotePlayer(GKMatch match, NSData data, GKPlayer recipient,
            GKPlayer player) {
        throw new java.lang.UnsupportedOperationException();
    }
}
