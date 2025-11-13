package apple.videotoolbox;

import apple.NSObject;
import apple.coremedia.struct.CMVideoDimensions;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.videotoolbox.protocol.VTFrameProcessorConfiguration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * An object you use to configure frame processor for low-latency super-resolution scaler processing.
 * 
 * Use this object to configure a ``VTFrameProcessor``. Query this interface also for important operating details, like
 * the pixel buffer attributes required for frames you submit to the processor.
 * 
 * > Important: When calling ``VTFrameProcessor/startSessionWithConfiguration:error:`` to create a
 * `VTLowLatencySuperResolutionScaler`
 * session, ML model loading may take longer than a frame time. Avoid blocking the UI thread or stalling frame rendering
 * pipelines during this call.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("VideoToolbox")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VTLowLatencySuperResolutionScalerConfiguration extends NSObject implements VTFrameProcessorConfiguration {
    static {
        NatJ.register();
    }

    @Generated
    protected VTLowLatencySuperResolutionScalerConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VTLowLatencySuperResolutionScalerConfiguration alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native VTLowLatencySuperResolutionScalerConfiguration allocWithZone(VoidPtr zone);

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("destinationPixelBufferAttributes")
    @NotNull
    public native NSDictionary<String, ?> destinationPixelBufferAttributes();

    /**
     * Height of source frame in pixels.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("frameHeight")
    @NInt
    public native long frameHeight();

    @Generated
    @Selector("frameSupportedPixelFormats")
    @NotNull
    public native NSArray<? extends NSNumber> frameSupportedPixelFormats();

    /**
     * Width of source frame in pixels.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("frameWidth")
    @NInt
    public native long frameWidth();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native VTLowLatencySuperResolutionScalerConfiguration init();

    /**
     * Creates a new low-latency super-resolution scaler configuration with specified frame width and height.
     * 
     * - Parameters:
     * - frameWidth: Width of source frame in pixels.
     * - frameHeight: Height of source frame in pixels.
     * - scaleFactor: The scale factor to apply. This must be a supported value that
     * ``supportedScaleFactorsForFrameWidth:frameHeight:`` returns.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithFrameWidth:frameHeight:scaleFactor:")
    public native VTLowLatencySuperResolutionScalerConfiguration initWithFrameWidthFrameHeightScaleFactor(
            @NInt long frameWidth, @NInt long frameHeight, float scaleFactor);

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
    @Selector("isSupported")
    public static native boolean isSupported();

    @Generated
    @ProtocolClassMethod("isSupported")
    public boolean _isSupported() {
        return isSupported();
    }

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Selector("maximumDimensions")
    @ByValue
    public static native CMVideoDimensions maximumDimensions();

    @Generated
    @ProtocolClassMethod("maximumDimensions")
    @ByValue
    public CMVideoDimensions _maximumDimensions() {
        return maximumDimensions();
    }

    @Generated
    @Selector("minimumDimensions")
    @ByValue
    public static native CMVideoDimensions minimumDimensions();

    @Generated
    @ProtocolClassMethod("minimumDimensions")
    @ByValue
    public CMVideoDimensions _minimumDimensions() {
        return minimumDimensions();
    }

    @Generated
    @Owned
    @Selector("new")
    public static native VTLowLatencySuperResolutionScalerConfiguration new_objc();

    @Generated
    @IsOptional
    @Selector("nextFrameCount")
    @NInt
    public native long nextFrameCount();

    @Generated
    @IsOptional
    @Selector("previousFrameCount")
    @NInt
    public native long previousFrameCount();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Scale factor with which you initialized the configuration.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("scaleFactor")
    public native float scaleFactor();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("sourcePixelBufferAttributes")
    @NotNull
    public native NSDictionary<String, ?> sourcePixelBufferAttributes();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Returns an array of supported scale factors values, or an empty list if the processor doesn't support the
     * dimensions.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("supportedScaleFactorsForFrameWidth:frameHeight:")
    @NotNull
    public static native NSArray<? extends NSNumber> supportedScaleFactorsForFrameWidthFrameHeight(
            @NInt long frameWidth, @NInt long frameHeight);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}