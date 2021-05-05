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

package apple.gamekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.gamekit.protocol.GKLocalPlayerListener;
import apple.gamekit.protocol.GKSavedGameListener;
import apple.uikit.UIViewController;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKLocalPlayer alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("anonymousGuestPlayerWithIdentifier:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object anonymousGuestPlayerWithIdentifier(String guestIdentifier);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

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
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("loadPlayersForIdentifiers:withCompletionHandler:")
    public static native void loadPlayersForIdentifiersWithCompletionHandler(NSArray<String> identifiers,
            @ObjCBlock(name = "call_loadPlayersForIdentifiersWithCompletionHandler") GKPlayer.Block_loadPlayersForIdentifiersWithCompletionHandler completionHandler);

    @Generated
    @Selector("localPlayer")
    public static native GKLocalPlayer localPlayer();

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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("authenticateHandler")
    @ObjCBlock(name = "call_authenticateHandler_ret")
    public native Block_authenticateHandler_ret authenticateHandler();

    @Generated
    @Deprecated
    @Selector("authenticateWithCompletionHandler:")
    public native void authenticateWithCompletionHandler(
            @ObjCBlock(name = "call_authenticateWithCompletionHandler") Block_authenticateWithCompletionHandler completionHandler);

    /**
     * Asynchronously delete saved games with the given name. The completion handler will indicate whether or not the deletion was successful.
     */
    @Generated
    @Selector("deleteSavedGamesWithName:completionHandler:")
    public native void deleteSavedGamesWithNameCompletionHandler(String name,
            @ObjCBlock(name = "call_deleteSavedGamesWithNameCompletionHandler") Block_deleteSavedGamesWithNameCompletionHandler handler);

    /**
     * Asynchronously fetch saved games. The handler is called with an array of GKSavedGame objects or an error.
     * If there is more than one saved game with the same name then a conflict exists. The application should determine the correct data to use and call resolveConflictingSavedGames:withData:completionHandler:. This may require data merging or asking the user.
     */
    @Generated
    @Selector("fetchSavedGamesWithCompletionHandler:")
    public native void fetchSavedGamesWithCompletionHandler(
            @ObjCBlock(name = "call_fetchSavedGamesWithCompletionHandler") Block_fetchSavedGamesWithCompletionHandler handler);

    /**
     * Array of player identifiers of friends for the local player. Not valid until loadFriendsWithCompletionHandler: has completed.
     */
    @Generated
    @Deprecated
    @Selector("friends")
    public native NSArray<String> friends();

    /**
     * Generates a signature allowing 3rd party server to authenticate the GKLocalPlayer
     * Possible reasons for error:
     * 1. Communications problem
     * 2. Unauthenticated player
     */
    @Generated
    @Selector("generateIdentityVerificationSignatureWithCompletionHandler:")
    public native void generateIdentityVerificationSignatureWithCompletionHandler(
            @ObjCBlock(name = "call_generateIdentityVerificationSignatureWithCompletionHandler") Block_generateIdentityVerificationSignatureWithCompletionHandler completionHandler);

    @Generated
    @Selector("init")
    public native GKLocalPlayer init();

    /**
     * Authentication state
     */
    @Generated
    @Selector("isAuthenticated")
    public native boolean isAuthenticated();

    /**
     * Indicates if a player is under age
     */
    @Generated
    @Selector("isUnderage")
    public native boolean isUnderage();

    @Generated
    @Deprecated
    @Selector("loadDefaultLeaderboardCategoryIDWithCompletionHandler:")
    public native void loadDefaultLeaderboardCategoryIDWithCompletionHandler(
            @ObjCBlock(name = "call_loadDefaultLeaderboardCategoryIDWithCompletionHandler") Block_loadDefaultLeaderboardCategoryIDWithCompletionHandler completionHandler);

    /**
     * Load the default leaderboard identifier for the local player
     * Possible reasons for error:
     * 1. Communications problem
     * 2. Unauthenticated player
     * 3. Leaderboard not present
     */
    @Generated
    @Selector("loadDefaultLeaderboardIdentifierWithCompletionHandler:")
    public native void loadDefaultLeaderboardIdentifierWithCompletionHandler(
            @ObjCBlock(name = "call_loadDefaultLeaderboardIdentifierWithCompletionHandler") Block_loadDefaultLeaderboardIdentifierWithCompletionHandler completionHandler);

    @Generated
    @Selector("loadFriendPlayersWithCompletionHandler:")
    public native void loadFriendPlayersWithCompletionHandler(
            @ObjCBlock(name = "call_loadFriendPlayersWithCompletionHandler") Block_loadFriendPlayersWithCompletionHandler completionHandler);

    /**
     * This method is obsolete. It will never be invoked and its implementation does nothing**
     */
    @Generated
    @Deprecated
    @Selector("loadFriendsWithCompletionHandler:")
    public native void loadFriendsWithCompletionHandler(
            @ObjCBlock(name = "call_loadFriendsWithCompletionHandler") Block_loadFriendsWithCompletionHandler completionHandler);

    /**
     * Asynchronously load the recent players list as an array of GKPlayer.  A recent player is someone that you have played a game with or is a legacy game center friend.  Calls completionHandler when finished. Error will be nil on success.
     * Possible reasons for error:
     * 1. Communications problem
     * 2. Unauthenticated player
     */
    @Generated
    @Selector("loadRecentPlayersWithCompletionHandler:")
    public native void loadRecentPlayersWithCompletionHandler(
            @ObjCBlock(name = "call_loadRecentPlayersWithCompletionHandler") Block_loadRecentPlayersWithCompletionHandler completionHandler);

    @Generated
    @IsOptional
    @Selector("player:didModifySavedGame:")
    public native void playerDidModifySavedGame(GKPlayer player, GKSavedGame savedGame);

    @Generated
    @IsOptional
    @Selector("player:hasConflictingSavedGames:")
    public native void playerHasConflictingSavedGames(GKPlayer player, NSArray<? extends GKSavedGame> savedGames);

    /**
     * A single listener may be registered once. Registering multiple times results in undefined behavior. The registered listener will receive callbacks for any selector it responds to.
     */
    @Generated
    @Selector("registerListener:")
    public native void registerListener(@Mapped(ObjCObjectMapper.class) GKLocalPlayerListener listener);

    /**
     * Asynchronously resolve a saved game conflict. This deletes all versions included in conflictingSavedGames and creates a new version with the given data. The completion handler is called with the newly created save and all other remaining versions or an error.
     */
    @Generated
    @Selector("resolveConflictingSavedGames:withData:completionHandler:")
    public native void resolveConflictingSavedGamesWithDataCompletionHandler(
            NSArray<? extends GKSavedGame> conflictingSavedGames, NSData data,
            @ObjCBlock(name = "call_resolveConflictingSavedGamesWithDataCompletionHandler") Block_resolveConflictingSavedGamesWithDataCompletionHandler handler);

    /**
     * Asynchronously save game data. If a saved game with that name already exists it is overwritten, otherwise a new one is created. The completion handler is called with the new / modified GKSavedGame or an error.
     * If the saved game was in conflict then the overwritten version will be the one with the same deviceName if present, otherwise the most recent overall.
     */
    @Generated
    @Selector("saveGameData:withName:completionHandler:")
    public native void saveGameDataWithNameCompletionHandler(NSData data, String name,
            @ObjCBlock(name = "call_saveGameDataWithNameCompletionHandler") Block_saveGameDataWithNameCompletionHandler handler);

    @Generated
    @Selector("setAuthenticateHandler:")
    public native void setAuthenticateHandler(
            @ObjCBlock(name = "call_setAuthenticateHandler") Block_setAuthenticateHandler value);

    @Generated
    @Deprecated
    @Selector("setDefaultLeaderboardCategoryID:completionHandler:")
    public native void setDefaultLeaderboardCategoryIDCompletionHandler(String categoryID,
            @ObjCBlock(name = "call_setDefaultLeaderboardCategoryIDCompletionHandler") Block_setDefaultLeaderboardCategoryIDCompletionHandler completionHandler);

    /**
     * Set the default leaderboard for the current game
     * Possible reasons for error:
     * 1. Communications problem
     * 2. Unauthenticated player
     * 3. Leaderboard not present
     */
    @Generated
    @Selector("setDefaultLeaderboardIdentifier:completionHandler:")
    public native void setDefaultLeaderboardIdentifierCompletionHandler(String leaderboardIdentifier,
            @ObjCBlock(name = "call_setDefaultLeaderboardIdentifierCompletionHandler") Block_setDefaultLeaderboardIdentifierCompletionHandler completionHandler);

    @Generated
    @Selector("unregisterAllListeners")
    public native void unregisterAllListeners();

    @Generated
    @Selector("unregisterListener:")
    public native void unregisterListener(@Mapped(ObjCObjectMapper.class) GKLocalPlayerListener listener);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_authenticateHandler_ret {
        @Generated
        void call_authenticateHandler_ret(UIViewController arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_authenticateWithCompletionHandler {
        @Generated
        void call_authenticateWithCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteSavedGamesWithNameCompletionHandler {
        @Generated
        void call_deleteSavedGamesWithNameCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchSavedGamesWithCompletionHandler {
        @Generated
        void call_fetchSavedGamesWithCompletionHandler(NSArray<? extends GKSavedGame> savedGames, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_generateIdentityVerificationSignatureWithCompletionHandler {
        @Generated
        void call_generateIdentityVerificationSignatureWithCompletionHandler(NSURL publicKeyUrl, NSData signature,
                NSData salt, long timestamp, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadDefaultLeaderboardCategoryIDWithCompletionHandler {
        @Generated
        void call_loadDefaultLeaderboardCategoryIDWithCompletionHandler(String categoryID, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadDefaultLeaderboardIdentifierWithCompletionHandler {
        @Generated
        void call_loadDefaultLeaderboardIdentifierWithCompletionHandler(String leaderboardIdentifier, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadFriendPlayersWithCompletionHandler {
        @Generated
        void call_loadFriendPlayersWithCompletionHandler(NSArray<? extends GKPlayer> friendPlayers, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadFriendsWithCompletionHandler {
        @Generated
        void call_loadFriendsWithCompletionHandler(NSArray<String> friendIDs, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadRecentPlayersWithCompletionHandler {
        @Generated
        void call_loadRecentPlayersWithCompletionHandler(NSArray<? extends GKPlayer> recentPlayers, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveConflictingSavedGamesWithDataCompletionHandler {
        @Generated
        void call_resolveConflictingSavedGamesWithDataCompletionHandler(NSArray<? extends GKSavedGame> savedGames,
                NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveGameDataWithNameCompletionHandler {
        @Generated
        void call_saveGameDataWithNameCompletionHandler(GKSavedGame savedGame, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setAuthenticateHandler {
        @Generated
        void call_setAuthenticateHandler(UIViewController arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setDefaultLeaderboardCategoryIDCompletionHandler {
        @Generated
        void call_setDefaultLeaderboardCategoryIDCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setDefaultLeaderboardIdentifierCompletionHandler {
        @Generated
        void call_setDefaultLeaderboardIdentifierCompletionHandler(NSError error);
    }

    /**
     * A Boolean value that declares whether or not multiplayer gaming is restricted on this device.
     */
    @Generated
    @Selector("isMultiplayerGamingRestricted")
    public native boolean isMultiplayerGamingRestricted();

    /**
     * Asynchronously load the challengable friends list as an array of GKPlayer.  A challengable player is a friend player with friend level FL1 and FL2.  Calls completionHandler when finished. Error will be nil on success.
     * Possible reasons for error:
     * 1. Communications problem
     * 2. Unauthenticated player
     */
    @Generated
    @Selector("loadChallengableFriendsWithCompletionHandler:")
    public native void loadChallengableFriendsWithCompletionHandler(
            @ObjCBlock(name = "call_loadChallengableFriendsWithCompletionHandler") Block_loadChallengableFriendsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadChallengableFriendsWithCompletionHandler {
        @Generated
        void call_loadChallengableFriendsWithCompletionHandler(NSArray<? extends GKPlayer> challengableFriends,
                NSError error);
    }

    /**
     * Obtain the primary GKLocalPlayer object.
     * The player is only available for offline play until logged in.
     * A temporary player is created if no account is set up.
     */
    @Generated
    @Selector("local")
    public static native GKLocalPlayer local();

    /**
     * Generates a signature allowing 3rd party server to authenticate the GKLocalPlayer
     * Possible reasons for error:
     * 1. Communications problem
     * 2. Unauthenticated player
     */
    @Generated
    @Selector("fetchItemsForIdentityVerificationSignature:")
    public native void fetchItemsForIdentityVerificationSignature(
            @ObjCBlock(name = "call_fetchItemsForIdentityVerificationSignature") Block_fetchItemsForIdentityVerificationSignature completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchItemsForIdentityVerificationSignature {
        @Generated
        void call_fetchItemsForIdentityVerificationSignature(NSURL publicKeyURL, NSData signature, NSData salt,
                long timestamp, NSError error);
    }

    /**
     * A Boolean value that declares whether personalized communication is restricted on this device. If it is restricted, the player will not be able to read or write personalized messages on game invites, challenges, or enable voice communication in multiplayer games.  Note: this value will always be true when isUnderage is true.
     */
    @Generated
    @Selector("isPersonalizedCommunicationRestricted")
    public native boolean isPersonalizedCommunicationRestricted();
}
