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
     * matchmakerViewController:didFailWithError:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchmakerViewControllerDelegate_Ref/index.html#//apple_ref/occ/intfm/GKMatchmakerViewControllerDelegate/matchmakerViewController:didFailWithError:">iOS Dev Center</a>
     */
    @Generated
    @Selector("matchmakerViewController:didFailWithError:")
    void matchmakerViewControllerDidFailWithError(GKMatchmakerViewController viewController, NSError error);

    /**
     * matchmakerViewController:didFindHostedPlayers:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchmakerViewControllerDelegate_Ref/index.html#//apple_ref/occ/intfm/GKMatchmakerViewControllerDelegate/matchmakerViewController:didFindHostedPlayers:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("matchmakerViewController:didFindHostedPlayers:")
    default void matchmakerViewControllerDidFindHostedPlayers(GKMatchmakerViewController viewController,
            NSArray<? extends GKPlayer> players) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * matchmakerViewController:didFindMatch:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchmakerViewControllerDelegate_Ref/index.html#//apple_ref/occ/intfm/GKMatchmakerViewControllerDelegate/matchmakerViewController:didFindMatch:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("matchmakerViewController:didFindMatch:")
    default void matchmakerViewControllerDidFindMatch(GKMatchmakerViewController viewController, GKMatch match) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * matchmakerViewController:didFindPlayers:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchmakerViewControllerDelegate_Ref/index.html#//apple_ref/occ/intfm/GKMatchmakerViewControllerDelegate/matchmakerViewController:didFindPlayers:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("matchmakerViewController:didFindPlayers:")
    default void matchmakerViewControllerDidFindPlayers(GKMatchmakerViewController viewController,
            NSArray<String> playerIDs) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * matchmakerViewController:didReceiveAcceptFromHostedPlayer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchmakerViewControllerDelegate_Ref/index.html#//apple_ref/occ/intfm/GKMatchmakerViewControllerDelegate/matchmakerViewController:didReceiveAcceptFromHostedPlayer:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("matchmakerViewController:didReceiveAcceptFromHostedPlayer:")
    default void matchmakerViewControllerDidReceiveAcceptFromHostedPlayer(GKMatchmakerViewController viewController,
            String playerID) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * matchmakerViewController:hostedPlayerDidAccept:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchmakerViewControllerDelegate_Ref/index.html#//apple_ref/occ/intfm/GKMatchmakerViewControllerDelegate/matchmakerViewController:hostedPlayerDidAccept:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("matchmakerViewController:hostedPlayerDidAccept:")
    default void matchmakerViewControllerHostedPlayerDidAccept(GKMatchmakerViewController viewController,
            GKPlayer player) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * matchmakerViewControllerWasCancelled:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchmakerViewControllerDelegate_Ref/index.html#//apple_ref/occ/intfm/GKMatchmakerViewControllerDelegate/matchmakerViewControllerWasCancelled:">iOS Dev Center</a>
     */
    @Generated
    @Selector("matchmakerViewControllerWasCancelled:")
    void matchmakerViewControllerWasCancelled(GKMatchmakerViewController viewController);
}
