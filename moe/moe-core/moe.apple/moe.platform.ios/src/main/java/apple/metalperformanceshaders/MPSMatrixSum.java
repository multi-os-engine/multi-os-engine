package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metal.struct.MTLOrigin;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
 * MPSMatrixSum
 * [@dependency] This depends on Metal.framework
 * 
 * MPSMatrixSum performs a pointwise summation of N MPSMatrix
 * objects and applies an optional bias term and neuron activation
 * function.
 * 
 * MPSMatrix A = empty matrix;
 * for (i = 0; i < N; ++i)
 * A += alpha[i]*B[i];
 * 
 * if (bias)
 * A += broadcast(bias);
 * 
 * if (neuron)
 * A = applyNeuron(A);
 * 
 * Where B is the array of MPSMatrix objects, A is the destination
 * MPSMatrix, alpha is an array of scalar values, bias is a vector
 * which is broadcast and accumulated across each row of the intermediate
 * result, and applyNeuron is a neuron activation function.
 * 
 * Each matrix in the array may have an independent origin.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSMatrixSum extends MPSKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSMatrixSum(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSMatrixSum alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSMatrixSum allocWithZone(VoidPtr zone);

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
     * The number of columns to sum.
     */
    @Generated
    @Selector("columns")
    @NUInt
    public native long columns();

    /**
     * The number of matrices to sum.
     */
    @Generated
    @Selector("count")
    @NUInt
    public native long count();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Encode the operations to the command buffer
     * 
     * @param buffer         The command buffer in which to encode the operation.
     * @param sourceMatrices A list of matrices from which the matrix data is read.
     * @param resultMatrix   The result matrix.
     * @param scaleVector    A MPSVector of type MPSDataTypeFloat32 containing the list of
     *                       scale factors, specified in single precision.
     * @param offsetVector   A MPSVector of type MPSDataTypeUInt32 containing the list of
     *                       offsets, stored as a packed array of MPSMatrixOffset values.
     * @param biasVector     A MPSVector containing the bias terms to add to the result
     *                       prior to applying the neuron function, if any. May be nil.
     * @param startIndex     The starting index into the scale and offset vectors.
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceMatrices:resultMatrix:scaleVector:offsetVector:biasVector:startIndex:")
    public native void encodeToCommandBufferSourceMatricesResultMatrixScaleVectorOffsetVectorBiasVectorStartIndex(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer buffer,
            @NotNull NSArray<? extends MPSMatrix> sourceMatrices, @NotNull MPSMatrix resultMatrix,
            @Nullable MPSVector scaleVector, @Nullable MPSVector offsetVector, @Nullable MPSVector biasVector,
            @NUInt long startIndex);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSMatrixSum init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSMatrixSum initWithCoder(@NotNull NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * 
     * See @ref MPSKernel#initWithCoder.
     * 
     * @param aDecoder The NSCoder subclass with your serialized MPSMatrixSum kernel.
     * @param device   The MTLDevice on which to make the MPSMatrixSum object.
     * @return A new MPSMatrixSum object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSMatrixSum initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSMatrixSum initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize a MPSMatrixSum kernel.
     * 
     * @param device    The device on which to initialize the kernel.
     * @param count     The number of matrices to be summed.
     * @param rows      The number of rows to use in the input matrices.
     * @param columns   The number of columns to use in the input matrices.
     * @param transpose If YES the result of the summation is to be transposed
     *                  prior to applying the bias and activation.
     */
    @Generated
    @Selector("initWithDevice:count:rows:columns:transpose:")
    public native MPSMatrixSum initWithDeviceCountRowsColumnsTranspose(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long count, @NUInt long rows,
            @NUInt long columns, boolean transpose);

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
     * Neuron parameter A.
     */
    @Generated
    @Selector("neuronParameterA")
    public native float neuronParameterA();

    /**
     * Neuron parameter B.
     */
    @Generated
    @Selector("neuronParameterB")
    public native float neuronParameterB();

    /**
     * Neuron parameter C.
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
    public static native MPSMatrixSum new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] resultMatrixOrigin
     * 
     * The origin, relative to [0, 0] in the result matrix, at which to
     * start writing results. This property is modifiable and defaults
     * to [0, 0] at initialization time. If a different origin is desired
     * then this should be modified prior to encoding the kernel.
     */
    @Generated
    @Selector("resultMatrixOrigin")
    @ByValue
    public native MTLOrigin resultMatrixOrigin();

    /**
     * The number of rows to sum.
     */
    @Generated
    @Selector("rows")
    @NUInt
    public native long rows();

    /**
     * Specifies a neuron activation function to be used.
     * 
     * This method can be used to add a neuron activation funtion of given type with
     * associated scalar parameters A, B, and C that are shared across all output values.
     * Note that this method can only be used to specify neurons which are specified by three (or fewer)
     * parameters shared across all output values (or channels, in CNN nomenclature). It is an error to call
     * this method for neuron activation functions like MPSCNNNeuronTypePReLU,
     * which require per-channel parameter values. An MPSMatrixSum kernel is initialized
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
     * [@property] resultMatrixOrigin
     * 
     * The origin, relative to [0, 0] in the result matrix, at which to
     * start writing results. This property is modifiable and defaults
     * to [0, 0] at initialization time. If a different origin is desired
     * then this should be modified prior to encoding the kernel.
     */
    @Generated
    @Selector("setResultMatrixOrigin:")
    public native void setResultMatrixOrigin(@ByValue MTLOrigin value);

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

    /**
     * The transposition used to initialize the kernel.
     */
    @Generated
    @Selector("transpose")
    public native boolean transpose();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
