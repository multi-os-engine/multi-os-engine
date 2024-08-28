package apple.metalperformanceshadersgraph;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandQueue;
import apple.metalperformanceshaders.MPSCommandBuffer;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.foundation.NSURL;

/**
 * Compiled representation of a compute graph executable.
 * 
 * An MPSGraphExecutable is a compiled graph for specific feeds for specific targetTensors and target operations.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("MetalPerformanceShadersGraph")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGraphExecutable extends MPSGraphObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSGraphExecutable(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSGraphExecutable alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSGraphExecutable allocWithZone(VoidPtr zone);

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

    /**
     * Runs the graph for given feeds to return targetTensor values, ensuring all target operations also executed.
     * This call is asynchronous and will return immediately after finishing encoding.
     * 
     * - Parameters:
     * - commandBuffer: CommandBuffer passed to exectute the graph on, commitAndContinue might be called, please don't
     * rely on underlying MTLCommandBuffer to remain uncommitted
     * - inputsArray: Feeds tensorData for the placeholder tensors, same order as arguments of main function
     * - resultsArray: Tensors for which the caller wishes MPSGraphTensorData to be returned
     * - executionDescriptor: ExecutionDescriptor to be passed in and used,
     * - Returns: A valid MPSGraphTensorData array with results synchronized to the CPU memory if
     * MPSGraphOptionsSynchronizeResults set.
     */
    @NotNull
    @Generated
    @Selector("encodeToCommandBuffer:inputsArray:resultsArray:executionDescriptor:")
    public native NSArray<? extends MPSGraphTensorData> encodeToCommandBufferInputsArrayResultsArrayExecutionDescriptor(
            @NotNull MPSCommandBuffer commandBuffer, @NotNull NSArray<? extends MPSGraphTensorData> inputsArray,
            @Nullable NSArray<? extends MPSGraphTensorData> resultsArray,
            @Nullable MPSGraphExecutableExecutionDescriptor executionDescriptor);

    /**
     * Feed tensors for the graph, can be used to order the inputs when executable was created with an MPSGraph
     */
    @Nullable
    @Generated
    @Selector("feedTensors")
    public native NSArray<? extends MPSGraphTensor> feedTensors();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSGraphExecutable init();

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
    public static native MPSGraphExecutable new_objc();

    /**
     * Options for the graph executable.
     * 
     * Default value is `MPSGraphOptionsDefault`.
     */
    @Generated
    @Selector("options")
    public native long options();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Runs the graph for given feeds to return targetTensor values, ensuring all target operations also executed.
     * This call is asynchronous and will return immediately.
     * 
     * - Parameters:
     * - commandQueue: CommandQueue passed to exectute the graph on.
     * - inputsArray: Feeds tensorData for the placeholder tensors, same order as arguments of main function.
     * - resultsArray: Tensors for which the caller wishes MPSGraphTensorData to be returned.
     * - executionDescriptor: ExecutionDescriptor to be passed in and used.
     * - Returns: A valid MPSGraphTensorData array with results synchronized to the CPU memory if
     * MPSGraphOptionsSynchronizeResults set.
     */
    @NotNull
    @Generated
    @Selector("runAsyncWithMTLCommandQueue:inputsArray:resultsArray:executionDescriptor:")
    public native NSArray<? extends MPSGraphTensorData> runAsyncWithMTLCommandQueueInputsArrayResultsArrayExecutionDescriptor(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandQueue commandQueue,
            @NotNull NSArray<? extends MPSGraphTensorData> inputsArray,
            @Nullable NSArray<? extends MPSGraphTensorData> resultsArray,
            @Nullable MPSGraphExecutableExecutionDescriptor executionDescriptor);

    /**
     * Runs the graph for given feeds to return targetTensor values, ensuring all target operations also executed.
     * This call is synchronous and will return on completion of execution.
     * 
     * - Parameters:
     * - commandQueue: CommandQueue passed to exectute the graph on.
     * - inputsArray: Feeds tensorData for the placeholder tensors, same order as arguments of main function.
     * - resultsArray: Results tensorData for which the caller wishes MPSGraphTensorData to be returned.
     * - Returns: A valid MPSGraphTensorData array with results synchronized to the CPU memory if
     * MPSGraphOptionsSynchronizeResults set.
     */
    @NotNull
    @Generated
    @Selector("runWithMTLCommandQueue:inputsArray:resultsArray:executionDescriptor:")
    public native NSArray<? extends MPSGraphTensorData> runWithMTLCommandQueueInputsArrayResultsArrayExecutionDescriptor(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandQueue commandQueue,
            @NotNull NSArray<? extends MPSGraphTensorData> inputsArray,
            @Nullable NSArray<? extends MPSGraphTensorData> resultsArray,
            @Nullable MPSGraphExecutableExecutionDescriptor executionDescriptor);

    /**
     * Options for the graph executable.
     * 
     * Default value is `MPSGraphOptionsDefault`.
     */
    @Generated
    @Selector("setOptions:")
    public native void setOptions(long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Specialize the MPSGraphExecutable and optimize it, use this method to choose when specialization happens, else it
     * occurs at encode time automatically.
     * 
     * - Parameters:
     * - device: optional MPSGraph device to compile with
     * - inputTypes: input types
     * - compilationDescriptor: compilationDescriptor to be used to specialize, since the executable was created with a
     * compilationDescriptor already this one overrides those settings to the extent it can.
     */
    @Generated
    @Selector("specializeWithDevice:inputTypes:compilationDescriptor:")
    public native void specializeWithDeviceInputTypesCompilationDescriptor(@Nullable MPSGraphDevice device,
            @NotNull NSArray<? extends MPSGraphType> inputTypes,
            @Nullable MPSGraphCompilationDescriptor compilationDescriptor);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Target tensors for the graph, can be used to order the outputs when executable was created with an MPSGraph
     */
    @Nullable
    @Generated
    @Selector("targetTensors")
    public native NSArray<? extends MPSGraphTensor> targetTensors();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Get output shapes for a specialized MPSGraphExecutable - in case specialization has not been done yet then
     * calling this function will specialize for the given input shapes.
     * 
     * - Parameters:
     * - device: optional MPSGraph device to compile with
     * - inputTypes: input types
     * - compilationDescriptor: compilationDescriptor to be used to specialize, since the executable was created with a
     * compilationDescriptor already this one overrides those settings to the extent it can.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("getOutputTypesWithDevice:inputTypes:compilationDescriptor:")
    @Nullable
    public native NSArray<? extends MPSGraphShapedType> getOutputTypesWithDeviceInputTypesCompilationDescriptor(
            @Nullable MPSGraphDevice device, @NotNull NSArray<? extends MPSGraphType> inputTypes,
            @Nullable MPSGraphCompilationDescriptor compilationDescriptor);

    /**
     * Initialize the MPSGraph executable with the package at the provided url.
     * 
     * - Parameters:
     * - mpsgraphPackageURL: The URL where to read the serialized MPSGraphExecutable.
     * - compilationDescriptor: Compilation descriptor to be used to specialize, since the executable was created with a
     * compilationDescriptor already this one overrides those settings to the extent it can.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("initWithMPSGraphPackageAtURL:compilationDescriptor:")
    public native MPSGraphExecutable initWithMPSGraphPackageAtURLCompilationDescriptor(
            @NotNull NSURL mpsgraphPackageURL, @Nullable MPSGraphCompilationDescriptor compilationDescriptor);

    /**
     * Serialize the MPSGraph executable at the provided url.
     * 
     * - Parameters:
     * - url: The URL where to serialize the MPSGraph executable.
     * - descriptor: The descriptor to be used to serialize the graph.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("serializeToMPSGraphPackageAtURL:descriptor:")
    public native void serializeToMPSGraphPackageAtURLDescriptor(@NotNull NSURL url,
            @Nullable MPSGraphExecutableSerializationDescriptor descriptor);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
