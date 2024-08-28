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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSMatrixDecompositionLU
 * 
 * [@dependency] This depends on Metal.framework.
 * 
 * A kernel for computing the LU factorization of a matrix using
 * partial pivoting with row interchanges.
 * 
 * A MPSMatrixDecompositionLU object computes an LU factorization:
 * 
 * P * A = L * U
 * 
 * A is a matrix for which the LU factorization is to be computed.
 * L is a unit lower triangular matrix and U is an upper triangular
 * matrix. P is a permutation matrix.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSMatrixDecompositionLU extends MPSMatrixUnaryKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSMatrixDecompositionLU(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSMatrixDecompositionLU alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSMatrixDecompositionLU allocWithZone(VoidPtr zone);

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
     * Encode a MPSMatrixDecompositionLU kernel into a command Buffer.
     * 
     * This function encodes the MPSMatrixDecompositionLU object to a valid
     * command buffer.
     * 
     * Upon completion the array pivotIndices contains, for each index i,
     * the row interchanged with row i.
     * 
     * If during the computation U[k, k], for some k, is determined to be
     * exactly zero MPSMatrixDecompositionStatusSingular will be returned in the
     * provided status buffer. The data referenced by the MTLBuffer is not valid
     * until the command buffer has completed execution. If the matrix
     * return status is not desired NULL may be provided.
     * 
     * Upon successful factorization, resultMatrix contains the resulting
     * lower triangular factor (without the unit diagonal elements) in its
     * strictly lower triangular region and the upper triangular factor in
     * its upper triangular region.
     * 
     * This kernel functions either in-place, if the result matrix
     * completely aliases the source matrix, or out-of-place. If there
     * is any partial overlap between input and output data the results
     * are undefined.
     * 
     * @param commandBuffer A valid MTLCommandBuffer to receive the encoded filter
     * 
     * @param sourceMatrix  A valid MPSMatrix containing the source data. Must have
     *                      enough space to hold a rows x columns matrix.
     * 
     * @param resultMatrix  A valid MPSMatrix to contain the result. Must have enough
     *                      space to hold a rows x columns matrix.
     * 
     * @param pivotIndices  A valid MPSMatrix to contain the pivot indices. Must have enough space
     *                      to hold an array of size 1xmin(rows, columns) values.
     *                      Element type must be MPSDataTypeUInt32.
     * 
     * @param status        A MTLBuffer which indicates the resulting MPSMatrixDecompositionStatus
     *                      value.
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceMatrix:resultMatrix:pivotIndices:status:")
    public native void encodeToCommandBufferSourceMatrixResultMatrixPivotIndicesStatus(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NotNull MPSMatrix sourceMatrix,
            @NotNull MPSMatrix resultMatrix, @NotNull MPSMatrix pivotIndices,
            @Nullable @Mapped(ObjCObjectMapper.class) MTLBuffer status);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSMatrixDecompositionLU init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSMatrixDecompositionLU initWithCoder(@NotNull NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSMatrixDecompositionLU initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSMatrixDecompositionLU initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize an MPSMatrixDecompositionLU object on a device
     * 
     * @param device  The device on which the kernel will execute.
     * 
     * @param rows    The number of rows in the source matrix.
     * 
     * @param columns The number of columns in the source matrix.
     * 
     * @return A valid MPSMatrixDecompositionLU object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:rows:columns:")
    public native MPSMatrixDecompositionLU initWithDeviceRowsColumns(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long rows, @NUInt long columns);

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
    public static native MPSMatrixDecompositionLU new_objc();

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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
