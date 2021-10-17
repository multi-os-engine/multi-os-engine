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

/**
 * MLCLSTMLayer
 * <p>
 * A LSTM layer
 * <p>
 * The hidden and cell state for inputs and outputs have a layout of [numberOfLayers, numberOfDirections, batchSize, hiddenSize].
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

    @Generated
    @Selector("allocWithZone:")
    public static native MLCLSTMLayer allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * [@property]   biases
     * <p>
     * The array of tensors describing the bias terms for the input, hidden, cell and output gates
     */
    @Generated
    @Selector("biases")
    public native NSArray<? extends MLCTensor> biases();

    /**
     * [@property]   biasesParameters
     * <p>
     * The bias tensor parameter used for optimizer update
     */
    @Generated
    @Selector("biasesParameters")
    public native NSArray<? extends MLCTensorParameter> biasesParameters();

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
     * [@property]   descriptor
     * <p>
     * The LSTM descriptor
     */
    @Generated
    @Selector("descriptor")
    public native MLCLSTMDescriptor descriptor();

    /**
     * [@property]   gateActivations
     * <p>
     * The array of gate activations for input, hidden, cell and output gates
     * <p>
     * The default gate activations are: sigmoid, sigmoid, tanh, sigmoid
     */
    @Generated
    @Selector("gateActivations")
    public native NSArray<? extends MLCActivationDescriptor> gateActivations();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * [@property]   hiddenWeights
     * <p>
     * The array of tensors describing the hidden weights for the input, hidden, cell and output gates
     */
    @Generated
    @Selector("hiddenWeights")
    public native NSArray<? extends MLCTensor> hiddenWeights();

    /**
     * [@property]   hiddenWeightsParameters
     * <p>
     * The hidden weights tensor parameters used for optimizer update
     */
    @Generated
    @Selector("hiddenWeightsParameters")
    public native NSArray<? extends MLCTensorParameter> hiddenWeightsParameters();

    @Generated
    @Selector("init")
    public native MLCLSTMLayer init();

    /**
     * [@property]   inputWeights
     * <p>
     * The array of tensors describing the input weights for the input, hidden, cell and output gates
     */
    @Generated
    @Selector("inputWeights")
    public native NSArray<? extends MLCTensor> inputWeights();

    /**
     * [@property]   inputWeightsParameters
     * <p>
     * The input weights tensor parameters used for optimizer update
     */
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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

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
    public static native MLCLSTMLayer layerWithDescriptorInputWeightsHiddenWeightsBiases(MLCLSTMDescriptor descriptor,
            NSArray<? extends MLCTensor> inputWeights, NSArray<? extends MLCTensor> hiddenWeights,
            NSArray<? extends MLCTensor> biases);

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
            MLCLSTMDescriptor descriptor, NSArray<? extends MLCTensor> inputWeights,
            NSArray<? extends MLCTensor> hiddenWeights, NSArray<? extends MLCTensor> peepholeWeights,
            NSArray<? extends MLCTensor> biases);

    /**
     * Create a LSTM layer
     *
     * @param descriptor             The LSTM descriptor
     * @param inputWeights           An array of (layerCount * 4) tensors describing the input weights for the
     *                               input, hidden, cell and output gates for layer0, layer1.. layer(n-1) for layerCount=n.
     *                               For bidirectional LSTM, the forward time weights for all stacked layers will come first followed by backward time weights
     * @param hiddenWeights          An array of (layerCount * 4) tensors describing the hidden weights for the
     *                               input, hidden, cell and output gates for layer0, layer1.. layer(n-1) for layerCount=n.
     *                               For bidirectional LSTM, the forward time weights for all stacked layers will come first followed by backward time weights
     * @param peepholeWeights        An array of (layerCount * 4) tensors describing the peephole weights for the
     *                               input, hidden, cell and output gates for layer0, layer1.. layer(n-1) for layerCount=n.
     * @param biases                 An array of (layerCount * 4) tensors describing the input weights for the
     *                               input, hidden, cell and output gates for layer0, layer1.. layer(n-1) for layerCount=n.
     *                               For bidirectional LSTM, the forward time bias terms for all stacked layers will come first followed by backward time bias terms
     * @param gateActivations        An array of 4 neuron descriptors for the input, hidden, cell and output gate activations.
     * @param outputResultActivation The neuron descriptor used for the activation function applied to output result.  Default is tanh.
     * @return A new  LSTM layer.
     */
    @Generated
    @Selector("layerWithDescriptor:inputWeights:hiddenWeights:peepholeWeights:biases:gateActivations:outputResultActivation:")
    public static native MLCLSTMLayer layerWithDescriptorInputWeightsHiddenWeightsPeepholeWeightsBiasesGateActivationsOutputResultActivation(
            MLCLSTMDescriptor descriptor, NSArray<? extends MLCTensor> inputWeights,
            NSArray<? extends MLCTensor> hiddenWeights, NSArray<? extends MLCTensor> peepholeWeights,
            NSArray<? extends MLCTensor> biases, NSArray<? extends MLCActivationDescriptor> gateActivations,
            MLCActivationDescriptor outputResultActivation);

    @Generated
    @Owned
    @Selector("new")
    public static native MLCLSTMLayer new_objc();

    /**
     * [@property]   outputResultActivation
     * <p>
     * The output activation descriptor
     */
    @Generated
    @Selector("outputResultActivation")
    public native MLCActivationDescriptor outputResultActivation();

    /**
     * [@property]   peepholeWeights
     * <p>
     * The array of tensors describing the peephole weights for the input, hidden, cell and output gates
     */
    @Generated
    @Selector("peepholeWeights")
    public native NSArray<? extends MLCTensor> peepholeWeights();

    /**
     * [@property]   peepholeWeightsParameters
     * <p>
     * The peephole weights tensor parameters used for optimizer update
     */
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
    public static native boolean supportsDataTypeOnDevice(int dataType, MLCDevice device);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
