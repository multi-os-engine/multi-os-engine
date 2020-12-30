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

/**
 * @class      MPSPredicate
 * @dependency This depends on Metal.framework
 * @abstract   A MPSPredicate can be used to run MPS kernels subject to a predicate.
 * @discussion The MPSPredicate defines a way to refrain running a kernel on the GPU
 *             based on values computed on the GPU. That way one can build control flow operations
 *             that do the decisions on the GPU side mitigating the need to synchronize CPU and GPU
 *             execution. The predicate is used with the version of encode calls that take
 *             a object of type @ref MPSKernelEncodeOptions as a parameter (@see MPSCNNKernel for example).
 *             The code associated with the kernel's encode call is executed on the GPU if and only if
 *             the predicate is considered to be true.
 *             NOTE: It is advisable to release MPSPredicate objects promptly as they take a reference
 *             to a MTLBuffer object and therefore can keep the memory allocated for long periods of time.
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
     * @abstract   Initializes a MPSPredicate object with a buffer and given offset.
     * @param      buffer      The buffer to use as a predicate.
     * @param      offset      Byteoffset to the predicate buffer where the predicate is stored.
     * @result     A pointer to the newly initialized MPSPredicate object.
     */
    @Generated
    @Selector("initWithBuffer:offset:")
    public native MPSPredicate initWithBufferOffset(@Mapped(ObjCObjectMapper.class) MTLBuffer buffer,
            @NUInt long offset);

    /**
     * @abstract   Initializes a MPSPredicate object for a given device.
     * @discussion NOTE: The metal buffer used by the resulting MPSPredicate object may be
     *             shared among many MPSPredicate objects and therefore care must be used when
     *             writing to this buffer: writing to any other location in this buffer than the
     *             four bytes at the offset @ref predicateOffset results in undefined behavior.
     * 
     * @param      device      The device the predicate is used with
     * @result     A pointer to the newly initialized MPSPredicate object.
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSPredicate initWithDevice(@Mapped(ObjCObjectMapper.class) MTLDevice device);

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

    /**
     * @property predicateBuffer
     * @abstract The buffer that is used as the predicate
     */
    @Generated
    @Selector("predicateBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer predicateBuffer();

    /**
     * @property   predicateOffset
     * @abstract   Location of the predicate in bytes, must be multiple of four.
     * @discussion If the uint32_t value stored at this location in @ref predicateBuffer is other than zero,
     *             then the predicate is considered to be true and the code is executed on the GPU.
     *             With this property a single MPSPredicate object can be used with multiple different predication
     *             operations.
     *             Default = 0;
     */
    @Generated
    @Selector("predicateOffset")
    @NUInt
    public native long predicateOffset();

    /**
     * @abstract   Initializes a MPSPredicate object with a buffer and given offset.
     * @param      buffer      The buffer to use as a predicate.
     * @param      offset      Byteoffset to the predicate buffer where the predicate is stored.
     * @result     A pointer to the newly initialized MPSPredicate object.
     */
    @Generated
    @Selector("predicateWithBuffer:offset:")
    public static native MPSPredicate predicateWithBufferOffset(@Mapped(ObjCObjectMapper.class) MTLBuffer buffer,
            @NUInt long offset);

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
}