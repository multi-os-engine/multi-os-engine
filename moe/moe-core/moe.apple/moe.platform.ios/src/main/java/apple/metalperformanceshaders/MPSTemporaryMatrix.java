package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A MPSMatrix allocated on GPU private memory.
 * 
 * It may alias one or more other MPSTemporaryMatrices. Undesired data destruction
 * due to aliasing is avoided using the readCount property.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSTemporaryMatrix extends MPSMatrix {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSTemporaryMatrix(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSTemporaryMatrix alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSTemporaryMatrix allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSTemporaryMatrix init();

    @Generated
    @Selector("initWithBuffer:descriptor:")
    public native MPSTemporaryMatrix initWithBufferDescriptor(@NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer buffer,
            @NotNull MPSMatrixDescriptor descriptor);

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
    public static native MPSTemporaryMatrix new_objc();

    /**
     * Help MPS decide which allocations to make ahead of time
     * 
     * The buffer cache that underlies the MPSTemporaryMatrix can automatically allocate new storage as
     * needed as you create new temporary matrices. However, sometimes a more global view of what you
     * plan to make is useful for maximizing memory reuse to get the most efficient operation.
     * This class method hints to the cache what the list of matrices will be.
     * 
     * It is never necessary to call this method. It is purely a performance and memory optimization.
     * 
     * @param commandBuffer  The command buffer on which the MPSTemporaryMatrix will be used
     * @param descriptorList A NSArray of MPSMatrixDescriptor, indicating matrices that will be created
     */
    @Generated
    @Selector("prefetchStorageWithCommandBuffer:matrixDescriptorList:")
    public static native void prefetchStorageWithCommandBufferMatrixDescriptorList(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @NotNull NSArray<? extends MPSMatrixDescriptor> descriptorList);

    /**
     * The number of times a temporary matrix may be read by a MPSMatrix... kernel
     * before its contents become undefined.
     * 
     * MPSTemporaryMatrices must release their underlying buffers for reuse
     * immediately after last use. So as to facilitate *prompt* convenient
     * memory recycling, each time a MPSTemporaryMatrix is read by a
     * MPSMatrix... -encode... method, its readCount is automatically
     * decremented. When the readCount reaches 0, the underlying buffer is
     * automatically made available for reuse to MPS for its own needs and for
     * other MPSTemporaryMatrices prior to return from the -encode.. function.
     * The contents of the buffer become undefined at this time.
     * 
     * By default, the readCount is initialized to 1, indicating a matrix that
     * may be overwritten any number of times, but read only once.
     * 
     * You may change the readCount as desired to allow MPSMatrixKernels to read
     * the MPSTemporaryMatrix additional times. However, it is an error to change
     * the readCount once it is zero. It is an error to read or write to a
     * MPSTemporaryMatrix with a zero readCount. You may set the readCount to 0
     * yourself to cause the underlying buffer to be returned to MPS. Writing
     * to a MPSTemporaryMatrix does not adjust the readCount.
     * 
     * The Metal API Validation layer will assert if a MPSTemporaryMatrix is
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
     * The number of times a temporary matrix may be read by a MPSMatrix... kernel
     * before its contents become undefined.
     * 
     * MPSTemporaryMatrices must release their underlying buffers for reuse
     * immediately after last use. So as to facilitate *prompt* convenient
     * memory recycling, each time a MPSTemporaryMatrix is read by a
     * MPSMatrix... -encode... method, its readCount is automatically
     * decremented. When the readCount reaches 0, the underlying buffer is
     * automatically made available for reuse to MPS for its own needs and for
     * other MPSTemporaryMatrices prior to return from the -encode.. function.
     * The contents of the buffer become undefined at this time.
     * 
     * By default, the readCount is initialized to 1, indicating a matrix that
     * may be overwritten any number of times, but read only once.
     * 
     * You may change the readCount as desired to allow MPSMatrixKernels to read
     * the MPSTemporaryMatrix additional times. However, it is an error to change
     * the readCount once it is zero. It is an error to read or write to a
     * MPSTemporaryMatrix with a zero readCount. You may set the readCount to 0
     * yourself to cause the underlying buffer to be returned to MPS. Writing
     * to a MPSTemporaryMatrix does not adjust the readCount.
     * 
     * The Metal API Validation layer will assert if a MPSTemporaryMatrix is
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
     * Initialize a MPSTemporaryMatrix for use on a MTLCommandBuffer
     * 
     * @param commandBuffer    The MTLCommandBuffer on which the MPSTemporaryMatrix will be exclusively used
     * @param matrixDescriptor A valid MPSMatrixDescriptor describing the MPSMatrix format to create
     * @return A valid MPSTemporaryMatrix. The object is not managed by a NSAutoreleasePool. The object will be
     *         released when the command buffer is committed. The underlying buffer will become invalid before
     *         this time due to the action of the readCount property. Please read and understand the use of
     *         the readCount property before using this object.
     */
    @Generated
    @Selector("temporaryMatrixWithCommandBuffer:matrixDescriptor:")
    public static native MPSTemporaryMatrix temporaryMatrixWithCommandBufferMatrixDescriptor(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @NotNull MPSMatrixDescriptor matrixDescriptor);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("initWithBuffer:offset:descriptor:")
    public native MPSTemporaryMatrix initWithBufferOffsetDescriptor(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset,
            @NotNull MPSMatrixDescriptor descriptor);

    @Generated
    @Selector("initWithDevice:descriptor:")
    public native MPSTemporaryMatrix initWithDeviceDescriptor(@NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device,
            @NotNull MPSMatrixDescriptor descriptor);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
