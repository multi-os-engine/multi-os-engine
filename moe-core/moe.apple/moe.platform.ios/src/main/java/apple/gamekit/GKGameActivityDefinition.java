package apple.gamekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.uikit.UIImage;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 26.0
 */
@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKGameActivityDefinition extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GKGameActivityDefinition(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKGameActivityDefinition alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native GKGameActivityDefinition allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * Default properties defined by the developer for this type of game activity.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("defaultProperties")
    @NotNull
    public native NSDictionary<String, String> defaultProperties();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * A more detailed description of the game activity.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("details")
    @Nullable
    public native String details();

    /**
     * A fallback URL that can be used to construct a game-specific URL for players to share or join, if the joining
     * device does not support the default URL.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("fallbackURL")
    @Nullable
    public native NSURL fallbackURL();

    /**
     * The group identifier for the activity, if one exists.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("groupIdentifier")
    @Nullable
    public native String groupIdentifier();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * The developer defined identifier for a given game activity.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("identifier")
    @NotNull
    public native String identifier();

    @Generated
    @Selector("init")
    public native GKGameActivityDefinition init();

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * Loads all associated achievements that have defined deep links to this game activity definition.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("loadAchievementDescriptionsWithCompletionHandler:")
    public native void loadAchievementDescriptionsWithCompletionHandler(
            @ObjCBlock(name = "call_loadAchievementDescriptionsWithCompletionHandler") @NotNull Block_loadAchievementDescriptionsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadAchievementDescriptionsWithCompletionHandler {
        @Generated
        void call_loadAchievementDescriptionsWithCompletionHandler(
                @Nullable NSArray<? extends GKAchievementDescription> achievementDescriptions, @Nullable NSError error);
    }

    /**
     * Loads all the game activity definitions for the current game.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("loadGameActivityDefinitionsWithCompletionHandler:")
    public static native void loadGameActivityDefinitionsWithCompletionHandler(
            @ObjCBlock(name = "call_loadGameActivityDefinitionsWithCompletionHandler") @NotNull Block_loadGameActivityDefinitionsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadGameActivityDefinitionsWithCompletionHandler {
        @Generated
        void call_loadGameActivityDefinitionsWithCompletionHandler(
                @Nullable NSArray<? extends GKGameActivityDefinition> activityDefinitions, @Nullable NSError error);
    }

    /**
     * Loads game activity definitions with the supplied App Store Connect identifiers.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("loadGameActivityDefinitionsWithIDs:completionHandler:")
    public static native void loadGameActivityDefinitionsWithIDsCompletionHandler(
            @Nullable NSArray<String> activityDefinitionIDs,
            @ObjCBlock(name = "call_loadGameActivityDefinitionsWithIDsCompletionHandler") @NotNull Block_loadGameActivityDefinitionsWithIDsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadGameActivityDefinitionsWithIDsCompletionHandler {
        @Generated
        void call_loadGameActivityDefinitionsWithIDsCompletionHandler(
                @Nullable NSArray<? extends GKGameActivityDefinition> activityDefinitions, @Nullable NSError error);
    }

    /**
     * Asynchronously load the image. Error will be nil on success.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("loadImageWithCompletionHandler:")
    public native void loadImageWithCompletionHandler(
            @ObjCBlock(name = "call_loadImageWithCompletionHandler") @NotNull Block_loadImageWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadImageWithCompletionHandler {
        @Generated
        void call_loadImageWithCompletionHandler(@Nullable UIImage image, @Nullable NSError error);
    }

    /**
     * Loads all associated leaderboards that have defined deep links to this game activity definition.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("loadLeaderboardsWithCompletionHandler:")
    public native void loadLeaderboardsWithCompletionHandler(
            @ObjCBlock(name = "call_loadLeaderboardsWithCompletionHandler") @NotNull Block_loadLeaderboardsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadLeaderboardsWithCompletionHandler {
        @Generated
        void call_loadLeaderboardsWithCompletionHandler(@Nullable NSArray<? extends GKLeaderboard> leaderboards,
                @Nullable NSError error);
    }

    /**
     * The maximum number of participants that can join the activity. Returns nil when no maximum is set (unlimited
     * players) or when player range is undefined. When not nil, the value is always greater than or equal to
     * `minPlayers`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("maxPlayers")
    @Nullable
    public native NSNumber maxPlayers();

    /**
     * The minimum number of participants that can join the activity.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("minPlayers")
    @Nullable
    public native NSNumber minPlayers();

    @Generated
    @Owned
    @Selector("new")
    public static native GKGameActivityDefinition new_objc();

    /**
     * The play style of the game activity.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("playStyle")
    @NInt
    public native long playStyle();

    /**
     * The release state of the game activity definition in App Store Connect.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("releaseState")
    @NUInt
    public native long releaseState();

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

    /**
     * Whether the activity can be joined by others via a party code.
     * - SeeAlso: ``-[GKGameActivityListener player:wantsToPlayGameActivity:completionHandler:]`` where you can receive
     * and handle game activities that players want to play in a party with friends.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("supportsPartyCode")
    public native boolean supportsPartyCode();

    /**
     * True if the activity supports an unlimited number of players. False if maxPlayers is set to a defined limit or if
     * no player range is provided.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("supportsUnlimitedPlayers")
    public native boolean supportsUnlimitedPlayers();

    /**
     * A short title for the game activity.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("title")
    @NotNull
    public native String title();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}