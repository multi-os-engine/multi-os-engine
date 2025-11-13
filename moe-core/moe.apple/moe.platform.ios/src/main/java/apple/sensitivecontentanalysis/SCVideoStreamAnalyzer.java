package apple.sensitivecontentanalysis;

import apple.NSObject;
import apple.avfoundation.AVCaptureDeviceInput;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.videotoolbox.opaque.VTDecompressionSessionRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Monitors a stream of video by analyzing frames for sensitive content.
 * 
 * Use this class to detect senstive content in a video stream, such as on a conference call that your app implements.
 * The class detects senstive content in the video stream from either the device's camera or the remote device(s) signed
 * into the call, depending on how you configure the analyzer.
 * 
 * Create an instance of this class for each video stream in the call.
 * 
 * To begin analyzing the stream, pass it to either ``beginAnalysis(of:)-(AVCaptureDeviceInput)``
 * (<doc://com.apple.documentation/documentation/avfoundation/avcapturedeviceinput>) or
 * ``beginAnalysis(of:)-(VTDecompressionSession)``
 * (<doc://com.apple.documentation/documentation/videotoolbox/vtdecompressionsession>), depending on your video playback
 * implementation.
 * 
 * - Important: This class works only when the Communication Safety parental control in Screen Time is enabled, or when
 * Sensitive Content Warnings is on in Settings. The initializers of this class throw an error if both settings are off.
 * 
 * ### React to sensitive content
 * 
 * When the framework detects sensitive content in the stream, it calls ``analysisChangedHandler`` immediately with an
 * ``SCSensitivityAnalysis`` object that includes information about the detection.
 * 
 * You implement the ``analysisChangedHandler`` callback to inspect the detection results, which includes confirmation
 * that content is sensitve as well as guidance on next steps your app can take. The framework offers your app
 * suggestions in the handler, which include:
 * 
 * - Alerting the person to the presence of sensitive content (``SCSensitivityAnalysis/shouldIndicateSensitivity``)
 * - Interrupting video playback (``SCSensitivityAnalysis/shouldInterruptVideo``)
 * - Muting audio (``SCSensitivityAnalysis/shouldMuteAudio``)
 * 
 * To stop analyzing the stream, call ``endAnalysis()``. If your app implements a custom stream decoder, you can analyze
 * individual frames by passing pixel buffers to ``analyze(_:)``.
 * 
 * In the event of an error during analysis, the handler receives an error object that details what went wrong. For more
 * information, see: ``SCVideoStreamAnalysisChangeHandler``.
 * 
 * ### Add the app entitlement
 * 
 * To use this class, the system requires the
 * <doc://com.apple.documentation/documentation/bundleresources/entitlements/com.apple.developer.sensitivecontentanalysis.client>
 * entitlement in your app's code signature. Calls to the framework fail to return positive results without it. You can
 * can add this entitlement to your app by enabling the Sensitive Content Analysis capability in Xcode; see
 * <doc://com.apple.documentation/documentation/xcode/adding-capabilities-to-your-app>.
 * 
 * For more information, see <doc:detecting-nudity-in-media-and-providing-intervention-options>.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("SensitiveContentAnalysis")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCVideoStreamAnalyzer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SCVideoStreamAnalyzer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCVideoStreamAnalyzer alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native SCVideoStreamAnalyzer allocWithZone(VoidPtr zone);

    /**
     * The results of the first detected sensitive video frame.
     * 
     * The analysis also includes suggestions for the app based on the nature of the sensitive content, specifically:
     * ``SCSensitivityAnalysis/shouldInterruptVideo``, ``SCSensitivityAnalysis/shouldIndicateSensitivity`` and
     * ``SCSensitivityAnalysis/shouldMuteAudio``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("analysis")
    @Nullable
    public native SCSensitivityAnalysis analysis();

    /**
     * A handler that your app provides to react to sensitive content detection.
     * 
     * The system invokes all analyzer handlers on the same conference call with the updated analysis or error.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("analysisChangedHandler")
    @ObjCBlock(name = "call_analysisChangedHandler_ret")
    @Nullable
    public native Block_analysisChangedHandler_ret analysisChangedHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_analysisChangedHandler_ret {
        @Generated
        void call_analysisChangedHandler_ret(@Nullable SCSensitivityAnalysis arg0, @Nullable NSError arg1);
    }

    /**
     * Analyzes individual video-stream frames for sensitive content.
     * 
     * This method analyzes a specific video frame and updates ``analysis`` according to the results. If your app
     * implements a custom stream decoder, you can call this method for each video frame.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("analyzePixelBuffer:")
    public native void analyzePixelBuffer(@NotNull CVBufferRef pixelBuffer);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Analyzes video frames for the given capture device input.
     * 
     * - parameter captureDeviceInput: An object that contains information about the specific camera and its captured
     * content in the video stream.
     * - parameter error: An error object that describes an issue that occurs while processing the capture device input.
     * - returns: `YES` if the method succeeds; otherwise, `NO`.
     * 
     * Call this method to begin analyzing a video stream from the given
     * <doc://com.apple.documentation/documentation/avfoundation/avcapturedeviceinput>. If the framework detects
     * sensitive content in the video stream, the capture-device-input interrupts subsequent frames with the
     * `AVCaptureSessionInterruptionReasonSensitiveContentMitigationActivated` interruption reason to effectively censor
     * the video stream on the person's behalf. When your app is ready to show the video stream again, resume analysis
     * by calling ``continueStream``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("beginAnalysisOfCaptureDeviceInput:error:")
    public native boolean beginAnalysisOfCaptureDeviceInputError(@NotNull AVCaptureDeviceInput captureDeviceInput,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Analyzes video frames for the given decompression session.
     * 
     * - parameter decompressionSession: An object that provides video frames for your app to analyze for sensitive
     * content.
     * - parameter error: An error object that describes an issue that occurs while providing the video decompression
     * session.
     * - returns: `YES` if the method succeeds; otherwise, `NO`.
     * 
     * If the framework detects sensitive content in the video stream, the
     * <doc://com.apple.documentation/documentation/videotoolbox/vtdecompressionsession> produces blank frames to
     * effectively censor the video stream on the person's behalf. When your app is ready to show the video stream
     * again, resume analysis by calling ``continueStream``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("beginAnalysisOfDecompressionSession:error:")
    public native boolean beginAnalysisOfDecompressionSessionError(
            @NotNull VTDecompressionSessionRef decompressionSession,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

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
     * Indicates that your app is ready to resume video stream analysis.
     * 
     * When the framework detects sensitive content in the video stream, it pauses analysis and begins censoring the
     * stream's video frames. Call this method to resume analysis and stop censoring video frames when your app is ready
     * to show the stream again.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("continueStream")
    public native void continueStream();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Stops stream analysis.
     * 
     * This method stops analyzing the video stream in reference to the most recent call to `beginAnalysis`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("endAnalysis")
    public native void endAnalysis();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native SCVideoStreamAnalyzer init();

    /**
     * Creates a video stream analyzer for the given call participant and stream option.
     * 
     * - parameter participantUUID: A unique identifier that you provide to distinguish among multiple individuals on a
     * conference call. Set this argument to the same value per person on the call, if your app supports multiple
     * streams per person.
     * - parameter streamDirection: An option that indicates whether the stream comes from the device's camera or from a
     * remote individual signed in to the call.
     * - parameter error: An error that occurs while intializing a video stream analyzer.
     * 
     * - Important: This class works only when the Communication Safety parental control in Screen Time is enabled, or
     * when Sensitive Content Warnings is on in Settings. This method throws an error if both settings are off, or if
     * the device doesn't support analysis for the specified stream direction.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithParticipantUUID:streamDirection:error:")
    public native SCVideoStreamAnalyzer initWithParticipantUUIDStreamDirectionError(@NotNull String participantUUID,
            @NInt long streamDirection, @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

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

    @Generated
    @Owned
    @Selector("new")
    public static native SCVideoStreamAnalyzer new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A handler that your app provides to react to sensitive content detection.
     * 
     * The system invokes all analyzer handlers on the same conference call with the updated analysis or error.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setAnalysisChangedHandler:")
    public native void setAnalysisChangedHandler(
            @ObjCBlock(name = "call_setAnalysisChangedHandler") @Nullable Block_setAnalysisChangedHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setAnalysisChangedHandler {
        @Generated
        void call_setAnalysisChangedHandler(@Nullable SCSensitivityAnalysis arg0, @Nullable NSError arg1);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

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