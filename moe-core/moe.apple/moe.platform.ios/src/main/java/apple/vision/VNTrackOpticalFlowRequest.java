package apple.vision;

import apple.NSObject;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSIndexSet;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * `VNTrackOpticalFlowRequest` will determine directional change vectors for each pixel from a previous to current
 * image, reporting this result with a single `VNPixelBufferObservation`.
 * 
 * Because this request works at the pixel level, both images must have the same dimensions in order for the request to
 * be successfully performed.
 * Setting a region of interest will isolate where the change determination is performed; however, the resultant
 * observation will still be reported
 * with a full resolution `VNPixelBufferObservation.
 * 
 * Being a stateful request, at least two images must me processed in order to produce an observation.
 * 
 * Optical flow requests are very resource intensive, so it is recommended that only one request at a time be created
 * and that the handler
 * where the request was issued be released immediately after generating optical flows.
 * 
 * Example usage:
 * 
 * - (nullable VNPixelBufferObservation*) opticalFlowFromImage:(CVPixelBufferRef)fromImage
 * toImage:(CVPixelBuffer)toImage error:(NSError**)error
 * {
 * VNTrackOpticalFlowRequest* request = [[VNTrackOpticalFlowRequest alloc] init];
 * 
 * VNImageRequestHandler* imageRequestHandler = [[VNImageRequestHandler alloc] initWithCVPixelBuffer:fromImage
 * options:@{}];
 * if (![imageRequestHandler performRequests:@[ request ] error:error])
 * {
 * return nil;
 * }
 * 
 * imageRequestHandler = [[VNImageRequestHandler alloc] initWithCVPixelBuffer:toImage options:@{}];
 * if (![imageRequestHandler performRequests:@[ request ] error:error])
 * {
 * return nil;
 * }
 * 
 * return [[request results] firstObject];
 * }
 * 
 * API-Since: 17.0
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNTrackOpticalFlowRequest extends VNStatefulRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected VNTrackOpticalFlowRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNTrackOpticalFlowRequest alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native VNTrackOpticalFlowRequest allocWithZone(VoidPtr zone);

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
     * The level of accuracy used to compute the optical flow. Default is
     * VNTrackOpticalFlowRequestComputationAccuracyMedium.
     * 
     * The computational time typically trends with the accuracy level. This parameter allows for selective tuning by
     * the client application.
     */
    @Generated
    @Selector("computationAccuracy")
    @NUInt
    public native long computationAccuracy();

    @Generated
    @Selector("currentRevision")
    @NUInt
    public static native long currentRevision();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("defaultRevision")
    @NUInt
    public static native long defaultRevision();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Create a new request that can statefully track the optical from from one image to another.
     * 
     * This is a convenience initializer for a frame analysis spacing of kCMTimeZero and a nil completion handler.
     */
    @Generated
    @Selector("init")
    public native VNTrackOpticalFlowRequest init();

    /**
     * Create a new request that can statefully track the optical from from one image to another.
     * 
     * This is a convenience initializer for a frame analysis spacing of kCMTimeZero.
     */
    @Generated
    @Selector("initWithCompletionHandler:")
    public native VNTrackOpticalFlowRequest initWithCompletionHandler(
            @ObjCBlock(name = "call_initWithCompletionHandler") @Nullable Block_initWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithCompletionHandler {
        @Generated
        void call_initWithCompletionHandler(@NotNull VNRequest request, @Nullable NSError error);
    }

    @Generated
    @Selector("initWithFrameAnalysisSpacing:completionHandler:")
    public native VNTrackOpticalFlowRequest initWithFrameAnalysisSpacingCompletionHandler(
            @ByValue CMTime frameAnalysisSpacing,
            @ObjCBlock(name = "call_initWithFrameAnalysisSpacingCompletionHandler") @Nullable VNStatefulRequest.Block_initWithFrameAnalysisSpacingCompletionHandler completionHandler);

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

    /**
     * Setting this to `YES` will keep the raw pixel buffer coming from the the ML network. The default is `NO`.
     * 
     * When set to `YES`, the outputPixelFormat is ignored.
     */
    @Generated
    @Selector("keepNetworkOutput")
    public native boolean keepNetworkOutput();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native VNTrackOpticalFlowRequest new_objc();

    /**
     * Pixel format type of the output buffer. Valid values are `kCVPixelFormatType_TwoComponent32Float` and
     * `kCVPixelFormatType_TwoComponent16Half`. Default is `kCVPixelFormatType_TwoComponent32Float`.
     */
    @Generated
    @Selector("outputPixelFormat")
    public native int outputPixelFormat();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * VNPixelBufferObservation results.
     */
    @Generated
    @Selector("results")
    @Nullable
    public native NSArray<? extends VNPixelBufferObservation> results();

    /**
     * The level of accuracy used to compute the optical flow. Default is
     * VNTrackOpticalFlowRequestComputationAccuracyMedium.
     * 
     * The computational time typically trends with the accuracy level. This parameter allows for selective tuning by
     * the client application.
     */
    @Generated
    @Selector("setComputationAccuracy:")
    public native void setComputationAccuracy(@NUInt long value);

    /**
     * Setting this to `YES` will keep the raw pixel buffer coming from the the ML network. The default is `NO`.
     * 
     * When set to `YES`, the outputPixelFormat is ignored.
     */
    @Generated
    @Selector("setKeepNetworkOutput:")
    public native void setKeepNetworkOutput(boolean value);

    /**
     * Pixel format type of the output buffer. Valid values are `kCVPixelFormatType_TwoComponent32Float` and
     * `kCVPixelFormatType_TwoComponent16Half`. Default is `kCVPixelFormatType_TwoComponent32Float`.
     */
    @Generated
    @Selector("setOutputPixelFormat:")
    public native void setOutputPixelFormat(int value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportedRevisions")
    @NotNull
    public static native NSIndexSet supportedRevisions();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}