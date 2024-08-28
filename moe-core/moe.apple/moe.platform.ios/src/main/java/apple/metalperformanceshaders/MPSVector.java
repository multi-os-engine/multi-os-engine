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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSVector
 * 
 * [@dependency] This depends on Metal.framework
 * 
 * A MPSVector object describes a 1-dimensional array of data and provides storage
 * for its values. Some MPSMatrixKernel objects operate on MPSVector objects
 * for convenience.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSVector extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSVector(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSVector alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSVector allocWithZone(VoidPtr zone);

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

    /**
     * [@property] data
     * 
     * An MTLBuffer to store the data.
     */
    @NotNull
    @Generated
    @Selector("data")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer data();

    /**
     * [@property] dataType
     * 
     * The type of the MPSVector data.
     */
    @Generated
    @Selector("dataType")
    public native int dataType();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] device
     * 
     * The device on which the MPSVector will be used.
     */
    @NotNull
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLDevice device();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSVector init();

    /**
     * Initialize a MPSVector object with a MTLBuffer.
     * 
     * This function returns a MPSVector object which uses the supplied MTLBuffer. The
     * length, number of vectors, and stride between vectors are specified by the
     * MPSVectorDescriptor object.
     * 
     * The provided MTLBuffer must have enough storage to hold
     * 
     * (descriptor.vectors-1) * descriptor.vectorBytes +
     * descriptor.length * (element size) bytes.
     * 
     * @param buffer     The MTLBuffer object which contains the data to use for the
     *                   MPSVector. May not be NULL.
     * 
     * @param descriptor The MPSVectorDescriptor. May not be NULL.
     * 
     * @return A valid MPSVector object or nil, if failure.
     */
    @Generated
    @Selector("initWithBuffer:descriptor:")
    public native MPSVector initWithBufferDescriptor(@NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer buffer,
            @NotNull MPSVectorDescriptor descriptor);

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

    /**
     * [@property] length
     * 
     * The number of elements in the vector.
     */
    @Generated
    @Selector("length")
    @NUInt
    public native long length();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSVector new_objc();

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

    /**
     * [@property] vectorBytes
     * 
     * The stride, in bytes, between corresponding elements of
     * consecutive vectors.
     */
    @Generated
    @Selector("vectorBytes")
    @NUInt
    public native long vectorBytes();

    /**
     * [@property] vectors
     * 
     * The number of vectors in the MPSVector.
     */
    @Generated
    @Selector("vectors")
    @NUInt
    public native long vectors();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Initialize a MPSVector object with a MTLBuffer and an offset.
     * 
     * @param buffer     The MTLBuffer containing the data.
     * 
     * @param offset     The offset, in bytes, into the buffer at which data begins.
     * 
     * @param descriptor The MPSVectorDescriptor.
     * 
     *                   API-Since: 13.0
     */
    @Generated
    @Selector("initWithBuffer:offset:descriptor:")
    public native MPSVector initWithBufferOffsetDescriptor(@NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer buffer,
            @NUInt long offset, @NotNull MPSVectorDescriptor descriptor);

    /**
     * Initialize a lazily backed MPSVector object with a descriptor
     * 
     * The vector object will be created, but the storage to hold the
     * vector data will only be allocated when it is needed, typically
     * when the data property is invoked. In conjunction
     * with -resourceSize, this will allow you to estimate storage needs
     * without actually creating the backing store for the vector.
     * 
     * API-Since: 11.3
     * 
     * @param device     The device with which it will be used
     * @param descriptor The shape and style of the matrix
     * @return A valid MPSVector object or nil
     */
    @Generated
    @Selector("initWithDevice:descriptor:")
    public native MPSVector initWithDeviceDescriptor(@NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device,
            @NotNull MPSVectorDescriptor descriptor);

    /**
     * [@property] offset
     * 
     * Byte-offset to the buffer where the vector data begins - see @ref initWithBuffer: offset: descriptor: .
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("offset")
    @NUInt
    public native long offset();

    /**
     * Get the number of bytes used to allocate underyling MTLResources
     * 
     * This is the size of the backing store of underlying MTLResources.
     * It does not include all storage used by the object, for example
     * the storage used to hold the MPSVector instantiation and MTLBuffer
     * is not included. It only measures the size of the allocation used
     * to hold the vector data in the buffer. This value is subject to
     * change between different devices and operating systems.
     * 
     * Except when -initWithBuffer:descriptor: is used, most MPSVectors are allocated
     * without a backing store. The backing store is allocated lazily when
     * it is needed, typically when the .texture property is called.
     * Consequently, in most cases, it should be inexpensive to make
     * a MPSMatrix to see how much memory it will need, and release it
     * if it is too large.
     * 
     * This method may fail in certain circumstances, such as when the
     * MPSMatrix is created with -initWithBuffer:descriptor:. In
     * such cases, 0 will be returned.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("resourceSize")
    @NUInt
    public native long resourceSize();

    /**
     * Flush the underlying MTLBuffer from the device's caches, and invalidate any CPU caches if needed.
     * 
     * This will call [id <MTLBlitEncoder> synchronizeResource: ] on the vector's MTLBuffer, if any.
     * This is necessary for all MTLStorageModeManaged resources. For other resources, including temporary
     * resources (these are all MTLStorageModePrivate), and buffers that have not yet been allocated, nothing is done.
     * It is more efficient to use this method than to attempt to do this yourself with the data property.
     * 
     * @param commandBuffer The commandbuffer on which to synchronize
     * 
     *                      API-Since: 11.3
     */
    @Generated
    @Selector("synchronizeOnCommandBuffer:")
    public native void synchronizeOnCommandBuffer(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
