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
 * @class      MPSMatrixSolveCholesky
 * 
 * @dependency This depends on Metal.framework.
 * 
 * @abstract   A kernel for computing the solution of a linear system of equations
 *             using the Cholesky factorization resulting from a
 *             MPSMatrixDecompositionCholesky kernel.
 * 
 * @discussion A MPSMatrixSolveCholesky finds the solution matrix to the system:
 * 
 *                 A * X = B
 * 
 *             Where A is symmetric positive definite.  B is the array of
 *             right hand sides for which the equations are to be solved.
 *             X is the resulting matrix of solutions.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSMatrixSolveCholesky extends MPSMatrixBinaryKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSMatrixSolveCholesky(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSMatrixSolveCholesky alloc();

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
     * @abstract   Encode a MPSMatrixSolveCholesky kernel into a command Buffer.
     * 
     * @param      commandBuffer       A valid MTLCommandBuffer to receive the encoded filter
     * 
     * @param      sourceMatrix        A valid MPSMatrix containing the source matrix in factored
     *                                 form as returned by a previous successful execution of a
     *                                 MPSMatrixDecompositionCholesky kernel.
     * 
     * @param      rightHandSideMatrix A valid MPSMatrix containing the right hand side values.
     * 
     * @param      solutionMatrix      A valid MPSMatrix to contain the result.
     * 
     * @discussion This function encodes the MPSMatrixSolveCholesky object to a valid
     *             command buffer. sourceMatrix should contain either the lower or upper triangular
     *             factors corresponding to the factorization returned by a previous execution
     *             of MPSMatrixDecompositionCholesky.
     * 
     *             rightHandSideMatrix and solutionMatrix must be large enough to hold a matrix
     *             of size order x numberOfRightHandSides starting at secondarySourceMatrixOrigin and
     *             resultMatrixOrigin respectively.
     * 
     *             sourceMatrix must be at least size order x order starting at primarySourceMatrixOrigin.
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceMatrix:rightHandSideMatrix:solutionMatrix:")
    public native void encodeToCommandBufferSourceMatrixRightHandSideMatrixSolutionMatrix(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSMatrix sourceMatrix,
            MPSMatrix rightHandSideMatrix, MPSMatrix solutionMatrix);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSMatrixSolveCholesky init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSMatrixSolveCholesky initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSMatrixSolveCholesky initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSMatrixSolveCholesky initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * @abstract   Initialize an MPSMatrixSolveCholesky object on a device
     * 
     * @param      device          The device on which the kernel will execute.
     * 
     * @param      upper           A boolean value which indicates if the source
     *                             matrix stores the lower or upper triangular
     *                             factors.
     * 
     * @param      order           The order of the source matrix and the number of
     *                             rows in the solution and right hand side matrices.
     * 
     * @param      numberOfRightHandSides  The number of columns in the solution and right hand side
     *                                     matrices.
     * 
     * @return     A valid MPSMatrixSolveCholesky object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:upper:order:numberOfRightHandSides:")
    public native MPSMatrixSolveCholesky initWithDeviceUpperOrderNumberOfRightHandSides(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, boolean upper, @NUInt long order,
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