/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metalperformanceshaders.protocol.MPSCNNConvolutionDataSource;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstFloatPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSCNNConvolution
 * [@dependency] This depends on Metal.framework
 * 
 * The MPSCNNConvolution specifies a convolution.
 * The MPSCNNConvolution convolves the input image with a set of filters, each producing one feature map in the output
 * image.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNConvolution extends MPSCNNKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNConvolution(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNConvolution alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNConvolution allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

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
    public static native MPSCNNConvolution new_objc();

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

    /**
     * [@property] groups
     * 
     * Number of groups input and output channels are divided into.
     */
    @Generated
    @Selector("groups")
    @NUInt
    public native long groups();

    @Generated
    @Selector("init")
    public native MPSCNNConvolution init();

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNConvolution initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initializes a convolution kernel
     * WARNING: This API is depreated and will be removed in the future. It cannot be used
     * when training. Also serialization/unserialization wont work for MPSCNNConvolution
     * objects created with this init. Please move onto using initWithDevice:weights:.
     * 
     * @param device                The MTLDevice on which this MPSCNNConvolution filter will be used
     * @param convolutionDescriptor A pointer to a MPSCNNConvolutionDescriptor.
     * @param kernelWeights         A pointer to a weights array. Each entry is a float value. The number of entries is
     *                              =
     *                              inputFeatureChannels * outputFeatureChannels * kernelHeight * kernelWidth
     *                              The layout of filter weight is so that it can be reinterpreted as 4D tensor (array)
     *                              weight[ outputChannels ][ kernelHeight ][ kernelWidth ][ inputChannels / groups ]
     *                              Weights are converted to half float (fp16) internally for best performance.
     * @param biasTerms             A pointer to bias terms to be applied to the convolution output. Each entry is a
     *                              float value.
     *                              The number of entries is = numberOfOutputFeatureMaps
     * @param flags                 Currently unused. Pass MPSCNNConvolutionFlagsNone
     * 
     * @return A valid MPSCNNConvolution object or nil, if failure.
     * 
     *         API-Since: 10.0
     *         Deprecated-Since: 11.0
     */
    @Deprecated
    @Generated
    @Selector("initWithDevice:convolutionDescriptor:kernelWeights:biasTerms:flags:")
    public native MPSCNNConvolution initWithDeviceConvolutionDescriptorKernelWeightsBiasTermsFlags(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, MPSCNNConvolutionDescriptor convolutionDescriptor,
            ConstFloatPtr kernelWeights, ConstFloatPtr biasTerms, @NUInt long flags);

    /**
     * [@property] inputFeatureChannels
     * 
     * The number of feature channels per pixel in the input image.
     */
    @Generated
    @Selector("inputFeatureChannels")
    @NUInt
    public native long inputFeatureChannels();

    /**
     * [@property] neuron
     * 
     * MPSCNNNeuron filter to be applied as part of convolution.
     * Can be nil in wich case no neuron activation fuction is applied.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 11.0
     */
    @Deprecated
    @Generated
    @Selector("neuron")
    public native MPSCNNNeuron neuron();

    /**
     * [@property] outputFeatureChannels
     * 
     * The number of feature channels per pixel in the output image.
     */
    @Generated
    @Selector("outputFeatureChannels")
    @NUInt
    public native long outputFeatureChannels();

    /**
     * Channel multiplier.
     * 
     * For convolution created with MPSCNNDepthWiseConvolutionDescriptor, it is the number of
     * output feature channels for each input channel. See MPSCNNDepthWiseConvolutionDescriptor for more details.
     * Default is 0 which means regular CNN convolution.
     */
    @Generated
    @Selector("channelMultiplier")
    @NUInt
    public native long channelMultiplier();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNConvolution initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * 
     * While the standard NSSecureCoding/NSCoding method
     * -initWithCoder: should work, since the file can't
     * know which device your data is allocated on, we
     * have to guess and may guess incorrectly. To avoid
     * that problem, use initWithCoder:device instead.
     * 
     * @param aDecoder The NSCoder subclass with your serialized MPSKernel
     * @param device   The MTLDevice on which to make the MPSKernel
     * @return A new MPSKernel object, or nil if failure.
     * 
     *         API-Since: 11.0
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNConvolution initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initializes a convolution kernel
     * 
     * @param device  The MTLDevice on which this MPSCNNConvolution filter will be used
     * @param weights A pointer to a object that conforms to the MPSCNNConvolutionDataSource
     *                protocol. The MPSCNNConvolutionDataSource protocol declares the methods that an
     *                instance of MPSCNNConvolution uses to obtain the weights and bias terms
     *                for the CNN convolution filter.
     * 
     * @return A valid MPSCNNConvolution object or nil, if failure.
     * 
     *         API-Since: 11.0
     */
    @Generated
    @Selector("initWithDevice:weights:")
    public native MPSCNNConvolution initWithDeviceWeights(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource weights);

    /**
     * Parameter "a" for the neuron. Default: 1.0f
     * 
     * Please see class description for interpretation of a.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     */
    @Deprecated
    @Generated
    @Selector("neuronParameterA")
    public native float neuronParameterA();

    /**
     * Parameter "b" for the neuron. Default: 1.0f
     * 
     * Please see class description for interpretation of b.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     */
    @Deprecated
    @Generated
    @Selector("neuronParameterB")
    public native float neuronParameterB();

    /**
     * The type of neuron to append to the convolution
     * 
     * Please see class description for a full list. Default is MPSCNNNeuronTypeNone.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     */
    @Deprecated
    @Generated
    @Selector("neuronType")
    public native int neuronType();

    /**
     * [@property] subPixelScaleFactor
     * 
     * Sub pixel scale factor which was passed in as part of MPSCNNConvolutionDescriptor when creating this
     * MPSCNNConvolution object.
     */
    @Generated
    @Selector("subPixelScaleFactor")
    @NUInt
    public native long subPixelScaleFactor();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Precision of accumulator used in convolution.
     * 
     * See MPSNeuralNetworkTypes.h for discussion. Default is MPSNNConvolutionAccumulatorPrecisionOptionFloat.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("accumulatorPrecisionOption")
    @NUInt
    public native long accumulatorPrecisionOption();

    /**
     * [@property] dataSource
     * 
     * dataSource with which convolution object was created
     */
    @Generated
    @Selector("dataSource")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource dataSource();

    /**
     * GPU side export. Enqueue a kernel to export current weights and biases stored in MPSCNNConvoltion's internal
     * buffers into weights and biases MTLBuffer
     * * returned in MPSCNNConvolutionWeightsAndBiasesState.
     * *
     * * @param commandBuffer Metal command buffer on which export kernel is enqueued.
     * * @param resultStateCanBeTemporary If FALSE, state returned will be non-temporary. If TRUE, returned state may or
     * may not be temporary.
     * * @return MPSCNNConvolutionWeightsAndBiasesState containing weights and biases buffer to which weights got
     * exported. This state and be
     * temporary or non-temporary depending on the flag resultStateCanBeTemporary
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("exportWeightsAndBiasesWithCommandBuffer:resultStateCanBeTemporary:")
    public native MPSCNNConvolutionWeightsAndBiasesState exportWeightsAndBiasesWithCommandBufferResultStateCanBeTemporary(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, boolean resultStateCanBeTemporary);

    /**
     * Fused neuron descritor passed in convolution descriptor for fusion with convolution.
     * 
     * Please see class description for interpretation of c.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("fusedNeuronDescriptor")
    public native MPSNNNeuronDescriptor fusedNeuronDescriptor();

    /**
     * Parameter "c" for the neuron. Default: 1.0f
     * 
     * Please see class description for interpretation of c.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     */
    @Deprecated
    @Generated
    @Selector("neuronParameterC")
    public native float neuronParameterC();

    /**
     * CPU side reload. Reload the updated weights and biases from data provider into internal weights and bias buffers.
     * Weights and biases
     * gradients needed for update are obtained from MPSCNNConvolutionGradientState object. Data provider passed in init
     * call is used for this purpose.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("reloadWeightsAndBiasesFromDataSource")
    public native void reloadWeightsAndBiasesFromDataSource();

    /**
     * GPU side reload. Reload the updated weights and biases from update buffer produced by application enqueued metal
     * kernel into internal weights
     * and biases buffer. Weights and biases gradients needed for update are obtained from
     * MPSCNNConvolutionGradientState object's gradientForWeights and gradientForBiases metal buffer.
     * 
     * @param commandBuffer Metal command buffer on which application update kernel was enqueued consuming
     *                      MPSCNNConvolutionGradientState's gradientForWeights and gradientForBiases buffers
     *                      and producing updateBuffer metal buffer.
     * @param state         MPSCNNConvolutionWeightsAndBiasesState containing weights and biases buffers which have
     *                      updated weights produced by application's update kernel.
     *                      The state readcount will be decremented.
     * 
     * 
     *                      API-Since: 11.3
     */
    @Generated
    @Selector("reloadWeightsAndBiasesWithCommandBuffer:state:")
    public native void reloadWeightsAndBiasesWithCommandBufferState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNConvolutionWeightsAndBiasesState state);

    /**
     * Deprecated. dataSource will be ignored.
     * 
     * API-Since: 11.3
     * Deprecated-Since: 12.0
     */
    @Deprecated
    @Generated
    @Selector("reloadWeightsAndBiasesWithDataSource:")
    public native void reloadWeightsAndBiasesWithDataSource(
            @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource dataSource);

    /**
     * Allocate a MPCNNConvolutionGradientSState to hold the results from a -encodeBatchToCommandBuffer... operation
     * 
     * @param sourceImage  The MPSImage consumed by the associated -encode call.
     * @param sourceStates The list of MPSStates consumed by the associated -encode call,
     *                     for a batch size of 1.
     * @return The list of states produced by the -encode call for batch size of 1.
     *         -isResultStateReusedAcrossBatch returns YES for MPSCNNConvolution so same
     *         state is used across entire batch. State object is not reusasable across batches.
     * 
     *         API-Since: 11.3
     */
    @Generated
    @Selector("resultStateForSourceImage:sourceStates:destinationImage:")
    public native MPSCNNConvolutionGradientState resultStateForSourceImageSourceStatesDestinationImage(
            MPSImage sourceImage, NSArray<? extends MPSState> sourceStates, MPSImage destinationImage);

    /**
     * Precision of accumulator used in convolution.
     * 
     * See MPSNeuralNetworkTypes.h for discussion. Default is MPSNNConvolutionAccumulatorPrecisionOptionFloat.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("setAccumulatorPrecisionOption:")
    public native void setAccumulatorPrecisionOption(@NUInt long value);

    /**
     * API-Since: 11.3
     */
    @Generated
    @Selector("temporaryResultStateForCommandBuffer:sourceImage:sourceStates:destinationImage:")
    public native MPSCNNConvolutionGradientState temporaryResultStateForCommandBufferSourceImageSourceStatesDestinationImage(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSImage sourceImage,
            NSArray<? extends MPSState> sourceStates, MPSImage destinationImage);
}
