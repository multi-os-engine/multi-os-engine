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

package ios.gamekit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.foundation.NSArray;
import ios.foundation.NSData;
import ios.foundation.NSError;
import ios.foundation.NSURL;
import ios.gamekit.protocol.GKSavedGameListener;
import ios.uikit.UIViewController;
import ios.gamekit.protocol.GKLocalPlayerListener;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.NSObject;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKLocalPlayer extends GKPlayer implements GKSavedGameListener {
	static {
		NatJ.register();
	}

	@Generated
	protected GKLocalPlayer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native GKLocalPlayer alloc();

	/**
	 * authenticateWithCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLocalPlayer_Ref/index.html#//apple_ref/occ/instm/GKLocalPlayer/authenticateWithCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("authenticateWithCompletionHandler:")
	public native void authenticateWithCompletionHandler(
			@ObjCBlock(name = "call_authenticateWithCompletionHandler") Block_authenticateWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_authenticateWithCompletionHandler {
		@Generated
		void call_authenticateWithCompletionHandler(NSError arg0);
	}

	/**
	 * deleteSavedGamesWithName:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLocalPlayer_Ref/index.html#//apple_ref/occ/instm/GKLocalPlayer/deleteSavedGamesWithName:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("deleteSavedGamesWithName:completionHandler:")
	public native void deleteSavedGamesWithNameCompletionHandler(
			String name,
			@ObjCBlock(name = "call_deleteSavedGamesWithNameCompletionHandler") Block_deleteSavedGamesWithNameCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_deleteSavedGamesWithNameCompletionHandler {
		@Generated
		void call_deleteSavedGamesWithNameCompletionHandler(NSError arg0);
	}

	/**
	 * fetchSavedGamesWithCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLocalPlayer_Ref/index.html#//apple_ref/occ/instm/GKLocalPlayer/fetchSavedGamesWithCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fetchSavedGamesWithCompletionHandler:")
	public native void fetchSavedGamesWithCompletionHandler(
			@ObjCBlock(name = "call_fetchSavedGamesWithCompletionHandler") Block_fetchSavedGamesWithCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_fetchSavedGamesWithCompletionHandler {
		@Generated
		void call_fetchSavedGamesWithCompletionHandler(NSArray<? extends GKSavedGame> arg0,
				NSError arg1);
	}

	/**
	 * friends</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLocalPlayer_Ref/index.html#//apple_ref/occ/instp/GKLocalPlayer/friends">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("friends")
	public native NSArray<String> friends();

	/**
	 * generateIdentityVerificationSignatureWithCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLocalPlayer_Ref/index.html#//apple_ref/occ/instm/GKLocalPlayer/generateIdentityVerificationSignatureWithCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("generateIdentityVerificationSignatureWithCompletionHandler:")
	public native void generateIdentityVerificationSignatureWithCompletionHandler(
			@ObjCBlock(name = "call_generateIdentityVerificationSignatureWithCompletionHandler") Block_generateIdentityVerificationSignatureWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_generateIdentityVerificationSignatureWithCompletionHandler {
		@Generated
		void call_generateIdentityVerificationSignatureWithCompletionHandler(
				NSURL arg0, NSData arg1, NSData arg2, long arg3, NSError arg4);
	}

	@Generated
	@Selector("init")
	public native GKLocalPlayer init();

	/**
	 * authenticated</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLocalPlayer_Ref/index.html#//apple_ref/occ/instp/GKLocalPlayer/authenticated">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isAuthenticated")
	public native boolean isAuthenticated();

	/**
	 * underage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLocalPlayer_Ref/index.html#//apple_ref/occ/instp/GKLocalPlayer/underage">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isUnderage")
	public native boolean isUnderage();

	/**
	 * loadDefaultLeaderboardCategoryIDWithCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLocalPlayer_Ref/index.html#//apple_ref/occ/instm/GKLocalPlayer/loadDefaultLeaderboardCategoryIDWithCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("loadDefaultLeaderboardCategoryIDWithCompletionHandler:")
	public native void loadDefaultLeaderboardCategoryIDWithCompletionHandler(
			@ObjCBlock(name = "call_loadDefaultLeaderboardCategoryIDWithCompletionHandler") Block_loadDefaultLeaderboardCategoryIDWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_loadDefaultLeaderboardCategoryIDWithCompletionHandler {
		@Generated
		void call_loadDefaultLeaderboardCategoryIDWithCompletionHandler(
				String arg0, NSError arg1);
	}

	/**
	 * loadDefaultLeaderboardIdentifierWithCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLocalPlayer_Ref/index.html#//apple_ref/occ/instm/GKLocalPlayer/loadDefaultLeaderboardIdentifierWithCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("loadDefaultLeaderboardIdentifierWithCompletionHandler:")
	public native void loadDefaultLeaderboardIdentifierWithCompletionHandler(
			@ObjCBlock(name = "call_loadDefaultLeaderboardIdentifierWithCompletionHandler") Block_loadDefaultLeaderboardIdentifierWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_loadDefaultLeaderboardIdentifierWithCompletionHandler {
		@Generated
		void call_loadDefaultLeaderboardIdentifierWithCompletionHandler(
				String arg0, NSError arg1);
	}

	/**
	 * loadFriendPlayersWithCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLocalPlayer_Ref/index.html#//apple_ref/occ/instm/GKLocalPlayer/loadFriendPlayersWithCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("loadFriendPlayersWithCompletionHandler:")
	public native void loadFriendPlayersWithCompletionHandler(
			@ObjCBlock(name = "call_loadFriendPlayersWithCompletionHandler") Block_loadFriendPlayersWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_loadFriendPlayersWithCompletionHandler {
		@Generated
		void call_loadFriendPlayersWithCompletionHandler(NSArray<? extends GKPlayer> arg0,
				NSError arg1);
	}

	/**
	 * loadFriendsWithCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLocalPlayer_Ref/index.html#//apple_ref/occ/instm/GKLocalPlayer/loadFriendsWithCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("loadFriendsWithCompletionHandler:")
	public native void loadFriendsWithCompletionHandler(
			@ObjCBlock(name = "call_loadFriendsWithCompletionHandler") Block_loadFriendsWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_loadFriendsWithCompletionHandler {
		@Generated
		void call_loadFriendsWithCompletionHandler(NSArray<String> arg0,
				NSError arg1);
	}

	/**
	 * localPlayer</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLocalPlayer_Ref/index.html#//apple_ref/occ/clm/GKLocalPlayer/localPlayer">iOS Dev Center</a>
	 */
	@Generated
	@Selector("localPlayer")
	public static native GKLocalPlayer localPlayer();

	@Generated
	@IsOptional
	@Selector("player:didModifySavedGame:")
	public native void playerDidModifySavedGame(GKPlayer player,
			GKSavedGame savedGame);

	@Generated
	@IsOptional
	@Selector("player:hasConflictingSavedGames:")
	public native void playerHasConflictingSavedGames(GKPlayer player,
			NSArray<? extends GKSavedGame> savedGames);

	/**
	 * registerListener:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLocalPlayer_Ref/index.html#//apple_ref/occ/instm/GKLocalPlayer/registerListener:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("registerListener:")
	public native void registerListener(
			@Mapped(ObjCObjectMapper.class) GKLocalPlayerListener listener);

	/**
	 * resolveConflictingSavedGames:withData:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLocalPlayer_Ref/index.html#//apple_ref/occ/instm/GKLocalPlayer/resolveConflictingSavedGames:withData:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("resolveConflictingSavedGames:withData:completionHandler:")
	public native void resolveConflictingSavedGamesWithDataCompletionHandler(
			NSArray<? extends GKSavedGame> conflictingSavedGames,
			NSData data,
			@ObjCBlock(name = "call_resolveConflictingSavedGamesWithDataCompletionHandler") Block_resolveConflictingSavedGamesWithDataCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_resolveConflictingSavedGamesWithDataCompletionHandler {
		@Generated
		void call_resolveConflictingSavedGamesWithDataCompletionHandler(
				NSArray<? extends GKSavedGame> arg0, NSError arg1);
	}

	/**
	 * saveGameData:withName:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLocalPlayer_Ref/index.html#//apple_ref/occ/instm/GKLocalPlayer/saveGameData:withName:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("saveGameData:withName:completionHandler:")
	public native void saveGameDataWithNameCompletionHandler(
			NSData data,
			String name,
			@ObjCBlock(name = "call_saveGameDataWithNameCompletionHandler") Block_saveGameDataWithNameCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_saveGameDataWithNameCompletionHandler {
		@Generated
		void call_saveGameDataWithNameCompletionHandler(
				GKSavedGame arg0, NSError arg1);
	}

	/**
	 * authenticateHandler</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLocalPlayer_Ref/index.html#//apple_ref/occ/instp/GKLocalPlayer/authenticateHandler">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAuthenticateHandler:")
	public native void setAuthenticateHandler(
			@ObjCBlock(name = "call_setAuthenticateHandler") Block_setAuthenticateHandler value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setAuthenticateHandler {
		@Generated
		void call_setAuthenticateHandler(UIViewController arg0,
				NSError arg1);
	}

	/**
	 * setDefaultLeaderboardCategoryID:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLocalPlayer_Ref/index.html#//apple_ref/occ/instm/GKLocalPlayer/setDefaultLeaderboardCategoryID:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("setDefaultLeaderboardCategoryID:completionHandler:")
	public native void setDefaultLeaderboardCategoryIDCompletionHandler(
			String categoryID,
			@ObjCBlock(name = "call_setDefaultLeaderboardCategoryIDCompletionHandler") Block_setDefaultLeaderboardCategoryIDCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setDefaultLeaderboardCategoryIDCompletionHandler {
		@Generated
		void call_setDefaultLeaderboardCategoryIDCompletionHandler(
				NSError arg0);
	}

	/**
	 * setDefaultLeaderboardIdentifier:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLocalPlayer_Ref/index.html#//apple_ref/occ/instm/GKLocalPlayer/setDefaultLeaderboardIdentifier:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDefaultLeaderboardIdentifier:completionHandler:")
	public native void setDefaultLeaderboardIdentifierCompletionHandler(
			String leaderboardIdentifier,
			@ObjCBlock(name = "call_setDefaultLeaderboardIdentifierCompletionHandler") Block_setDefaultLeaderboardIdentifierCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setDefaultLeaderboardIdentifierCompletionHandler {
		@Generated
		void call_setDefaultLeaderboardIdentifierCompletionHandler(
				NSError arg0);
	}

	/**
	 * unregisterAllListeners</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLocalPlayer_Ref/index.html#//apple_ref/occ/instm/GKLocalPlayer/unregisterAllListeners">iOS Dev Center</a>
	 */
	@Generated
	@Selector("unregisterAllListeners")
	public native void unregisterAllListeners();

	/**
	 * unregisterListener:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLocalPlayer_Ref/index.html#//apple_ref/occ/instm/GKLocalPlayer/unregisterListener:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("unregisterListener:")
	public native void unregisterListener(
			@Mapped(ObjCObjectMapper.class) GKLocalPlayerListener listener);

	/**
	 * authenticateHandler</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLocalPlayer_Ref/index.html#//apple_ref/occ/instp/GKLocalPlayer/authenticateHandler">iOS Dev Center</a>
	 */
	@Generated
	@Selector("authenticateHandler")
	@ObjCBlock(name = "call_authenticateHandler_ret")
	public native Block_authenticateHandler_ret authenticateHandler();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_authenticateHandler_ret {
		@Generated
		void call_authenticateHandler_ret(UIViewController arg0, NSError arg1);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("anonymousGuestPlayerWithIdentifier:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object anonymousGuestPlayerWithIdentifier(
			String guestIdentifier);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
	public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
			@Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object anArgument);

	@Generated
	@Selector("classFallbacksForKeyedArchiver")
	public static native NSArray<String> classFallbacksForKeyedArchiver();

	@Generated
	@Selector("classForKeyedUnarchiver")
	public static native Class classForKeyedUnarchiver();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("initialize")
	public static native void initialize();

	@Generated
	@Selector("instanceMethodForSelector:")
	@FunctionPtr(name = "call_instanceMethodForSelector_ret")
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Selector("loadPlayersForIdentifiers:withCompletionHandler:")
	public static native void loadPlayersForIdentifiersWithCompletionHandler(
			NSArray<String> identifiers,
			@ObjCBlock(name = "call_loadPlayersForIdentifiersWithCompletionHandler") GKPlayer.Block_loadPlayersForIdentifiersWithCompletionHandler completionHandler);

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
