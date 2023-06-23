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
import apple.metal.protocol.MTLDevice;
import apple.metalperformanceshaders.protocol.MPSCNNConvolutionDataSource;
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
import org.moe.natj.general.ptr.ConstFloatPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSCNNFullyConnected
 * [@dependency] This depends on Metal.framework
 * 
 * The MPSCNNFullyConnected specifies a fully connected convolution layer a.k.a. Inner product
 * layer. A fully connected CNN layer is one where every input channel is connected
 * to every output channel. The kernel width is equal to width of source image
 * and the kernel height is equal to the height of source image. Width and height of the output
 * is 1x1. Thus, it takes a srcW x srcH x Ni MPSCNNImage, convolves it with Weights[No][SrcW][srcH][Ni]
 * and produces a 1 x 1 x No output. The following must be true:
 * [@code]
 * kernelWidth == source.width
 * kernelHeight == source.height
 * clipRect.size.width == 1
 * clipRect.size.height == 1
 * [@endcode]
 * One can think of a fully connected layer as a matrix multiplication that flattens an image into a vector of length
 * srcW*srcH*Ni. The weights are arragned in a matrix of dimension No x (srcW*srcH*Ni) for product output vectors
 * of length No. The strideInPixelsX, strideInPixelsY, and group must be 1. Offset is not applicable and is ignored.
 * Since clipRect is clamped to the destination image bounds, if the destination is 1x1, one doesn't need to set the
 * clipRect.
 * 
 * Note that one can implement an inner product using MPSCNNConvolution by setting
 * [@code]
 * offset = (kernelWidth/2,kernelHeight/2)
 * clipRect.origin = (ox,oy), clipRect.size = (1,1)
 * strideX = strideY = group = 1
 * [@endcode]
 * However, using the MPSCNNFullyConnected for this is better for performance as it lets us choose the most
 * performant method which may not be possible when using a general convolution. For example,
 * we may internally use matrix multiplication or special reduction kernels for a specific platform.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNFullyConnected extends MPSCNNConvolution {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNFullyConnected(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNFullyConnected alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNFullyConnected allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSCNNFullyConnected new_objc();

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
    @Selector("init")
    public native MPSCNNFullyConnected init();

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNFullyConnected initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

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
    public native MPSCNNFullyConnected initWithDeviceConvolutionDescriptorKernelWeightsBiasTermsFlags(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device,
            @NotNull MPSCNNConvolutionDescriptor convolutionDescriptor, @NotNull ConstFloatPtr kernelWeights,
            @Nullable ConstFloatPtr biasTerms, @NUInt long flags);

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNFullyConnected initWithCoder(@NotNull NSCoder aDecoder);

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
    public native MPSCNNFullyConnected initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initializes a fully connected kernel
     * 
     * @param device  The MTLDevice on which this MPSCNNFullyConnected filter will be used
     * @param weights A pointer to a object that conforms to the MPSCNNConvolutionDataSource
     *                protocol. The MPSCNNConvolutionDataSource protocol declares the methods that an
     *                instance of MPSCNNFullyConnected uses to obtain the weights and bias terms
     *                for the CNN fully connected filter.
     * 
     * @return A valid MPSCNNFullyConnected object or nil, if failure.
     * 
     *         API-Since: 11.0
     */
    @Generated
    @Selector("initWithDevice:weights:")
    public native MPSCNNFullyConnected initWithDeviceWeights(@NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device,
            @NotNull @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource weights);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
