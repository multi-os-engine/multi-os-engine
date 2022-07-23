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
 * MPSCNNBinaryConvolution
 * [@dependency] This depends on Metal.framework
 * <p>
 * The MPSCNNBinaryConvolution specifies a convolution with binary weights and an input image using binary
 * approximations.
 * The MPSCNNBinaryConvolution optionally first binarizes the input image and then convolves the result with a set of
 * binary-valued filters, each producing one feature map in the output image (which is a normal image)
 * <p>
 * The output is computed as follows:
 * <p>
 * out[i, x, y, c] = ( sum_{dx,dy,f} in[i,x+dx, y+dy, f] x B[c,dx,dy,f] )
 * * scale[c] * beta[i,x,y] + bias[c], where
 * <p>
 * the sum over dx,dy is over the spatial filter kernel window defined by 'kernelWidth' and 'KernelHeight',
 * sum over 'f' is over the input feature channel indices within group, 'B' contains the binary weights, interpreted as
 * {-1,1} or { 0, 1 } and scale[c] is the 'outputScaleTerms' array and bias is the 'outputBiasTerms' array. Above 'i' is
 * the image index in batch the sum over input channels 'f' runs through the group indices.
 * <p>
 * The convolution operator 'x' is defined by MPSCNNBinaryConvolutionType passed in at initialization time of the filter
 * (@see initWithDevice).
 * In case 'type' = MPSCNNBinaryConvolutionTypeBinaryWeights, the input image is not binarized at all
 * and the convolution is computed interpreting the weights as [ 0, 1 ] -> { -1, 1 } with the given scaling terms.
 * In case 'type' = MPSCNNBinaryConvolutionTypeXNOR the convolution is computed by first binarizing the input image
 * using the sign function 'bin(x) = x < 0 ? -1 : 1' and the convolution multiplication is done with the
 * XNOR-operator !(x ^ y) = delta_xy = { (x==y) ? 1 : 0 },
 * and scaled according to the optional scaling operations. Note that we output the values of the bitwise convolutions
 * to interval { -1, 1 }, which means that the output of the XNOR-operator is scaled implicitly as follows:
 * r = 2 * ( !(x ^ y) ) - 1 = { -1, 1 }.
 * This means that for a dot-product of two 32-bit words the result is:
 * r = 2 * popcount(!(x ^ y) ) - 32 = 32 - 2 * popcount( x ^ y ) = { -32, -30, ..., 30, 32 }.
 * In case 'type' = MPSCNNBinaryConvolutionTypeAND the convolution is computed by first binarizing the input image
 * using the sign function 'bin(x) = x < 0 ? -1 : 1' and the convolution multiplication is done with the
 * AND-operator (x & y) = delta_xy * delta_x1 = { (x==y==1) ? 1 : 0 }.
 * and scaled according to the optional scaling operations. Note that we output the values of the AND-operation is
 * assumed to lie in { 0, 1 } interval and hence no more implicit scaling takes place.
 * This means that for a dot-product of two 32-bit words the result is:
 * r = popcount(x & y) = { 0, ..., 31, 32 }.
 * <p>
 * The input data can be pre-offset and scaled by providing the 'inputBiasTerms' and 'inputScaleTerms' parameters for
 * the
 * initialization functions and this can be used for example to accomplish batch normalization of the data. The scaling
 * of
 * input values happens before possible beta-image computation.
 * <p>
 * The parameter 'beta' above is an optional image which is used to compute scaling factors for each spatial position
 * and image index.
 * For the XNOR-Net based networks this is computed as follows: beta[i,x,y] = sum_{dx,dy} A[i, x+dx, y+dy] / (kx * ky),
 * where
 * (dx,dy) are summed over the convolution filter window [ -kx/2, (kx-1)/2], [ -ky/2, (ky-1)/2 ] and
 * A[i,x,y] = sum_{c} abs( in[i,x,y,c] ) / Nc, where 'in' is the original input image (in full precision) and Nc is the
 * number of input channels in the input image. Parameter 'beta' is not passed as input and to enable beta-scaling the
 * user can
 * provide 'MPSCNNBinaryConvolutionFlagsUseBetaScaling' in the flags parameter in the initialization functions.
 * <p>
 * Finally the normal activation neuron is applied and the result is written to the output image.
 * <p>
 * NOTE: MPSCNNBinaryConvolution does not currently support groups > 1.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNBinaryConvolution extends MPSCNNKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNBinaryConvolution(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNBinaryConvolution alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNBinaryConvolution allocWithZone(VoidPtr zone);

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
    public native MPSCNNBinaryConvolution init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNBinaryConvolution initWithCoder(NSCoder aDecoder);

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
    public native MPSCNNBinaryConvolution initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNBinaryConvolution initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initializes a binary convolution kernel with binary weights as well as both pre and post scaling terms.
     *
     * @param device           The MTLDevice on which this MPSCNNBinaryConvolution filter will be used
     * @param convolutionData  A pointer to a object that conforms to the MPSCNNConvolutionDataSource protocol.
     *                         The MPSCNNConvolutionDataSource protocol declares the methods that an
     *                         instance of MPSCNNBinaryConvolution uses to obtain the weights and the convolution
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
     * @return A valid MPSCNNBinaryConvolution object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:convolutionData:outputBiasTerms:outputScaleTerms:inputBiasTerms:inputScaleTerms:type:flags:")
    public native MPSCNNBinaryConvolution initWithDeviceConvolutionDataOutputBiasTermsOutputScaleTermsInputBiasTermsInputScaleTermsTypeFlags(
            @Mapped(ObjCObjectMapper.class) MTLDevice device,
            @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource convolutionData, ConstFloatPtr outputBiasTerms,
            ConstFloatPtr outputScaleTerms, ConstFloatPtr inputBiasTerms, ConstFloatPtr inputScaleTerms,
            @NUInt long type, @NUInt long flags);

    /**
     * Initializes a binary convolution kernel with binary weights and a single scaling term.
     *
     * @param device          The MTLDevice on which this MPSCNNBinaryConvolution filter will be used
     * @param convolutionData A pointer to a object that conforms to the MPSCNNConvolutionDataSource protocol.
     *                        The MPSCNNConvolutionDataSource protocol declares the methods that an
     *                        instance of MPSCNNBinaryConvolution uses to obtain the weights and bias terms as
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
     * @param scaleValue      A floating point value used to scale the entire convolution.
     * @param type            What kind of binarization strategy is to be used.
     * @param flags           See documentation above and documentation of MPSCNNBinaryConvolutionFlags.
     * @return A valid MPSCNNBinaryConvolution object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:convolutionData:scaleValue:type:flags:")
    public native MPSCNNBinaryConvolution initWithDeviceConvolutionDataScaleValueTypeFlags(
            @Mapped(ObjCObjectMapper.class) MTLDevice device,
            @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource convolutionData, float scaleValue,
            @NUInt long type, @NUInt long flags);

    @Generated
    @Selector("inputFeatureChannels")
    @NUInt
    public native long inputFeatureChannels();

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
    public static native MPSCNNBinaryConvolution new_objc();

    /**
     * [@property] outputFeatureChannels
     * <p>
     * The number of feature channels per pixel in the output image.
     */
    @Generated
    @Selector("outputFeatureChannels")
    @NUInt
    public native long outputFeatureChannels();

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
