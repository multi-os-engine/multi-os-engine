package apple.mlcompute;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
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
 * MLCTrainingGraph
 * 
 * A training graph created from one or more MLCGraph objects
 * plus additional layers added directly to the training graph.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCTrainingGraph extends MLCGraph {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCTrainingGraph(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Add the list of inputs to the training graph
     * 
     * @param inputs     The inputs
     * @param lossLabels The loss label inputs
     * @return A boolean indicating success or failure
     */
    @Generated
    @Selector("addInputs:lossLabels:")
    public native boolean addInputsLossLabels(NSDictionary<String, ? extends MLCTensor> inputs,
            NSDictionary<String, ? extends MLCTensor> lossLabels);

    /**
     * Add the list of inputs to the training graph
     * 
     * Each input, loss label or label weights tensor is identified by a NSString.
     * When the training graph is executed, this NSString is used to identify which data object
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
     * Add the list of outputs to the training graph
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
    public static native MLCTrainingGraph alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLCTrainingGraph allocWithZone(VoidPtr zone);

    /**
     * Allocate an entry for a user specified gradient for a tensor
     * 
     * @param tensor A result tensor produced by a layer in the training graph
     *               that is input to some user specified code and will need to
     *               provide a user gradient during the gradient pass.
     * @return A gradient tensor
     */
    @Generated
    @Selector("allocateUserGradientForTensor:")
    public native MLCTensor allocateUserGradientForTensor(MLCTensor tensor);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Associates the given optimizer data and device data buffers with the tensor.
     * Returns true if the data is successfully associated with the tensor and copied to the device.
     * 
     * The caller must guarantee the lifetime of the underlying memory of \p data for the entirety of the tensor's
     * lifetime. The \p deviceData buffers are allocated by MLCompute. This method must be called
     * before executeOptimizerUpdateWithOptions or executeWithInputsData is called for the training graph.
     * We recommend using this method instead of using [MLCTensor bindOptimizerData] especially if the
     * optimizer update is being called multiple times for each batch.
     * 
     * @param data       The optimizer data to be associated with the tensor
     * @param deviceData The optimizer device data to be associated with the tensor
     * @param tensor     The tensor
     * @return A Boolean value indicating whether the data is successfully associated with the tensor .
     */
    @Generated
    @Selector("bindOptimizerData:deviceData:withTensor:")
    public native boolean bindOptimizerDataDeviceDataWithTensor(NSArray<? extends MLCTensorData> data,
            NSArray<? extends MLCTensorOptimizerDeviceData> deviceData, MLCTensor tensor);

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
     * Compile the optimizer to be used with a training graph.
     * 
     * Typically the optimizer to be used with a training graph is specifed when the training graph is created using
     * graphWithGraphObjects:lossLayer:optimizer. The optimizer will be compiled in when compileWithOptions:device
     * is called if an optimizer is specified with the training graph. In the case where the optimizer to be used is not
     * known
     * when the graph is created or compiled, this method can be used to associate and compile a training graph with an
     * optimizer.
     * 
     * @param optimizer The MLCOptimizer object
     * @return A boolean indicating success or failure
     */
    @Generated
    @Selector("compileOptimizer:")
    public native boolean compileOptimizer(MLCOptimizer optimizer);

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
     * Compile the training graph for a device.
     * 
     * Specifying the list of constant tensors when we compile the graph allows MLCompute to perform additional
     * optimizations at compile time.
     * 
     * @param options          The compiler options to use when compiling the training graph
     * @param device           The MLCDevice object
     * @param inputTensors     The list of input tensors that are constants
     * @param inputTensorsData The tensor data to be used with these constant input tensors
     * @return A boolean indicating success or failure
     * 
     *         API-Since: 14.5
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
     * [@property] The device memory size used by the training graph
     * 
     * Returns the total size in bytes of device memory used for all intermediate tensors
     * for forward, gradient passes and optimizer update for all layers in the training graph.
     * We recommend executing an iteration before checking the device memory size as
     * the buffers needed get allocated when the corresponding pass such as gradient,
     * optimizer update is executed.
     * 
     * @return A NSUInteger value
     */
    @Generated
    @Selector("deviceMemorySize")
    @NUInt
    public native long deviceMemorySize();

    /**
     * Execute the forward pass of the training graph
     * 
     * @param batchSize         The batch size to use. For a graph where batch size changes between layers this value
     *                          must be 0.
     * @param options           The execution options
     * @param completionHandler The completion handler
     * @return A boolean indicating success or failure
     */
    @Generated
    @Selector("executeForwardWithBatchSize:options:completionHandler:")
    public native boolean executeForwardWithBatchSizeOptionsCompletionHandler(@NUInt long batchSize, long options,
            @ObjCBlock(name = "call_executeForwardWithBatchSizeOptionsCompletionHandler") Block_executeForwardWithBatchSizeOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_executeForwardWithBatchSizeOptionsCompletionHandler {
        @Generated
        void call_executeForwardWithBatchSizeOptionsCompletionHandler(MLCTensor resultTensor, NSError error,
                double executionTime);
    }

    /**
     * Execute the forward pass for the training graph
     * 
     * @param batchSize         The batch size to use. For a graph where batch size changes between layers this value
     *                          must be 0.
     * @param options           The execution options
     * @param outputsData       The data objects to use for outputs
     * @param completionHandler The completion handler
     * @return A boolean indicating success or failure
     */
    @Generated
    @Selector("executeForwardWithBatchSize:options:outputsData:completionHandler:")
    public native boolean executeForwardWithBatchSizeOptionsOutputsDataCompletionHandler(@NUInt long batchSize,
            long options, NSDictionary<String, ? extends MLCTensorData> outputsData,
            @ObjCBlock(name = "call_executeForwardWithBatchSizeOptionsOutputsDataCompletionHandler") Block_executeForwardWithBatchSizeOptionsOutputsDataCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_executeForwardWithBatchSizeOptionsOutputsDataCompletionHandler {
        @Generated
        void call_executeForwardWithBatchSizeOptionsOutputsDataCompletionHandler(MLCTensor resultTensor, NSError error,
                double executionTime);
    }

    /**
     * Execute the gradient pass of the training graph
     * 
     * @param batchSize         The batch size to use. For a graph where batch size changes between layers this value
     *                          must be 0.
     * @param options           The execution options
     * @param completionHandler The completion handler
     * @return A boolean indicating success or failure
     */
    @Generated
    @Selector("executeGradientWithBatchSize:options:completionHandler:")
    public native boolean executeGradientWithBatchSizeOptionsCompletionHandler(@NUInt long batchSize, long options,
            @ObjCBlock(name = "call_executeGradientWithBatchSizeOptionsCompletionHandler") Block_executeGradientWithBatchSizeOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_executeGradientWithBatchSizeOptionsCompletionHandler {
        @Generated
        void call_executeGradientWithBatchSizeOptionsCompletionHandler(MLCTensor resultTensor, NSError error,
                double executionTime);
    }

    /**
     * Execute the gradient pass of the training graph
     * 
     * @param batchSize         The batch size to use. For a graph where batch size changes between layers this value
     *                          must be 0.
     * @param options           The execution options
     * @param outputsData       The data objects to use for outputs
     * @param completionHandler The completion handler
     * @return A boolean indicating success or failure
     */
    @Generated
    @Selector("executeGradientWithBatchSize:options:outputsData:completionHandler:")
    public native boolean executeGradientWithBatchSizeOptionsOutputsDataCompletionHandler(@NUInt long batchSize,
            long options, NSDictionary<String, ? extends MLCTensorData> outputsData,
            @ObjCBlock(name = "call_executeGradientWithBatchSizeOptionsOutputsDataCompletionHandler") Block_executeGradientWithBatchSizeOptionsOutputsDataCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_executeGradientWithBatchSizeOptionsOutputsDataCompletionHandler {
        @Generated
        void call_executeGradientWithBatchSizeOptionsOutputsDataCompletionHandler(MLCTensor resultTensor, NSError error,
                double executionTime);
    }

    /**
     * Execute the optimizer update pass of the training graph
     * 
     * @param options           The execution options
     * @param completionHandler The completion handler
     * @return A boolean indicating success or failure
     */
    @Generated
    @Selector("executeOptimizerUpdateWithOptions:completionHandler:")
    public native boolean executeOptimizerUpdateWithOptionsCompletionHandler(long options,
            @ObjCBlock(name = "call_executeOptimizerUpdateWithOptionsCompletionHandler") Block_executeOptimizerUpdateWithOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_executeOptimizerUpdateWithOptionsCompletionHandler {
        @Generated
        void call_executeOptimizerUpdateWithOptionsCompletionHandler(MLCTensor resultTensor, NSError error,
                double executionTime);
    }

    /**
     * Execute the training graph (forward, gradient and optimizer update) with given source and label data
     * 
     * Execute the training graph with given source and label data. If an optimizer is specified, the optimizer update
     * is applied.
     * If MLCExecutionOptionsSynchronous is specified in 'options', this method returns after the graph has been
     * executed.
     * Otherwise, this method returns after the graph has been queued for execution. The completion handler is called
     * after the graph
     * has finished execution.
     * 
     * @param inputsData           The data objects to use for inputs
     * @param lossLabelsData       The data objects to use for loss labels
     * @param lossLabelWeightsData The data objects to use for loss label weights
     * @param batchSize            The batch size to use. For a graph where batch size changes between layers this value
     *                             must be 0.
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
     * Execute the training graph (forward, gradient and optimizer update) with given source and label data
     * 
     * @param inputsData           The data objects to use for inputs
     * @param lossLabelsData       The data objects to use for loss labels
     * @param lossLabelWeightsData The data objects to use for loss label weights
     * @param outputsData          The data objects to use for outputs
     * @param batchSize            The batch size to use. For a graph where batch size changes between layers this value
     *                             must be 0.
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
     * Get the gradient data for a trainable parameter associated with a layer
     * 
     * This can be used to get the gradient data for weights or biases parameters associated with a convolution,
     * fully connected or convolution transpose layer
     * 
     * @param parameter The updatable parameter associated with the layer
     * @param layer     A layer in the training graph. Must be one of the following:
     *                  - MLCConvolutionLayer
     *                  - MLCFullyConnectedLayer
     *                  - MLCBatchNormalizationLayer
     *                  - MLCInstanceNormalizationLayer
     *                  - MLCGroupNormalizationLayer
     *                  - MLCLayerNormalizationLayer
     *                  - MLCEmbeddingLayer
     *                  - MLCMultiheadAttentionLayer
     * @return The gradient data. Will return nil if the layer is marked as not trainable or if
     *         training graph is not executed with separate calls to forward and gradient passes.
     */
    @Generated
    @Selector("gradientDataForParameter:layer:")
    public native NSData gradientDataForParameterLayer(MLCTensor parameter, MLCLayer layer);

    /**
     * Get the gradient tensor for an input tensor
     * 
     * @param input The input tensor
     * @return The gradient tensor
     */
    @Generated
    @Selector("gradientTensorForInput:")
    public native MLCTensor gradientTensorForInput(MLCTensor input);

    @Generated
    @Selector("graph")
    public static native MLCTrainingGraph graph();

    /**
     * Create a training graph
     * 
     * @param graphObjects The layers from these graph objects will be added to the training graph
     * @param lossLayer    The loss layer to use. The loss layer can also be added to the training graph
     *                     using nodeWithLayer:sources:lossLabels
     * @param optimizer    The optimizer to use
     * @return A new training graph object
     */
    @Generated
    @Selector("graphWithGraphObjects:lossLayer:optimizer:")
    public static native MLCTrainingGraph graphWithGraphObjectsLossLayerOptimizer(
            NSArray<? extends MLCGraph> graphObjects, MLCLayer lossLayer, MLCOptimizer optimizer);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MLCTrainingGraph init();

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
     * Link mutiple training graphs
     * 
     * This is used to link subsequent training graphs with first training sub-graph.
     * This method should be used when we have tensors shared by one or more layers in multiple sub-graphs
     * 
     * @param graphs The list of training graphs to link
     * @return A boolean indicating success or failure
     */
    @Generated
    @Selector("linkWithGraphs:")
    public native boolean linkWithGraphs(NSArray<? extends MLCTrainingGraph> graphs);

    @Generated
    @Owned
    @Selector("new")
    public static native MLCTrainingGraph new_objc();

    /**
     * [@property] optimizer
     * 
     * The optimizer to be used with the training graph
     */
    @Generated
    @Selector("optimizer")
    public native MLCOptimizer optimizer();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Get the result gradient tensors for a layer in the training graph
     * 
     * @param layer A layer in the training graph
     * @return A list of tensors
     */
    @Generated
    @Selector("resultGradientTensorsForLayer:")
    public native NSArray<? extends MLCTensor> resultGradientTensorsForLayer(MLCLayer layer);

    /**
     * Set the input tensor parameters that also will be updated by the optimizer
     * 
     * These represent the list of input tensors to be updated when we execute the optimizer update
     * Weights, bias or beta, gamma tensors are not included in this list. MLCompute automatically
     * adds them to the parameter list based on whether the layer is marked as updatable or not.
     * 
     * @param parameters The list of input tensors to be updated by the optimizer
     * @return A boolean indicating success or failure
     */
    @Generated
    @Selector("setTrainingTensorParameters:")
    public native boolean setTrainingTensorParameters(NSArray<? extends MLCTensorParameter> parameters);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Get the source gradient tensors for a layer in the training graph
     * 
     * @param layer A layer in the training graph
     * @return A list of tensors
     */
    @Generated
    @Selector("sourceGradientTensorsForLayer:")
    public native NSArray<? extends MLCTensor> sourceGradientTensorsForLayer(MLCLayer layer);

    /**
     * Add the list of tensors whose contributions are not to be taken when computing gradients during gradient pass
     * 
     * @param tensors The list of tensors
     * @return A boolean indicating success or failure
     */
    @Generated
    @Selector("stopGradientForTensors:")
    public native boolean stopGradientForTensors(NSArray<? extends MLCTensor> tensors);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Synchronize updates (weights/biases from convolution, fully connected and LSTM layers, tensor parameters)
     * from device memory to host memory.
     */
    @Generated
    @Selector("synchronizeUpdates")
    public native void synchronizeUpdates();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
