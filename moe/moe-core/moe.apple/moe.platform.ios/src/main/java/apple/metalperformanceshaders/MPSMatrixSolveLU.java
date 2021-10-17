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
 * MPSMatrixSolveLU
 * <p>
 * [@dependency] This depends on Metal.framework.
 * <p>
 * A kernel for computing the solution of a linear system of equations
 * using the LU factorization resulting from a MPSMatrixDecompositionLU
 * kernel.
 * <p>
 * A MPSMatrixSolveLU finds the solution matrix to the system:
 * <p>
 * op(A) * X = B
 * <p>
 * Where op(A) is A**T or A.  B is the array of right hand sides for which
 * the equations are to be solved.  X is the resulting matrix of solutions.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSMatrixSolveLU extends MPSMatrixBinaryKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSMatrixSolveLU(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSMatrixSolveLU alloc();

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

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Encode a MPSMatrixSolveLU kernel into a command Buffer.
     * <p>
     * This function encodes the MPSMatrixSolveLU object to a valid command buffer.
     * sourceMatrix should contain the lower and upper triangular factors of A as
     * results from a previous execution of MPSMatrixDecompositionLU.
     * <p>
     * pivotIndices is an array of pivots resulting from a previous execution of
     * MPSMatrixDecompositionLU.
     * <p>
     * rightHandSideMatrix and solutionMatrix must be large enough to hold a matrix
     * of size order x numberOfRightHandSides starting at secondarySourceMatrixOrigin and
     * resultMatrixOrigin respectively.
     * <p>
     * sourceMatrix must be at least size order x order starting at primarySourceMatrixOrigin.
     *
     * @param commandBuffer       A valid MTLCommandBuffer to receive the encoded filter
     * @param sourceMatrix        A valid MPSMatrix containing the source matrix in factored
     *                            form as returned by a previous successful execution of a
     *                            MPSMatrixDecompositionLU kernel.
     * @param rightHandSideMatrix A valid MPSMatrix containing the right hand side values.
     * @param pivotIndices        A valid MPSMatrix which contains the pivot indices as returned by
     *                            a previous successful execution of a MPSMatrixDecompositionLU
     *                            kernel.
     * @param solutionMatrix      A valid MPSMatrix to contain the result.
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceMatrix:rightHandSideMatrix:pivotIndices:solutionMatrix:")
    public native void encodeToCommandBufferSourceMatrixRightHandSideMatrixPivotIndicesSolutionMatrix(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSMatrix sourceMatrix,
            MPSMatrix rightHandSideMatrix, MPSMatrix pivotIndices, MPSMatrix solutionMatrix);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSMatrixSolveLU init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSMatrixSolveLU initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSMatrixSolveLU initWithCoderDevice(NSCoder aDecoder, @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSMatrixSolveLU initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize an MPSMatrixSolveLU object on a device
     *
     * @param device                 The device on which the kernel will execute.
     * @param transpose              A boolean value which indicates if the source
     *                               matrix should be used in transposed form.
     * @param order                  The order of the source matrix and the number of
     *                               rows in the solution and right hand side matrices.
     * @param numberOfRightHandSides The number of columns in the solution and right hand side
     *                               matrices.
     * @return A valid MPSMatrixSolveLU object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:transpose:order:numberOfRightHandSides:")
    public native MPSMatrixSolveLU initWithDeviceTransposeOrderNumberOfRightHandSides(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, boolean transpose, @NUInt long order,
            @NUInt long numberOfRightHandSides);

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
