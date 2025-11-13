package apple.gamekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDateComponents;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
public class GKChallengeDefinition extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GKChallengeDefinition(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKChallengeDefinition alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native GKChallengeDefinition allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * A more detailed description of the challenge definition.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("details")
    @Nullable
    public native String details();

    /**
     * The duration options for the challenge, like `1 day` or `1 week`.
     * - Note: If set, the amount of weeks is stored in the `weekOfYear` field.
     * - Important: The actual duration of the challenge may be dynamically adjusted
     * in order to accommodate different factors like players' timezones.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("durationOptions")
    @NotNull
    public native NSArray<? extends NSDateComponents> durationOptions();

    /**
     * The group identifier for the challenge definition, if one exists.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("groupIdentifier")
    @Nullable
    public native String groupIdentifier();

    /**
     * Indicates if this definition has active challenges associated with it.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("hasActiveChallengesWithCompletionHandler:")
    public native void hasActiveChallengesWithCompletionHandler(
            @ObjCBlock(name = "call_hasActiveChallengesWithCompletionHandler") @NotNull Block_hasActiveChallengesWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_hasActiveChallengesWithCompletionHandler {
        @Generated
        void call_hasActiveChallengesWithCompletionHandler(boolean hasActiveChallenges, @Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * The developer defined identifier for a given challenge definition.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("identifier")
    @NotNull
    public native String identifier();

    @Generated
    @Selector("init")
    public native GKChallengeDefinition init();

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

    /**
     * Indicates if a challenge can be attempted more than once.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isRepeatable")
    public native boolean isRepeatable();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * Scores submitted to this leaderboard will also be submitted as scores in this challenge.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("leaderboard")
    @Nullable
    public native GKLeaderboard leaderboard();

    /**
     * Loads all the challenge definitions for the current game, returns an empty array if none exist.
     * - Important: Archived challenge definitions are excluded.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("loadChallengeDefinitionsWithCompletionHandler:")
    public static native void loadChallengeDefinitionsWithCompletionHandler(
            @ObjCBlock(name = "call_loadChallengeDefinitionsWithCompletionHandler") @NotNull Block_loadChallengeDefinitionsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadChallengeDefinitionsWithCompletionHandler {
        @Generated
        void call_loadChallengeDefinitionsWithCompletionHandler(
                @Nullable NSArray<? extends GKChallengeDefinition> challengeDefinitions, @Nullable NSError error);
    }

    /**
     * Loads the image set on the challenge definition, which may be `nil` if none was set.
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

    @Generated
    @Owned
    @Selector("new")
    public static native GKChallengeDefinition new_objc();

    /**
     * The release state of the challenge definition in App Store Connect.
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
     * A short title for the challenge definition.
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