package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLBuffer;
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
 * MPSPredicate
 * [@dependency] This depends on Metal.framework
 * 
 * A MPSPredicate can be used to run MPS kernels subject to a predicate.
 * 
 * The MPSPredicate defines a way to refrain running a kernel on the GPU
 * based on values computed on the GPU. That way one can build control flow operations
 * that do the decisions on the GPU side mitigating the need to synchronize CPU and GPU
 * execution. The predicate is used with the version of encode calls that take
 * a object of type @ref MPSKernelEncodeOptions as a parameter (@see MPSCNNKernel for example).
 * The code associated with the kernel's encode call is executed on the GPU if and only if
 * the predicate is considered to be true.
 * NOTE: It is advisable to release MPSPredicate objects promptly as they take a reference
 * to a MTLBuffer object and therefore can keep the memory allocated for long periods of time.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSPredicate extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSPredicate(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSPredicate alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSPredicate allocWithZone(VoidPtr zone);

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
    public native MPSPredicate init();

    /**
     * Initializes a MPSPredicate object with a buffer and given offset.
     * 
     * @param buffer The buffer to use as a predicate.
     * @param offset Byteoffset to the predicate buffer where the predicate is stored.
     * @return A pointer to the newly initialized MPSPredicate object.
     */
    @Generated
    @Selector("initWithBuffer:offset:")
    public native MPSPredicate initWithBufferOffset(@NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer buffer,
            @NUInt long offset);

    /**
     * Initializes a MPSPredicate object for a given device.
     * 
     * NOTE: The metal buffer used by the resulting MPSPredicate object may be
     * shared among many MPSPredicate objects and therefore care must be used when
     * writing to this buffer: writing to any other location in this buffer than the
     * four bytes at the offset @ref predicateOffset results in undefined behavior.
     * 
     * @param device The device the predicate is used with
     * @return A pointer to the newly initialized MPSPredicate object.
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSPredicate initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device);

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
    public static native MPSPredicate new_objc();

    /**
     * [@property] predicateBuffer
     * 
     * The buffer that is used as the predicate
     */
    @NotNull
    @Generated
    @Selector("predicateBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer predicateBuffer();

    /**
     * [@property] predicateOffset
     * 
     * Location of the predicate in bytes, must be multiple of four.
     * 
     * If the uint32_t value stored at this location in @ref predicateBuffer is other than zero,
     * then the predicate is considered to be true and the code is executed on the GPU.
     * With this property a single MPSPredicate object can be used with multiple different predication
     * operations.
     * Default = 0;
     */
    @Generated
    @Selector("predicateOffset")
    @NUInt
    public native long predicateOffset();

    /**
     * Initializes a MPSPredicate object with a buffer and given offset.
     * 
     * @param buffer The buffer to use as a predicate.
     * @param offset Byteoffset to the predicate buffer where the predicate is stored.
     * @return A pointer to the newly initialized MPSPredicate object.
     */
    @Generated
    @Selector("predicateWithBuffer:offset:")
    public static native MPSPredicate predicateWithBufferOffset(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset);

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
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
