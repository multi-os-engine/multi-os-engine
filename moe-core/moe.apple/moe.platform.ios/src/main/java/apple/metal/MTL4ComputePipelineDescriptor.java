package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.struct.MTLSize;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Describes a compute pipeline state.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTL4ComputePipelineDescriptor extends MTL4PipelineDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MTL4ComputePipelineDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTL4ComputePipelineDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTL4ComputePipelineDescriptor allocWithZone(VoidPtr zone);

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
     * A descriptor representing the compute pipeline's function.
     * 
     * You don't assign instances of ``MTL4FunctionDescriptor`` to this property directly, instead
     * assign an instance of one of its subclasses, such as ``MTL4LibraryFunctionDescriptor``, which
     * represents a function from a Metal library.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("computeFunctionDescriptor")
    @Nullable
    public native MTL4FunctionDescriptor computeFunctionDescriptor();

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
    public native MTL4ComputePipelineDescriptor init();

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
     * The maximum total number of threads that Metal can execute in a single threadgroup for the
     * compute function.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("maxTotalThreadsPerThreadgroup")
    @NUInt
    public native long maxTotalThreadsPerThreadgroup();

    @Generated
    @Owned
    @Selector("new")
    public static native MTL4ComputePipelineDescriptor new_objc();

    /**
     * The required number of threads per threadgroup for compute dispatches.
     * 
     * When you set this value, you are responsible for ensuring that the `threadsPerThreadgroup` argument of any
     * compute
     * dispatch matches it.
     * 
     * Setting this property is optional, except in cases where the pipeline uses *CooperativeTensors*.
     * 
     * This property's default value is `0`, which disables its effect.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("requiredThreadsPerThreadgroup")
    @ByValue
    public native MTLSize requiredThreadsPerThreadgroup();

    /**
     * Resets the descriptor to its default values.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("reset")
    public native void reset();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A descriptor representing the compute pipeline's function.
     * 
     * You don't assign instances of ``MTL4FunctionDescriptor`` to this property directly, instead
     * assign an instance of one of its subclasses, such as ``MTL4LibraryFunctionDescriptor``, which
     * represents a function from a Metal library.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setComputeFunctionDescriptor:")
    public native void setComputeFunctionDescriptor(@Nullable MTL4FunctionDescriptor value);

    /**
     * The maximum total number of threads that Metal can execute in a single threadgroup for the
     * compute function.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMaxTotalThreadsPerThreadgroup:")
    public native void setMaxTotalThreadsPerThreadgroup(@NUInt long value);

    /**
     * The required number of threads per threadgroup for compute dispatches.
     * 
     * When you set this value, you are responsible for ensuring that the `threadsPerThreadgroup` argument of any
     * compute
     * dispatch matches it.
     * 
     * Setting this property is optional, except in cases where the pipeline uses *CooperativeTensors*.
     * 
     * This property's default value is `0`, which disables its effect.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setRequiredThreadsPerThreadgroup:")
    public native void setRequiredThreadsPerThreadgroup(@ByValue MTLSize value);

    /**
     * An object that contains information about functions to link to the compute pipeline.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setStaticLinkingDescriptor:")
    public native void setStaticLinkingDescriptor(@Nullable MTL4StaticLinkingDescriptor value);

    /**
     * A boolean value indicating whether the compute pipeline supports linking binary functions.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSupportBinaryLinking:")
    public native void setSupportBinaryLinking(boolean value);

    /**
     * A value indicating whether the pipeline supports Metal indirect command buffers.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSupportIndirectCommandBuffers:")
    public native void setSupportIndirectCommandBuffers(@NInt long value);

    /**
     * A boolean value indicating whether each dimension of the threadgroup size is a multiple of its
     * corresponding thread execution width.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setThreadGroupSizeIsMultipleOfThreadExecutionWidth:")
    public native void setThreadGroupSizeIsMultipleOfThreadExecutionWidth(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * An object that contains information about functions to link to the compute pipeline.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("staticLinkingDescriptor")
    @Nullable
    public native MTL4StaticLinkingDescriptor staticLinkingDescriptor();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * A boolean value indicating whether the compute pipeline supports linking binary functions.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("supportBinaryLinking")
    public native boolean supportBinaryLinking();

    /**
     * A value indicating whether the pipeline supports Metal indirect command buffers.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("supportIndirectCommandBuffers")
    @NInt
    public native long supportIndirectCommandBuffers();

    /**
     * A boolean value indicating whether each dimension of the threadgroup size is a multiple of its
     * corresponding thread execution width.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("threadGroupSizeIsMultipleOfThreadExecutionWidth")
    public native boolean threadGroupSizeIsMultipleOfThreadExecutionWidth();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}