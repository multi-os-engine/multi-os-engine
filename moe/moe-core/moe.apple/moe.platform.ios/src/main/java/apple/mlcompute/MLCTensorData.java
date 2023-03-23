package apple.mlcompute;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MLCTensorData
 * 
 * An object to encapsulate memory to be used as tensor data
 * 
 * API-Since: 14.0
 */
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCTensorData extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCTensorData(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCTensorData alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLCTensorData allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * [@property] bytes
     * 
     * Pointer to memory that contains or will be used for tensor data
     */
    @Generated
    @Selector("bytes")
    public native VoidPtr bytes();

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
     * Creates a data object that holds a given number of bytes from a given buffer.
     * [@note] The returned object will not take ownership of the \p bytes pointer and thus will not free it on
     * deallocation.
     * 
     * @param bytes  A buffer containing data for the new object.
     * @param length The number of bytes to hold from \p bytes. This value must not exceed the length of \p bytes.
     * @return A new \p MLCTensorData object.
     */
    @Generated
    @Selector("dataWithBytesNoCopy:length:")
    public static native MLCTensorData dataWithBytesNoCopyLength(VoidPtr bytes, @NUInt long length);

    /**
     * [@absract] Creates a data object that holds a given number of bytes from a given buffer. with a custom
     * deallocator block.
     * 
     * @param bytes       A buffer containing data for the new object.
     * @param length      The number of bytes to hold from \p bytes. This value must not exceed the length of \p bytes.
     * @param deallocator A block to invoke when the resulting object is deallocated.
     * @return A new \p MLCTensorData object.
     * 
     *         API-Since: 14.5
     */
    @Generated
    @Selector("dataWithBytesNoCopy:length:deallocator:")
    public static native MLCTensorData dataWithBytesNoCopyLengthDeallocator(VoidPtr bytes, @NUInt long length,
            @ObjCBlock(name = "call_dataWithBytesNoCopyLengthDeallocator") Block_dataWithBytesNoCopyLengthDeallocator deallocator);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_dataWithBytesNoCopyLengthDeallocator {
        @Generated
        void call_dataWithBytesNoCopyLengthDeallocator(VoidPtr bytes, @NUInt long length);
    }

    /**
     * Creates a data object that holds a given number of bytes from a given buffer.
     * [@note] The returned object will not take ownership of the \p bytes pointer and thus will not free it on
     * deallocation. The underlying bytes in the return object should not be mutated.
     * 
     * @param bytes  A buffer containing data for the new object.
     * @param length The number of bytes to hold from \p bytes. This value must not exceed the length of \p bytes.
     * @return A new \p MLCTensorData object.
     */
    @Generated
    @Selector("dataWithImmutableBytesNoCopy:length:")
    public static native MLCTensorData dataWithImmutableBytesNoCopyLength(ConstVoidPtr bytes, @NUInt long length);

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
    public native MLCTensorData init();

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
     * [@property] length
     * 
     * The size in bytes of the tensor data
     */
    @Generated
    @Selector("length")
    @NUInt
    public native long length();

    @Generated
    @Owned
    @Selector("new")
    public static native MLCTensorData new_objc();

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
