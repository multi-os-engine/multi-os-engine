package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Contains detailed information about the current state of the UI update. This information may change as UI update
 * progresses through its phases. Note, that single UI update might service views on different displays simultaneously,
 * in which case such views may have different `UIUpdateInfo` (e.g. `estimatedPresentationTime` may differ).
 * 
 * API-Since: 18.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIUpdateInfo extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIUpdateInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIUpdateInfo alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UIUpdateInfo allocWithZone(VoidPtr zone);

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

    /**
     * Time by which application has to be done submitting changes to the render server. Missing this completion
     * deadline
     * will result in a presentation delay. Single miss will look like a frame drop, missing repeatedly will look like
     * judder.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("completionDeadlineTime")
    public native double completionDeadlineTime();

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("currentUpdateInfoForView:")
    @Nullable
    public static native UIUpdateInfo currentUpdateInfoForView(@NotNull UIView view);

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("currentUpdateInfoForWindowScene:")
    @Nullable
    public static native UIUpdateInfo currentUpdateInfoForWindowScene(@NotNull UIWindowScene windowScene);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Estimated time when UI update changes will become visible on screen. Actual time when pixels change color may
     * differ.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("estimatedPresentationTime")
    public native double estimatedPresentationTime();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIUpdateInfo init();

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
     * `YES` for UI updates that are expected to present immediately upon completion. Use it to minimize amount of work
     * performed during the UI update. Any processing that is not critical for the frame being presented should be
     * deferred
     * to after UI update is complete. Note, that immediate presentation still might not happen if strict conditions
     * imposed by the system, like committing `CATransaction` before the `completionDeadlineTime`, are not satisfied.
     * Similarly, immediate presentation can be denied at various points of the pipeline, if system detects that current
     * CPU or GPU load, power state or frame complexity make reliable immediate presentation impossible or unlikely.
     * Immediate presentation is an extremely challenging mode for the entire system and causes excessive power drain
     * and
     * has high chances of missing intended presentation time, which results in visual judder. Application that use it
     * has high chances of missing intended presentation time, which results in visual judder. Applications that use it
     * should be explicitly designed and tuned to operate in this mode - amount of work in each phase should be
     * precisely
     * controlled. It is primarily reserved for pencil drawing and writing applications where extra low latency makes a
     * noticeable improvement to user experience. Returned value can change during the UI update.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("isImmediatePresentationExpected")
    public native boolean isImmediatePresentationExpected();

    /**
     * `YES` when it's guaranteed that low-latency event dispatch will happen during the UI update. When `YES` is
     * returned,
     * you can rely on low-latency UI update phases to run for this UI update. Use it to avoid doing the same work more
     * than once. For example, when rendering a pencil drawing stroke in after event dispatch and
     * `lowLatencyEventDispatchConfirmed` is `YES`, while `performingLowLatencyPhases` is `NO`, then it would be better
     * to wait for after low-latency event dispatch to render the stroke. Can change from `NO` to `YES` during the UI
     * update, but will never change from `YES` to `NO`. When `YES` is returned, low-latency phases always will be
     * performed. Note, that checking value of this property might cause system to commit to low-latency event dispatch
     * unnecessarily as a side effect - call it only when there's an intention to act on returned value.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("isLowLatencyEventDispatchConfirmed")
    public native boolean isLowLatencyEventDispatchConfirmed();

    /**
     * `YES` when executing low-latency part of the UI update (specifically between `LowLatencyEventDispatch` and
     * `LowLatencyCATransactionCommit` UI update phases). Work in this part of the UI update should be as minimal as
     * possible, especially when immediate presentation is to be attempted. Anything that is not critical to the current
     * UI update must be deferred after `LowLatencyCATransactionCommit`. Try to avoid using `dispatch_after()` types of
     * deferral as arbitrary delayed work will potentially interfere with following UI updates.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("isPerformingLowLatencyPhases")
    public native boolean isPerformingLowLatencyPhases();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * Reference time that is suitable for driving time based model changes, like animations or physics. Use it as "now"
     * time for the UI update. It's designed to maintain constant latency between model changes and their on screen
     * presentation. Uses same units as `CACurrentMediaTime()`. Numerically, this time is close to the start of the UI
     * update, but its exact relation to UI update start time may change depending on frame rate and other UI update
     * parameters.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("modelTime")
    public native double modelTime();

    @Generated
    @Owned
    @Selector("new")
    public static native UIUpdateInfo new_objc();

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}