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
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
 * MPSCNNConvolutionDescriptor
 * [@dependency] This depends on Metal.framework
 * <p>
 * The MPSCNNConvolutionDescriptor specifies a convolution descriptor
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNConvolutionDescriptor extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNConvolutionDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNConvolutionDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNConvolutionDescriptor allocWithZone(VoidPtr zone);

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
     * This method is deprecated. Please use neuronType, neuronParameterA and neuronParameterB properites to fuse
     * neuron with convolution.
     *
     * @param kernelWidth           The width of the filter window. Must be > 0. Large values will take a long time.
     * @param kernelHeight          The height of the filter window. Must be > 0. Large values will take a long time.
     * @param inputFeatureChannels  The number of feature channels in the input image. Must be >= 1.
     * @param outputFeatureChannels The number of feature channels in the output image. Must be >= 1.
     * @param neuronFilter          An optional neuron filter that can be applied to the output of convolution.
     * @return A valid MPSCNNConvolutionDescriptor object or nil, if failure.
     */
    @Generated
    @Selector("cnnConvolutionDescriptorWithKernelWidth:kernelHeight:inputFeatureChannels:outputFeatureChannels:neuronFilter:")
    public static native MPSCNNConvolutionDescriptor cnnConvolutionDescriptorWithKernelWidthKernelHeightInputFeatureChannelsOutputFeatureChannelsNeuronFilter(
            @NUInt long kernelWidth, @NUInt long kernelHeight, @NUInt long inputFeatureChannels,
            @NUInt long outputFeatureChannels, MPSCNNNeuron neuronFilter);

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
    public static native MPSCNNConvolutionDescriptor new_objc();

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

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * [@property] groups
     * <p>
     * Number of groups input and output channels are divided into. The default value is 1.
     * Groups lets you reduce the parameterization. If groups is set to n, input is divided into n
     * groups with inputFeatureChannels/n channels in each group. Similarly output is divided into
     * n groups with outputFeatureChannels/n channels in each group. ith group in input is only
     * connected to ith group in output so number of weights (parameters) needed is reduced by factor
     * of n. Both inputFeatureChannels and outputFeatureChannels must be divisible by n and number of
     * channels in each group must be multiple of 4.
     */
    @Generated
    @Selector("groups")
    @NUInt
    public native long groups();

    @Generated
    @Selector("init")
    public native MPSCNNConvolutionDescriptor init();

    /**
     * [@property] inputFeatureChannels
     * <p>
     * The number of feature channels per pixel in the input image.
     */
    @Generated
    @Selector("inputFeatureChannels")
    @NUInt
    public native long inputFeatureChannels();

    /**
     * [@property] kernelHeight
     * <p>
     * The height of the filter window. The default value is 3.
     * Any positive non-zero value is valid, including even values.
     * The position of the top edge of the filter window is given
     * by offset.y - (kernelHeight>>1)
     */
    @Generated
    @Selector("kernelHeight")
    @NUInt
    public native long kernelHeight();

    /**
     * [@property] kernelWidth
     * <p>
     * The width of the filter window. The default value is 3.
     * Any positive non-zero value is valid, including even values.
     * The position of the left edge of the filter window is given
     * by offset.x - (kernelWidth>>1)
     */
    @Generated
    @Selector("kernelWidth")
    @NUInt
    public native long kernelWidth();

    /**
     * [@property] neuron
     * <p>
     * MPSCNNNeuron filter to be applied as part of convolution. This is applied after BatchNormalization in the end.
     * Default is nil.
     * This is deprecated. You dont need to create MPSCNNNeuron object to fuse with convolution. Use neuron properties
     * in this descriptor.
     */
    @Generated
    @Selector("neuron")
    public native MPSCNNNeuron neuron();

    /**
     * [@property] outputFeatureChannels
     * <p>
     * The number of feature channels per pixel in the output image.
     */
    @Generated
    @Selector("outputFeatureChannels")
    @NUInt
    public native long outputFeatureChannels();

    /**
     * [@property] groups
     * <p>
     * Number of groups input and output channels are divided into. The default value is 1.
     * Groups lets you reduce the parameterization. If groups is set to n, input is divided into n
     * groups with inputFeatureChannels/n channels in each group. Similarly output is divided into
     * n groups with outputFeatureChannels/n channels in each group. ith group in input is only
     * connected to ith group in output so number of weights (parameters) needed is reduced by factor
     * of n. Both inputFeatureChannels and outputFeatureChannels must be divisible by n and number of
     * channels in each group must be multiple of 4.
     */
    @Generated
    @Selector("setGroups:")
    public native void setGroups(@NUInt long value);

    /**
     * [@property] inputFeatureChannels
     * <p>
     * The number of feature channels per pixel in the input image.
     */
    @Generated
    @Selector("setInputFeatureChannels:")
    public native void setInputFeatureChannels(@NUInt long value);

    /**
     * [@property] kernelHeight
     * <p>
     * The height of the filter window. The default value is 3.
     * Any positive non-zero value is valid, including even values.
     * The position of the top edge of the filter window is given
     * by offset.y - (kernelHeight>>1)
     */
    @Generated
    @Selector("setKernelHeight:")
    public native void setKernelHeight(@NUInt long value);

    /**
     * [@property] kernelWidth
     * <p>
     * The width of the filter window. The default value is 3.
     * Any positive non-zero value is valid, including even values.
     * The position of the left edge of the filter window is given
     * by offset.x - (kernelWidth>>1)
     */
    @Generated
    @Selector("setKernelWidth:")
    public native void setKernelWidth(@NUInt long value);

    /**
     * [@property] neuron
     * <p>
     * MPSCNNNeuron filter to be applied as part of convolution. This is applied after BatchNormalization in the end.
     * Default is nil.
     * This is deprecated. You dont need to create MPSCNNNeuron object to fuse with convolution. Use neuron properties
     * in this descriptor.
     */
    @Generated
    @Selector("setNeuron:")
    public native void setNeuron(MPSCNNNeuron value);

    /**
     * [@property] outputFeatureChannels
     * <p>
     * The number of feature channels per pixel in the output image.
     */
    @Generated
    @Selector("setOutputFeatureChannels:")
    public native void setOutputFeatureChannels(@NUInt long value);

    /**
     * [@property] strideInPixelsX
     * <p>
     * The output stride (downsampling factor) in the x dimension. The default value is 1.
     */
    @Generated
    @Selector("setStrideInPixelsX:")
    public native void setStrideInPixelsX(@NUInt long value);

    /**
     * [@property] strideInPixelsY
     * <p>
     * The output stride (downsampling factor) in the y dimension. The default value is 1.
     */
    @Generated
    @Selector("setStrideInPixelsY:")
    public native void setStrideInPixelsY(@NUInt long value);

    /**
     * [@property] strideInPixelsX
     * <p>
     * The output stride (downsampling factor) in the x dimension. The default value is 1.
     */
    @Generated
    @Selector("strideInPixelsX")
    @NUInt
    public native long strideInPixelsX();

    /**
     * [@property] strideInPixelsY
     * <p>
     * The output stride (downsampling factor) in the y dimension. The default value is 1.
     */
    @Generated
    @Selector("strideInPixelsY")
    @NUInt
    public native long strideInPixelsY();

    /**
     * Creates a convolution descriptor.
     *
     * @param kernelWidth           The width of the filter window. Must be > 0. Large values will take a long time.
     * @param kernelHeight          The height of the filter window. Must be > 0. Large values will take a long time.
     * @param inputFeatureChannels  The number of feature channels in the input image. Must be >= 1.
     * @param outputFeatureChannels The number of feature channels in the output image. Must be >= 1.
     * @return A valid MPSCNNConvolutionDescriptor object or nil, if failure.
     */
    @Generated
    @Selector("cnnConvolutionDescriptorWithKernelWidth:kernelHeight:inputFeatureChannels:outputFeatureChannels:")
    public static native MPSCNNConvolutionDescriptor cnnConvolutionDescriptorWithKernelWidthKernelHeightInputFeatureChannelsOutputFeatureChannels(
            @NUInt long kernelWidth, @NUInt long kernelHeight, @NUInt long inputFeatureChannels,
            @NUInt long outputFeatureChannels);

    /**
     * [@property] dilationRateX
     * <p>
     * dilationRateX property can be used to implement dilated convolution as described in
     * https://arxiv.org/pdf/1511.07122v3.pdf
     * to aggregate global information in dense prediction problems.
     * Default value is 1. When set to value > 1, original kernel width, kW is dilated to
     * <p>
     * kW_Dilated = (kW-1)*dilationRateX + 1
     * <p>
     * by inserting d-1 zeros between consecutive entries in each row of the original kernel.
     * The kernel is centered based on kW_Dilated.
     */
    @Generated
    @Selector("dilationRateX")
    @NUInt
    public native long dilationRateX();

    /**
     * [@property] dilationRateY
     * <p>
     * dilationRateY property can be used to implement dilated convolution as described in
     * https://arxiv.org/pdf/1511.07122v3.pdf
     * to aggregate global information in dense prediction problems.
     * Default value is 1. When set to value > 1, original kernel height, kH is dilated to
     * <p>
     * kH_Dilated = (kH-1)*dilationRateY + 1
     * <p>
     * by inserting d-1 rows of zeros between consecutive row of the original kernel.
     * The kernel is centered based on kH_Dilated.
     */
    @Generated
    @Selector("dilationRateY")
    @NUInt
    public native long dilationRateY();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNConvolutionDescriptor initWithCoder(NSCoder aDecoder);

    /**
     * Getter funtion for neuronType set using setNeuronType:parameterA:parameterB method
     */
    @Generated
    @Selector("neuronParameterA")
    public native float neuronParameterA();

    /**
     * Getter funtion for neuronType set using setNeuronType:parameterA:parameterB method
     */
    @Generated
    @Selector("neuronParameterB")
    public native float neuronParameterB();

    /**
     * Getter funtion for neuronType set using setNeuronType:parameterA:parameterB method
     */
    @Generated
    @Selector("neuronType")
    public native int neuronType();

    /**
     * Adds batch normalization for inference, it copies all the float arrays provided, expecting
     * outputFeatureChannels elements in each.
     * <p>
     * This method will be used to pass in batch normalization parameters to the convolution during the
     * init call. For inference we modify weights and bias going in convolution or Fully Connected layer to combine
     * and optimize the layers.
     * <p>
     * <p>
     * w: weights for a corresponding output feature channel
     * b: bias for a corresponding output feature channel
     * W: batch normalized weights for a corresponding output feature channel
     * B: batch normalized bias for a corresponding output feature channel
     * <p>
     * <p>
     * I = gamma / sqrt(variance + epsilon), J = beta - ( I * mean )
     * <p>
     * W = w * I
     * B = b * I + J
     * <p>
     * Every convolution has (OutputFeatureChannel * kernelWidth * kernelHeight * InputFeatureChannel) weights
     * <p>
     * I, J are calculated, for every output feature channel separately to get the corresponding weights and bias
     * Thus, I, J are calculated and then used for every (kernelWidth * kernelHeight * InputFeatureChannel)
     * weights, and this is done OutputFeatureChannel number of times for each output channel.
     * <p>
     * thus, internally, batch normalized weights are computed as:
     * <p>
     * W[no][i][j][ni] = w[no][i][j][ni] * I[no]
     * <p>
     * no: index into outputFeatureChannel
     * i : index into kernel Height
     * j : index into kernel Width
     * ni: index into inputFeatureChannel
     * <p>
     * One usually doesn't see a bias term and batch normalization together as batch normalization potentially cancels
     * out the bias term after training, but in MPS if the user provides it, batch normalization will use the above
     * formula to incorporate it, if user does not have bias terms then put a float array of zeroes in the convolution
     * init for bias terms of each output feature channel.
     * <p>
     * <p>
     * this comes from:
     * https://arxiv.org/pdf/1502.03167v3.pdf
     * <p>
     * Note: in certain cases the batch normalization parameters will be cached by the MPSNNGraph
     * or the MPSCNNConvolution. If the batch normalization parameters change after either is made,
     * behavior is undefined.
     *
     * @param mean     Pointer to an array of floats of mean for each output feature channel
     * @param variance Pointer to an array of floats of variance for each output feature channel
     * @param gamma    Pointer to an array of floats of gamma for each output feature channel
     * @param beta     Pointer to an array of floats of beta for each output feature channel
     * @param epsilon  A small float value used to have numerical stability in the code
     */
    @Generated
    @Selector("setBatchNormalizationParametersForInferenceWithMean:variance:gamma:beta:epsilon:")
    public native void setBatchNormalizationParametersForInferenceWithMeanVarianceGammaBetaEpsilon(ConstFloatPtr mean,
            ConstFloatPtr variance, ConstFloatPtr gamma, ConstFloatPtr beta, float epsilon);

    /**
     * [@property] dilationRateX
     * <p>
     * dilationRateX property can be used to implement dilated convolution as described in
     * https://arxiv.org/pdf/1511.07122v3.pdf
     * to aggregate global information in dense prediction problems.
     * Default value is 1. When set to value > 1, original kernel width, kW is dilated to
     * <p>
     * kW_Dilated = (kW-1)*dilationRateX + 1
     * <p>
     * by inserting d-1 zeros between consecutive entries in each row of the original kernel.
     * The kernel is centered based on kW_Dilated.
     */
    @Generated
    @Selector("setDilationRateX:")
    public native void setDilationRateX(@NUInt long value);

    /**
     * [@property] dilationRateY
     * <p>
     * dilationRateY property can be used to implement dilated convolution as described in
     * https://arxiv.org/pdf/1511.07122v3.pdf
     * to aggregate global information in dense prediction problems.
     * Default value is 1. When set to value > 1, original kernel height, kH is dilated to
     * <p>
     * kH_Dilated = (kH-1)*dilationRateY + 1
     * <p>
     * by inserting d-1 rows of zeros between consecutive row of the original kernel.
     * The kernel is centered based on kH_Dilated.
     */
    @Generated
    @Selector("setDilationRateY:")
    public native void setDilationRateY(@NUInt long value);

    /**
     * Add per-channel neuron parameters A for PReLu neuron activation functions.
     * <p>
     * This method sets the neuron to PReLU, zeros parameters A and B and sets the per-channel
     * neuron parameters A to an array containing a unique value of A for each output feature
     * channel.
     * <p>
     * If the neuron function is f(v,a,b), it will apply
     * <p>
     * OutputImage(x,y,i) = f( ConvolutionResult(x,y,i), A[i], B[i] ) where i in [0,outputFeatureChannels-1]
     * <p>
     * See https://arxiv.org/pdf/1502.01852.pdf for details.
     * <p>
     * All other neuron types, where parameter A
     * and parameter B are shared across channels must be set using
     * -setNeuronOfType:parameterA:parameterB:
     * <p>
     * If batch normalization parameters are set, batch normalization will occur before
     * neuron application i.e. output of convolution is first batch normalized followed
     * by neuron activation. This function automatically sets neuronType to MPSCNNNeuronTypePReLU.
     * <p>
     * Note: in certain cases the neuron descriptor will be cached by the MPSNNGraph or the
     * MPSCNNConvolution. If the neuron type changes after either is made, behavior is undefined.
     *
     * @param A An array containing per-channel float values for neuron parameter A.
     *          Number of entries must be equal to outputFeatureChannels.
     */
    @Generated
    @Selector("setNeuronToPReLUWithParametersA:")
    public native void setNeuronToPReLUWithParametersA(NSData A);

    /**
     * Adds a neuron activation function to convolution descriptor.
     * <p>
     * This mathod can be used to add a neuron activation funtion of given type with
     * associated scalar parameters A and B that are shared across all output channels.
     * Neuron activation fucntion is applied to output of convolution. This is a per-pixel
     * operation that is fused with convolution kernel itself for best performance.
     * Note that this method can only be used to fuse neuron of kind for which parameters
     * A and B are shared across all channels of convoution output. It is an error to call
     * this method for neuron activation functions like MPSCNNNeuronTypePReLU,
     * which require per-channel parameter values. For those kind of neuron activation functions,
     * use appropriate setter functions.
     * <p>
     * Note: in certain cases, the neuron descriptor will be cached by the MPSNNGraph or the
     * MPSCNNConvolution. If the neuron type changes after either is made, behavior is undefined.
     *
     * @param neuronType type of neuron activation function. For full list see MPSCNNNeuronType.h
     * @param parameterA parameterA of neuron activation that is shared across all channels of convolution output.
     * @param parameterB parameterB of neuron activation that is shared across all channels of convolution output.
     */
    @Generated
    @Selector("setNeuronType:parameterA:parameterB:")
    public native void setNeuronTypeParameterAParameterB(int neuronType, float parameterA, float parameterB);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] fusedNeuronDescriptor
     * <p>
     * This mathod can be used to add a neuron activation funtion of given type with
     * associated scalar parameters A and B that are shared across all output channels.
     * Neuron activation fucntion is applied to output of convolution. This is a per-pixel
     * operation that is fused with convolution kernel itself for best performance.
     * Note that this method can only be used to fuse neuron of kind for which parameters
     * A and B are shared across all channels of convoution output. It is an error to call
     * this method for neuron activation functions like MPSCNNNeuronTypePReLU,
     * which require per-channel parameter values. For those kind of neuron activation functions,
     * use appropriate setter functions. Default is descriptor with neuronType MPSCNNNeuronTypeNone.
     * <p>
     * Note: in certain cases the neuron descriptor will be cached by the MPSNNGraph or the
     * MPSCNNConvolution. If the neuron type changes after either is made, behavior is undefined.
     */
    @Generated
    @Selector("fusedNeuronDescriptor")
    public native MPSNNNeuronDescriptor fusedNeuronDescriptor();

    /**
     * [@property] fusedNeuronDescriptor
     * <p>
     * This mathod can be used to add a neuron activation funtion of given type with
     * associated scalar parameters A and B that are shared across all output channels.
     * Neuron activation fucntion is applied to output of convolution. This is a per-pixel
     * operation that is fused with convolution kernel itself for best performance.
     * Note that this method can only be used to fuse neuron of kind for which parameters
     * A and B are shared across all channels of convoution output. It is an error to call
     * this method for neuron activation functions like MPSCNNNeuronTypePReLU,
     * which require per-channel parameter values. For those kind of neuron activation functions,
     * use appropriate setter functions. Default is descriptor with neuronType MPSCNNNeuronTypeNone.
     * <p>
     * Note: in certain cases the neuron descriptor will be cached by the MPSNNGraph or the
     * MPSCNNConvolution. If the neuron type changes after either is made, behavior is undefined.
     */
    @Generated
    @Selector("setFusedNeuronDescriptor:")
    public native void setFusedNeuronDescriptor(MPSNNNeuronDescriptor value);
}
