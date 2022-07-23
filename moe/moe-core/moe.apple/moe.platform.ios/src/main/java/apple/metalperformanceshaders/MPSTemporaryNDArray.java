package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSTemporaryNDArray
 * <p>
 * A MPSNDArray that uses command buffer specific memory to store the array data
 * <p>
 * Temporary memory is command buffer specific memory, and is useful for MPSNDArray allocations
 * with limited lifetime within a single command buffer. Typically, most MPSNDArrays that
 * are not read or written to by the CPU or needed in other command buffers should be
 * MPSTemporaryNDArray. This will greatly reduce time spent allocating new memory, reduce memory usage
 * and help improve memory locality.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSTemporaryNDArray extends MPSNDArray {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSTemporaryNDArray(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSTemporaryNDArray alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSTemporaryNDArray allocWithZone(VoidPtr zone);

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

    /**
     * Get a well known <MPSNDArrayAllocator> that makes temporary MTLBuffers
     */
    @Generated
    @Selector("defaultAllocator")
    @MappedReturn(ObjCObjectMapper.class)
    public static native MPSNDArrayAllocator defaultAllocator();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSTemporaryNDArray init();

    @Generated
    @Selector("initWithDevice:descriptor:")
    public native MPSTemporaryNDArray initWithDeviceDescriptor(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            MPSNDArrayDescriptor descriptor);

    @Generated
    @Selector("initWithDevice:scalar:")
    public native MPSTemporaryNDArray initWithDeviceScalar(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            double value);

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
    public static native MPSTemporaryNDArray new_objc();

    /**
     * The number of times a temporary MPSNDArray may be read by a MPSNDArray... kernel
     * before its contents become undefined.
     * <p>
     * MPSTemporaryNDArrays must release their underlying buffers for reuse
     * immediately after last use. So as to facilitate *prompt* convenient
     * memory recycling, each time a MPSTemporaryNDArray is read by a
     * MPSNDArray... -encode... method, its readCount is automatically
     * decremented. When the readCount reaches 0, the underlying buffer is
     * automatically made available for reuse to MPS for its own needs and for
     * other MPSTemporaryNDArrays prior to return from the -encode.. function.
     * The contents of the buffer become undefined at this time.
     * <p>
     * By default, the readCount is initialized to 1, indicating a MPSNDArray that
     * may be overwritten any number of times, but read only once.
     * <p>
     * You may change the readCount as desired to allow MPSNDArrayKernels to read
     * the MPSTemporaryNDArray additional times. However, it is an error to change
     * the readCount once it is zero. It is an error to read or write to a
     * MPSTemporaryNDArray with a zero readCount. You may set the readCount to 0
     * yourself to cause the underlying buffer to be returned to MPS. Writing
     * to a MPSTemporaryNDArray does not adjust the readCount.
     * <p>
     * The Metal API Validation layer will assert if a MPSTemporaryNDArray is
     * deallocated with non-zero readCount to help identify cases when resources
     * are not returned promptly.
     */
    @Generated
    @Selector("readCount")
    @NUInt
    public native long readCount();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The number of times a temporary MPSNDArray may be read by a MPSNDArray... kernel
     * before its contents become undefined.
     * <p>
     * MPSTemporaryNDArrays must release their underlying buffers for reuse
     * immediately after last use. So as to facilitate *prompt* convenient
     * memory recycling, each time a MPSTemporaryNDArray is read by a
     * MPSNDArray... -encode... method, its readCount is automatically
     * decremented. When the readCount reaches 0, the underlying buffer is
     * automatically made available for reuse to MPS for its own needs and for
     * other MPSTemporaryNDArrays prior to return from the -encode.. function.
     * The contents of the buffer become undefined at this time.
     * <p>
     * By default, the readCount is initialized to 1, indicating a MPSNDArray that
     * may be overwritten any number of times, but read only once.
     * <p>
     * You may change the readCount as desired to allow MPSNDArrayKernels to read
     * the MPSTemporaryNDArray additional times. However, it is an error to change
     * the readCount once it is zero. It is an error to read or write to a
     * MPSTemporaryNDArray with a zero readCount. You may set the readCount to 0
     * yourself to cause the underlying buffer to be returned to MPS. Writing
     * to a MPSTemporaryNDArray does not adjust the readCount.
     * <p>
     * The Metal API Validation layer will assert if a MPSTemporaryNDArray is
     * deallocated with non-zero readCount to help identify cases when resources
     * are not returned promptly.
     */
    @Generated
    @Selector("setReadCount:")
    public native void setReadCount(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Initialize a MPSTemporaryNDArray for use on a MTLCommandBuffer
     *
     * @param commandBuffer The MTLCommandBuffer on which the MPSTemporaryNDArray will be exclusively used
     * @param descriptor    A valid MPSNDArrayDescriptor describing the MPSNDArray format to create
     * @return A valid MPSTemporaryNDArray. The object is not managed by a NSAutoreleasePool. The object will be
     *         released when the command buffer is committed. The underlying buffer will become invalid before
     *         this time due to the action of the readCount property. Please read and understand the use of
     *         the readCount property before using this object.
     */
    @Generated
    @Selector("temporaryNDArrayWithCommandBuffer:descriptor:")
    public static native MPSTemporaryNDArray temporaryNDArrayWithCommandBufferDescriptor(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSNDArrayDescriptor descriptor);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
