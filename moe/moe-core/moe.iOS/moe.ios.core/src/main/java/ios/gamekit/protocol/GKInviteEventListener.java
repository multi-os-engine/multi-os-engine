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
import ios.gamekit.GKInvite;
import ios.gamekit.GKPlayer;

@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKInviteEventListener")
public interface GKInviteEventListener {
	/**
	 * player:didAcceptInvite:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKInviteEventHandler_ref/index.html#//apple_ref/occ/intfm/GKInviteEventListener/player:didAcceptInvite:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("player:didAcceptInvite:")
	default void playerDidAcceptInvite(GKPlayer player, GKInvite invite) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * player:didRequestMatchWithPlayers:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKInviteEventHandler_ref/index.html#//apple_ref/occ/intfm/GKInviteEventListener/player:didRequestMatchWithPlayers:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Deprecated
	@Selector("player:didRequestMatchWithPlayers:")
	default void playerDidRequestMatchWithPlayers(GKPlayer player,
			NSArray<String> playerIDsToInvite) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * player:didRequestMatchWithRecipients:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKInviteEventHandler_ref/index.html#//apple_ref/occ/intfm/GKInviteEventListener/player:didRequestMatchWithRecipients:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("player:didRequestMatchWithRecipients:")
	default void playerDidRequestMatchWithRecipients(GKPlayer player,
			NSArray<? extends GKPlayer> recipientPlayers) {
		throw new java.lang.UnsupportedOperationException();
	}
}
