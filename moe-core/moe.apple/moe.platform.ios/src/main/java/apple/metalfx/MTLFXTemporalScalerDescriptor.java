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
     * These properties must be set to the respective Metal pixel formats for each texture that will be used with the
     * scaler.
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
     * API-Since: 16.0
     */
    @Generated
    @Selector("inputContentMaxScale")
    public native float inputContentMaxScale();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("inputContentMinScale")
    public native float inputContentMinScale();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("inputHeight")
    @NUInt
    public native long inputHeight();

    /**
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
     * Auto exposure property, setting this to YES to indicate for MetalFX
     * to determine exposure per frame, which will ignore exposureTexture
     * property on the scaler object.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("isAutoExposureEnabled")
    public native boolean isAutoExposureEnabled();

    /**
     * Dynamic Resolution properties
     * Set inputContentPropertiesEnabled to YES to indicate using dynamic resolution
     * Scale value represents output resolution / input content resolution for either
     * width or height dimension. It's assumed that aspect ratio of input/output is
     * always the same.
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
     * The following method is used to instantiate the effect encoder for a given
     * Metal device.
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
     * API-Since: 16.0
     */
    @Generated
    @Selector("outputHeight")
    @NUInt
    public native long outputHeight();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("outputTextureFormat")
    @NUInt
    public native long outputTextureFormat();

    /**
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
     * Auto exposure property, setting this to YES to indicate for MetalFX
     * to determine exposure per frame, which will ignore exposureTexture
     * property on the scaler object.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setAutoExposureEnabled:")
    public native void setAutoExposureEnabled(boolean value);

    /**
     * These properties must be set to the respective Metal pixel formats for each texture that will be used with the
     * scaler.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setColorTextureFormat:")
    public native void setColorTextureFormat(@NUInt long value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setDepthTextureFormat:")
    public native void setDepthTextureFormat(@NUInt long value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setInputContentMaxScale:")
    public native void setInputContentMaxScale(float value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setInputContentMinScale:")
    public native void setInputContentMinScale(float value);

    /**
     * Dynamic Resolution properties
     * Set inputContentPropertiesEnabled to YES to indicate using dynamic resolution
     * Scale value represents output resolution / input content resolution for either
     * width or height dimension. It's assumed that aspect ratio of input/output is
     * always the same.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setInputContentPropertiesEnabled:")
    public native void setInputContentPropertiesEnabled(boolean value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setInputHeight:")
    public native void setInputHeight(@NUInt long value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setInputWidth:")
    public native void setInputWidth(@NUInt long value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setMotionTextureFormat:")
    public native void setMotionTextureFormat(@NUInt long value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setOutputHeight:")
    public native void setOutputHeight(@NUInt long value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setOutputTextureFormat:")
    public native void setOutputTextureFormat(@NUInt long value);

    /**
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
     * Class method for determining support
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
     * API-Since: 17.0
     */
    @Generated
    @Selector("supportedInputContentMaxScaleForDevice:")
    public static native float supportedInputContentMaxScaleForDevice(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLDevice device);

    /**
     * Class methods for querying supported min/max input content scale.
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
     * API-Since: 17.4
     */
    @Generated
    @Selector("isReactiveMaskTextureEnabled")
    public native boolean isReactiveMaskTextureEnabled();

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("reactiveMaskTextureFormat")
    @NUInt
    public native long reactiveMaskTextureFormat();

    /**
     * requiresSynchronousInitialization property, setting this to YES ensures
     * that the effect is fully created before first use, setting it to NO
     * allows the implementation to create an optimized version asynchronously, this
     * can cause the performance to be submoptimal while the optimized version is created.
     * Defaults to NO.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("requiresSynchronousInitialization")
    public native boolean requiresSynchronousInitialization();

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("setReactiveMaskTextureEnabled:")
    public native void setReactiveMaskTextureEnabled(boolean value);

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("setReactiveMaskTextureFormat:")
    public native void setReactiveMaskTextureFormat(@NUInt long value);

    /**
     * requiresSynchronousInitialization property, setting this to YES ensures
     * that the effect is fully created before first use, setting it to NO
     * allows the implementation to create an optimized version asynchronously, this
     * can cause the performance to be submoptimal while the optimized version is created.
     * Defaults to NO.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setRequiresSynchronousInitialization:")
    public native void setRequiresSynchronousInitialization(boolean value);
}