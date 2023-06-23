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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Performs requests on a single image.
 * 
 * The VNImageRequestHandler is created with an image that is used to be used for the requests a client might want to
 * schedule. The VNImageRequestHandler retains, but never modifies, the image source for its entire lifetime. The client
 * also must not modify the content of the image source once the VNImageRequestHandler is created otherwise the results
 * are undefined.
 * The VNImageRequestHandler can choose to also cache intermediate representation of the image or other request-specific
 * information for the purposes of runtime performance.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNImageRequestHandler extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected VNImageRequestHandler(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNImageRequestHandler alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native VNImageRequestHandler allocWithZone(VoidPtr zone);

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
    public native VNImageRequestHandler init();

    /**
     * initWithCGImage:options creates a VNImageRequestHandler to be used for performing requests against the image
     * passed in as a CGImageRef.
     * 
     * @param image   A CGImageRef containing the image to be used for performing the requests. The content of the image
     *                cannot be modified.
     * @param options A dictionary with options specifying auxiliary information for the buffer/image like
     *                VNImageOptionCameraIntrinsics
     */
    @Generated
    @Selector("initWithCGImage:options:")
    public native VNImageRequestHandler initWithCGImageOptions(@NotNull CGImageRef image,
            @NotNull NSDictionary<String, ?> options);

    /**
     * initWithCGImage:options creates a VNImageRequestHandler to be used for performing requests against the image
     * passed in as a CGImageRef.
     * 
     * @param image       A CGImageRef containing the image to be used for performing the requests. The content of the
     *                    image cannot be modified.
     * @param orientation The orientation of the image/buffer based on the EXIF specification. For details see
     *                    kCGImagePropertyOrientation. The value has to be an integer from 1 to 8. This supersedes every
     *                    other orientation information.
     * @param options     A dictionary with options specifying auxiliary information for the buffer/image like
     *                    VNImageOptionCameraIntrinsics
     */
    @Generated
    @Selector("initWithCGImage:orientation:options:")
    public native VNImageRequestHandler initWithCGImageOrientationOptions(@NotNull CGImageRef image, int orientation,
            @NotNull NSDictionary<String, ?> options);

    /**
     * initWithCIImage:options creates a VNImageRequestHandler to be used for performing requests against the image
     * passed in as a CIImage.
     * 
     * [@note] Request results may not be accurate in simulator due to CI's inability to render certain pixel formats in
     * the simulator. The orientation of the original image should be applied for instance by using
     * imageByApplyingOrientation or use the initWithCIImage:options:orientation API.
     * 
     * @param image   A CIImage containing the image to be used for performing the requests. The content of the image
     *                cannot be modified.
     * @param options A dictionary with options specifying auxiliary information for the buffer/image like
     *                VNImageOptionCameraIntrinsics
     */
    @Generated
    @Selector("initWithCIImage:options:")
    public native VNImageRequestHandler initWithCIImageOptions(@NotNull CIImage image,
            @NotNull NSDictionary<String, ?> options);

    /**
     * initWithCIImage:options:orientation creates a VNImageRequestHandler to be used for performing requests against
     * the image passed in as a CIImage.
     * 
     * [@note] Request results may not be accurate in simulator due to CI's inability to render certain pixel formats in
     * the simulator
     * 
     * @param image       A CIImage containing the image to be used for performing the requests. The content of the
     *                    image cannot be modified.
     * @param orientation The orientation of the image/buffer based on the EXIF specification. For details see
     *                    kCGImagePropertyOrientation. The value has to be an integer from 1 to 8. This supersedes every
     *                    other orientation information.
     * @param options     A dictionary with options specifying auxiliary information for the buffer/image like
     *                    VNImageOptionCameraIntrinsics
     */
    @Generated
    @Selector("initWithCIImage:orientation:options:")
    public native VNImageRequestHandler initWithCIImageOrientationOptions(@NotNull CIImage image, int orientation,
            @NotNull NSDictionary<String, ?> options);

    /**
     * initWithCVPixelBuffer:options creates a VNImageRequestHandler to be used for performing requests against the
     * image passed in as buffer.
     * 
     * @param pixelBuffer A CVPixelBuffer containing the image to be used for performing the requests. The content of
     *                    the buffer cannot be modified for the lifetime of the VNImageRequestHandler.
     * @param options     A dictionary with options specifying auxiliary information for the buffer/image like
     *                    VNImageOptionCameraIntrinsics
     */
    @Generated
    @Selector("initWithCVPixelBuffer:options:")
    public native VNImageRequestHandler initWithCVPixelBufferOptions(@NotNull CVBufferRef pixelBuffer,
            @NotNull NSDictionary<String, ?> options);

    /**
     * initWithCVPixelBuffer:options creates a VNImageRequestHandler to be used for performing requests against the
     * image passed in as buffer.
     * 
     * @param pixelBuffer A CVPixelBuffer containing the image to be used for performing the requests. The content of
     *                    the buffer cannot be modified for the lifetime of the VNImageRequestHandler.
     * @param orientation The orientation of the image/buffer based on the EXIF specification. For details see
     *                    kCGImagePropertyOrientation. The value has to be an integer from 1 to 8. This supersedes every
     *                    other orientation information.
     * @param options     A dictionary with options specifying auxiliary information for the buffer/image like
     *                    VNImageOptionCameraIntrinsics
     */
    @Generated
    @Selector("initWithCVPixelBuffer:orientation:options:")
    public native VNImageRequestHandler initWithCVPixelBufferOrientationOptions(@NotNull CVBufferRef pixelBuffer,
            int orientation, @NotNull NSDictionary<String, ?> options);

    /**
     * initWithData:options creates a VNImageRequestHandler to be used for performing requests against an image
     * contained in an NSData object.
     * 
     * [@note] Request results may not be accurate in simulator due to CI's inability to render certain pixel formats in
     * the simulator
     * 
     * @param imageData An NSData object containing the content of the image to be used for performing the requests. See
     *                  CIImage imageWithData for supported format. The content of the image cannot be modified.
     * @param options   A dictionary with options specifying auxiliary information for the buffer/image like
     *                  VNImageOptionCameraIntrinsics
     */
    @Generated
    @Selector("initWithData:options:")
    public native VNImageRequestHandler initWithDataOptions(@NotNull NSData imageData,
            @NotNull NSDictionary<String, ?> options);

    /**
     * initWithData:options creates a VNImageRequestHandler to be used for performing requests against an image
     * contained in an NSData object.
     * 
     * [@note] Request results may not be accurate in simulator due to CI's inability to render certain pixel formats in
     * the simulator
     * 
     * @param imageData   An NSData object containing the content of the image to be used for performing the requests.
     *                    See CIImage imageWithData for supported format. The content of the image cannot be modified.
     * @param orientation The orientation of the image/buffer based on the EXIF specification. For details see
     *                    kCGImagePropertyOrientation. The value has to be an integer from 1 to 8. This supersedes every
     *                    other orientation information.
     * @param options     A dictionary with options specifying auxiliary information for the buffer/image like
     *                    VNImageOptionCameraIntrinsics
     */
    @Generated
    @Selector("initWithData:orientation:options:")
    public native VNImageRequestHandler initWithDataOrientationOptions(@NotNull NSData imageData, int orientation,
            @NotNull NSDictionary<String, ?> options);

    /**
     * initWithURL:options creates a VNImageRequestHandler to be used for performing requests against an image specified
     * by it's URL
     * 
     * [@note] Request results may not be accurate in simulator due to CI's inability to render certain pixel formats in
     * the simulator
     * 
     * @param imageURL A URL pointing at an image to be used for performing the requests. The image has to be in a
     *                 format that is supported by ImageIO. The content of the image cannot be modified.
     * @param options  A dictionary with options specifying auxiliary information for the buffer/image like
     *                 VNImageOptionCameraIntrinsics
     */
    @Generated
    @Selector("initWithURL:options:")
    public native VNImageRequestHandler initWithURLOptions(@NotNull NSURL imageURL,
            @NotNull NSDictionary<String, ?> options);

    /**
     * initWithURL:options creates a VNImageRequestHandler to be used for performing requests against an image specified
     * by it's URL
     * 
     * [@note] Request results may not be accurate in simulator due to CI's inability to render certain pixel formats in
     * the simulator
     * 
     * @param imageURL    A URL pointing at an image to be used for performing the requests. The image has to be in a
     *                    format that is supported by ImageIO. The content of the image cannot be modified.
     * @param orientation The orientation of the image/buffer based on the EXIF specification. For details see
     *                    kCGImagePropertyOrientation. The value has to be an integer from 1 to 8. This supersedes every
     *                    other orientation information.
     * @param options     A dictionary with options specifying auxiliary information for the buffer/image like
     *                    VNImageOptionCameraIntrinsics
     */
    @Generated
    @Selector("initWithURL:orientation:options:")
    public native VNImageRequestHandler initWithURLOrientationOptions(@NotNull NSURL imageURL, int orientation,
            @NotNull NSDictionary<String, ?> options);

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
    public static native VNImageRequestHandler new_objc();

    /**
     * performRequests schedules one or more VNRequests to be performed. The function returns once all requests have
     * been finished.
     * 
     * The results of the VNRequests as well any possible errors of the individual requests are reported in the
     * VNRequests results and error properties.
     * 
     * @param requests An NSArray of VNRequests that are to be performed.
     * @param error    Returns an error that happened during scheduling of the requests. Check individual requests
     *                 results and errors for their respective success and failures. This parameter is optional.
     * @return Returns true if all requests were scheduled and performed. Check individual requests results and errors
     *         for their respective success and failures.
     */
    @Generated
    @Selector("performRequests:error:")
    public native boolean performRequestsError(@NotNull NSArray<? extends VNRequest> requests,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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

    /**
     * Creates a VNImageRequestHandler to be used for performing requests against the image buffer contained in the
     * CMSampleBufferRef
     * 
     * [@note] CMSampleBuffers can contain metadata like camera intrinsics that will be used by algorithms supporting it
     * unless overwritten by the options.
     * 
     * API-Since: 14.0
     * 
     * @param sampleBuffer A CMSampleBuffer containing the imageBuffer that will be used for performing the requests.
     *                     Not all types of sample buffers are supported. They need to contain a CVImageBuffer, be valid
     *                     and ready.
     * @param options      A dictionary with options specifying auxiliary information for the buffer/image like
     *                     VNImageOptionCameraIntrinsics
     */
    @Generated
    @Selector("initWithCMSampleBuffer:options:")
    public native VNImageRequestHandler initWithCMSampleBufferOptions(@NotNull CMSampleBufferRef sampleBuffer,
            @NotNull NSDictionary<String, ?> options);

    /**
     * Creates a VNImageRequestHandler to be used for performing requests against the image buffer contained in the
     * CMSampleBufferRef
     * 
     * [@note] CMSampleBuffers can contain metadata like camera intrinsics that will be used by algorithms supporting it
     * unless overwritten by the options.
     * [@note] Because CoreImage is unable to render certain pixel formats in the iOS simulator, request results may not
     * be accurate in those cases.
     * 
     * API-Since: 14.0
     * 
     * @param sampleBuffer A CMSampleBuffer containing the imageBuffer that will be used for performing the requests.
     *                     Not all types of sample buffers are supported. They need to contain a CVImageBuffer, be valid
     *                     and ready.
     * @param orientation  The orientation of the image/buffer based on the EXIF specification. For details see
     *                     kCGImagePropertyOrientation. The value has to be an integer from 1 to 8. This supersedes
     *                     every other orientation information.
     * @param options      A dictionary with options specifying auxiliary information for the buffer/image like
     *                     VNImageOptionCameraIntrinsics
     */
    @Generated
    @Selector("initWithCMSampleBuffer:orientation:options:")
    public native VNImageRequestHandler initWithCMSampleBufferOrientationOptions(
            @NotNull CMSampleBufferRef sampleBuffer, int orientation, @NotNull NSDictionary<String, ?> options);
}
