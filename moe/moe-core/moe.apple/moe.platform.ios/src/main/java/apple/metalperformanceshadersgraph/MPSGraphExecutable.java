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

/**
 * MPSGraphExecutable
 * <p>
 * Compiled representation of a compute graph executable
 * <p>
 * An MPSGraphExecutable is a compiled graph for specific feeds for specific targetTensors and targetOperations
 */
@Generated
@Library("MetalPerformanceShadersGraph")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGraphExecutable extends NSObject {
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
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

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
     * This call is asynchronous and will return immediately if a completionHandler is set.
     *
     * @param commandBuffer       commandBuffer passed to exectute the graph on, commitAndContinue might be called,
     *                            please don't rely on underlying MTLCommandBuffer to remain uncommitted
     * @param inputsArray         Feeds tensorData for the placeholder tensors, same order as arguments of main function
     * @param resultsArray        Tensors for which the caller wishes MPSGraphTensorData to be returned
     * @param executionDescriptor ExecutionDescriptor to be passed in and used,
     * @return A valid MPSGraphTensorData array with results synchronized to the CPU memory if
     *         MPSGraphOptionsSynchronizeResults set.
     */
    @Generated
    @Selector("encodeToCommandBuffer:inputsArray:resultsArray:executionDescriptor:")
    public native NSArray<? extends MPSGraphTensorData> encodeToCommandBufferInputsArrayResultsArrayExecutionDescriptor(
            MPSCommandBuffer commandBuffer, NSArray<? extends MPSGraphTensorData> inputsArray,
            NSArray<? extends MPSGraphTensorData> resultsArray,
            MPSGraphExecutableExecutionDescriptor executionDescriptor);

    /**
     * [@property] feedTensors
     * <p>
     * feedTensors for the graph, can be used to order the inputs when executable was created with an MPSGraph
     */
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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSGraphExecutable new_objc();

    /**
     * [@property] options
     * <p>
     * options for the graph, default value is MPSGraphOptionsDefault
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
     * This call is asynchronous and will return immediately if a completionHandler is set.
     *
     * @param commandQueue        CommandQueue passed to exectute the graph on
     * @param inputsArray         Feeds tensorData for the placeholder tensors, same order as arguments of main function
     * @param resultsArray        Tensors for which the caller wishes MPSGraphTensorData to be returned
     * @param executionDescriptor ExecutionDescriptor to be passed in and used,
     * @return A valid MPSGraphTensorData array with results synchronized to the CPU memory if
     *         MPSGraphOptionsSynchronizeResults set.
     */
    @Generated
    @Selector("runAsyncWithMTLCommandQueue:inputsArray:resultsArray:executionDescriptor:")
    public native NSArray<? extends MPSGraphTensorData> runAsyncWithMTLCommandQueueInputsArrayResultsArrayExecutionDescriptor(
            @Mapped(ObjCObjectMapper.class) MTLCommandQueue commandQueue,
            NSArray<? extends MPSGraphTensorData> inputsArray, NSArray<? extends MPSGraphTensorData> resultsArray,
            MPSGraphExecutableExecutionDescriptor executionDescriptor);

    /**
     * Runs the graph for given feeds to return targetTensor values, ensuring all target operations also executed.
     * This call is synchronous and will return on completion of execution
     *
     * @param commandQueue CommandQueue passed to exectute the graph on
     * @param inputsArray  Feeds tensorData for the placeholder tensors, same order as arguments of main function
     * @param resultsArray Results tensorData for which the caller wishes MPSGraphTensorData to be returned
     * @return A valid MPSGraphTensorData array with results synchronized to the CPU memory if
     *         MPSGraphOptionsSynchronizeResults set.
     */
    @Generated
    @Selector("runWithMTLCommandQueue:inputsArray:resultsArray:executionDescriptor:")
    public native NSArray<? extends MPSGraphTensorData> runWithMTLCommandQueueInputsArrayResultsArrayExecutionDescriptor(
            @Mapped(ObjCObjectMapper.class) MTLCommandQueue commandQueue,
            NSArray<? extends MPSGraphTensorData> inputsArray, NSArray<? extends MPSGraphTensorData> resultsArray,
            MPSGraphExecutableExecutionDescriptor executionDescriptor);

    /**
     * [@property] options
     * <p>
     * options for the graph, default value is MPSGraphOptionsDefault
     */
    @Generated
    @Selector("setOptions:")
    public native void setOptions(long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Specialize MLIR module and optimize it
     *
     * @param device     optional MPSGraph device to compile with
     * @param inputTypes input types
     */
    @Generated
    @Selector("specializeWithDevice:inputTypes:compilationDescriptor:")
    public native void specializeWithDeviceInputTypesCompilationDescriptor(MPSGraphDevice device,
            NSArray<? extends MPSGraphType> inputTypes, MPSGraphCompilationDescriptor compilationDescriptor);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] targetTensors
     * <p>
     * targetTensors for the graph, can be used to order the outputs when executable was created with an MPSGraph
     */
    @Generated
    @Selector("targetTensors")
    public native NSArray<? extends MPSGraphTensor> targetTensors();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
