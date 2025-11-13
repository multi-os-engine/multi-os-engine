package apple.backgroundtasks;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSProgress;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSProgressReporting;
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
 * A task meant to perform processing on behalf of a user initiated request.
 * 
 * Continued processing tasks will present UI while in progress to provide awareness to the user.
 * ``BGContinuedProcessingTask``s _must_ report progress via the ``NSProgressReporting`` protocol conformance during
 * runtime and are subject to expiration based on changing system conditions and user input. Tasks that appear stalled
 * may be forcibly expired by the scheduler to preserve system resources.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("BackgroundTasks")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class BGContinuedProcessingTask extends BGTask implements NSProgressReporting {
    static {
        NatJ.register();
    }

    @Generated
    protected BGContinuedProcessingTask(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native BGContinuedProcessingTask alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native BGContinuedProcessingTask allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native BGContinuedProcessingTask init();

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
    public static native BGContinuedProcessingTask new_objc();

    @Generated
    @Selector("progress")
    @NotNull
    public native NSProgress progress();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The localized subtitle displayed to the user.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("subtitle")
    @NotNull
    public native String subtitle();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The localized title displayed to the user.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("title")
    @NotNull
    public native String title();

    /**
     * Update the title and subtitle displayed in the live activity displayed to the user.
     * 
     * - Parameters:
     * - title: The localized title displayed to the user.
     * - subtitle: The localized subtitle displayed to the user.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("updateTitle:subtitle:")
    public native void updateTitleSubtitle(@NotNull String title, @NotNull String subtitle);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}