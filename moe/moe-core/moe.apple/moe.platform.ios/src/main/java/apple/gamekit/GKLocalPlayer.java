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
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 4.1
 */
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKLocalPlayer allocWithZone(VoidPtr zone);

    @NotNull
    @Generated
    @Selector("anonymousGuestPlayerWithIdentifier:")
    public static native GKLocalPlayer anonymousGuestPlayerWithIdentifier(@NotNull String guestIdentifier);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Deprecated
    @Generated
    @Selector("loadPlayersForIdentifiers:withCompletionHandler:")
    public static native void loadPlayersForIdentifiersWithCompletionHandler(@NotNull NSArray<String> identifiers,
            @Nullable @ObjCBlock(name = "call_loadPlayersForIdentifiersWithCompletionHandler") GKPlayer.Block_loadPlayersForIdentifiersWithCompletionHandler completionHandler);

    @NotNull
    @Generated
    @Selector("localPlayer")
    public static native GKLocalPlayer localPlayer();

    @Generated
    @Owned
    @Selector("new")
    public static native GKLocalPlayer new_objc();

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

    /**
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("authenticateHandler")
    @ObjCBlock(name = "call_authenticateHandler_ret")
    public native Block_authenticateHandler_ret authenticateHandler();

    /**
     * API-Since: 4.1
     * Deprecated-Since: 6.0
     * Deprecated-Message: Set the authenticateHandler instead
     */
    @Generated
    @Deprecated
    @Selector("authenticateWithCompletionHandler:")
    public native void authenticateWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_authenticateWithCompletionHandler") Block_authenticateWithCompletionHandler completionHandler);

    /**
     * Asynchronously delete saved games with the given name. The completion handler will indicate whether or not the
     * deletion was successful.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("deleteSavedGamesWithName:completionHandler:")
    public native void deleteSavedGamesWithNameCompletionHandler(@NotNull String name,
            @Nullable @ObjCBlock(name = "call_deleteSavedGamesWithNameCompletionHandler") Block_deleteSavedGamesWithNameCompletionHandler handler);

    /**
     * Asynchronously fetch saved games. The handler is called with an array of GKSavedGame objects or an error.
     * If there is more than one saved game with the same name then a conflict exists. The application should determine
     * the correct data to use and call resolveConflictingSavedGames:withData:completionHandler:. This may require data
     * merging or asking the user.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("fetchSavedGamesWithCompletionHandler:")
    public native void fetchSavedGamesWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_fetchSavedGamesWithCompletionHandler") Block_fetchSavedGamesWithCompletionHandler handler);

    /**
     * Array of player identifiers of friends for the local player. Not valid until loadFriendsWithCompletionHandler:
     * has completed.
     * 
     * API-Since: 4.1
     * Deprecated-Since: 8.0
     * Deprecated-Message: This property is obsolete, Use loadFriendPlayersWithCompletionHandler: instead
     */
    @Nullable
    @Generated
    @Deprecated
    @Selector("friends")
    public native NSArray<String> friends();

    /**
     * Generates a signature allowing 3rd party server to authenticate the GKLocalPlayer
     * Possible reasons for error:
     * 1. Communications problem
     * 2. Unauthenticated player
     * 
     * API-Since: 7.0
     * Deprecated-Since: 13.5
     * Deprecated-Message: API deprecated. Use fetchItemsForIdentityVerificationSignature: and the teamPlayerID value to
     * verify a user identity.
     */
    @Deprecated
    @Generated
    @Selector("generateIdentityVerificationSignatureWithCompletionHandler:")
    public native void generateIdentityVerificationSignatureWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_generateIdentityVerificationSignatureWithCompletionHandler") Block_generateIdentityVerificationSignatureWithCompletionHandler completionHandler);

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

    /**
     * API-Since: 6.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use loadDefaultLeaderboardIdentifierWithCompletionHandler: instead
     */
    @Generated
    @Deprecated
    @Selector("loadDefaultLeaderboardCategoryIDWithCompletionHandler:")
    public native void loadDefaultLeaderboardCategoryIDWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_loadDefaultLeaderboardCategoryIDWithCompletionHandler") Block_loadDefaultLeaderboardCategoryIDWithCompletionHandler completionHandler);

    /**
     * Load the default leaderboard identifier for the local player
     * Possible reasons for error:
     * 1. Communications problem
     * 2. Unauthenticated player
     * 3. Leaderboard not present
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("loadDefaultLeaderboardIdentifierWithCompletionHandler:")
    public native void loadDefaultLeaderboardIdentifierWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_loadDefaultLeaderboardIdentifierWithCompletionHandler") Block_loadDefaultLeaderboardIdentifierWithCompletionHandler completionHandler);

    /**
     * API-Since: 8.0
     * Deprecated-Since: 10.0
     */
    @Deprecated
    @Generated
    @Selector("loadFriendPlayersWithCompletionHandler:")
    public native void loadFriendPlayersWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_loadFriendPlayersWithCompletionHandler") Block_loadFriendPlayersWithCompletionHandler completionHandler);

    /**
     * This method is obsolete. It will never be invoked and its implementation does nothing**
     * 
     * API-Since: 4.1
     * Deprecated-Since: 8.0
     * Deprecated-Message: This is never invoked and its implementation does nothing, use
     * loadRecentPlayersWithCompletionHandler: instead
     */
    @Generated
    @Deprecated
    @Selector("loadFriendsWithCompletionHandler:")
    public native void loadFriendsWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_loadFriendsWithCompletionHandler") Block_loadFriendsWithCompletionHandler completionHandler);

    /**
     * Asynchronously load the recent players list as an array of GKPlayer. A recent player is someone that you have
     * played a game with or is a legacy game center friend. Calls completionHandler when finished. Error will be nil on
     * success.
     * Possible reasons for error:
     * 1. Communications problem
     * 2. Unauthenticated player
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("loadRecentPlayersWithCompletionHandler:")
    public native void loadRecentPlayersWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_loadRecentPlayersWithCompletionHandler") Block_loadRecentPlayersWithCompletionHandler completionHandler);

    @Generated
    @IsOptional
    @Selector("player:didModifySavedGame:")
    public native void playerDidModifySavedGame(@NotNull GKPlayer player, @NotNull GKSavedGame savedGame);

    @Generated
    @IsOptional
    @Selector("player:hasConflictingSavedGames:")
    public native void playerHasConflictingSavedGames(@NotNull GKPlayer player,
            @NotNull NSArray<? extends GKSavedGame> savedGames);

    /**
     * A single listener may be registered once. Registering multiple times results in undefined behavior. The
     * registered listener will receive callbacks for any selector it responds to.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("registerListener:")
    public native void registerListener(@NotNull @Mapped(ObjCObjectMapper.class) GKLocalPlayerListener listener);

    /**
     * Asynchronously resolve a saved game conflict. This deletes all versions included in conflictingSavedGames and
     * creates a new version with the given data. The completion handler is called with the newly created save and all
     * other remaining versions or an error.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("resolveConflictingSavedGames:withData:completionHandler:")
    public native void resolveConflictingSavedGamesWithDataCompletionHandler(
            @NotNull NSArray<? extends GKSavedGame> conflictingSavedGames, @NotNull NSData data,
            @Nullable @ObjCBlock(name = "call_resolveConflictingSavedGamesWithDataCompletionHandler") Block_resolveConflictingSavedGamesWithDataCompletionHandler handler);

    /**
     * Asynchronously save game data. If a saved game with that name already exists it is overwritten, otherwise a new
     * one is created. The completion handler is called with the new / modified GKSavedGame or an error.
     * If the saved game was in conflict then the overwritten version will be the one with the same deviceName if
     * present, otherwise the most recent overall.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("saveGameData:withName:completionHandler:")
    public native void saveGameDataWithNameCompletionHandler(@NotNull NSData data, @NotNull String name,
            @Nullable @ObjCBlock(name = "call_saveGameDataWithNameCompletionHandler") Block_saveGameDataWithNameCompletionHandler handler);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("setAuthenticateHandler:")
    public native void setAuthenticateHandler(
            @Nullable @ObjCBlock(name = "call_setAuthenticateHandler") Block_setAuthenticateHandler value);

    /**
     * API-Since: 6.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use setDefaultLeaderboardIdentifier:completionHandler: instead
     */
    @Generated
    @Deprecated
    @Selector("setDefaultLeaderboardCategoryID:completionHandler:")
    public native void setDefaultLeaderboardCategoryIDCompletionHandler(@Nullable String categoryID,
            @Nullable @ObjCBlock(name = "call_setDefaultLeaderboardCategoryIDCompletionHandler") Block_setDefaultLeaderboardCategoryIDCompletionHandler completionHandler);

    /**
     * Set the default leaderboard for the current game
     * Possible reasons for error:
     * 1. Communications problem
     * 2. Unauthenticated player
     * 3. Leaderboard not present
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setDefaultLeaderboardIdentifier:completionHandler:")
    public native void setDefaultLeaderboardIdentifierCompletionHandler(@NotNull String leaderboardIdentifier,
            @Nullable @ObjCBlock(name = "call_setDefaultLeaderboardIdentifierCompletionHandler") Block_setDefaultLeaderboardIdentifierCompletionHandler completionHandler);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("unregisterAllListeners")
    public native void unregisterAllListeners();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("unregisterListener:")
    public native void unregisterListener(@NotNull @Mapped(ObjCObjectMapper.class) GKLocalPlayerListener listener);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_authenticateHandler_ret {
        @Generated
        void call_authenticateHandler_ret(@Nullable UIViewController arg0, @Nullable NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_authenticateWithCompletionHandler {
        @Generated
        void call_authenticateWithCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteSavedGamesWithNameCompletionHandler {
        @Generated
        void call_deleteSavedGamesWithNameCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchSavedGamesWithCompletionHandler {
        @Generated
        void call_fetchSavedGamesWithCompletionHandler(@Nullable NSArray<? extends GKSavedGame> savedGames,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_generateIdentityVerificationSignatureWithCompletionHandler {
        @Generated
        void call_generateIdentityVerificationSignatureWithCompletionHandler(@Nullable NSURL publicKeyUrl,
                @Nullable NSData signature, @Nullable NSData salt, long timestamp, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadDefaultLeaderboardCategoryIDWithCompletionHandler {
        @Generated
        void call_loadDefaultLeaderboardCategoryIDWithCompletionHandler(@Nullable String categoryID,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadDefaultLeaderboardIdentifierWithCompletionHandler {
        @Generated
        void call_loadDefaultLeaderboardIdentifierWithCompletionHandler(@Nullable String leaderboardIdentifier,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadFriendPlayersWithCompletionHandler {
        @Generated
        void call_loadFriendPlayersWithCompletionHandler(@Nullable NSArray<? extends GKPlayer> friendPlayers,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadFriendsWithCompletionHandler {
        @Generated
        void call_loadFriendsWithCompletionHandler(@Nullable NSArray<String> friendIDs, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadRecentPlayersWithCompletionHandler {
        @Generated
        void call_loadRecentPlayersWithCompletionHandler(@Nullable NSArray<? extends GKPlayer> recentPlayers,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveConflictingSavedGamesWithDataCompletionHandler {
        @Generated
        void call_resolveConflictingSavedGamesWithDataCompletionHandler(
                @Nullable NSArray<? extends GKSavedGame> savedGames, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveGameDataWithNameCompletionHandler {
        @Generated
        void call_saveGameDataWithNameCompletionHandler(@Nullable GKSavedGame savedGame, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setAuthenticateHandler {
        @Generated
        void call_setAuthenticateHandler(@Nullable UIViewController arg0, @Nullable NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setDefaultLeaderboardCategoryIDCompletionHandler {
        @Generated
        void call_setDefaultLeaderboardCategoryIDCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setDefaultLeaderboardIdentifierCompletionHandler {
        @Generated
        void call_setDefaultLeaderboardIdentifierCompletionHandler(@Nullable NSError error);
    }

    /**
     * A Boolean value that declares whether or not multiplayer gaming is restricted on this device.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("isMultiplayerGamingRestricted")
    public native boolean isMultiplayerGamingRestricted();

    /**
     * Asynchronously load the challengable friends list as an array of GKPlayer. A challengable player is a friend
     * player with friend level FL1 and FL2. Calls completionHandler when finished. Error will be nil on success.
     * Possible reasons for error:
     * 1. Communications problem
     * 2. Unauthenticated player
     */
    @Generated
    @Selector("loadChallengableFriendsWithCompletionHandler:")
    public native void loadChallengableFriendsWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_loadChallengableFriendsWithCompletionHandler") Block_loadChallengableFriendsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadChallengableFriendsWithCompletionHandler {
        @Generated
        void call_loadChallengableFriendsWithCompletionHandler(
                @Nullable NSArray<? extends GKPlayer> challengableFriends, @Nullable NSError error);
    }

    /**
     * Obtain the primary GKLocalPlayer object.
     * The player is only available for offline play until logged in.
     * A temporary player is created if no account is set up.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("local")
    public static native GKLocalPlayer local();

    /**
     * Generates a signature allowing 3rd party server to authenticate the GKLocalPlayer
     * Possible reasons for error:
     * 1. Communications problem
     * 2. Unauthenticated player
     * 
     * API-Since: 13.5
     */
    @Generated
    @Selector("fetchItemsForIdentityVerificationSignature:")
    public native void fetchItemsForIdentityVerificationSignature(
            @Nullable @ObjCBlock(name = "call_fetchItemsForIdentityVerificationSignature") Block_fetchItemsForIdentityVerificationSignature completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchItemsForIdentityVerificationSignature {
        @Generated
        void call_fetchItemsForIdentityVerificationSignature(@Nullable NSURL publicKeyURL, @Nullable NSData signature,
                @Nullable NSData salt, long timestamp, @Nullable NSError error);
    }

    /**
     * A Boolean value that declares whether personalized communication is restricted on this device. If it is
     * restricted, the player will not be able to read or write personalized messages on game invites, challenges, or
     * enable voice communication in multiplayer games. Note: this value will always be true when isUnderage is true.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("isPersonalizedCommunicationRestricted")
    public native boolean isPersonalizedCommunicationRestricted();

    /**
     * observable property that becomes true when the friend request view controller is displayed. It becomes false when
     * it is dismissed
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("isPresentingFriendRequestViewController")
    public native boolean isPresentingFriendRequestViewController();

    /**
     * * loadFriends:
     * *
     * * Discussion:
     * * Calling this method will asynchronously load the player Game Center's
     * * friend list scoped to the calling application.
     * * Calls handler when finished.
     * *
     * * When -loadFriendsAuthorizationStatus == GKFriendsAuthorizationStatusNotDetermined or
     * * GKFriendsAuthorizationStatusRemoved, calling this method will trigger a
     * * prompt to request friend list authorization from the user.
     * *
     * * When -loadFriendsAuthorizationStatus == GKFriendsAuthorizationStatusAuthorized,
     * * This method will return an array of GKPlayers which have agreed to share their
     * * friend list with the calling application based on the same bundleID.
     * *
     * * The NSGKFriendListUsageDescription key must be specified in your
     * * Info.plist; otherwise, GKErrorFriendListUsageDescriptionMissing will be returned,
     * * as your app will be assumed not to support friend list.
     * 
     * * Possible reasons for error:
     * * - Communication error with server.
     * * - AuthorizationStatus != GKFriendsAuthorizationStatusAuthorized
     * * - NSGKFriendListUsageDescription missing from your Info.plist
     * * - User is not online
     * * - Unauthenticated player
     * 
     * API-Since: 14.5
     */
    @Generated
    @Selector("loadFriends:")
    public native void loadFriends(@NotNull @ObjCBlock(name = "call_loadFriends") Block_loadFriends completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadFriends {
        @Generated
        void call_loadFriends(@Nullable NSArray<? extends GKPlayer> friends, @Nullable NSError error);
    }

    /**
     * loadFriendsAuthorizationStatus:
     * 
     * Discussion:
     * Calling this will asynchronously load the current friend list authorization status
     * of calling application.
     * There may be an server call involve so there could be some slight delay
     * in getting the authorization status via handler block.
     * Calls handler when finished. Error will be nil on success.
     * 
     * Possible reasons for error:
     * - Communication error with server.
     * - NSGKFriendListUsageDescription missing from your Info.plist
     * - User is not online
     * - Unauthenticated player
     * 
     * API-Since: 14.5
     */
    @Generated
    @Selector("loadFriendsAuthorizationStatus:")
    public native void loadFriendsAuthorizationStatus(
            @NotNull @ObjCBlock(name = "call_loadFriendsAuthorizationStatus") Block_loadFriendsAuthorizationStatus completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadFriendsAuthorizationStatus {
        @Generated
        void call_loadFriendsAuthorizationStatus(@NInt long authorizationStatus, @Nullable NSError error);
    }

    /**
     * loadFriendsWithIdentifiers:completionHandler:
     * 
     * Discussion:
     * Calling this method will asynchronously return a list of GKPlayers to the provided
     * scoped identifiers (gamePlayerID or teamPlayerID) that you can use to interact with
     * GameKit framework.
     * Calls handler when finished.
     * 
     * When -loadFriendsAuthorizationStatus == GKFriendsAuthorizationStatusNotDetermined or
     * GKFriendsAuthorizationStatusRemoved, calling this method will trigger a
     * prompt to request friend list authorization from the user.
     * 
     * This method accepts gamePlayerID or teamPlayerID, and if the identifier
     * is valid, we will return a GKPlayer object correspond to that identifier.
     * 
     * No GKPlayer object will be returned for invalid identifiers. If all supplied
     * identifiers are invalid, and empty array will be returned.
     * 
     * If a player's friend revoke the friend list authorization for your application,
     * we will no longer return the GKPlayer object and you should delete the data
     * you've collected for the player with gamePlayerID or teamPlayerID on your end.
     * 
     * Possible reasons for error:
     * - Communication error with server.
     * - AuthorizationStatus != GKFriendsAuthorizationStatusAuthorized
     * - NSGKFriendListUsageDescription missing from your Info.plist
     * - Unauthenticated player
     * - User is not online
     * 
     * API-Since: 14.5
     */
    @Generated
    @Selector("loadFriendsWithIdentifiers:completionHandler:")
    public native void loadFriendsWithIdentifiersCompletionHandler(@NotNull NSArray<String> identifiers,
            @NotNull @ObjCBlock(name = "call_loadFriendsWithIdentifiersCompletionHandler") Block_loadFriendsWithIdentifiersCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadFriendsWithIdentifiersCompletionHandler {
        @Generated
        void call_loadFriendsWithIdentifiersCompletionHandler(@Nullable NSArray<? extends GKPlayer> friends,
                @Nullable NSError error);
    }

    /**
     * presentFriendRequestCreatorFromViewController:
     * 
     * Discussion:
     * iOS only. When invoked, a Messages sheet will be presented on the viewController passed in, using the existing
     * flow of presentation on behalf of an application.
     * If an error is returned, control are returned directly to the application, without presentation.
     * 
     * Possible reasons for error:
     * - The local player user account is not allowed to add friends
     * - The device is not allowing outgoing traffic at the time of the operation
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("presentFriendRequestCreatorFromViewController:error:")
    public native boolean presentFriendRequestCreatorFromViewControllerError(@NotNull UIViewController viewController,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}
