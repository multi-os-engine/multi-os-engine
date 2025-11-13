package apple.metalfx;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.metal.protocol.MTL4Compiler;
import apple.metal.protocol.MTLDevice;
import apple.metalfx.protocol.MTL4FXTemporalDenoisedScaler;
import apple.metalfx.protocol.MTLFXTemporalDenoisedScaler;
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
 * API-Since: 18.0
 */
@Generated
@Library("MetalFX")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLFXTemporalDenoisedScalerDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLFXTemporalDenoisedScalerDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLFXTemporalDenoisedScalerDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTLFXTemporalDenoisedScalerDescriptor allocWithZone(VoidPtr zone);

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

    /**
     * The pixel format of the input color texture for the scaler you create with this descriptor.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("colorTextureFormat")
    @NUInt
    public native long colorTextureFormat();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * The pixel format of the input denoise strength mask texture for the scaler you create with this descriptor.
     * 
     * You typically set this to a single-channel texture format.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("denoiseStrengthMaskTextureFormat")
    @NUInt
    public native long denoiseStrengthMaskTextureFormat();

    /**
     * The pixel format of the input depth texture for the scaler you create with this descriptor.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("depthTextureFormat")
    @NUInt
    public native long depthTextureFormat();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The pixel format of the input diffuse albedo texture for the scaler you create with this descriptor.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("diffuseAlbedoTextureFormat")
    @NUInt
    public native long diffuseAlbedoTextureFormat();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTLFXTemporalDenoisedScalerDescriptor init();

    /**
     * The height, in pixels, of the input color texture for the denoiser scaler.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("inputHeight")
    @NUInt
    public native long inputHeight();

    /**
     * The width, in pixels, of the input color texture for the denoiser scaler.
     * 
     * API-Since: 18.0
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
     * * Note: Denoiser scaler instances that use auto exposure ignore their ``MTLFXTemporalScalerBase/exposureTexture``
     * property.
     * 
     * This property's default value is <doc://com.apple.documentation/documentation/swift/false>.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("isAutoExposureEnabled")
    public native boolean isAutoExposureEnabled();

    /**
     * A Boolean value indicating whether the scaler evaluates a denoise strength mask texture as part of its operation.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("isDenoiseStrengthMaskTextureEnabled")
    public native boolean isDenoiseStrengthMaskTextureEnabled();

    /**
     * A Boolean value that indicates whether a scaler you create from this descriptor applies a reactive mask.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("isReactiveMaskTextureEnabled")
    public native boolean isReactiveMaskTextureEnabled();

    /**
     * A Boolean value indicating whether the scaler evaluates a specular hit distance texture as part of its operation.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("isSpecularHitDistanceTextureEnabled")
    public native boolean isSpecularHitDistanceTextureEnabled();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    /**
     * A Boolean value indicating whether the scaler evaluates a transparency overlay texture as part of its operation.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("isTransparencyOverlayTextureEnabled")
    public native boolean isTransparencyOverlayTextureEnabled();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * The pixel format of the input motion texture for the scaler you create with this descriptor.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("motionTextureFormat")
    @NUInt
    public native long motionTextureFormat();

    @Generated
    @Owned
    @Selector("new")
    public static native MTLFXTemporalDenoisedScalerDescriptor new_objc();

    /**
     * Creates a denoiser scaler instance for a Metal device.
     * 
     * - Parameters:
     * - device: The Metal device that creates the denoiser scaler.
     * - Returns:
     * A denoiser scaler instance upon success, or `nil` otherwise.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("newTemporalDenoisedScalerWithDevice:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native MTLFXTemporalDenoisedScaler newTemporalDenoisedScalerWithDevice(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLDevice device);

    /**
     * Creates a denoiser scaler instance for a Metal device.
     * 
     * - Parameters:
     * - device: The Metal device that creates the denoiser scaler.
     * - compiler: A compiler instance this method can use to build pipeline state objects.
     * - Returns:
     * A denoiser scaler instance upon success, or `nil` otherwise.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("newTemporalDenoisedScalerWithDevice:compiler:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native MTL4FXTemporalDenoisedScaler newTemporalDenoisedScalerWithDeviceCompiler(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLDevice device,
            @Mapped(ObjCObjectMapper.class) @NotNull MTL4Compiler compiler);

    /**
     * The pixel format of the input normal texture for the scaler you create with this descriptor.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("normalTextureFormat")
    @NUInt
    public native long normalTextureFormat();

    /**
     * The height, in pixels, of the input color texture for the denoiser scaler.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("outputHeight")
    @NUInt
    public native long outputHeight();

    /**
     * The pixel format of the output color texture for the scaler you create with this descriptor.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("outputTextureFormat")
    @NUInt
    public native long outputTextureFormat();

    /**
     * The width, in pixels, of the output color texture for the denoiser scaler.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("outputWidth")
    @NUInt
    public native long outputWidth();

    /**
     * The pixel format of the reactive mask input texture for a scaler you create from this descriptor.
     * 
     * API-Since: 18.0
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
     * You can create a temporal denoised scaler instance that can denoise and upscale textures at its best speed
     * immediately after you create it by setting this property to
     * <doc://com.apple.documentation/documentation/swift/true>
     * and then calling an initialization method like ``newTemporalDenoisedScalerWithDevice:``. However, it may take
     * MetalFX
     * more time for that method to return while it creates the denoiser scaler and compiles its underlying pipelines.
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
     * API-Since: 18.0
     */
    @Generated
    @Selector("requiresSynchronousInitialization")
    public native boolean requiresSynchronousInitialization();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The pixel format of the input roughness texture for the scaler you create with this descriptor.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("roughnessTextureFormat")
    @NUInt
    public native long roughnessTextureFormat();

    /**
     * A Boolean value that indicates whether MetalFX calculates the exposure for each frame.
     * 
     * Set this property to <doc://com.apple.documentation/documentation/swift/true> to create a scaler that
     * automatically
     * calculates the exposure level for each image it scales.
     * 
     * * Note: Denoiser scaler instances that use auto exposure ignore their ``MTLFXTemporalScalerBase/exposureTexture``
     * property.
     * 
     * This property's default value is <doc://com.apple.documentation/documentation/swift/false>.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setAutoExposureEnabled:")
    public native void setAutoExposureEnabled(boolean value);

    /**
     * The pixel format of the input color texture for the scaler you create with this descriptor.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setColorTextureFormat:")
    public native void setColorTextureFormat(@NUInt long value);

    /**
     * A Boolean value indicating whether the scaler evaluates a denoise strength mask texture as part of its operation.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setDenoiseStrengthMaskTextureEnabled:")
    public native void setDenoiseStrengthMaskTextureEnabled(boolean value);

    /**
     * The pixel format of the input denoise strength mask texture for the scaler you create with this descriptor.
     * 
     * You typically set this to a single-channel texture format.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setDenoiseStrengthMaskTextureFormat:")
    public native void setDenoiseStrengthMaskTextureFormat(@NUInt long value);

    /**
     * The pixel format of the input depth texture for the scaler you create with this descriptor.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setDepthTextureFormat:")
    public native void setDepthTextureFormat(@NUInt long value);

    /**
     * The pixel format of the input diffuse albedo texture for the scaler you create with this descriptor.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setDiffuseAlbedoTextureFormat:")
    public native void setDiffuseAlbedoTextureFormat(@NUInt long value);

    /**
     * The height, in pixels, of the input color texture for the denoiser scaler.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setInputHeight:")
    public native void setInputHeight(@NUInt long value);

    /**
     * The width, in pixels, of the input color texture for the denoiser scaler.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setInputWidth:")
    public native void setInputWidth(@NUInt long value);

    /**
     * The pixel format of the input motion texture for the scaler you create with this descriptor.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setMotionTextureFormat:")
    public native void setMotionTextureFormat(@NUInt long value);

    /**
     * The pixel format of the input normal texture for the scaler you create with this descriptor.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setNormalTextureFormat:")
    public native void setNormalTextureFormat(@NUInt long value);

    /**
     * The height, in pixels, of the input color texture for the denoiser scaler.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setOutputHeight:")
    public native void setOutputHeight(@NUInt long value);

    /**
     * The pixel format of the output color texture for the scaler you create with this descriptor.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setOutputTextureFormat:")
    public native void setOutputTextureFormat(@NUInt long value);

    /**
     * The width, in pixels, of the output color texture for the denoiser scaler.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setOutputWidth:")
    public native void setOutputWidth(@NUInt long value);

    /**
     * A Boolean value that indicates whether a scaler you create from this descriptor applies a reactive mask.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setReactiveMaskTextureEnabled:")
    public native void setReactiveMaskTextureEnabled(boolean value);

    /**
     * The pixel format of the reactive mask input texture for a scaler you create from this descriptor.
     * 
     * API-Since: 18.0
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
     * You can create a temporal denoised scaler instance that can denoise and upscale textures at its best speed
     * immediately after you create it by setting this property to
     * <doc://com.apple.documentation/documentation/swift/true>
     * and then calling an initialization method like ``newTemporalDenoisedScalerWithDevice:``. However, it may take
     * MetalFX
     * more time for that method to return while it creates the denoiser scaler and compiles its underlying pipelines.
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
     * API-Since: 18.0
     */
    @Generated
    @Selector("setRequiresSynchronousInitialization:")
    public native void setRequiresSynchronousInitialization(boolean value);

    /**
     * The pixel format of the input roughness texture for the scaler you create with this descriptor.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setRoughnessTextureFormat:")
    public native void setRoughnessTextureFormat(@NUInt long value);

    /**
     * The pixel format of the input specular albedo texture for the scaler you create with this descriptor.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setSpecularAlbedoTextureFormat:")
    public native void setSpecularAlbedoTextureFormat(@NUInt long value);

    /**
     * A Boolean value indicating whether the scaler evaluates a specular hit distance texture as part of its operation.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setSpecularHitDistanceTextureEnabled:")
    public native void setSpecularHitDistanceTextureEnabled(boolean value);

    /**
     * The pixel format of the input specular hit texture for the scaler you create with this descriptor.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setSpecularHitDistanceTextureFormat:")
    public native void setSpecularHitDistanceTextureFormat(@NUInt long value);

    /**
     * A Boolean value indicating whether the scaler evaluates a transparency overlay texture as part of its operation.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setTransparencyOverlayTextureEnabled:")
    public native void setTransparencyOverlayTextureEnabled(boolean value);

    /**
     * The pixel format of the input transparency overlay texture for the scaler you create with this descriptor.
     * 
     * You typically set this to a 4-channel RGBA texture format.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setTransparencyOverlayTextureFormat:")
    public native void setTransparencyOverlayTextureFormat(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The pixel format of the input specular albedo texture for the scaler you create with this descriptor.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("specularAlbedoTextureFormat")
    @NUInt
    public native long specularAlbedoTextureFormat();

    /**
     * The pixel format of the input specular hit texture for the scaler you create with this descriptor.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("specularHitDistanceTextureFormat")
    @NUInt
    public native long specularHitDistanceTextureFormat();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Returns the largest temporal scaling factor the device supports as a floating-point value.
     * 
     * - Parameters:
     * - device: The Metal device for which this method checks the maximum input content scale it supports.
     * 
     * - Returns: the maximum input content scale the GPU device supports.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("supportedInputContentMaxScaleForDevice:")
    public static native float supportedInputContentMaxScaleForDevice(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLDevice device);

    /**
     * Returns the smallest temporal scaling factor the device supports as a floating-point value.
     * 
     * - Parameters:
     * - device: The Metal device for which this method checks the minimum input content scale it supports.
     * 
     * - Returns: the minimum input content scale the GPU device supports.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("supportedInputContentMinScaleForDevice:")
    public static native float supportedInputContentMinScaleForDevice(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLDevice device);

    /**
     * Queries whether a Metal device supports denoising scaling.
     * 
     * - Parameters:
     * - device: The GPU device for which this methods tests support.
     * 
     * - Returns: <doc://com.apple.documentation/documentation/swift/true> if the device supports denoising scaling,
     * <doc://com.apple.documentation/documentation/swift/false> otherwise.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("supportsDevice:")
    public static native boolean supportsDevice(@Mapped(ObjCObjectMapper.class) @NotNull MTLDevice device);

    /**
     * Queries whether a Metal device supports denosing scaling compatible on Metal 4.
     * 
     * - Parameters:
     * - device: The GPU device for which this methods tests support.
     * 
     * - Returns: <doc://com.apple.documentation/documentation/swift/true> if the device supports denoising scaling for
     * Metal 4, <doc://com.apple.documentation/documentation/swift/false> otherwise.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("supportsMetal4FX:")
    public static native boolean supportsMetal4FX(@Mapped(ObjCObjectMapper.class) @NotNull MTLDevice device);

    /**
     * The pixel format of the input transparency overlay texture for the scaler you create with this descriptor.
     * 
     * You typically set this to a 4-channel RGBA texture format.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("transparencyOverlayTextureFormat")
    @NUInt
    public native long transparencyOverlayTextureFormat();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}