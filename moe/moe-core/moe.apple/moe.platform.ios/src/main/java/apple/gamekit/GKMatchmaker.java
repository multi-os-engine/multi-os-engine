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
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * GKMatchmaker is a singleton object to manage match creation from invites and automatching.
 * 
 * API-Since: 4.1
 */
@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKMatchmaker extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GKMatchmaker(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKMatchmaker alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKMatchmaker allocWithZone(VoidPtr zone);

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

    @Generated
    @Owned
    @Selector("new")
    public static native GKMatchmaker new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The shared matchmaker
     */
    @NotNull
    @Generated
    @Selector("sharedMatchmaker")
    public static native GKMatchmaker sharedMatchmaker();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Automatching or invites to add additional players to a peer-to-peer match for the specified request. Error will
     * be nil on success:
     * Possible reasons for error:
     * 1. Communications failure
     * 2. Timeout
     */
    @Generated
    @Selector("addPlayersToMatch:matchRequest:completionHandler:")
    public native void addPlayersToMatchMatchRequestCompletionHandler(@NotNull GKMatch match,
            @NotNull GKMatchRequest matchRequest,
            @Nullable @ObjCBlock(name = "call_addPlayersToMatchMatchRequestCompletionHandler") Block_addPlayersToMatchMatchRequestCompletionHandler completionHandler);

    /**
     * Cancel matchmaking and any pending invites
     */
    @Generated
    @Selector("cancel")
    public native void cancel();

    /**
     * This method is obsolete. It will never be invoked and its implementation does nothing**
     * 
     * API-Since: 6.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: This is never invoked and its implementation does nothing, use cancelPendingInviteToPlayer:
     */
    @Generated
    @Deprecated
    @Selector("cancelInviteToPlayer:")
    public native void cancelInviteToPlayer(@NotNull String playerID);

    /**
     * Cancel a pending invitation to a player
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("cancelPendingInviteToPlayer:")
    public native void cancelPendingInviteToPlayer(@NotNull GKPlayer player);

    /**
     * Automatching or invites to find a peer-to-peer match for the specified request. Error will be nil on success:
     * Possible reasons for error:
     * 1. Communications failure
     * 2. Unauthenticated player
     * 3. Timeout
     * Note that the players property on the returned GKMatch instance will only contain connected players. It will
     * initially be empty as players are connecting. Implement the GKMatchDelegate method
     * match:player:didChangeConnectionState: to listen for updates to the GKMatch instance's players property.
     */
    @Generated
    @Selector("findMatchForRequest:withCompletionHandler:")
    public native void findMatchForRequestWithCompletionHandler(@NotNull GKMatchRequest request,
            @Nullable @ObjCBlock(name = "call_findMatchForRequestWithCompletionHandler") Block_findMatchForRequestWithCompletionHandler completionHandler);

    /**
     * This method is obsolete. It will never be invoked and its implementation does nothing**
     * 
     * API-Since: 4.1
     * Deprecated-Since: 8.0
     * Deprecated-Message: This is never invoked and its implementation does nothing, use findPlayersForHostedRequest:
     */
    @Generated
    @Deprecated
    @Selector("findPlayersForHostedMatchRequest:withCompletionHandler:")
    public native void findPlayersForHostedMatchRequestWithCompletionHandler(@NotNull GKMatchRequest request,
            @Nullable @ObjCBlock(name = "call_findPlayersForHostedMatchRequestWithCompletionHandler") Block_findPlayersForHostedMatchRequestWithCompletionHandler completionHandler);

    /**
     * Automatching or invites for host-client match request. This returns a list of player identifiers to be included
     * in the match. Determination and communication with the host is not part of this API.
     * When inviting, no player identifiers will be returned. Player responses will be reported via the
     * inviteeResponseHandler.
     * Possible reasons for error:
     * 1. Communications failure
     * 2. Unauthenticated player
     * 3. Timeout
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("findPlayersForHostedRequest:withCompletionHandler:")
    public native void findPlayersForHostedRequestWithCompletionHandler(@NotNull GKMatchRequest request,
            @Nullable @ObjCBlock(name = "call_findPlayersForHostedRequestWithCompletionHandler") Block_findPlayersForHostedRequestWithCompletionHandler completionHandler);

    /**
     * Call this when finished with all programmatic P2P invites/matchmaking, for compatability with connected players
     * using GKMatchmakerViewController.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("finishMatchmakingForMatch:")
    public native void finishMatchmakingForMatch(@NotNull GKMatch match);

    @Generated
    @Selector("init")
    public native GKMatchmaker init();

    /**
     * API-Since: 4.1
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use registerListener on GKLocalPlayer to register an object that implements the
     * GKInviteEventListenerProtocol instead
     */
    @Nullable
    @Generated
    @Deprecated
    @Selector("inviteHandler")
    @ObjCBlock(name = "call_inviteHandler_ret")
    public native Block_inviteHandler_ret inviteHandler();

    /**
     * Get a match for an accepted invite
     * Possible reasons for error:
     * 1. Communications failure
     * 2. Invite cancelled
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("matchForInvite:completionHandler:")
    public native void matchForInviteCompletionHandler(@NotNull GKInvite invite,
            @Nullable @ObjCBlock(name = "call_matchForInviteCompletionHandler") Block_matchForInviteCompletionHandler completionHandler);

    /**
     * Query the server for recent activity for all the player groups of that game. Error will be nil on success.
     * Possible reasons for error:
     * 1. Communications failure
     */
    @Generated
    @Selector("queryActivityWithCompletionHandler:")
    public native void queryActivityWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_queryActivityWithCompletionHandler") Block_queryActivityWithCompletionHandler completionHandler);

    /**
     * Query the server for recent activity in the specified player group. A larger value indicates that a given group
     * has seen more recent activity. Error will be nil on success.
     * Possible reasons for error:
     * 1. Communications failure
     */
    @Generated
    @Selector("queryPlayerGroupActivity:withCompletionHandler:")
    public native void queryPlayerGroupActivityWithCompletionHandler(@NUInt long playerGroup,
            @Nullable @ObjCBlock(name = "call_queryPlayerGroupActivityWithCompletionHandler") Block_queryPlayerGroupActivityWithCompletionHandler completionHandler);

    /**
     * API-Since: 4.1
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use registerListener on GKLocalPlayer to register an object that implements the
     * GKInviteEventListenerProtocol instead
     */
    @Generated
    @Deprecated
    @Selector("setInviteHandler:")
    public native void setInviteHandler(
            @Nullable @ObjCBlock(name = "call_setInviteHandler") Block_setInviteHandler value);

    /**
     * Start browsing for nearby players that can be invited to a match. The reachableHandler will be called for each
     * player found with a compatible game. It may be called more than once for the same player if that player ever
     * becomes unreachable (e.g. moves out of range). You should call stopBrowsingForNearbyPlayers when finished
     * browsing.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("startBrowsingForNearbyPlayersWithHandler:")
    public native void startBrowsingForNearbyPlayersWithHandler(
            @Nullable @ObjCBlock(name = "call_startBrowsingForNearbyPlayersWithHandler") Block_startBrowsingForNearbyPlayersWithHandler reachableHandler);

    /**
     * This method is obsolete. It will never be invoked and its implementation does nothing**
     * 
     * API-Since: 6.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: This is never invoked and its implementation does nothing, Use
     * startBrowsingForNearbyPlayersWithHandler: instead
     */
    @Generated
    @Deprecated
    @Selector("startBrowsingForNearbyPlayersWithReachableHandler:")
    public native void startBrowsingForNearbyPlayersWithReachableHandler(
            @Nullable @ObjCBlock(name = "call_startBrowsingForNearbyPlayersWithReachableHandler") Block_startBrowsingForNearbyPlayersWithReachableHandler reachableHandler);

    /**
     * Stop browsing for nearby players.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("stopBrowsingForNearbyPlayers")
    public native void stopBrowsingForNearbyPlayers();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addPlayersToMatchMatchRequestCompletionHandler {
        @Generated
        void call_addPlayersToMatchMatchRequestCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_findMatchForRequestWithCompletionHandler {
        @Generated
        void call_findMatchForRequestWithCompletionHandler(@Nullable GKMatch match, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_findPlayersForHostedMatchRequestWithCompletionHandler {
        @Generated
        void call_findPlayersForHostedMatchRequestWithCompletionHandler(@Nullable NSArray<String> playerIDs,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_findPlayersForHostedRequestWithCompletionHandler {
        @Generated
        void call_findPlayersForHostedRequestWithCompletionHandler(@Nullable NSArray<? extends GKPlayer> players,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_inviteHandler_ret {
        @Generated
        void call_inviteHandler_ret(@NotNull GKInvite arg0, @Nullable NSArray<?> arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_matchForInviteCompletionHandler {
        @Generated
        void call_matchForInviteCompletionHandler(@Nullable GKMatch match, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_queryActivityWithCompletionHandler {
        @Generated
        void call_queryActivityWithCompletionHandler(@NInt long activity, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_queryPlayerGroupActivityWithCompletionHandler {
        @Generated
        void call_queryPlayerGroupActivityWithCompletionHandler(@NInt long activity, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setInviteHandler {
        @Generated
        void call_setInviteHandler(@NotNull GKInvite arg0, @Nullable NSArray<?> arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startBrowsingForNearbyPlayersWithHandler {
        @Generated
        void call_startBrowsingForNearbyPlayersWithHandler(@NotNull GKPlayer player, boolean reachable);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startBrowsingForNearbyPlayersWithReachableHandler {
        @Generated
        void call_startBrowsingForNearbyPlayersWithReachableHandler(@NotNull String playerID, boolean reachable);
    }

    /**
     * Activate a group activity by Game Center for your game, which allows people in the FaceTime call to join the
     * local player's game. The handler will be called for each player who joined from the activity.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("startGroupActivityWithPlayerHandler:")
    public native void startGroupActivityWithPlayerHandler(
            @NotNull @ObjCBlock(name = "call_startGroupActivityWithPlayerHandler") Block_startGroupActivityWithPlayerHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startGroupActivityWithPlayerHandler {
        @Generated
        void call_startGroupActivityWithPlayerHandler(@NotNull GKPlayer player);
    }

    /**
     * End the group activity created by Game Center for your game, which was activated by the local player.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("stopGroupActivity")
    public native void stopGroupActivity();
}
