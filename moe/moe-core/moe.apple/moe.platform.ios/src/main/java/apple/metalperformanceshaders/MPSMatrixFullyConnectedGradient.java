package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSMatrixFullyConnectedGradient
 * 
 * [@dependency] This depends on Metal.framework.
 * 
 * Computes the gradient of the fully connected layer with respect
 *             to either the weights and bias terms or the input feature vectors.
 * 
 * An MPSMatrixFullyConnectedGradient kernel may be used to compute
 *             the gradients corresponding to a MPSMatrixFullyConnected kernel.
 *             The properties, input, and weight data must match those values
 *             used in the forward computation.
 *             This kernel does not compute the gradient of any non-identity
 *             activation function which may have been applied in the forward
 *             kernel.  Such a kernel must be expressed using both MPSMatrixFullyConnected
 *             and MPSMatrixNeuron if a gradient is to be computed.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSMatrixFullyConnectedGradient extends MPSMatrixBinaryKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSMatrixFullyConnectedGradient(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSMatrixFullyConnectedGradient alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * [@property]   alpha
     * 
     * Scale factor to apply to the product.  This value should be equal
     *             to the corresponding value in the forward fully connected kernel.
     */
    @Generated
    @Selector("alpha")
    public native double alpha();

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
     * Make a copy of this kernel for a new device - @see MPSKernel
     * 
     * @param      zone        The NSZone in which to allocate the object
     * @param      device      The device for the new MPSKernel. If nil, then use
     *                         self.device.
     * @return     A pointer to a copy of this MPSKernel. This will fail, returning
     *             nil if the device is not supported. Devices must be
     *             MTLFeatureSet_iOS_GPUFamily2_v1 or later.
     */
    @Generated
    @Owned
    @Selector("copyWithZone:device:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZoneDevice(VoidPtr zone, @Mapped(ObjCObjectMapper.class) MTLDevice device);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Encode a MPSMatrixFullyConnectedGradient object to a command buffer and
     *             produce the gradient of the loss function with respect to the input data.
     * 
     * This operation computes the resulting gradient of the loss function with respect
     *             to the forward kernel's input data.  weightMatrix should contain the same values
     *             used to compute the result of the forward kernel.
     * 
     * @param      commandBuffer               A valid MTLCommandBuffer to receive the encoded kernel.
     * 
     * @param      gradientMatrix              A valid MPSMatrix object which specifies the input gradient.
     * 
     * @param      weightMatrix                A valid MPSMatrix object which specifies the weight array.
     * 
     * @param      resultGradientForDataMatrix A valid MPSMatrix object which specifies the result gradient.
     */
    @Generated
    @Selector("encodeGradientForDataToCommandBuffer:gradientMatrix:weightMatrix:resultGradientForDataMatrix:")
    public native void encodeGradientForDataToCommandBufferGradientMatrixWeightMatrixResultGradientForDataMatrix(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSMatrix gradientMatrix,
            MPSMatrix weightMatrix, MPSMatrix resultGradientForDataMatrix);

    /**
     * Encode a MPSMatrixFullyConnectedGradient object to a command buffer and
     *             produce the gradient of the loss function with respect to the weight matrix
     *             and bias vector.
     * 
     * This operation computes the resulting gradient of the loss function with respect
     *             to the forward kernel's weight data.  inputMatrix should contain the same values
     *             used to compute the result of the forward kernel.
     * 
     * @param      commandBuffer                   A valid MTLCommandBuffer to receive the encoded kernel.
     * 
     * @param      gradientMatrix                  A valid MPSMatrix object which specifies the input gradient.
     * 
     * @param      inputMatrix                     A valid MPSMatrix object which specifies the input array.
     * 
     * @param      resultGradientForWeightMatrix   A valid MPSMatrix object which specifies the resulting gradients
     *                                             with respect to the weights.
     * 
     * @param      resultGradientForBiasVector     A valid MPSVector object which specifies the resulting gradients
     *                                             with respect to the bias terms.  If NULL these values will not be
     *                                             returned.
     */
    @Generated
    @Selector("encodeGradientForWeightsAndBiasToCommandBuffer:gradientMatrix:inputMatrix:resultGradientForWeightMatrix:resultGradientForBiasVector:")
    public native void encodeGradientForWeightsAndBiasToCommandBufferGradientMatrixInputMatrixResultGradientForWeightMatrixResultGradientForBiasVector(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSMatrix gradientMatrix,
            MPSMatrix inputMatrix, MPSMatrix resultGradientForWeightMatrix, MPSVector resultGradientForBiasVector);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSMatrixFullyConnectedGradient init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSMatrixFullyConnectedGradient initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * 
     * See @ref MPSKernel#initWithCoder.
     * 
     * @param      aDecoder    The NSCoder subclass with your serialized MPSMatrixFullyConnectedGradient
     * @param      device      The MTLDevice on which to make the MPSMatrixFullyConnectedGradient object.
     * @return     A new MPSMatrixFullyConnected object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSMatrixFullyConnectedGradient initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSMatrixFullyConnectedGradient initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property]   alpha
     * 
     * Scale factor to apply to the product.  This value should be equal
     *             to the corresponding value in the forward fully connected kernel.
     */
    @Generated
    @Selector("setAlpha:")
    public native void setAlpha(double value);

    /**
     * [@property]   sourceInputFeatureChannels
     * 
     * The number of feature channels in the input to the forward
     *             fully connected layer.
     *             This is equivalent to the number of columns in the input matrix.
     * 
     *             This value should be equal to the corresponding value in the
     *             forward fully connected kernel.
     */
    @Generated
    @Selector("setSourceInputFeatureChannels:")
    public native void setSourceInputFeatureChannels(@NUInt long value);

    /**
     * [@property]   sourceNumberOfFeatureVectors
     * 
     * The number of input vectors which make up the input array.
     *             This is equivalent to the number of rows in both the input
     *             matrix and the source gradient matrix.
     * 
     *             This value should be equal to the corresponding value in the
     *             forward fully connected kernel.
     */
    @Generated
    @Selector("setSourceNumberOfFeatureVectors:")
    public native void setSourceNumberOfFeatureVectors(@NUInt long value);

    /**
     * [@property]   sourceOutputFeatureChannels
     * 
     * The number of feature channels in the output of the forward
     *             fully connected layer.
     *             This is equivalent to the number of columns in both the weight
     *             matrix and the source gradient matrix.
     * 
     *             This value should be equal to the corresponding value in the
     *             forward fully connected kernel.
     */
    @Generated
    @Selector("setSourceOutputFeatureChannels:")
    public native void setSourceOutputFeatureChannels(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property]   sourceInputFeatureChannels
     * 
     * The number of feature channels in the input to the forward
     *             fully connected layer.
     *             This is equivalent to the number of columns in the input matrix.
     * 
     *             This value should be equal to the corresponding value in the
     *             forward fully connected kernel.
     */
    @Generated
    @Selector("sourceInputFeatureChannels")
    @NUInt
    public native long sourceInputFeatureChannels();

    /**
     * [@property]   sourceNumberOfFeatureVectors
     * 
     * The number of input vectors which make up the input array.
     *             This is equivalent to the number of rows in both the input
     *             matrix and the source gradient matrix.
     * 
     *             This value should be equal to the corresponding value in the
     *             forward fully connected kernel.
     */
    @Generated
    @Selector("sourceNumberOfFeatureVectors")
    @NUInt
    public native long sourceNumberOfFeatureVectors();

    /**
     * [@property]   sourceOutputFeatureChannels
     * 
     * The number of feature channels in the output of the forward
     *             fully connected layer.
     *             This is equivalent to the number of columns in both the weight
     *             matrix and the source gradient matrix.
     * 
     *             This value should be equal to the corresponding value in the
     *             forward fully connected kernel.
     */
    @Generated
    @Selector("sourceOutputFeatureChannels")
    @NUInt
    public native long sourceOutputFeatureChannels();

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