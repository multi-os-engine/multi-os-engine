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
import apple.gamekit.GKSavedGame;
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
@ObjCProtocolName("GKSavedGameListener")
public interface GKSavedGameListener {
    /**
     * Called when a player’s saved game data has been modified.
     */
    @Generated
    @IsOptional
    @Selector("player:didModifySavedGame:")
    default void playerDidModifySavedGame(GKPlayer player, GKSavedGame savedGame) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a conflict has arisen between different versions of the same saved game. This can happen when
     * multiple devices write to the same saved game while one or more is offline. The application should determine the
     * correct data to use, then call resolveConflictingSavedGames:withData:completionHandler:. This may require data
     * merging or asking the user.
     */
    @Generated
    @IsOptional
    @Selector("player:hasConflictingSavedGames:")
    default void playerHasConflictingSavedGames(GKPlayer player, NSArray<? extends GKSavedGame> savedGames) {
        throw new java.lang.UnsupportedOperationException();
    }
}
