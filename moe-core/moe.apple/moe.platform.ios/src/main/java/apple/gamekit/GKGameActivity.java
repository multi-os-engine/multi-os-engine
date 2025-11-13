package apple.gamekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * An object that represents a single instance of a game activity for the current game.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKGameActivity extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GKGameActivity(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * All achievements that have been associated with this activity.
     * 
     * Progress of each achievement will be reported when the activity ends.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("achievements")
    @NotNull
    public native NSSet<? extends GKAchievement> achievements();

    /**
     * The activity definition that this activity instance is based on.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("activityDefinition")
    @NotNull
    public native GKGameActivityDefinition activityDefinition();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKGameActivity alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native GKGameActivity allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    /**
     * Checks whether there is a pending activity to handle for the current game.
     * 
     * You can call this method before you initialize Game Center to avoid activating the system banner or
     * welcome experience.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("checkPendingGameActivityExistenceWithCompletionHandler:")
    public static native void checkPendingGameActivityExistenceWithCompletionHandler(
            @ObjCBlock(name = "call_checkPendingGameActivityExistenceWithCompletionHandler") @NotNull Block_checkPendingGameActivityExistenceWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_checkPendingGameActivityExistenceWithCompletionHandler {
        @Generated
        void call_checkPendingGameActivityExistenceWithCompletionHandler(boolean arg0);
    }

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    /**
     * The date when the activity was created.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("creationDate")
    @NotNull
    public native NSDate creationDate();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The total time elapsed while in active state.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("duration")
    public native double duration();

    /**
     * Ends the game activity if it's not already ended.
     * 
     * This reports all associated achievements and submit scores to leaderboards.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("end")
    public native void end();

    /**
     * The date when the activity was officially ended.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("endDate")
    @Nullable
    public native NSDate endDate();

    /**
     * Use information from the activity to find matches for the local player.
     * 
     * GameKit creates a classic match making request with the activity's party code and other information, and
     * returns the match object in the completion handler or any error that occurred.
     * An error occurs if this activity doesn't support party code, or has an unsupported range of players, which
     * is used to be configured as match request's `minPlayers` and `maxPlayers`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("findMatchWithCompletionHandler:")
    public native void findMatchWithCompletionHandler(
            @ObjCBlock(name = "call_findMatchWithCompletionHandler") @NotNull Block_findMatchWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_findMatchWithCompletionHandler {
        @Generated
        void call_findMatchWithCompletionHandler(@Nullable GKMatch match, @Nullable NSError error);
    }

    /**
     * Use information from the activity to find server hosted players for the local player.
     * 
     * GameKit creates a classic server hosted match making request with the activity's party code and other
     * information, and returns the players in the completion handler or any error that occurred.
     * An error occurs if this activity doesn't support party code, or has unsupported range of players, which is
     * used to be configured as match request's `minPlayers` and `maxPlayers`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("findPlayersForHostedMatchWithCompletionHandler:")
    public native void findPlayersForHostedMatchWithCompletionHandler(
            @ObjCBlock(name = "call_findPlayersForHostedMatchWithCompletionHandler") @NotNull Block_findPlayersForHostedMatchWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_findPlayersForHostedMatchWithCompletionHandler {
        @Generated
        void call_findPlayersForHostedMatchWithCompletionHandler(@Nullable NSArray<? extends GKPlayer> players,
                @Nullable NSError error);
    }

    /**
     * Get the achievement progress from a specific achievement of the local player if previously set.
     * 
     * Returns `0` if the achievement hasn't been set in the current activity.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("getProgressOnAchievement:")
    public native double getProgressOnAchievement(@NotNull GKAchievement achievement);

    /**
     * Get the leaderboard score from a specific leaderboard of the local player if previously set.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("getScoreOnLeaderboard:")
    @Nullable
    public native GKLeaderboardScore getScoreOnLeaderboard(@NotNull GKLeaderboard leaderboard);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * The identifier of this activity instance.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("identifier")
    @NotNull
    public native String identifier();

    @Generated
    @Selector("init")
    public native GKGameActivity init();

    /**
     * Creates a game activity with definition.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithDefinition:")
    public native GKGameActivity initWithDefinition(@NotNull GKGameActivityDefinition activityDefinition);

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

    /**
     * Checks whether a party code is in valid format.
     * 
     * Party code should be two parts of strings with the same length (2-6) connected with a dash, and the
     * code can be either pure digits (0-9), or both parts are uppercased characters from
     * ``GKGameActivity/validPartyCodeAlphabet``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isValidPartyCode:")
    public static native boolean isValidPartyCode(@NotNull String partyCode);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * The date when the activity was last resumed.
     * 
     * - If the activity was first started, this will be the same as the start date.
     * - If the activity was paused and resumed, this will be the date when the activity was resumed.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("lastResumeDate")
    @Nullable
    public native NSDate lastResumeDate();

    /**
     * All leaderboard scores that have been associated with this activity.
     * 
     * Scores will be submitted to the leaderboards when the activity ends.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("leaderboardScores")
    @NotNull
    public native NSSet<? extends GKLeaderboardScore> leaderboardScores();

    /**
     * Makes a match request object with information from the activity, which you can use to find matches for the local
     * player.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("makeMatchRequest")
    @Nullable
    public native GKMatchRequest makeMatchRequest();

    @Generated
    @Owned
    @Selector("new")
    public static native GKGameActivity new_objc();

    /**
     * If the game supports party code, this is the party code that can be shared among players to join the party.
     * 
     * If the game doesn't support party code, this value will be `nil`. Use
     * ``GKGameActivity/start(definition:partyCode:)``
     * to create a game activity with a custom party code.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("partyCode")
    @Nullable
    public native String partyCode();

    /**
     * If the game supports party code, this is the URL that can be shared among players to join the party.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("partyURL")
    @Nullable
    public native NSURL partyURL();

    /**
     * Pauses the game activity if it's not already paused.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("pause")
    public native void pause();

    /**
     * Properties that contain additional information about the activity.
     * 
     * This takes precedence over ``GKGameActivityDefinition/defaultProperties`` on the activity
     * definition.
     * 
     * 1. The framework initializes this dictionary with the default properties from the activity definition and deep
     * linked properties, if any.
     * 2. If deep linking contains the same key as the default properties, the deep linked value overrides the default
     * value.
     * 3. You can update the properties at runtime.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("properties")
    @NotNull
    public native NSDictionary<String, String> properties();

    /**
     * Removes all achievements if they exist.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("removeAchievements:")
    public native void removeAchievements(@NotNull NSArray<? extends GKAchievement> achievements);

    /**
     * Removes all scores from leaderboards for a player if exist.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("removeScoresFromLeaderboards:")
    public native void removeScoresFromLeaderboards(@NotNull NSArray<? extends GKLeaderboard> leaderboards);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Resumes the game activity if it was paused.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("resume")
    public native void resume();

    /**
     * Set progress to 100% for an achievement for a player.
     * 
     * The system reports achievement completion when the activity ends.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setAchievementCompleted:")
    public native void setAchievementCompleted(@NotNull GKAchievement achievement);

    /**
     * Set a progress for an achievement for a player.
     * 
     * The framework reports achievement progress when the activity ends.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setProgressOnAchievement:toPercentComplete:")
    public native void setProgressOnAchievementToPercentComplete(@NotNull GKAchievement achievement,
            double percentComplete);

    /**
     * Properties that contain additional information about the activity.
     * 
     * This takes precedence over ``GKGameActivityDefinition/defaultProperties`` on the activity
     * definition.
     * 
     * 1. The framework initializes this dictionary with the default properties from the activity definition and deep
     * linked properties, if any.
     * 2. If deep linking contains the same key as the default properties, the deep linked value overrides the default
     * value.
     * 3. You can update the properties at runtime.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setProperties:")
    public native void setProperties(@NotNull NSDictionary<String, String> value);

    /**
     * Set a score of a leaderboard for a player.
     * 
     * The framewowrk submits the score to the leaderboard when the activity ends.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setScoreOnLeaderboard:toScore:")
    public native void setScoreOnLeaderboardToScore(@NotNull GKLeaderboard leaderboard, @NInt long score);

    /**
     * Set a score of a leaderboard with a context for a player.
     * 
     * The framewwork submits the score to the leaderboard when the activity ends.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setScoreOnLeaderboard:toScore:context:")
    public native void setScoreOnLeaderboardToScoreContext(@NotNull GKLeaderboard leaderboard, @NInt long score,
            @NUInt long context);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Starts the game activity if it's not already started.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("start")
    public native void start();

    /**
     * The date when the activity was initially started.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("startDate")
    @Nullable
    public native NSDate startDate();

    /**
     * Creates and starts a game activity with a definition.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("startWithDefinition:error:")
    @Nullable
    public static native GKGameActivity startWithDefinitionError(@NotNull GKGameActivityDefinition activityDefinition,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Creates and starts a new game activity with a custom party code.
     * 
     * The framework converts the party code to uppercase.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("startWithDefinition:partyCode:error:")
    @Nullable
    public static native GKGameActivity startWithDefinitionPartyCodeError(
            @NotNull GKGameActivityDefinition activityDefinition, @NotNull String partyCode,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * The state of the game activity.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("state")
    @NUInt
    public native long state();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * Allowed characters for the party code to be used to share this activity.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("validPartyCodeAlphabet")
    @NotNull
    public static native NSArray<String> validPartyCodeAlphabet();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}