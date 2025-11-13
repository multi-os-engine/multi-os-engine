package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.struct.NSRange;
import apple.metal.struct.MTLTextureSwizzleChannels;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLTextureViewDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLTextureViewDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLTextureViewDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTLTextureViewDescriptor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

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
    public native MTLTextureViewDescriptor init();

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * [@property] levelRange
     * 
     * A desired range of mip levels of a texture view.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("levelRange")
    @ByValue
    public native NSRange levelRange();

    @Generated
    @Owned
    @Selector("new")
    public static native MTLTextureViewDescriptor new_objc();

    /**
     * [@property] pixelFormat
     * 
     * A desired pixel format of a texture view.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("pixelFormat")
    @NUInt
    public native long pixelFormat();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] levelRange
     * 
     * A desired range of mip levels of a texture view.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setLevelRange:")
    public native void setLevelRange(@ByValue NSRange value);

    /**
     * [@property] pixelFormat
     * 
     * A desired pixel format of a texture view.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setPixelFormat:")
    public native void setPixelFormat(@NUInt long value);

    /**
     * [@property] sliceRange
     * 
     * A desired range of slices of a texture view.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSliceRange:")
    public native void setSliceRange(@ByValue NSRange value);

    /**
     * [@property] swizzle
     * 
     * A desired swizzle format of a texture view.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSwizzle:")
    public native void setSwizzle(@ByValue MTLTextureSwizzleChannels value);

    /**
     * [@property] textureType
     * 
     * A desired texture view of a texture view.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setTextureType:")
    public native void setTextureType(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] sliceRange
     * 
     * A desired range of slices of a texture view.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("sliceRange")
    @ByValue
    public native NSRange sliceRange();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] swizzle
     * 
     * A desired swizzle format of a texture view.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("swizzle")
    @ByValue
    public native MTLTextureSwizzleChannels swizzle();

    /**
     * [@property] textureType
     * 
     * A desired texture view of a texture view.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("textureType")
    @NUInt
    public native long textureType();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}