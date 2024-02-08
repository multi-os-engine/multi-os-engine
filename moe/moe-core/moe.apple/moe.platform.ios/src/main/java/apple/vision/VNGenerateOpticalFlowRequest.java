package apple.vision;

import apple.NSObject;
import apple.coregraphics.opaque.CGImageRef;
import apple.coreimage.CIImage;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSIndexSet;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * VNGenerateOpticalFlowRequest will determine directional change vectors for each pixel in the targeted image to
 * transform it into the image processed
 * by the request handler, reporting this result with a single VNPixelBufferObservation.
 * 
 * Because this request works at the pixel level, both images must have the same dimensions in order for the request to
 * be successfully performed.
 * Setting a region of interest will isolate where the change determination is performed; however, the resultant
 * observation will still be reported
 * with a full resolution VNPixelBufferObservation.
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
 * VNImageRequestHandler* imageRequestHandler = [[VNImageRequestHandler alloc] initWithCVPixelBuffer:fromImage
 * options:@{}];
 * VNGenerateOpticalFlowRequest* request = [[VNGenerateOpticalFlowRequest alloc] initWithTargetedCVPixelBuffer:toImage
 * options:@{}];
 * if (![imageRequestHandler performRequests:@[ request ] error:error])
 * {
 * return nil;
 * }
 * 
 * return [[request results] firstObject];
 * }
 * 
 * API-Since: 14.0
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNGenerateOpticalFlowRequest extends VNTargetedImageRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected VNGenerateOpticalFlowRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNGenerateOpticalFlowRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native VNGenerateOpticalFlowRequest allocWithZone(VoidPtr zone);

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
     * The level of accuracy used to compute the optical flow. Default is
     * VNGenerateOpticalFlowRequestComputationAccuracyMedium.
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

    @Generated
    @Selector("init")
    public native VNGenerateOpticalFlowRequest init();

    @Generated
    @Selector("initWithCompletionHandler:")
    public native VNGenerateOpticalFlowRequest initWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_initWithCompletionHandler") VNRequest.Block_initWithCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedCGImage:options:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCGImageOptions(@NotNull CGImageRef cgImage,
            @NotNull NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCGImage:options:completionHandler:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCGImageOptionsCompletionHandler(
            @NotNull CGImageRef cgImage, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedCGImageOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedCGImageOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedCGImage:orientation:options:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCGImageOrientationOptions(@NotNull CGImageRef cgImage,
            int orientation, @NotNull NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCGImage:orientation:options:completionHandler:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCGImageOrientationOptionsCompletionHandler(
            @NotNull CGImageRef cgImage, int orientation, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedCGImageOrientationOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedCGImageOrientationOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedCIImage:options:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCIImageOptions(@NotNull CIImage ciImage,
            @NotNull NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCIImage:options:completionHandler:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCIImageOptionsCompletionHandler(@NotNull CIImage ciImage,
            @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedCIImageOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedCIImageOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedCIImage:orientation:options:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCIImageOrientationOptions(@NotNull CIImage ciImage,
            int orientation, @NotNull NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCIImage:orientation:options:completionHandler:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCIImageOrientationOptionsCompletionHandler(
            @NotNull CIImage ciImage, int orientation, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedCIImageOrientationOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedCIImageOrientationOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedCMSampleBuffer:options:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCMSampleBufferOptions(
            @NotNull CMSampleBufferRef sampleBuffer, @NotNull NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCMSampleBuffer:options:completionHandler:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCMSampleBufferOptionsCompletionHandler(
            @NotNull CMSampleBufferRef sampleBuffer, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedCMSampleBufferOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedCMSampleBufferOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedCMSampleBuffer:orientation:options:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCMSampleBufferOrientationOptions(
            @NotNull CMSampleBufferRef sampleBuffer, int orientation, @NotNull NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCMSampleBuffer:orientation:options:completionHandler:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCMSampleBufferOrientationOptionsCompletionHandler(
            @NotNull CMSampleBufferRef sampleBuffer, int orientation, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedCMSampleBufferOrientationOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedCMSampleBufferOrientationOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedCVPixelBuffer:options:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCVPixelBufferOptions(@NotNull CVBufferRef pixelBuffer,
            @NotNull NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCVPixelBuffer:options:completionHandler:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCVPixelBufferOptionsCompletionHandler(
            @NotNull CVBufferRef pixelBuffer, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedCVPixelBufferOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedCVPixelBufferOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedCVPixelBuffer:orientation:options:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCVPixelBufferOrientationOptions(
            @NotNull CVBufferRef pixelBuffer, int orientation, @NotNull NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCVPixelBuffer:orientation:options:completionHandler:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCVPixelBufferOrientationOptionsCompletionHandler(
            @NotNull CVBufferRef pixelBuffer, int orientation, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedCVPixelBufferOrientationOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedCVPixelBufferOrientationOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedImageData:options:")
    public native VNGenerateOpticalFlowRequest initWithTargetedImageDataOptions(@NotNull NSData imageData,
            @NotNull NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedImageData:options:completionHandler:")
    public native VNGenerateOpticalFlowRequest initWithTargetedImageDataOptionsCompletionHandler(
            @NotNull NSData imageData, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedImageDataOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedImageDataOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedImageData:orientation:options:")
    public native VNGenerateOpticalFlowRequest initWithTargetedImageDataOrientationOptions(@NotNull NSData imageData,
            int orientation, @NotNull NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedImageData:orientation:options:completionHandler:")
    public native VNGenerateOpticalFlowRequest initWithTargetedImageDataOrientationOptionsCompletionHandler(
            @NotNull NSData imageData, int orientation, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedImageDataOrientationOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedImageDataOrientationOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedImageURL:options:")
    public native VNGenerateOpticalFlowRequest initWithTargetedImageURLOptions(@NotNull NSURL imageURL,
            @NotNull NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedImageURL:options:completionHandler:")
    public native VNGenerateOpticalFlowRequest initWithTargetedImageURLOptionsCompletionHandler(@NotNull NSURL imageURL,
            @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedImageURLOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedImageURLOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedImageURL:orientation:options:")
    public native VNGenerateOpticalFlowRequest initWithTargetedImageURLOrientationOptions(@NotNull NSURL imageURL,
            int orientation, @NotNull NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedImageURL:orientation:options:completionHandler:")
    public native VNGenerateOpticalFlowRequest initWithTargetedImageURLOrientationOptionsCompletionHandler(
            @NotNull NSURL imageURL, int orientation, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedImageURLOrientationOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedImageURLOrientationOptionsCompletionHandler completionHandler);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native VNGenerateOpticalFlowRequest new_objc();

    /**
     * Pixel format type of the output buffer. Valid values are kCVPixelFormatType_TwoComponent32Float and
     * kCVPixelFormatType_TwoComponent16Half.
     * Default is kCVPixelFormatType_TwoComponent32Float.
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
     * The level of accuracy used to compute the optical flow. Default is
     * VNGenerateOpticalFlowRequestComputationAccuracyMedium.
     * 
     * The computational time typically trends with the accuracy level. This parameter allows for selective tuning by
     * the client application.
     */
    @Generated
    @Selector("setComputationAccuracy:")
    public native void setComputationAccuracy(@NUInt long value);

    /**
     * Pixel format type of the output buffer. Valid values are kCVPixelFormatType_TwoComponent32Float and
     * kCVPixelFormatType_TwoComponent16Half.
     * Default is kCVPixelFormatType_TwoComponent32Float.
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

    @NotNull
    @Generated
    @Selector("supportedRevisions")
    public static native NSIndexSet supportedRevisions();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * VNPixelBufferObservation results.
     */
    @Nullable
    @Generated
    @Selector("results")
    public native NSArray<? extends VNPixelBufferObservation> results();

    /**
     * Setting this to YES will keep the raw pixel buffer coming from the the ML network. The default is NO.
     * 
     * When set to YES, the outputPixelFormat is ignored. Setting this for revision 1 is a no-op as it is not ML-based.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("keepNetworkOutput")
    public native boolean keepNetworkOutput();

    /**
     * Setting this to YES will keep the raw pixel buffer coming from the the ML network. The default is NO.
     * 
     * When set to YES, the outputPixelFormat is ignored. Setting this for revision 1 is a no-op as it is not ML-based.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setKeepNetworkOutput:")
    public native void setKeepNetworkOutput(boolean value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
