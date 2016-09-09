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

package ios.gamekit.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSArray;
import ios.gamekit.GKPlayer;
import ios.gamekit.GKSavedGame;

@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKSavedGameListener")
public interface GKSavedGameListener {
	/**
	 * player:didModifySavedGame:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKSavedGameListener_Ref/index.html#//apple_ref/occ/intfm/GKSavedGameListener/player:didModifySavedGame:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("player:didModifySavedGame:")
	default void playerDidModifySavedGame(GKPlayer player,
			GKSavedGame savedGame) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * player:hasConflictingSavedGames:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKSavedGameListener_Ref/index.html#//apple_ref/occ/intfm/GKSavedGameListener/player:hasConflictingSavedGames:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("player:hasConflictingSavedGames:")
	default void playerHasConflictingSavedGames(GKPlayer player,
			NSArray<? extends GKSavedGame> savedGames) {
		throw new java.lang.UnsupportedOperationException();
	}
}
