package apple.metalfx;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.metal.protocol.MTL4Compiler;
import apple.metal.protocol.MTLDevice;
import apple.metalfx.protocol.MTL4FXFrameInterpolator;
import apple.metalfx.protocol.MTLFXFrameInterpolatableScaler;
import apple.metalfx.protocol.MTLFXFrameInterpolator;
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
 * A set of properties that configure a frame interpolator, and a factory method that creates the effect.
 * 
 * A frame interpolator inspects two frames your game or app renders and, based on their properties, generates
 * an extra frame at a fraction of the cost, helping you to increase your frame rate.
 * 
 * When you configure this descriptor, set the properties that determine the pixel format for each texture to the
 * respective format of the texture you later assign to the scaler. For example, make sure that the format to which
 * you set the ``colorTextureFormat`` property matches the format of the texture you later assign to the interpolator's
 * ``MTLFXFrameInterpolatorDescriptor/colorTexture`` property.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("MetalFX")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLFXFrameInterpolatorDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLFXFrameInterpolatorDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLFXFrameInterpolatorDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTLFXFrameInterpolatorDescriptor allocWithZone(VoidPtr zone);

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
     * The pixel format of the input color texture for the frame interpolator you create with this descriptor.
     * 
     * API-Since: 26.0
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
     * The pixel format of the input depth texture for the frame interpolator you create with this descriptor.
     * 
     * API-Since: 26.0
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
    public native MTLFXFrameInterpolatorDescriptor init();

    /**
     * The height, in pixels, of the input motion and depth texture for the frame interpolator.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("inputHeight")
    @NUInt
    public native long inputHeight();

    /**
     * The width, in pixels, of the input motion and depth texture for the frame interpolator.
     * 
     * API-Since: 26.0
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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * The pixel format of the input motion texture for the frame interpolator you create with this descriptor.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("motionTextureFormat")
    @NUInt
    public native long motionTextureFormat();

    @Generated
    @Owned
    @Selector("new")
    public static native MTLFXFrameInterpolatorDescriptor new_objc();

    /**
     * Creates a frame interpolator instance for a Metal device.
     * 
     * - Parameters:
     * - device: The Metal device that creates the frame interpolator.
     * - Returns:
     * A new frame interpolator instance upon success, or `nil` otherwise.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newFrameInterpolatorWithDevice:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native MTLFXFrameInterpolator newFrameInterpolatorWithDevice(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLDevice device);

    /**
     * Creates a frame interpolator instance for a Metal device.
     * 
     * - Parameters:
     * - device: The Metal device that creates the frame interpolator.
     * - compiler: A compiler instance this method can use to build pipeline state objects.
     * - Returns:
     * A new frame interpolator instance upon success, or `nil` otherwise.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newFrameInterpolatorWithDevice:compiler:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native MTL4FXFrameInterpolator newFrameInterpolatorWithDeviceCompiler(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLDevice device,
            @Mapped(ObjCObjectMapper.class) @NotNull MTL4Compiler compiler);

    /**
     * The height, in pixels, of the output color texture for the frame interpolator.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("outputHeight")
    @NUInt
    public native long outputHeight();

    /**
     * The pixel format of the output color texture for the frame interpolator you create with this descriptor.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("outputTextureFormat")
    @NUInt
    public native long outputTextureFormat();

    /**
     * The width, in pixels, of the output color texture for the frame interpolator.
     * 
     * API-Since: 26.0
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
     * API-Since: 26.0
     */
    @Generated
    @Selector("scaler")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native MTLFXFrameInterpolatableScaler scaler();

    /**
     * The pixel format of the input color texture for the frame interpolator you create with this descriptor.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setColorTextureFormat:")
    public native void setColorTextureFormat(@NUInt long value);

    /**
     * The pixel format of the input depth texture for the frame interpolator you create with this descriptor.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDepthTextureFormat:")
    public native void setDepthTextureFormat(@NUInt long value);

    /**
     * The height, in pixels, of the input motion and depth texture for the frame interpolator.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setInputHeight:")
    public native void setInputHeight(@NUInt long value);

    /**
     * The width, in pixels, of the input motion and depth texture for the frame interpolator.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setInputWidth:")
    public native void setInputWidth(@NUInt long value);

    /**
     * The pixel format of the input motion texture for the frame interpolator you create with this descriptor.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMotionTextureFormat:")
    public native void setMotionTextureFormat(@NUInt long value);

    /**
     * The height, in pixels, of the output color texture for the frame interpolator.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setOutputHeight:")
    public native void setOutputHeight(@NUInt long value);

    /**
     * The pixel format of the output color texture for the frame interpolator you create with this descriptor.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setOutputTextureFormat:")
    public native void setOutputTextureFormat(@NUInt long value);

    /**
     * The width, in pixels, of the output color texture for the frame interpolator.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setOutputWidth:")
    public native void setOutputWidth(@NUInt long value);

    /**
     * API-Since: 26.0
     */
    @Generated
    @Selector("setScaler:")
    public native void setScaler(@Mapped(ObjCObjectMapper.class) @Nullable MTLFXFrameInterpolatableScaler value);

    /**
     * The pixel format for the frame interpolator of an input texture containing your game's custom UI.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setUITextureFormat:")
    public native void setUITextureFormat(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Queries whether a Metal device supports frame interpolation.
     * 
     * - Parameters:
     * - device: The GPU device for which this methods tests support.
     * 
     * - Returns: <doc://com.apple.documentation/documentation/swift/true> if the device supports frame interpolation,
     * <doc://com.apple.documentation/documentation/swift/false> otherwise.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("supportsDevice:")
    public static native boolean supportsDevice(@Mapped(ObjCObjectMapper.class) @NotNull MTLDevice device);

    /**
     * Queries whether a Metal device supports frame interpolation compatible with a Metal 4 command buffer.
     * 
     * - Parameters:
     * - device: The GPU device for which this methods tests support.
     * 
     * - Returns: <doc://com.apple.documentation/documentation/swift/true> if the device supports frame interpolation
     * for
     * Metal 4, <doc://com.apple.documentation/documentation/swift/false> otherwise.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("supportsMetal4FX:")
    public static native boolean supportsMetal4FX(@Mapped(ObjCObjectMapper.class) @NotNull MTLDevice device);

    /**
     * The pixel format for the frame interpolator of an input texture containing your game's custom UI.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("uiTextureFormat")
    @NUInt
    public native long uiTextureFormat();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}