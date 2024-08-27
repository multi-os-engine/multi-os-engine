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
import apple.foundation.NSDictionary;

/**
 * GKMatchRequest represents the parameters needed to create the match.
 */
@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKMatchRequest extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GKMatchRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKMatchRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKMatchRequest allocWithZone(VoidPtr zone);

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

    /**
     * To determine the maximum allowed players for each type of match supported.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("maxPlayersAllowedForMatchOfType:")
    @NUInt
    public static native long maxPlayersAllowedForMatchOfType(@NUInt long matchType);

    @Generated
    @Owned
    @Selector("new")
    public static native GKMatchRequest new_objc();

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
     * Default number of players to use during matchmaking. If not set we will default to the number that the player
     * previously set for this game, or maxPlayers.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("defaultNumberOfPlayers")
    @NUInt
    public native long defaultNumberOfPlayers();

    @Generated
    @Selector("init")
    public native GKMatchRequest init();

    /**
     * Message sent to invited players, may be modified if using GKMatchmakerViewController
     * Will return nil if the player is underage or restricted.
     * 
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("inviteMessage")
    public native String inviteMessage();

    /**
     * API-Since: 6.0
     * Deprecated-Since: 8.0
     */
    @Nullable
    @Generated
    @Deprecated
    @Selector("inviteeResponseHandler")
    @ObjCBlock(name = "call_inviteeResponseHandler_ret")
    public native Block_inviteeResponseHandler_ret inviteeResponseHandler();

    /**
     * Maximum number of players for the match
     */
    @Generated
    @Selector("maxPlayers")
    @NUInt
    public native long maxPlayers();

    /**
     * Minimum number of players for the match
     */
    @Generated
    @Selector("minPlayers")
    @NUInt
    public native long minPlayers();

    /**
     * optional mask that specifies the role that the local player would like to play in the game. If this value is 0,
     * it will be set to 0xFFFFFFFF (the default), and this property will be ignored. If the value is nonzero, then
     * automatching uses the value as a mask that restricts the role the player can play in the group. Automatching with
     * player attributes matches new players into the game so that the bitwise OR of the masks of all the players in the
     * resulting match equals 0xFFFFFFFF.
     */
    @Generated
    @Selector("playerAttributes")
    public native int playerAttributes();

    /**
     * The player group identifier. Matchmaking will only take place between players in the same group.
     */
    @Generated
    @Selector("playerGroup")
    @NUInt
    public native long playerGroup();

    /**
     * Array of player IDs to invite, or nil if none
     * 
     * API-Since: 4.1
     * Deprecated-Since: 8.0
     */
    @Nullable
    @Generated
    @Deprecated
    @Selector("playersToInvite")
    public native NSArray<String> playersToInvite();

    /**
     * An recipientResponseHandler can be set in order to receive responses from programmatically invited players.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("recipientResponseHandler")
    @ObjCBlock(name = "call_recipientResponseHandler_ret")
    public native Block_recipientResponseHandler_ret recipientResponseHandler();

    /**
     * Array of GKPlayers to invite, or nil if none. This array can also include local guest players.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("recipients")
    public native NSArray<? extends GKPlayer> recipients();

    /**
     * Default number of players to use during matchmaking. If not set we will default to the number that the player
     * previously set for this game, or maxPlayers.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setDefaultNumberOfPlayers:")
    public native void setDefaultNumberOfPlayers(@NUInt long value);

    /**
     * Message sent to invited players, may be modified if using GKMatchmakerViewController
     * Will return nil if the player is underage or restricted.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setInviteMessage:")
    public native void setInviteMessage(@Nullable String value);

    /**
     * API-Since: 6.0
     * Deprecated-Since: 8.0
     */
    @Generated
    @Deprecated
    @Selector("setInviteeResponseHandler:")
    public native void setInviteeResponseHandler(
            @Nullable @ObjCBlock(name = "call_setInviteeResponseHandler") Block_setInviteeResponseHandler value);

    /**
     * Maximum number of players for the match
     */
    @Generated
    @Selector("setMaxPlayers:")
    public native void setMaxPlayers(@NUInt long value);

    /**
     * Minimum number of players for the match
     */
    @Generated
    @Selector("setMinPlayers:")
    public native void setMinPlayers(@NUInt long value);

    /**
     * optional mask that specifies the role that the local player would like to play in the game. If this value is 0,
     * it will be set to 0xFFFFFFFF (the default), and this property will be ignored. If the value is nonzero, then
     * automatching uses the value as a mask that restricts the role the player can play in the group. Automatching with
     * player attributes matches new players into the game so that the bitwise OR of the masks of all the players in the
     * resulting match equals 0xFFFFFFFF.
     */
    @Generated
    @Selector("setPlayerAttributes:")
    public native void setPlayerAttributes(int value);

    /**
     * The player group identifier. Matchmaking will only take place between players in the same group.
     */
    @Generated
    @Selector("setPlayerGroup:")
    public native void setPlayerGroup(@NUInt long value);

    /**
     * Array of player IDs to invite, or nil if none
     * 
     * API-Since: 4.1
     * Deprecated-Since: 8.0
     */
    @Generated
    @Deprecated
    @Selector("setPlayersToInvite:")
    public native void setPlayersToInvite(@Nullable NSArray<String> value);

    /**
     * An recipientResponseHandler can be set in order to receive responses from programmatically invited players.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setRecipientResponseHandler:")
    public native void setRecipientResponseHandler(
            @Nullable @ObjCBlock(name = "call_setRecipientResponseHandler") Block_setRecipientResponseHandler value);

    /**
     * Array of GKPlayers to invite, or nil if none. This array can also include local guest players.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setRecipients:")
    public native void setRecipients(@Nullable NSArray<? extends GKPlayer> value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_inviteeResponseHandler_ret {
        @Generated
        void call_inviteeResponseHandler_ret(@NotNull String arg0, @NInt long arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_recipientResponseHandler_ret {
        @Generated
        void call_recipientResponseHandler_ret(@NotNull GKPlayer arg0, @NInt long arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setInviteeResponseHandler {
        @Generated
        void call_setInviteeResponseHandler(@NotNull String arg0, @NInt long arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setRecipientResponseHandler {
        @Generated
        void call_setRecipientResponseHandler(@NotNull GKPlayer arg0, @NInt long arg1);
    }

    /**
     * Whether or not a match will be created only using automatch. If YES, then a player will not be able to
     * invite anyone (including contacts, friends, and nearby players) to the match, but rely on automatching to
     * find players for the match. Default is NO.
     * 
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("restrictToAutomatch")
    public native boolean restrictToAutomatch();

    /**
     * Whether or not a match will be created only using automatch. If YES, then a player will not be able to
     * invite anyone (including contacts, friends, and nearby players) to the match, but rely on automatching to
     * find players for the match. Default is NO.
     * 
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("setRestrictToAutomatch:")
    public native void setRestrictToAutomatch(boolean value);

    /**
     * The name of the queue, if rule-based matchmaking is used.
     * 
     * API-Since: 17.2
     */
    @Generated
    @Selector("queueName")
    @Nullable
    public native String queueName();

    /**
     * The recipient specific match properties, if rule-based matchmaking is used when inviting players.
     * 
     * API-Since: 17.2
     */
    @Generated
    @Selector("recipientProperties")
    @Nullable
    public native NSDictionary<? extends GKPlayer, ?> recipientProperties();

    /**
     * The name of the queue, if rule-based matchmaking is used.
     * 
     * API-Since: 17.2
     */
    @Generated
    @Selector("setQueueName:")
    public native void setQueueName(@Nullable String value);

    /**
     * The recipient specific match properties, if rule-based matchmaking is used when inviting players.
     * 
     * API-Since: 17.2
     */
    @Generated
    @Selector("setRecipientProperties:")
    public native void setRecipientProperties(@Nullable NSDictionary<? extends GKPlayer, ?> value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
