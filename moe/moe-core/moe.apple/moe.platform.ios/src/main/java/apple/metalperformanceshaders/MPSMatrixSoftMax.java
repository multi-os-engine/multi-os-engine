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

/**
 * MPSMatrixSoftMax
 * <p>
 * [@dependency] This depends on Metal.framework.
 * <p>
 * A softmax kernel that operates on matrices.
 * <p>
 * A MPSMatrixSoftMax object computes:
 * <p>
 * B_ij = Exp { A_ij } / ( Sum_k Exp { A_ik } )
 * <p>
 * A and B are matrices which are represented by MPSMatrix
 * objects. This filter computes the same result for MPSMatrices as
 * MPSCNNSoftMax filter does for MPSImages by interpreting the columns
 * of the matrix as feature channels, that is the sum runs over column indices.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSMatrixSoftMax extends MPSMatrixUnaryKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSMatrixSoftMax(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSMatrixSoftMax alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MPSMatrixSoftMax allocWithZone(VoidPtr zone);

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
     * Make a copy of this kernel for a new device - @see MPSKernel
     *
     * @param zone   The NSZone in which to allocate the object
     * @param device The device for the new MPSKernel. If nil, then use
     *               self.device.
     * @return a pointer to a copy of this MPSKernel. This will fail, returning
     * nil if the device is not supported. Devices must be
     * MTLFeatureSet_iOS_GPUFamily2_v1 or later.
     */
    @Generated
    @Owned
    @Selector("copyWithZone:device:")
    public native MPSMatrixSoftMax copyWithZoneDevice(VoidPtr zone, @Mapped(ObjCObjectMapper.class) MTLDevice device);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Encode a MPSMatrixSoftMax object to a command buffer.
     * <p>
     * Certain constraints apply to the sizes of the matrices depending on the sizes requested at
     * initialization time as well as the origins at the time this routine is called:
     * <p>
     * The result matrix must be large enough to hold a two dimensional array of 'sourceRows' rows and
     * 'sourceColumns' columns beginning at resultMatrixOrigin.
     * <p>
     * Each matrix within the range specified by batchStart and batchSize, which also specifies
     * a valid set of matrices within inputMatrix and resultMatrix, will
     * be processed.
     * <p>
     * The datatypes of the matrices inputMatrix and resultMatrix must match and be either
     * MPSDataTypeFloat32 or MPSDataTypeFloat16.
     *
     * @param commandBuffer A valid MTLCommandBuffer to receive the encoded kernel.
     * @param inputMatrix   A valid MPSMatrix object which specifies the input matrix.
     * @param resultMatrix  A valid MPSMatrix object which specifies the matrix which will
     *                      be overwritten by the result.
     */
    @Generated
    @Selector("encodeToCommandBuffer:inputMatrix:resultMatrix:")
    public native void encodeToCommandBufferInputMatrixResultMatrix(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSMatrix inputMatrix,
            MPSMatrix resultMatrix);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSMatrixSoftMax init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSMatrixSoftMax initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * <p>
     * See @ref MPSKernel#initWithCoder.
     *
     * @param aDecoder The NSCoder subclass with your serialized MPSMatrixSoftMax
     * @param device   The MTLDevice on which to make the MPSMatrixSoftMax
     * @return A new MPSMatrixSoftMax object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSMatrixSoftMax initWithCoderDevice(NSCoder aDecoder, @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize an MPSMatrixSoftMax object on a device for a given size.
     *
     * @param device The device on which the kernel will execute.
     * @return A valid MPSMatrixSoftMax object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSMatrixSoftMax initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

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
    public static native MPSMatrixSoftMax new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property]   sourceColumns
     * <p>
     * The number of columns to consider from the source in the operation.
     * This property is modifiable and defaults to NSUIntegerMax and the number is
     * adjusted dynamically at kernel encode time (see encodeToCommandBuffer) to
     * fit into the source matrix available starting from sourceMatrixOrigin.y,
     * indicating that by default the whole source matrix is used.
     * If a different size is desired then this should be modified prior to
     * encoding the kernel. It is the user's responsibility to ensure that the
     * resultMatrix parameter in encodeToCommandBuffer is large enough
     * to accommodate the results of this operation, otherwise the results of
     * the encode call are undefined.
     * NOTE: sourceMatrixOrigin and resultMatrixOrigin from MPSMatrixUnaryKernel
     * can be used to control the starting points in the source and destination
     * at kernel encode time (see encodeToCommandBuffer).
     */
    @Generated
    @Selector("setSourceColumns:")
    public native void setSourceColumns(@NUInt long value);

    /**
     * [@property]   sourceRows
     * <p>
     * The number of rows to consider from the source in the operation.
     * This property is modifiable and defaults to NSUIntegerMax and the number is
     * adjusted dynamically at kernel encode time (see encodeToCommandBuffer) to
     * fit into the source matrix available starting from sourceMatrixOrigin.x,
     * indicating that by default the whole source matrix is used.
     * If a different size is desired then this should be modified prior to
     * encoding the kernel. It is the user's responsibility to ensure that the
     * resultMatrix parameter in encodeToCommandBuffer is large enough
     * to accommodate the results of this operation, otherwise the results of
     * the encode call are undefined.
     * NOTE: sourceMatrixOrigin and resultMatrixOrigin from MPSMatrixUnaryKernel
     * can be used to control the starting points in the source and destination
     * at kernel encode time (see encodeToCommandBuffer).
     */
    @Generated
    @Selector("setSourceRows:")
    public native void setSourceRows(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property]   sourceColumns
     * <p>
     * The number of columns to consider from the source in the operation.
     * This property is modifiable and defaults to NSUIntegerMax and the number is
     * adjusted dynamically at kernel encode time (see encodeToCommandBuffer) to
     * fit into the source matrix available starting from sourceMatrixOrigin.y,
     * indicating that by default the whole source matrix is used.
     * If a different size is desired then this should be modified prior to
     * encoding the kernel. It is the user's responsibility to ensure that the
     * resultMatrix parameter in encodeToCommandBuffer is large enough
     * to accommodate the results of this operation, otherwise the results of
     * the encode call are undefined.
     * NOTE: sourceMatrixOrigin and resultMatrixOrigin from MPSMatrixUnaryKernel
     * can be used to control the starting points in the source and destination
     * at kernel encode time (see encodeToCommandBuffer).
     */
    @Generated
    @Selector("sourceColumns")
    @NUInt
    public native long sourceColumns();

    /**
     * [@property]   sourceRows
     * <p>
     * The number of rows to consider from the source in the operation.
     * This property is modifiable and defaults to NSUIntegerMax and the number is
     * adjusted dynamically at kernel encode time (see encodeToCommandBuffer) to
     * fit into the source matrix available starting from sourceMatrixOrigin.x,
     * indicating that by default the whole source matrix is used.
     * If a different size is desired then this should be modified prior to
     * encoding the kernel. It is the user's responsibility to ensure that the
     * resultMatrix parameter in encodeToCommandBuffer is large enough
     * to accommodate the results of this operation, otherwise the results of
     * the encode call are undefined.
     * NOTE: sourceMatrixOrigin and resultMatrixOrigin from MPSMatrixUnaryKernel
     * can be used to control the starting points in the source and destination
     * at kernel encode time (see encodeToCommandBuffer).
     */
    @Generated
    @Selector("sourceRows")
    @NUInt
    public native long sourceRows();

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
