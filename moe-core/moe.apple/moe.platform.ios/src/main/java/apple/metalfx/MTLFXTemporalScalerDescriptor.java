package apple.metalfx;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLDevice;
import apple.metalfx.protocol.MTLFXTemporalScaler;
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
import apple.metalfx.protocol.MTL4FXTemporalScaler;

/**
 * API-Since: 16.0
 */
@Generated
@Library("MetalFX")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLFXTemporalScalerDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLFXTemporalScalerDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLFXTemporalScalerDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTLFXTemporalScalerDescriptor allocWithZone(VoidPtr zone);

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
     * The pixel format of the input color texture for the temporal scaler you create with this descriptor.
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

    /**
     * The pixel format of the input depth texture for the temporal scaler you create with this descriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("depthTextureFormat")
    @NUInt
    public native long depthTextureFormat();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTLFXTemporalScalerDescriptor init();

    /**
     * The largest scale factor the temporal scaler you create with this descriptor can use to generate output textures.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("inputContentMaxScale")
    public native float inputContentMaxScale();

    /**
     * The smallest scale factor the temporal scaler you create with this descriptor can use to generate output
     * textures.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("inputContentMinScale")
    public native float inputContentMinScale();

    /**
     * The height of the input color texture for the temporal scaler you create with this descriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("inputHeight")
    @NUInt
    public native long inputHeight();

    /**
     * The width of the input color texture for the temporal scaler you create with this descriptor.
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

    /**
     * A Boolean value that indicates whether MetalFX calculates the exposure for each frame.
     * 
     * Set this property to <doc://com.apple.documentation/documentation/swift/true> to create a scaler that
     * automatically
     * calculates the exposure level for each image it scales.
     * 
     * * Note: Temporal scaler instances that use auto exposure ignore their ``MTLFXTemporalScalerBase/exposureTexture``
     * property.
     * 
     * This property's default value is <doc://com.apple.documentation/documentation/swift/false>.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("isAutoExposureEnabled")
    public native boolean isAutoExposureEnabled();

    /**
     * A Boolean value that indicates whether the temporal scaler you create with this descriptor uses dynamic
     * resolution.
     * 
     * When you set this property to <doc://com.apple.documentation/documentation/swift/true> to enable dynamic
     * resolution,
     * scale properties ``inputContentMinScale`` and ``inputContentMaxScale`` represent the input and output resolution
     * both the width and height.
     * 
     * * Note: The scaler assumes that aspect ratio of the input and output textures doesn't change.
     * 
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("isInputContentPropertiesEnabled")
    public native boolean isInputContentPropertiesEnabled();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * The pixel format of the input motion texture for the temporal scaler you create with this descriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("motionTextureFormat")
    @NUInt
    public native long motionTextureFormat();

    @Generated
    @Owned
    @Selector("new")
    public static native MTLFXTemporalScalerDescriptor new_objc();

    /**
     * Creates a temporal scaler instance for a Metal device.
     * 
     * - Parameters:
     * - device: The Metal device that creates the temporal scaler.
     * - Returns:
     * A new temporal scaler instance upon success, or `nil` otherwise.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("newTemporalScalerWithDevice:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLFXTemporalScaler newTemporalScalerWithDevice(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device);

    /**
     * The height of the output color texture for the temporal scaler you create with this descriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("outputHeight")
    @NUInt
    public native long outputHeight();

    /**
     * The pixel format of the output texture for the temporal scaler you create with this descriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("outputTextureFormat")
    @NUInt
    public native long outputTextureFormat();

    /**
     * The width of the output color texture for the temporal scaler you create with this descriptor.
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
     * A Boolean value that indicates whether MetalFX calculates the exposure for each frame.
     * 
     * Set this property to <doc://com.apple.documentation/documentation/swift/true> to create a scaler that
     * automatically
     * calculates the exposure level for each image it scales.
     * 
     * * Note: Temporal scaler instances that use auto exposure ignore their ``MTLFXTemporalScalerBase/exposureTexture``
     * property.
     * 
     * This property's default value is <doc://com.apple.documentation/documentation/swift/false>.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setAutoExposureEnabled:")
    public native void setAutoExposureEnabled(boolean value);

    /**
     * The pixel format of the input color texture for the temporal scaler you create with this descriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setColorTextureFormat:")
    public native void setColorTextureFormat(@NUInt long value);

    /**
     * The pixel format of the input depth texture for the temporal scaler you create with this descriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setDepthTextureFormat:")
    public native void setDepthTextureFormat(@NUInt long value);

    /**
     * The largest scale factor the temporal scaler you create with this descriptor can use to generate output textures.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setInputContentMaxScale:")
    public native void setInputContentMaxScale(float value);

    /**
     * The smallest scale factor the temporal scaler you create with this descriptor can use to generate output
     * textures.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setInputContentMinScale:")
    public native void setInputContentMinScale(float value);

    /**
     * A Boolean value that indicates whether the temporal scaler you create with this descriptor uses dynamic
     * resolution.
     * 
     * When you set this property to <doc://com.apple.documentation/documentation/swift/true> to enable dynamic
     * resolution,
     * scale properties ``inputContentMinScale`` and ``inputContentMaxScale`` represent the input and output resolution
     * both the width and height.
     * 
     * * Note: The scaler assumes that aspect ratio of the input and output textures doesn't change.
     * 
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setInputContentPropertiesEnabled:")
    public native void setInputContentPropertiesEnabled(boolean value);

    /**
     * The height of the input color texture for the temporal scaler you create with this descriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setInputHeight:")
    public native void setInputHeight(@NUInt long value);

    /**
     * The width of the input color texture for the temporal scaler you create with this descriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setInputWidth:")
    public native void setInputWidth(@NUInt long value);

    /**
     * The pixel format of the input motion texture for the temporal scaler you create with this descriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setMotionTextureFormat:")
    public native void setMotionTextureFormat(@NUInt long value);

    /**
     * The height of the output color texture for the temporal scaler you create with this descriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setOutputHeight:")
    public native void setOutputHeight(@NUInt long value);

    /**
     * The pixel format of the output texture for the temporal scaler you create with this descriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setOutputTextureFormat:")
    public native void setOutputTextureFormat(@NUInt long value);

    /**
     * The width of the output color texture for the temporal scaler you create with this descriptor.
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
     * Returns a Boolean value that indicates whether the temporal scaler works with a GPU.
     * 
     * - Parameters:
     * - device: A device instance that represents a GPU.
     * 
     * - Returns: <doc://com.apple.documentation/documentation/swift/true> if the device supports temporal scaling,
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

    /**
     * Returns the largest temporal scaling factor the device supports as a floating-point value.
     * 
     * - Parameters:
     * - device: The Metal device for which this method performs this check.
     * 
     * - Returns: the maximum input content scale the GPU device supports.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("supportedInputContentMaxScaleForDevice:")
    public static native float supportedInputContentMaxScaleForDevice(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLDevice device);

    /**
     * Returns the smallest temporal scaling factor the device supports as a floating-point value.
     * 
     * - Parameters:
     * - device: The Metal device for which this method performs this check.
     * 
     * - Returns: the minimum input content scale the GPU device supports.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("supportedInputContentMinScaleForDevice:")
    public static native float supportedInputContentMinScaleForDevice(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLDevice device);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * A Boolean value that indicates whether a temporal scaler you create with the descriptor applies a reactive mask.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("isReactiveMaskTextureEnabled")
    public native boolean isReactiveMaskTextureEnabled();

    /**
     * The pixel format of the reactive mask input texture for a temporal scaler you create with the descriptor.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("reactiveMaskTextureFormat")
    @NUInt
    public native long reactiveMaskTextureFormat();

    /**
     * A Boolean value that indicates whether MetalFX compiles a temporal scaling effect’s underlying upscaler as it
     * creates the instance.
     * 
     * This property gives you the option to decide when it’s better for your app to give MetalFX the time it needs to
     * compile the underlying upscaler of the temporal scaling effect. The two choices are:
     * 
     * * As you create the effect
     * * After you create the effect, likely when your app needs to upscale the initial textures
     * 
     * You can create a temporal scaler that can upscale textures at its best speed
     * immediately after you create it by setting this property to
     * <doc://com.apple.documentation/documentation/swift/true>
     * and then calling an initialization method like ``newTemporalScalerWithDevice:``. However, it may take MetalFX
     * more
     * time for that method to return while it creates the denoiser scaler and compiles its underlying pipelines.
     * 
     * By default, the property is equal to <doc://com.apple.documentation/documentation/swift/false>, which tells
     * MetalFX
     * to quickly create and return the temporal scaling-effect instance, and then compile a faster upscaler in the
     * background.
     * However, this means the effect can take more time to upscale textures while the framework compiles the underlying
     * upscaler.
     * When the framework finishes compiling, the effect runs just as fast as if you set the property to
     * <doc://com.apple.documentation/documentation/swift/true>.
     * 
     * * Note: The image quality of the effect’s output texture is consistent, whether it’s using the slower interim
     * upscaler
     * or the final, faster upscaler.
     * 
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("requiresSynchronousInitialization")
    public native boolean requiresSynchronousInitialization();

    /**
     * A Boolean value that indicates whether a temporal scaler you create with the descriptor applies a reactive mask.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("setReactiveMaskTextureEnabled:")
    public native void setReactiveMaskTextureEnabled(boolean value);

    /**
     * The pixel format of the reactive mask input texture for a temporal scaler you create with the descriptor.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("setReactiveMaskTextureFormat:")
    public native void setReactiveMaskTextureFormat(@NUInt long value);

    /**
     * A Boolean value that indicates whether MetalFX compiles a temporal scaling effect’s underlying upscaler as it
     * creates the instance.
     * 
     * This property gives you the option to decide when it’s better for your app to give MetalFX the time it needs to
     * compile the underlying upscaler of the temporal scaling effect. The two choices are:
     * 
     * * As you create the effect
     * * After you create the effect, likely when your app needs to upscale the initial textures
     * 
     * You can create a temporal scaler that can upscale textures at its best speed
     * immediately after you create it by setting this property to
     * <doc://com.apple.documentation/documentation/swift/true>
     * and then calling an initialization method like ``newTemporalScalerWithDevice:``. However, it may take MetalFX
     * more
     * time for that method to return while it creates the denoiser scaler and compiles its underlying pipelines.
     * 
     * By default, the property is equal to <doc://com.apple.documentation/documentation/swift/false>, which tells
     * MetalFX
     * to quickly create and return the temporal scaling-effect instance, and then compile a faster upscaler in the
     * background.
     * However, this means the effect can take more time to upscale textures while the framework compiles the underlying
     * upscaler.
     * When the framework finishes compiling, the effect runs just as fast as if you set the property to
     * <doc://com.apple.documentation/documentation/swift/true>.
     * 
     * * Note: The image quality of the effect’s output texture is consistent, whether it’s using the slower interim
     * upscaler
     * or the final, faster upscaler.
     * 
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setRequiresSynchronousInitialization:")
    public native void setRequiresSynchronousInitialization(boolean value);

    /**
     * Creates a temporal scaler instance for a Metal device.
     * 
     * - Parameters:
     * - device: The Metal device that creates the temporal scaler.
     * - compiler: A compiler instance this method can use to build pipeline state objects.
     * - Returns:
     * A new temporal scaler instance upon success, or `nil` otherwise.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newTemporalScalerWithDevice:compiler:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native MTL4FXTemporalScaler newTemporalScalerWithDeviceCompiler(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLDevice device,
            @Mapped(ObjCObjectMapper.class) @NotNull MTL4Compiler compiler);

    /**
     * Queries whether a Metal device supports temporal scaling compatible with Metal 4.
     * 
     * - Parameters:
     * - device: The GPU device for which this methods tests support.
     * 
     * - Returns: <doc://com.apple.documentation/documentation/swift/true> if the device supports temporal scaling with
     * Metal 4, <doc://com.apple.documentation/documentation/swift/false> otherwise.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("supportsMetal4FX:")
    public static native boolean supportsMetal4FX(@Mapped(ObjCObjectMapper.class) @NotNull MTLDevice device);
}