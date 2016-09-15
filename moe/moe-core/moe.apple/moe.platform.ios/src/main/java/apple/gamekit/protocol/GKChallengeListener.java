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

@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKChallengeListener")
public interface GKChallengeListener {
    /**
     * player:didCompleteChallenge:issuedByFriend:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKEventListener_Ref/index.html#//apple_ref/occ/intfm/GKChallengeListener/player:didCompleteChallenge:issuedByFriend:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("player:didCompleteChallenge:issuedByFriend:")
    default void playerDidCompleteChallengeIssuedByFriend(GKPlayer player, GKChallenge challenge,
            GKPlayer friendPlayer) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * player:didReceiveChallenge:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKEventListener_Ref/index.html#//apple_ref/occ/intfm/GKChallengeListener/player:didReceiveChallenge:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("player:didReceiveChallenge:")
    default void playerDidReceiveChallenge(GKPlayer player, GKChallenge challenge) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * player:issuedChallengeWasCompleted:byFriend:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKEventListener_Ref/index.html#//apple_ref/occ/intfm/GKChallengeListener/player:issuedChallengeWasCompleted:byFriend:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("player:issuedChallengeWasCompleted:byFriend:")
    default void playerIssuedChallengeWasCompletedByFriend(GKPlayer player, GKChallenge challenge,
            GKPlayer friendPlayer) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * player:wantsToPlayChallenge:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKEventListener_Ref/index.html#//apple_ref/occ/intfm/GKChallengeListener/player:wantsToPlayChallenge:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("player:wantsToPlayChallenge:")
    default void playerWantsToPlayChallenge(GKPlayer player, GKChallenge challenge) {
        throw new java.lang.UnsupportedOperationException();
    }
}
