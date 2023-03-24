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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSMatrixBatchNormalizationGradient
 * 
 * [@dependency] This depends on Metal.framework.
 * 
 * A kernel to compute the gradient of the batch normalization operation.
 * 
 * A MPSMatrixBatchNormalizationGradient object computes the results of backpropagating
 * the gradients of a loss function with respect to the outputs of an
 * MPSMatrixBatchNormalization object. The corresponding properties and data used by
 * the MPSMatrixBatchNormalizationGradient object should correspond to those used by
 * the forward MPSMatrixBatchNormalization object for which the gradient is being computed.
 * 
 * 
 * 
 * API-Since: 12.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSMatrixBatchNormalizationGradient extends MPSMatrixBinaryKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSMatrixBatchNormalizationGradient(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSMatrixBatchNormalizationGradient alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSMatrixBatchNormalizationGradient allocWithZone(VoidPtr zone);

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

    /**
     * Make a copy of this kernel for a new device - @see MPSKernel
     * 
     * @param zone   The NSZone in which to allocate the object
     * @param device The device for the new MPSKernel. If nil, then use
     *               self.device.
     * @return A pointer to a copy of this MPSKernel. This will fail, returning
     *         nil if the device is not supported. Devices must be
     *         MTLFeatureSet_iOS_GPUFamily2_v1 or later.
     */
    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:device:")
    public native MPSMatrixBatchNormalizationGradient copyWithZoneDevice(@Nullable VoidPtr zone,
            @Nullable @Mapped(ObjCObjectMapper.class) MTLDevice device);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Encode a MPSMatrixBatchNormalizationGradient object to a command buffer and compute
     * its gradient with respect to its input data.
     * 
     * @param commandBuffer                The commandBuffer on which to encode the operation.
     * 
     * @param gradientMatrix               A matrix whose values represent the gradient of a
     *                                     loss function with respect to the results of a forward
     *                                     MPSMatrixBatchNormalization operation.
     * 
     * @param inputMatrix                  A matrix containing the inputs to a forward MPSMatrixBatchNormalization
     *                                     operation for which the gradient values are to be computed.
     * 
     * @param meanVector                   A vector containing the batch mean values. Should contain either the
     *                                     specified
     *                                     values used to compute the forward result, or the computed values resulting
     *                                     from
     *                                     the forward kernel execution.
     * 
     * @param varianceVector               A vector containing the batch variance values. Should contain either the
     *                                     specified
     *                                     values used to compute the forward result, or the computed values resulting
     *                                     from
     *                                     the forward kernel execution.
     * 
     * @param gammaVector                  A vector containing the gamma terms. Should be the same values as used
     *                                     when computing the forward result.
     * 
     * @param betaVector                   A vector containing the beta terms. Should be the same values as used when
     *                                     computing the forward result.
     * 
     * @param resultGradientForDataMatrix  The matrix containing the resulting gradient values.
     * 
     * @param resultGradientForGammaVector If non-NULL the vector containing gradients for the gamma
     *                                     terms.
     * 
     * @param resultGradientForBetaVector  If non-NULL the vector containing gradients for the beta
     *                                     terms.
     */
    @Generated
    @Selector("encodeToCommandBuffer:gradientMatrix:inputMatrix:meanVector:varianceVector:gammaVector:betaVector:resultGradientForDataMatrix:resultGradientForGammaVector:resultGradientForBetaVector:")
    public native void encodeToCommandBufferGradientMatrixInputMatrixMeanVectorVarianceVectorGammaVectorBetaVectorResultGradientForDataMatrixResultGradientForGammaVectorResultGradientForBetaVector(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NotNull MPSMatrix gradientMatrix,
            @NotNull MPSMatrix inputMatrix, @NotNull MPSVector meanVector, @NotNull MPSVector varianceVector,
            @Nullable MPSVector gammaVector, @Nullable MPSVector betaVector,
            @NotNull MPSMatrix resultGradientForDataMatrix, @Nullable MPSVector resultGradientForGammaVector,
            @Nullable MPSVector resultGradientForBetaVector);

    /**
     * [@property] epsilon
     * 
     * A small term added to the variance when normalizing the input.
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
    public native MPSMatrixBatchNormalizationGradient init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSMatrixBatchNormalizationGradient initWithCoder(@NotNull NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * 
     * See @ref MPSKernel#initWithCoder.
     * 
     * @param aDecoder The NSCoder subclass with your serialized MPSMatrixBatchNormalizationGradient
     * @param device   The MTLDevice on which to make the MPSMatrixBatchNormalizationGradient object.
     * @return A new MPSMatrixBatchNormalizationGradient object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSMatrixBatchNormalizationGradient initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSMatrixBatchNormalizationGradient initWithDevice(
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

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
    public static native MPSMatrixBatchNormalizationGradient new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] epsilon
     * 
     * A small term added to the variance when normalizing the input.
     */
    @Generated
    @Selector("setEpsilon:")
    public native void setEpsilon(float value);

    /**
     * Specifies a neuron activation function to be used.
     * 
     * This method can be used to add a neuron activation funtion of given type with
     * associated scalar parameters A, B, and C that are shared across all output values.
     * Note that this method can only be used to specify neurons which are specified by three (or fewer)
     * parameters shared across all output values (or channels, in CNN nomenclature). It is an error to call
     * this method for neuron activation functions like MPSCNNNeuronTypePReLU,
     * which require per-channel parameter values. An MPSMatrixBatchNormalizationGradient kernel is initialized
     * with a default neuron function of MPSCNNNeuronTypeNone.
     * 
     * @param neuronType Type of neuron activation function. For full list see MPSCNNNeuronType.h
     * @param parameterA parameterA of neuron activation that is shared across all output values.
     * @param parameterB parameterB of neuron activation that is shared across all output values.
     * @param parameterC parameterC of neuron activation that is shared across all output values.
     */
    @Generated
    @Selector("setNeuronType:parameterA:parameterB:parameterC:")
    public native void setNeuronTypeParameterAParameterBParameterC(int neuronType, float parameterA, float parameterB,
            float parameterC);

    /**
     * [@property] sourceInputFeatureChannels
     * 
     * The number of feature channels in the input vectors.
     */
    @Generated
    @Selector("setSourceInputFeatureChannels:")
    public native void setSourceInputFeatureChannels(@NUInt long value);

    /**
     * [@property] sourceNumberOfFeatureVectors
     * 
     * The number of input vectors which make up the input array.
     */
    @Generated
    @Selector("setSourceNumberOfFeatureVectors:")
    public native void setSourceNumberOfFeatureVectors(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] sourceInputFeatureChannels
     * 
     * The number of feature channels in the input vectors.
     */
    @Generated
    @Selector("sourceInputFeatureChannels")
    @NUInt
    public native long sourceInputFeatureChannels();

    /**
     * [@property] sourceNumberOfFeatureVectors
     * 
     * The number of input vectors which make up the input array.
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
