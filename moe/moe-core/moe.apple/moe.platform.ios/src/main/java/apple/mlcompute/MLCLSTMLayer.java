package apple.mlcompute;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MLCLSTMLayer
 * 
 * A LSTM layer
 * 
 * The hidden and cell state for inputs and outputs have a layout of [numberOfLayers, numberOfDirections, batchSize,
 * hiddenSize].
 * 
 * API-Since: 14.0
 */
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCLSTMLayer extends MLCLayer {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCLSTMLayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCLSTMLayer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLCLSTMLayer allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * [@property] biases
     * 
     * The array of tensors describing the bias terms for the input, hidden, cell and output gates
     */
    @Nullable
    @Generated
    @Selector("biases")
    public native NSArray<? extends MLCTensor> biases();

    /**
     * [@property] biasesParameters
     * 
     * The bias tensor parameter used for optimizer update
     */
    @Nullable
    @Generated
    @Selector("biasesParameters")
    public native NSArray<? extends MLCTensorParameter> biasesParameters();

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
     * [@property] descriptor
     * 
     * The LSTM descriptor
     */
    @NotNull
    @Generated
    @Selector("descriptor")
    public native MLCLSTMDescriptor descriptor();

    /**
     * [@property] gateActivations
     * 
     * The array of gate activations for input, hidden, cell and output gates
     * 
     * The default gate activations are: sigmoid, sigmoid, tanh, sigmoid
     */
    @NotNull
    @Generated
    @Selector("gateActivations")
    public native NSArray<? extends MLCActivationDescriptor> gateActivations();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * [@property] hiddenWeights
     * 
     * The array of tensors describing the hidden weights for the input, hidden, cell and output gates
     */
    @NotNull
    @Generated
    @Selector("hiddenWeights")
    public native NSArray<? extends MLCTensor> hiddenWeights();

    /**
     * [@property] hiddenWeightsParameters
     * 
     * The hidden weights tensor parameters used for optimizer update
     */
    @NotNull
    @Generated
    @Selector("hiddenWeightsParameters")
    public native NSArray<? extends MLCTensorParameter> hiddenWeightsParameters();

    @Generated
    @Selector("init")
    public native MLCLSTMLayer init();

    /**
     * [@property] inputWeights
     * 
     * The array of tensors describing the input weights for the input, hidden, cell and output gates
     */
    @NotNull
    @Generated
    @Selector("inputWeights")
    public native NSArray<? extends MLCTensor> inputWeights();

    /**
     * [@property] inputWeightsParameters
     * 
     * The input weights tensor parameters used for optimizer update
     */
    @NotNull
    @Generated
    @Selector("inputWeightsParameters")
    public native NSArray<? extends MLCTensorParameter> inputWeightsParameters();

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

    /**
     * Create a LSTM layer
     * 
     * @param descriptor    The LSTM descriptor
     * @param inputWeights  An array of (layerCount * 4) tensors describing the input weights for the
     *                      input, hidden, cell and output gates for layer0, layer1.. layer(n-1) for layerCount=n.
     * @param hiddenWeights An array of (layerCount * 4) tensors describing the hidden weights for the
     *                      input, hidden, cell and output gates for layer0, layer1.. layer(n-1) for layerCount=n.
     * @return A new LSTM layer.
     */
    @Generated
    @Selector("layerWithDescriptor:inputWeights:hiddenWeights:biases:")
    public static native MLCLSTMLayer layerWithDescriptorInputWeightsHiddenWeightsBiases(
            @NotNull MLCLSTMDescriptor descriptor, @NotNull NSArray<? extends MLCTensor> inputWeights,
            @NotNull NSArray<? extends MLCTensor> hiddenWeights, @Nullable NSArray<? extends MLCTensor> biases);

    /**
     * Create a LSTM layer
     * 
     * @param descriptor      The LSTM descriptor
     * @param inputWeights    An array of (layerCount * 4) tensors describing the input weights for the
     *                        input, hidden, cell and output gates for layer0, layer1.. layer(n-1) for layerCount=n.
     * @param hiddenWeights   An array of (layerCount * 4) tensors describing the hidden weights for the
     *                        input, hidden, cell and output gates for layer0, layer1.. layer(n-1) for layerCount=n.
     * @param peepholeWeights An array of (layerCount * 4) tensors describing the peephole weights for the
     *                        input, hidden, cell and output gates for layer0, layer1.. layer(n-1) for layerCount=n.
     * @return A new LSTM layer.
     */
    @Generated
    @Selector("layerWithDescriptor:inputWeights:hiddenWeights:peepholeWeights:biases:")
    public static native MLCLSTMLayer layerWithDescriptorInputWeightsHiddenWeightsPeepholeWeightsBiases(
            @NotNull MLCLSTMDescriptor descriptor, @NotNull NSArray<? extends MLCTensor> inputWeights,
            @NotNull NSArray<? extends MLCTensor> hiddenWeights, @Nullable NSArray<? extends MLCTensor> peepholeWeights,
            @Nullable NSArray<? extends MLCTensor> biases);

    /**
     * Create a LSTM layer
     * 
     * @param descriptor             The LSTM descriptor
     * @param inputWeights           An array of (layerCount * 4) tensors describing the input weights for the
     *                               input, hidden, cell and output gates for layer0, layer1.. layer(n-1) for
     *                               layerCount=n.
     *                               For bidirectional LSTM, the forward time weights for all stacked layers will come
     *                               first followed by backward time weights
     * @param hiddenWeights          An array of (layerCount * 4) tensors describing the hidden weights for the
     *                               input, hidden, cell and output gates for layer0, layer1.. layer(n-1) for
     *                               layerCount=n.
     *                               For bidirectional LSTM, the forward time weights for all stacked layers will come
     *                               first followed by backward time weights
     * @param peepholeWeights        An array of (layerCount * 4) tensors describing the peephole weights for the
     *                               input, hidden, cell and output gates for layer0, layer1.. layer(n-1) for
     *                               layerCount=n.
     * @param biases                 An array of (layerCount * 4) tensors describing the input weights for the
     *                               input, hidden, cell and output gates for layer0, layer1.. layer(n-1) for
     *                               layerCount=n.
     *                               For bidirectional LSTM, the forward time bias terms for all stacked layers will
     *                               come first followed by backward time bias terms
     * @param gateActivations        An array of 4 neuron descriptors for the input, hidden, cell and output gate
     *                               activations.
     * @param outputResultActivation The neuron descriptor used for the activation function applied to output result.
     *                               Default is tanh.
     * @return A new LSTM layer.
     */
    @Generated
    @Selector("layerWithDescriptor:inputWeights:hiddenWeights:peepholeWeights:biases:gateActivations:outputResultActivation:")
    public static native MLCLSTMLayer layerWithDescriptorInputWeightsHiddenWeightsPeepholeWeightsBiasesGateActivationsOutputResultActivation(
            @NotNull MLCLSTMDescriptor descriptor, @NotNull NSArray<? extends MLCTensor> inputWeights,
            @NotNull NSArray<? extends MLCTensor> hiddenWeights, @Nullable NSArray<? extends MLCTensor> peepholeWeights,
            @Nullable NSArray<? extends MLCTensor> biases,
            @NotNull NSArray<? extends MLCActivationDescriptor> gateActivations,
            @NotNull MLCActivationDescriptor outputResultActivation);

    @Generated
    @Owned
    @Selector("new")
    public static native MLCLSTMLayer new_objc();

    /**
     * [@property] outputResultActivation
     * 
     * The output activation descriptor
     */
    @NotNull
    @Generated
    @Selector("outputResultActivation")
    public native MLCActivationDescriptor outputResultActivation();

    /**
     * [@property] peepholeWeights
     * 
     * The array of tensors describing the peephole weights for the input, hidden, cell and output gates
     */
    @Nullable
    @Generated
    @Selector("peepholeWeights")
    public native NSArray<? extends MLCTensor> peepholeWeights();

    /**
     * [@property] peepholeWeightsParameters
     * 
     * The peephole weights tensor parameters used for optimizer update
     */
    @Nullable
    @Generated
    @Selector("peepholeWeightsParameters")
    public native NSArray<? extends MLCTensorParameter> peepholeWeightsParameters();

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
    @Selector("supportsDataType:onDevice:")
    public static native boolean supportsDataTypeOnDevice(int dataType, @NotNull MLCDevice device);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
