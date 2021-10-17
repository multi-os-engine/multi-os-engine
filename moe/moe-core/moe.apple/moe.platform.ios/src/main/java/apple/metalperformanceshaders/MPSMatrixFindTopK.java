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
 * MPSMatrixFindTopK
 * <p>
 * [@dependency] This depends on Metal.framework.
 * <p>
 * A kernel that find top-K values and their corresponding indices withing a row of a matrix
 * <p>
 * A MPSMatrixFindTopK object computes finds the 'k' largest values within
 * a row of a matrix and returns the value found and the index of the entry
 * in the source matrix. This operation is performed independently on the
 * rows and matrices in batch of the source matrix.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSMatrixFindTopK extends MPSMatrixUnaryKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSMatrixFindTopK(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSMatrixFindTopK alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MPSMatrixFindTopK allocWithZone(VoidPtr zone);

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
    public native MPSMatrixFindTopK copyWithZoneDevice(VoidPtr zone, @Mapped(ObjCObjectMapper.class) MTLDevice device);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Encode a MPSMatrixFindTopK object to a command buffer.
     * <p>
     * Certain constraints apply to the sizes of the matrices depending on the sizes requested at
     * initialization time as well as the origins at the time this routine is called:
     * <p>
     * Both result matrices must be large enough to hold a two dimensional array of 'sourceRows' rows and
     * 'numberOfTopKValues' columns beginning at resultMatrixOrigin.
     * <p>
     * The source matrix must be large enough to contain at least 'numberOfTopKValues' values
     * starting from sourceMatrixOrigin.y.
     * <p>
     * Each matrix within the range specified by batchStart and batchSize, which also specifies a valid
     * set of matrices within inputMatrix, resultIndexMatrix and resultValueMatrix, will be processed.
     * <p>
     * The datatypes of the matrices inputMatrix and resultValueMatrix must match and be either
     * MPSDataTypeFloat32 or MPSDataTypeFloat16.
     *
     * @param commandBuffer     A valid MTLCommandBuffer to receive the encoded kernel.
     * @param inputMatrix       A valid MPSMatrix object which specifies the input matrix.
     * @param resultIndexMatrix A valid MPSMatrix object which specifies the matrix which will
     *                          be overwritten by the result indices.
     *                          This matrix must have datatype MPSDataTypeUInt32.
     * @param resultValueMatrix A valid MPSMatrix object which specifies the matrix which will
     *                          be overwritten by the result values.
     */
    @Generated
    @Selector("encodeToCommandBuffer:inputMatrix:resultIndexMatrix:resultValueMatrix:")
    public native void encodeToCommandBufferInputMatrixResultIndexMatrixResultValueMatrix(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSMatrix inputMatrix,
            MPSMatrix resultIndexMatrix, MPSMatrix resultValueMatrix);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * [@property]   indexOffset
     * <p>
     * Specifies a number that will be added to all the indices written to
     * resultIndexMatrix in encodeToCommandBuffer. This value can be used
     * to offset later computations for example by adding the value for
     * the source matrix column offset sourceMatrixOrigin.y.
     * Example: Let numberOfTopKValues be 3, let the source be the following:
     * <p>
     * source = [ 6.0, 3.0, 8.0, 1.0, 9.0, 4.0, 5.0 ]
     * <p>
     * and let the sourceMatrixOrigin.y = 2.
     * <p>
     * Then if indexOffset = 2 then the result value and result index matrices will be:
     * <p>
     * result values  = [ 9.0, 8.0, 5.0 ]
     * result indices = [  4 ,  2 ,  6  ],
     * <p>
     * which gives the user indices into the original source matrix.
     * <p>
     * On the other hand if the indexOffset = 0 then the results  are as follows:
     * <p>
     * result values  = [ 9.0, 8.0, 5.0 ]
     * result indices = [  2 ,  0 ,  4  ],
     * <p>
     * which on the other hand gives the user indices into the submatrix starting
     * from sourceMatrixOrigin.y == 2.
     * <p>
     * This property is modifiable and defaults to 0. If a different behavior
     * is desired then this should be modified prior to encoding the kernel.
     */
    @Generated
    @Selector("indexOffset")
    @NUInt
    public native long indexOffset();

    @Generated
    @Selector("init")
    public native MPSMatrixFindTopK init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSMatrixFindTopK initWithCoder(NSCoder aDecoder);

    /**
     * FIXME: Fix availability macros to 10.14 and 12.0 once we get there
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSMatrixFindTopK initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSMatrixFindTopK initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * FIXME: Fix availability macros to 10.14 and 12.0 once we get there
     */
    @Generated
    @Selector("initWithDevice:numberOfTopKValues:")
    public native MPSMatrixFindTopK initWithDeviceNumberOfTopKValues(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            @NUInt long numberOfTopKValues);

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
    public static native MPSMatrixFindTopK new_objc();

    /**
     * [@property]   numberOfTopKValues
     * <p>
     * The number of highest values (and their indices) to be found in each row
     * by the kernel. This property is initialized in the kernel initialization call
     * initWithDevice, but can be modified before encoding the kernel.
     * Must be less or equal to 16 and requesting more values results in undefined behavior.
     * It is the user's responsibility to ensure that the resultIndexMatrix and resultValueMatrix
     * parameters in encodeToCommandBuffer are large enough to accommodate the results of this
     * operation, otherwise the results of the encode call are undefined.
     */
    @Generated
    @Selector("numberOfTopKValues")
    @NUInt
    public native long numberOfTopKValues();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property]   indexOffset
     * <p>
     * Specifies a number that will be added to all the indices written to
     * resultIndexMatrix in encodeToCommandBuffer. This value can be used
     * to offset later computations for example by adding the value for
     * the source matrix column offset sourceMatrixOrigin.y.
     * Example: Let numberOfTopKValues be 3, let the source be the following:
     * <p>
     * source = [ 6.0, 3.0, 8.0, 1.0, 9.0, 4.0, 5.0 ]
     * <p>
     * and let the sourceMatrixOrigin.y = 2.
     * <p>
     * Then if indexOffset = 2 then the result value and result index matrices will be:
     * <p>
     * result values  = [ 9.0, 8.0, 5.0 ]
     * result indices = [  4 ,  2 ,  6  ],
     * <p>
     * which gives the user indices into the original source matrix.
     * <p>
     * On the other hand if the indexOffset = 0 then the results  are as follows:
     * <p>
     * result values  = [ 9.0, 8.0, 5.0 ]
     * result indices = [  2 ,  0 ,  4  ],
     * <p>
     * which on the other hand gives the user indices into the submatrix starting
     * from sourceMatrixOrigin.y == 2.
     * <p>
     * This property is modifiable and defaults to 0. If a different behavior
     * is desired then this should be modified prior to encoding the kernel.
     */
    @Generated
    @Selector("setIndexOffset:")
    public native void setIndexOffset(@NUInt long value);

    /**
     * [@property]   numberOfTopKValues
     * <p>
     * The number of highest values (and their indices) to be found in each row
     * by the kernel. This property is initialized in the kernel initialization call
     * initWithDevice, but can be modified before encoding the kernel.
     * Must be less or equal to 16 and requesting more values results in undefined behavior.
     * It is the user's responsibility to ensure that the resultIndexMatrix and resultValueMatrix
     * parameters in encodeToCommandBuffer are large enough to accommodate the results of this
     * operation, otherwise the results of the encode call are undefined.
     */
    @Generated
    @Selector("setNumberOfTopKValues:")
    public native void setNumberOfTopKValues(@NUInt long value);

    /**
     * [@property]   sourceColumns
     * <p>
     * The number of columns to consider from the source in the operation.
     * This property is modifiable and defaults to NSUIntegerMax and the number is
     * adjusted dynamically at kernel encode time (see encodeToCommandBuffer) to
     * fit into the source matrix available starting from sourceMatrixOrigin.y,
     * indicating that by default the whole source matrix is used.
     * If a different size is desired then this should be modified prior to
     * encoding the kernel.
     * It is the user's responsibility to ensure that the resultIndexMatrix and resultValueMatrix
     * parameters in encodeToCommandBuffer are large enough to accommodate the results of this
     * operation, otherwise the results of the encode call are undefined.
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
     * encoding the kernel.
     * It is the user's responsibility to ensure that the resultIndexMatrix and resultValueMatrix
     * parameters in encodeToCommandBuffer are large enough to accommodate the results of this
     * operation, otherwise the results of the encode call are undefined.
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
     * encoding the kernel.
     * It is the user's responsibility to ensure that the resultIndexMatrix and resultValueMatrix
     * parameters in encodeToCommandBuffer are large enough to accommodate the results of this
     * operation, otherwise the results of the encode call are undefined.
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
     * encoding the kernel.
     * It is the user's responsibility to ensure that the resultIndexMatrix and resultValueMatrix
     * parameters in encodeToCommandBuffer are large enough to accommodate the results of this
     * operation, otherwise the results of the encode call are undefined.
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
