package apple.metalperformanceshadersgraph;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import apple.metal.protocol.MTLSharedEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This is a class that consists of all the levers to synchronize and schedule graph execution.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("MetalPerformanceShadersGraph")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGraphExecutionDescriptor extends MPSGraphObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSGraphExecutionDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSGraphExecutionDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSGraphExecutionDescriptor allocWithZone(VoidPtr zone);

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
    @Selector("init")
    public native MPSGraphExecutionDescriptor init();

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

    @Generated
    @Owned
    @Selector("new")
    public static native MPSGraphExecutionDescriptor new_objc();

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
     * Flag that makes the execution call blocking till the entire compilation is complete, defaults to NO.
     */
    @Generated
    @Selector("setWaitUntilCompleted:")
    public native void setWaitUntilCompleted(boolean value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Flag that makes the execution call blocking till the entire compilation is complete, defaults to NO.
     */
    @Generated
    @Selector("waitUntilCompleted")
    public native boolean waitUntilCompleted();

    /**
     * compilationDescriptor for the graph, default value is nil.
     * 
     * API-Since: 15.4
     */
    @Nullable
    @Generated
    @Selector("compilationDescriptor")
    public native MPSGraphCompilationDescriptor compilationDescriptor();

    /**
     * compilationDescriptor for the graph, default value is nil.
     * 
     * API-Since: 15.4
     */
    @Generated
    @Selector("setCompilationDescriptor:")
    public native void setCompilationDescriptor(@Nullable MPSGraphCompilationDescriptor value);

    /**
     * Executable signals these shared events at execution stage and immediately proceeds.
     * 
     * - Parameters:
     * - event: shared event to signal.
     * - executionStage: execution stage to signal event at.
     * - value: value for shared event to wait on.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("signalEvent:atExecutionEvent:value:")
    public native void signalEventAtExecutionEventValue(@NotNull @Mapped(ObjCObjectMapper.class) MTLSharedEvent event,
            long executionStage, long value);

    /**
     * Executable waits on these shared events before scheduling execution on the HW, this does not include encoding
     * which can still continue.
     * 
     * - Parameters:
     * - event: shared event graph waits on.
     * - value: value of shared event graph waits on.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("waitForEvent:value:")
    public native void waitForEventValue(@NotNull @Mapped(ObjCObjectMapper.class) MTLSharedEvent event, long value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
