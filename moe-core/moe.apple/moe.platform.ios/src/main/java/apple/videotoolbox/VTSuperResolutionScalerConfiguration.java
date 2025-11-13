package apple.videotoolbox;

import apple.NSObject;
import apple.coremedia.struct.CMVideoDimensions;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Configuration that you use to set up the super-resolution processor.
 * 
 * This configuration enables the super-resolution processor on a `VTFrameProcessor` session.
 * 
 * > Important: The super-resolution processor may require ML models which the framework needs to download in order to
 * operate. Before calling ``VTFrameProcessor/startSessionWithConfiguration:error:`` with an instance of this class,
 * it is important that you verify that the necessary models are present by checking ``configurationModelStatus``.
 * If models are not available, you can trigger model download using the
 * ``downloadConfigurationModelWithCompletionHandler:``
 * method. Best practice is to confirm availability of models and drive download with user awareness and interaction
 * before engaging workflows that need this processor.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("VideoToolbox")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VTSuperResolutionScalerConfiguration extends NSObject implements VTFrameProcessorConfiguration {
    static {
        NatJ.register();
    }

    @Generated
    protected VTSuperResolutionScalerConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VTSuperResolutionScalerConfiguration alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native VTSuperResolutionScalerConfiguration allocWithZone(VoidPtr zone);

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
     * Returns a floating point value between 0.0 and 1.0 indicating the percentage of required model assets that have
     * been downloaded.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("configurationModelPercentageAvailable")
    public native float configurationModelPercentageAvailable();

    /**
     * Reports the download status of models that the system needs for the current configuration.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("configurationModelStatus")
    @NInt
    public native long configurationModelStatus();

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
     * Downloads models that the system needs for the current configuration.
     * 
     * This method downloads model assets required for the current configuration in background. You should call this
     * method
     * if ``configurationModelStatus`` is ``VTSuperResolutionScalerConfigurationModelStatusDownloadRequired``. After
     * this
     * method is called, you can query ``configurationModelPercentageAvailable`` to determine progress of model asset
     * download process. If the download fails, the completion handler is invoked with an `NSError`, and the
     * ``configurationModelStatus`` goes back to ``VTSuperResolutionScalerConfigurationModelStatusDownloadRequired``. If
     * the download succeeds, the completion handler is invoked with `nil` NSError.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("downloadConfigurationModelWithCompletionHandler:")
    public native void downloadConfigurationModelWithCompletionHandler(
            @ObjCBlock(name = "call_downloadConfigurationModelWithCompletionHandler") @NotNull Block_downloadConfigurationModelWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_downloadConfigurationModelWithCompletionHandler {
        @Generated
        void call_downloadConfigurationModelWithCompletionHandler(@Nullable NSError error);
    }

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
    public native VTSuperResolutionScalerConfiguration init();

    /**
     * Creates a new super-resolution scaler processor configuration.
     * 
     * This processor increases resolution of an image or video.
     * Returns `nil` if dimensions are out of range or revision is unsupported.
     * 
     * - Parameters:
     * - frameWidth: Width of source frame in pixels. With ``VTSuperResolutionScalerConfigurationInputTypeVideo``,
     * maximum width is 1920 on macOS and 1440 on iOS. With ``VTSuperResolutionScalerConfigurationInputTypeImage``,
     * maximum width is 1920.
     * - frameHeight: Height of source frame in pixels. With ``VTSuperResolutionScalerConfigurationInputTypeVideo``,
     * maximum height is 1080. With ``VTSuperResolutionScalerConfigurationInputTypeImage``, maximum height is 1920 on
     * macOS and 1080 on iOS.
     * - scaleFactor: Indicates the scale factor between input and output.
     * - inputType: Indicates the type of input, either video or image.
     * - usePrecomputedFlow: Boolean value to indicate that you provide optical flow; if false, this configuration
     * computes the optical flow on the fly.
     * - qualityPrioritization: A level you use to prioritize quality or performance; for more information about
     * supported levels, see ``VTSuperResolutionScalerConfigurationQualityPrioritization``.
     * - revision: The specific algorithm or configuration revision you use to perform the request.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithFrameWidth:frameHeight:scaleFactor:inputType:usePrecomputedFlow:qualityPrioritization:revision:")
    public native VTSuperResolutionScalerConfiguration initWithFrameWidthFrameHeightScaleFactorInputTypeUsePrecomputedFlowQualityPrioritizationRevision(
            @NInt long frameWidth, @NInt long frameHeight, @NInt long scaleFactor, @NInt long inputType,
            boolean usePrecomputedFlow, @NInt long qualityPrioritization, @NInt long revision);

    /**
     * Indicates the type of input.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("inputType")
    @NInt
    public native long inputType();

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
    public static native VTSuperResolutionScalerConfiguration new_objc();

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
     * A parameter to control quality and performance levels.
     * 
     * For more information about supported levels, see ``VTSuperResolutionScalerConfigurationQualityPrioritization``.
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

    /**
     * Indicates the scale factor between input and output.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("scaleFactor")
    @NInt
    public native long scaleFactor();

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
     * Reports the set of supported scale factors to use when initializing a super-resolution scaler configuration.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("supportedScaleFactors")
    @NotNull
    public static native NSArray<? extends NSNumber> supportedScaleFactors();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * Indicates that you provide optical flow.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("usesPrecomputedFlow")
    public native boolean usesPrecomputedFlow();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}