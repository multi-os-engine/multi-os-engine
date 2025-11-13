package apple.videotoolbox;

import apple.NSObject;
import apple.coremedia.struct.CMVideoDimensions;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSIndexSet;
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
 * Configuration that you use to set up the frame rate conversion processor.
 * 
 * This configuration enables the frame-rate conversion on a `VTFrameProcessor` session.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("VideoToolbox")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VTFrameRateConversionConfiguration extends NSObject implements VTFrameProcessorConfiguration {
    static {
        NatJ.register();
    }

    @Generated
    protected VTFrameRateConversionConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VTFrameRateConversionConfiguration alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native VTFrameRateConversionConfiguration allocWithZone(VoidPtr zone);

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

    /**
     * Provides the default revision of a specific algorithm or configuration.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("defaultRevision")
    @NInt
    public static native long defaultRevision();

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
    public native VTFrameRateConversionConfiguration init();

    /**
     * Creates a new frame-rate conversion configuration.
     * 
     * Returns `nil` if dimensions are out of range or revision is unsupported.
     * 
     * - Parameters:
     * - frameWidth: Width of source frame in pixels; the maximum value is 8192 for macOS, and 4096 for iOS.
     * - frameHeight: Height of source frame in pixels; the maximum value is 4320 for macOS, and 2160 for iOS.
     * - usePrecomputedFlow: A Boolean value that indicates whether you are providing Optical Flow. If false, optical
     * flow is computed on the fly.
     * - qualityPrioritization: A level you use to prioritize quality or performance; for more information about
     * supported levels, see ``VTFrameRateConversionConfigurationQualityPrioritization``.
     * - revision: The specific algorithm or configuration revision you use to perform the request.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithFrameWidth:frameHeight:usePrecomputedFlow:qualityPrioritization:revision:")
    public native VTFrameRateConversionConfiguration initWithFrameWidthFrameHeightUsePrecomputedFlowQualityPrioritizationRevision(
            @NInt long frameWidth, @NInt long frameHeight, boolean usePrecomputedFlow, @NInt long qualityPrioritization,
            @NInt long revision);

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
    public static native VTFrameRateConversionConfiguration new_objc();

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

    /**
     * A parameter you use to control quality and performance levels.
     * 
     * For more information about supported levels, see ``VTFrameRateConversionConfigurationQualityPrioritization``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("qualityPrioritization")
    @NInt
    public native long qualityPrioritization();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The specific algorithm or configuration revision you use to perform the request.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("revision")
    @NInt
    public native long revision();

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
     * Provides the collection of currently supported algorithms or configuration revisions for the class of
     * configuration.
     * 
     * A property you use to introspect at runtime which revisions are available for each configuration.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("supportedRevisions")
    @NotNull
    public static native NSIndexSet supportedRevisions();

    /**
     * Indicates that caller provides optical flow.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("usePrecomputedFlow")
    public native boolean usePrecomputedFlow();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}