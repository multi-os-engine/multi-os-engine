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

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSMatrixCopy extends MPSKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSMatrixCopy(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSMatrixCopy alloc();

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

    /**
     * The number of columns to copy for each copy operation
     */
    @Generated
    @Selector("copyColumns")
    @NUInt
    public native long copyColumns();

    /**
     * The number of rows to copy for each copy operation
     */
    @Generated
    @Selector("copyRows")
    @NUInt
    public native long copyRows();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * If YES, the destinations are in row major storage order
     */
    @Generated
    @Selector("destinationsAreTransposed")
    public native boolean destinationsAreTransposed();

    /**
     * Encode the copy operations to the command buffer
     * 
     * @param      commandBuffer       A valid MTLCommandBuffer to receive the encoded kernel.
     * 
     * @param      copyDescriptor      The descriptor that defines the copy operator
     */
    @Generated
    @Selector("encodeToCommandBuffer:copyDescriptor:")
    public native void encodeToCommandBufferCopyDescriptor(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSMatrixCopyDescriptor copyDescriptor);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSMatrixCopy init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSMatrixCopy initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * 
     * See @ref MPSKernel#initWithCoder.
     * 
     * @param      aDecoder    The NSCoder subclass with your serialized MPSMatrixLookUpAndCopy
     * @param      device      The MTLDevice on which to make the MPSMatrixLookUpAndCopy
     * @return     A new MPSMatrixLookUpAndCopy object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSMatrixCopy initWithCoderDevice(NSCoder aDecoder, @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSMatrixCopy initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize a copy operator
     * 
     * @param      copyRows        The number of rows to copy for each copy operation
     * @param      copyColumns     The number of matrix columns to copy in each copy operation
     * @param      sourcesAreTransposed       If YES, the sources are in column major storage order
     * @param      destinationsAreTransposed  If YES, the destinations are in column major storage order
     */
    @Generated
    @Selector("initWithDevice:copyRows:copyColumns:sourcesAreTransposed:destinationsAreTransposed:")
    public native MPSMatrixCopy initWithDeviceCopyRowsCopyColumnsSourcesAreTransposedDestinationsAreTransposed(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long copyRows, @NUInt long copyColumns,
            boolean sourcesAreTransposed, boolean destinationsAreTransposed);

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

    /**
     * If YES, the sources are in row major storage order
     */
    @Generated
    @Selector("sourcesAreTransposed")
    public native boolean sourcesAreTransposed();

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

    /**
     * Encode the copy operations to the command buffer.
     *             This of the encode version support permuting the outputs with custom vectors of indices.
     *             The permutations are defined on the destination indices and are the same for each copy
     *             operation.
     * 
     * @param      commandBuffer           A valid MTLCommandBuffer to receive the encoded kernel.
     * 
     * @param      copyDescriptor          The descriptor that defines the copy operator
     * 
     * @param      rowPermuteIndices       If not nil then the output row index is
     *                                     'rowPermuteIndices[i] + rowOffset' instead of 'i + rowOffset',
     *                                     where 'i' is the local row index of the copy operation.
     *                                     Note: if destinationsAreTransposed is set to YES then the destination
     *                                     transpose is performed before permutations.
     * 
     * @param      rowPermuteOffset        Offset in numbers to apply to the 'rowPermuteIndices' vector.
     * 
     * @param      columnPermuteIndices    If not nil then the output column index is
     *                                     'columnPermuteIndices[i] + columnOffset' instead of 'i + columnOffset',
     *                                     where 'i' is the local column index of the copy operation.
     *                                     Note: if destinationsAreTransposed is set to YES then the destination
     *                                     transpose is performed before permutations.
     * 
     * @param      columnPermuteOffset     Offset in numbers to apply to the 'columnPermuteIndices' vector.
     */
    @Generated
    @Selector("encodeToCommandBuffer:copyDescriptor:rowPermuteIndices:rowPermuteOffset:columnPermuteIndices:columnPermuteOffset:")
    public native void encodeToCommandBufferCopyDescriptorRowPermuteIndicesRowPermuteOffsetColumnPermuteIndicesColumnPermuteOffset(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSMatrixCopyDescriptor copyDescriptor,
            MPSVector rowPermuteIndices, @NUInt long rowPermuteOffset, MPSVector columnPermuteIndices,
            @NUInt long columnPermuteOffset);
}