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
import apple.gamekit.GKTurnBasedMatch;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * see documentation for GKTurnBasedEventListener for the equivalent methods
 * 
 * API-Since: 5.0
 * Deprecated-Since: 7.0
 * Deprecated-Message: Use registerListener on GKLocalPlayer with an object that implements the GKTurnBasedEventListener
 * protocol
 */
@Deprecated
@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKTurnBasedEventHandlerDelegate")
public interface GKTurnBasedEventHandlerDelegate {
    /**
     * API-Since: 5.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("handleInviteFromGameCenter:")
    void handleInviteFromGameCenter(@NotNull NSArray<String> playersToInvite);

    /**
     * API-Since: 6.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("handleMatchEnded:")
    default void handleMatchEnded(@NotNull GKTurnBasedMatch match) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 5.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("handleTurnEventForMatch:")
    default void handleTurnEventForMatch(@NotNull GKTurnBasedMatch match) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 6.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("handleTurnEventForMatch:didBecomeActive:")
    void handleTurnEventForMatchDidBecomeActive(@NotNull GKTurnBasedMatch match, boolean didBecomeActive);
}
