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

import apple.foundation.NSError;
import apple.gamekit.GKTurnBasedMatch;
import apple.gamekit.GKTurnBasedMatchmakerViewController;
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
@ObjCProtocolName("GKTurnBasedMatchmakerViewControllerDelegate")
public interface GKTurnBasedMatchmakerViewControllerDelegate {
    /**
     * Matchmaking has failed with an error
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("turnBasedMatchmakerViewController:didFailWithError:")
    void turnBasedMatchmakerViewControllerDidFailWithError(@NotNull GKTurnBasedMatchmakerViewController viewController,
            @NotNull NSError error);

    /**
     * Deprecated
     * 
     * API-Since: 5.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use GKTurnBasedEventListener player:receivedTurnEventForMatch:didBecomeActive:
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("turnBasedMatchmakerViewController:didFindMatch:")
    default void turnBasedMatchmakerViewControllerDidFindMatch(
            @NotNull GKTurnBasedMatchmakerViewController viewController, @NotNull GKTurnBasedMatch match) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Deprectated
     * 
     * API-Since: 5.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use GKTurnBasedEventListener player:wantsToQuitMatch:
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("turnBasedMatchmakerViewController:playerQuitForMatch:")
    default void turnBasedMatchmakerViewControllerPlayerQuitForMatch(
            @NotNull GKTurnBasedMatchmakerViewController viewController, @NotNull GKTurnBasedMatch match) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The user has cancelled
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("turnBasedMatchmakerViewControllerWasCancelled:")
    void turnBasedMatchmakerViewControllerWasCancelled(@NotNull GKTurnBasedMatchmakerViewController viewController);
}
