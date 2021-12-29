package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLBuffer;
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

/**
 * MPSMatrixDecompositionCholesky
 * <p>
 * [@dependency] This depends on Metal.framework.
 * <p>
 * A kernel for computing the Cholesky factorization of a matrix.
 * <p>
 * A MPSMatrixDecompositionLU object computes one of the following
 * factorizations of a matrix A:
 * <p>
 * A = L * L**T
 * A = U**T * U
 * <p>
 * A is a symmetric positive-definite matrix for which the
 * factorization is to be computed. L and U are lower and upper
 * triangular matrices respectively.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSMatrixDecompositionCholesky extends MPSMatrixUnaryKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSMatrixDecompositionCholesky(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSMatrixDecompositionCholesky alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSMatrixDecompositionCholesky allocWithZone(VoidPtr zone);

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
     * Encode a MPSMatrixDecompositionCholesky kernel into a command Buffer.
     * <p>
     * This function encodes the MPSMatrixDecompositionCholesky object to a valid
     * command buffer.
     * <p>
     * If during the factorization a leading minor of the matrix is found to be
     * not positive definite, MPSMatrixDecompositionNonPositiveDefinite will be returned
     * in the provided status buffer.  Previously computed pivots and the non positive
     * pivot are written to the result, but the factorization does not complete.
     * The data referenced by the MTLBuffer is not valid until the command buffer has completed
     * execution.  If the matrix return status is not desired NULL may be provided.
     * <p>
     * If the return status is MPSMatrixDecompositionStatusSuccess, resultMatrix
     * contains the resulting factors in its lower or upper triangular regions
     * respectively.
     * <p>
     * This kernel functions either in-place, if the result matrix
     * completely aliases the source matrix, or out-of-place.  If there
     * is any partial overlap between input and output data the results
     * are undefined.
     *
     * @param commandBuffer A valid MTLCommandBuffer to receive the encoded filter
     * @param sourceMatrix  A valid MPSMatrix containing the source data.  Must have
     *                      enough space to hold a order x order matrix.
     * @param resultMatrix  A valid MPSMatrix to contain the result.  Must have enough
     *                      space to hold a order x order matrix.
     * @param status        A MTLBuffer which indicates the resulting MPSMatrixDecompositionStatus
     *                      value.
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceMatrix:resultMatrix:status:")
    public native void encodeToCommandBufferSourceMatrixResultMatrixStatus(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSMatrix sourceMatrix,
            MPSMatrix resultMatrix, @Mapped(ObjCObjectMapper.class) MTLBuffer status);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSMatrixDecompositionCholesky init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSMatrixDecompositionCholesky initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSMatrixDecompositionCholesky initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSMatrixDecompositionCholesky initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize an MPSMatrixDecompositionCholesky object on a device
     *
     * @param device The device on which the kernel will execute.
     * @param lower  A boolean value indicating if the lower triangular
     *               part of the source matrix is stored.  If lower = YES
     *               the lower triangular part will be used and the factor
     *               will be written to the lower triangular part of the
     *               result, otherwise the upper triangular part will be used
     *               and the factor will be written to the upper triangular
     *               part.
     * @param order  The number of rows and columns in the source matrix.
     * @return A valid MPSMatrixDecompositionCholesky object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:lower:order:")
    public native MPSMatrixDecompositionCholesky initWithDeviceLowerOrder(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, boolean lower, @NUInt long order);

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
    public static native MPSMatrixDecompositionCholesky new_objc();

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
