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
import org.moe.natj.general.ann.MappedReturn;
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
 * VNGenerateOpticalFlowRequest will determine directional change vectors for each pixel in the targeted image to transform it into the image processed
 *        by the request handler, reporting this result with a single VNPixelBufferObservation.
 * 
 * Because this request works at the pixel level, both images must have the same dimensions in order for the request to be successfully performed.
 * 			Setting a region of interest will isolate where the change determination is performed; however, the resultant observation will still be reported
 * 			with a full resolution VNPixelBufferObservation.
 * 
 *                Optical flow requests are very resource intensive, so it is recommended that only one request at a time be created and that the handler
 *                where the request was issued be released immediately after generating optical flows.
 * 
 * 			Example usage:
 * 
 * 				- (nullable VNPixelBufferObservation*) opticalFlowFromImage:(CVPixelBufferRef)fromImage toImage:(CVPixelBuffer)toImage error:(NSError**)error
 * 				{
 * 					VNImageRequestHandler* imageRequestHandler = [[VNImageRequestHandler alloc] initWithCVPixelBuffer:fromImage options:@{}];
 * 					VNGenerateOpticalFlowRequest* request = [[VNGenerateOpticalFlowRequest alloc] initWithTargetedCVPixelBuffer:toImage options:@{}];
 * 					if (![imageRequestHandler performRequests:@[ request ] error:error])
 * 					{
 * 						return nil;
 * 					}
 * 
 * 					return [[request results] firstObject];
 * 				}
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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * The level of accuracy used to compute the optical flow. Default is VNGenerateOpticalFlowRequestComputationAccuracyMedium.
     * 
     * The computational time typically trends with the accuracy level.  This parameter allows for selective tuning by the client application.
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
            @ObjCBlock(name = "call_initWithCompletionHandler") VNRequest.Block_initWithCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedCGImage:options:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCGImageOptions(CGImageRef cgImage,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCGImage:options:completionHandler:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCGImageOptionsCompletionHandler(CGImageRef cgImage,
            NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_initWithTargetedCGImageOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedCGImageOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedCGImage:orientation:options:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCGImageOrientationOptions(CGImageRef cgImage,
            int orientation, NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCGImage:orientation:options:completionHandler:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCGImageOrientationOptionsCompletionHandler(
            CGImageRef cgImage, int orientation, NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_initWithTargetedCGImageOrientationOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedCGImageOrientationOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedCIImage:options:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCIImageOptions(CIImage ciImage,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCIImage:options:completionHandler:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCIImageOptionsCompletionHandler(CIImage ciImage,
            NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_initWithTargetedCIImageOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedCIImageOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedCIImage:orientation:options:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCIImageOrientationOptions(CIImage ciImage,
            int orientation, NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCIImage:orientation:options:completionHandler:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCIImageOrientationOptionsCompletionHandler(
            CIImage ciImage, int orientation, NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_initWithTargetedCIImageOrientationOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedCIImageOrientationOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedCMSampleBuffer:options:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCMSampleBufferOptions(CMSampleBufferRef sampleBuffer,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCMSampleBuffer:options:completionHandler:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCMSampleBufferOptionsCompletionHandler(
            CMSampleBufferRef sampleBuffer, NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_initWithTargetedCMSampleBufferOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedCMSampleBufferOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedCMSampleBuffer:orientation:options:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCMSampleBufferOrientationOptions(
            CMSampleBufferRef sampleBuffer, int orientation, NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCMSampleBuffer:orientation:options:completionHandler:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCMSampleBufferOrientationOptionsCompletionHandler(
            CMSampleBufferRef sampleBuffer, int orientation, NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_initWithTargetedCMSampleBufferOrientationOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedCMSampleBufferOrientationOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedCVPixelBuffer:options:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCVPixelBufferOptions(CVBufferRef pixelBuffer,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCVPixelBuffer:options:completionHandler:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCVPixelBufferOptionsCompletionHandler(
            CVBufferRef pixelBuffer, NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_initWithTargetedCVPixelBufferOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedCVPixelBufferOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedCVPixelBuffer:orientation:options:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCVPixelBufferOrientationOptions(CVBufferRef pixelBuffer,
            int orientation, NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCVPixelBuffer:orientation:options:completionHandler:")
    public native VNGenerateOpticalFlowRequest initWithTargetedCVPixelBufferOrientationOptionsCompletionHandler(
            CVBufferRef pixelBuffer, int orientation, NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_initWithTargetedCVPixelBufferOrientationOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedCVPixelBufferOrientationOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedImageData:options:")
    public native VNGenerateOpticalFlowRequest initWithTargetedImageDataOptions(NSData imageData,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedImageData:options:completionHandler:")
    public native VNGenerateOpticalFlowRequest initWithTargetedImageDataOptionsCompletionHandler(NSData imageData,
            NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_initWithTargetedImageDataOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedImageDataOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedImageData:orientation:options:")
    public native VNGenerateOpticalFlowRequest initWithTargetedImageDataOrientationOptions(NSData imageData,
            int orientation, NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedImageData:orientation:options:completionHandler:")
    public native VNGenerateOpticalFlowRequest initWithTargetedImageDataOrientationOptionsCompletionHandler(
            NSData imageData, int orientation, NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_initWithTargetedImageDataOrientationOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedImageDataOrientationOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedImageURL:options:")
    public native VNGenerateOpticalFlowRequest initWithTargetedImageURLOptions(NSURL imageURL,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedImageURL:options:completionHandler:")
    public native VNGenerateOpticalFlowRequest initWithTargetedImageURLOptionsCompletionHandler(NSURL imageURL,
            NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_initWithTargetedImageURLOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedImageURLOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedImageURL:orientation:options:")
    public native VNGenerateOpticalFlowRequest initWithTargetedImageURLOrientationOptions(NSURL imageURL,
            int orientation, NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedImageURL:orientation:options:completionHandler:")
    public native VNGenerateOpticalFlowRequest initWithTargetedImageURLOrientationOptionsCompletionHandler(
            NSURL imageURL, int orientation, NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_initWithTargetedImageURLOrientationOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedImageURLOrientationOptionsCompletionHandler completionHandler);

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
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * Pixel format type of the output buffer. Valid values are kCVPixelFormatType_TwoComponent32Float and kCVPixelFormatType_TwoComponent16Half.
     *        Default is kCVPixelFormatType_TwoComponent32Float.
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
     * The level of accuracy used to compute the optical flow. Default is VNGenerateOpticalFlowRequestComputationAccuracyMedium.
     * 
     * The computational time typically trends with the accuracy level.  This parameter allows for selective tuning by the client application.
     */
    @Generated
    @Selector("setComputationAccuracy:")
    public native void setComputationAccuracy(@NUInt long value);

    /**
     * Pixel format type of the output buffer. Valid values are kCVPixelFormatType_TwoComponent32Float and kCVPixelFormatType_TwoComponent16Half.
     *        Default is kCVPixelFormatType_TwoComponent32Float.
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
    public static native NSIndexSet supportedRevisions();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}