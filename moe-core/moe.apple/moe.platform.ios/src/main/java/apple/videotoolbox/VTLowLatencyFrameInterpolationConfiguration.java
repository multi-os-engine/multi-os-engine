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
 * Configuration that you use to program Video Toolbox frame processor for low-latency frame interpolation.
 * 
 * This configuration can do either purely temporal interpolation (frame-rate conversion) or temporal and spatial
 * interpolation (scaling and frame-rate conversion). This processor requires a source frame and a previous frame. It
 * does temporal scaling, which interpolates frames between the previous frame and the source frame. When performing
 * both temporal and spatial interpolation, the processor can only perform 2x upscaling, and a single frame of temporal
 * interpolation. When performing spatial scaling, the processor produces upscaled intermediate frames and an upscaled
 * `sourceFrame`, but it does not upscale the previous reference frame you provided.
 * 
 * > Important: When calling ``VTFrameProcessor/startSessionWithConfiguration:error:`` to create a
 * `VTLowLatencyFrameInterpolation`
 * session, ML model loading may take longer than a frame time. Avoid blocking the UI thread or stalling frame rendering
 * pipelines during this call.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("VideoToolbox")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VTLowLatencyFrameInterpolationConfiguration extends NSObject implements VTFrameProcessorConfiguration {
    static {
        NatJ.register();
    }

    @Generated
    protected VTLowLatencyFrameInterpolationConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VTLowLatencyFrameInterpolationConfiguration alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native VTLowLatencyFrameInterpolationConfiguration allocWithZone(VoidPtr zone);

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
     * Height of source frames in pixels.
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
     * Width of source frames in pixels.
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
    public native VTLowLatencyFrameInterpolationConfiguration init();

    /**
     * Creates a new low-latency frame interpolation configuration for frame-rate conversion.
     * 
     * The available interpolation points are the equal to the value of (2^x - 1), where x is equal to
     * `numberOfInterpolatedFrames`.
     * For example,
     * - If you request 1 interpolated frame, 1 interpolation point at 0.5 is available.
     * - If you request 2 interpolated frames, 3 interpolation points at 0.25, 0.5 and 0.75 are available.
     * You don't need to use all available interpolation points. Setting a higher `numberOfInterpolatedFrames` increases
     * the resolution of interpolation in some cases, but also increases latency.
     * 
     * - Parameters:
     * - frameWidth: Width of source frame in pixels.
     * - frameHeight: Height of source frame in pixels.
     * - numberOfInterpolatedFrames: The number of uniformly spaced frames that you want to be used for interpolation.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithFrameWidth:frameHeight:numberOfInterpolatedFrames:")
    public native VTLowLatencyFrameInterpolationConfiguration initWithFrameWidthFrameHeightNumberOfInterpolatedFrames(
            @NInt long frameWidth, @NInt long frameHeight, @NInt long numberOfInterpolatedFrames);

    /**
     * Creates a new low-latency frame interpolation configuration for spatial scaling and temporal scaling.
     * 
     * When you configure the processor for spatial scaling, the low-latency frame interpolation processor only supports
     * 2x
     * spatial upscaling and a single frame of temporal interpolation at a 0.5 interpolation phase.
     * 
     * - Parameters:
     * - frameWidth: Width of source frame in pixels.
     * - frameHeight: Height of source frame in pixels.
     * - spatialScaleFactor: The requested spatial scale factor as an integer. Currently, the processor supports only 2x
     * spatial scaling.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithFrameWidth:frameHeight:spatialScaleFactor:")
    public native VTLowLatencyFrameInterpolationConfiguration initWithFrameWidthFrameHeightSpatialScaleFactor(
            @NInt long frameWidth, @NInt long frameHeight, @NInt long spatialScaleFactor);

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
    @IsOptional
    @Selector("maximumDimensions")
    @ByValue
    public static native CMVideoDimensions maximumDimensions();

    @Generated
    @IsOptional
    @ProtocolClassMethod("maximumDimensions")
    @ByValue
    public CMVideoDimensions _maximumDimensions() {
        return maximumDimensions();
    }

    @Generated
    @IsOptional
    @Selector("minimumDimensions")
    @ByValue
    public static native CMVideoDimensions minimumDimensions();

    @Generated
    @IsOptional
    @ProtocolClassMethod("minimumDimensions")
    @ByValue
    public CMVideoDimensions _minimumDimensions() {
        return minimumDimensions();
    }

    @Generated
    @Owned
    @Selector("new")
    public static native VTLowLatencyFrameInterpolationConfiguration new_objc();

    @Generated
    @IsOptional
    @Selector("nextFrameCount")
    @NInt
    public native long nextFrameCount();

    /**
     * Number of uniformly spaced frames for which you configured the processor.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("numberOfInterpolatedFrames")
    @NInt
    public native long numberOfInterpolatedFrames();

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

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("sourcePixelBufferAttributes")
    @NotNull
    public native NSDictionary<String, ?> sourcePixelBufferAttributes();

    /**
     * Configured spatial scale factor as an integer.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("spatialScaleFactor")
    @NInt
    public native long spatialScaleFactor();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}