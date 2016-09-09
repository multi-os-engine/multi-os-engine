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
import ios.gamekit.GKTurnBasedMatch;

@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKTurnBasedEventHandlerDelegate")
public interface GKTurnBasedEventHandlerDelegate {
	/**
	 * handleInviteFromGameCenter:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedEventHandlerDelegate_Ref/index.html#//apple_ref/occ/intfm/GKTurnBasedEventHandlerDelegate/handleInviteFromGameCenter:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("handleInviteFromGameCenter:")
	void handleInviteFromGameCenter(NSArray<? extends GKPlayer> playersToInvite);

	/**
	 * handleMatchEnded:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedEventHandlerDelegate_Ref/index.html#//apple_ref/occ/intfm/GKTurnBasedEventHandlerDelegate/handleMatchEnded:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Deprecated
	@Selector("handleMatchEnded:")
	default void handleMatchEnded(GKTurnBasedMatch match) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * handleTurnEventForMatch:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedEventHandlerDelegate_Ref/index.html#//apple_ref/occ/intfm/GKTurnBasedEventHandlerDelegate/handleTurnEventForMatch:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Deprecated
	@Selector("handleTurnEventForMatch:")
	default void handleTurnEventForMatch(GKTurnBasedMatch match) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * handleTurnEventForMatch:didBecomeActive:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedEventHandlerDelegate_Ref/index.html#//apple_ref/occ/intfm/GKTurnBasedEventHandlerDelegate/handleTurnEventForMatch:didBecomeActive:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("handleTurnEventForMatch:didBecomeActive:")
	void handleTurnEventForMatchDidBecomeActive(GKTurnBasedMatch match,
			boolean didBecomeActive);
}
