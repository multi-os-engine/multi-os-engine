package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * Groups parameters for the creation of a Metal argument table.
 * 
 * Argument tables provide resource bindings to your Metal pipeline states.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTL4ArgumentTableDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTL4ArgumentTableDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTL4ArgumentTableDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTL4ArgumentTableDescriptor allocWithZone(VoidPtr zone);

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
    public native MTL4ArgumentTableDescriptor init();

    /**
     * Configures whether Metal initializes the bindings to nil values upon creation of argument table.
     * 
     * The default value of this property is <doc://com.apple.documentation/documentation/swift/false>.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initializeBindings")
    public native boolean initializeBindings();

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
     * Assigns an optional label with the argument table for debug purposes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("label")
    @Nullable
    public native String label();

    /**
     * Determines the number of buffer-binding slots for the argument table.
     * 
     * The maximum value of this parameter is 31.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("maxBufferBindCount")
    @NUInt
    public native long maxBufferBindCount();

    /**
     * Determines the number of sampler state-binding slots for the argument table.
     * 
     * The maximum value of this parameter is 16.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("maxSamplerStateBindCount")
    @NUInt
    public native long maxSamplerStateBindCount();

    /**
     * Determines the number of texture-binding slots for the argument table.
     * 
     * The maximum value of this parameter is 128.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("maxTextureBindCount")
    @NUInt
    public native long maxTextureBindCount();

    @Generated
    @Owned
    @Selector("new")
    public static native MTL4ArgumentTableDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Configures whether Metal initializes the bindings to nil values upon creation of argument table.
     * 
     * The default value of this property is <doc://com.apple.documentation/documentation/swift/false>.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setInitializeBindings:")
    public native void setInitializeBindings(boolean value);

    /**
     * Assigns an optional label with the argument table for debug purposes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setLabel:")
    public native void setLabel(@Nullable String value);

    /**
     * Determines the number of buffer-binding slots for the argument table.
     * 
     * The maximum value of this parameter is 31.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMaxBufferBindCount:")
    public native void setMaxBufferBindCount(@NUInt long value);

    /**
     * Determines the number of sampler state-binding slots for the argument table.
     * 
     * The maximum value of this parameter is 16.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMaxSamplerStateBindCount:")
    public native void setMaxSamplerStateBindCount(@NUInt long value);

    /**
     * Determines the number of texture-binding slots for the argument table.
     * 
     * The maximum value of this parameter is 128.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMaxTextureBindCount:")
    public native void setMaxTextureBindCount(@NUInt long value);

    /**
     * Controls whether Metal should reserve memory for attribute strides in the argument table.
     * 
     * Set this value to true if you intend to provide dynamic attribute strides when binding vertex
     * array buffers to the argument table by calling ``MTL4ArgumentTable/setAddress:attributeStride:atIndex:``
     * 
     * The default value of this property is <doc://com.apple.documentation/documentation/swift/false>.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSupportAttributeStrides:")
    public native void setSupportAttributeStrides(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Controls whether Metal should reserve memory for attribute strides in the argument table.
     * 
     * Set this value to true if you intend to provide dynamic attribute strides when binding vertex
     * array buffers to the argument table by calling ``MTL4ArgumentTable/setAddress:attributeStride:atIndex:``
     * 
     * The default value of this property is <doc://com.apple.documentation/documentation/swift/false>.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("supportAttributeStrides")
    public native boolean supportAttributeStrides();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}