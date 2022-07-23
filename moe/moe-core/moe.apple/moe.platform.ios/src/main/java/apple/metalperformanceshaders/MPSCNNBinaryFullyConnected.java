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

/**
 * MPSCNNBinaryFullyConnected
 * [@dependency] This depends on Metal.framework
 * <p>
 * The MPSCNNBinaryFullyConnected specifies a fully connected convolution layer with binary weights
 * and optionally binarized input image.
 * See @ref MPSCNNFullyConnected for details on the fully connected layer and
 * MPSCNNBinaryConvolution for binary convolutions.
 * <p>
 * The default padding policy for MPSCNNBinaryConvolution is different from most
 * filters. It uses MPSNNPaddingMethodSizeValidOnly instead of MPSNNPaddingMethodSizeSame.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNBinaryFullyConnected extends MPSCNNBinaryConvolution {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNBinaryFullyConnected(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNBinaryFullyConnected alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNBinaryFullyConnected allocWithZone(VoidPtr zone);

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
    @Selector("init")
    public native MPSCNNBinaryFullyConnected init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNBinaryFullyConnected initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * <p>
     * While the standard NSSecureCoding/NSCoding method
     * -initWithCoder: should work, since the file can't
     * know which device your data is allocated on, we
     * have to guess and may guess incorrectly. To avoid
     * that problem, use initWithCoder:device instead.
     *
     * @param aDecoder The NSCoder subclass with your serialized MPSKernel
     * @param device   The MTLDevice on which to make the MPSKernel
     * @return A new MPSKernel object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNBinaryFullyConnected initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNBinaryFullyConnected initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initializes a binary fully connected kernel with binary weights as well as both pre and post scaling terms.
     *
     * @param device           The MTLDevice on which this MPSCNNBinaryFullyConnected filter will be used
     * @param convolutionData  A pointer to a object that conforms to the MPSCNNConvolutionDataSource protocol.
     *                         The MPSCNNConvolutionDataSource protocol declares the methods that an
     *                         instance of MPSCNNBinaryFullyConnected uses to obtain the weights and the convolution
     *                         descriptor.
     *                         Each entry in the convolutionData:weights array is a 32-bit unsigned integer value
     *                         and each bit represents one filter weight (given in machine byte order).
     *                         The featurechannel indices increase from the least significant bit within the 32-bits.
     *                         The number of entries is =
     *                         ceil( inputFeatureChannels/32.0 ) * outputFeatureChannels * kernelHeight * kernelWidth
     *                         The layout of filter weight is so that it can be reinterpreted as a 4D tensor (array)
     *                         weight[ outputChannels ][ kernelHeight ][ kernelWidth ][ ceil( inputChannels / 32.0 ) ]
     *                         (The ordering of the reduction from 4D tensor to 1D is per C convention. The index based
     *                         on
     *                         inputchannels varies most rapidly, followed by kernelWidth, then kernelHeight and finally
     *                         outputChannels varies least rapidly.)
     * @param outputBiasTerms  A pointer to bias terms to be applied to the convolution output. Each entry is a float
     *                         value.
     *                         The number of entries is = numberOfOutputFeatureMaps. If nil then 0.0 is used for bias.
     *                         The values stored in the pointer are copied in and the array can be freed after this
     *                         function returns.
     * @param outputScaleTerms A pointer to scale terms to be applied to binary convolution results per output feature
     *                         channel.
     *                         Each entry is a float value. The number of entries is = numberOfOutputFeatureMaps. If nil
     *                         then 1.0 is used.
     *                         The values stored in the pointer are copied in and the array can be freed after this
     *                         function returns.
     * @param inputBiasTerms   A pointer to offset terms to be applied to the input before convolution and before input
     *                         scaling.
     *                         Each entry is a float value. The number of entries is 'inputFeatureChannels'. If NULL
     *                         then 0.0 is used for bias.
     *                         The values stored in the pointer are copied in and the array can be freed after this
     *                         function returns.
     * @param inputScaleTerms  A pointer to scale terms to be applied to the input before convolution, but after input
     *                         biasing.
     *                         Each entry is a float value. The number of entries is 'inputFeatureChannels'. If nil then
     *                         1.0 is used.
     *                         The values stored in the pointer are copied in and the array can be freed after this
     *                         function returns.
     * @param type             What kind of binarization strategy is to be used.
     * @param flags            See documentation above and documentation of MPSCNNBinaryConvolutionFlags.
     * @return A valid MPSCNNBinaryFullyConnected object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:convolutionData:outputBiasTerms:outputScaleTerms:inputBiasTerms:inputScaleTerms:type:flags:")
    public native MPSCNNBinaryFullyConnected initWithDeviceConvolutionDataOutputBiasTermsOutputScaleTermsInputBiasTermsInputScaleTermsTypeFlags(
            @Mapped(ObjCObjectMapper.class) MTLDevice device,
            @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource convolutionData, ConstFloatPtr outputBiasTerms,
            ConstFloatPtr outputScaleTerms, ConstFloatPtr inputBiasTerms, ConstFloatPtr inputScaleTerms,
            @NUInt long type, @NUInt long flags);

    /**
     * Initializes a binary fully connected kernel with binary weights and a single scaling term.
     *
     * @param device          The MTLDevice on which this MPSCNNBinaryFullyConnected filter will be used
     * @param convolutionData A pointer to a object that conforms to the MPSCNNConvolutionDataSource protocol.
     *                        The MPSCNNConvolutionDataSource protocol declares the methods that an
     *                        instance of MPSCNNBinaryFullyConnected uses to obtain the weights and bias terms as
     *                        well as the convolution descriptor.
     *                        Each entry in the convolutionData:weights array is a 32-bit unsigned integer value
     *                        and each bit represents one filter weight (given in machine byte order).
     *                        The featurechannel indices increase from the least significant bit within the 32-bits.
     *                        The number of entries is =
     *                        ceil( inputFeatureChannels/32.0 ) * outputFeatureChannels * kernelHeight * kernelWidth
     *                        The layout of filter weight is so that it can be reinterpreted as a 4D tensor (array)
     *                        weight[ outputChannels ][ kernelHeight ][ kernelWidth ][ ceil( inputChannels / 32.0 ) ]
     *                        (The ordering of the reduction from 4D tensor to 1D is per C convention. The index based
     *                        on
     *                        inputchannels varies most rapidly, followed by kernelWidth, then kernelHeight and finally
     *                        outputChannels varies least rapidly.)
     * @param scaleValue      A single floating point value used to scale the entire convolution.
     *                        Each entry is a float value. The number of entries is 'inputFeatureChannels'. If nil then
     *                        1.0 is used.
     * @param type            What kind of binarization strategy is to be used.
     * @param flags           See documentation above and documentation of MPSCNNBinaryConvolutionFlags.
     * @return A valid MPSCNNBinaryFullyConnected object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:convolutionData:scaleValue:type:flags:")
    public native MPSCNNBinaryFullyConnected initWithDeviceConvolutionDataScaleValueTypeFlags(
            @Mapped(ObjCObjectMapper.class) MTLDevice device,
            @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource convolutionData, float scaleValue,
            @NUInt long type, @NUInt long flags);

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
    public static native MPSCNNBinaryFullyConnected new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
