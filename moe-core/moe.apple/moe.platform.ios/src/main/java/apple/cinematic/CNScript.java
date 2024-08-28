package apple.cinematic;

import apple.NSObject;
import apple.avfoundation.AVAsset;
import apple.coremedia.struct.CMTime;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSProgress;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/**
 * Database of focus decisions with methods to change them.
 * Knows what has been detected in each frame and which detection is being focused on.
 * All operations are executed in a thread-safe manner, but that also means that a long-running update can stall a
 * lookup.
 * Best practice is to lookup what you need up front (outside your critical code) and pass the immutable results to
 * where it's needed.
 * That way, you're not blocked when you access the information, say inside the rendering portion of your code.
 * 
 * 
 * API-Since: 17.0
 */
@Generated
@Library("Cinematic")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CNScript extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CNScript(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Add user created detection track.
     * 
     * - Returns: the detectionID assigned to the added track, which can be used for later lookup or decision creation.
     */
    @Generated
    @Selector("addDetectionTrack:")
    public native long addDetectionTrack(@NotNull CNDetectionTrack detectionTrack);

    /**
     * Add a new user decision. Replaces an existing user decision if the times are identical.
     * 
     * Adding a decision can fail if the decision focuses on an detection or group that does not exist or if its time is
     * not within the time range of the cinematic script.
     * 
     * - Returns: whether adding was successful
     */
    @Generated
    @Selector("addUserDecision:")
    public native boolean addUserDecision(@NotNull CNDecision decision);

    /**
     * All detection tracks that have been added since recording.
     */
    @Generated
    @Selector("addedDetectionTracks")
    @NotNull
    public native NSArray<? extends CNDetectionTrack> addedDetectionTracks();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CNScript alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CNScript allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * All base decisions made automatically during recording in the given time range. These apply if no user decision
     * overrides them.
     */
    @Generated
    @Selector("baseDecisionsInTimeRange:")
    @NotNull
    public native NSArray<? extends CNDecision> baseDecisionsInTimeRange(@ByValue CMTimeRange timeRange);

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
     * Changes made since cinematic asset was recorded. Can be used to checkpoint and later restore changes made so far.
     */
    @Generated
    @Selector("changes")
    @NotNull
    public native CNScriptChanges changes();

    /**
     * Changes trimmed and time range shifted to start at zero — for use with a similarly trimmed cinematic asset.
     */
    @Generated
    @Selector("changesTrimmedByTimeRange:")
    @NotNull
    public native CNScriptChanges changesTrimmedByTimeRange(@ByValue CMTimeRange timeRange);

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
     * The decision that occurs after the given time. Pass the time of an existing decision to find the next one.
     */
    @Generated
    @Selector("decisionAfterTime:")
    @Nullable
    public native CNDecision decisionAfterTime(@ByValue CMTime time);

    /**
     * The closest decision to the given time within the given tolerance. Returns `nil` if there are none.
     */
    @Generated
    @Selector("decisionAtTime:tolerance:")
    @Nullable
    public native CNDecision decisionAtTimeTolerance(@ByValue CMTime time, @ByValue CMTime tolerance);

    /**
     * The decision that occurs before the given time. Pass the time of an existing decisions to find the previous one.
     */
    @Generated
    @Selector("decisionBeforeTime:")
    @Nullable
    public native CNDecision decisionBeforeTime(@ByValue CMTime time);

    /**
     * All decisions within the given time range.
     */
    @Generated
    @Selector("decisionsInTimeRange:")
    @NotNull
    public native NSArray<? extends CNDecision> decisionsInTimeRange(@ByValue CMTimeRange timeRange);

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * A detection track representing all detections that would be chosen by a given decision.
     */
    @Generated
    @Selector("detectionTrackForDecision:")
    @Nullable
    public native CNDetectionTrack detectionTrackForDecision(@NotNull CNDecision decision);

    /**
     * A detection track representing all detections with the given detectionID over the entire cinematic script.
     */
    @Generated
    @Selector("detectionTrackForID:")
    @Nullable
    public native CNDetectionTrack detectionTrackForID(long detectionID);

    /**
     * The f/number to apply to the entire movie, initially set to that of the recorded movie.
     * 
     * Pass this to the rendering session in the rendering frame attributes to match the selected aperture.
     * Change this property when the user selects a different aperture for the edited movie.
     * Changes to this property are reflected in the script changes for later restoration.
     */
    @Generated
    @Selector("fNumber")
    public native float fNumber();

    /**
     * The closest frame to the given time within the given tolerance. Returns `nil` if there are none.
     */
    @Generated
    @Selector("frameAtTime:tolerance:")
    @Nullable
    public native CNScriptFrame frameAtTimeTolerance(@ByValue CMTime time, @ByValue CMTime tolerance);

    /**
     * All frames within the given time range.
     */
    @Generated
    @Selector("framesInTimeRange:")
    @NotNull
    public native NSArray<? extends CNScriptFrame> framesInTimeRange(@ByValue CMTimeRange timeRange);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CNScript init();

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
     * Load cinematic script asynchronously from a cinematic asset.
     * - Parameters:
     * - asset: the cinematic asset to be loaded.
     * - changes: optional changes since asset was recorded. Can be obtained from a previous editing session. If `nil`,
     * the asset is loaded as originally recorded.
     * - progress: optional progress object to track progress or cancel loading. Represents just the loading of this
     * asset. Create with desired total unit count or use zero to have the unit count filled in automatically. If `nil`,
     * no progress is reported.
     * - completionHandler: called with the loaded cinematic script when done, or with with an error if it fails. If
     * progress is canceled before it completes, the completion handler is called with an error.
     */
    @Generated
    @Selector("loadFromAsset:changes:progress:completionHandler:")
    public static native void loadFromAssetChangesProgressCompletionHandler(@NotNull AVAsset asset,
            @Nullable CNScriptChanges changes, @Nullable NSProgress progress,
            @ObjCBlock(name = "call_loadFromAssetChangesProgressCompletionHandler") @NotNull Block_loadFromAssetChangesProgressCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadFromAssetChangesProgressCompletionHandler {
        @Generated
        void call_loadFromAssetChangesProgressCompletionHandler(@Nullable CNScript script, @Nullable NSError error);
    }

    @Generated
    @Owned
    @Selector("new")
    public static native CNScript new_objc();

    /**
     * The primary decision that is in effect at the specified time, unless if it's outside the time range of the
     * cinematic script.
     * Also represents the decision that is being transitioned away from if the given time is during a focus transition.
     */
    @Generated
    @Selector("primaryDecisionAtTime:")
    @Nullable
    public native CNDecision primaryDecisionAtTime(@ByValue CMTime time);

    /**
     * Reload the cinematic script with optional changes applied, removing any previous changes made.
     * This can be more efficient than loading the asset from scratch.
     * - Parameters:
     * - changes: optional changes since asset was recorded. Can be obtained from a previous editing session. If `nil`,
     * the asset is reloaded as originally recorded.
     */
    @Generated
    @Selector("reloadWithChanges:")
    public native void reloadWithChanges(@Nullable CNScriptChanges changes);

    /**
     * Remove all user decisions and revert to base decisions only.
     */
    @Generated
    @Selector("removeAllUserDecisions")
    public native void removeAllUserDecisions();

    /**
     * Remove user created detection track.
     * 
     * Tracks created at recording time cannot be removed.
     * 
     * - Returns: whether removal was successful
     */
    @Generated
    @Selector("removeDetectionTrack:")
    public native boolean removeDetectionTrack(@NotNull CNDetectionTrack detectionTrack);

    /**
     * Remove an existing user decision.
     * 
     * User decisions added to the script or those made at recording time (by tapping during recording) can be removed.
     * Decisions that are not user decisions cannot be removed.
     * 
     * - Returns: whether removal was successful
     */
    @Generated
    @Selector("removeUserDecision:")
    public native boolean removeUserDecision(@NotNull CNDecision decision);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The secondary decision that is being transitioned towards if the given time is during a focus transition.
     */
    @Generated
    @Selector("secondaryDecisionAtTime:")
    @Nullable
    public native CNDecision secondaryDecisionAtTime(@ByValue CMTime time);

    /**
     * The f/number to apply to the entire movie, initially set to that of the recorded movie.
     * 
     * Pass this to the rendering session in the rendering frame attributes to match the selected aperture.
     * Change this property when the user selects a different aperture for the edited movie.
     * Changes to this property are reflected in the script changes for later restoration.
     */
    @Generated
    @Selector("setFNumber:")
    public native void setFNumber(float value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The time range of the cinematic asset. All frames, decisions, and detections are within this time range.
     */
    @Generated
    @Selector("timeRange")
    @ByValue
    public native CMTimeRange timeRange();

    /**
     * The time range during which the focus transition away from the given decision occurs.
     */
    @Generated
    @Selector("timeRangeOfTransitionAfterDecision:")
    @ByValue
    public native CMTimeRange timeRangeOfTransitionAfterDecision(@NotNull CNDecision decision);

    /**
     * The time range during which the focus transition towards the given decision occurs.
     */
    @Generated
    @Selector("timeRangeOfTransitionBeforeDecision:")
    @ByValue
    public native CMTimeRange timeRangeOfTransitionBeforeDecision(@NotNull CNDecision decision);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * All user decisions in the given time range. Includes user decisions made during recording or added to the script.
     */
    @Generated
    @Selector("userDecisionsInTimeRange:")
    @NotNull
    public native NSArray<? extends CNDecision> userDecisionsInTimeRange(@ByValue CMTimeRange timeRange);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}