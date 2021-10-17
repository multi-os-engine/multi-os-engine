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
 * MTLArgumentDescriptor
 * <p>
 * Represents a member of an argument buffer
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLArgumentDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLArgumentDescriptor(Pointer peer) {
        super(peer);
    }

    /**
     * [@property] access
     * <p>
     * Access flags for the argument
     */
    @Generated
    @Selector("access")
    @NUInt
    public native long access();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLArgumentDescriptor alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MTLArgumentDescriptor allocWithZone(VoidPtr zone);

    /**
     * argumentDescriptor
     * <p>
     * Create an autoreleased default argument descriptor
     */
    @Generated
    @Selector("argumentDescriptor")
    public static native MTLArgumentDescriptor argumentDescriptor();

    /**
     * [@property] arrayLength
     * <p>
     * The length of an array of constants, textures, or samplers, or 0 for non-array arguments
     */
    @Generated
    @Selector("arrayLength")
    @NUInt
    public native long arrayLength();

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
     * [@property] constantBlockAlignment
     * <p>
     * if set forces the constant block to be aligned to the given alignment
     * <p>
     * Should only be set on the first constant of the block and is only valid if a corresponding
     * explicit "alignas" is applied to the constant in the metal shader language.
     */
    @Generated
    @Selector("constantBlockAlignment")
    @NUInt
    public native long constantBlockAlignment();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * [@property] dataType
     * <p>
     * For constants, the data type. Otherwise, MTLDataTypeTexture, MTLDataTypeSampler, or
     * MTLDataTypePointer.
     */
    @Generated
    @Selector("dataType")
    @NUInt
    public native long dataType();

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
     * [@property] index
     * <p>
     * The binding point index of the argument
     */
    @Generated
    @Selector("index")
    @NUInt
    public native long index();

    @Generated
    @Selector("init")
    public native MTLArgumentDescriptor init();

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
    public static native MTLArgumentDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] access
     * <p>
     * Access flags for the argument
     */
    @Generated
    @Selector("setAccess:")
    public native void setAccess(@NUInt long value);

    /**
     * [@property] arrayLength
     * <p>
     * The length of an array of constants, textures, or samplers, or 0 for non-array arguments
     */
    @Generated
    @Selector("setArrayLength:")
    public native void setArrayLength(@NUInt long value);

    /**
     * [@property] constantBlockAlignment
     * <p>
     * if set forces the constant block to be aligned to the given alignment
     * <p>
     * Should only be set on the first constant of the block and is only valid if a corresponding
     * explicit "alignas" is applied to the constant in the metal shader language.
     */
    @Generated
    @Selector("setConstantBlockAlignment:")
    public native void setConstantBlockAlignment(@NUInt long value);

    /**
     * [@property] dataType
     * <p>
     * For constants, the data type. Otherwise, MTLDataTypeTexture, MTLDataTypeSampler, or
     * MTLDataTypePointer.
     */
    @Generated
    @Selector("setDataType:")
    public native void setDataType(@NUInt long value);

    /**
     * [@property] index
     * <p>
     * The binding point index of the argument
     */
    @Generated
    @Selector("setIndex:")
    public native void setIndex(@NUInt long value);

    /**
     * [@property] textureType
     * <p>
     * For texture arguments, the texture type
     */
    @Generated
    @Selector("setTextureType:")
    public native void setTextureType(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] textureType
     * <p>
     * For texture arguments, the texture type
     */
    @Generated
    @Selector("textureType")
    @NUInt
    public native long textureType();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
