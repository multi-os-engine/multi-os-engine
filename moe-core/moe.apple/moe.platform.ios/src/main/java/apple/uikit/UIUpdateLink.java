package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.quartzcore.struct.CAFrameRateRange;
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
 * Allows to formally participate in UI updates and influence UI update behavior.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIUpdateLink extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIUpdateLink(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("addActionToPhase:handler:")
    public native void addActionToPhaseHandler(@NotNull UIUpdateActionPhase phase,
            @ObjCBlock(name = "call_addActionToPhaseHandler") @NotNull Block_addActionToPhaseHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addActionToPhaseHandler {
        @Generated
        void call_addActionToPhaseHandler(@NotNull UIUpdateLink updateLink, @NotNull UIUpdateInfo updateInfo);
    }

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("addActionToPhase:target:selector:")
    public native void addActionToPhaseTargetSelector(@NotNull UIUpdateActionPhase phase,
            @Mapped(ObjCObjectMapper.class) @NotNull Object target, @NotNull SEL selector);

    /**
     * Adds action to `UIUpdateActionPhase.beforeCADisplayLinkDispatch` phase.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("addActionWithHandler:")
    public native void addActionWithHandler(
            @ObjCBlock(name = "call_addActionWithHandler") @NotNull Block_addActionWithHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addActionWithHandler {
        @Generated
        void call_addActionWithHandler(@NotNull UIUpdateLink updateLink, @NotNull UIUpdateInfo updateInfo);
    }

    /**
     * Adds action to `UIUpdateActionPhase.beforeCADisplayLinkDispatch` phase.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("addActionWithTarget:selector:")
    public native void addActionWithTargetSelector(@Mapped(ObjCObjectMapper.class) @NotNull Object target,
            @NotNull SEL selector);

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIUpdateLink alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UIUpdateLink allocWithZone(VoidPtr zone);

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
     * During UI update, returns `UIUpdateInfo` instance describing current UI update state. Returns `nil` outside of UI
     * update.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("currentUpdateInfo")
    @Nullable
    public native UIUpdateInfo currentUpdateInfo();

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
    public native UIUpdateLink init();

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
     * It's required to enable the Update Link for it to have effect and for its actions to be invoked.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

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
    public static native UIUpdateLink new_objc();

    /**
     * Preferred frame rate range. Even when not forcing periodic updates, this will still express intention to the
     * system.
     * Use `CAFrameRateRangeDefault` (default value) to not request any specific frame rate range.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("preferredFrameRateRange")
    @ByValue
    public native CAFrameRateRange preferredFrameRateRange();

    /**
     * By default, `UIUpdateLink` is a passive UI update observer. Its actions will only be called when UI update is
     * being
     * produced. When this property is set to `YES`, `UIUpdateLink` will request continuous UI updates by itself.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("requiresContinuousUpdates")
    public native boolean requiresContinuousUpdates();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * It's required to enable the Update Link for it to have effect and for its actions to be invoked.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    /**
     * Preferred frame rate range. Even when not forcing periodic updates, this will still express intention to the
     * system.
     * Use `CAFrameRateRangeDefault` (default value) to not request any specific frame rate range.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setPreferredFrameRateRange:")
    public native void setPreferredFrameRateRange(@ByValue CAFrameRateRange value);

    /**
     * By default, `UIUpdateLink` is a passive UI update observer. Its actions will only be called when UI update is
     * being
     * produced. When this property is set to `YES`, `UIUpdateLink` will request continuous UI updates by itself.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setRequiresContinuousUpdates:")
    public native void setRequiresContinuousUpdates(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Request immediate frame presentation. When enabled, system will request immediate rendering of the display frame
     * after last `CATransaction` commit for the current UI update. This allows to reduce input to display latency, as
     * rendered display frame will be presented one frame duration sooner. However, for this to happen amount of work
     * submitted to render server should be minimal, otherwise it will not be able to submit frame for presentation in
     * time. This capability is primarily useful for pencil drawing applications where low input to display latency is
     * critical for good user experience. Applications that request immediate presentation must be profiled thoroughly
     * to
     * ensure that amount of application and render server work is adequate. When application requests immediate
     * presentation, but fails to keep work complexity at minimum, user will experience on screen judder, as frames will
     * not be presented at their intended time.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setWantsImmediatePresentation:")
    public native void setWantsImmediatePresentation(boolean value);

    /**
     * Request dispatch of low-latency eligible events in `LowLatencyEventDispatch` phase. Low latency eligible events
     * are
     * dispatch in the middle of the UI update, meaning that to handle them application has half the time, compared to
     * events dispatched normally. Consult `-[UIUpdateInfo completionDeadlineTime]` for exact completion deadline time.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setWantsLowLatencyEventDispatch:")
    public native void setWantsLowLatencyEventDispatch(boolean value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("updateLinkForView:")
    @NotNull
    public static native UIUpdateLink updateLinkForView(@NotNull UIView view);

    /**
     * Adds action to `UIUpdateActionPhase.beforeCADisplayLinkDispatch` phase.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("updateLinkForView:actionHandler:")
    @NotNull
    public static native UIUpdateLink updateLinkForViewActionHandler(@NotNull UIView view,
            @ObjCBlock(name = "call_updateLinkForViewActionHandler") @NotNull Block_updateLinkForViewActionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateLinkForViewActionHandler {
        @Generated
        void call_updateLinkForViewActionHandler(@NotNull UIUpdateLink updateLink, @NotNull UIUpdateInfo updateInfo);
    }

    /**
     * Adds action to `UIUpdateActionPhase.beforeCADisplayLinkDispatch` phase.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("updateLinkForView:actionTarget:selector:")
    @NotNull
    public static native UIUpdateLink updateLinkForViewActionTargetSelector(@NotNull UIView view,
            @Mapped(ObjCObjectMapper.class) @NotNull Object target, @NotNull SEL selector);

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("updateLinkForWindowScene:")
    @NotNull
    public static native UIUpdateLink updateLinkForWindowScene(@NotNull UIWindowScene windowScene);

    /**
     * Adds action to `UIUpdateActionPhase.beforeCADisplayLinkDispatch` phase.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("updateLinkForWindowScene:actionHandler:")
    @NotNull
    public static native UIUpdateLink updateLinkForWindowSceneActionHandler(@NotNull UIWindowScene windowScene,
            @ObjCBlock(name = "call_updateLinkForWindowSceneActionHandler") @NotNull Block_updateLinkForWindowSceneActionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateLinkForWindowSceneActionHandler {
        @Generated
        void call_updateLinkForWindowSceneActionHandler(@NotNull UIUpdateLink updateLink,
                @NotNull UIUpdateInfo updateInfo);
    }

    /**
     * Adds action to `UIUpdateActionPhase.beforeCADisplayLinkDispatch` phase.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("updateLinkForWindowScene:actionTarget:selector:")
    @NotNull
    public static native UIUpdateLink updateLinkForWindowSceneActionTargetSelector(@NotNull UIWindowScene windowScene,
            @Mapped(ObjCObjectMapper.class) @NotNull Object target, @NotNull SEL selector);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Request immediate frame presentation. When enabled, system will request immediate rendering of the display frame
     * after last `CATransaction` commit for the current UI update. This allows to reduce input to display latency, as
     * rendered display frame will be presented one frame duration sooner. However, for this to happen amount of work
     * submitted to render server should be minimal, otherwise it will not be able to submit frame for presentation in
     * time. This capability is primarily useful for pencil drawing applications where low input to display latency is
     * critical for good user experience. Applications that request immediate presentation must be profiled thoroughly
     * to
     * ensure that amount of application and render server work is adequate. When application requests immediate
     * presentation, but fails to keep work complexity at minimum, user will experience on screen judder, as frames will
     * not be presented at their intended time.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("wantsImmediatePresentation")
    public native boolean wantsImmediatePresentation();

    /**
     * Request dispatch of low-latency eligible events in `LowLatencyEventDispatch` phase. Low latency eligible events
     * are
     * dispatch in the middle of the UI update, meaning that to handle them application has half the time, compared to
     * events dispatched normally. Consult `-[UIUpdateInfo completionDeadlineTime]` for exact completion deadline time.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("wantsLowLatencyEventDispatch")
    public native boolean wantsLowLatencyEventDispatch();
}