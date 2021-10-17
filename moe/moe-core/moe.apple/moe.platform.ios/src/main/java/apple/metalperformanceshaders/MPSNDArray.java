package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLBuffer;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metalperformanceshaders.protocol.MPSNDArrayAllocator;
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
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSNDArray
 * <p>
 * A MPSNDArray object is a MTLBuffer based storage container for multi-dimensional data.
 * <p>
 * Operations on MPSNDArrays will commonly implicitly reshape the multidimensional
 * structure into a 2-dimensional structure by reinterpreting higher dimensions as a single dimensional
 * array of matrix rows. For example a [a, b, c, d] NDArray passed to a matrix multiplication may
 * be implicitly reinterpreted as a [a*b*c, d] matrix and a 2D matrix multiplication performed.
 * In practice, the major row (the dimension in which successive elements appear adjacent to one
 * another in memory) is the 0th dimension (represented as 'd' in the above example).  It has both a
 * dimension size indicating the number of elements and a storage size which may be slightly bigger
 * to allow for performance improvement arising from better data alignment in memory.  In principle,
 * the rowBytes may also be used to create a 0th-dimension slice out of a larger array stored in the
 * underlying MTLBuffer.
 * <p>
 * MPS will automatically manage the storage size of the major row ("rowBytes") though you may
 * set it in the descriptor if you have a need to do so. Generally, it should be at least a multiple
 * of 16 bytes.   Dimensions after the 0th are a densely packed array of rows of size rowBytes.
 * Thus, the 1st dimension is an array of rows. The 2nd dimension is an array of arrays of rows with
 * identical size, and so forth.  When the reduction to 2 dimensions is done, no data is moved. MPS
 * just reinterprets a higher order N-1 dimensions of matrix rows as a single large 1-dimensional
 * array of rows.
 * <p>
 * It is a common desire to reorder the dimensions of NDArrays or define a subregion thereof. A transpose
 * or slice operation is performed by making a MPSNDArray view of the original. The dimensions to transpose
 * or slice are given by the descriptor for the new view. If both a transpose and slice operation are defined,
 * then the slice is performed first and the result of the slice is transposed. Because many MPS kernels can
 * operate on transposed data at speed, MPS will usually defer doing a physical transpose operation until later,
 * when it becomes clear that one is actually required. For this reason, conversions to formats that do not
 * support deferred transposes and slices such as MPSMatrix MPSVector view or using -exportWithCommandBuffer:
 * toBuffer:offset:rowStrides, may cause substantial new computation to be done and new memory to be allocated.
 * These should be avoided except when necessary.  As a general rule, transposes that do not involve the 0th
 * dimension should be able to be handled by nearly everything natively. MPSNDArrayMatrixMultiplication and reductions
 * can handle 0th dimension transposes. Other filters may insert a physical repacking operation. If you wish
 * to force a physical repacking use MPSAliasingStrategyShallNotAlias. To avoid confusion with aliased NDArrays
 * the parent property is provided.  MPSNDArrays that alias share a common ancestor.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNDArray extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNDArray(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNDArray alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * Make a new representation of a MPSNDArray with a slice, transpose or other change in property
     * <p>
     * If possible, the views will merely record the slice or transpose without performing the
     * operation. Many MPSKernels are able to operate on subregions of a MPSNDArray or operate on transposed
     * data, so making a new copy of the data for these operations would be wasteful.  A copy may be forced by
     * a change in dataType, rowBytes, or when using a view with a MPSKernel that does not support
     * the deferred operation. To force an operation to occur immediately, use MPSAliasingStrategyShallNotAlias
     * Otherwise, it is likely that the new MPSNDArray will share a MTLBuffer with the parent and alias
     * its memory.
     *
     * @param cmdBuf     The command buffer on which to perform physical copies if any are required
     * @param descriptor A MPSNDArrayDescriptor describing the shape of the new view of the data
     * @param aliasing   A aliasing strategy to direct MPS how to respond to cases when aliasing can or can not
     *                   be performed.
     * @return A new MPSNDArray, if it is possible to make one. Otherwise nil is returned. The MPSNDArray is autoreleased.
     */
    @Generated
    @Selector("arrayViewWithCommandBuffer:descriptor:aliasing:")
    public native MPSNDArray arrayViewWithCommandBufferDescriptorAliasing(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, MPSNDArrayDescriptor descriptor,
            @NUInt long aliasing);

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
     * The type of data stored by each element in the array
     */
    @Generated
    @Selector("dataType")
    public native int dataType();

    /**
     * The size of one element in the MPSNDArray
     */
    @Generated
    @Selector("dataTypeSize")
    @NUInt
    public native long dataTypeSize();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * Get a well known <MPSNDArrayAllocator> that makes standard MTLBuffers
     */
    @Generated
    @Selector("defaultAllocator")
    @MappedReturn(ObjCObjectMapper.class)
    public static native MPSNDArrayAllocator defaultAllocator();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Create a MPSNDArrayDescriptor that describes this MPSNDArray
     * <p>
     * The descriptor will describe the shape of the MPSNDArray
     * after all deferred slicing and transposes have completed.
     * A new descriptor is created each time to allow for
     * further customization of the descriptor by the application.
     *
     * @return A new autoreleased MPSNDArrayDescriptor that matches the
     * shape of the MPSNDArray, suitable for introduction of slice,
     * cast and transpose operations.
     */
    @Generated
    @Selector("descriptor")
    public native MPSNDArrayDescriptor descriptor();

    /**
     * [@property] device
     * <p>
     * The device on which the MSPNDArray may be used
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLDevice device();

    /**
     * Do a GPU side copy of the contents of a MPSNDArray to a MTLBuffer
     * <p>
     * To do a transpose or slice as part of the operation, make a MPSNDArray view first that encodes that operation.
     *
     * @param cmdBuf              The command buffer on which to encode the operation
     * @param buffer              The destination to overwrite
     * @param destinationDataType The destination data type.
     * @param offset              The byte offset to where the {0,0,0...}th element will be written
     * @param rowStrides          An optional array of (numberOfDimensions-1) byte counts which describe
     *                            the byte offset from position 0 of the respective dimension to position 1.
     */
    @Generated
    @Selector("exportDataWithCommandBuffer:toBuffer:destinationDataType:offset:rowStrides:")
    public native void exportDataWithCommandBufferToBufferDestinationDataTypeOffsetRowStrides(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, @Mapped(ObjCObjectMapper.class) MTLBuffer buffer,
            int destinationDataType, @NUInt long offset, NIntPtr rowStrides);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Do a GPU side copy of the contents of a MTLBuffer into a MPSNDArray
     * <p>
     * Copy data from provided buffer to the NDArray. Implicit transposes and slicing shall be honored.
     *
     * @param cmdBuf         The command buffer on which to encode the operation
     * @param buffer         The destination to read from
     * @param sourceDataType The source data type.
     * @param offset         The byte offset in the buffer from where the {0,0,0...}th element is to be read.
     * @param rowStrides     An optional array of (numberOfDimensions-1) byte counts which describe
     *                       the byte offset from position 0 of the respective dimension to position 1.
     */
    @Generated
    @Selector("importDataWithCommandBuffer:fromBuffer:sourceDataType:offset:rowStrides:")
    public native void importDataWithCommandBufferFromBufferSourceDataTypeOffsetRowStrides(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, @Mapped(ObjCObjectMapper.class) MTLBuffer buffer,
            int sourceDataType, @NUInt long offset, NIntPtr rowStrides);

    @Generated
    @Selector("init")
    public native MPSNDArray init();

    /**
     * Initialize an MPSNDArrayDescriptor object on a device
     * for given dimension sizes in descriptor.
     *
     * @param device     The device on which the data type will be created.
     * @param descriptor The MPSNDArrayDescriptor used for initializing the the NDArray
     * @return A valid MPSNDArray object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:descriptor:")
    public native MPSNDArray initWithDeviceDescriptor(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            MPSNDArrayDescriptor descriptor);

    /**
     * Create a 1-Dimensional length=1 NDArray to hold a scalar
     */
    @Generated
    @Selector("initWithDevice:scalar:")
    public native MPSNDArray initWithDeviceScalar(@Mapped(ObjCObjectMapper.class) MTLDevice device, double value);

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
     * A used specified string to help identify the array during debugging.
     * <p>
     * May be externally visible to tools like Instruments
     */
    @Generated
    @Selector("label")
    public native String label();

    /**
     * The number of elements in the dimension at dimensionIndex
     * <p>
     * The dimension length is at least as large as the existing
     * slice length.  Views of this MPSNDArray may have differing
     * dimension lengths.
     */
    @Generated
    @Selector("lengthOfDimension:")
    @NUInt
    public native long lengthOfDimension(@NUInt long dimensionIndex);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * Number of dimensions in the NDArray
     */
    @Generated
    @Selector("numberOfDimensions")
    @NUInt
    public native long numberOfDimensions();

    /**
     * The parent MPSNDArray that this object aliases
     * <p>
     * If the MPSNDArray was createrd as a array view of another MPSNDArray object, and aliases content
     * in the same MTLBuffer, the original MPSNDArray will be retained as the parent here. Two MPSNDArrays
     * alias if they share a common ancestor. Note that the parent may itself have a parent, and so forth.
     */
    @Generated
    @Selector("parent")
    public native MPSNDArray parent();

    /**
     * Copy bytes from MPSNDArray into buffer
     * <p>
     * The dimensionality and size of the copy region is given by the size of the MPSNDArray
     * For subregions, use a MPSNDArray view.
     *
     * @param buffer                  A pointer to memory where to write the data
     * @param strideBytesPerDimension An optional array of numberOfDimensions sizes, which gives the distance
     *                                in bytes from one element to the next in that dimension in buffer. The first value
     *                                is typically dataTypeSize. The next is a row bytes. The next is 2d matrix bytes,
     *                                and so forth.  If the value is nil, these are calculated for you assuming that the
     *                                data is packed without additional space in between elements, rows, etc.
     *                                0 and negative values are permitted.
     */
    @Generated
    @Selector("readBytes:strideBytes:")
    public native void readBytesStrideBytes(VoidPtr buffer, NIntPtr strideBytesPerDimension);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Get the number of bytes used to allocate underyling MTLResources
     * <p>
     * This is the size of the backing store of underlying MTLResources.
     * It does not include all storage used by the object, for example
     * the storage used to hold the MPSNDArray instantiation and MTLBuffer
     * is not included. It only measures the size of the allocation used
     * to hold the MPSNDArray data in the MTLBuffer. This value is subject to
     * change between different devices and operating systems.
     * <p>
     * Except when -initWithBuffer:descriptor: is used, most MPSNDArrays are allocated
     * initiallly without a backing store. The backing store is allocated lazily when
     * it is needed, typically when the MPSNDArray is written to the first time.
     * Consequently, in most cases, it should be inexpensive to make
     * a MPSImage to see how much memory it will need, and release it
     * if it is too large.
     */
    @Generated
    @Selector("resourceSize")
    @NUInt
    public native long resourceSize();

    /**
     * A used specified string to help identify the array during debugging.
     * <p>
     * May be externally visible to tools like Instruments
     */
    @Generated
    @Selector("setLabel:")
    public native void setLabel(String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Use a blit encoder if a discrete device to update CPU contents of underlying buffer with latest GPU value
     *
     * @param commandBuffer The commandBuffer on which we transfer the contents.
     */
    @Generated
    @Selector("synchronizeOnCommandBuffer:")
    public native void synchronizeOnCommandBuffer(@Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Copy bytes from a buffer into the MPSNDArray
     * <p>
     * The dimensionality and size of the copy region is given by the size of the MPSNDArray
     * For subregions, use a MPSNDArray view.
     *
     * @param buffer                  A pointer to memory where to read the data
     * @param strideBytesPerDimension An optional array of numberOfDimensions sizes, which gives the distance
     *                                in bytes from one element to the next in that dimension in buffer. The first value
     *                                is typically dataTypeSize. The next is a row bytes. The next is 2d matrix bytes,
     *                                and so forth.  If strideBytesPerDimension is nil, these are calculated for you assuming that the
     *                                data is packed without additional space in between elements, rows, etc.
     *                                0 and negative values are permitted.
     */
    @Generated
    @Selector("writeBytes:strideBytes:")
    public native void writeBytesStrideBytes(VoidPtr buffer, NIntPtr strideBytesPerDimension);
}
