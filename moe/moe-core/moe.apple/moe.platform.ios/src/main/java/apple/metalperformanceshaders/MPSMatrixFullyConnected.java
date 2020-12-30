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
 * @class      MPSMatrixFullyConnected
 * 
 * @dependency This depends on Metal.framework.
 * 
 * @abstract   Applies a fully connected neural network layer by performing a
 *             a matrix multiplication, adding a bias vector, scaling, and applying a
 *             neuron activation function.
 * 
 * @discussion A MPSMatrixFullyConnected object computes:
 * 
 *                 y = neuron(alpha * x * W + bias)
 * 
 *             y is the output matrix, x and W are input matrices corresponding
 *             to a collection of input vectors and weights respectively, and bias
 *             is a vector which is broadcast and accumulated to each row
 *             of the product.  alpha is a scale factor applied to the product.
 * 
 *             neuron() is a pointwise function applied to the intermediate result.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSMatrixFullyConnected extends MPSMatrixBinaryKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSMatrixFullyConnected(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSMatrixFullyConnected alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * @property   alpha
     * 
     * @discussion The scale factor to apply to the product.  Specified in double
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
     * @abstract   Encode a MPSMatrixFullyConnected object to a command buffer.
     * 
     * @param      commandBuffer   A valid MTLCommandBuffer to receive the encoded kernel.
     * 
     * @param      inputMatrix     A valid MPSMatrix object which specifies the input array.
     * 
     * @param      weightMatrix    A valid MPSMatrix object which specifies the weight array.
     * 
     * @param      biasVector      A valid MPSVector object which specifies the bias values, or
     *                             a null object to indicate that no bias is to be applied.
     * 
     * @param      resultMatrix    A valid MPSMatrix object which specifies the output array.
     * 
     * @discussion Encodes the operation to the specified command buffer.  resultMatrix
     *             must be large enough to hold a
     *                 MIN(sourceNumberOfInputs,
     *                     inputMatrix.rows - primarySourceMatrixOrigin.x)
     *                 x
     *                 MIN(sourceOutputFeatureChannels,
     *                     weightMatrix.columns - secondarySourceMatrixOrigin.y) array.
     * 
     *             The bias vector must contain at least
     *                 MIN(sourceOutputFeatureChannels, weightMatrix.columns - secondarySourceMatrixOrigin.y) elements.
     */
    @Generated
    @Selector("encodeToCommandBuffer:inputMatrix:weightMatrix:biasVector:resultMatrix:")
    public native void encodeToCommandBufferInputMatrixWeightMatrixBiasVectorResultMatrix(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSMatrix inputMatrix,
            MPSMatrix weightMatrix, MPSVector biasVector, MPSMatrix resultMatrix);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSMatrixFullyConnected init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSMatrixFullyConnected initWithCoder(NSCoder aDecoder);

    /**
     * @abstract NSSecureCoding compatability
     * @discussion See @ref MPSKernel#initWithCoder.
     * @param      aDecoder    The NSCoder subclass with your serialized MPSMatrixFullyConnected
     * @param      device      The MTLDevice on which to make the MPSMatrixFullyConnected object.
     * @return     A new MPSMatrixFullyConnected object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSMatrixFullyConnected initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSMatrixFullyConnected initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

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
     * @discussion The scale factor to apply to the product.  Specified in double
     *             precision.  Will be converted to the appropriate precision in the
     *             implementation subject to rounding and/or clamping as necessary.
     *             Defaults to 1.0 at initialization time.
     */
    @Generated
    @Selector("setAlpha:")
    public native void setAlpha(double value);

    /**
     * @abstract   Specifies a neuron activation function to be used.
     * 
     * @discussion This method can be used to add a neuron activation funtion of given type with
     *             associated scalar parameters A, B, and C that are shared across all output values.
     *             Note that this method can only be used to specify neurons which are specified by three (or fewer)
     *             parameters shared across all output values (or channels, in CNN nomenclature). It is an error to call
     *             this method for neuron activation functions like MPSCNNNeuronTypePReLU,
     *             which require per-channel parameter values. For those kind of neuron activation functions,
     *             use appropriate setter functions.  An MPSMatrixFullyConnected kernel is initialized
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
     *             number of columns and the number of rows in the primary (input array) and
     *             secondary (weight array) source matrices respectively.
     *             This property is modifiable and defaults to NSUIntegerMax.  At encode
     *             time the larger of this property or the available input size is used.
     *             The value of NSUIntegerMax thus indicates that all available
     *             columns in the input array (beginning at primarySourceMatrixOrigin.y) and all
     *             available rows in the weight array (beginning at secondarySourceMatrixOrigin.x)
     *             should be considered.
     *             Note: The value used in the operation will be
     *             MIN(MIN(inputMatrix.columns - primarySourceMatrixOrigin.y,
     *                     weightMatrix.rows - secondarySourceMatrixOrigin.x),
     *                 sourceInputFeatureChannels)
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
     *             rows (beginning at primarySourceMatrixOrigin.x) should be considered.
     */
    @Generated
    @Selector("setSourceNumberOfFeatureVectors:")
    public native void setSourceNumberOfFeatureVectors(@NUInt long value);

    /**
     * @property   sourceOutputFeatureChannels
     * 
     * @discussion The output size to to use in the operation.  This is equivalent to the
     *             number of columns to consider in the weight array, or the secondary source matrix.
     *             This property is modifiable and defaults to NSUIntegerMax.  At encode
     *             time the larger of this property or the available output size is used.
     *             The value of NSUIntegerMax thus indicates that all available
     *             columns in the weight array (beginning at secondarySourceMatrixOrigin.y)
     *             should be considered.
     */
    @Generated
    @Selector("setSourceOutputFeatureChannels:")
    public native void setSourceOutputFeatureChannels(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * @property   sourceInputFeatureChannels
     * 
     * @discussion The input size to to use in the operation.  This is equivalent to the
     *             number of columns and the number of rows in the primary (input array) and
     *             secondary (weight array) source matrices respectively.
     *             This property is modifiable and defaults to NSUIntegerMax.  At encode
     *             time the larger of this property or the available input size is used.
     *             The value of NSUIntegerMax thus indicates that all available
     *             columns in the input array (beginning at primarySourceMatrixOrigin.y) and all
     *             available rows in the weight array (beginning at secondarySourceMatrixOrigin.x)
     *             should be considered.
     *             Note: The value used in the operation will be
     *             MIN(MIN(inputMatrix.columns - primarySourceMatrixOrigin.y,
     *                     weightMatrix.rows - secondarySourceMatrixOrigin.x),
     *                 sourceInputFeatureChannels)
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
     *             rows (beginning at primarySourceMatrixOrigin.x) should be considered.
     */
    @Generated
    @Selector("sourceNumberOfFeatureVectors")
    @NUInt
    public native long sourceNumberOfFeatureVectors();

    /**
     * @property   sourceOutputFeatureChannels
     * 
     * @discussion The output size to to use in the operation.  This is equivalent to the
     *             number of columns to consider in the weight array, or the secondary source matrix.
     *             This property is modifiable and defaults to NSUIntegerMax.  At encode
     *             time the larger of this property or the available output size is used.
     *             The value of NSUIntegerMax thus indicates that all available
     *             columns in the weight array (beginning at secondarySourceMatrixOrigin.y)
     *             should be considered.
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