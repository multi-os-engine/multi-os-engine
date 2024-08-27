package apple.metalperformanceshadersgraph;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.foundation.protocol.NSCopying;
import apple.metal.protocol.MTLSharedEvent;
import org.moe.natj.general.ann.MappedReturn;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 15.0
 */
@Generated
@Library("MetalPerformanceShadersGraph")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGraphExecutableExecutionDescriptor extends MPSGraphObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSGraphExecutableExecutionDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSGraphExecutableExecutionDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSGraphExecutableExecutionDescriptor allocWithZone(VoidPtr zone);

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

    /**
     * CompletionHandler for the graph executable, default value is nil.
     */
    @NotNull
    @Generated
    @Selector("completionHandler")
    @ObjCBlock(name = "call_completionHandler_ret")
    public native Block_completionHandler_ret completionHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_completionHandler_ret {
        @Generated
        void call_completionHandler_ret(@NotNull NSArray<? extends MPSGraphTensorData> arg0, @Nullable NSError arg1);
    }

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
    public native MPSGraphExecutableExecutionDescriptor init();

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
    public static native MPSGraphExecutableExecutionDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * ScheduledHandler for the graph executable, default value is nil.
     */
    @NotNull
    @Generated
    @Selector("scheduledHandler")
    @ObjCBlock(name = "call_scheduledHandler_ret")
    public native Block_scheduledHandler_ret scheduledHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scheduledHandler_ret {
        @Generated
        void call_scheduledHandler_ret(@NotNull NSArray<? extends MPSGraphTensorData> arg0, @Nullable NSError arg1);
    }

    /**
     * CompletionHandler for the graph executable, default value is nil.
     */
    @Generated
    @Selector("setCompletionHandler:")
    public native void setCompletionHandler(
            @NotNull @ObjCBlock(name = "call_setCompletionHandler") Block_setCompletionHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setCompletionHandler {
        @Generated
        void call_setCompletionHandler(@NotNull NSArray<? extends MPSGraphTensorData> arg0, @Nullable NSError arg1);
    }

    /**
     * ScheduledHandler for the graph executable, default value is nil.
     */
    @Generated
    @Selector("setScheduledHandler:")
    public native void setScheduledHandler(
            @NotNull @ObjCBlock(name = "call_setScheduledHandler") Block_setScheduledHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setScheduledHandler {
        @Generated
        void call_setScheduledHandler(@NotNull NSArray<? extends MPSGraphTensorData> arg0, @Nullable NSError arg1);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Flag for the graph executable to wait till the execution has completed, default value is false.
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
     * Flag for the graph executable to wait till the execution has completed, default value is false.
     */
    @Generated
    @Selector("waitUntilCompleted")
    public native boolean waitUntilCompleted();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * Executable signals these shared events at execution stage and immediately proceeds.
     * 
     * - Parameters:
     * - event: Shared event to signal.
     * - executionStage: Execution stage to signal event at.
     * - value: Value for shared event to wait on.
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
     * - event: Shared event to wait on.
     * - value: Value for shared event to wait on.
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
