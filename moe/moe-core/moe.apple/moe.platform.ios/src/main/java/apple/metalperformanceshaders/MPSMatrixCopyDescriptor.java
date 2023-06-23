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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A list of copy operations
 * 
 * The MPSMatrixCopy filter can do multiple copy operations. For RNN filters, these
 * copies are often small, and are more efficient when grouped together.
 * The MPSMatriceCopyDescriptor provides a container to list the operations.
 * The operations occur in any order, and may not alias.
 * 
 * API-Since: 11.0
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSMatrixCopyDescriptor allocWithZone(VoidPtr zone);

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
     * convenience allocator for single copies
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("descriptorWithSourceMatrix:destinationMatrix:offsets:")
    public static native MPSMatrixCopyDescriptor descriptorWithSourceMatrixDestinationMatrixOffsets(
            @NotNull MPSMatrix sourceMatrix, @NotNull MPSMatrix destinationMatrix,
            @ByValue MPSMatrixCopyOffsets offsets);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSMatrixCopyDescriptor init();

    /**
     * initialize a MPSMatrixCopyDescriptor with default values.
     * 
     * Use -setCopyOperationAtIndex:sourceMatrix:destinationMatrix:copyOffsets
     * to initialize. All indices must be initialized before use.
     * 
     * @param device The device on which the copy will be performed
     * @param count  The number of copy operations the object will encode
     * @return A MPSMatrixCopyDescriptor. It still needs to be initialized with
     *         -setCopyOperationAtIndex:sourceMatrix:destinationMatrix:copyOffsets
     * 
     *         API-Since: 11.0
     */
    @Generated
    @Selector("initWithDevice:count:")
    public native MPSMatrixCopyDescriptor initWithDeviceCount(@NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device,
            @NUInt long count);

    /**
     * Initialize a MPSMatrixCopyDescriptor using offsets generated on the GPU
     * 
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
     * 
     *         API-Since: 11.0
     */
    @Generated
    @Selector("initWithSourceMatrices:destinationMatrices:offsetVector:offset:")
    public native MPSMatrixCopyDescriptor initWithSourceMatricesDestinationMatricesOffsetVectorOffset(
            @NotNull NSArray<? extends MPSMatrix> sourceMatrices,
            @NotNull NSArray<? extends MPSMatrix> destinationMatrices, @Nullable MPSVector offsets,
            @NUInt long byteOffset);

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
    public static native MPSMatrixCopyDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Initialize a MPSMatrixCopyDescriptor using offsets generated on the CPU
     * 
     * This is for one at a time intialization of the copy operations
     * 
     * @param index             The index of the copy operation
     * @param sourceMatrix      The source matrix for this copy operation
     * @param destinationMatrix The destination matrix for this copy operation
     * @param offsets           The offsets to use for the copy operation
     * 
     *                          API-Since: 11.0
     */
    @Generated
    @Selector("setCopyOperationAtIndex:sourceMatrix:destinationMatrix:offsets:")
    public native void setCopyOperationAtIndexSourceMatrixDestinationMatrixOffsets(@NUInt long index,
            @NotNull MPSMatrix sourceMatrix, @NotNull MPSMatrix destinationMatrix,
            @ByValue MPSMatrixCopyOffsets offsets);

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
