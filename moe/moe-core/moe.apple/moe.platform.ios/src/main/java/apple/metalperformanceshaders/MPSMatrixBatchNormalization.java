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
 * MPSMatrixBatchNormalization
 * 
 * [@dependency] This depends on Metal.framework.
 * 
 * Applies a batch normalization to a matrix.
 * 
 * A MPSMatrixBatchNormalization object computes the batch normalization
 *             of a collection of feature vectors stored in an MPSMatrix.
 * 
 *             Feature vectors are stored in a row of the supplied input matrix and the
 *             normalization is performed along columns:
 * 
 *                 y[i,j] = gamma[j] * (x[i,j] - mean(x[:,j])) / (variance(x[:,j]) + epsilon) + beta[j]
 * 
 *             where gamma and beta are supplied weight and bias factors and epsilon is a small value added
 *             to the variance.
 * 
 *             Optionally a neuron activation function may be applied to the result.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSMatrixBatchNormalization extends MPSMatrixUnaryKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSMatrixBatchNormalization(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSMatrixBatchNormalization alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
     * [@property]   computeStatistics
     * 
     * If YES the batch statistics will be computed prior to performing the normalization.
     *             Otherwise the provided statistics will be used.  Defaults to NO at initialization
     *             time.
     */
    @Generated
    @Selector("computeStatistics")
    public native boolean computeStatistics();

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
     * Encode a MPSMatrixBatchNormalization object to a command buffer.
     * 
     * Encodes the operation to the specified command buffer.  resultMatrix
     *             must be large enough to hold a
     *                 MIN(sourceNumberOfFeatureVectors, inputMatrix.rows - sourceMatrixOrigin.x)
     *                 x
     *                 MIN(inputMatrix.columns - sourceMatrixOrigin.y, sourceInputFeatureChannels) array.
     * 
     *             Let numChannels = MIN(inputMatrix.columns - sourceMatrixOrigin.y, sourceInputFeatureChannels)
     * 
     *             The gamma, beta, mean, and variance vectors must contain at least numChannels elements.
     * 
     * @param      commandBuffer       A valid MTLCommandBuffer to receive the encoded kernel.
     * 
     * @param      inputMatrix         A valid MPSMatrix object which specifies the input array.
     * 
     * @param      meanVector          A valid MPSVector object containing batch mean values to be used
     *                                 to normalize the inputs if computeStatistics is NO.  If
     *                                 computeStatistics is YES the resulting batch mean values
     *                                 will be returned in this array.
     * 
     * @param      varianceVector      A valid MPSVector object containing batch variance values to be used
     *                                 to normalize the inputs if computeStatistics is NO.  If
     *                                 computeStatistics is YES the resulting batch variance values
     *                                 will be returned in this array.
     * 
     * @param      gammaVector         A valid MPSVector object which specifies the gamma terms, or
     *                                 a null object to indicate that no scaling is to be applied.
     * 
     * @param      betaVector          A valid MPSVector object which specifies the beta terms, or
     *                                 a null object to indicate that no values are to be added.
     * 
     * @param      resultMatrix        A valid MPSMatrix object which specifies the output array.
     */
    @Generated
    @Selector("encodeToCommandBuffer:inputMatrix:meanVector:varianceVector:gammaVector:betaVector:resultMatrix:")
    public native void encodeToCommandBufferInputMatrixMeanVectorVarianceVectorGammaVectorBetaVectorResultMatrix(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSMatrix inputMatrix, MPSVector meanVector,
            MPSVector varianceVector, MPSVector gammaVector, MPSVector betaVector, MPSMatrix resultMatrix);

    /**
     * [@property]   epsilon
     * 
     * A small value to add to the variance when normalizing the inputs.  Defaults
     *             to FLT_MIN upon initialization.
     */
    @Generated
    @Selector("epsilon")
    public native float epsilon();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSMatrixBatchNormalization init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSMatrixBatchNormalization initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * 
     * See @ref MPSKernel#initWithCoder.
     * 
     * @param      aDecoder    The NSCoder subclass with your serialized MPSMatrixBatchNormalization object.
     * @param      device      The MTLDevice on which to make the MPSMatrixBatchNormalization object.
     * @return     A new MPSMatrixBatchNormalization object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSMatrixBatchNormalization initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSMatrixBatchNormalization initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

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
     * Getter funtion for neuronType set using setNeuronType:parameterA:parameterB:parameterC method
     */
    @Generated
    @Selector("neuronParameterA")
    public native float neuronParameterA();

    /**
     * Getter funtion for neuronType set using setNeuronType:parameterA:parameterB:parameterC method
     */
    @Generated
    @Selector("neuronParameterB")
    public native float neuronParameterB();

    /**
     * Getter funtion for neuronType set using setNeuronType:parameterA:parameterB:parameterC method
     */
    @Generated
    @Selector("neuronParameterC")
    public native float neuronParameterC();

    /**
     * Getter funtion for neuronType set using setNeuronType:parameterA:parameterB:parameterC method
     */
    @Generated
    @Selector("neuronType")
    public native int neuronType();

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
     * [@property]   computeStatistics
     * 
     * If YES the batch statistics will be computed prior to performing the normalization.
     *             Otherwise the provided statistics will be used.  Defaults to NO at initialization
     *             time.
     */
    @Generated
    @Selector("setComputeStatistics:")
    public native void setComputeStatistics(boolean value);

    /**
     * [@property]   epsilon
     * 
     * A small value to add to the variance when normalizing the inputs.  Defaults
     *             to FLT_MIN upon initialization.
     */
    @Generated
    @Selector("setEpsilon:")
    public native void setEpsilon(float value);

    /**
     * Specifies a neuron activation function to be used.
     * 
     * This method can be used to add a neuron activation funtion of given type with
     *             associated scalar parameters A, B, and C that are shared across all output values.
     *             Note that this method can only be used to specify neurons which are specified by three (or fewer)
     *             parameters shared across all output values (or channels, in CNN nomenclature). It is an error to call
     *             this method for neuron activation functions like MPSCNNNeuronTypePReLU,
     *             which require per-channel parameter values.  An MPSMatrixNeuron kernel is initialized
     *             with a default neuron function of MPSCNNNeuronTypeNone.
     * 
     * @param      neuronType      Type of neuron activation function. For full list see MPSCNNNeuronType.h
     * @param      parameterA      parameterA of neuron activation that is shared across all output values.
     * @param      parameterB      parameterB of neuron activation that is shared across all output values.
     * @param      parameterC      parameterC of neuron activation that is shared across all output values.
     */
    @Generated
    @Selector("setNeuronType:parameterA:parameterB:parameterC:")
    public native void setNeuronTypeParameterAParameterBParameterC(int neuronType, float parameterA, float parameterB,
            float parameterC);

    /**
     * [@property]   sourceInputFeatureChannels
     * 
     * The input size to to use in the operation.  This is equivalent to the
     *             number of columns in the primary (input array) source matrix to consider
     *             and the number of channels to produce for the output matrix.
     *             This property is modifiable and defaults to NSUIntegerMax.  At encode
     *             time the larger of this property or the available input size is used.
     *             The value of NSUIntegerMax thus indicates that all available columns in
     *             the input array (beginning at sourceMatrixOrigin.y) should be considered.
     *             Defines also the number of output feature channels.
     *             Note: The value used in the operation will be
     *             MIN(inputMatrix.columns - sourceMatrixOrigin.y, sourceInputFeatureChannels)
     */
    @Generated
    @Selector("setSourceInputFeatureChannels:")
    public native void setSourceInputFeatureChannels(@NUInt long value);

    /**
     * [@property]   sourceNumberOfFeatureVectors
     * 
     * The number of input vectors which make up the input array.  This
     *             is equivalent to the number of rows to consider from the primary
     *             source matrix.
     *             This property is modifiable and defaults to NSUIntegerMax.  At encode
     *             time the larger of this property or the available number of inputs is
     *             used.  The value of NSUIntegerMax thus indicates that all available input
     *             rows (beginning at sourceMatrixOrigin.x) should be considered.
     */
    @Generated
    @Selector("setSourceNumberOfFeatureVectors:")
    public native void setSourceNumberOfFeatureVectors(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property]   sourceInputFeatureChannels
     * 
     * The input size to to use in the operation.  This is equivalent to the
     *             number of columns in the primary (input array) source matrix to consider
     *             and the number of channels to produce for the output matrix.
     *             This property is modifiable and defaults to NSUIntegerMax.  At encode
     *             time the larger of this property or the available input size is used.
     *             The value of NSUIntegerMax thus indicates that all available columns in
     *             the input array (beginning at sourceMatrixOrigin.y) should be considered.
     *             Defines also the number of output feature channels.
     *             Note: The value used in the operation will be
     *             MIN(inputMatrix.columns - sourceMatrixOrigin.y, sourceInputFeatureChannels)
     */
    @Generated
    @Selector("sourceInputFeatureChannels")
    @NUInt
    public native long sourceInputFeatureChannels();

    /**
     * [@property]   sourceNumberOfFeatureVectors
     * 
     * The number of input vectors which make up the input array.  This
     *             is equivalent to the number of rows to consider from the primary
     *             source matrix.
     *             This property is modifiable and defaults to NSUIntegerMax.  At encode
     *             time the larger of this property or the available number of inputs is
     *             used.  The value of NSUIntegerMax thus indicates that all available input
     *             rows (beginning at sourceMatrixOrigin.x) should be considered.
     */
    @Generated
    @Selector("sourceNumberOfFeatureVectors")
    @NUInt
    public native long sourceNumberOfFeatureVectors();

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