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
 * Each UI update consists of several phases which run in order, one after another. There are two phase groups - normal
 * and low-latency. Normal phase group consists of phases from `EventDispatch` to `CATransactionCommit`. Low-latency
 * phase group consists of phases from `LowLatencyEventDispatch` to `LowLatencyCATransactionCommit`. When phase group
 * runs, all phases inside the group run. Phases run one after another in the specified order without exiting back into
 * the run loop. Spinning a nested run loop inside any of the phases is not supported. For each UI update, normal phase
 * group always runs. Low-latency phase group is optional and is off by default. It will run only when application
 * explicitly requests low-latency event delivery. Be aware that handling low-level events is extremely demanding and
 * only well profiled and optimized applications can benefit from it. Applications that were not designed to handle
 * low-latency events will most likely drop frames. Also not all event types are eligible for low-latency event
 * delivery. Currently only pencil events are low-latency eligible. This practically means that only pencil drawing
 * and writing applications should request it.
 * It's acceptable to block main thread in any of the phases to wait for things that are absolutely required to
 * proceed. When done properly, this will donate main thread priority to the thread being waited for, making it more
 * likely to get those things in time and meet the completion deadline. Of course, extreme caution should be exercised
 * when doing so - maximum wait time should have a hard limit on it that still allows to complete the remaining part
 * of the UI update before completion deadline. Use of `-[CAMetalLayer nextDrawable]` is of a particular note - it's
 * not advised to use it on the main thread of the UI application as it might block main thread for one or more frames.
 * Instead, consider calling `-[CAMetalLayer nextDrawable]` on the background thread and block main thread manually
 * in one of the phases. Use small timeout that allows for UI update to proceed without a new drawable and still finish
 * before the completion deadline.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIUpdateActionPhase extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIUpdateActionPhase(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * After `CADisplayLink` callbacks run.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("afterCADisplayLinkDispatch")
    @NotNull
    public static native UIUpdateActionPhase afterCADisplayLinkDispatch();

    /**
     * After `CATransaction` is flushed. Any changes to CoreAnimation layer tree made here (or later) will not appear on
     * screen with the current UI update (they will go on screen with the next UI update). There are few exceptions to
     * this rule however:
     * - It's still possible to `+[CATransaction commit]` or `+[CATransaction flush]` manually which will send latest
     * CoreAnimation layer changes to render server immediately. Doing so is not recommended as in addition to intended
     * changes other potentially unrelated changes might be sent to the render server prematurely.
     * - If low-latency event dispatch will be performed, then all CoreAnimation layer tree changes that done before
     * or during `LowLatencyCATransactionCommit` phase will appear on screen with this UI update.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("afterCATransactionCommit")
    @NotNull
    public static native UIUpdateActionPhase afterCATransactionCommit();

    /**
     * After `UIEvent` and `UIGestureRecognizer` handlers run. Past this point, there will be no new user input events
     * sent
     * to the application. If low-latency event delivery was requested, more events might be dispatched in
     * `LowLatencyEventDispatch` phase. Use this phase to react on application state after processing all user input
     * events
     * for the UI update, like starting a parallel rendering thread. Also, if your application uses extrapolation to
     * smooth
     * out low-rate event stream, use this phase to detect that certain events were not received to extrapolate them.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("afterEventDispatch")
    @NotNull
    public static native UIUpdateActionPhase afterEventDispatch();

    /**
     * After `CATransaction` is flushed. Only runs when low-latency event dispatch was requested. Any changes to
     * CoreAnimation layer tree made here (or later) will not appear on screen with the current UI update.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("afterLowLatencyCATransactionCommit")
    @NotNull
    public static native UIUpdateActionPhase afterLowLatencyCATransactionCommit();

    /**
     * After `UIEvent` and `UIGestureRecognizer` handlers run for low-latency eligible events. This stage is
     * off by default (skipped) and must be requested explicitly.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("afterLowLatencyEventDispatch")
    @NotNull
    public static native UIUpdateActionPhase afterLowLatencyEventDispatch();

    /**
     * The very end of the UI update. If there's still time until `completionDeadlineTime`, it's generally safe to do
     * any
     * idle opportunistic work here, like the one that was deferred from more time critical parts of the UI update. It's
     * also a good place to record last presented state, for things like on-screen velocity computations.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("afterUpdateComplete")
    @NotNull
    public static native UIUpdateActionPhase afterUpdateComplete();

    /**
     * Phase that runs after UI update was scheduled and its timing information is know. This is a good place for things
     * that only rely on UI update timing and don't need user input events. Running at this stage allows to utilize time
     * that otherwise would be wasted waiting for user input events to arrive. Purely time driven client side animations
     * or
     * non-interactive simulations should go here.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("afterUpdateScheduled")
    @NotNull
    public static native UIUpdateActionPhase afterUpdateScheduled();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIUpdateActionPhase alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UIUpdateActionPhase allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Before `CADisplayLink` callbacks run.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("beforeCADisplayLinkDispatch")
    @NotNull
    public static native UIUpdateActionPhase beforeCADisplayLinkDispatch();

    /**
     * Before `CATransaction` is flushed.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("beforeCATransactionCommit")
    @NotNull
    public static native UIUpdateActionPhase beforeCATransactionCommit();

    /**
     * Before `UIEvent` and `UIGestureRecognizer` handlers run. Use this phase to prepare resources and data structures
     * required to process user input events.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("beforeEventDispatch")
    @NotNull
    public static native UIUpdateActionPhase beforeEventDispatch();

    /**
     * Before `CATransaction` is flushed. Only runs when low-latency event dispatch was requested.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("beforeLowLatencyCATransactionCommit")
    @NotNull
    public static native UIUpdateActionPhase beforeLowLatencyCATransactionCommit();

    /**
     * Before `UIEvent` and `UIGestureRecognizer` handlers run for low-latency eligible events. This stage is
     * off by default (skipped) and must be requested explicitly.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("beforeLowLatencyEventDispatch")
    @NotNull
    public static native UIUpdateActionPhase beforeLowLatencyEventDispatch();

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIUpdateActionPhase init();

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

    @Generated
    @Owned
    @Selector("new")
    public static native UIUpdateActionPhase new_objc();

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