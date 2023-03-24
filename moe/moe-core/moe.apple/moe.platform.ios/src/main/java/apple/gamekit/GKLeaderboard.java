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
import apple.foundation.NSDate;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.struct.NSRange;
import apple.uikit.UIImage;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
 * GKLeaderboard represents a single instance of a leaderboard for the current game.
 * Leaderboards can be of the following types:
 * 1. Classic - Traditional, non-expiring leaderboards
 * 2. Recurring - Periodic timed leaderboards that follow a recurrence rule defined in App Store Connect.
 * 
 * API-Since: 4.1
 */
@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKLeaderboard extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GKLeaderboard(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKLeaderboard alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKLeaderboard allocWithZone(VoidPtr zone);

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
     * API-Since: 4.1
     * Deprecated-Since: 6.0
     * Deprecated-Message: Use loadLeaderboardsWithIDs:completionHandler: instead
     */
    @Generated
    @Deprecated
    @Selector("loadCategoriesWithCompletionHandler:")
    public static native void loadCategoriesWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_loadCategoriesWithCompletionHandler") Block_loadCategoriesWithCompletionHandler completionHandler);

    /**
     * Loads the array of GKLeaderboard for your app
     * Possible reasons for error:
     * 1. Communications problem
     * 2. Unauthenticated player
     * 3. Leaderboard not present
     * 
     * API-Since: 6.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use class method loadLeaderboardsWithIDs:completionHandler:
     */
    @Deprecated
    @Generated
    @Selector("loadLeaderboardsWithCompletionHandler:")
    public static native void loadLeaderboardsWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_loadLeaderboardsWithCompletionHandler") Block_loadLeaderboardsWithCompletionHandler completionHandler);

    @Generated
    @Owned
    @Selector("new")
    public static native GKLeaderboard new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use setDefaultLeaderboardIdentifier:completionHandler: on GKLocalPlayer instead
     */
    @Generated
    @Deprecated
    @Selector("setDefaultLeaderboard:withCompletionHandler:")
    public static native void setDefaultLeaderboardWithCompletionHandler(@Nullable String leaderboardIdentifier,
            @Nullable @ObjCBlock(name = "call_setDefaultLeaderboardWithCompletionHandler") Block_setDefaultLeaderboardWithCompletionHandler completionHandler);

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
     * Deprecated. Use identifier instead.
     * 
     * API-Since: 4.1
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use identifier instead
     */
    @Nullable
    @Generated
    @Deprecated
    @Selector("category")
    public native String category();

    /**
     * set when leaderboards have been designated a game group; set when loadLeaderboardsWithCompletionHandler has been
     * called for leaderboards that support game groups
     * 
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("groupIdentifier")
    public native String groupIdentifier();

    /**
     * leaderboardID. If nil, fetch the aggregate leaderboard.
     * 
     * API-Since: 7.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use loadEntriesForPlayerScope:timeScope:range:completionHandler: instead.
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("identifier")
    public native String identifier();

    /**
     * Default is the range 1-10 with Global/AllTime scopes.
     * If you want to change the scopes or range, set the properites before loading the scores.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Do not instantiate GKLeaderboard directly. Use class method
     * loadLeaderboardsWithIDs:completionHandler: to get the leaderboards.
     */
    @Deprecated
    @Generated
    @Selector("init")
    public native GKLeaderboard init();

    /**
     * API-Since: 4.1
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use initWithPlayers: instead
     */
    @Generated
    @Deprecated
    @Selector("initWithPlayerIDs:")
    public native GKLeaderboard initWithPlayerIDs(@Nullable NSArray<String> playerIDs);

    /**
     * Specify an array of GKPlayers. For example, the players who are in a match together
     * Defaults to AllTime score, if you want to change the timeScope, set the property before loading the scores. Range
     * and playerScope are not applicable. players may not be nil.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use instance method loadEntriesForPlayers:timeScope:completionHandler: instead.
     */
    @Deprecated
    @Generated
    @Selector("initWithPlayers:")
    public native GKLeaderboard initWithPlayers(@NotNull NSArray<? extends GKPlayer> players);

    /**
     * This property is true if the leaderboard is currently loading
     * 
     * API-Since: 4.1
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use loadEntriesForPlayerScope:timeScope:range:completionHandler: method to obtain scores.
     */
    @Deprecated
    @Generated
    @Selector("isLoading")
    public native boolean isLoading();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("loadImageWithCompletionHandler:")
    public native void loadImageWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_loadImageWithCompletionHandler") Block_loadImageWithCompletionHandler completionHandler);

    /**
     * Load the scores for this leader board asynchronously. Error will be nil on success.
     * Possible reasons for error:
     * 1. Communications problem
     * 2. Unauthenticated player
     * 
     * API-Since: 4.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use loadEntriesForPlayerScope:timeScope:range:completionHandler:.
     */
    @Deprecated
    @Generated
    @Selector("loadScoresWithCompletionHandler:")
    public native void loadScoresWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_loadScoresWithCompletionHandler") Block_loadScoresWithCompletionHandler completionHandler);

    /**
     * The local player's score
     * 
     * API-Since: 4.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use loadEntriesForPlayerScope:timeScope:range:completionHandler: method to obtain scores.
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("localPlayerScore")
    public native GKScore localPlayerScore();

    /**
     * The maxRange which represents the size of the leaderboard is not valid until loadScores: has completed.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use loadEntriesForPlayerScope:timeScope:range:completionHandler: method to obtain the size of
     * the leaderboard.
     */
    @Deprecated
    @Generated
    @Selector("maxRange")
    @NUInt
    public native long maxRange();

    /**
     * Filter on friends. Does not apply to leaderboard initialized with players.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use loadEntriesForPlayerScope:timeScope:range:completionHandler: instead.
     */
    @Deprecated
    @Generated
    @Selector("playerScope")
    @NInt
    public native long playerScope();

    /**
     * Leaderboards start at index 1 and the length should be less than 100. Does not apply to leaderboards initialized
     * with players. Exception will be thrown if developer tries to set an invalid range.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use loadEntriesForPlayerScope:timeScope:range:completionHandler: instead.
     */
    @Deprecated
    @Generated
    @Selector("range")
    @ByValue
    public native NSRange range();

    /**
     * Scores are not valid until loadScores: has completed.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use loadEntriesForPlayerScope:timeScope:range:completionHandler: to obtain scores.
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("scores")
    public native NSArray<? extends GKScore> scores();

    /**
     * Deprecated. Use identifier instead.
     * 
     * API-Since: 4.1
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use identifier instead
     */
    @Generated
    @Deprecated
    @Selector("setCategory:")
    public native void setCategory(@Nullable String value);

    /**
     * leaderboardID. If nil, fetch the aggregate leaderboard.
     * 
     * API-Since: 7.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use loadEntriesForPlayerScope:timeScope:range:completionHandler: instead.
     */
    @Deprecated
    @Generated
    @Selector("setIdentifier:")
    public native void setIdentifier(@Nullable String value);

    /**
     * Filter on friends. Does not apply to leaderboard initialized with players.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use loadEntriesForPlayerScope:timeScope:range:completionHandler: instead.
     */
    @Deprecated
    @Generated
    @Selector("setPlayerScope:")
    public native void setPlayerScope(@NInt long value);

    /**
     * Leaderboards start at index 1 and the length should be less than 100. Does not apply to leaderboards initialized
     * with players. Exception will be thrown if developer tries to set an invalid range.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use loadEntriesForPlayerScope:timeScope:range:completionHandler: instead.
     */
    @Deprecated
    @Generated
    @Selector("setRange:")
    public native void setRange(@ByValue NSRange value);

    /**
     * API-Since: 4.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use loadEntriesForPlayerScope:timeScope:range:completionHandler: instead.
     */
    @Deprecated
    @Generated
    @Selector("setTimeScope:")
    public native void setTimeScope(@NInt long value);

    /**
     * API-Since: 4.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use loadEntriesForPlayerScope:timeScope:range:completionHandler: instead.
     */
    @Deprecated
    @Generated
    @Selector("timeScope")
    @NInt
    public native long timeScope();

    /**
     * Localized title
     */
    @Nullable
    @Generated
    @Selector("title")
    public native String title();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadCategoriesWithCompletionHandler {
        @Generated
        void call_loadCategoriesWithCompletionHandler(@Nullable NSArray<String> categories,
                @Nullable NSArray<String> titles, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadImageWithCompletionHandler {
        @Generated
        void call_loadImageWithCompletionHandler(@Nullable UIImage image, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadLeaderboardsWithCompletionHandler {
        @Generated
        void call_loadLeaderboardsWithCompletionHandler(@Nullable NSArray<? extends GKLeaderboard> leaderboards,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadScoresWithCompletionHandler {
        @Generated
        void call_loadScoresWithCompletionHandler(@Nullable NSArray<? extends GKScore> scores, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setDefaultLeaderboardWithCompletionHandler {
        @Generated
        void call_setDefaultLeaderboardWithCompletionHandler(@Nullable NSError error);
    }

    /**
     * Leaderboard ID defined in App Store Connect that this instance is associated with
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("baseLeaderboardID")
    public native String baseLeaderboardID();

    /**
     * Duration from startDate during which this leaderboard instance accepts score submissions (only applicable to
     * recurring leaderboards)
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("duration")
    public native double duration();

    /**
     * Loads leaderboard entries based on the supplied parameters.
     * playerScope - Friends or Global
     * timeScope - Today, Week, All Time (Only applicable to classic leaderboards)
     * range - Range of ranked entries to return (minimum start index 1, maximum length 100)
     * Upon completion, will return:
     * localPlayerEntry - entry for the local player
     * entries - requested entries matching supplied parameters
     * totalPlayerCount - total player count matching specified scope
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("loadEntriesForPlayerScope:timeScope:range:completionHandler:")
    public native void loadEntriesForPlayerScopeTimeScopeRangeCompletionHandler(@NInt long playerScope,
            @NInt long timeScope, @ByValue NSRange range,
            @NotNull @ObjCBlock(name = "call_loadEntriesForPlayerScopeTimeScopeRangeCompletionHandler") Block_loadEntriesForPlayerScopeTimeScopeRangeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadEntriesForPlayerScopeTimeScopeRangeCompletionHandler {
        @Generated
        void call_loadEntriesForPlayerScopeTimeScopeRangeCompletionHandler(
                @Nullable GKLeaderboardEntry localPlayerEntry, @Nullable NSArray<? extends GKLeaderboardEntry> entries,
                @NInt long totalPlayerCount, @Nullable NSError error);
    }

    /**
     * Loads leaderboard entries for specific players based on the supplied parameters.
     * players - Array of players to load entries for
     * timeScope - Today, Week, All Time (Only applicable to classic leaderboards)
     * Upon completion, will return:
     * localPlayerEntry - entry for the local player
     * entries - requested entries matching supplied parameters
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("loadEntriesForPlayers:timeScope:completionHandler:")
    public native void loadEntriesForPlayersTimeScopeCompletionHandler(@NotNull NSArray<? extends GKPlayer> players,
            @NInt long timeScope,
            @NotNull @ObjCBlock(name = "call_loadEntriesForPlayersTimeScopeCompletionHandler") Block_loadEntriesForPlayersTimeScopeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadEntriesForPlayersTimeScopeCompletionHandler {
        @Generated
        void call_loadEntriesForPlayersTimeScopeCompletionHandler(@Nullable GKLeaderboardEntry localPlayerEntry,
                @Nullable NSArray<? extends GKLeaderboardEntry> entries, @Nullable NSError error);
    }

    /**
     * Loads classic and recurring leaderboards associated with the supplied App Store Connect leaderboard IDs.
     * If leaderboardIDs is nil, this loads all classic and recurring leaderboards for this game.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("loadLeaderboardsWithIDs:completionHandler:")
    public static native void loadLeaderboardsWithIDsCompletionHandler(@Nullable NSArray<String> leaderboardIDs,
            @NotNull @ObjCBlock(name = "call_loadLeaderboardsWithIDsCompletionHandler") Block_loadLeaderboardsWithIDsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadLeaderboardsWithIDsCompletionHandler {
        @Generated
        void call_loadLeaderboardsWithIDsCompletionHandler(@Nullable NSArray<? extends GKLeaderboard> leaderboards,
                @Nullable NSError error);
    }

    /**
     * Loads the occurrence preceding this occurrence for a recurring leaderboard in which the local player submitted a
     * score. If no previous occurrence is found that the player submitted a score to, then the most recent previous
     * occurrence is returned.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("loadPreviousOccurrenceWithCompletionHandler:")
    public native void loadPreviousOccurrenceWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_loadPreviousOccurrenceWithCompletionHandler") Block_loadPreviousOccurrenceWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadPreviousOccurrenceWithCompletionHandler {
        @Generated
        void call_loadPreviousOccurrenceWithCompletionHandler(@Nullable GKLeaderboard leaderboard,
                @Nullable NSError error);
    }

    /**
     * Date and time the next instance will start accepting score submissions (only applicable to recurring
     * leaderboards)
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("nextStartDate")
    public native NSDate nextStartDate();

    /**
     * Date and time this instance started accepting score submissions (only applicable to recurring leaderboards)
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("startDate")
    public native NSDate startDate();

    /**
     * Instance method to submit a single score to the leaderboard associated with this instance
     * score - earned by the player
     * context - developer supplied metadata associated with the player's score
     * player - the player for whom this score is being submitted
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("submitScore:context:player:completionHandler:")
    public native void submitScoreContextPlayerCompletionHandler(@NInt long score, @NUInt long context,
            @NotNull GKPlayer player,
            @NotNull @ObjCBlock(name = "call_submitScoreContextPlayerCompletionHandler") Block_submitScoreContextPlayerCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_submitScoreContextPlayerCompletionHandler {
        @Generated
        void call_submitScoreContextPlayerCompletionHandler(@Nullable NSError error);
    }

    /**
     * Class method to submit a single score to multiple leaderboards
     * score - earned by the player
     * context - developer supplied metadata associated with the player's score
     * player - the player for whom this score is being submitted
     * leaderboardIDs - one or more leaderboard IDs defined in App Store Connect
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("submitScore:context:player:leaderboardIDs:completionHandler:")
    public static native void submitScoreContextPlayerLeaderboardIDsCompletionHandler(@NInt long score,
            @NUInt long context, @NotNull GKPlayer player, @NotNull NSArray<String> leaderboardIDs,
            @NotNull @ObjCBlock(name = "call_submitScoreContextPlayerLeaderboardIDsCompletionHandler") Block_submitScoreContextPlayerLeaderboardIDsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_submitScoreContextPlayerLeaderboardIDsCompletionHandler {
        @Generated
        void call_submitScoreContextPlayerLeaderboardIDsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Type of leaderboard
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("type")
    @NInt
    public native long type();
}
