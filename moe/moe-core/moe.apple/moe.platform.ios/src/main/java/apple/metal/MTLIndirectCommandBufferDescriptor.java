package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
 * @abstract
 * Describes the limits and features that can be used in an indirect command
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLIndirectCommandBufferDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLIndirectCommandBufferDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLIndirectCommandBufferDescriptor alloc();

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
     * @abstract
     * A bitfield of the command types that be encoded.
     * @discussion
     * MTLCommandTypeDispatch cannot be mixed with any other command type.
     */
    @Generated
    @Selector("commandTypes")
    @NUInt
    public native long commandTypes();

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

    /**
     * @abstract
     * Whether the render or compute pipeline can set arguments.
     */
    @Generated
    @Selector("inheritBuffers")
    public native boolean inheritBuffers();

    /**
     * @abstract
     * Whether the render or compute pipeline are inherited from the encoder
     */
    @Generated
    @Selector("inheritPipelineState")
    public native boolean inheritPipelineState();

    @Generated
    @Selector("init")
    public native MTLIndirectCommandBufferDescriptor init();

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
     * @absract
     * The maximum bind index of fragment argument buffers that can be set per command.
     */
    @Generated
    @Selector("maxFragmentBufferBindCount")
    @NUInt
    public native long maxFragmentBufferBindCount();

    /**
     * @absract
     * The maximum bind index of kernel (or tile) argument buffers that can be set per command.
     */
    @Generated
    @Selector("maxKernelBufferBindCount")
    @NUInt
    public native long maxKernelBufferBindCount();

    /**
     * @abstract
     * The maximum bind index of vertex argument buffers that can be set per command.
     */
    @Generated
    @Selector("maxVertexBufferBindCount")
    @NUInt
    public native long maxVertexBufferBindCount();

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

    /**
     * @abstract
     * A bitfield of the command types that be encoded.
     * @discussion
     * MTLCommandTypeDispatch cannot be mixed with any other command type.
     */
    @Generated
    @Selector("setCommandTypes:")
    public native void setCommandTypes(@NUInt long value);

    /**
     * @abstract
     * Whether the render or compute pipeline can set arguments.
     */
    @Generated
    @Selector("setInheritBuffers:")
    public native void setInheritBuffers(boolean value);

    /**
     * @abstract
     * Whether the render or compute pipeline are inherited from the encoder
     */
    @Generated
    @Selector("setInheritPipelineState:")
    public native void setInheritPipelineState(boolean value);

    /**
     * @absract
     * The maximum bind index of fragment argument buffers that can be set per command.
     */
    @Generated
    @Selector("setMaxFragmentBufferBindCount:")
    public native void setMaxFragmentBufferBindCount(@NUInt long value);

    /**
     * @absract
     * The maximum bind index of kernel (or tile) argument buffers that can be set per command.
     */
    @Generated
    @Selector("setMaxKernelBufferBindCount:")
    public native void setMaxKernelBufferBindCount(@NUInt long value);

    /**
     * @abstract
     * The maximum bind index of vertex argument buffers that can be set per command.
     */
    @Generated
    @Selector("setMaxVertexBufferBindCount:")
    public native void setMaxVertexBufferBindCount(@NUInt long value);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);
}