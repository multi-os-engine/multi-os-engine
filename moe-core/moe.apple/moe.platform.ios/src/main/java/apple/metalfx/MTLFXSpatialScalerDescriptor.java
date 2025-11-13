package apple.metalfx;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLDevice;
import apple.metalfx.protocol.MTLFXSpatialScaler;
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
import apple.foundation.protocol.NSCopying;
import apple.metal.protocol.MTL4Compiler;
import apple.metalfx.protocol.MTL4FXSpatialScaler;

/**
 * A set of properties that configure a spatial scaling effect, and a factory method that creates the effect.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("MetalFX")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLFXSpatialScalerDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLFXSpatialScalerDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLFXSpatialScalerDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTLFXSpatialScalerDescriptor allocWithZone(VoidPtr zone);

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
     * The color space of the input color texture for the spatial scaler you create with this descriptor.
     * 
     * This property's default value is
     * ``MTLFXSpatialScalerColorProcessingMode/MTLFXSpatialScalerColorProcessingModePerceptual``.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("colorProcessingMode")
    @NInt
    public native long colorProcessingMode();

    /**
     * The pixel format of the input color texture for the spatial scaler you create with this descriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("colorTextureFormat")
    @NUInt
    public native long colorTextureFormat();

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
    public native MTLFXSpatialScalerDescriptor init();

    /**
     * The height of the input color texture for the spatial scaler you create with this descriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("inputHeight")
    @NUInt
    public native long inputHeight();

    /**
     * The width of the input color texture for the spatial scaler you create with this descriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("inputWidth")
    @NUInt
    public native long inputWidth();

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
    public static native MTLFXSpatialScalerDescriptor new_objc();

    /**
     * Creates a spatial scaler instance for a Metal device.
     * 
     * - Parameters:
     * - device: The Metal device that creates the spatial scaler.
     * - Returns:
     * A new spatial scaler instance upon success, or `nil` otherwise.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("newSpatialScalerWithDevice:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLFXSpatialScaler newSpatialScalerWithDevice(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device);

    /**
     * The height of the output color texture for the spatial scaler you create with this descriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("outputHeight")
    @NUInt
    public native long outputHeight();

    /**
     * The pixel format of the output texture for the spatial scaler you create with this descriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("outputTextureFormat")
    @NUInt
    public native long outputTextureFormat();

    /**
     * The width of the output color texture for the spatial scaler you create with this descriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("outputWidth")
    @NUInt
    public native long outputWidth();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The color space of the input color texture for the spatial scaler you create with this descriptor.
     * 
     * This property's default value is
     * ``MTLFXSpatialScalerColorProcessingMode/MTLFXSpatialScalerColorProcessingModePerceptual``.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setColorProcessingMode:")
    public native void setColorProcessingMode(@NInt long value);

    /**
     * The pixel format of the input color texture for the spatial scaler you create with this descriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setColorTextureFormat:")
    public native void setColorTextureFormat(@NUInt long value);

    /**
     * The height of the input color texture for the spatial scaler you create with this descriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setInputHeight:")
    public native void setInputHeight(@NUInt long value);

    /**
     * The width of the input color texture for the spatial scaler you create with this descriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setInputWidth:")
    public native void setInputWidth(@NUInt long value);

    /**
     * The height of the output color texture for the spatial scaler you create with this descriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setOutputHeight:")
    public native void setOutputHeight(@NUInt long value);

    /**
     * The pixel format of the output texture for the spatial scaler you create with this descriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setOutputTextureFormat:")
    public native void setOutputTextureFormat(@NUInt long value);

    /**
     * The width of the output color texture for the spatial scaler you create with this descriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setOutputWidth:")
    public native void setOutputWidth(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Returns a Boolean value that indicates whether the spatial scaler works with a GPU.
     * 
     * - Parameters:
     * - device: An ``MTLDevice`` instance that represents a GPU.
     * 
     * - Returns: <doc://com.apple.documentation/documentation/swift/true> if the device supports spatial scaling,
     * <doc://com.apple.documentation/documentation/swift/false> otherwise.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("supportsDevice:")
    public static native boolean supportsDevice(@NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * Creates a spatial scaler instance for a Metal device.
     * 
     * - Parameters:
     * - device: The Metal device that creates the spatial scaler.
     * - compiler: A compiler instance this method can use to build pipeline state objects.
     * - Returns:
     * A new spatial scaler instance upon success, or `nil` otherwise.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newSpatialScalerWithDevice:compiler:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native MTL4FXSpatialScaler newSpatialScalerWithDeviceCompiler(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLDevice device,
            @Mapped(ObjCObjectMapper.class) @NotNull MTL4Compiler compiler);

    /**
     * Queries whether a Metal device supports spatial scaling compatible with Metal 4.
     * 
     * - Parameters:
     * - device: The GPU device for which this methods tests support.
     * 
     * - Returns: <doc://com.apple.documentation/documentation/swift/true> if the device supports spatial scaling with
     * Metal 4, <doc://com.apple.documentation/documentation/swift/false> otherwise.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("supportsMetal4FX:")
    public static native boolean supportsMetal4FX(@Mapped(ObjCObjectMapper.class) @NotNull MTLDevice device);
}