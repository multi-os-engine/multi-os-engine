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

package ios.gameplaykit.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.foundation.NSArray;
import ios.foundation.protocol.NSCopying;

@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKGameModel")
public interface GKGameModel extends NSCopying {
	/**
	 * activePlayer</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKGameModel_Protocol/index.html#//apple_ref/occ/intfp/GKGameModel/activePlayer">iOS Dev Center</a>
	 */
	@Generated
	@Selector("activePlayer")
	@MappedReturn(ObjCObjectMapper.class)
	Object activePlayer();

	/**
	 * applyGameModelUpdate:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKGameModel_Protocol/index.html#//apple_ref/occ/intfm/GKGameModel/applyGameModelUpdate:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("applyGameModelUpdate:")
	void applyGameModelUpdate(@Mapped(ObjCObjectMapper.class) Object gameModelUpdate);

	/**
	 * gameModelUpdatesForPlayer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKGameModel_Protocol/index.html#//apple_ref/occ/intfm/GKGameModel/gameModelUpdatesForPlayer:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("gameModelUpdatesForPlayer:")
	NSArray<?> gameModelUpdatesForPlayer(@Mapped(ObjCObjectMapper.class) Object player);

	/**
	 * isLossForPlayer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKGameModel_Protocol/index.html#//apple_ref/occ/intfm/GKGameModel/isLossForPlayer:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("isLossForPlayer:")
	default boolean isLossForPlayer(@Mapped(ObjCObjectMapper.class) Object player) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * isWinForPlayer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKGameModel_Protocol/index.html#//apple_ref/occ/intfm/GKGameModel/isWinForPlayer:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("isWinForPlayer:")
	default boolean isWinForPlayer(@Mapped(ObjCObjectMapper.class) Object player) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * players</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKGameModel_Protocol/index.html#//apple_ref/occ/intfp/GKGameModel/players">iOS Dev Center</a>
	 */
	@Generated
	@Selector("players")
	NSArray<?> players();

	/**
	 * scoreForPlayer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKGameModel_Protocol/index.html#//apple_ref/occ/intfm/GKGameModel/scoreForPlayer:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("scoreForPlayer:")
	@NInt
	default long scoreForPlayer(@Mapped(ObjCObjectMapper.class) Object player) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * setGameModel:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKGameModel_Protocol/index.html#//apple_ref/occ/intfm/GKGameModel/setGameModel:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setGameModel:")
	void setGameModel(@Mapped(ObjCObjectMapper.class) Object gameModel);

	@Generated
	@IsOptional
	@Selector("unapplyGameModelUpdate:")
	default void unapplyGameModelUpdate(
			@Mapped(ObjCObjectMapper.class) Object gameModelUpdate) {
		throw new java.lang.UnsupportedOperationException();
	}
}
