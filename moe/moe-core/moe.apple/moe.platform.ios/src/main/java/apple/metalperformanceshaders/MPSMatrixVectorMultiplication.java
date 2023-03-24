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
 * MPSMatrixVectorMultiplication
 * 
 * [@dependency] This depends on Metal.framework.
 * 
 * A matrix-vector multiplication kernel.
 * 
 * A MPSMatrixVectorMultiplication object computes:
 * 
 * y = alpha * op(A) * x + beta * y
 * 
 * A is a matrix represented by a MPSMatrix object. alpha and beta
 * are scalar values (of the same data type as values of y) which are
 * applied as shown above. A may have an optional transposition
 * operation applied.
 * 
 * A MPSMatrixVectorMultiplication object is initialized with the transpose
 * operator to apply to A, sizes for the operation to perform,
 * and the scalar values alpha and beta.
 * 
 * 
 * API-Since: 11.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSMatrixVectorMultiplication extends MPSMatrixBinaryKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSMatrixVectorMultiplication(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSMatrixVectorMultiplication alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSMatrixVectorMultiplication allocWithZone(VoidPtr zone);

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

    /**
     * Encode a MPSMatrixVectorMultiplication object to a command buffer.
     * 
     * The left input matrix must be large enough to hold an array of size (rows x columns)
     * elements beginning at primarySourceMatrixOrigin.
     * 
     * The input vector must be large enough to hold an array of size (columns)
     * elements beginning at secondarySourceMatrixOrigin.x secondarySourceMatrixOrigin.y and
     * secondarySourceMatrixOrigin.z must be zero.
     * 
     * The result vector must be large enough to hold an array of size (rows)
     * elements beginning at resultMatrixOrigin.x. resultMatrixOrigin.y and
     * resultMatrixOrigin.z must be zero.
     * 
     * @param commandBuffer A valid MTLCommandBuffer to receive the encoded kernel.
     * 
     * @param inputMatrix   A valid MPSMatrix object which specifies the input matrix A.
     * 
     * @param inputVector   A valid MPSVector object which specifies the input vector x.
     * 
     * @param resultVector  A valid MPSVector object which specifies the addend vector which will
     *                      also be overwritten by the result.
     */
    @Generated
    @Selector("encodeToCommandBuffer:inputMatrix:inputVector:resultVector:")
    public native void encodeToCommandBufferInputMatrixInputVectorResultVector(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NotNull MPSMatrix inputMatrix,
            @NotNull MPSVector inputVector, @NotNull MPSVector resultVector);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSMatrixVectorMultiplication init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSMatrixVectorMultiplication initWithCoder(@NotNull NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSMatrixVectorMultiplication initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSMatrixVectorMultiplication initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Convenience initialization for a matrix-vector multiplication
     * with no transposition, unit scaling of the product, and no
     * accumulation of the result. The scaling factors alpha and beta
     * are taken to be 1.0 and 0.0 respectively.
     * 
     * @param device  The device on which the kernel will execute.
     * 
     * @param rows    The number of rows in the input matrix A, and the number of elements
     *                in the vector y.
     * 
     * @param columns The number of columns in the input matrix A, and the number of
     *                elements in the input vector x.
     * 
     * @return A valid MPSMatrixVectorMultiplication object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:rows:columns:")
    public native MPSMatrixVectorMultiplication initWithDeviceRowsColumns(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long rows, @NUInt long columns);

    /**
     * Initialize an MPSMatrixVectorMultiplication object on a device for a given size
     * and desired transpose and scale values.
     * 
     * @param device    The device on which the kernel will execute.
     * 
     * @param transpose A boolean value which indicates if the input matrix should be
     *                  used in transposed form. if 'YES' then op(A) == A**T, otherwise
     *                  op(A) == A.
     * 
     * @param rows      The number of rows in the input matrix op(A), and the number of elements
     *                  in the vector y.
     * 
     * @param columns   The number of columns in the input matrix op(A), and the number of
     *                  elements in the input vector x.
     * 
     * @param alpha     The scale factor to apply to the product. Specified in double
     *                  precision. Will be converted to the appropriate precision in the
     *                  implementation subject to rounding and/or clamping as necessary.
     * 
     * @param beta      The scale factor to apply to the initial values of y. Specified
     *                  in double precision. Will be converted to the appropriate precision in the
     *                  implementation subject to rounding and/or clamping as necessary.
     * 
     * @return A valid MPSMatrixVectorMultiplication object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:transpose:rows:columns:alpha:beta:")
    public native MPSMatrixVectorMultiplication initWithDeviceTransposeRowsColumnsAlphaBeta(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, boolean transpose, @NUInt long rows,
            @NUInt long columns, double alpha, double beta);

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
    public static native MPSMatrixVectorMultiplication new_objc();

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
