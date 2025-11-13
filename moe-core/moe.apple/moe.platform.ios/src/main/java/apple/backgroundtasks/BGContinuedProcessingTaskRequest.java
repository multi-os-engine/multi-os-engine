package apple.backgroundtasks;

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
 * A request to begin a workload immediately, or shortly after submission, which is allowed to continue running even if
 * the app is backgrounded.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("BackgroundTasks")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class BGContinuedProcessingTaskRequest extends BGTaskRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected BGContinuedProcessingTaskRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native BGContinuedProcessingTaskRequest alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native BGContinuedProcessingTaskRequest allocWithZone(VoidPtr zone);

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
    public native BGContinuedProcessingTaskRequest init();

    /**
     * Creates an instance on behalf of the currently foregrounded app.
     * 
     * Apps and their extensions should use this method to initialize any tasks due to the underlying association to the
     * currently foregrounded app. Please note that ``BGTaskRequest/earliestBeginDate`` will be outright ignored by the
     * scheduler in favor of `NSDate.now`.
     * 
     * The identifier ought to use wildcard notation, where the prefix of the identifier must at least contain the
     * bundle
     * ID of the submitting application, followed by optional semantic context, and finally ending with `.*`. An
     * example:
     * `<MainBundle>.<SemanticContext>.*` which would transform to `com.foo.MyApplication.continuedProcessingTask.*`.
     * Thus,
     * a submitted identifier would be of the form `com.foo.MyApplication.continuedProcessingTask.HD830D`.
     * 
     * - Parameters:
     * - identifier: The task identifier.
     * - title: The localized title displayed to the user before the task begins running.
     * - subtitle: The localized subtitle displayed to the user before the task begins running.
     * - Warning: Successful creation of this object does not guarantee successful submission to the scheduler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithIdentifier:title:subtitle:")
    public native BGContinuedProcessingTaskRequest initWithIdentifierTitleSubtitle(@NotNull String identifier,
            @NotNull String title, @NotNull String subtitle);

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
    public static native BGContinuedProcessingTaskRequest new_objc();

    /**
     * Inform the scheduler that the task will be requesting additional system resources.
     * 
     * Defaults to ``BGContinuedProcessingTaskRequestResources/BGContinuedProcessingTaskRequestResourcesDefault``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("requiredResources")
    @NInt
    public native long requiredResources();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Inform the scheduler that the task will be requesting additional system resources.
     * 
     * Defaults to ``BGContinuedProcessingTaskRequestResources/BGContinuedProcessingTaskRequestResourcesDefault``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setRequiredResources:")
    public native void setRequiredResources(@NInt long value);

    /**
     * The submission strategy for the scheduler to abide by.
     * 
     * Defaults to
     * ``BGContinuedProcessingTaskRequestSubmissionStrategy/BGContinuedProcessingTaskRequestSubmissionStrategyQueue``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setStrategy:")
    public native void setStrategy(@NInt long value);

    /**
     * The localized subtitle displayed to the user.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSubtitle:")
    public native void setSubtitle(@NotNull String value);

    /**
     * The localized title displayed to the user.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(@NotNull String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The submission strategy for the scheduler to abide by.
     * 
     * Defaults to
     * ``BGContinuedProcessingTaskRequestSubmissionStrategy/BGContinuedProcessingTaskRequestSubmissionStrategyQueue``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("strategy")
    @NInt
    public native long strategy();

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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}