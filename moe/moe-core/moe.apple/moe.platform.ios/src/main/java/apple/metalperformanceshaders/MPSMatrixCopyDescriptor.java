package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLDevice;
import apple.metalperformanceshaders.struct.MPSMatrixCopyOffsets;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A list of copy operations
 * <p>
 * The MPSMatrixCopy filter can do multiple copy operations.  For RNN filters, these
 * copies are often small, and are more efficient when grouped together.
 * The MPSMatriceCopyDescriptor provides a container to list the operations.
 * The operations occur in any order, and may not alias.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSMatrixCopyDescriptor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSMatrixCopyDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSMatrixCopyDescriptor alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MPSMatrixCopyDescriptor allocWithZone(VoidPtr zone);

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
     * convenience allocator for single copies
     */
    @Generated
    @Selector("descriptorWithSourceMatrix:destinationMatrix:offsets:")
    public static native MPSMatrixCopyDescriptor descriptorWithSourceMatrixDestinationMatrixOffsets(
            MPSMatrix sourceMatrix, MPSMatrix destinationMatrix, @ByValue MPSMatrixCopyOffsets offsets);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSMatrixCopyDescriptor init();

    /**
     * initialize a MPSMatrixCopyDescriptor with default values.
     * <p>
     * Use -setCopyOperationAtIndex:sourceMatrix:destinationMatrix:copyOffsets
     * to initialize. All indices must be initialized before use.
     *
     * @param device The device on which the copy will be performed
     * @param count  The number of copy operations the object will encode
     * @return A MPSMatrixCopyDescriptor. It still needs to be initialized with
     * -setCopyOperationAtIndex:sourceMatrix:destinationMatrix:copyOffsets
     */
    @Generated
    @Selector("initWithDevice:count:")
    public native MPSMatrixCopyDescriptor initWithDeviceCount(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            @NUInt long count);

    /**
     * Initialize a MPSMatrixCopyDescriptor using offsets generated on the GPU
     * <p>
     * Use this method when the offsets needed are coming from GPU based computation.
     *
     * @param sourceMatrices      A list of matrices from which the matrix data is read
     * @param destinationMatrices A list of matrices to which to write the data. The count
     *                            must match the number of source matrices.
     * @param offsets             A MPSVector of type MPSDataTypeUInt32 containing the list of
     *                            offsets, stored as a packed array of MPSMatrixCopyOffsets.
     * @param byteOffset          A byte offset into the offsets vector where the data starts in 'offsets'.
     *                            This value must be a multiple of 16.
     * @return A valid MPSMatrixCopyDescriptor to represent the list of copy operations
     */
    @Generated
    @Selector("initWithSourceMatrices:destinationMatrices:offsetVector:offset:")
    public native MPSMatrixCopyDescriptor initWithSourceMatricesDestinationMatricesOffsetVectorOffset(
            NSArray<? extends MPSMatrix> sourceMatrices, NSArray<? extends MPSMatrix> destinationMatrices,
            MPSVector offsets, @NUInt long byteOffset);

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
    public static native MPSMatrixCopyDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Initialize a MPSMatrixCopyDescriptor using offsets generated on the CPU
     * <p>
     * This is for one at a time intialization of the copy operations
     *
     * @param index             The index of the copy operation
     * @param sourceMatrix      The source matrix for this copy operation
     * @param destinationMatrix The destination matrix for this copy operation
     * @param offsets           The offsets to use for the copy operation
     */
    @Generated
    @Selector("setCopyOperationAtIndex:sourceMatrix:destinationMatrix:offsets:")
    public native void setCopyOperationAtIndexSourceMatrixDestinationMatrixOffsets(@NUInt long index,
            MPSMatrix sourceMatrix, MPSMatrix destinationMatrix, @ByValue MPSMatrixCopyOffsets offsets);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
