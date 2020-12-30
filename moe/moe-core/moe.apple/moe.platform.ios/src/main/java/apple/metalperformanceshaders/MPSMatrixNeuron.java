package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
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
 * @class      MPSMatrixNeuron
 * 
 * @dependency This depends on Metal.framework.
 * 
 * @abstract   A neuron activation kernel that operates on matrices.
 * 
 * @discussion A MPSMatrixNeuron object computes:
 * 
 *                 y = neuron(alpha * x + bias)
 * 
 *             y is the output matrix, x is the input matrix corresponding
 *             to a collection of input vectors and bias is a vector which is broadcast
 *             and accumulated to each row of the intermediate result.
 *             alpha is a scale factor applied to the input.
 * 
 *             neuron() defines the pointwise function that is applied to the intermediate result.
 * 
 *             Note: This function computes the same result as MPSMatrixFullyConnected that has
 *                     unit weight matrix.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSMatrixNeuron extends MPSMatrixUnaryKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSMatrixNeuron(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSMatrixNeuron alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * @property   alpha
     * 
     * @discussion The scale factor to apply to the input.  Specified in double
     *             precision.  Will be converted to the appropriate precision in the
     *             implementation subject to rounding and/or clamping as necessary.
     *             Defaults to 1.0 at initialization time.
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
     * @abstract   Make a copy of this kernel for a new device - @see MPSKernel
     * @param      zone        The NSZone in which to allocate the object
     * @param      device      The device for the new MPSKernel. If nil, then use
     *                         self.device.
     * @result     A pointer to a copy of this MPSKernel. This will fail, returning
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
     * @abstract   Encode a MPSMatrixNeuron object to a command buffer.
     * 
     * @param      commandBuffer   A valid MTLCommandBuffer to receive the encoded kernel.
     * 
     * @param      inputMatrix     A valid MPSMatrix object which specifies the input array.
     * 
     * @param      biasVector      A valid MPSVector object which specifies the bias values, or
     *                             a null object to indicate that no bias is to be applied.
     * 
     * @param      resultMatrix    A valid MPSMatrix object which specifies the output array.
     * 
     * @discussion Encodes the operation to the specified command buffer.  resultMatrix
     *             must be large enough to hold a
     *                 MIN(sourceNumberOfFeatureVectors, inputMatrix.rows - sourceMatrixOrigin.x)
     *                 x
     *                 MIN(inputMatrix.columns - sourceMatrixOrigin.y, sourceInputFeatureChannels) array.
     * 
     *             The bias vector must contain at least
     *                 MIN(inputMatrix.columns - sourceMatrixOrigin.y, sourceInputFeatureChannels) elements.
     */
    @Generated
    @Selector("encodeToCommandBuffer:inputMatrix:biasVector:resultMatrix:")
    public native void encodeToCommandBufferInputMatrixBiasVectorResultMatrix(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSMatrix inputMatrix, MPSVector biasVector,
            MPSMatrix resultMatrix);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSMatrixNeuron init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSMatrixNeuron initWithCoder(NSCoder aDecoder);

    /**
     * @abstract NSSecureCoding compatability
     * @discussion See @ref MPSKernel#initWithCoder.
     * @param      aDecoder    The NSCoder subclass with your serialized MPSMatrixNeuron
     * @param      device      The MTLDevice on which to make the MPSMatrixNeuron object.
     * @return     A new MPSMatrixNeuron object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSMatrixNeuron initWithCoderDevice(NSCoder aDecoder, @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSMatrixNeuron initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

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
     * @abstract   Getter funtion for neuronType set using setNeuronType:parameterA:parameterB:parameterC method
     */
    @Generated
    @Selector("neuronParameterA")
    public native float neuronParameterA();

    /**
     * @abstract   Getter funtion for neuronType set using setNeuronType:parameterA:parameterB:parameterC method
     */
    @Generated
    @Selector("neuronParameterB")
    public native float neuronParameterB();

    /**
     * @abstract   Getter funtion for neuronType set using setNeuronType:parameterA:parameterB:parameterC method
     */
    @Generated
    @Selector("neuronParameterC")
    public native float neuronParameterC();

    /**
     * @abstract   Getter funtion for neuronType set using setNeuronType:parameterA:parameterB:parameterC method
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
     * @property   alpha
     * 
     * @discussion The scale factor to apply to the input.  Specified in double
     *             precision.  Will be converted to the appropriate precision in the
     *             implementation subject to rounding and/or clamping as necessary.
     *             Defaults to 1.0 at initialization time.
     */
    @Generated
    @Selector("setAlpha:")
    public native void setAlpha(double value);

    /**
     * @abstract   Add per output value neuron parameters A for PReLu neuron activation functions.
     * 
     * @discussion This method sets the neuron to PReLU, zeros parameters A and B and sets the per output value
     *             neuron parameters A to an array containing a unique value of A for each output value.
     * 
     *             If the neuron function is f(v,a,b), it will apply
     * 
     *                    resultMatrix(i, j) = f( input(i, j), A[j], B[j] )
     *                 where j in [0, sourceInputFeatureChannels]
     * 
     *             See https://arxiv.org/pdf/1502.01852.pdf for details.
     * 
     *             All other neuron types, where parameter A
     *             and parameter B are shared across output values must be set using
     *             -setNeuronType:parameterA:parameterB:
     * 
     * @param      A       An array containing float values for neuron parameter A.
     *                     Number of entries must be equal to MIN(inputMatrix.columns - sourceMatrixOrigin.y, sourceInputFeatureChannels)
     */
    @Generated
    @Selector("setNeuronToPReLUWithParametersA:")
    public native void setNeuronToPReLUWithParametersA(NSData A);

    /**
     * @abstract   Specifies a neuron activation function to be used.
     * 
     * @discussion This method can be used to add a neuron activation funtion of given type with
     *             associated scalar parameters A, B, and C that are shared across all output values.
     *             Note that this method can only be used to specify neurons which are specified by three (or fewer)
     *             parameters shared across all output values (or channels, in CNN nomenclature). It is an error to call
     *             this method for neuron activation functions like MPSCNNNeuronTypePReLU,
     *             which require per-channel parameter values. For those kind of neuron activation functions,
     *             use appropriate setter functions.  An MPSMatrixNeuron kernel is initialized
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
     * @property   sourceInputFeatureChannels
     * 
     * @discussion The input size to to use in the operation.  This is equivalent to the
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
     * @property   sourceNumberOfFeatureVectors
     * 
     * @discussion The number of input vectors which make up the input array.  This
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
     * @property   sourceInputFeatureChannels
     * 
     * @discussion The input size to to use in the operation.  This is equivalent to the
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
     * @property   sourceNumberOfFeatureVectors
     * 
     * @discussion The number of input vectors which make up the input array.  This
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