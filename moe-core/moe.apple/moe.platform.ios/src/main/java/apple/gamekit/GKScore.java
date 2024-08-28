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
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * GKScore represents a score in the leaderboards.
 * 
 * API-Since: 4.1
 * Deprecated-Since: 14.0
 */
@Deprecated
@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKScore extends NSObject implements NSCoding, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected GKScore(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKScore alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKScore allocWithZone(VoidPtr zone);

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
    public static native GKScore new_objc();

    /**
     * Report scores to the server. The value must be set, and date may be changed.
     * Possible reasons for error:
     * 1. Value not set
     * 2. Local player not authenticated
     * 3. Communications problem
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("reportScores:withCompletionHandler:")
    public static native void reportScoresWithCompletionHandler(@NotNull NSArray<? extends GKScore> scores,
            @Nullable @ObjCBlock(name = "call_reportScoresWithCompletionHandler") Block_reportScoresWithCompletionHandler completionHandler);

    /**
     * Use this alternative to reportScores:withCompletionHandler: to allow only certain specific challenges to be
     * completed. Pass nil to avoid completing any challenges.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("reportScores:withEligibleChallenges:withCompletionHandler:")
    public static native void reportScoresWithEligibleChallengesWithCompletionHandler(
            @NotNull NSArray<? extends GKScore> scores, @NotNull NSArray<? extends GKChallenge> challenges,
            @Nullable @ObjCBlock(name = "call_reportScoresWithEligibleChallengesWithCompletionHandler") Block_reportScoresWithEligibleChallengesWithCompletionHandler completionHandler);

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 4.1
     * Deprecated-Since: 7.0
     */
    @Nullable
    @Generated
    @Deprecated
    @Selector("category")
    public native String category();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 17.0
     */
    @Deprecated
    @NotNull
    @Generated
    @Selector("challengeComposeControllerWithMessage:players:completionHandler:")
    public native UIViewController challengeComposeControllerWithMessagePlayersCompletionHandler(
            @Nullable String message, @Nullable NSArray<? extends GKPlayer> players,
            @Nullable @ObjCBlock(name = "call_challengeComposeControllerWithMessagePlayersCompletionHandler") Block_challengeComposeControllerWithMessagePlayersCompletionHandler completionHandler);

    /**
     * This method is obsolete. Calling this method does nothing and will return nil **
     * 
     * API-Since: 7.0
     * Deprecated-Since: 8.0
     */
    @Nullable
    @Generated
    @Deprecated
    @Selector("challengeComposeControllerWithPlayers:message:completionHandler:")
    public native UIViewController challengeComposeControllerWithPlayersMessageCompletionHandler(
            @Nullable NSArray<String> playerIDs, @Nullable String message,
            @Nullable @ObjCBlock(name = "call_challengeComposeControllerWithPlayersMessageCompletionHandler") Block_challengeComposeControllerWithPlayersMessageCompletionHandler completionHandler);

    /**
     * optional additional context that allows a game to store and retrieve additional data associated with the store.
     * Default value of zero is returned if no value is set.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("context")
    public native long context();

    /**
     * The date this score was recorded. A newly initialized, unsubmitted GKScore records the current date at init time.
     */
    @NotNull
    @Generated
    @Selector("date")
    public native NSDate date();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * The score formatted as a string, localized with a label
     */
    @Nullable
    @Generated
    @Selector("formattedValue")
    public native String formattedValue();

    @Generated
    @Selector("init")
    public native GKScore init();

    /**
     * API-Since: 4.1
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("initWithCategory:")
    public native GKScore initWithCategory(@Nullable String category);

    @Generated
    @Selector("initWithCoder:")
    public native GKScore initWithCoder(@NotNull NSCoder coder);

    /**
     * Initialize the score with the local player and current date.
     */
    @Generated
    @Selector("initWithLeaderboardIdentifier:")
    public native GKScore initWithLeaderboardIdentifier(@NotNull String identifier);

    /**
     * This method is obsolete. Calling this initialiser does nothing and will return nil **
     * 
     * API-Since: 7.0
     * Deprecated-Since: 8.0
     */
    @Generated
    @Deprecated
    @Selector("initWithLeaderboardIdentifier:forPlayer:")
    public native GKScore initWithLeaderboardIdentifierForPlayer(@NotNull String identifier, @NotNull String playerID);

    /**
     * Initialize the achievement for a specific player. Use to submit participant scores when ending a turn-based
     * match.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("initWithLeaderboardIdentifier:player:")
    public native GKScore initWithLeaderboardIdentifierPlayer(@NotNull String identifier, @NotNull GKPlayer player);

    /**
     * This method is obsolete. It will never be invoked and its implementation does nothing**
     * 
     * API-Since: 6.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("issueChallengeToPlayers:message:")
    public native void issueChallengeToPlayersMessage(@Nullable NSArray<String> playerIDs, @Nullable String message);

    /**
     * leaderboard identifier (required)
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("leaderboardIdentifier")
    public native String leaderboardIdentifier();

    /**
     * The player that recorded the score.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("player")
    public native GKPlayer player();

    /**
     * The identifier of the player that recorded the score.
     * 
     * API-Since: 4.1
     * Deprecated-Since: 8.0
     */
    @Nullable
    @Generated
    @Deprecated
    @Selector("playerID")
    public native String playerID();

    /**
     * The rank of the player within the leaderboard, only valid when returned from GKLeaderboard
     */
    @Generated
    @Selector("rank")
    @NInt
    public native long rank();

    /**
     * API-Since: 4.1
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("reportScoreWithCompletionHandler:")
    public native void reportScoreWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_reportScoreWithCompletionHandler") Block_reportScoreWithCompletionHandler completionHandler);

    /**
     * API-Since: 4.1
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("setCategory:")
    public native void setCategory(@Nullable String value);

    /**
     * optional additional context that allows a game to store and retrieve additional data associated with the store.
     * Default value of zero is returned if no value is set.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setContext:")
    public native void setContext(long value);

    /**
     * leaderboard identifier (required)
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setLeaderboardIdentifier:")
    public native void setLeaderboardIdentifier(@NotNull String value);

    /**
     * Convenience property to make the leaderboard associated with this GKScore, the default leaderboard for this
     * player. Default value is false.
     * If true, reporting that score will make the category this score belongs to, the default leaderboard for this user
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setShouldSetDefaultLeaderboard:")
    public native void setShouldSetDefaultLeaderboard(boolean value);

    /**
     * The score value as a 64bit integer.
     */
    @Generated
    @Selector("setValue:")
    public native void setValue(long value);

    /**
     * Convenience property to make the leaderboard associated with this GKScore, the default leaderboard for this
     * player. Default value is false.
     * If true, reporting that score will make the category this score belongs to, the default leaderboard for this user
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("shouldSetDefaultLeaderboard")
    public native boolean shouldSetDefaultLeaderboard();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * The score value as a 64bit integer.
     */
    @Generated
    @Selector("value")
    public native long value();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_challengeComposeControllerWithMessagePlayersCompletionHandler {
        @Generated
        void call_challengeComposeControllerWithMessagePlayersCompletionHandler(
                @NotNull UIViewController composeController, boolean didIssueChallenge,
                @Nullable NSArray<String> sentPlayerIDs);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_challengeComposeControllerWithPlayersMessageCompletionHandler {
        @Generated
        void call_challengeComposeControllerWithPlayersMessageCompletionHandler(
                @NotNull UIViewController composeController, boolean didIssueChallenge,
                @Nullable NSArray<String> sentPlayerIDs);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportScoreWithCompletionHandler {
        @Generated
        void call_reportScoreWithCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportScoresWithCompletionHandler {
        @Generated
        void call_reportScoresWithCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportScoresWithEligibleChallengesWithCompletionHandler {
        @Generated
        void call_reportScoresWithEligibleChallengesWithCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("reportLeaderboardScores:withEligibleChallenges:withCompletionHandler:")
    public static native void reportLeaderboardScoresWithEligibleChallengesWithCompletionHandler(
            @NotNull NSArray<? extends GKLeaderboardScore> scores, @NotNull NSArray<? extends GKChallenge> challenges,
            @Nullable @ObjCBlock(name = "call_reportLeaderboardScoresWithEligibleChallengesWithCompletionHandler") Block_reportLeaderboardScoresWithEligibleChallengesWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportLeaderboardScoresWithEligibleChallengesWithCompletionHandler {
        @Generated
        void call_reportLeaderboardScoresWithEligibleChallengesWithCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("challengeComposeControllerWithMessage:players:completion:")
    @NotNull
    public native UIViewController challengeComposeControllerWithMessagePlayersCompletion(@Nullable String message,
            @Nullable NSArray<? extends GKPlayer> players,
            @ObjCBlock(name = "call_challengeComposeControllerWithMessagePlayersCompletion") @Nullable Block_challengeComposeControllerWithMessagePlayersCompletion completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_challengeComposeControllerWithMessagePlayersCompletion {
        @Generated
        void call_challengeComposeControllerWithMessagePlayersCompletion(@NotNull UIViewController composeController,
                boolean didIssueChallenge, @Nullable NSArray<? extends GKPlayer> sentPlayers);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
