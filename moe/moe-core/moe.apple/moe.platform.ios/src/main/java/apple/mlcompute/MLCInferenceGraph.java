package apple.mlcompute;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
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

/**
 * MLCInferenceGraph
 * <p>
 * An inference graph created from one or more MLCGraph objects
 * plus additional layers added directly to the inference graph.
 */
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCInferenceGraph extends MLCGraph {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCInferenceGraph(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Add the list of inputs to the inference graph
     *
     * @param inputs The inputs
     * @return A boolean indicating success or failure
     */
    @Generated
    @Selector("addInputs:")
    public native boolean addInputs(NSDictionary<String, ? extends MLCTensor> inputs);

    /**
     * Add the list of inputs to the inference graph
     * <p>
     * Each input, loss label or label weights tensor is identified by a NSString.
     * When the inference graph is executed, this NSString is used to identify which data object
     * should be as input data for each tensor whose device memory needs to be updated
     * before the graph is executed.
     *
     * @param inputs           The inputs
     * @param lossLabels       The loss label inputs
     * @param lossLabelWeights The loss label weights
     * @return A boolean indicating success or failure
     */
    @Generated
    @Selector("addInputs:lossLabels:lossLabelWeights:")
    public native boolean addInputsLossLabelsLossLabelWeights(NSDictionary<String, ? extends MLCTensor> inputs,
            NSDictionary<String, ? extends MLCTensor> lossLabels,
            NSDictionary<String, ? extends MLCTensor> lossLabelWeights);

    /**
     * Add the list of outputs to the inference graph
     *
     * @param outputs The outputs
     * @return A boolean indicating success or failure
     */
    @Generated
    @Selector("addOutputs:")
    public native boolean addOutputs(NSDictionary<String, ? extends MLCTensor> outputs);

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCInferenceGraph alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MLCInferenceGraph allocWithZone(VoidPtr zone);

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

    /**
     * Compile the training graph for a device.
     *
     * @param options The compiler options to use when compiling the training graph
     * @param device  The MLCDevice object
     * @return A boolean indicating success or failure
     */
    @Generated
    @Selector("compileWithOptions:device:")
    public native boolean compileWithOptionsDevice(long options, MLCDevice device);

    /**
     * Compile the inference graph for a device.
     * <p>
     * Specifying the list of constant tensors when we compile the graph allows MLCompute to perform additional optimizations at compile time.
     *
     * @param options          The compiler options to use when compiling the inference graph
     * @param device           The MLCDevice object
     * @param inputTensors     The list of input tensors that are constants
     * @param inputTensorsData The tensor data to be used with these constant input tensors
     * @return A boolean indicating success or failure
     */
    @Generated
    @Selector("compileWithOptions:device:inputTensors:inputTensorsData:")
    public native boolean compileWithOptionsDeviceInputTensorsInputTensorsData(long options, MLCDevice device,
            NSDictionary<String, ? extends MLCTensor> inputTensors,
            NSDictionary<String, ? extends MLCTensorData> inputTensorsData);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property]   The device memory size used by the inference graph
     * <p>
     * Returns the total size in bytes of device memory used by all intermediate tensors in the inference graph
     *
     * @return A NSUInteger value
     */
    @Generated
    @Selector("deviceMemorySize")
    @NUInt
    public native long deviceMemorySize();

    /**
     * Execute the inference graph with given input data
     * <p>
     * Execute the inference graph given input data.
     * If MLCExecutionOptionsSynchronous is specified in 'options', this method returns after the graph has been executed.
     * Otherwise, this method returns after the graph has been queued for execution.  The completion handler  is called after the graph has finished execution.
     *
     * @param inputsData        The data objects to use for inputs
     * @param batchSize         The batch size to use.  For a graph where batch size changes between layers this value must be 0.
     * @param options           The execution options
     * @param completionHandler The completion handler
     * @return A boolean indicating success or failure
     */
    @Generated
    @Selector("executeWithInputsData:batchSize:options:completionHandler:")
    public native boolean executeWithInputsDataBatchSizeOptionsCompletionHandler(
            NSDictionary<String, ? extends MLCTensorData> inputsData, @NUInt long batchSize, long options,
            @ObjCBlock(name = "call_executeWithInputsDataBatchSizeOptionsCompletionHandler") Block_executeWithInputsDataBatchSizeOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_executeWithInputsDataBatchSizeOptionsCompletionHandler {
        @Generated
        void call_executeWithInputsDataBatchSizeOptionsCompletionHandler(MLCTensor resultTensor, NSError error,
                double executionTime);
    }

    /**
     * Execute the inference graph with given input data
     * <p>
     * Execute the inference graph given input data.
     * If MLCExecutionOptionsSynchronous is specified in 'options', this method returns after the graph has been executed.
     * Otherwise, this method returns after the graph has been queued for execution.  The completion handler  is called after the graph has finished execution.
     *
     * @param inputsData           The data objects to use for inputs
     * @param lossLabelsData       The data objects to use for loss labels
     * @param lossLabelWeightsData The data objects to use for loss label weights
     * @param batchSize            The batch size to use.  For a graph where batch size changes between layers this value must be 0.
     * @param options              The execution options
     * @param completionHandler    The completion handler
     * @return A boolean indicating success or failure
     */
    @Generated
    @Selector("executeWithInputsData:lossLabelsData:lossLabelWeightsData:batchSize:options:completionHandler:")
    public native boolean executeWithInputsDataLossLabelsDataLossLabelWeightsDataBatchSizeOptionsCompletionHandler(
            NSDictionary<String, ? extends MLCTensorData> inputsData,
            NSDictionary<String, ? extends MLCTensorData> lossLabelsData,
            NSDictionary<String, ? extends MLCTensorData> lossLabelWeightsData, @NUInt long batchSize, long options,
            @ObjCBlock(name = "call_executeWithInputsDataLossLabelsDataLossLabelWeightsDataBatchSizeOptionsCompletionHandler") Block_executeWithInputsDataLossLabelsDataLossLabelWeightsDataBatchSizeOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_executeWithInputsDataLossLabelsDataLossLabelWeightsDataBatchSizeOptionsCompletionHandler {
        @Generated
        void call_executeWithInputsDataLossLabelsDataLossLabelWeightsDataBatchSizeOptionsCompletionHandler(
                MLCTensor resultTensor, NSError error, double executionTime);
    }

    /**
     * Execute the inference graph with given input data
     * <p>
     * Execute the inference graph given input data.
     * If MLCExecutionOptionsSynchronous is specified in 'options', this method returns after the graph has been executed.
     * Otherwise, this method returns after the graph has been queued for execution.  The completion handler  is called after the graph has finished execution.
     *
     * @param inputsData           The data objects to use for inputs
     * @param lossLabelsData       The data objects to use for loss labels
     * @param lossLabelWeightsData The data objects to use for loss label weights
     * @param outputsData          The data objects to use for outputs
     * @param batchSize            The batch size to use.  For a graph where batch size changes between layers this value must be 0.
     * @param options              The execution options
     * @param completionHandler    The completion handler
     * @return A boolean indicating success or failure
     */
    @Generated
    @Selector("executeWithInputsData:lossLabelsData:lossLabelWeightsData:outputsData:batchSize:options:completionHandler:")
    public native boolean executeWithInputsDataLossLabelsDataLossLabelWeightsDataOutputsDataBatchSizeOptionsCompletionHandler(
            NSDictionary<String, ? extends MLCTensorData> inputsData,
            NSDictionary<String, ? extends MLCTensorData> lossLabelsData,
            NSDictionary<String, ? extends MLCTensorData> lossLabelWeightsData,
            NSDictionary<String, ? extends MLCTensorData> outputsData, @NUInt long batchSize, long options,
            @ObjCBlock(name = "call_executeWithInputsDataLossLabelsDataLossLabelWeightsDataOutputsDataBatchSizeOptionsCompletionHandler") Block_executeWithInputsDataLossLabelsDataLossLabelWeightsDataOutputsDataBatchSizeOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_executeWithInputsDataLossLabelsDataLossLabelWeightsDataOutputsDataBatchSizeOptionsCompletionHandler {
        @Generated
        void call_executeWithInputsDataLossLabelsDataLossLabelWeightsDataOutputsDataBatchSizeOptionsCompletionHandler(
                MLCTensor resultTensor, NSError error, double executionTime);
    }

    /**
     * Execute the inference graph with given input data
     * <p>
     * Execute the inference graph given input data.
     * If MLCExecutionOptionsSynchronous is specified in 'options', this method returns after the graph has been executed.
     * Otherwise, this method returns after the graph has been queued for execution.  The completion handler  is called after the graph has finished execution.
     *
     * @param inputsData        The data objects to use for inputs
     * @param outputsData       The data objects to use for outputs
     * @param batchSize         The batch size to use.  For a graph where batch size changes between layers this value must be 0.
     * @param options           The execution options
     * @param completionHandler The completion handler
     * @return A boolean indicating success or failure
     */
    @Generated
    @Selector("executeWithInputsData:outputsData:batchSize:options:completionHandler:")
    public native boolean executeWithInputsDataOutputsDataBatchSizeOptionsCompletionHandler(
            NSDictionary<String, ? extends MLCTensorData> inputsData,
            NSDictionary<String, ? extends MLCTensorData> outputsData, @NUInt long batchSize, long options,
            @ObjCBlock(name = "call_executeWithInputsDataOutputsDataBatchSizeOptionsCompletionHandler") Block_executeWithInputsDataOutputsDataBatchSizeOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_executeWithInputsDataOutputsDataBatchSizeOptionsCompletionHandler {
        @Generated
        void call_executeWithInputsDataOutputsDataBatchSizeOptionsCompletionHandler(MLCTensor resultTensor,
                NSError error, double executionTime);
    }

    @Generated
    @Selector("graph")
    public static native MLCInferenceGraph graph();

    /**
     * Create an inference graph
     *
     * @param graphObjects The layers from these graph objects will be added to the training graph
     * @return A new inference graph object
     */
    @Generated
    @Selector("graphWithGraphObjects:")
    public static native MLCInferenceGraph graphWithGraphObjects(NSArray<? extends MLCGraph> graphObjects);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MLCInferenceGraph init();

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

    /**
     * Link mutiple inference graphs
     * <p>
     * This is used to link subsequent inference graphs with first inference sub-graph.
     * This method should be used when we have tensors shared by one or more layers in multiple sub-graphs
     *
     * @param graphs The list of inference graphs to link
     * @return A boolean indicating success or failure
     */
    @Generated
    @Selector("linkWithGraphs:")
    public native boolean linkWithGraphs(NSArray<? extends MLCInferenceGraph> graphs);

    @Generated
    @Owned
    @Selector("new")
    public static native MLCInferenceGraph new_objc();

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
    @Selector("version")
    @NInt
    public static native long version_static();
}
