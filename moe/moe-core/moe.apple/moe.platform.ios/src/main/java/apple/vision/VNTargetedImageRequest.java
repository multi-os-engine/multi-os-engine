package apple.vision;

import apple.NSObject;
import apple.coregraphics.opaque.CGImageRef;
import apple.coreimage.CIImage;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
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
 * A request that requires an initial image as a starting point for its work.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNTargetedImageRequest extends VNImageBasedRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected VNTargetedImageRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNTargetedImageRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native VNTargetedImageRequest allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native VNTargetedImageRequest init();

    @Generated
    @Selector("initWithCompletionHandler:")
    public native VNTargetedImageRequest initWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_initWithCompletionHandler") VNRequest.Block_initWithCompletionHandler completionHandler);

    /**
     * Create a new request with a targeted CGImage.
     * 
     * @param cgImage The CGImageRef of the targeted image.
     * @param options A dictionary with options specifying auxiliary information for the image.
     */
    @Generated
    @Selector("initWithTargetedCGImage:options:")
    public native VNTargetedImageRequest initWithTargetedCGImageOptions(@NotNull CGImageRef cgImage,
            @NotNull NSDictionary<String, ?> options);

    /**
     * Create a new request with a targeted CGImage.
     * 
     * @param cgImage           The CGImageRef of the targeted image.
     * @param options           A dictionary with options specifying auxiliary information for the image.
     * @param completionHandler The block that is invoked when the request has been performed.
     */
    @Generated
    @Selector("initWithTargetedCGImage:options:completionHandler:")
    public native VNTargetedImageRequest initWithTargetedCGImageOptionsCompletionHandler(@NotNull CGImageRef cgImage,
            @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedCGImageOptionsCompletionHandler") Block_initWithTargetedCGImageOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTargetedCGImageOptionsCompletionHandler {
        @Generated
        void call_initWithTargetedCGImageOptionsCompletionHandler(@NotNull VNRequest request, @Nullable NSError error);
    }

    /**
     * Create a new request with a targeted CGImage.
     * 
     * @param cgImage     The CGImageRef of the targeted image.
     * @param orientation The orientation of the image/buffer based on the EXIF specification. For details see
     *                    kCGImagePropertyOrientation. The value has to be an integer from 1 to 8. This supersedes every
     *                    other orientation information.
     * @param options     A dictionary with options specifying auxiliary information for the image.
     */
    @Generated
    @Selector("initWithTargetedCGImage:orientation:options:")
    public native VNTargetedImageRequest initWithTargetedCGImageOrientationOptions(@NotNull CGImageRef cgImage,
            int orientation, @NotNull NSDictionary<String, ?> options);

    /**
     * Create a new request with a targeted CGImage.
     * 
     * @param cgImage           The CGImageRef of the targeted image.
     * @param orientation       The orientation of the image/buffer based on the EXIF specification. For details see
     *                          kCGImagePropertyOrientation. The value has to be an integer from 1 to 8. This supersedes
     *                          every other orientation information.
     * @param options           A dictionary with options specifying auxiliary information for the image.
     * @param completionHandler The block that is invoked when the request has been performed.
     */
    @Generated
    @Selector("initWithTargetedCGImage:orientation:options:completionHandler:")
    public native VNTargetedImageRequest initWithTargetedCGImageOrientationOptionsCompletionHandler(
            @NotNull CGImageRef cgImage, int orientation, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedCGImageOrientationOptionsCompletionHandler") Block_initWithTargetedCGImageOrientationOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTargetedCGImageOrientationOptionsCompletionHandler {
        @Generated
        void call_initWithTargetedCGImageOrientationOptionsCompletionHandler(@NotNull VNRequest request,
                @Nullable NSError error);
    }

    /**
     * Create a new request with a targeted CIImage.
     * 
     * @param ciImage The CIImage of the targeted image.
     * @param options A dictionary with options specifying auxiliary information for the image.
     */
    @Generated
    @Selector("initWithTargetedCIImage:options:")
    public native VNTargetedImageRequest initWithTargetedCIImageOptions(@NotNull CIImage ciImage,
            @NotNull NSDictionary<String, ?> options);

    /**
     * Create a new request with a targeted CIImage.
     * 
     * @param ciImage           The CIImage of the targeted image.
     * @param options           A dictionary with options specifying auxiliary information for the image.
     * @param completionHandler The block that is invoked when the request has been performed.
     */
    @Generated
    @Selector("initWithTargetedCIImage:options:completionHandler:")
    public native VNTargetedImageRequest initWithTargetedCIImageOptionsCompletionHandler(@NotNull CIImage ciImage,
            @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedCIImageOptionsCompletionHandler") Block_initWithTargetedCIImageOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTargetedCIImageOptionsCompletionHandler {
        @Generated
        void call_initWithTargetedCIImageOptionsCompletionHandler(@NotNull VNRequest request, @Nullable NSError error);
    }

    /**
     * Create a new request with a targeted CIImage.
     * 
     * @param ciImage     The CIImage of the targeted image.
     * @param orientation The orientation of the image/buffer based on the EXIF specification. For details see
     *                    kCGImagePropertyOrientation. The value has to be an integer from 1 to 8. This supersedes every
     *                    other orientation information.
     * @param options     A dictionary with options specifying auxiliary information for the image.
     */
    @Generated
    @Selector("initWithTargetedCIImage:orientation:options:")
    public native VNTargetedImageRequest initWithTargetedCIImageOrientationOptions(@NotNull CIImage ciImage,
            int orientation, @NotNull NSDictionary<String, ?> options);

    /**
     * Create a new request with a targeted CIImage.
     * 
     * @param ciImage           The CIImage of the targeted image.
     * @param orientation       The orientation of the image/buffer based on the EXIF specification. For details see
     *                          kCGImagePropertyOrientation. The value has to be an integer from 1 to 8. This supersedes
     *                          every other orientation information.
     * @param options           A dictionary with options specifying auxiliary information for the image.
     * @param completionHandler The block that is invoked when the request has been performed.
     */
    @Generated
    @Selector("initWithTargetedCIImage:orientation:options:completionHandler:")
    public native VNTargetedImageRequest initWithTargetedCIImageOrientationOptionsCompletionHandler(
            @NotNull CIImage ciImage, int orientation, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedCIImageOrientationOptionsCompletionHandler") Block_initWithTargetedCIImageOrientationOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTargetedCIImageOrientationOptionsCompletionHandler {
        @Generated
        void call_initWithTargetedCIImageOrientationOptionsCompletionHandler(@NotNull VNRequest request,
                @Nullable NSError error);
    }

    /**
     * Create a new request that targets an image in a pixel buffer.
     * 
     * @param pixelBuffer The pixel buffer containing the targeted image.
     * @param options     A dictionary with options specifying auxiliary information for the image.
     */
    @Generated
    @Selector("initWithTargetedCVPixelBuffer:options:")
    public native VNTargetedImageRequest initWithTargetedCVPixelBufferOptions(@NotNull CVBufferRef pixelBuffer,
            @NotNull NSDictionary<String, ?> options);

    /**
     * Create a new request that targets an image in a pixel buffer.
     * 
     * @param pixelBuffer       The pixel buffer containing the targeted image.
     * @param options           A dictionary with options specifying auxiliary information for the image.
     * @param completionHandler The block that is invoked when the request has been performed.
     */
    @Generated
    @Selector("initWithTargetedCVPixelBuffer:options:completionHandler:")
    public native VNTargetedImageRequest initWithTargetedCVPixelBufferOptionsCompletionHandler(
            @NotNull CVBufferRef pixelBuffer, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedCVPixelBufferOptionsCompletionHandler") Block_initWithTargetedCVPixelBufferOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTargetedCVPixelBufferOptionsCompletionHandler {
        @Generated
        void call_initWithTargetedCVPixelBufferOptionsCompletionHandler(@NotNull VNRequest request,
                @Nullable NSError error);
    }

    /**
     * Create a new request that targets an image in a pixel buffer.
     * 
     * @param pixelBuffer The pixel buffer containing the targeted image.
     * @param orientation The orientation of the image/buffer based on the EXIF specification. For details see
     *                    kCGImagePropertyOrientation. The value has to be an integer from 1 to 8. This supersedes every
     *                    other orientation information.
     * @param options     A dictionary with options specifying auxiliary information for the image.
     */
    @Generated
    @Selector("initWithTargetedCVPixelBuffer:orientation:options:")
    public native VNTargetedImageRequest initWithTargetedCVPixelBufferOrientationOptions(
            @NotNull CVBufferRef pixelBuffer, int orientation, @NotNull NSDictionary<String, ?> options);

    /**
     * Create a new request that targets an image in a pixel buffer.
     * 
     * @param pixelBuffer       The pixel buffer containing the targeted image.
     * @param orientation       The orientation of the image/buffer based on the EXIF specification. For details see
     *                          kCGImagePropertyOrientation. The value has to be an integer from 1 to 8. This supersedes
     *                          every other orientation information.
     * @param options           A dictionary with options specifying auxiliary information for the image.
     * @param completionHandler The block that is invoked when the request has been performed.
     */
    @Generated
    @Selector("initWithTargetedCVPixelBuffer:orientation:options:completionHandler:")
    public native VNTargetedImageRequest initWithTargetedCVPixelBufferOrientationOptionsCompletionHandler(
            @NotNull CVBufferRef pixelBuffer, int orientation, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedCVPixelBufferOrientationOptionsCompletionHandler") Block_initWithTargetedCVPixelBufferOrientationOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTargetedCVPixelBufferOrientationOptionsCompletionHandler {
        @Generated
        void call_initWithTargetedCVPixelBufferOrientationOptionsCompletionHandler(@NotNull VNRequest request,
                @Nullable NSError error);
    }

    /**
     * Create a new request with a targeted image data.
     * 
     * @param imageData The data of the targeted image.
     * @param options   A dictionary with options specifying auxiliary information for the image.
     */
    @Generated
    @Selector("initWithTargetedImageData:options:")
    public native VNTargetedImageRequest initWithTargetedImageDataOptions(@NotNull NSData imageData,
            @NotNull NSDictionary<String, ?> options);

    /**
     * Create a new request with a targeted image data.
     * 
     * @param imageData         The data of the targeted image.
     * @param options           A dictionary with options specifying auxiliary information for the image.
     * @param completionHandler The block that is invoked when the request has been performed.
     */
    @Generated
    @Selector("initWithTargetedImageData:options:completionHandler:")
    public native VNTargetedImageRequest initWithTargetedImageDataOptionsCompletionHandler(@NotNull NSData imageData,
            @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedImageDataOptionsCompletionHandler") Block_initWithTargetedImageDataOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTargetedImageDataOptionsCompletionHandler {
        @Generated
        void call_initWithTargetedImageDataOptionsCompletionHandler(@NotNull VNRequest request,
                @Nullable NSError error);
    }

    /**
     * Create a new request with a targeted image data.
     * 
     * @param imageData   The data of the targeted image.
     * @param orientation The orientation of the image/buffer based on the EXIF specification. For details see
     *                    kCGImagePropertyOrientation. The value has to be an integer from 1 to 8. This supersedes every
     *                    other orientation information.
     * @param options     A dictionary with options specifying auxiliary information for the image.
     */
    @Generated
    @Selector("initWithTargetedImageData:orientation:options:")
    public native VNTargetedImageRequest initWithTargetedImageDataOrientationOptions(@NotNull NSData imageData,
            int orientation, @NotNull NSDictionary<String, ?> options);

    /**
     * Create a new request with a targeted image data.
     * 
     * @param imageData         The data of the targeted image.
     * @param orientation       The orientation of the image/buffer based on the EXIF specification. For details see
     *                          kCGImagePropertyOrientation. The value has to be an integer from 1 to 8. This supersedes
     *                          every other orientation information.
     * @param options           A dictionary with options specifying auxiliary information for the image.
     * @param completionHandler The block that is invoked when the request has been performed.
     */
    @Generated
    @Selector("initWithTargetedImageData:orientation:options:completionHandler:")
    public native VNTargetedImageRequest initWithTargetedImageDataOrientationOptionsCompletionHandler(
            @NotNull NSData imageData, int orientation, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedImageDataOrientationOptionsCompletionHandler") Block_initWithTargetedImageDataOrientationOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTargetedImageDataOrientationOptionsCompletionHandler {
        @Generated
        void call_initWithTargetedImageDataOrientationOptionsCompletionHandler(@NotNull VNRequest request,
                @Nullable NSError error);
    }

    /**
     * Create a new request with a targeted image URL.
     * 
     * @param imageURL The URL of the targeted image.
     * @param options  A dictionary with options specifying auxiliary information for the image.
     */
    @Generated
    @Selector("initWithTargetedImageURL:options:")
    public native VNTargetedImageRequest initWithTargetedImageURLOptions(@NotNull NSURL imageURL,
            @NotNull NSDictionary<String, ?> options);

    /**
     * Create a new request with a targeted image URL.
     * 
     * @param imageURL          The URL of the targeted image.
     * @param options           A dictionary with options specifying auxiliary information for the image.
     * @param completionHandler The block that is invoked when the request has been performed.
     */
    @Generated
    @Selector("initWithTargetedImageURL:options:completionHandler:")
    public native VNTargetedImageRequest initWithTargetedImageURLOptionsCompletionHandler(@NotNull NSURL imageURL,
            @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedImageURLOptionsCompletionHandler") Block_initWithTargetedImageURLOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTargetedImageURLOptionsCompletionHandler {
        @Generated
        void call_initWithTargetedImageURLOptionsCompletionHandler(@NotNull VNRequest request, @Nullable NSError error);
    }

    /**
     * Create a new request with a targeted image URL.
     * 
     * @param imageURL    The URL of the targeted image.
     * @param orientation The orientation of the image/buffer based on the EXIF specification. For details see
     *                    kCGImagePropertyOrientation. The value has to be an integer from 1 to 8. This supersedes every
     *                    other orientation information.
     * @param options     A dictionary with options specifying auxiliary information for the image.
     */
    @Generated
    @Selector("initWithTargetedImageURL:orientation:options:")
    public native VNTargetedImageRequest initWithTargetedImageURLOrientationOptions(@NotNull NSURL imageURL,
            int orientation, @NotNull NSDictionary<String, ?> options);

    /**
     * Create a new request with a targeted image URL.
     * 
     * @param imageURL          The URL of the targeted image.
     * @param orientation       The orientation of the image/buffer based on the EXIF specification. For details see
     *                          kCGImagePropertyOrientation. The value has to be an integer from 1 to 8. This supersedes
     *                          every other orientation information.
     * @param options           A dictionary with options specifying auxiliary information for the image.
     * @param completionHandler The block that is invoked when the request has been performed.
     */
    @Generated
    @Selector("initWithTargetedImageURL:orientation:options:completionHandler:")
    public native VNTargetedImageRequest initWithTargetedImageURLOrientationOptionsCompletionHandler(
            @NotNull NSURL imageURL, int orientation, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedImageURLOrientationOptionsCompletionHandler") Block_initWithTargetedImageURLOrientationOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTargetedImageURLOrientationOptionsCompletionHandler {
        @Generated
        void call_initWithTargetedImageURLOrientationOptionsCompletionHandler(@NotNull VNRequest request,
                @Nullable NSError error);
    }

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
    public static native VNTargetedImageRequest new_objc();

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
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("currentRevision")
    @NUInt
    public static native long currentRevision();

    @Generated
    @Selector("defaultRevision")
    @NUInt
    public static native long defaultRevision();

    @NotNull
    @Generated
    @Selector("supportedRevisions")
    public static native NSIndexSet supportedRevisions();

    /**
     * Create a new request with a targeted CMSampleBuffer.
     * 
     * @param sampleBuffer The CMSampleBuffer containing the CVImageBuffer to be used by the request.
     * @param options      A dictionary with options specifying auxiliary information for the image.
     * 
     *                     API-Since: 14.0
     */
    @Generated
    @Selector("initWithTargetedCMSampleBuffer:options:")
    public native VNTargetedImageRequest initWithTargetedCMSampleBufferOptions(@NotNull CMSampleBufferRef sampleBuffer,
            @NotNull NSDictionary<String, ?> options);

    /**
     * Create a new request with a targeted CMSampleBuffer.
     * 
     * @param sampleBuffer      The CMSampleBuffer containing the CVImageBuffer to be used by the request.
     * @param options           A dictionary with options specifying auxiliary information for the image.
     * @param completionHandler The block that is invoked after the request has been performed.
     * 
     *                          API-Since: 14.0
     */
    @Generated
    @Selector("initWithTargetedCMSampleBuffer:options:completionHandler:")
    public native VNTargetedImageRequest initWithTargetedCMSampleBufferOptionsCompletionHandler(
            @NotNull CMSampleBufferRef sampleBuffer, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedCMSampleBufferOptionsCompletionHandler") Block_initWithTargetedCMSampleBufferOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTargetedCMSampleBufferOptionsCompletionHandler {
        @Generated
        void call_initWithTargetedCMSampleBufferOptionsCompletionHandler(@NotNull VNRequest request,
                @Nullable NSError error);
    }

    /**
     * Create a new request with a targeted CMSampleBuffer.
     * 
     * @param sampleBuffer The CMSampleBuffer containing the CVImageBuffer to be used by the request.
     * @param orientation  The orientation of the image/buffer based on the EXIF specification. For details see
     *                     kCGImagePropertyOrientation. The value has to be an integer from 1 to 8. This supersedes
     *                     every other orientation information.
     * @param options      A dictionary with options specifying auxiliary information for the image.
     * 
     *                     API-Since: 14.0
     */
    @Generated
    @Selector("initWithTargetedCMSampleBuffer:orientation:options:")
    public native VNTargetedImageRequest initWithTargetedCMSampleBufferOrientationOptions(
            @NotNull CMSampleBufferRef sampleBuffer, int orientation, @NotNull NSDictionary<String, ?> options);

    /**
     * Create a new request with a targeted CMSampleBuffer.
     * 
     * @param sampleBuffer      The CMSampleBuffer containing the CVImageBuffer to be used by the request.
     * @param orientation       The orientation of the image/buffer based on the EXIF specification. For details see
     *                          kCGImagePropertyOrientation. The value has to be an integer from 1 to 8. This supersedes
     *                          every other orientation information.
     * @param options           A dictionary with options specifying auxiliary information for the image.
     * @param completionHandler The block that is invoked after the request has been performed.
     * 
     *                          API-Since: 14.0
     */
    @Generated
    @Selector("initWithTargetedCMSampleBuffer:orientation:options:completionHandler:")
    public native VNTargetedImageRequest initWithTargetedCMSampleBufferOrientationOptionsCompletionHandler(
            @NotNull CMSampleBufferRef sampleBuffer, int orientation, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedCMSampleBufferOrientationOptionsCompletionHandler") Block_initWithTargetedCMSampleBufferOrientationOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTargetedCMSampleBufferOrientationOptionsCompletionHandler {
        @Generated
        void call_initWithTargetedCMSampleBufferOrientationOptionsCompletionHandler(@NotNull VNRequest request,
                @Nullable NSError error);
    }
}
